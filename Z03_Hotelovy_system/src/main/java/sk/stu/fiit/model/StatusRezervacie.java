package sk.stu.fiit.model;

import java.io.Serializable;

/**
 *
 * @author Martin Melisek
 */
public enum StatusRezervacie implements Serializable {
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
    VYKONANA {
        @Override
        public String toString() {
            return "Vykonaná";
        }
    },
    EXPIROVANA {
        @Override
        public String toString() {
            return "Expirovaná";
        }
    }
}
