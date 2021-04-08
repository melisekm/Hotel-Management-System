package sk.stu.fiit.model;

import java.io.Serializable;
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

    public Ubytovanie(String Id, ArrayList<Izba> izby, Zakaznik zakaznik, Date datumOd, Date datumDo, int pocetDni, double cena, ArrayList<Sluzba> sluzby, Platba platba) {
        this.id = Id;
        this.izby = izby;
        this.zakaznik = zakaznik;
        this.prijazd = datumOd;
        this.odjazd = datumDo;
        this.pocetDni = pocetDni;
        this.cena = cena;
        this.sluzby = sluzby;
        this.platba = platba;
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
