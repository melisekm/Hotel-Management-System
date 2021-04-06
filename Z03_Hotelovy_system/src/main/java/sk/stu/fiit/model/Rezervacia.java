package sk.stu.fiit.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Martin Melisek
 */
public class Rezervacia {

    private String id;
    private ArrayList<Izba> izby;
    private Date datumOd;
    private Date datumDo;
    private int pocetDni;
    private double cena;
    private StatusRezervacie status;
    private Platba zaloha;
}
