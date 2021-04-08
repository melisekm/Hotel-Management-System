package sk.stu.fiit.database;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.stu.fiit.model.Izba;
import sk.stu.fiit.model.Platba;
import sk.stu.fiit.model.Rezervacia;
import sk.stu.fiit.model.Sluzba;
import sk.stu.fiit.model.Ubytovanie;
import sk.stu.fiit.model.Zakaznik;

/**
 *
 * @author Martin Melisek
 */
public class Database implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(Database.class);

    private Date appTime;
    private static Database INSTANCE;
    private ArrayList<Zakaznik> zakaznici = new ArrayList<>();
    private ArrayList<Sluzba> sluzby = new ArrayList<>();
    private ArrayList<Rezervacia> rezervacie = new ArrayList<>();
    private ArrayList<Izba> izby = new ArrayList<>();
    private ArrayList<Ubytovanie> ubytovania = new ArrayList<>();
    private ArrayList<Platba> platby = new ArrayList<>();
    private int rezervacieUUID = 1;
    private int ubytovaniaUUID = 1;

    private Database() {
    }

    public static void createDatabase(Database db) {
        logger.info("Inicializujem existujucu databazu");
        INSTANCE = db;
    }

    public static void createDatabase() {
        logger.info("Inicializujem novu databazu");
        INSTANCE = new Database();
    }

    public static Database getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Database();
        }
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

    public ArrayList<Sluzba> getSluzby() {
        return sluzby;
    }

    public void setSluzby(ArrayList<Sluzba> sluzby) {
        this.sluzby = sluzby;
    }

    public ArrayList<Rezervacia> getRezervacie() {
        return rezervacie;
    }

    public void setRezervacie(ArrayList<Rezervacia> rezervacie) {
        this.rezervacie = rezervacie;
    }

    public ArrayList<Izba> getIzby() {
        return izby;
    }

    public void setIzby(ArrayList<Izba> izby) {
        this.izby = izby;
    }

    public ArrayList<Ubytovanie> getUbytovania() {
        return ubytovania;
    }

    public void setUbytovania(ArrayList<Ubytovanie> ubytovania) {
        this.ubytovania = ubytovania;
    }

    public ArrayList<Platba> getPlatby() {
        return platby;
    }

    public void setPlatby(ArrayList<Platba> platby) {
        this.platby = platby;
    }

    public int getAndSetRezervacieUUID() {
        return rezervacieUUID++;
    }

    public int getAndSetUbytovaniaUUID() {
        return ubytovaniaUUID++;
    }

}
