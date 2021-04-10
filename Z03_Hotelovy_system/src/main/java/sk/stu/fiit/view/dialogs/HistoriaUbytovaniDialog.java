package sk.stu.fiit.view.dialogs;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.stu.fiit.model.Izba;
import sk.stu.fiit.model.Sluzba;
import sk.stu.fiit.model.Ubytovanie;
import sk.stu.fiit.utils.ViewUtils;

/**
 *
 * @author Martin Melisek
 */
public class HistoriaUbytovaniDialog extends javax.swing.JDialog {

    private static final Logger logger = LoggerFactory.getLogger(HistoriaUbytovaniDialog.class);

    public HistoriaUbytovaniDialog(java.awt.Frame parent, boolean modal, ArrayList<Ubytovanie> historia) {
        super(parent, modal);
        initComponents();
        this.naplnTabulkuUbytovani(historia);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogMain = new javax.swing.JDialog();
        mainUbytovaniePane = new javax.swing.JPanel();
        labelZiadneSluzby = new javax.swing.JLabel();
        labelDataUbytovanieId = new javax.swing.JLabel();
        scrollPaneIzby = new javax.swing.JScrollPane();
        listIzby = new javax.swing.JList<>();
        labelIzby = new javax.swing.JLabel();
        labelSluzby = new javax.swing.JLabel();
        scrollPaneSluzby = new javax.swing.JScrollPane();
        listSluzby = new javax.swing.JList<>();
        labelDataPrijazd = new javax.swing.JLabel();
        labelDataOdjazd = new javax.swing.JLabel();
        cbZaplatene = new javax.swing.JCheckBox();
        cbRezervacia = new javax.swing.JCheckBox();
        labelDataFormaPlatby = new javax.swing.JLabel();
        labelCena = new javax.swing.JLabel();
        labelSeparator = new javax.swing.JLabel();
        labelDataDenPlatby = new javax.swing.JLabel();
        labelDataCena = new javax.swing.JLabel();
        btnZavriet = new javax.swing.JButton();
        labelId = new javax.swing.JLabel();
        labelZakaznik = new javax.swing.JLabel();
        labelDataZakaznik = new javax.swing.JLabel();
        dialogHistoriaPane = new javax.swing.JPanel();
        labelHistoria = new javax.swing.JLabel();
        scrollPaneUbytovania = new javax.swing.JScrollPane();
        listUbytovania = new javax.swing.JList<>();
        btnHistoriaVybrat = new javax.swing.JButton();

        dialogMain.setTitle("Detaily ubytovania");
        dialogMain.setModal(true);
        dialogMain.setResizable(false);
        dialogMain.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainUbytovaniePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelZiadneSluzby.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        labelZiadneSluzby.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelZiadneSluzby.setText("Neboli nájdené žiadne služby");
        mainUbytovaniePane.add(labelZiadneSluzby, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 250, 70));

        labelDataUbytovanieId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataUbytovanieId.setText("Ubytovanie id");
        mainUbytovaniePane.add(labelDataUbytovanieId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        listIzby.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listIzby.setModel(new DefaultListModel<String>());
        listIzby.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPaneIzby.setViewportView(listIzby);

        mainUbytovaniePane.add(scrollPaneIzby, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 250, 160));

