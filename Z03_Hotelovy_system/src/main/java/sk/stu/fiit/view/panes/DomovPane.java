package sk.stu.fiit.view.panes;

import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import sk.stu.fiit.controller.DomovController;
import sk.stu.fiit.database.Database;
import sk.stu.fiit.utils.ViewUtils;
import sk.stu.fiit.view.IViewRefresh;
import sk.stu.fiit.view.MainScreen;
import sk.stu.fiit.view.dialogs.IOManagerDialog;

/**
 *
 * @author Martin Melisek
 */
public class DomovPane extends javax.swing.JPanel implements IViewRefresh {

    private DomovController controller = new DomovController();

    public DomovPane() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnTimeSetup = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnIO = new javax.swing.JButton();
        dcTimeTravel = new com.toedter.calendar.JDateChooser();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Štatistiky");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 177, -1, -1));

        btnTimeSetup.setText("Nastavenie času");
        btnTimeSetup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTimeSetupMouseReleased(evt);
            }
        });
        add(btnTimeSetup, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        jButton2.setText("Nastavenie Jazyka");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        btnIO.setText("Načítavanie a ukladanie údajov...");
        btnIO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnIOMouseReleased(evt);
            }
        });
        add(btnIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));
        add(dcTimeTravel, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 290, 130, 22));
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
    }//GEN-LAST:event_btnIOMouseReleased

    @Override
    public void refreshPane() {
        System.out.println("TATO METODA NIEJE IMPLEMENTOVANA"); //TODO
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIO;
    private javax.swing.JButton btnTimeSetup;
    private com.toedter.calendar.JDateChooser dcTimeTravel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
