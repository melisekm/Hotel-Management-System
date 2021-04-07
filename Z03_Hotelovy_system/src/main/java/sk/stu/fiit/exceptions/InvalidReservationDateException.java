package sk.stu.fiit.exceptions;

/**
 *
 * @author Martin Melisek
 */
public class InvalidReservationDateException extends Exception {

    @Override
    public String getMessage() {
        return "Nie je mozne vytvorit rezervaciu na menej ako jeden den.";
    }
}
