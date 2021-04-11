package sk.stu.fiit.controller;

import java.text.SimpleDateFormat;
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
        LinkedHashMap<String, Double> datasetRaw = new LinkedHashMap<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.");
        for (Platba platba : this.getPlatby()) {
            String datum = sdf.format(platba.getDatum());
            Double cena = datasetRaw.get(datum);
            if (cena == null) {
                datasetRaw.put(sdf.format(platba.getDatum()), platba.getCena());
            } else {
                cena += platba.getCena();
                datasetRaw.put(sdf.format(platba.getDatum()), cena);
            }
        }
        return datasetRaw;
    }

    public LinkedHashMap<String, Double> getRezervacieDataset() {
        LinkedHashMap<String, Double> datasetRaw = new LinkedHashMap<>();
        double pocetPotvrdenych, pocetVytvorenych, pocetVykonanych, pocetExpirovanych, pocetUkoncenych;
        pocetPotvrdenych = pocetVytvorenych = pocetVykonanych = pocetExpirovanych = pocetUkoncenych = 0;
        for (Rezervacia rezervacia : this.getRezervacie()) {
            switch (rezervacia.getStatus()) {
                case EXPIROVANA:
                    pocetExpirovanych++;
                    break;
                case POTVRDENA:
                    pocetPotvrdenych++;
                    break;
                case UKONCENA:
                    pocetUkoncenych++;
                    break;
                case VYKONANA:
                    pocetVykonanych++;
                    break;
                case VYTVORENA:
                    pocetVytvorenych++;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        datasetRaw.put(StatusRezervacie.EXPIROVANA.toString(), pocetExpirovanych);
        datasetRaw.put(StatusRezervacie.POTVRDENA.toString(), pocetPotvrdenych);
        datasetRaw.put(StatusRezervacie.UKONCENA.toString(), pocetUkoncenych);
        datasetRaw.put(StatusRezervacie.VYKONANA.toString(), pocetVykonanych);
        datasetRaw.put(StatusRezervacie.VYTVORENA.toString(), pocetVytvorenych);
        return datasetRaw;
    }

    public String[] getStatistiky() {
        double celkovoPlatby = 0;
        for (Platba platba : this.getPlatby()) {
            celkovoPlatby += platba.getCena();
        }
        return new String[]{
            String.valueOf(this.getIzby().size()), String.valueOf(this.getRezervacie().size()),
            String.valueOf(this.getSluzby().size()), String.valueOf(this.getUbytovania().size()),
            String.valueOf(this.getZakaznici().size()),
            String.format("Príjmy celkovo: %.02f EUR", celkovoPlatby)
        };
    }

}
