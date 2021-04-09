package sk.stu.fiit.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(IzbyController.class);

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
            BufferedImage bi;
            try {
                bi = ImageIO.read(obrazok); // path is your file or image path
                obrazky.add(new ImageIcon(bi));
            } catch (Exception ex) {
                logger.warn("Obrazok nie je mozne nacitat" + obrazok.getPath());
            }
        }
        return new Izba(oznacenie, kategoria, popis, cena, obrazky, pocetLozok);
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
                for (Sluzba sluzba : ubytovanie.getSluzby()) {
                    cenaUbytovania += sluzba.getCena();
                }
                cenaUbytovania *= ubytovanie.getPocetDni();
                Zlava zlava = this.skontrolujZlavu(ubytovanie.getPocetDni(), cenaUbytovania, ubytovanie.getIzby().size());
                if (zlava != null) {
                    cenaUbytovania *= (1 - zlava.getPercento());
                }
                ubytovanie.setCena(cenaUbytovania);
            }
        }
    }

}
