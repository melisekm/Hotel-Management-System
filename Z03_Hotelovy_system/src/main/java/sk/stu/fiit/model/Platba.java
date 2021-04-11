package sk.stu.fiit.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Martin Melisek
 */
public class Platba implements Serializable, Comparable<Platba> {

    private Zakaznik zakaznik;
    private Date datum;
    private Booking polozka;
    private boolean vHotovosti;
    private double cena;

    public Platba(Date datum, Booking polozka, boolean vHotovosti, double cena) {
        this.datum = datum;
        this.polozka = polozka;
        this.vHotovosti = vHotovosti;
        this.zakaznik = polozka.getZakaznik();
        this.cena = cena;
    }

    @Override
    public int compareTo(Platba o) {
        if (this.datum == null || o.getDatum() == null) {
            return 0;
        }
        return this.datum.compareTo(o.getDatum());
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Booking getPolozka() {
        return polozka;
    }

    public void setPolozka(Booking polozka) {
        this.polozka = polozka;
    }

    public boolean isvHotovosti() {
        return vHotovosti;
    }

    public void setvHotovosti(boolean vHotovosti) {
        this.vHotovosti = vHotovosti;
    }

    public Zakaznik getZakaznik() {
        return zakaznik;
    }

    public void setZakaznik(Zakaznik zakaznik) {
        this.zakaznik = zakaznik;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

}
