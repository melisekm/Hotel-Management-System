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
import sk.stu.fiit.controller.UbytovaniaController;
import sk.stu.fiit.database.Database;
import sk.stu.fiit.model.Booking;
import sk.stu.fiit.model.Izba;
import sk.stu.fiit.model.Rezervacia;
import sk.stu.fiit.model.StatusRezervacie;
import sk.stu.fiit.model.Ubytovanie;
import sk.stu.fiit.model.Zakaznik;
import sk.stu.fiit.utils.Utils;
import sk.stu.fiit.utils.ViewUtils;
import sk.stu.fiit.view.ICRUDPane;
import sk.stu.fiit.view.IViewRefresh;
import sk.stu.fiit.view.dialogs.PlatbaDialog;
import sk.stu.fiit.view.dialogs.PridatIzbuDialog;

/**
 *
 * @author Martin Melisek
 */
public class UbytovaniaPane extends javax.swing.JPanel implements IViewRefresh, ICRUDPane {

    private static final Logger logger = LoggerFactory.getLogger(UbytovaniaPane.class);

    private UbytovaniaController controller = new UbytovaniaController();
    private JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);

    private boolean novy = true;

    public UbytovaniaPane() {
        initComponents();
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dcPrijazd.getDateEditor();
        editor.setEditable(false);
        this.refreshPane();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogPridat = new javax.swing.JDialog();
        dialogPridatMainPane = new javax.swing.JPanel();
        checkBNaZakladeR = new javax.swing.JCheckBox();
        scrollPaneRez = new javax.swing.JScrollPane();
        listRezervacii = new javax.swing.JList<>();
        btnDialogPridatOk = new javax.swing.JButton();
        labelRezervacie = new javax.swing.JLabel();
        scrollPaneRezervacie = new javax.swing.JScrollPane();
        listUbytovania = new javax.swing.JList<>();
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
        btnZaplatit = new javax.swing.JButton();
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
        btnPridatSluzbu = new javax.swing.JButton();

        dialogPridat.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogPridat.setTitle("Pridat ubytovanie");
        dialogPridat.setModal(true);
        dialogPridat.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dialogPridatMainPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkBNaZakladeR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        checkBNaZakladeR.setText("Vytvoriť na základe rezervácie");
        checkBNaZakladeR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkBNaZakladeR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                checkBNaZakladeRMouseReleased(evt);
            }
        });
        dialogPridatMainPane.add(checkBNaZakladeR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 280, -1));

        listRezervacii.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listRezervacii.setModel(new DefaultListModel<Rezervacia>());
        listRezervacii.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listRezervacii.setEnabled(false);
        scrollPaneRez.setViewportView(listRezervacii);

        dialogPridatMainPane.add(scrollPaneRez, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 280, 200));

        btnDialogPridatOk.setBackground(new java.awt.Color(102, 102, 102));
        btnDialogPridatOk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDialogPridatOk.setForeground(new java.awt.Color(255, 255, 255));
        btnDialogPridatOk.setText("OK");
        btnDialogPridatOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDialogPridatOkMouseReleased(evt);
            }
        });
        dialogPridatMainPane.add(btnDialogPridatOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 110, -1));

        dialogPridat.getContentPane().add(dialogPridatMainPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 320));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelRezervacie.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelRezervacie.setText("Ubytovania");
        add(labelRezervacie, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 130, -1));

        listUbytovania.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listUbytovania.setModel(new DefaultListModel<Ubytovanie>());
        listUbytovania.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listUbytovania.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listUbytovaniaMouseReleased(evt);
            }
        });
        scrollPaneRezervacie.setViewportView(listUbytovania);

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
        labelRezervacia.setText("Ubytovanie");
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
        add(btnPridatIzbu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 270, -1));

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
        dcPrijazd.setEnabled(false);
        add(dcPrijazd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 250, 40));

        labelZlava.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelZlava.setText("Zľava:");
        add(labelZlava, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 60, 40));

        labelDataPocetIzieb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataPocetIzieb.setText("7");
        add(labelDataPocetIzieb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 60, 40));

        btnZaplatit.setBackground(new java.awt.Color(102, 102, 255));
        btnZaplatit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnZaplatit.setForeground(new java.awt.Color(255, 255, 255));
        btnZaplatit.setText("ZAPLATIŤ");
        btnZaplatit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnZaplatitMouseReleased(evt);
            }
        });
        add(btnZaplatit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 250, -1));

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

        btnPridatSluzbu.setBackground(new java.awt.Color(102, 102, 255));
        btnPridatSluzbu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPridatSluzbu.setForeground(new java.awt.Color(255, 255, 255));
        btnPridatSluzbu.setText("Pridať službu");
        btnPridatSluzbu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPridatSluzbuMouseReleased(evt);
            }
        });
        add(btnPridatSluzbu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 270, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void listUbytovaniaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listUbytovaniaMouseReleased
        this.novy = false;
        this.controller.clearTempBooking();
        this.setModel();
    }//GEN-LAST:event_listUbytovaniaMouseReleased

    private void btnUlozitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUlozitMouseReleased
        this.updateModel(listUbytovania, this.controller.getUbytovania());
        this.clearUbytovanie();
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
        this.updateLabelsBasedOnTempReservation();
    }//GEN-LAST:event_btnPridatIzbuMouseReleased

    private void dcOdjazdPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcOdjazdPropertyChange
        int pocetDni = Utils.DAYS_BETWEEN(dcPrijazd.getDate(), dcOdjazd.getDate());
        this.controller.prepocitajCenu(pocetDni);
        this.updateLabelsBasedOnTempReservation();
    }//GEN-LAST:event_dcOdjazdPropertyChange

    private void btnZaplatitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnZaplatitMouseReleased
        Ubytovanie ubytovanie = listUbytovania.getSelectedValue();
        ViewUtils.showDialog(new PlatbaDialog(this.parent, true, ubytovanie, 1));
        this.refreshPane();
    }//GEN-LAST:event_btnZaplatitMouseReleased

    private void btnPridatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPridatMouseReleased
        this.naplnList(listRezervacii, this.controller.getRezervacie());
        ViewUtils.showDialog(dialogPridat);
    }//GEN-LAST:event_btnPridatMouseReleased

    private void btnPridatSluzbuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPridatSluzbuMouseReleased
        //TODO
    }//GEN-LAST:event_btnPridatSluzbuMouseReleased

    private void btnDialogPridatOkMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDialogPridatOkMouseReleased
        this.controller.setRezervacia(null);
        if (checkBNaZakladeR.isSelected()) {
            Rezervacia rezervacia = listRezervacii.getSelectedValue();
            if (rezervacia == null) {
                logger.info("Po kliknuti na button vytvorit ubytovanie na zaklade rezervacie nebola riadne zvolena rezervacia");
                JOptionPane.showMessageDialog(dialogPridat, "Prosim vyberte rezervaciu");
                return;
            }
            if (rezervacia.getStatus() != StatusRezervacie.POTVRDENA) {
                logger.info("Bola zvolena rezervacia, ktora nie je v statuse 'POTVRDENA'");
                JOptionPane.showMessageDialog(dialogPridat, "Ubytovanie je možné vytvoriť len na základe POTVRDENÝCH rezervácií (bola zaplatená zaloha).");
                return;
            }
            this.controller.setRezervacia(rezervacia);
            this.novy = false;
        } else {
            this.novy = true;
        }
        this.setModel();
        dialogPridat.setVisible(false);
        dialogPridat.dispose();
    }//GEN-LAST:event_btnDialogPridatOkMouseReleased

    private void checkBNaZakladeRMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBNaZakladeRMouseReleased
        if (checkBNaZakladeR.isSelected()) {
            listRezervacii.setEnabled(true);
        } else {
            listRezervacii.setEnabled(false);
        }
    }//GEN-LAST:event_checkBNaZakladeRMouseReleased

    @Override
    public void setModel() {
        Boolean zoznamJePrazdny = listUbytovania.getModel().getSize() == 0;
        if (this.controller.getRezervacia() == null && (zoznamJePrazdny || this.novy)) {
            this.clearUbytovanie();
            return;
        }
        Booking booking;
        this.novy = false;
        if (this.controller.getRezervacia() != null) {
            btnZaplatit.setEnabled(false);
            booking = this.controller.getRezervacia();
        } else {
            booking = listUbytovania.getSelectedValue();
            if (booking.getPlatba() == null) {
                btnZaplatit.setEnabled(true);
            } else {
                btnZaplatit.setEnabled(false);
            }
        }
        comboBoxZakaznik.setSelectedItem(booking.getZakaznik());
        dcPrijazd.setDate(booking.getPrijazd());
        dcOdjazd.setDate(booking.getOdjazd());
        labelDataPocetIzieb.setText(String.valueOf(booking.getIzby().size()));
        labelDataCena.setText(String.format("%.02f", booking.getCena()));
        if (booking.getZlava() != null) {
            labelDataZlava.setText(booking.getZlava().getNazov() + " - " + String.valueOf(booking.getZlava().getPercento() * 100));
        }else{
            labelDataZlava.setText("0");
        }
        this.naplnTabulkuIzieb(booking);
        this.resetBtns();
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
        this.controller.prepocitajCenu(pocetDni);
        this.updateLabelsBasedOnTempReservation();
        int res = JOptionPane.showConfirmDialog(this, "Prajete si ulozit ubytovanie?. Prosím skontrolujte vyplnené údaje", "CONFIRM", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_NO_OPTION) {
            return true;
        }
        return false;
    }

    @Override
    public void saveModel() {
        Zakaznik zakaznik = (Zakaznik) comboBoxZakaznik.getSelectedItem();
        Date datumPrijazdu = dcPrijazd.getDate();
        Date datumOdjazdu = dcOdjazd.getDate();
        int pocetDni = Utils.DAYS_BETWEEN(datumPrijazdu, datumOdjazdu);
        logger.info(String.format("Ukladam nove ubytovanie"));
        this.controller.saveUbytovanie(zakaznik, datumPrijazdu, datumOdjazdu, pocetDni);
        JOptionPane.showMessageDialog(this, "Ubytovanie uložené", "SUCESS", JOptionPane.INFORMATION_MESSAGE);
        this.novy = false;
    }

    private void resetBtns() {
        if (this.novy == false) {
            comboBoxZakaznik.setEnabled(false);
            btnPridatIzbu.setEnabled(false);
            btnUlozit.setEnabled(false);
            dcOdjazd.setEnabled(false);
        } else {
            comboBoxZakaznik.setEnabled(true);
            btnPridatIzbu.setEnabled(true);
            btnUlozit.setEnabled(true);
            dcOdjazd.setEnabled(true);
        }
        if (this.controller.getRezervacia() != null) {
            btnUlozit.setEnabled(true);
        }
    }

    private void naplnTabulkuIzieb(Booking booking) {
        DefaultTableModel model = (DefaultTableModel) tableIzby.getModel();
        model.setRowCount(0);
        ArrayList<Izba> izby = booking.getIzby();
        for (Izba izba : izby) {
            model.addRow(new Object[]{
                izba,
                izba.getOznacenie(),
                String.format("%.02f", izba.getCena())
            });
        }
    }

    private void clearUbytovanie() {
        if (Database.getInstance().getAppTime() != null) {
            this.resetTime();
            DefaultTableModel model = (DefaultTableModel) tableIzby.getModel();
            model.setRowCount(0);
            btnZaplatit.setEnabled(false);
        }
        this.controller.clearTempBooking();
        this.updateLabelsBasedOnTempReservation();
        this.resetBtns();
    }

    private void updateLabelsBasedOnTempReservation() {
        if (this.controller.getRezervacia() != null) {
            return;
        }
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

    private void nastavComboBoxZakaznikov() {
        DefaultComboBoxModel<Zakaznik> model = (DefaultComboBoxModel) comboBoxZakaznik.getModel();
        model.removeAllElements();
        for (Zakaznik zakaznik : this.controller.getZakaznici()) {
            model.addElement(zakaznik);
        }
    }

    private void resetTime() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(Database.getInstance().getAppTime());
        dcPrijazd.setDate(cal.getTime());
        cal.add(Calendar.DATE, 1);
        dcOdjazd.setDate(cal.getTime());
        dcOdjazd.setMinSelectableDate(cal.getTime());
    }

    @Override
    public void refreshPane() {
        dcOdjazd.setMinSelectableDate(Database.getInstance().getAppTime());
        this.nastavComboBoxZakaznikov();
        this.clearUbytovanie();
        this.refreshModel(listUbytovania, this.controller.getUbytovania());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDialogPridatOk;
    private javax.swing.JButton btnPridat;
    private javax.swing.JButton btnPridatIzbu;
    private javax.swing.JButton btnPridatSluzbu;
    private javax.swing.JButton btnUlozit;
    private javax.swing.JButton btnZaplatit;
    private javax.swing.JCheckBox checkBNaZakladeR;
    private javax.swing.JComboBox<Zakaznik> comboBoxZakaznik;
    private com.toedter.calendar.JDateChooser dcOdjazd;
    private com.toedter.calendar.JDateChooser dcPrijazd;
    private javax.swing.JDialog dialogPridat;
    private javax.swing.JPanel dialogPridatMainPane;
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
    private javax.swing.JList<Rezervacia> listRezervacii;
    private javax.swing.JList<Ubytovanie> listUbytovania;
    private javax.swing.JScrollPane scrollPaneIzby;
    private javax.swing.JScrollPane scrollPaneRez;
    private javax.swing.JScrollPane scrollPaneRezervacie;
    private javax.swing.JSeparator separatorCena;
    private javax.swing.JSeparator separatorIzieb;
    private javax.swing.JSeparator separatorZlava;
    private javax.swing.JTable tableIzby;
    // End of variables declaration//GEN-END:variables

}
