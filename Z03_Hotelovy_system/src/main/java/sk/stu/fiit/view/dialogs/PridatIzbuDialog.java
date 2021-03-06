package sk.stu.fiit.view.dialogs;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sk.stu.fiit.controller.BookingController;
import sk.stu.fiit.model.Izba;
import sk.stu.fiit.utils.ViewUtils;

/**
 *
 * @author Martin Melisek
 */
@SuppressWarnings("unchecked")
public class PridatIzbuDialog extends javax.swing.JDialog {

    private BookingController controller;
    private Izba zvolenaIzba;
    private JFrame parent;
    private Date prijazd;
    private Date odjazd;

    public PridatIzbuDialog(java.awt.Frame parent, boolean modal, BookingController controller, Date prijazd, Date odjazd) {
        super(parent, modal);
        this.parent = (JFrame) parent;
        this.controller = controller;
        this.prijazd = prijazd;
        this.odjazd = odjazd;
        initComponents();
        this.naplnTabulku();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPaneIzby = new javax.swing.JScrollPane();
        tableIzby = new javax.swing.JTable();
        labelZoznam = new javax.swing.JLabel();
        btnPridat = new javax.swing.JButton();
        btnGaleria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pridat izbu");
        setPreferredSize(new java.awt.Dimension(720, 415));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableIzby.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kategória", "Izba", "Popis", "Počet lôžok", "Cena"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneIzby.setViewportView(tableIzby);

        getContentPane().add(scrollPaneIzby, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 630, 220));

        labelZoznam.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelZoznam.setText("Zoznam dostupných izieb");
        getContentPane().add(labelZoznam, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btnPridat.setBackground(new java.awt.Color(51, 153, 0));
        btnPridat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPridat.setForeground(new java.awt.Color(255, 255, 255));
        btnPridat.setText("PRIDAŤ");
        btnPridat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPridatMouseReleased(evt);
            }
        });
        getContentPane().add(btnPridat, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        btnGaleria.setBackground(new java.awt.Color(102, 102, 255));
        btnGaleria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGaleria.setForeground(new java.awt.Color(255, 255, 255));
        btnGaleria.setText("Galéria");
        btnGaleria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnGaleriaMouseReleased(evt);
            }
        });
        getContentPane().add(btnGaleria, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGaleriaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGaleriaMouseReleased
        int row = tableIzby.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Prosím vyberte izbu.");
            return;
        }
        Izba zobrazovanaIzba = (Izba) ((DefaultTableModel) tableIzby.getModel()).getValueAt(row, 0);
        if (zobrazovanaIzba.getGaleria().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tato izba nema ziadne fotky v galerii");
            return;
        }
        ViewUtils.showDialog(new GaleriaIzbyDialog(this.parent, true, zobrazovanaIzba.getGaleria()));

    }//GEN-LAST:event_btnGaleriaMouseReleased

    private void btnPridatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPridatMouseReleased
        int row = tableIzby.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Prosím vyberte izbu.");
            return;
        }
        this.zvolenaIzba = (Izba) ((DefaultTableModel) tableIzby.getModel()).getValueAt(row, 0);
        this.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPridatMouseReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.zvolenaIzba = null;
    }//GEN-LAST:event_formWindowClosing

    private void naplnTabulku() {
        DefaultTableModel model = (DefaultTableModel) tableIzby.getModel();
        ArrayList<Izba> dostupneIzby = this.controller.getDostupneIzby(this.prijazd, this.odjazd);
        for (Izba izba : dostupneIzby) {
            boolean jeIzbaUzPridana = this.controller.getPridavaneIzby().contains(izba);
            if (jeIzbaUzPridana) {
                continue;
            }
            model.addRow(new Object[]{
                izba,
                izba.getOznacenie(),
                izba.getPopis(),
                izba.getPocetLozok(),
                String.format("%.02f", izba.getCena())
            });
        }
    }

    public Izba showDialog() {
        ViewUtils.showDialog(this);
        return this.zvolenaIzba;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGaleria;
    private javax.swing.JButton btnPridat;
    private javax.swing.JLabel labelZoznam;
    private javax.swing.JScrollPane scrollPaneIzby;
    private javax.swing.JTable tableIzby;
    // End of variables declaration//GEN-END:variables
}
