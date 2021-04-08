package sk.stu.fiit.main;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.slf4j.LoggerFactory;
import sk.stu.fiit.controller.IOController;
import sk.stu.fiit.view.MainScreen;

/**
 *
 * @author Martin Melisek
 */
public class Main {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(IOController.class);
    
    private final static String testovaciaDB = "C:\\Users\\melis\\Documents\\!VAVA\\841600.dbZ03";
    
    static {
        try {
            //Database.createDatabase(); // prazdna DB
            //DataLoader.loadData(); // Zakaznik a sluzby
            new IOController().loadDatabase(new File(testovaciaDB));
        } catch (IOException ex) {
            logger.error("Chyba pri nacitavani DB");
        } catch (ClassNotFoundException ex) {
            logger.error("Nacitala sa nekompatibilna trieda");
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "GB")); // globalny oddelovac desatinnych miest
        MainScreen.main();
    }
}
