package sk.stu.fiit.database;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
        if(INSTANCE == null){
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

}
