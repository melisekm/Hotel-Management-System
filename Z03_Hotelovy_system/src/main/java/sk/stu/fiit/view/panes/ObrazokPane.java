package sk.stu.fiit.view.panes;

import javax.swing.Icon;

/**
 *
 * @author Martin Melisek
 */
public class ObrazokPane extends javax.swing.JPanel {

    public ObrazokPane(Icon obrazok) {
        initComponents();
        iconObrazok.setIcon(obrazok);
    }

    public ObrazokPane() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconObrazok = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(iconObrazok, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 450));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconObrazok;
    // End of variables declaration//GEN-END:variables
}
