package sk.stu.fiit.main;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import org.slf4j.LoggerFactory;
import sk.stu.fiit.controller.IOController;
import sk.stu.fiit.database.Database;
import sk.stu.fiit.utils.DataLoader;
import sk.stu.fiit.view.MainScreen;

/**
 *
 * @author Martin Melisek
 */
public class Main {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Main.class);

    private final static String testovaciaDB = "C:\\Users\\melis\\Documents\\!VAVA\\demo1.dbZ03";

    private static boolean loadDemoDB = false;

    static {

        if (loadDemoDB) {
            try {
                new IOController().loadDatabase(new File(testovaciaDB));
            } catch (IOException ex) {
                logger.error("Chyba pri nacitavani DB");
                logger.error(ex.getClass().toString());
            } catch (ClassNotFoundException ex) {
                logger.error("Nacitala sa nekompatibilna trieda");
                logger.error(ex.getClass().toString());
                Database.createDatabase(); // prazdna DB
                DataLoader.loadData(); // Zakaznik a sluzby
            }
        } else {
            Database.createDatabase(); // prazdna DB
            DataLoader.loadData(); // Zakaznik a sluzby
        }

    }

    public static void main(String[] args) {
        Locale.setDefault(new Locale("sk", "SK")); // globalny oddelovac desatinnych miest
        MainScreen.main();
    }
}
