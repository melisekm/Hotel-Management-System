package sk.stu.fiit.utils;

import java.util.ArrayList;
import javax.swing.Icon;
import sk.stu.fiit.database.Database;
import sk.stu.fiit.model.Izba;
import sk.stu.fiit.model.Pohlavie;
import sk.stu.fiit.model.Sluzba;
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
        db.getSluzby().add(new Sluzba("Raňajky", "Čas: 8:00\nširoký výber\nmožnosť objednávky na izbu", 10));
        db.getSluzby().add(new Sluzba("Wi-Fi", "Vysoká rýchlosť\nneobmedzené pripojenie\nheslo na recepcii", 5));
        db.getSluzby().add(new Sluzba("Masáž", "Čas: 10:00/16:00\nmožnosť výberu maséra\nkaždý deň", 25));

        db.getIzby().add(new Izba("150", "TwinBed", "Dvojpostelova", 70, new ArrayList<Icon>(), 2));
        db.getIzby().add(new Izba("151", "SingleBed", "jednopostelova", 60, new ArrayList<Icon>(), 1));
        db.getIzby().add(new Izba("152", "Prezidentska", "apartman", 140, new ArrayList<Icon>(), 2));

    }

    private DataLoader() {
    }

}
