package sk.stu.fiit.controller;

import java.util.ArrayList;
import sk.stu.fiit.database.Database;
import sk.stu.fiit.model.Booking;
import sk.stu.fiit.model.Platba;
import sk.stu.fiit.model.Sluzba;
import sk.stu.fiit.model.Ubytovanie;

/**
 *
 * @author Martin Melisek
 */
public class PlatbaController extends Controller {

    private Booking polozka;

    public PlatbaController(Booking polozka) {
        this.polozka = polozka;
    }

    public void zaplatPolozku(boolean vHotovosti) {
        Platba platba = new Platba(Database.getInstance().getAppTime(), this.polozka, vHotovosti);
        platba.setPolozka(polozka);
        this.polozka.zaplat(platba);
        this.getPlatby().add(platba);
        if (this.polozka instanceof Ubytovanie) {
            ArrayList<Sluzba> sluzby = ((Ubytovanie) this.polozka).getSluzby();
            for (Sluzba sluzba : sluzby) {
                sluzba.setDatumVyuzitia(Database.getInstance().getAppTime());
                sluzba.getVyuzitie().add((Ubytovanie) this.polozka);
            }
        }
    }

    public Booking getPolozka() {
        return polozka;
    }

    public void setPolozka(Booking polozka) {
        this.polozka = polozka;
    }

}
