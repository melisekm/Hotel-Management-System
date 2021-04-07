package sk.stu.fiit.controller;

import java.util.ArrayList;
import sk.stu.fiit.database.Database;
import sk.stu.fiit.model.Rezervacia;
import sk.stu.fiit.model.Sluzba;
import sk.stu.fiit.model.Zakaznik;

/**
 *
 * @author Martin Melisek
 */
public abstract class Controller {

    public ArrayList<Zakaznik> getZakaznici() {
        return Database.getInstance().getZakaznici();
    }

    public ArrayList<Sluzba> getSluzby() {
        return Database.getInstance().getSluzby();
    }

    public ArrayList<Rezervacia> getRezervacie() {
        return Database.getInstance().getRezervacie();
    }

}
