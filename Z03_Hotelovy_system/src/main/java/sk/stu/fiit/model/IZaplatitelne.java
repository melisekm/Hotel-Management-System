package sk.stu.fiit.model;

/**
 *
 * @author Martin Melisek
 */
public interface IZaplatitelne {

    void zaplat(Platba platba);

    double getCena();

    Zakaznik getZakaznik();
}
