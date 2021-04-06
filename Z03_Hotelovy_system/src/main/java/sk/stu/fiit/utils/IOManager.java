package sk.stu.fiit.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.stu.fiit.database.Database;

/**
 * Umozni ukladanie databazy do suboru a nasledne citanie - serializacia
 *
 * @author Martin Melisek
 * @see Database
 */
public class IOManager {

    private static final Logger logger = LoggerFactory.getLogger(IOManager.class);

    public void saveDatabase(Database db) {
        String filePath = "database.z03";
        logger.info("Ukladam databazu do subora ");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) { // try with resources
            out.writeObject(db); // ulozi databazu
            logger.info("Databaza ulozena");

        } catch (FileNotFoundException ex) {
            logger.error(ex.getMessage());
            logger.error("SUBOR NEEXISTUJE");
        } catch (IOException ex) {
            logger.error("NASTALA NEOCAKAVANA IO CHYBA");
            logger.error(ex.getMessage());
        }
    }
    
//    public Database db 
}
