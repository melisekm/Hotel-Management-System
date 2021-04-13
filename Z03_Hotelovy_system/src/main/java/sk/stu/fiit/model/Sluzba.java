package sk.stu.fiit.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Martin Melisek
 */
public class Sluzba implements Serializable {

    private String nazov;
    private String popis;
    private double cena;
    private HashMap<Ubytovanie, Date> vyuzitie;

    public Sluzba(String nazov, String popis, double cena) {
        this.nazov = nazov;
        this.popis = popis;
        this.cena = cena;
        this.vyuzitie = new HashMap<>();
    }

    public void updateDetails(String nazov, String popis, Double cena) {
        this.nazov = nazov;
        this.cena = cena;
        this.popis = popis;
    }

    @Override
    public String toString() {
        return nazov + " - " + String.format("%.02f", cena) + "€";
    }

    public HashMap<Ubytovanie, Date> getVyuzitie() {
        return vyuzitie;
    }

    public void setVyuzitie(HashMap<Ubytovanie, Date> vyuzitie) {
        this.vyuzitie = vyuzitie;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

}
