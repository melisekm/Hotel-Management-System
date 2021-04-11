package sk.stu.fiit.controller;

import java.util.Date;
import sk.stu.fiit.database.Database;
import sk.stu.fiit.model.Izba;
import sk.stu.fiit.model.Rezervacia;
import sk.stu.fiit.model.StatusRezervacie;
import sk.stu.fiit.model.StatusUbytovanie;
import sk.stu.fiit.model.Ubytovanie;

/**
 *
 * @author Martin Melisek
 */
public class DomovController extends Controller {

    public void vykonajCasoveZmeny() {
        Date cas = Database.getInstance().getAppTime();
        for (Rezervacia rezervacia : this.getRezervacie()) {
            if (rezervacia.getOdjazd().before(cas)) {
                if (rezervacia.getStatus() == StatusRezervacie.POTVRDENA || rezervacia.getStatus() == StatusRezervacie.VYTVORENA) {
                    rezervacia.setStatus(StatusRezervacie.EXPIROVANA);
                } else if (rezervacia.getStatus() == StatusRezervacie.VYKONANA) {
                    rezervacia.setStatus(StatusRezervacie.UKONCENA);
                }
            }
        }
        for (Ubytovanie ubytovanie : this.getUbytovania()) {
            if(ubytovanie.getOdjazd().before(cas)){
                ubytovanie.setStatus(StatusUbytovanie.UKONCENE);
                for (Izba izba : ubytovanie.getIzby()) {
                    izba.getHistoriaUbytovani().add(ubytovanie);
                }
                ubytovanie.getZakaznik().getHistoriaUbytovani().add(ubytovanie);
            }
        }
    }

}
