package sk.stu.fiit.view.panes;

import java.util.Date;
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
    private JPanel chartPanel;
    private JLabel[] statistikyLabels;

    public DomovPane() {
        initComponents();
        this.statistikyLabels = new JLabel[]{
            labelDataIzby, labelDataRezervacie, labelDataSluzby,
            labelDataUbytovania, labelDataZakaznici, labelPrijmy
        };
        this.setPrijmyChart();
        this.setLabels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTimeSetup = new javax.swing.JButton();
        btnJazyk = new javax.swing.JButton();
        btnIO = new javax.swing.JButton();
        dcTimeTravel = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        pieDesignPanel = new javax.swing.JPanel();
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
        jSeparator6 = new javax.swing.JSeparator();
        labelRezervacie = new javax.swing.JLabel();
        labelDataRezervacie = new javax.swing.JLabel();
        labelPrijmy = new javax.swing.JLabel();
        btnGrafy = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTimeSetup.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTimeSetup.setText("Nastavenie času");
        btnTimeSetup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTimeSetupMouseReleased(evt);
            }
        });
        add(btnTimeSetup, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        btnJazyk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnJazyk.setText("Nastavenie Jazyka");
        add(btnJazyk, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        btnIO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnIO.setText("Načítavanie a ukladanie údajov...");
        btnIO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnIOMouseReleased(evt);
            }
        });
        add(btnIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, -1, -1));
        add(dcTimeTravel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 130, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 880, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 10, 60));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 10, 60));

        pieDesignPanel.setBackground(new java.awt.Color(153, 153, 153));
        pieDesignPanel.setEnabled(false);
        pieDesignPanel.setPreferredSize(new java.awt.Dimension(380, 360));

        javax.swing.GroupLayout pieDesignPanelLayout = new javax.swing.GroupLayout(pieDesignPanel);
        pieDesignPanel.setLayout(pieDesignPanelLayout);
        pieDesignPanelLayout.setHorizontalGroup(
            pieDesignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        pieDesignPanelLayout.setVerticalGroup(
            pieDesignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        add(pieDesignPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 360));

        labelDetaily.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDetaily.setText("Detaily");
        add(labelDetaily, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 10, 330));

        labelPocetIzieb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPocetIzieb.setText("Počet izieb");
        add(labelPocetIzieb, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 310, -1));

        labelPocetZakaznikov.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPocetZakaznikov.setText("Počet zákazníkov");
        add(labelPocetZakaznikov, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 340, -1));

        labelPocetUbytovani.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPocetUbytovani.setText("Počet ubytovaní");
        add(labelPocetUbytovani, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 310, -1));

        labelPocetSluzieb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPocetSluzieb.setText("Počet služieb");
        add(labelPocetSluzieb, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 290, -1));

        labelDataIzby.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataIzby.setText("40");
        add(labelDataIzby, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 150, -1));

        labelDataSluzby.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataSluzby.setText("40");
        add(labelDataSluzby, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 150, -1));

        labelDataZakaznici.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataZakaznici.setText("40");
        add(labelDataZakaznici, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 150, -1));

        labelDataUbytovania.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataUbytovania.setText("40");
        add(labelDataUbytovania, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, 150, -1));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 570, 10));

        labelRezervacie.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelRezervacie.setText("Počet rezervácií");
        add(labelRezervacie, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 290, -1));

        labelDataRezervacie.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataRezervacie.setText("40");
        add(labelDataRezervacie, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 150, -1));

        labelPrijmy.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelPrijmy.setText("Príjmy celkovo: 8000€");
        add(labelPrijmy, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        btnGrafy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGrafy.setText("Viac grafov");
        add(btnGrafy, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimeSetupMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimeSetupMouseReleased
        Date d = dcTimeTravel.getDate();
        if (d == null) {
            JOptionPane.showMessageDialog(this, "Zadajte cas");
            return;
        }
        MainScreen parent = (MainScreen) SwingUtilities.getAncestorOfClass(MainScreen.class, this);
        parent.timeSetup(d);
        this.controller.vykonajCasoveZmeny();
    }//GEN-LAST:event_btnTimeSetupMouseReleased

    private void btnIOMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIOMouseReleased
        ViewUtils.showDialog(new IOManagerDialog((JFrame) SwingUtilities.getWindowAncestor(this), true));
        MainScreen parent = (MainScreen) SwingUtilities.getAncestorOfClass(MainScreen.class, this);
        parent.timeSetup(Database.getInstance().getAppTime());
        this.controller.vykonajCasoveZmeny();
        this.refreshPane();
    }//GEN-LAST:event_btnIOMouseReleased
    
    private void setPrijmyChart() {
        BarPieChartFactory factory = new BarPieChartFactory();
        chartPanel = factory.createChart("BAR", "Príjmy", this.controller.getPrijmyDataset());
        chartPanel.setPreferredSize(new java.awt.Dimension(380, 360));
        add(chartPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 360));
        pieDesignPanel.setVisible(false);
    }

    private void setLabels() {
        String[] labelData = this.controller.getStatistiky();
        for (int i = 0; i < labelData.length; i++) {
            this.statistikyLabels[i].setText(labelData[i]);
        }
    }

    @Override
    public void refreshPane() {
        this.remove(chartPanel);
        this.revalidate();
        //this.controller.vytvorDatasety();
        this.setPrijmyChart();
        this.setLabels();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrafy;
    private javax.swing.JButton btnIO;
    private javax.swing.JButton btnJazyk;
    private javax.swing.JButton btnTimeSetup;
    private com.toedter.calendar.JDateChooser dcTimeTravel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
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
    private javax.swing.JPanel pieDesignPanel;
    // End of variables declaration//GEN-END:variables

}
