package sk.stu.fiit.controller;

import java.util.ArrayList;
import java.util.Date;
import sk.stu.fiit.database.Database;
import sk.stu.fiit.model.Izba;
import sk.stu.fiit.model.Platba;
import sk.stu.fiit.model.Rezervacia;
import sk.stu.fiit.model.Sluzba;
import sk.stu.fiit.model.Ubytovanie;
import sk.stu.fiit.model.Zakaznik;
import sk.stu.fiit.model.Zlava;
import sk.stu.fiit.model.ZlavaFactory;

/**
 *
 * @author Martin Melisek
 */
public abstract class Controller {

    public ArrayList<Izba> getDostupneIzby(Date prijazd, Date odjazd) {
        ArrayList<Izba> izby = new ArrayList<>(this.getIzby());
        for (Rezervacia rezervacia : this.getRezervacie()) {
            boolean datesOverlap = rezervacia.getPrijazd().compareTo(odjazd) <= 0 && rezervacia.getOdjazd().compareTo(prijazd) >= 0;
            if (datesOverlap) {
                for (Izba izba : rezervacia.getIzby()) {
                    izby.remove(izba);
                }
            }
        }
        return izby;
    }

    protected Zlava skontrolujZlavu(int pocetDni, double priebeznaCena, int pocetIzieb) {
        ZlavaFactory zlavaFactory = new ZlavaFactory();
        Zlava zlava;
        if (priebeznaCena > 1000) {
            zlava = zlavaFactory.getZlava("1000_E_GTE");
        } else if (pocetDni > 7) {
            zlava = zlavaFactory.getZlava("7_D_GTE");
        } else if (pocetIzieb > 2) {
            zlava = zlavaFactory.getZlava("2_I_GTE");
        } else {
            zlava = null;
        }
        return zlava;
    }

    public ArrayList<Zakaznik> getZakaznici() {
        return Database.getInstance().getZakaznici();
    }

    public ArrayList<Sluzba> getSluzby() {
        return Database.getInstance().getSluzby();
    }

    public ArrayList<Rezervacia> getRezervacie() {
        return Database.getInstance().getRezervacie();
    }

    public ArrayList<Izba> getIzby() {
        return Database.getInstance().getIzby();
    }

    public ArrayList<Ubytovanie> getUbytovania() {
        return Database.getInstance().getUbytovania();
    }

    public ArrayList<Platba> getPlatby() {
        return Database.getInstance().getPlatby();
    }

}
