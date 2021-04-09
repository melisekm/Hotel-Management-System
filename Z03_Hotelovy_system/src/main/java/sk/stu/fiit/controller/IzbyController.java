package sk.stu.fiit.controller;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import sk.stu.fiit.model.Izba;
import sk.stu.fiit.model.Rezervacia;
import sk.stu.fiit.model.Sluzba;
import sk.stu.fiit.model.Ubytovanie;
import sk.stu.fiit.model.Zlava;

/**
 *
 * @author Martin Melisek
 */
public class IzbyController extends Controller {

    public void saveIzba(String oznacenie, String kategoria, String popis, int pocetLozok, double cena, ArrayList<File> galeria) {
        this.getIzby().add(this.createIzba(oznacenie, kategoria, popis, pocetLozok, cena, galeria));
    }

    public void saveIzba(Izba povodnaIzba, String oznacenie, String kategoria, String popis, int pocetLozok, double cena, ArrayList<File> galeria) {
        Izba nova = this.createIzba(oznacenie, kategoria, popis, pocetLozok, cena, galeria);
        povodnaIzba.updateDetails(nova);
        this.skontrolujRezervacie(povodnaIzba);
        this.skontrolujUbytovania(povodnaIzba);

    }

    private Izba createIzba(String oznacenie, String kategoria, String popis, int pocetLozok, double cena, ArrayList<File> galeria) {
        ArrayList<Icon> obrazky = new ArrayList<>();
        for (File obrazok : galeria) {
            ImageIcon icon = transformImageIcon(obrazok);
            if (icon != null) {
                obrazky.add(icon);
            }
        }
        return new Izba(oznacenie, kategoria, popis, cena, obrazky, pocetLozok);
    }

    public ImageIcon transformImageIcon(File obrazok) {
        if (!obrazok.exists()) {
            return null;
        }
        ImageIcon imageIcon = null;
        imageIcon = new ImageIcon(obrazok.getPath());
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(920, 450, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        return imageIcon;
    }

    private void skontrolujRezervacie(Izba povodnaIzba) {
        for (Rezervacia rezervacia : this.getRezervacie()) {
            if (rezervacia.getIzby().indexOf(povodnaIzba) != -1) {
                double cenaRezervacie = 0;
                for (Izba izba : rezervacia.getIzby()) {
                    cenaRezervacie += izba.getCena();
                }
                cenaRezervacie *= rezervacia.getPocetDni();
                Zlava zlava = this.skontrolujZlavu(rezervacia.getPocetDni(), cenaRezervacie, rezervacia.getIzby().size());
                if (zlava != null) {
                    cenaRezervacie *= (1 - zlava.getPercento());
                }
                rezervacia.setZlava(zlava);
                rezervacia.setCena(cenaRezervacie);
            }
        }
    }

    private void skontrolujUbytovania(Izba povodnaIzba) {
        for (Ubytovanie ubytovanie : this.getUbytovania()) {
            if (ubytovanie.getIzby().indexOf(povodnaIzba) != -1) {
                double cenaUbytovania = 0;
                for (Izba izba : ubytovanie.getIzby()) {
                    cenaUbytovania += izba.getCena();
                }
                cenaUbytovania *= ubytovanie.getPocetDni();
                for (Sluzba sluzba : ubytovanie.getSluzby()) {
                    cenaUbytovania += sluzba.getCena();
                }
                Zlava zlava = this.skontrolujZlavu(ubytovanie.getPocetDni(), cenaUbytovania, ubytovanie.getIzby().size());
                if (zlava != null) {
                    cenaUbytovania *= (1 - zlava.getPercento());
                }
                ubytovanie.setCena(cenaUbytovania);
            }
        }
    }

}
