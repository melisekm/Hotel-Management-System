package sk.stu.fiit.database;

import java.util.Date;

/**
 *
 * @author Martin Melisek
 */
public class Database {

    private Date appTime;
    private static Database INSTANCE = new Database();

    private Database() {
    }

    public static Database getInstance() {
        return INSTANCE;
    }

    public Date getAppTime() {
        return appTime;
    }

    public void setAppTime(Date appTime) {
        this.appTime = appTime;
    }
    
    

}
