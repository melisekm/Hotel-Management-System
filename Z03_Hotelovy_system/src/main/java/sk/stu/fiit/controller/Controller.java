package sk.stu.fiit.controller;

import java.util.ArrayList;
import sk.stu.fiit.database.Database;
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

    public void setZakaznici(ArrayList<Zakaznik> zakaznici) {
        Database.getInstance().setZakaznici(zakaznici);
    }

    public ArrayList<Sluzba> getSluzby() {
        return Database.getInstance().getSluzby();
    }

    public void setSluzby(ArrayList<Sluzba> sluzby) {
        Database.getInstance().setSluzby(sluzby);
    }

}
