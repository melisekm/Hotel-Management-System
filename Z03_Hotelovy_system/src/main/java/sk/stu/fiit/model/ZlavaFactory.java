package sk.stu.fiit.model;

/**
 *
 * @author Martin Melisek
 */
public class ZlavaFactory {

    public Zlava getZlava(String nazov) {
        if ("7_D_GTE".equals(nazov)) {
            return new Zlava("7_D_GTE", "Zlava za pobyt viac ako 7 dni", 0.1);
        } else if ("1000_E_GTE".equals(nazov)) {
            return new Zlava("1000_E_GTE", "Zlava za nakup nad 1000e", 0.15);
        } else if ("2_I_GTE".equals(nazov)) {
            return new Zlava("2_I_GTE", "Zlava za rezervaciu viac ako 2 izieb", 0.05);
        }
        return null;
    }

    public Zlava createZlava(String nazov, String popis, double percento) {
        return new Zlava(nazov, popis, percento);
    }
}
