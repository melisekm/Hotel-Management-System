package sk.stu.fiit.controller;

import java.util.ArrayList;
import java.util.Date;
import sk.stu.fiit.database.Database;
import sk.stu.fiit.model.Rezervacia;
import sk.stu.fiit.model.StatusRezervacie;
import sk.stu.fiit.model.Zakaznik;
import sk.stu.fiit.model.Zlava;

/**
 *
 * @author Martin Melisek
 */
public class RezervacieController extends BookingController {

    public void saveRezervacia(Zakaznik zakaznik, Date datumPrijazdu, Date datumOdjazdu, int pocetDni) {
        this.getRezervacie().add(this.createRezervacia(zakaznik, datumPrijazdu, datumOdjazdu, pocetDni));
    }

    public void saveRezervacia(Rezervacia povodnaRezervacia, Zakaznik zakaznik, Date datumPrijazdu, Date datumOdjazdu, int pocetDni) {
        Rezervacia nova = this.createRezervacia(zakaznik, datumPrijazdu, datumOdjazdu, pocetDni);
        povodnaRezervacia.updateDetails(nova);
    }

    private Rezervacia createRezervacia(Zakaznik zakaznik, Date datumPrijazdu, Date datumOdjazdu, int pocetDni) {
        String id = "R" + Database.getInstance().getAndSetRezervacieUUID();
        ArrayList izby = new ArrayList<>(this.pridavaneIzby);
        Zlava zlava = null;
        if (this.zlava != null) {
            zlava = new Zlava(this.zlava);
        }
        return new Rezervacia(id, zakaznik, izby, datumPrijazdu, datumOdjazdu, pocetDni, this.priebeznaCena, StatusRezervacie.VYTVORENA, zlava);
    }

    public void zrusitRezervaciu(Rezervacia zvolenaRezervacia) {
        this.getRezervacie().remove(zvolenaRezervacia);
    }
}
