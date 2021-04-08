package sk.stu.fiit.controller;

import sk.stu.fiit.database.Database;
import sk.stu.fiit.model.IZaplatitelne;
import sk.stu.fiit.model.Platba;

/**
 *
 * @author Martin Melisek
 */
public class PlatbaController extends Controller {

    private IZaplatitelne polozka;

    public PlatbaController(IZaplatitelne polozka) {
        this.polozka = polozka;
    }

    public void zaplatPolozku(boolean vHotovosti) {
        Platba platba = new Platba(Database.getInstance().getAppTime(), this.polozka, vHotovosti);
        platba.setPolozka(polozka);
        this.polozka.zaplat(platba);
        this.getPlatby().add(platba);
    }

    public IZaplatitelne getPolozka() {
        return polozka;
    }

    public void setPolozka(IZaplatitelne polozka) {
        this.polozka = polozka;
    }

}
