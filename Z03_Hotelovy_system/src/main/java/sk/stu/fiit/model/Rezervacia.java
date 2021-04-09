package sk.stu.fiit.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Martin Melisek
 */
public class Rezervacia implements IZaplatitelne, Serializable {

    private String id;
    private Zakaznik zakaznik;
    private ArrayList<Izba> izby;
    private Date prijazd;
    private Date odjazd;
    private int pocetDni;
    private double cena;
    private StatusRezervacie status;
    private Platba zaloha;
    private Zlava zlava;

    public Rezervacia(String id, Zakaznik zakaznik, ArrayList<Izba> izby, Date prijazd, Date odjazd, int pocetDni, double cena, StatusRezervacie status, Zlava zlava) {
        this.id = id;
        this.zakaznik = zakaznik;
        this.izby = izby;
        this.prijazd = prijazd;
        this.odjazd = odjazd;
        this.pocetDni = pocetDni;
        this.cena = cena;
        this.status = status;
        this.zlava = zlava;
    }

    public void updateDetails(Rezervacia other) {
        this.id = other.id;
        this.zakaznik = other.zakaznik;
        this.izby = other.izby;
        this.prijazd = other.prijazd;
        this.odjazd = other.odjazd;
        this.pocetDni = other.pocetDni;
        this.cena = other.cena;
        this.status = other.status;
        this.zlava = other.zlava;
        this.zaloha = other.zaloha;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return id + " - " + status.toString() + " " + sdf.format(this.prijazd) + " - " + sdf.format(this.odjazd);
    }

    @Override
    public void zaplat(Platba platba) {
        this.status = StatusRezervacie.POTVRDENA;
        this.zaloha = platba;
    }

    public Zlava getZlava() {
        return zlava;
    }

    public void setZlava(Zlava zlava) {
        this.zlava = zlava;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Zakaznik getZakaznik() {
        return zakaznik;
    }

    public void setZakaznik(Zakaznik zakaznik) {
        this.zakaznik = zakaznik;
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

    public StatusRezervacie getStatus() {
        return status;
    }

    public void setStatus(StatusRezervacie status) {
        this.status = status;
    }

    public Platba getZaloha() {
        return zaloha;
    }

    public void setZaloha(Platba zaloha) {
        this.zaloha = zaloha;
    }

}
