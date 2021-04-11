package sk.stu.fiit.model;

import java.io.Serializable;
import sk.stu.fiit.database.Database;

/**
 *
 * @author Martin Melisek
 */
public enum StatusRezervacie implements Serializable {
    VYTVORENA {
        @Override
        public String toString() {
            return java.util.ResourceBundle.getBundle(Database.getInstance().getBundle()).getString("VYTVORENÁ");
        }
    },
    POTVRDENA {
        @Override
        public String toString() {
            return java.util.ResourceBundle.getBundle(Database.getInstance().getBundle()).getString("POTVRDENÁ");
        }
    },
    VYKONANA {
        @Override
        public String toString() {
            return java.util.ResourceBundle.getBundle(Database.getInstance().getBundle()).getString("VYKONANÁ");
        }
    },
    UKONCENA {
        @Override
        public String toString() {
            return java.util.ResourceBundle.getBundle(Database.getInstance().getBundle()).getString("UKONČENÁ");
        }
    },
    EXPIROVANA {
        @Override
        public String toString() {
            return java.util.ResourceBundle.getBundle(Database.getInstance().getBundle()).getString("EXPIROVANÁ");
        }
    }
}
