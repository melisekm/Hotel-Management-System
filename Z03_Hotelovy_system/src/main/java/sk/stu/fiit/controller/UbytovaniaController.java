package sk.stu.fiit.controller;

import java.util.ArrayList;
import java.util.Date;
import sk.stu.fiit.database.Database;
import sk.stu.fiit.model.Izba;
import sk.stu.fiit.model.Rezervacia;
import sk.stu.fiit.model.Sluzba;
import sk.stu.fiit.model.StatusRezervacie;
import sk.stu.fiit.model.Ubytovanie;
import sk.stu.fiit.model.Zakaznik;
import sk.stu.fiit.model.Zlava;

/**
 *
 * @author Martin Melisek
 */
public class UbytovaniaController extends BookingController {

    public Rezervacia rezervacia;
    public ArrayList<Sluzba> sluzby = new ArrayList<>();

    public void saveUbytovanie(Zakaznik zakaznik, Date datumPrijazdu, Date datumOdjazdu, int pocetDni) {
        Ubytovanie noveUbytovanie;
        if (this.rezervacia == null) {
            noveUbytovanie = this.createUbytovanie(zakaznik, datumPrijazdu, datumOdjazdu, pocetDni);
            this.getUbytovania().add(noveUbytovanie);
        } else {
            noveUbytovanie = this.createUbytovanieOnReservation();
            this.getUbytovania().add(noveUbytovanie);
        }
    }

    private Ubytovanie createUbytovanie(Zakaznik zakaznik, Date datumPrijazdu, Date datumOdjazdu, int pocetDni) {
        String id = "U" + Database.getInstance().getAndSetUbytovaniaUUID();
        Zlava zlava = null;
        if (this.zlava != null) {
            zlava = new Zlava(this.zlava);
        }
        return new Ubytovanie(new ArrayList<>(this.sluzby), id, new ArrayList<>(this.pridavaneIzby), zakaznik, datumPrijazdu, datumOdjazdu, pocetDni, this.priebeznaCena, zlava);
    }

    private Ubytovanie createUbytovanieOnReservation() {
        String id = "U" + Database.getInstance().getAndSetUbytovaniaUUID();
        this.rezervacia.setStatus(StatusRezervacie.VYKONANA);
        return new Ubytovanie(this.rezervacia, id);
    }

    public void pridajSluzbu(Ubytovanie zvoleneUbytovanie, Sluzba sluzba) {
        if (zvoleneUbytovanie.getSluzby() == null) {
            zvoleneUbytovanie.setSluzby(new ArrayList<>());
        }
        sluzba.getVyuzitie().put(zvoleneUbytovanie, Database.getInstance().getAppTime());
        zvoleneUbytovanie.getSluzby().add(sluzba);
        zvoleneUbytovanie.setCena(zvoleneUbytovanie.getCena() + sluzba.getCena());
    }

    @Override
    public void clearTempBooking() {
        super.clearTempBooking();
        this.rezervacia = null;
        this.sluzby.clear();
    }

    public Rezervacia getRezervacia() {
        return rezervacia;
    }

    public void setRezervacia(Rezervacia rezervacia) {
        this.rezervacia = rezervacia;
    }

}
