package sk.stu.fiit.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Martin Melisek
 */
public class Sluzba implements Serializable {

    private String nazov;
    private String popis;
    private double cena;
    private Date datumVyuzitia;
    private ArrayList<Ubytovanie> vyuzitie;

    public Sluzba(String nazov, String popis, double cena) {
        this.nazov = nazov;
        this.popis = popis;
        this.cena = cena;
        this.datumVyuzitia = null;
        this.vyuzitie = new ArrayList<>();
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

    public ArrayList<Ubytovanie> getVyuzitie() {
        return vyuzitie;
    }

    public void setVyuzitie(ArrayList<Ubytovanie> vyuzitie) {
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

    public Date getDatumVyuzitia() {
        return datumVyuzitia;
    }

    public void setDatumVyuzitia(Date datumVyuzitia) {
        this.datumVyuzitia = datumVyuzitia;
    }

}
