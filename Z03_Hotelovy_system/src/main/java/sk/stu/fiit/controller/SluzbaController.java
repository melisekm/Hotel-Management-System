package sk.stu.fiit.controller;

import sk.stu.fiit.model.Sluzba;

/**
 *
 * @author Martin Melisek
 */
public class SluzbaController extends Controller{

    public void saveSluzba(String nazov, String popis, Double cena) {
        Sluzba s = new Sluzba(nazov, popis, cena);
        this.getSluzby().add(s);
    }

    public void saveZakaznik(Sluzba povodnaSluzba, String nazov, String popis, Double cena ) {
        povodnaSluzba.updateDetails(nazov, popis, cena);
    }
    
}
