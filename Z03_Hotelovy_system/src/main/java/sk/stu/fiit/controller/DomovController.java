package sk.stu.fiit.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import sk.stu.fiit.database.Database;
import sk.stu.fiit.model.Izba;
import sk.stu.fiit.model.Platba;
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
            if (ubytovanie.getOdjazd().before(cas)) {
                ubytovanie.setStatus(StatusUbytovanie.UKONCENE);
                for (Izba izba : ubytovanie.getIzby()) {
                    izba.getHistoriaUbytovani().add(ubytovanie);
                }
                ubytovanie.getZakaznik().getHistoriaUbytovani().add(ubytovanie);
            }
        }
    }

    public LinkedHashMap<String, Double> getPrijmyDataset() {
        ArrayList<Platba> prijmy = new ArrayList<>(this.getPlatby());
        Collections.sort(prijmy);
        LinkedHashMap<String, Double> datasetRaw = new LinkedHashMap<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.");
        for (Platba platba : prijmy) {
            String datum = sdf.format(platba.getDatum());
            Double cena = datasetRaw.get(datum);
            if (cena == null) {
                datasetRaw.put(sdf.format(platba.getDatum()), platba.getCena());
            } else {
                cena += platba.getPolozka().getCena();
                datasetRaw.put(sdf.format(platba.getDatum()), cena);
            }
        }
        return datasetRaw;
    }

}
