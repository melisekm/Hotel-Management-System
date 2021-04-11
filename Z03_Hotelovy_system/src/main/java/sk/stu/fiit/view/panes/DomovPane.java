package sk.stu.fiit.view.panes;

import java.util.Date;
import java.util.ResourceBundle;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import sk.stu.fiit.controller.DomovController;
import sk.stu.fiit.database.Database;
import sk.stu.fiit.utils.ViewUtils;
import sk.stu.fiit.view.charts.BarPieChartFactory;
import sk.stu.fiit.view.IViewRefresh;
import sk.stu.fiit.view.MainScreen;
import sk.stu.fiit.view.dialogs.IOManagerDialog;

/**
 *
 * @author Martin Melisek
 */
public class DomovPane extends javax.swing.JPanel implements IViewRefresh {

    private DomovController controller = new DomovController();
    private JPanel prijmyPanel;
    private JPanel rezervaciePanel;
    private JLabel[] statistikyLabels;

    public DomovPane() {
        initComponents();
        this.statistikyLabels = new JLabel[]{
            labelDataIzby, labelDataRezervacie, labelDataSluzby,
            labelDataUbytovania, labelDataZakaznici, labelPrijmy
        };
        barChartDesignPane.setVisible(false);
        pieChartDesignPane.setVisible(false);
        this.setChart("BAR");
        this.setChart("PIE");
        this.setLabels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator6 = new javax.swing.JSeparator();
        btnTimeSetup = new javax.swing.JButton();
        btnIO = new javax.swing.JButton();
        dcTimeTravel = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        barChartDesignPane = new javax.swing.JPanel();
        labelDetaily = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        labelPocetIzieb = new javax.swing.JLabel();
        labelPocetZakaznikov = new javax.swing.JLabel();
        labelPocetUbytovani = new javax.swing.JLabel();
        labelPocetSluzieb = new javax.swing.JLabel();
        labelDataIzby = new javax.swing.JLabel();
        labelDataSluzby = new javax.swing.JLabel();
        labelDataZakaznici = new javax.swing.JLabel();
        labelDataUbytovania = new javax.swing.JLabel();
        labelRezervacie = new javax.swing.JLabel();
        labelDataRezervacie = new javax.swing.JLabel();
        labelPrijmy = new javax.swing.JLabel();
        pieChartDesignPane = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1010, 10));

        btnTimeSetup.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("sk/stu/fiit/view/Bundle_sk_SK"); // NOI18N
        btnTimeSetup.setText(bundle.getString("DomovPane.btnTimeSetup.text")); // NOI18N
        btnTimeSetup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTimeSetupMouseReleased(evt);
            }
        });
        add(btnTimeSetup, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 160, -1));

        btnIO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnIO.setText(bundle.getString("DomovPane.btnIO.text")); // NOI18N
        btnIO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnIOMouseReleased(evt);
            }
        });
        add(btnIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, -1, -1));
        add(dcTimeTravel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 130, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 1010, 10));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 431, 10, 70));

        barChartDesignPane.setBackground(new java.awt.Color(153, 153, 153));
        barChartDesignPane.setEnabled(false);
        barChartDesignPane.setPreferredSize(new java.awt.Dimension(380, 360));

        javax.swing.GroupLayout barChartDesignPaneLayout = new javax.swing.GroupLayout(barChartDesignPane);
        barChartDesignPane.setLayout(barChartDesignPaneLayout);
        barChartDesignPaneLayout.setHorizontalGroup(
            barChartDesignPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        barChartDesignPaneLayout.setVerticalGroup(
            barChartDesignPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        add(barChartDesignPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 360));

        labelDetaily.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelDetaily.setText(bundle.getString("DomovPane.labelDetaily.text")); // NOI18N
        add(labelDetaily, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 80, -1));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, -10, 10, 540));

        labelPocetIzieb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPocetIzieb.setText(bundle.getString("DomovPane.labelPocetIzieb.text")); // NOI18N
        add(labelPocetIzieb, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 240, -1));

        labelPocetZakaznikov.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPocetZakaznikov.setText(bundle.getString("DomovPane.labelPocetZakaznikov.text")); // NOI18N
        add(labelPocetZakaznikov, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 270, -1));

        labelPocetUbytovani.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPocetUbytovani.setText(bundle.getString("DomovPane.labelPocetUbytovani.text")); // NOI18N
        add(labelPocetUbytovani, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 240, -1));

        labelPocetSluzieb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPocetSluzieb.setText(bundle.getString("DomovPane.labelPocetSluzieb.text")); // NOI18N
        add(labelPocetSluzieb, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 220, -1));

        labelDataIzby.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataIzby.setText(bundle.getString("DomovPane.labelDataIzby.text")); // NOI18N
        add(labelDataIzby, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 80, 150, -1));

        labelDataSluzby.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataSluzby.setText(bundle.getString("DomovPane.labelDataSluzby.text")); // NOI18N
        add(labelDataSluzby, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 150, -1));

        labelDataZakaznici.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataZakaznici.setText(bundle.getString("DomovPane.labelDataZakaznici.text")); // NOI18N
        add(labelDataZakaznici, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 180, 150, -1));

        labelDataUbytovania.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataUbytovania.setText(bundle.getString("DomovPane.labelDataUbytovania.text")); // NOI18N
        add(labelDataUbytovania, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 230, 150, -1));

        labelRezervacie.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelRezervacie.setText(bundle.getString("DomovPane.labelRezervacie.text")); // NOI18N
        add(labelRezervacie, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 220, -1));

        labelDataRezervacie.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataRezervacie.setText(bundle.getString("DomovPane.labelDataRezervacie.text")); // NOI18N
        add(labelDataRezervacie, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, 150, -1));

        labelPrijmy.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelPrijmy.setText(bundle.getString("DomovPane.labelPrijmy.text")); // NOI18N
        add(labelPrijmy, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 300, -1));

        pieChartDesignPane.setBackground(new java.awt.Color(153, 153, 153));
        pieChartDesignPane.setEnabled(false);
        pieChartDesignPane.setPreferredSize(new java.awt.Dimension(380, 360));

        javax.swing.GroupLayout pieChartDesignPaneLayout = new javax.swing.GroupLayout(pieChartDesignPane);
        pieChartDesignPane.setLayout(pieChartDesignPaneLayout);
        pieChartDesignPaneLayout.setHorizontalGroup(
            pieChartDesignPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        pieChartDesignPaneLayout.setVerticalGroup(
            pieChartDesignPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        add(pieChartDesignPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 300, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimeSetupMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimeSetupMouseReleased
        Date d = dcTimeTravel.getDate();
        if (d == null) {
            JOptionPane.showMessageDialog(this, java.util.ResourceBundle.getBundle(Database.getInstance().getBundle()).getString("ZADAJTE CAS"));
            return;
        }
        MainScreen parent = (MainScreen) SwingUtilities.getAncestorOfClass(MainScreen.class, this);
        parent.timeSetup(d);
        this.controller.vykonajCasoveZmeny();
        this.refreshPane();
    }//GEN-LAST:event_btnTimeSetupMouseReleased

    private void btnIOMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIOMouseReleased
        ViewUtils.showDialog(new IOManagerDialog((JFrame) SwingUtilities.getWindowAncestor(this), true));
        MainScreen parent = (MainScreen) SwingUtilities.getAncestorOfClass(MainScreen.class, this);
        parent.timeSetup(Database.getInstance().getAppTime());
        this.controller.vykonajCasoveZmeny();
        this.refreshPane();
    }//GEN-LAST:event_btnIOMouseReleased

    private void setChart(String type) {
        BarPieChartFactory factory = new BarPieChartFactory();
        if ("BAR".equals(type)) { //NOI18N
            prijmyPanel = factory.createChart(type, java.util.ResourceBundle.getBundle(Database.getInstance().getBundle()).getString("PRÍJMY"), this.controller.getPrijmyDataset());
            prijmyPanel.setPreferredSize(new java.awt.Dimension(460, 360));
            add(prijmyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 360));
        } else if ("PIE".equals(type)) { //NOI18N
            rezervaciePanel = factory.createChart(type, java.util.ResourceBundle.getBundle(Database.getInstance().getBundle()).getString("REZERVÁCIE"), this.controller.getRezervacieDataset());
            rezervaciePanel.setPreferredSize(new java.awt.Dimension(300, 360));
            add(rezervaciePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 300, 360));
        }
    }

    private void setLabels() {
        String[] labelData = this.controller.getStatistiky();
        for (int i = 0; i < labelData.length; i++) {
            this.statistikyLabels[i].setText(labelData[i]);
        }
    }
    
    public void reInternationalize(){
        String bundleLoc = Database.getInstance().getBundle();
        ResourceBundle r = ResourceBundle.getBundle(bundleLoc);
        btnIO.setText(r.getString("DomovPane.btnIO.text"));
        btnTimeSetup.setText(r.getString("DomovPane.btnTimeSetup.text"));
        labelRezervacie.setText(r.getString("DomovPane.labelRezervacie.text"));
        labelPocetSluzieb.setText(r.getString("DomovPane.labelPocetSluzieb.text"));
        labelPocetUbytovani.setText(r.getString("DomovPane.labelPocetUbytovani.text"));
        labelPocetZakaznikov.setText(r.getString("DomovPane.labelPocetZakaznikov.text"));
        labelPocetIzieb.setText(r.getString("DomovPane.labelPocetIzieb.text"));
        labelDetaily.setText(r.getString("DomovPane.labelDetaily.text"));
        this.refreshPane();
    }

    @Override
    public void refreshPane() {
        this.remove(prijmyPanel);
        this.remove(rezervaciePanel);
        this.revalidate();
        this.setChart("BAR"); //NOI18N
        this.setChart("PIE"); //NOI18N
        this.setLabels();
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barChartDesignPane;
    private javax.swing.JButton btnIO;
    private javax.swing.JButton btnTimeSetup;
    private com.toedter.calendar.JDateChooser dcTimeTravel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel labelDataIzby;
    private javax.swing.JLabel labelDataRezervacie;
    private javax.swing.JLabel labelDataSluzby;
    private javax.swing.JLabel labelDataUbytovania;
    private javax.swing.JLabel labelDataZakaznici;
    private javax.swing.JLabel labelDetaily;
    private javax.swing.JLabel labelPocetIzieb;
    private javax.swing.JLabel labelPocetSluzieb;
    private javax.swing.JLabel labelPocetUbytovani;
    private javax.swing.JLabel labelPocetZakaznikov;
    private javax.swing.JLabel labelPrijmy;
    private javax.swing.JLabel labelRezervacie;
    private javax.swing.JPanel pieChartDesignPane;
    // End of variables declaration//GEN-END:variables

}
