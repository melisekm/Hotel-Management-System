package sk.stu.fiit.controller;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import sk.stu.fiit.model.Izba;
import sk.stu.fiit.model.Rezervacia;
import sk.stu.fiit.model.StatusRezervacie;
import sk.stu.fiit.model.Zakaznik;
import sk.stu.fiit.model.Zlava;
import sk.stu.fiit.model.ZlavaFactory;

/**
 *
 * @author Martin Melisek
 */
public class RezervacieController extends Controller {

    public void saveRezervacia(Zakaznik zakaznik, Date datumPrijazdu, Date datumOdjazdu, ArrayList<Izba> izby) {
        this.getRezervacie().add(this.createRezervacia(zakaznik, datumPrijazdu, datumOdjazdu, izby));
    }

    public void saveRezervacia(Rezervacia povodnaRezervacia, Zakaznik zakaznik, Date datumPrijazdu, Date datumOdjazdu, ArrayList<Izba> izby) {
        Rezervacia nova = this.createRezervacia(zakaznik, datumPrijazdu, datumOdjazdu, izby);
        povodnaRezervacia.updateDetails(nova);
    }

    private Rezervacia createRezervacia(Zakaznik zakaznik, Date datumPrijazdu, Date datumOdjazdu, ArrayList<Izba> izby) {
        String id = "R" + this.getRezervacie().size();
        int pocetDni = (int) ChronoUnit.DAYS.between(datumPrijazdu.toInstant(), datumPrijazdu.toInstant());
        double cena = 0;
        for (Izba izba : izby) {
            cena += izba.getCena();
        }
        cena *= pocetDni;
        Zlava zlava = skontrolujZlavu(pocetDni, cena, izby.size());
        if (zlava != null) {
            cena *= (1 - zlava.getPercento());
        }
        return new Rezervacia(id, zakaznik, izby, datumPrijazdu, datumOdjazdu, pocetDni, cena, StatusRezervacie.VYTVORENA, zlava);
    }

    public void aplikujZlavu(Rezervacia rezervacia, Zlava zlava) {
        // TODO
    }

    private Zlava skontrolujZlavu(int pocetDni, double cena, int pocetIzieb) {
        ZlavaFactory zlavaFactory = new ZlavaFactory();
        if (pocetDni > 7) {
            return zlavaFactory.getZlava("7_D_GTE");
        }
        if (cena > 1000) {
            return zlavaFactory.getZlava("1000_E_GTE");
        }
        if (pocetIzieb > 2) {
            return zlavaFactory.getZlava("2_I_GTE");
        }
        return null;
    }
}
