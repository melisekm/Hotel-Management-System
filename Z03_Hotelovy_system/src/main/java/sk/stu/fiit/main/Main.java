package sk.stu.fiit.main;

import java.util.Locale;
import sk.stu.fiit.database.Database;
import sk.stu.fiit.utils.DataLoader;
import sk.stu.fiit.view.MainScreen;

/**
 *
 * @author Martin Melisek
 */
public class Main {

    static {
        Database.createDatabase();
        DataLoader.loadData();
    }

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "GB")); // globalny oddelovac desatinnych miest
        MainScreen.main();
    }
}