        labelIzby.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelIzby.setText("Izby");
        mainUbytovaniePane.add(labelIzby, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        labelSluzby.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelSluzby.setText("Služby");
        mainUbytovaniePane.add(labelSluzby, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        listSluzby.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listSluzby.setModel(new DefaultListModel<String>());
        listSluzby.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPaneSluzby.setViewportView(listSluzby);

        mainUbytovaniePane.add(scrollPaneSluzby, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 250, 160));

        labelDataPrijazd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataPrijazd.setText("14.3.2021");
        mainUbytovaniePane.add(labelDataPrijazd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        labelDataOdjazd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataOdjazd.setText("18.4.2021");
        mainUbytovaniePane.add(labelDataOdjazd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        cbZaplatene.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbZaplatene.setText("Zaplatené");
        cbZaplatene.setEnabled(false);
        cbZaplatene.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbZaplatene.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        mainUbytovaniePane.add(cbZaplatene, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 150, -1));

        cbRezervacia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbRezervacia.setText("cez Rezerváciu");
        cbRezervacia.setEnabled(false);
        cbRezervacia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cbRezervacia.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        mainUbytovaniePane.add(cbRezervacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        labelDataFormaPlatby.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataFormaPlatby.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDataFormaPlatby.setText("Forma");
        mainUbytovaniePane.add(labelDataFormaPlatby, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 130, -1));

        labelCena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelCena.setText("Cena:");
        mainUbytovaniePane.add(labelCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        labelSeparator.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelSeparator.setText("-");
        mainUbytovaniePane.add(labelSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 20, -1));

        labelDataDenPlatby.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataDenPlatby.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDataDenPlatby.setText("Den");
        mainUbytovaniePane.add(labelDataDenPlatby, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 130, 30));

        labelDataCena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataCena.setText("45.00€");
        mainUbytovaniePane.add(labelDataCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        btnZavriet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnZavriet.setText("Zavrieť");
        btnZavriet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnZavrietMouseReleased(evt);
            }
        });
        mainUbytovaniePane.add(btnZavriet, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        labelId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelId.setText("ID:");
        mainUbytovaniePane.add(labelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        labelZakaznik.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelZakaznik.setText("Zákazník:");
        mainUbytovaniePane.add(labelZakaznik, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        labelDataZakaznik.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataZakaznik.setText("Juraj Mäkký");
        mainUbytovaniePane.add(labelDataZakaznik, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        dialogMain.getContentPane().add(mainUbytovaniePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 370));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Historia ubytovani");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dialogHistoriaPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelHistoria.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelHistoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHistoria.setText("História ubytovaní");
        dialogHistoriaPane.add(labelHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 290, -1));

        listUbytovania.setModel(new DefaultListModel<Ubytovanie>());
        listUbytovania.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPaneUbytovania.setViewportView(listUbytovania);

        dialogHistoriaPane.add(scrollPaneUbytovania, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 290, 190));

        btnHistoriaVybrat.setBackground(new java.awt.Color(102, 102, 255));
        btnHistoriaVybrat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnHistoriaVybrat.setForeground(new java.awt.Color(255, 255, 255));
        btnHistoriaVybrat.setText("Vybrať");
        btnHistoriaVybrat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnHistoriaVybratMouseReleased(evt);
            }
        });
        dialogHistoriaPane.add(btnHistoriaVybrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 290, -1));

        getContentPane().add(dialogHistoriaPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHistoriaVybratMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoriaVybratMouseReleased
        Ubytovanie ubytovanie = listUbytovania.getSelectedValue();
        if (ubytovanie == null) {
            logger.info("Po otvoreni dialogu historie ubytovani nebolo zvolene ziadne ubytovanie");
            JOptionPane.showMessageDialog(this, "Prosím vyberte ubytovanie, ktoré chcete zobraziť");
            return;
        }
        labelDataUbytovanieId.setText(ubytovanie.getId());
        labelDataZakaznik.setText(ubytovanie.getZakaznik().getMeno());
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        if (ubytovanie.getPlatba() != null) {
            labelDataDenPlatby.setVisible(true);
            labelDataFormaPlatby.setVisible(true);
            cbZaplatene.setSelected(true);
            if (ubytovanie.getPlatba().isvHotovosti()) {
                labelDataFormaPlatby.setText("V hotovosti");
            } else {
                labelDataFormaPlatby.setText("Kreditná karta");
            }
            labelDataDenPlatby.setText(sdf.format(ubytovanie.getPlatba().getDatum()));
        } else {
            cbZaplatene.setSelected(false);
            labelDataDenPlatby.setVisible(false);
            labelDataFormaPlatby.setVisible(false);
        }
        if (ubytovanie.getRezervacia() != null) {
            cbRezervacia.setSelected(true);
        } else {
            cbRezervacia.setSelected(false);
        }
        labelDataCena.setText(String.format("%.02f€", ubytovanie.getCena()));
        labelDataOdjazd.setText(sdf.format(ubytovanie.getOdjazd()));
        labelDataPrijazd.setText(sdf.format(ubytovanie.getPrijazd()));

        DefaultListModel<String> model = (DefaultListModel<String>) listIzby.getModel();
        model.setSize(0);
        for (Izba izba : ubytovanie.getIzby()) {
            String format = izba.getKategoria() + " - " + izba.getOznacenie() + " - " + String.format("%.02f€", izba.getCena());
            model.addElement(format);
        }

        boolean existujeZoznamSluzieb = ubytovanie.getSluzby() != null;
        model = (DefaultListModel<String>) listSluzby.getModel();
        model.setSize(0);
        if (existujeZoznamSluzieb) {
            boolean zoznamSluziebNiejePrazdny = !ubytovanie.getSluzby().isEmpty();
            if (zoznamSluziebNiejePrazdny) {
                labelZiadneSluzby.setVisible(false);
                for (Sluzba sluzba : ubytovanie.getSluzby()) {
                    Date datumVyuzitia = sluzba.getVyuzitie().get(ubytovanie);
                    String format = sluzba.getNazov() + " - " + sdf.format(datumVyuzitia) + " - " + String.format("%.02f€", sluzba.getCena());
                    model.addElement(format);
                }
            }
        } else {
            labelZiadneSluzby.setVisible(true);
        }
        ViewUtils.showDialog(dialogMain);
    }//GEN-LAST:event_btnHistoriaVybratMouseReleased

    private void btnZavrietMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnZavrietMouseReleased
        dialogMain.setVisible(false);
        dialogMain.dispose();
    }//GEN-LAST:event_btnZavrietMouseReleased

    private void naplnTabulkuUbytovani(ArrayList<Ubytovanie> historia) {
        DefaultListModel model = (DefaultListModel) listUbytovania.getModel();
        model.setSize(0);
        for (Ubytovanie ubytovanie : historia) {
            model.addElement(ubytovanie);
        }
        listUbytovania.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistoriaVybrat;
    private javax.swing.JButton btnZavriet;
    private javax.swing.JCheckBox cbRezervacia;
    private javax.swing.JCheckBox cbZaplatene;
    private javax.swing.JPanel dialogHistoriaPane;
    private javax.swing.JDialog dialogMain;
    private javax.swing.JLabel labelCena;
    private javax.swing.JLabel labelDataCena;
    private javax.swing.JLabel labelDataDenPlatby;
    private javax.swing.JLabel labelDataFormaPlatby;
    private javax.swing.JLabel labelDataOdjazd;
    private javax.swing.JLabel labelDataPrijazd;
    private javax.swing.JLabel labelDataUbytovanieId;
    private javax.swing.JLabel labelDataZakaznik;
    private javax.swing.JLabel labelHistoria;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelIzby;
    private javax.swing.JLabel labelSeparator;
    private javax.swing.JLabel labelSluzby;
    private javax.swing.JLabel labelZakaznik;
    private javax.swing.JLabel labelZiadneSluzby;
    private javax.swing.JList<String> listIzby;
    private javax.swing.JList<String> listSluzby;
    private javax.swing.JList<Ubytovanie> listUbytovania;
    private javax.swing.JPanel mainUbytovaniePane;
    private javax.swing.JScrollPane scrollPaneIzby;
    private javax.swing.JScrollPane scrollPaneSluzby;
    private javax.swing.JScrollPane scrollPaneUbytovania;
    // End of variables declaration//GEN-END:variables
}
