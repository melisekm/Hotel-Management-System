package sk.stu.fiit.database;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import sk.stu.fiit.model.Zakaznik;

/**
 *
 * @author Martin Melisek
 */
public class Database implements Serializable {

    private Date appTime;
    private static Database INSTANCE;
    private ArrayList<Zakaznik> zakaznici = new ArrayList<>();

    private Database() {
    }

    public static void createDatabase(Database db) {
        INSTANCE = db;
    }

    public static void createDatabase() {
        INSTANCE = new Database();
    }

    public static Database getInstance() {
        return INSTANCE;
    }

    public Date getAppTime() {
        return appTime;
    }

    public void setAppTime(Date appTime) {
        this.appTime = appTime;
    }

    public ArrayList<Zakaznik> getZakaznici() {
        return zakaznici;
    }

    public void setZakaznici(ArrayList<Zakaznik> zakaznici) {
        this.zakaznici = zakaznici;
    }

}
