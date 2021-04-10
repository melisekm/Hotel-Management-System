package sk.stu.fiit.view.panes;

import com.toedter.calendar.JTextFieldDateEditor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.stu.fiit.controller.RezervacieController;
import sk.stu.fiit.database.Database;
import sk.stu.fiit.model.Izba;
import sk.stu.fiit.model.Rezervacia;
import sk.stu.fiit.model.Zakaznik;
import sk.stu.fiit.utils.Utils;
import sk.stu.fiit.utils.ViewUtils;
import sk.stu.fiit.view.ICRUDPane;
import sk.stu.fiit.view.IViewRefresh;
import sk.stu.fiit.view.dialogs.PridatIzbuDialog;
import sk.stu.fiit.view.dialogs.StatusRezervacieDialog;

/**
 *
 * @author Martin Melisek
 */
public class RezervaciePane extends javax.swing.JPanel implements IViewRefresh, ICRUDPane {

    private static final Logger logger = LoggerFactory.getLogger(RezervaciePane.class);

    private RezervacieController controller = new RezervacieController();
    private JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);

    private boolean novy = true;

    public RezervaciePane() {
        initComponents();
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dcOdjazd.getDateEditor();
        editor.setEditable(false);
        editor = (JTextFieldDateEditor) dcPrijazd.getDateEditor();
        editor.setEditable(false);
        this.refreshPane();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelRezervacie = new javax.swing.JLabel();
        scrollPaneRezervacie = new javax.swing.JScrollPane();
        listRezervacie = new javax.swing.JList<>();
        labelZakaznik = new javax.swing.JLabel();
        labelDatumOdjazdu = new javax.swing.JLabel();
        labelDatumPrijazdu = new javax.swing.JLabel();
        btnUlozit = new javax.swing.JButton();
        labelDataCena = new javax.swing.JLabel();
        labelRezervacia = new javax.swing.JLabel();
        labelCena = new javax.swing.JLabel();
        labelPridaneIzby = new javax.swing.JLabel();
        btnPridatIzbu = new javax.swing.JButton();
        comboBoxZakaznik = new javax.swing.JComboBox<>();
        dcOdjazd = new com.toedter.calendar.JDateChooser();
        dcPrijazd = new com.toedter.calendar.JDateChooser();
        labelZlava = new javax.swing.JLabel();
        labelDataPocetIzieb = new javax.swing.JLabel();
        btnStatusRezervacie = new javax.swing.JButton();
        labelDataZlava = new javax.swing.JLabel();
        scrollPaneIzby = new javax.swing.JScrollPane();
        tableIzby = new javax.swing.JTable();
        labelPocetIzieb = new javax.swing.JLabel();
        btnPridat = new javax.swing.JButton();
        labelCenaEur = new javax.swing.JLabel();
        labelZlavaPercent1 = new javax.swing.JLabel();
        separatorIzieb = new javax.swing.JSeparator();
        separatorCena = new javax.swing.JSeparator();
        separatorZlava = new javax.swing.JSeparator();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelRezervacie.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelRezervacie.setText("Rezervácie");
        add(labelRezervacie, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 130, -1));

        listRezervacie.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listRezervacie.setModel(new DefaultListModel<Rezervacia>());
        listRezervacie.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listRezervacie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listRezervacieMouseReleased(evt);
            }
        });
        scrollPaneRezervacie.setViewportView(listRezervacie);

        add(scrollPaneRezervacie, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 260, 340));

        labelZakaznik.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelZakaznik.setText("Zákazník:");
        add(labelZakaznik, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 40));

        labelDatumOdjazdu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDatumOdjazdu.setText("Dátum odjazdu:");
        add(labelDatumOdjazdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 130, 40));

        labelDatumPrijazdu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDatumPrijazdu.setText("Dátum príjazdu:");
        add(labelDatumPrijazdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, 40));

        btnUlozit.setBackground(new java.awt.Color(51, 153, 0));
        btnUlozit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUlozit.setForeground(new java.awt.Color(255, 255, 255));
        btnUlozit.setText("ULOŽIŤ");
        btnUlozit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUlozitMouseReleased(evt);
            }
        });
        add(btnUlozit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 250, -1));

        labelDataCena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataCena.setText("1 500.00");
        add(labelDataCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 100, 40));

        labelRezervacia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelRezervacia.setText("Rezervácia");
        add(labelRezervacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        labelCena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelCena.setText("Cena:");
        add(labelCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 90, 40));

        labelPridaneIzby.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPridaneIzby.setText("Pridané izby");
        add(labelPridaneIzby, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 110, 40));

        btnPridatIzbu.setBackground(new java.awt.Color(102, 102, 255));
        btnPridatIzbu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPridatIzbu.setForeground(new java.awt.Color(255, 255, 255));
        btnPridatIzbu.setText("Pridať izbu");
        btnPridatIzbu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPridatIzbuMouseReleased(evt);
            }
        });
        add(btnPridatIzbu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 250, -1));

        comboBoxZakaznik.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboBoxZakaznik.setModel(new DefaultComboBoxModel<Zakaznik>());
        add(comboBoxZakaznik, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 250, 40));

        dcOdjazd.setDateFormatString("dd.MM.yyyy");
        dcOdjazd.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dcOdjazdPropertyChange(evt);
            }
        });
        add(dcOdjazd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 250, 40));

        dcPrijazd.setDateFormatString("dd.MM.yyyy");
        dcPrijazd.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dcPrijazdPropertyChange(evt);
            }
        });
        add(dcPrijazd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 250, 40));

        labelZlava.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelZlava.setText("Zľava:");
        add(labelZlava, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 60, 40));

        labelDataPocetIzieb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataPocetIzieb.setText("7");
        add(labelDataPocetIzieb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 60, 40));

        btnStatusRezervacie.setBackground(new java.awt.Color(102, 102, 255));
        btnStatusRezervacie.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnStatusRezervacie.setForeground(new java.awt.Color(255, 255, 255));
        btnStatusRezervacie.setText("STATUS REZERVÁCIE");
        btnStatusRezervacie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnStatusRezervacieMouseReleased(evt);
            }
        });
        add(btnStatusRezervacie, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 250, -1));

        labelDataZlava.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataZlava.setText("15");
        add(labelDataZlava, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 250, 40));

        tableIzby.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kategória", "Izba", "Cena"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableIzby.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPaneIzby.setViewportView(tableIzby);

        add(scrollPaneIzby, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 270, 210));

        labelPocetIzieb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPocetIzieb.setText("Počet izieb:");
        add(labelPocetIzieb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 90, 40));

        btnPridat.setBackground(new java.awt.Color(102, 102, 255));
        btnPridat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPridat.setForeground(new java.awt.Color(255, 255, 255));
        btnPridat.setText("PRIDAŤ");
        btnPridat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPridatMouseReleased(evt);
            }
        });
        add(btnPridat, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 260, -1));

        labelCenaEur.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelCenaEur.setText("€");
        add(labelCenaEur, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 20, 40));

        labelZlavaPercent1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelZlavaPercent1.setText("%");
        add(labelZlavaPercent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, 40));
        add(separatorIzieb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 390, 20));
        add(separatorCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 390, 20));
        add(separatorZlava, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 390, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void listRezervacieMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listRezervacieMouseReleased
        this.setModel();
    }//GEN-LAST:event_listRezervacieMouseReleased

    private void btnUlozitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUlozitMouseReleased
        this.updateModel(listRezervacie, this.controller.getRezervacie());
    }//GEN-LAST:event_btnUlozitMouseReleased

    private void btnPridatIzbuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPridatIzbuMouseReleased
        Date prijazd = dcPrijazd.getDate();
        Date odjazd = dcOdjazd.getDate();
        int pocetDni = Utils.DAYS_BETWEEN(prijazd, odjazd);
        if (pocetDni < 1) {
            String msg = "Chybne zadane datum prijazdu alebo datum odjazdu.";
            logger.error(msg);
            JOptionPane.showMessageDialog(this, msg, "DATE ERROR", JOptionPane.ERROR_MESSAGE);
            this.resetTime();
            return;
        }
        DefaultTableModel tableModel = (DefaultTableModel) tableIzby.getModel();
        PridatIzbuDialog dialog = new PridatIzbuDialog(this.parent,
                true, this.controller, prijazd, odjazd);
        Izba pridavanaIzba = dialog.showDialog();
        if (pridavanaIzba == null) {
            return;
        }
        tableModel.addRow(new Object[]{
            pridavanaIzba,
            pridavanaIzba.getOznacenie(),
            String.format("%.02f", pridavanaIzba.getCena())
        });
        this.controller.pridajIzbu(pocetDni, pridavanaIzba);
        this.updateLabels();
    }//GEN-LAST:event_btnPridatIzbuMouseReleased

    private void updateLabels() {
        labelDataPocetIzieb.setText(String.valueOf(this.controller.getPridavaneIzby().size()));
        if (this.controller.getZlava() == null) {
            labelDataZlava.setText("0");
        } else {
            labelDataZlava.setText(String.valueOf(this.controller.getZlava().getNazov() + " - " + this.controller.getZlava().getPercento() * 100));
        }
        if (this.controller.getPriebeznaCena() <= 0) {
            labelDataCena.setText("0");
        } else {
            labelDataCena.setText(String.format("%.02f", this.controller.getPriebeznaCena()));
        }
    }

    private void btnStatusRezervacieMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatusRezervacieMouseReleased
        Rezervacia zvolenaRezervacia = listRezervacie.getSelectedValue();
        StatusRezervacieDialog dialog = new StatusRezervacieDialog(this.parent, true, this.controller, zvolenaRezervacia);
        ViewUtils.showDialog(dialog);
        this.refreshPane();
    }//GEN-LAST:event_btnStatusRezervacieMouseReleased

    private void btnPridatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPridatMouseReleased
        this.clearRezervacia();
        this.novy = true;
        this.resetBtns();
    }//GEN-LAST:event_btnPridatMouseReleased

    private void skontrolovatCenu() {
        int pocetDni = Utils.DAYS_BETWEEN(dcPrijazd.getDate(), dcOdjazd.getDate());
        this.controller.prepocitajTempCenu(pocetDni);
        this.updateLabels();
    }

    private void dcPrijazdPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcPrijazdPropertyChange
        this.skontrolovatCenu();
    }//GEN-LAST:event_dcPrijazdPropertyChange

    private void dcOdjazdPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcOdjazdPropertyChange
        this.skontrolovatCenu();
    }//GEN-LAST:event_dcOdjazdPropertyChange

    @Override
    public void saveModel() {
        Zakaznik zakaznik = (Zakaznik) comboBoxZakaznik.getSelectedItem();
        Date datumPrijazdu = dcPrijazd.getDate();
        Date datumOdjazdu = dcOdjazd.getDate();
        int pocetDni = Utils.DAYS_BETWEEN(datumPrijazdu, datumOdjazdu);
        if (this.novy) {
            logger.info(String.format("Ukladam novu rezervaciu"));
            this.controller.saveRezervacia(zakaznik, datumPrijazdu, datumOdjazdu, pocetDni);
        } else {
            logger.info(String.format("Editujem existujucu rezervaciu"));
            Rezervacia povodnaRezervacia = listRezervacie.getSelectedValue();
            this.controller.saveRezervacia(povodnaRezervacia, zakaznik, datumPrijazdu, datumOdjazdu, pocetDni);
        }
        JOptionPane.showMessageDialog(this, "Rezervacia ulozena", "SUCESS", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public boolean validateFields() {
        if (((DefaultTableModel) tableIzby.getModel()).getRowCount() == 0) {
            logger.error("Zoznam izieb je prazdny.");
            JOptionPane.showMessageDialog(this, "Zoznam izieb je prazdny", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        Date datumPrijazdu = dcPrijazd.getDate();
        Date datumOdjazdu = dcOdjazd.getDate();
        int pocetDni = Utils.DAYS_BETWEEN(datumPrijazdu, datumOdjazdu);
        if (pocetDni < 1) {
            String msg = "Chybne zadane datum prijazdu alebo datum odjazdu.";
            logger.error(msg);
            JOptionPane.showMessageDialog(this, msg, "DATE ERROR", JOptionPane.ERROR_MESSAGE);
            this.resetTime();
            return false;
        }
        this.controller.prepocitajTempCenu(pocetDni);
        this.updateLabels();
        int res = JOptionPane.showConfirmDialog(this, "Prajete si uložiť rezerváciu?. Prosím skontrolujte vyplnené údaje", "CONFIRM", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_NO_OPTION) {
            return true;
        }
        return false;
    }

    @Override
    public void setModel() {
        Boolean zoznamJePrazdny = listRezervacie.getModel().getSize() == 0;
        if (zoznamJePrazdny) {
            this.clearRezervacia();
            return;
        }
        this.novy = false;
        this.resetBtns();
        Rezervacia r = listRezervacie.getSelectedValue();
        comboBoxZakaznik.setSelectedItem(r.getZakaznik());
        dcPrijazd.setDate(r.getPrijazd());
        dcOdjazd.setDate(r.getOdjazd());
        labelDataPocetIzieb.setText(String.valueOf(r.getIzby().size()));
        labelDataCena.setText(String.format("%.02f", r.getCena()));
        if (r.getZlava() != null) {
            labelDataZlava.setText(r.getZlava().getNazov() + " - " + String.valueOf(r.getZlava().getPercento() * 100));
        }
        btnStatusRezervacie.setVisible(true);
        this.naplnTabulkuIzieb(r);
    }

    private void resetBtns() {
        if (this.novy == false) {
            comboBoxZakaznik.setEnabled(false);
            btnPridatIzbu.setEnabled(false);
            btnUlozit.setEnabled(false);
            dcOdjazd.setEnabled(false);
            dcPrijazd.setEnabled(false);
        } else {
            comboBoxZakaznik.setEnabled(true);
            btnPridatIzbu.setEnabled(true);
            btnUlozit.setEnabled(true);
            dcOdjazd.setEnabled(true);
            dcPrijazd.setEnabled(true);
        }
    }

    private void naplnTabulkuIzieb(Rezervacia rezervacia) {
        DefaultTableModel model = (DefaultTableModel) tableIzby.getModel();
        model.setRowCount(0);
        ArrayList<Izba> izby = rezervacia.getIzby();
        for (Izba izba : izby) {
            model.addRow(new Object[]{
                izba,
                izba.getOznacenie(),
                String.format("%.02f", izba.getCena())
            });
        }
    }

    private void clearRezervacia() {
        if (Database.getInstance().getAppTime() != null) {
            this.resetTime();
            DefaultTableModel model = (DefaultTableModel) tableIzby.getModel();
            model.setRowCount(0);
            btnStatusRezervacie.setVisible(false);
        }
        this.controller.clearTempBooking();
        this.updateLabels();
    }

    private void resetTime() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(Database.getInstance().getAppTime());
        cal.add(Calendar.DATE, 1);
        dcOdjazd.setCalendar(null);
        dcPrijazd.setCalendar(null);
        dcOdjazd.setMinSelectableDate(cal.getTime());
    }

    private void nastavComboBoxZakaznikov() {
        DefaultComboBoxModel<Zakaznik> model = (DefaultComboBoxModel) comboBoxZakaznik.getModel();
        model.removeAllElements();
        for (Zakaznik zakaznik : this.controller.getZakaznici()) {
            model.addElement(zakaznik);
        }
    }

    @Override
    public void refreshPane() {
        dcOdjazd.setMinSelectableDate(Database.getInstance().getAppTime());
        dcPrijazd.setMinSelectableDate(Database.getInstance().getAppTime());
        this.refreshModel(listRezervacie, this.controller.getRezervacie());
        this.nastavComboBoxZakaznikov();
        this.controller.clearTempBooking();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPridat;
    private javax.swing.JButton btnPridatIzbu;
    private javax.swing.JButton btnStatusRezervacie;
    private javax.swing.JButton btnUlozit;
    private javax.swing.JComboBox<Zakaznik> comboBoxZakaznik;
    private com.toedter.calendar.JDateChooser dcOdjazd;
    private com.toedter.calendar.JDateChooser dcPrijazd;
    private javax.swing.JLabel labelCena;
    private javax.swing.JLabel labelCenaEur;
    private javax.swing.JLabel labelDataCena;
    private javax.swing.JLabel labelDataPocetIzieb;
    private javax.swing.JLabel labelDataZlava;
    private javax.swing.JLabel labelDatumOdjazdu;
    private javax.swing.JLabel labelDatumPrijazdu;
    private javax.swing.JLabel labelPocetIzieb;
    private javax.swing.JLabel labelPridaneIzby;
    private javax.swing.JLabel labelRezervacia;
    private javax.swing.JLabel labelRezervacie;
    private javax.swing.JLabel labelZakaznik;
    private javax.swing.JLabel labelZlava;
    private javax.swing.JLabel labelZlavaPercent1;
    private javax.swing.JList<Rezervacia> listRezervacie;
    private javax.swing.JScrollPane scrollPaneIzby;
    private javax.swing.JScrollPane scrollPaneRezervacie;
    private javax.swing.JSeparator separatorCena;
    private javax.swing.JSeparator separatorIzieb;
    private javax.swing.JSeparator separatorZlava;
    private javax.swing.JTable tableIzby;
    // End of variables declaration//GEN-END:variables

}
