package sk.stu.fiit.main;

import java.util.Locale;
import org.slf4j.LoggerFactory;
import sk.stu.fiit.database.Database;
import sk.stu.fiit.utils.DataLoader;
import sk.stu.fiit.view.MainScreen;

/**
 *
 * @author Martin Melisek
 */
public class Main {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Main.class);

    static {
        Database.createDatabase(); // prazdna DB
        DataLoader.loadData(); // Zakaznik a sluzby

    }

    public static void main(String[] args) {
        logger.info("Spustam aplikaciu");
        Locale.setDefault(new Locale("en", "GB")); // globalny oddelovac desatinnych miest
        MainScreen.main();
    }
}
