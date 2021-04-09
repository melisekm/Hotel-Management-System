package sk.stu.fiit.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Martin Melisek
 */
public class Rezervacia extends Booking implements Serializable {

    private StatusRezervacie status;

    public Rezervacia(String id, Zakaznik zakaznik, ArrayList<Izba> izby, Date prijazd, Date odjazd, int pocetDni, double cena, StatusRezervacie status, Zlava zlava) {
        super(id, izby, zakaznik, prijazd, odjazd, pocetDni, cena, zlava);
        this.status = status;
    }

    public void updateDetails(Rezervacia other) {
        super.updateDetails(other);
        this.status = other.status;
    }

    public void zaplat(Platba platba) {
        super.zaplat(platba);
        this.status = StatusRezervacie.POTVRDENA;
    }

    public StatusRezervacie getStatus() {
        return status;
    }

    public void setStatus(StatusRezervacie status) {
        this.status = status;
    }

}
