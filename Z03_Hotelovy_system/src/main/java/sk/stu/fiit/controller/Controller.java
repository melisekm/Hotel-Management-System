package sk.stu.fiit.controller;

import sk.stu.fiit.database.Database;

/**
 *
 * @author Martin Melisek
 */
public abstract class Controller {

    protected Database db;

    public Controller() {
        this.db = Database.getInstance();
    }
}
