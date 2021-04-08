package sk.stu.fiit.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Martin Melisek
 */
public class Platba implements Serializable{
    private Date datum;
    private Ubytovanie ubytovanie;
    private boolean vHotovosti;
}
