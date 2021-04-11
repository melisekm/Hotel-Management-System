package sk.stu.fiit.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Martin Melisek
 */
public class Ubytovanie extends Booking implements Serializable {

    private Rezervacia rezervacia;
    private ArrayList<Sluzba> sluzby;
    private StatusUbytovanie status;

    public Ubytovanie(ArrayList<Sluzba> sluzby, String id, ArrayList<Izba> izby, Zakaznik zakaznik, Date prijazd, Date odjazd, int pocetDni, double cena, Zlava zlava) {
        super(id, izby, zakaznik, prijazd, odjazd, pocetDni, cena, zlava);
        this.sluzby = sluzby;
        this.status = StatusUbytovanie.ZACATE;
    }

    public Ubytovanie(Rezervacia rezervacia, String id) {
        super(id, rezervacia.getIzby(), rezervacia.getZakaznik(), rezervacia.getPrijazd(), rezervacia.getOdjazd(), rezervacia.getPocetDni(), rezervacia.getCena(), rezervacia.getZlava());
        this.rezervacia = rezervacia;
        this.sluzby = sluzby;
        this.status = StatusUbytovanie.ZACATE;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return this.getId() + " - " + sdf.format(this.getPrijazd()) + " - " + sdf.format(this.getOdjazd()) + " - " + this.status.toString();
    }

    public Rezervacia getRezervacia() {
        return rezervacia;
    }

    public void setRezervacia(Rezervacia rezervacia) {
        this.rezervacia = rezervacia;
    }

    public ArrayList<Sluzba> getSluzby() {
        return sluzby;
    }

    public void setSluzby(ArrayList<Sluzba> sluzby) {
        this.sluzby = sluzby;
    }

    public StatusUbytovanie getStatus() {
        return status;
    }

    public void setStatus(StatusUbytovanie status) {
        this.status = status;
    }

}
