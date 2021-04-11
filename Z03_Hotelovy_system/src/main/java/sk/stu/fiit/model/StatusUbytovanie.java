package sk.stu.fiit.model;

/**
 *
 * @author Martin Melisek
 */
public enum StatusUbytovanie {
    ZACATE {
        @Override
        public String toString() {
            return "Začaté";
        }
    },
    UKONCENE {
        @Override
        public String toString() {
            return "Ukončené";
        }
    }
}
