package sk.stu.fiit.exceptions;

import java.io.File;

/**
 *
 * @author Martin Melisek
 */
public class InvalidImage extends Exception {

    private File file;

    public InvalidImage(File file) {
        this.file = file;
    }

    public String getMessage() {
        return "Tento obrazok nie je mozne spracovat. - " + this.file.getPath();
    }
}
