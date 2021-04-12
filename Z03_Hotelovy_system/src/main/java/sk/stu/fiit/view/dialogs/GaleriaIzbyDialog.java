package sk.stu.fiit.view.dialogs;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.Icon;
import sk.stu.fiit.view.panes.ObrazokPane;

/**
 *
 * @author Martin Melisek
 */
public class GaleriaIzbyDialog extends javax.swing.JDialog {

    public GaleriaIzbyDialog(java.awt.Frame parent, boolean modal, ArrayList<Icon> obrazky) {
        super(parent, modal);
        initComponents();

        for (Icon obrazok : obrazky) {
            cardPane.add(new ObrazokPane(obrazok));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnZavriet = new javax.swing.JButton();
        cardPane = new javax.swing.JPanel();
        btnDalsi = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Galeria");
        setPreferredSize(new java.awt.Dimension(905, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnZavriet.setBackground(new java.awt.Color(102, 102, 255));
        btnZavriet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnZavriet.setForeground(new java.awt.Color(255, 255, 255));
        btnZavriet.setText("Zavrieť");
        btnZavriet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnZavrietMouseReleased(evt);
            }
        });
        getContentPane().add(btnZavriet, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, -1, -1));

        cardPane.setLayout(new java.awt.CardLayout());
        getContentPane().add(cardPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 450));

        btnDalsi.setBackground(new java.awt.Color(102, 102, 102));
        btnDalsi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDalsi.setForeground(new java.awt.Color(255, 255, 255));
        btnDalsi.setText("Ďalšia");
        btnDalsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDalsiMouseReleased(evt);
            }
        });
        getContentPane().add(btnDalsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 160, -1));

        btnPrev.setBackground(new java.awt.Color(102, 102, 102));
        btnPrev.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev.setText("Predchádzajúca");
        btnPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPrevMouseReleased(evt);
            }
        });
        getContentPane().add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZavrietMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnZavrietMouseReleased
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnZavrietMouseReleased

    private void btnDalsiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDalsiMouseReleased
        CardLayout cl = (CardLayout) (cardPane.getLayout());
        cl.next(cardPane);
    }//GEN-LAST:event_btnDalsiMouseReleased

    private void btnPrevMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseReleased
        CardLayout cl = (CardLayout) (cardPane.getLayout());
        cl.previous(cardPane);
    }//GEN-LAST:event_btnPrevMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDalsi;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnZavriet;
    private javax.swing.JPanel cardPane;
    // End of variables declaration//GEN-END:variables
}
