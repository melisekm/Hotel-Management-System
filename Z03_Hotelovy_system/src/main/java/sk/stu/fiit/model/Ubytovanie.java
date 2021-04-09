package sk.stu.fiit.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Martin Melisek
 */
public class Ubytovanie implements IZaplatitelne, Serializable {

    private String id;
    private ArrayList<Izba> izby;
    private Zakaznik zakaznik;
    private Date prijazd;
    private Date odjazd;
    private int pocetDni;
    private double cena;
    private ArrayList<Sluzba> sluzby;
    private Platba platba;
    private Rezervacia rezervacia;

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return id + " - " + sdf.format(this.prijazd) + " - " + sdf.format(this.odjazd);
    }

    public Rezervacia getRezervacia() {
        return rezervacia;
    }

    public void setRezervacia(Rezervacia rezervacia) {
        this.rezervacia = rezervacia;
    }

    @Override
    public void zaplat(Platba platba) {
        this.platba = platba;
    }

    @Override
    public Zakaznik getZakaznik() {
        return zakaznik;
    }

    public void setZakaznik(Zakaznik zakaznik) {
        this.zakaznik = zakaznik;
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

    public ArrayList<Sluzba> getSluzby() {
        return sluzby;
    }

    public void setSluzby(ArrayList<Sluzba> sluzby) {
        this.sluzby = sluzby;
    }

    public Platba getPlatba() {
        return platba;
    }

    public void setPlatba(Platba platba) {
        this.platba = platba;
    }

}
