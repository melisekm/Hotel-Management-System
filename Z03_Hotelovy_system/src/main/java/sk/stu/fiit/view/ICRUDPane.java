package sk.stu.fiit.view;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Martin Melisek
 */
public interface ICRUDPane {

    /**
     * Vyplni polia datami z modelu
     */
    void setModel();

    /**
     * zvaliduje potrebne fieldy na ulozenie modelu
     *
     * @return true ak su validne, false ak su invalidne
     */
    boolean validateFields();

    /**
     * precita fieldy a vykona ulozenie
     */
    void saveModel();

    /**
     * Prida alebo edituje model
     */
    default void updateModel(JList<?> list, ArrayList<?> zoznam) {
        boolean fieldsAreInvalid = !this.validateFields();
        if (fieldsAreInvalid) {
            return;
        }
        this.saveModel();
        this.refreshModel(list, zoznam);
    }

    /**
     * Naplni JList v paneli informaciami z modelu, na zobrazenie pouziva
     * .toString()
     *
     * @param list komponent v paneli, ktory sa bude naplnat
     * @param zoznam udaje z databazy, ktore sa pridaju do listu
     */
    default void naplnList(JList<?> list, ArrayList<?> zoznam) {
        DefaultListModel model = (DefaultListModel) list.getModel();
        model.setSize(0);
        for (Object obj : zoznam) {
            model.addElement(obj);
        }
        list.setSelectedIndex(0);
    }

    /**
     * template metoda, implicitne zavola naplnenie listu a naplnenie fieldov
     *
     * @param list komponent v paneli, ktory sa bude naplnat
     * @param zoznam udaje z databazy, ktore sa pridaju do listu
     * @see #naplnList
     */
    default void refreshModel(JList<?> list, ArrayList<?> zoznam) {
        naplnList(list, zoznam);
        setModel();
    }
}
