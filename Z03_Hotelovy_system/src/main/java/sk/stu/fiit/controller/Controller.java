package sk.stu.fiit.controller;

import java.util.ArrayList;
import sk.stu.fiit.database.Database;
import sk.stu.fiit.model.Zakaznik;

/**
 *
 * @author Martin Melisek
 */
public abstract class Controller {

    protected Database db;

    public Controller() {
        this.db = Database.getInstance();
    }

    public ArrayList<Zakaznik> getZakaznici() {
        return db.getZakaznici();
    }

    public void setZakaznici(ArrayList<Zakaznik> zakaznici) {
        db.setZakaznici(zakaznici);
    }

    protected void setDb(Database db) {
        this.db = db;
    }
    
    

}
