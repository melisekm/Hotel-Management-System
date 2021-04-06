package sk.stu.fiit.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Martin Melisek
 */
public class Ubytovanie {

    private Izba izba;
    private Date datumOd;
    private Date datumDo;
    private int pocetDni;
    private double cena;
    private ArrayList<Sluzba> sluzby;
    private boolean zaplatene;
}
