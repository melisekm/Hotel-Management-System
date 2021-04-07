package sk.stu.fiit.model;

import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author Martin Melisek
 */
public class Izba {

    private ArrayList<Ubytovanie> historiaUbytovani;
    private String oznacenie;
    private String kategoria;
    private String popis;
    private double cena;
    private ArrayList<Icon> galeria;
    private boolean obsadena;
    private int pocetLozok;

    public Izba(String oznacenie, String kategoria, String popis, double cena, ArrayList<Icon> galeria, int pocetLozok) {
        this.oznacenie = oznacenie;
        this.kategoria = kategoria;
        this.popis = popis;
        this.cena = cena;
        this.galeria = galeria;
        this.pocetLozok = pocetLozok;
        this.historiaUbytovani = new ArrayList<>();
        this.obsadena = false;
    }

    @Override
    public String toString() {
        return kategoria;
    }

    public ArrayList<Ubytovanie> getHistoriaUbytovani() {
        return historiaUbytovani;
    }

    public void setHistoriaUbytovani(ArrayList<Ubytovanie> historiaUbytovani) {
        this.historiaUbytovani = historiaUbytovani;
    }

    public String getOznacenie() {
        return oznacenie;
    }

    public void setOznacenie(String oznacenie) {
        this.oznacenie = oznacenie;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
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

    public ArrayList<Icon> getGaleria() {
        return galeria;
    }

    public void setGaleria(ArrayList<Icon> galeria) {
        this.galeria = galeria;
    }

    public boolean isObsadena() {
        return obsadena;
    }

    public void setObsadena(boolean obsadena) {
        this.obsadena = obsadena;
    }

    public int getPocetLozok() {
        return pocetLozok;
    }

    public void setPocetLozok(int pocetLozok) {
        this.pocetLozok = pocetLozok;
    }

}
