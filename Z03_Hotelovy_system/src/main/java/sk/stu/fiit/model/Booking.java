package sk.stu.fiit.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Martin Melisek
 */
public abstract class Booking implements Serializable {

    private String id;
    private ArrayList<Izba> izby;
    private Zakaznik zakaznik;
    private Date prijazd;
    private Date odjazd;
    private int pocetDni;
    private double cena;
    private Platba platba;
    private Zlava zlava;

    public Booking(String id, ArrayList<Izba> izby, Zakaznik zakaznik, Date prijazd, Date odjazd, int pocetDni, double cena, Zlava zlava) {
        this.id = id;
        this.izby = izby;
        this.zakaznik = zakaznik;
        this.prijazd = prijazd;
        this.odjazd = odjazd;
        this.pocetDni = pocetDni;
        this.cena = cena;
        this.zlava = zlava;
    }

    public void updateDetails(Booking other) {
        this.id = other.id;
        this.zakaznik = other.zakaznik;
        this.izby = other.izby;
        this.prijazd = other.prijazd;
        this.odjazd = other.odjazd;
        this.pocetDni = other.pocetDni;
        this.cena = other.cena;
        this.zlava = other.zlava;
        this.platba = other.platba;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return id + " - " + sdf.format(this.prijazd) + " - " + sdf.format(this.odjazd);
    }

    public void zaplat(Platba platba) {
        this.platba = platba;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Izba> getIzby() {
        return izby;
    }

    public void setIzby(ArrayList<Izba> izby) {
        this.izby = izby;
    }

    public Zakaznik getZakaznik() {
        return zakaznik;
    }

    public void setZakaznik(Zakaznik zakaznik) {
        this.zakaznik = zakaznik;
    }

    public Date getPrijazd() {
        return prijazd;
    }

    public void setPrijazd(Date prijazd) {
        this.prijazd = prijazd;
    }

    public Date getOdjazd() {
        return odjazd;
    }

    public void setOdjazd(Date odjazd) {
        this.odjazd = odjazd;
    }

    public int getPocetDni() {
        return pocetDni;
    }

    public void setPocetDni(int pocetDni) {
        this.pocetDni = pocetDni;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Platba getPlatba() {
        return platba;
    }

    public void setPlatba(Platba platba) {
        this.platba = platba;
    }

    public Zlava getZlava() {
        return zlava;
    }

    public void setZlava(Zlava zlava) {
        this.zlava = zlava;
    }

}
