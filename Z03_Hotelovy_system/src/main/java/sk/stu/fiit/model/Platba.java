package sk.stu.fiit.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Martin Melisek
 */
public class Platba implements Serializable {
    
    private Zakaznik zakaznik;
    private Date datum;
    private IZaplatitelne polozka;
    private boolean vHotovosti;

    public Platba(Date datum, IZaplatitelne polozka, boolean vHotovosti) {
        this.datum = datum;
        this.polozka = polozka;
        this.vHotovosti = vHotovosti;
        this.zakaznik = polozka.getZakaznik();
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public IZaplatitelne getPolozka() {
        return polozka;
    }

    public void setPolozka(IZaplatitelne polozka) {
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
    
    

}
