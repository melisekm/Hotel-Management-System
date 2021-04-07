package sk.stu.fiit.controller;

import java.util.ArrayList;
import java.util.Date;
import sk.stu.fiit.database.Database;
import sk.stu.fiit.model.Izba;
import sk.stu.fiit.model.Rezervacia;
import sk.stu.fiit.model.Sluzba;
import sk.stu.fiit.model.Ubytovanie;
import sk.stu.fiit.model.Zakaznik;

/**
 *
 * @author Martin Melisek
 */
public abstract class Controller {

    public ArrayList<Izba> getDostupneIzby(Date prijazd, Date odjazd) {
        ArrayList<Izba> izby = new ArrayList<>(this.getIzby());
        for (Rezervacia rezervacia : this.getRezervacie()) {
            //TODO skontrolovat inerval
        }
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

}
