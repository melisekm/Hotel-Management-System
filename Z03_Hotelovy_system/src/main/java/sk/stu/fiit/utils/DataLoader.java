package sk.stu.fiit.utils;

import sk.stu.fiit.database.Database;
import sk.stu.fiit.model.Pohlavie;
import sk.stu.fiit.model.Zakaznik;

/**
 *
 * @author Martin Melisek
 */
public class DataLoader {

    public static void loadData() {
        Database db = Database.getInstance();
        db.getZakaznici().add(new Zakaznik(Pohlavie.ZENA, "Mária Ľahká", "Slovenská", "0914413370", "XY325455", "Testovacia 14, 940 01, Slovensko"));
        db.getZakaznici().add(new Zakaznik(Pohlavie.MUZ, "Ivan Krátky", "Česká", "0901555333", "ZW120125", "Česká ulica 8, 170 01, Česká republika"));
        
    }

    private DataLoader() {
    }

}
