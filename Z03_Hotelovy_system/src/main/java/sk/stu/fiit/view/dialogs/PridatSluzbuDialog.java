package sk.stu.fiit.view.dialogs;

import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import sk.stu.fiit.controller.UbytovaniaController;
import sk.stu.fiit.model.Sluzba;
import sk.stu.fiit.model.StatusUbytovanie;
import sk.stu.fiit.model.Ubytovanie;

/**
 *
 * @author Martin Melisek
 */
public class PridatSluzbuDialog extends javax.swing.JDialog {

    private UbytovaniaController controller;
    private Ubytovanie zvoleneUbytovanie;

    public PridatSluzbuDialog(java.awt.Frame parent, boolean modal, UbytovaniaController controller, Ubytovanie zvoleneUbytovanie) {
        super(parent, modal);
        initComponents();
        this.controller = controller;
        this.zvoleneUbytovanie = zvoleneUbytovanie;
        this.naplnListSluzieb();
        this.setSluzbaInfo();
        if (this.zvoleneUbytovanie.getPlatba() != null || this.zvoleneUbytovanie.getStatus() == StatusUbytovanie.UKONCENE) {
            this.btnVybrat.setEnabled(false);
        } else {
            this.btnVybrat.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelDostupneSluzby = new javax.swing.JLabel();
        scrollPaneSluzby = new javax.swing.JScrollPane();
        listSluzby = new javax.swing.JList<>();
        btnVybrat = new javax.swing.JButton();
        scrollPanePopis = new javax.swing.JScrollPane();
        textAreaPopis = new javax.swing.JTextArea();
        labelDataSluzba = new javax.swing.JLabel();
        cbPridane = new javax.swing.JCheckBox();
        labelDatumPridania = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pridanie služby k ubytovaniu");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelDostupneSluzby.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDostupneSluzby.setText("Dostupné služby");
        jPanel1.add(labelDostupneSluzby, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        listSluzby.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listSluzby.setModel(new DefaultListModel<Sluzba>());
        listSluzby.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listSluzby.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listSluzbyMouseReleased(evt);
            }
        });
        scrollPaneSluzby.setViewportView(listSluzby);

        jPanel1.add(scrollPaneSluzby, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 250, 180));

        btnVybrat.setBackground(new java.awt.Color(51, 153, 0));
        btnVybrat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVybrat.setForeground(new java.awt.Color(255, 255, 255));
        btnVybrat.setText("Pridať");
        btnVybrat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnVybratMouseReleased(evt);
            }
        });
        jPanel1.add(btnVybrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 100, -1));

        textAreaPopis.setEditable(false);
        textAreaPopis.setColumns(20);
        textAreaPopis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textAreaPopis.setLineWrap(true);
        textAreaPopis.setRows(5);
        textAreaPopis.setWrapStyleWord(true);
        scrollPanePopis.setViewportView(textAreaPopis);

        jPanel1.add(scrollPanePopis, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 250, 180));

        labelDataSluzba.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDataSluzba.setText("Služba");
        jPanel1.add(labelDataSluzba, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        cbPridane.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbPridane.setText("Pridané");
        cbPridane.setEnabled(false);
        jPanel1.add(cbPridane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        labelDatumPridania.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDatumPridania.setText("Dátum pridania");
        jPanel1.add(labelDatumPridania, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listSluzbyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSluzbyMouseReleased
        this.setSluzbaInfo();
    }//GEN-LAST:event_listSluzbyMouseReleased

    private void btnVybratMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVybratMouseReleased
        Sluzba sluzba = listSluzby.getSelectedValue();
        if (sluzba == null) {
            JOptionPane.showMessageDialog(this, "Prosím vyberte sluzbu.");
            return;
        }
        if (this.zvoleneUbytovanie.getSluzby() != null && this.zvoleneUbytovanie.getSluzby().contains(sluzba)) {
            JOptionPane.showMessageDialog(this, "Ubytovanie už obsahuje túto službu.");
            return;
        }
        this.controller.pridajSluzbu(this.zvoleneUbytovanie, sluzba);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnVybratMouseReleased

    private void setSluzbaInfo() {
        Boolean zoznamJePrazdny = listSluzby.getModel().getSize() == 0;
        if (zoznamJePrazdny) {
            this.clearSluzbaInfo();
            return;
        }
        Sluzba sluzba = listSluzby.getSelectedValue();
        labelDataSluzba.setText(sluzba.toString());
        textAreaPopis.setText(sluzba.getPopis());
        if (this.zvoleneUbytovanie.getSluzby() != null && this.zvoleneUbytovanie.getSluzby().contains(sluzba)) {
            cbPridane.setSelected(true);
            labelDatumPridania.setVisible(true);
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            labelDatumPridania.setText(sdf.format(sluzba.getVyuzitie().get(this.zvoleneUbytovanie)));
        } else {
            cbPridane.setSelected(false);
            labelDatumPridania.setVisible(false);
        }
    }

    private void clearSluzbaInfo() {
        labelDataSluzba.setText("Vyberte sluzbu.");
        textAreaPopis.setText("");
        cbPridane.setSelected(false);
        labelDatumPridania.setVisible(false);
    }

    private void naplnListSluzieb() {
        DefaultListModel model = (DefaultListModel) listSluzby.getModel();
        model.setSize(0);
        for (Sluzba sluzba : this.controller.getSluzby()) {
            model.addElement(sluzba);
        }
        listSluzby.setSelectedIndex(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVybrat;
    private javax.swing.JCheckBox cbPridane;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDataSluzba;
    private javax.swing.JLabel labelDatumPridania;
    private javax.swing.JLabel labelDostupneSluzby;
    private javax.swing.JList<Sluzba> listSluzby;
    private javax.swing.JScrollPane scrollPanePopis;
    private javax.swing.JScrollPane scrollPaneSluzby;
    private javax.swing.JTextArea textAreaPopis;
    // End of variables declaration//GEN-END:variables
}
