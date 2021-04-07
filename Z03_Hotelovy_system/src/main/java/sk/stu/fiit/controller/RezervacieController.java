package sk.stu.fiit.controller;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import sk.stu.fiit.exceptions.InvalidReservationDateException;
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

    private ArrayList<Izba> pridavaneIzby = new ArrayList<>();
    private double priebeznaCena = 0;
    private Zlava zlava;

    public void saveRezervacia(Zakaznik zakaznik, Date datumPrijazdu, Date datumOdjazdu, int pocetDni, ArrayList<Izba> izby) {
        this.getRezervacie().add(this.createRezervacia(zakaznik, datumPrijazdu, datumOdjazdu, pocetDni));
    }

    public void saveRezervacia(Rezervacia povodnaRezervacia, Zakaznik zakaznik, Date datumPrijazdu, Date datumOdjazdu, int pocetDni, ArrayList<Izba> izby) {
        Rezervacia nova = this.createRezervacia(zakaznik, datumPrijazdu, datumOdjazdu, pocetDni);
        povodnaRezervacia.updateDetails(nova);
    }

    private Rezervacia createRezervacia(Zakaznik zakaznik, Date datumPrijazdu, Date datumOdjazdu, int pocetDni) {
        String id = "R" + this.getRezervacie().size();
        for (Izba izba : this.pridavaneIzby) {
            izba.setObsadena(true);
        }
        return new Rezervacia(id, zakaznik, this.pridavaneIzby, datumPrijazdu, datumOdjazdu, pocetDni, this.priebeznaCena, StatusRezervacie.VYTVORENA, this.zlava);
    }

    public void pridajIzbu(int pocetDni, Izba pridavanaIzba) {
        this.getPridavaneIzby().add(pridavanaIzba);
        this.prepocitajCenu(pridavanaIzba, pocetDni);
    }

    private void prepocitajCenu(Izba pridavanaIzba, int pocetDni) {
        this.skontrolujZlavu(pocetDni);
        this.priebeznaCena += pridavanaIzba.getCena();
        this.priebeznaCena *= pocetDni;
        skontrolujZlavu(pocetDni);
        if (this.zlava != null) {
            this.priebeznaCena *= (1 - this.zlava.getPercento());
        }
    }

    public boolean prepocitajCenu(int pocetDni) {
        if (skontrolujZlavu(pocetDni)) {
            if (this.zlava != null) {
                this.priebeznaCena *= (1 - this.zlava.getPercento());
                return true;
            }
        }
        return false;
    }

    private boolean skontrolujZlavu(int pocetDni) {
        ZlavaFactory zlavaFactory = new ZlavaFactory();
        if (this.priebeznaCena > 1000) {
            this.zlava = zlavaFactory.getZlava("1000_E_GTE");
        } else if (pocetDni > 7) {
            this.zlava = zlavaFactory.getZlava("7_D_GTE");
        } else if (this.pridavaneIzby.size() > 2) {
            this.zlava = zlavaFactory.getZlava("2_I_GTE");
        } else {
            this.zlava = null;
            return false;
        }
        return true;
    }

    public void aplikujZlavu(Rezervacia rezervacia, Zlava zlava) {
        // TODO
    }

    public void clearTempRezervacia() {
        this.pridavaneIzby.clear();
        this.priebeznaCena = 0;
        this.zlava = null;
    }

    public ArrayList<Izba> getPridavaneIzby() {
        return pridavaneIzby;
    }

    public void setPridavaneIzby(ArrayList<Izba> pridavaneIzby) {
        this.pridavaneIzby = pridavaneIzby;
    }

    public double getPriebeznaCena() {
        return priebeznaCena;
    }

    public void setPriebeznaCena(double priebeznaCena) {
        this.priebeznaCena = priebeznaCena;
    }

    public Zlava getZlava() {
        return zlava;
    }

    public void setZlava(Zlava zlava) {
        this.zlava = zlava;
    }

}
