package sk.stu.fiit.controller;

import sk.stu.fiit.database.Database;
import sk.stu.fiit.model.Booking;
import sk.stu.fiit.model.Platba;

/**
 *
 * @author Martin Melisek
 */
public class PlatbaController extends Controller {

    private Booking polozka;
    private double cena;

    public PlatbaController(Booking polozka, double cena) {
        this.polozka = polozka;
        this.cena = cena;
    }

    public void zaplatPolozku(boolean vHotovosti) {
        Platba platba = new Platba(Database.getInstance().getAppTime(), this.polozka, vHotovosti, this.cena);
        platba.setPolozka(polozka);
        this.polozka.zaplat(platba);
        this.getPlatby().add(platba);
    }

    public Booking getPolozka() {
        return polozka;
    }

    public void setPolozka(Booking polozka) {
        this.polozka = polozka;
    }

}
