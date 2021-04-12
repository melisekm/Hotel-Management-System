package sk.stu.fiit.view;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;
import javax.swing.Timer;
import org.slf4j.LoggerFactory;
import sk.stu.fiit.database.Database;

/**
 *
 * @author Martin Melisek
 */
public class MainScreen extends javax.swing.JFrame {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MainScreen.class);

    final DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

    private Timer timer;

    public MainScreen() {
        initComponents();
        this.timeSetup(new Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        cardPane = new javax.swing.JPanel();
        domovPane = new sk.stu.fiit.view.panes.DomovPane();
        zakazniciPane = new sk.stu.fiit.view.panes.ZakazniciPane();
        sluzbyPane = new sk.stu.fiit.view.panes.SluzbyPane();
        rezervaciePane = new sk.stu.fiit.view.panes.RezervaciePane();
        izbyPane = new sk.stu.fiit.view.panes.IzbyPane();
        ubytovaniaPane = new sk.stu.fiit.view.panes.UbytovaniaPane();
        menuPane = new javax.swing.JPanel();
        btnDomov = new javax.swing.JButton();
        btnZakaznici = new javax.swing.JButton();
        btnRezervacie = new javax.swing.JButton();
        labelDatum = new javax.swing.JLabel();
        labelCas = new javax.swing.JLabel();
        btnUbytovania = new javax.swing.JButton();
        btnIzby = new javax.swing.JButton();
        btnSluzby = new javax.swing.JButton();
        labelIconSK = new javax.swing.JLabel();
        labelIconUSA = new javax.swing.JLabel();
        grayPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotelový systém");
        setMinimumSize(new java.awt.Dimension(430, 530));
        setPreferredSize(new java.awt.Dimension(1140, 540));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardPane.setMinimumSize(new java.awt.Dimension(1200, 530));
        cardPane.setPreferredSize(new java.awt.Dimension(1200, 530));
        cardPane.setLayout(new java.awt.CardLayout());
        cardPane.add(domovPane, "DOMOV");
        cardPane.add(zakazniciPane, "ZAKAZNICI");
        cardPane.add(sluzbyPane, "SLUZBY");
        cardPane.add(rezervaciePane, "REZERVACIE");
        cardPane.add(izbyPane, "IZBY");
        cardPane.add(ubytovaniaPane, "UBYTOVANIA");

        getContentPane().add(cardPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 1170, -1));

        menuPane.setBackground(new java.awt.Color(153, 153, 153));
        menuPane.setLayout(new java.awt.GridBagLayout());

        btnDomov.setBackground(new java.awt.Color(102, 102, 255));
        btnDomov.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDomov.setForeground(new java.awt.Color(255, 255, 255));
        btnDomov.setText("Domov");
        btnDomov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDomovMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        menuPane.add(btnDomov, gridBagConstraints);

        btnZakaznici.setBackground(new java.awt.Color(102, 102, 255));
        btnZakaznici.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnZakaznici.setForeground(new java.awt.Color(255, 255, 255));
        btnZakaznici.setText("Zákazníci");
        btnZakaznici.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnZakazniciMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        menuPane.add(btnZakaznici, gridBagConstraints);

        btnRezervacie.setBackground(new java.awt.Color(102, 102, 255));
        btnRezervacie.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRezervacie.setForeground(new java.awt.Color(255, 255, 255));
        btnRezervacie.setText("Rezervácie");
        btnRezervacie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRezervacieMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        menuPane.add(btnRezervacie, gridBagConstraints);

        labelDatum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDatum.setForeground(new java.awt.Color(0, 0, 0));
        labelDatum.setText("datum");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        menuPane.add(labelDatum, gridBagConstraints);

        labelCas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelCas.setForeground(new java.awt.Color(0, 0, 0));
        labelCas.setText("cas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        menuPane.add(labelCas, gridBagConstraints);

        btnUbytovania.setBackground(new java.awt.Color(102, 102, 255));
        btnUbytovania.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUbytovania.setForeground(new java.awt.Color(255, 255, 255));
        btnUbytovania.setText("Ubytovania");
        btnUbytovania.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUbytovaniaMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        menuPane.add(btnUbytovania, gridBagConstraints);

        btnIzby.setBackground(new java.awt.Color(102, 102, 255));
        btnIzby.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnIzby.setForeground(new java.awt.Color(255, 255, 255));
        btnIzby.setText("Izby");
        btnIzby.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnIzbyMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        menuPane.add(btnIzby, gridBagConstraints);

        btnSluzby.setBackground(new java.awt.Color(102, 102, 255));
        btnSluzby.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSluzby.setForeground(new java.awt.Color(255, 255, 255));
        btnSluzby.setText("Služby");
        btnSluzby.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSluzbyMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        menuPane.add(btnSluzby, gridBagConstraints);

        labelIconSK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelIconSK.setForeground(new java.awt.Color(0, 0, 0));
        labelIconSK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sk/stu/fiit/view/assets/sk.png"))); // NOI18N
        labelIconSK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labelIconSKMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        menuPane.add(labelIconSK, gridBagConstraints);

        labelIconUSA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelIconUSA.setForeground(new java.awt.Color(0, 0, 0));
        labelIconUSA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sk/stu/fiit/view/assets/usa.png"))); // NOI18N
        labelIconUSA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labelIconUSAMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        menuPane.add(labelIconUSA, gridBagConstraints);

        getContentPane().add(menuPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 420));

        grayPane.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout grayPaneLayout = new javax.swing.GroupLayout(grayPane);
        grayPane.setLayout(grayPaneLayout);
        grayPaneLayout.setHorizontalGroup(
            grayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        grayPaneLayout.setVerticalGroup(
            grayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(grayPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 150, 120));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnDomovMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDomovMouseReleased
        switchScene("DOMOV", domovPane);
    }//GEN-LAST:event_btnDomovMouseReleased

    private void btnZakazniciMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnZakazniciMouseReleased
        switchScene("ZAKAZNICI", zakazniciPane);
    }//GEN-LAST:event_btnZakazniciMouseReleased

    private void btnUbytovaniaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbytovaniaMouseReleased
        switchScene("UBYTOVANIA", ubytovaniaPane);
    }//GEN-LAST:event_btnUbytovaniaMouseReleased

    private void btnRezervacieMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRezervacieMouseReleased
        switchScene("REZERVACIE", rezervaciePane);
    }//GEN-LAST:event_btnRezervacieMouseReleased

    private void btnIzbyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIzbyMouseReleased
        switchScene("IZBY", izbyPane);
    }//GEN-LAST:event_btnIzbyMouseReleased

    private void btnSluzbyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSluzbyMouseReleased
        switchScene("SLUZBY", sluzbyPane);
    }//GEN-LAST:event_btnSluzbyMouseReleased

    private void labelIconSKMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIconSKMouseReleased
        logger.info("Prepinam jazyk na slovencinu.");
        Database.getInstance().setBundle("sk_SK");
        domovPane.reInternationalize();
        this.reInternationalize();
    }//GEN-LAST:event_labelIconSKMouseReleased

    private void labelIconUSAMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIconUSAMouseReleased
        logger.info("Prepinam jazyk na anglicitnu.");
        Database.getInstance().setBundle("en_US");
        domovPane.reInternationalize();
        this.reInternationalize();
    }//GEN-LAST:event_labelIconUSAMouseReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        logger.info("Closing app..\n");
    }//GEN-LAST:event_formWindowClosing

    private void reInternationalize() {
        String bundleLoc = Database.getInstance().getBundle();
        ResourceBundle r = ResourceBundle.getBundle(bundleLoc);
        this.setTitle(r.getString("MainScreen.title"));
        btnDomov.setText(r.getString("MainScreen.btnDomov.text"));
        btnRezervacie.setText(r.getString("MainScreen.btnRezervacie.text"));
        btnZakaznici.setText(r.getString("MainScreen.btnZakaznici.text"));
        btnUbytovania.setText(r.getString("MainScreen.btnUbytovania.text"));
        btnSluzby.setText(r.getString("MainScreen.btnSluzby.text"));
        btnIzby.setText(r.getString("MainScreen.btnIzby.text"));
        this.timeSetup(Database.getInstance().getAppTime());
    }

    private void switchScene(String scene, IViewRefresh pane) {
        CardLayout cl = (CardLayout) (cardPane.getLayout());
        pane.refreshPane();
        cl.show(cardPane, scene);
    }

    public void timeSetup(Date date) {
        logger.info("Nastavujem cas v aplikacii - " + date.toString());
        if (this.timer != null) {
            this.timer.stop();
        }
        this.timer = new Timer(1000, new TimeActionListener(date));
        this.timer.setInitialDelay(0);
        this.timer.start();
    }

    private class TimeActionListener implements ActionListener {

        final DateFormat dateFormat = new SimpleDateFormat(java.util.ResourceBundle.getBundle(Database.getInstance().getBundle()).getString("DD.MM.YYYY"));

        private Calendar cal = Calendar.getInstance();

        public TimeActionListener(Date time) {
            Database.getInstance().setAppTime(time);
            cal.setTime(time);
        }

        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            now.setTime(new Date());
            now.set(Calendar.DATE, this.cal.get(Calendar.DATE));
            now.set(Calendar.MONTH, this.cal.get(Calendar.MONTH));
            now.set(Calendar.YEAR, this.cal.get(Calendar.YEAR));
            Date time = now.getTime();
            String datum = dateFormat.format(time);
            String cas = timeFormat.format(time);
            labelDatum.setText(datum);
            labelCas.setText(cas);
            Database.getInstance().setAppTime(time);
        }
    }

    public static void main() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDomov;
    private javax.swing.JButton btnIzby;
    private javax.swing.JButton btnRezervacie;
    private javax.swing.JButton btnSluzby;
    private javax.swing.JButton btnUbytovania;
    private javax.swing.JButton btnZakaznici;
    private javax.swing.JPanel cardPane;
    private sk.stu.fiit.view.panes.DomovPane domovPane;
    private javax.swing.JPanel grayPane;
    private sk.stu.fiit.view.panes.IzbyPane izbyPane;
    private javax.swing.JLabel labelCas;
    private javax.swing.JLabel labelDatum;
    private javax.swing.JLabel labelIconSK;
    private javax.swing.JLabel labelIconUSA;
    private javax.swing.JPanel menuPane;
    private sk.stu.fiit.view.panes.RezervaciePane rezervaciePane;
    private sk.stu.fiit.view.panes.SluzbyPane sluzbyPane;
    private sk.stu.fiit.view.panes.UbytovaniaPane ubytovaniaPane;
    private sk.stu.fiit.view.panes.ZakazniciPane zakazniciPane;
    // End of variables declaration//GEN-END:variables
}
