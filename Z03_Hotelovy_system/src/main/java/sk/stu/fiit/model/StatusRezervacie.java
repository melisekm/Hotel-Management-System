package sk.stu.fiit.model;

/**
 *
 * @author Martin Melisek
 */
public enum StatusRezervacie {
    VYTVORENA {
        @Override
        public String toString() {
            return "Vytvorená";
        }
    },
    POTVRDENA {
        @Override
        public String toString() {
            return "Potvrdená";
        }
    },
    EXPIROVANA {
        @Override
        public String toString() {
            return "Expirovaná";
        }
    }
}
