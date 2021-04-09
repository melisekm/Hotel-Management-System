package sk.stu.fiit.view.dialogs;

import javax.swing.JOptionPane;
import sk.stu.fiit.controller.PlatbaController;
import sk.stu.fiit.model.IZaplatitelne;
import sk.stu.fiit.utils.ViewUtils;

/**
 *
 * @author Martin Melisek
 */
public class PlatbaDialog extends javax.swing.JDialog {

    private PlatbaController controller;
    
    /**
     * Dialogove okno platby
     * @param parent parentske okno
     * @param modal onTop
     * @param polozka co sa plati
     * @param percentualnaHodnota kolko % z ceny polozky sa plati eg. 1 - cela, 0.1 - 10%. 
     */
    public PlatbaDialog(java.awt.Frame parent, boolean modal, IZaplatitelne polozka, double percentualnaHodnota) {
        super(parent, modal);
        initComponents();
        this.controller = new PlatbaController(polozka);
        labelDataCena.setText(String.format("%.02f €", this.controller.getPolozka().getCena() * percentualnaHodnota));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPane = new javax.swing.JPanel();
        labelCVV = new javax.swing.JLabel();
        fieldCVV = new javax.swing.JTextField();
        labelCena = new javax.swing.JLabel();
        checkBoxHotovost = new javax.swing.JCheckBox();
        labelDataCena = new javax.swing.JLabel();
        btnZaplatit = new javax.swing.JButton();
        btnZrusit = new javax.swing.JButton();
        labelCisloKred = new javax.swing.JLabel();
        fieldCisloKred = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCVV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelCVV.setText("CVV:");
        mainPane.add(labelCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        fieldCVV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fieldCVV.setText("622");
        mainPane.add(fieldCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 70, -1));

        labelCena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelCena.setText("Cena:");
        mainPane.add(labelCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        checkBoxHotovost.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        checkBoxHotovost.setText("Hotovosť");
        checkBoxHotovost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                checkBoxHotovostMouseReleased(evt);
            }
        });
        mainPane.add(checkBoxHotovost, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        labelDataCena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataCena.setText("50€");
        mainPane.add(labelDataCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 250, -1));

        btnZaplatit.setBackground(new java.awt.Color(51, 153, 0));
        btnZaplatit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnZaplatit.setForeground(new java.awt.Color(255, 255, 255));
        btnZaplatit.setText("Zaplatiť");
        btnZaplatit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnZaplatitMouseReleased(evt);
            }
        });
        mainPane.add(btnZaplatit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        btnZrusit.setBackground(new java.awt.Color(255, 102, 102));
        btnZrusit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnZrusit.setForeground(new java.awt.Color(255, 255, 255));
        btnZrusit.setText("Zrušiť");
        btnZrusit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnZrusitMouseReleased(evt);
            }
        });
        mainPane.add(btnZrusit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 90, -1));

        labelCisloKred.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelCisloKred.setText("Číslo kreditnej karty:");
        mainPane.add(labelCisloKred, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        fieldCisloKred.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fieldCisloKred.setText("7684513");
        mainPane.add(fieldCisloKred, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 250, -1));

        getContentPane().add(mainPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxHotovostMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBoxHotovostMouseReleased
        if (checkBoxHotovost.isSelected()) {
            fieldCisloKred.setEnabled(false);
            fieldCVV.setEnabled(false);
        } else {
            fieldCisloKred.setEnabled(true);
            fieldCVV.setEnabled(true);
        }
    }//GEN-LAST:event_checkBoxHotovostMouseReleased

    private void btnZrusitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnZrusitMouseReleased
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnZrusitMouseReleased

    private void btnZaplatitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnZaplatitMouseReleased
        if (checkBoxHotovost.isSelected()) {
            if (!ViewUtils.validateFieldsNotBlank(this, fieldCisloKred, fieldCVV)) {
                JOptionPane.showMessageDialog(this, "Prosim vyplnte udaje kreditnej karty");
                return;
            }
        }
        this.controller.zaplatPolozku(checkBoxHotovost.isSelected());
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnZaplatitMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnZaplatit;
    private javax.swing.JButton btnZrusit;
    private javax.swing.JCheckBox checkBoxHotovost;
    private javax.swing.JTextField fieldCVV;
    private javax.swing.JTextField fieldCisloKred;
    private javax.swing.JLabel labelCVV;
    private javax.swing.JLabel labelCena;
    private javax.swing.JLabel labelCisloKred;
    private javax.swing.JLabel labelDataCena;
    private javax.swing.JPanel mainPane;
    // End of variables declaration//GEN-END:variables
}
