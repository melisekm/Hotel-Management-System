package sk.stu.fiit.view.dialogs;

import java.awt.Frame;
import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.stu.fiit.controller.RezervacieController;
import sk.stu.fiit.model.Rezervacia;
import sk.stu.fiit.model.StatusRezervacie;
import sk.stu.fiit.utils.ViewUtils;

/**
 *
 * @author Martin Melisek
 */
public class StatusRezervacieDialog extends javax.swing.JDialog {

    private static final Logger logger = LoggerFactory.getLogger(StatusRezervacieDialog.class);
    private Frame parent;

    private RezervacieController controller;
    private Rezervacia zvolenaRezervacia;

    public StatusRezervacieDialog(java.awt.Frame parent, boolean modal, RezervacieController controller, Rezervacia zvolenaRezervacia) {
        super(parent, modal);
        initComponents();
        this.controller = controller;
        this.zvolenaRezervacia = zvolenaRezervacia;
        this.updateLabels();
        this.parent = parent;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPane = new javax.swing.JPanel();
        labelRezervacia = new javax.swing.JLabel();
        labelDataId = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        labelDataStatus = new javax.swing.JLabel();
        btnZaplatit = new javax.swing.JButton();
        checkBoxZaplatena = new javax.swing.JCheckBox();
        btnUplatnitZlavu = new javax.swing.JButton();
        labelCena = new javax.swing.JLabel();
        btnZavriet = new javax.swing.JButton();
        labelDataCena = new javax.swing.JLabel();
        btnZrusitRezervaciu = new javax.swing.JButton();
        separatorVert = new javax.swing.JSeparator();
        separatorHoriz = new javax.swing.JSeparator();
        labelZalohaZaplatena = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rezervácia");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelRezervacia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelRezervacia.setText("Rezervácia:");
        mainPane.add(labelRezervacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        labelDataId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataId.setText("ID");
        mainPane.add(labelDataId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 50, 30));

        labelStatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelStatus.setText("Status");
        mainPane.add(labelStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 30));

        labelDataStatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataStatus.setText("Vytvorená");
        mainPane.add(labelDataStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 65, -1, -1));

        btnZaplatit.setBackground(new java.awt.Color(51, 153, 0));
        btnZaplatit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnZaplatit.setForeground(new java.awt.Color(255, 255, 255));
        btnZaplatit.setText("Zaplatiť zálohu");
        btnZaplatit.setFocusable(false);
        btnZaplatit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnZaplatitMouseReleased(evt);
            }
        });
        mainPane.add(btnZaplatit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 180, -1));

        checkBoxZaplatena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        checkBoxZaplatena.setEnabled(false);
        checkBoxZaplatena.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        mainPane.add(checkBoxZaplatena, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 30, 30));

        btnUplatnitZlavu.setBackground(new java.awt.Color(102, 102, 255));
        btnUplatnitZlavu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUplatnitZlavu.setForeground(new java.awt.Color(255, 255, 255));
        btnUplatnitZlavu.setText("Uplatniť zľavu");
        btnUplatnitZlavu.setFocusable(false);
        btnUplatnitZlavu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUplatnitZlavuMouseReleased(evt);
            }
        });
        mainPane.add(btnUplatnitZlavu, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 180, -1));

        labelCena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelCena.setText("Cena:");
        mainPane.add(labelCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));

        btnZavriet.setBackground(new java.awt.Color(102, 102, 255));
        btnZavriet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnZavriet.setForeground(new java.awt.Color(255, 255, 255));
        btnZavriet.setText("Zavrieť");
        btnZavriet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnZavrietMouseReleased(evt);
            }
        });
        mainPane.add(btnZavriet, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        labelDataCena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataCena.setText("41");
        mainPane.add(labelDataCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 105, -1, -1));

        btnZrusitRezervaciu.setBackground(new java.awt.Color(255, 102, 102));
        btnZrusitRezervaciu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnZrusitRezervaciu.setForeground(new java.awt.Color(255, 255, 255));
        btnZrusitRezervaciu.setText("Zrušiť rezerváciu");
        btnZrusitRezervaciu.setFocusable(false);
        btnZrusitRezervaciu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnZrusitRezervaciuMouseReleased(evt);
            }
        });
        mainPane.add(btnZrusitRezervaciu, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 180, -1));

        separatorVert.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainPane.add(separatorVert, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 40, 180));
        mainPane.add(separatorHoriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 490, 30));

        labelZalohaZaplatena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelZalohaZaplatena.setText("Záloha zaplatená: ");
        mainPane.add(labelZalohaZaplatena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        getContentPane().add(mainPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZrusitRezervaciuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnZrusitRezervaciuMouseReleased
        int res = JOptionPane.showConfirmDialog(this, "Prajete si zrušiť rezerváciu?", "ZRUSIT REZERVACIU", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            this.controller.zrusitRezervaciu(this.zvolenaRezervacia);
            logger.info(String.format("Rezervácia %s bola zrušená.", this.zvolenaRezervacia.getId()));
            JOptionPane.showMessageDialog(this, "Rezervácia bola zrušená.");
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_btnZrusitRezervaciuMouseReleased

    private void btnUplatnitZlavuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUplatnitZlavuMouseReleased
        String kod = JOptionPane.showInputDialog(this, "Zadajte kód:");
        if (this.controller.aplikujZlavu(this.zvolenaRezervacia, kod)) {
            JOptionPane.showMessageDialog(this, "Zľava aplikovaná");
        } else {
            JOptionPane.showMessageDialog(this, "Zľava neexistuje.");
        }
        this.updateLabels();
    }//GEN-LAST:event_btnUplatnitZlavuMouseReleased

    private void btnZavrietMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnZavrietMouseReleased
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnZavrietMouseReleased

    private void btnZaplatitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnZaplatitMouseReleased
        PlatbaDialog platbaDialog = new PlatbaDialog(this.parent, true, this.zvolenaRezervacia, 0.1);
        ViewUtils.showDialog(platbaDialog);
        this.updateLabels();
    }//GEN-LAST:event_btnZaplatitMouseReleased

    private void updateLabels() {
        switch (this.zvolenaRezervacia.getStatus()) {
            case VYTVORENA:
                this.setBtns(true, false, true, true);
                break;
            case POTVRDENA:
                this.setBtns(false, true, false, false);
                break;
            case VYKONANA:
                this.setBtns(false, true, false, false);
                break;
            case EXPIROVANA:
                boolean zaplatena = false ? this.zvolenaRezervacia.getPlatba() == null : true;
                this.setBtns(false, zaplatena, false, true);
                break;
            default:
                throw new AssertionError();
        }
        labelDataId.setText(this.zvolenaRezervacia.getId());
        labelDataCena.setText(String.format("%.02f€", this.zvolenaRezervacia.getCena()));
        labelDataStatus.setText(this.zvolenaRezervacia.getStatus().toString().toUpperCase());
    }

    private void setBtns(boolean zaplatitBtn, boolean cbZaplatena, boolean uplatnitZlavuBtn, boolean zrusitRezBtn) {
        this.btnZaplatit.setEnabled(zaplatitBtn);
        this.checkBoxZaplatena.setSelected(cbZaplatena);
        this.btnUplatnitZlavu.setEnabled(uplatnitZlavuBtn);
        this.btnZrusitRezervaciu.setEnabled(zrusitRezBtn);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUplatnitZlavu;
    private javax.swing.JButton btnZaplatit;
    private javax.swing.JButton btnZavriet;
    private javax.swing.JButton btnZrusitRezervaciu;
    private javax.swing.JCheckBox checkBoxZaplatena;
    private javax.swing.JLabel labelCena;
    private javax.swing.JLabel labelDataCena;
    private javax.swing.JLabel labelDataId;
    private javax.swing.JLabel labelDataStatus;
    private javax.swing.JLabel labelRezervacia;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelZalohaZaplatena;
    private javax.swing.JPanel mainPane;
    private javax.swing.JSeparator separatorHoriz;
    private javax.swing.JSeparator separatorVert;
    // End of variables declaration//GEN-END:variables
}
