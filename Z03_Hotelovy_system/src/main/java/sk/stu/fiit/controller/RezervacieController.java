package sk.stu.fiit.controller;

import java.util.ArrayList;
import java.util.Date;
import sk.stu.fiit.database.Database;
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
    private double priebeznaCena;
    private Zlava zlava;

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
        if(this.zlava != null){
            zlava = this.zlava;
        }
        return new Rezervacia(id, zakaznik, izby, datumPrijazdu, datumOdjazdu, pocetDni, this.priebeznaCena, StatusRezervacie.VYTVORENA, zlava);
    }

    public void pridajIzbu(int pocetDni, Izba pridavanaIzba) {
        this.getPridavaneIzby().add(pridavanaIzba);
        this.prepocitajCenu(pocetDni);
    }

    public boolean prepocitajCenu(int pocetDni) {
        this.priebeznaCena = 0;
        for (Izba izba : pridavaneIzby) {
            this.priebeznaCena += izba.getCena();
        }
        this.priebeznaCena *= pocetDni;
        this.skontrolujZlavu(pocetDni);
        if (this.zlava != null) {
            this.priebeznaCena *= (1 - this.zlava.getPercento());
            return true;
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

    public boolean aplikujZlavu(Rezervacia rezervacia, String kod) {
        ZlavaFactory zlavaFactory = new ZlavaFactory();
        Zlava zlava = zlavaFactory.getZlava(kod);
        if(zlava == null){
            return false;
        }
        rezervacia.setZlava(zlava);
        rezervacia.setCena(rezervacia.getCena() * (1 - zlava.getPercento()));
        return true;
    }

    public void zrusitRezervaciu(Rezervacia zvolenaRezervacia) {
        this.getRezervacie().remove(zvolenaRezervacia);
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
