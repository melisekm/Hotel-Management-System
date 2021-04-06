package sk.stu.fiit.controller;

import sk.stu.fiit.model.Pohlavie;
import sk.stu.fiit.model.Zakaznik;

/**
 *
 * @author Martin Melisek
 */
public class ZakaznikController extends Controller {

    public void saveZakaznik(Pohlavie pohlavie,
            String meno, String narodnost, String cisloOP, String telCislo, String adresa) {
        Zakaznik z = new Zakaznik(pohlavie, meno, narodnost, cisloOP, telCislo, adresa);
        this.getZakaznici().add(z);
    }

    public void saveZakaznik(Zakaznik povodnyZakaznik, Pohlavie pohlavie,
            String meno, String narodnost, String cisloOP, String telCislo, String adresa) {
        povodnyZakaznik.updateDetails(pohlavie, meno, narodnost, cisloOP, telCislo, adresa);
    }

}
