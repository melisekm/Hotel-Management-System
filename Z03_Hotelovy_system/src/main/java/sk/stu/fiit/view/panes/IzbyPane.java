package sk.stu.fiit.view.panes;

import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.JTextComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.stu.fiit.controller.IzbyController;
import sk.stu.fiit.model.Izba;
import sk.stu.fiit.model.Ubytovanie;
import sk.stu.fiit.utils.ViewUtils;
import sk.stu.fiit.view.ICRUDPane;
import sk.stu.fiit.view.IViewRefresh;
import sk.stu.fiit.view.dialogs.GaleriaIzbyDialog;
import sk.stu.fiit.view.dialogs.HistoriaUbytovaniDialog;

/**
 *
 * @author Martin Melisek
 */
public class IzbyPane extends javax.swing.JPanel implements IViewRefresh, ICRUDPane {

    private static final Logger logger = LoggerFactory.getLogger(ZakazniciPane.class);

    private IzbyController controller = new IzbyController();
    private JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);

    private JTextComponent[] baseFields;
    private JTextComponent[] fotkyFields;
    private boolean novy = true;

    public IzbyPane() {
        initComponents();
        this.baseFields = new JTextComponent[]{
            fieldCena, fieldKategoria, fieldOznacenie, fieldPocetLozok, textAreaPopis,};
        this.fotkyFields = new JTextComponent[]{
            fieldFotka1, fieldFotka2, fieldFotka3
        };
        this.refreshPane();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgChooser = new javax.swing.JFileChooser();
        labelIzby = new javax.swing.JLabel();
        scrollPaneIzby = new javax.swing.JScrollPane();
        listIzby = new javax.swing.JList<>();
        labelKategoria = new javax.swing.JLabel();
        fieldKategoria = new javax.swing.JTextField();
        labelPocetLozok = new javax.swing.JLabel();
        labelOznacenie = new javax.swing.JLabel();
        fieldPocetLozok = new javax.swing.JTextField();
        fieldOznacenie = new javax.swing.JTextField();
        btnUlozit = new javax.swing.JButton();
        labelCena = new javax.swing.JLabel();
        fieldCena = new javax.swing.JTextField();
        labelIzba = new javax.swing.JLabel();
        labelPopis = new javax.swing.JLabel();
        scrollPanePopis = new javax.swing.JScrollPane();
        textAreaPopis = new javax.swing.JTextArea();
        btnHistoria = new javax.swing.JButton();
        btnPridat = new javax.swing.JButton();
        btnGaleria = new javax.swing.JButton();
        fieldFotka1 = new javax.swing.JTextField();
        fieldFotka2 = new javax.swing.JTextField();
        fieldFotka3 = new javax.swing.JTextField();
        btnPridatFotku1 = new javax.swing.JButton();
        btnPridatFotku2 = new javax.swing.JButton();
        btnPridatFotku3 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelIzby.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelIzby.setText("Izby");
        add(labelIzby, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 130, -1));

        listIzby.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listIzby.setModel(new DefaultListModel<Izba>());
        listIzby.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listIzby.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listIzbyMouseReleased(evt);
            }
        });
        scrollPaneIzby.setViewportView(listIzby);

        add(scrollPaneIzby, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 260, 340));

        labelKategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelKategoria.setText("Kateg??ria:");
        add(labelKategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 40));

        fieldKategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(fieldKategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 250, 40));

        labelPocetLozok.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPocetLozok.setText("Po??et l????ok:");
        add(labelPocetLozok, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, 40));

        labelOznacenie.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelOznacenie.setText("Ozna??enie:");
        add(labelOznacenie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, 40));

        fieldPocetLozok.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(fieldPocetLozok, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 250, 40));

        fieldOznacenie.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(fieldOznacenie, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 250, 40));

        btnUlozit.setBackground(new java.awt.Color(51, 153, 0));
        btnUlozit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUlozit.setForeground(new java.awt.Color(255, 255, 255));
        btnUlozit.setText("ULO??I??");
        btnUlozit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUlozitMouseReleased(evt);
            }
        });
        add(btnUlozit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 250, -1));

        labelCena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelCena.setText("Cena:");
        add(labelCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 90, 40));

        fieldCena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(fieldCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 250, 40));

        labelIzba.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelIzba.setText("Izba");
        add(labelIzba, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        labelPopis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPopis.setText("Popis:");
        add(labelPopis, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 90, 40));

        textAreaPopis.setColumns(20);
        textAreaPopis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textAreaPopis.setLineWrap(true);
        textAreaPopis.setRows(5);
        textAreaPopis.setWrapStyleWord(true);
        scrollPanePopis.setViewportView(textAreaPopis);

        add(scrollPanePopis, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 250, 100));

        btnHistoria.setBackground(new java.awt.Color(102, 102, 255));
        btnHistoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnHistoria.setForeground(new java.awt.Color(255, 255, 255));
        btnHistoria.setText("HIST??RIA UBYTOVAN??");
        btnHistoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnHistoriaMouseReleased(evt);
            }
        });
        add(btnHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 250, -1));

        btnPridat.setBackground(new java.awt.Color(102, 102, 255));
        btnPridat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPridat.setForeground(new java.awt.Color(255, 255, 255));
        btnPridat.setText("PRIDA??");
        btnPridat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPridatMouseReleased(evt);
            }
        });
        add(btnPridat, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 260, -1));

        btnGaleria.setBackground(new java.awt.Color(102, 102, 102));
        btnGaleria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGaleria.setForeground(new java.awt.Color(255, 255, 255));
        btnGaleria.setText("Gal??ria");
        btnGaleria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnGaleriaMouseReleased(evt);
            }
        });
        add(btnGaleria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 250, 35));

        fieldFotka1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fieldFotka1.setAutoscrolls(false);
        fieldFotka1.setMaximumSize(new java.awt.Dimension(60, 20));
        add(fieldFotka1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 75, 35));

        fieldFotka2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(fieldFotka2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 75, 35));

        fieldFotka3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(fieldFotka3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 75, 35));

        btnPridatFotku1.setBackground(new java.awt.Color(102, 102, 102));
        btnPridatFotku1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPridatFotku1.setForeground(new java.awt.Color(255, 255, 255));
        btnPridatFotku1.setText("Nahra??");
        btnPridatFotku1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPridatFotku1MouseReleased(evt);
            }
        });
        add(btnPridatFotku1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 90, 35));

        btnPridatFotku2.setBackground(new java.awt.Color(102, 102, 102));
        btnPridatFotku2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPridatFotku2.setForeground(new java.awt.Color(255, 255, 255));
        btnPridatFotku2.setText("Nahra??");
        btnPridatFotku2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPridatFotku2MouseReleased(evt);
            }
        });
        add(btnPridatFotku2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 90, 35));

        btnPridatFotku3.setBackground(new java.awt.Color(102, 102, 102));
        btnPridatFotku3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPridatFotku3.setForeground(new java.awt.Color(255, 255, 255));
        btnPridatFotku3.setText("Nahra??");
        btnPridatFotku3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPridatFotku3MouseReleased(evt);
            }
        });
        add(btnPridatFotku3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 90, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void listIzbyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listIzbyMouseReleased
        ViewUtils.clearFields(fotkyFields);
        this.setModel();
    }//GEN-LAST:event_listIzbyMouseReleased

    private void btnUlozitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUlozitMouseReleased
        this.updateModel(listIzby, this.controller.getIzby());
    }//GEN-LAST:event_btnUlozitMouseReleased

    private void btnHistoriaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoriaMouseReleased
        Izba izba = listIzby.getSelectedValue();
        if (izba == null) {
            logger.info("Nebola vybrata izba a bolo kliknute na dialog historie");
            JOptionPane.showMessageDialog(this, "Pros??m vyberte izbu");
            return;
        }
        ArrayList<Ubytovanie> historia = izba.getHistoriaUbytovani();
        ViewUtils.showDialog(new HistoriaUbytovaniDialog(this.parent, true, historia));
    }//GEN-LAST:event_btnHistoriaMouseReleased

    private void btnPridatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPridatMouseReleased
        ViewUtils.clearFields(baseFields);
        ViewUtils.clearFields(fotkyFields);
        btnHistoria.setVisible(false);
        this.novy = true;
    }//GEN-LAST:event_btnPridatMouseReleased

    private void btnGaleriaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGaleriaMouseReleased
        ArrayList<Icon> obrazky;
        if (this.novy) {
            obrazky = new ArrayList<>();
            for (JTextComponent fotkyField : this.fotkyFields) {
                String fotkaPath = fotkyField.getText();
                File obrazok = new File(fotkaPath);
                ImageIcon icon = this.controller.transformImageIcon(obrazok);
                if (icon != null) {
                    obrazky.add(icon);
                }
            }
        } else {
            obrazky = listIzby.getSelectedValue().getGaleria();
        }
        if (obrazky.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tato izba nema ziadne fotky v galerii");
            return;
        }
        ViewUtils.showDialog(new GaleriaIzbyDialog(null, true, obrazky));
    }//GEN-LAST:event_btnGaleriaMouseReleased

    private void btnPridatFotku1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPridatFotku1MouseReleased
        this.pridatFotku(0);
    }//GEN-LAST:event_btnPridatFotku1MouseReleased

    private void btnPridatFotku2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPridatFotku2MouseReleased
        this.pridatFotku(1);
    }//GEN-LAST:event_btnPridatFotku2MouseReleased

    private void btnPridatFotku3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPridatFotku3MouseReleased
        this.pridatFotku(2);
    }//GEN-LAST:event_btnPridatFotku3MouseReleased

    private void pridatFotku(int idx) {
        FileFilter ff = new FileNameExtensionFilter("images", "jpg", "jpeg", "png");
        imgChooser.setFileFilter(ff);
        int open = imgChooser.showOpenDialog(this);
        if (open == JFileChooser.APPROVE_OPTION) {
            File file = imgChooser.getSelectedFile();
            this.fotkyFields[idx].setText(file.getPath());
        }
    }

    @Override
    public void saveModel() {
        String oznacenie = fieldOznacenie.getText();
        String kategoria = fieldKategoria.getText();
        String popis = textAreaPopis.getText();
        int pocetLozok = Integer.parseInt(fieldPocetLozok.getText());
        double cena = Double.parseDouble(fieldCena.getText());
        ArrayList<File> galeriaPaths = new ArrayList<>();
        for (JTextComponent fotkaField : this.fotkyFields) {
            String fotkaPath = fotkaField.getText();
            galeriaPaths.add(new File(fotkaPath));
        }
        if (this.novy) {
            logger.info(String.format("Ukladam novu izbu %s %s", kategoria, oznacenie));
            this.controller.saveIzba(oznacenie, kategoria, popis, pocetLozok, cena, galeriaPaths);
        } else {
            logger.info(String.format("Editujem existujucu izbu %s %s", kategoria, oznacenie));
            Izba povodnaIzba = listIzby.getSelectedValue();
            this.controller.saveIzba(povodnaIzba, oznacenie, kategoria, popis, pocetLozok, cena, galeriaPaths);
        }
        JOptionPane.showMessageDialog(this, "Izba Ulozena", "SUCESS", JOptionPane.INFORMATION_MESSAGE);

    }

    @Override
    public boolean validateFields() {
        if (!ViewUtils.validateFieldsNotBlank(this, baseFields)) {
            logger.error("Neboli vyplnene vsetky polia");
            return false;
        }
        if (!ViewUtils.validateDoubleTextFields(this, fieldCena)) {
            logger.error("Neplatna hodnota v double poli cena");
            return false;
        }
        if (!ViewUtils.validateIntegerTextFields(this, fieldPocetLozok)) {
            logger.error("Neplatna hodnota v celociselnom poli pocetLozok");
            return false;
        }
        return true;
    }

    @Override
    public void setModel() {
        Boolean zoznamJePrazdny = listIzby.getModel().getSize() == 0;
        ViewUtils.clearFields(fotkyFields);
        if (zoznamJePrazdny) {
            ViewUtils.clearFields(baseFields);
            btnHistoria.setVisible(false);
            return;
        }
        Izba izba = listIzby.getSelectedValue();
        fieldKategoria.setText(izba.getKategoria());
        fieldOznacenie.setText(izba.getOznacenie());
        fieldPocetLozok.setText(String.valueOf(izba.getPocetLozok()));
        textAreaPopis.setText(izba.getPopis());
        fieldCena.setText(String.format("%.02f", izba.getCena()));
        btnHistoria.setVisible(true);
        this.novy = false;
    }

    @Override
    public void refreshPane() {
        this.refreshModel(listIzby, this.controller.getIzby());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGaleria;
    private javax.swing.JButton btnHistoria;
    private javax.swing.JButton btnPridat;
    private javax.swing.JButton btnPridatFotku1;
    private javax.swing.JButton btnPridatFotku2;
    private javax.swing.JButton btnPridatFotku3;
    private javax.swing.JButton btnUlozit;
    private javax.swing.JTextField fieldCena;
    private javax.swing.JTextField fieldFotka1;
    private javax.swing.JTextField fieldFotka2;
    private javax.swing.JTextField fieldFotka3;
    private javax.swing.JTextField fieldKategoria;
    private javax.swing.JTextField fieldOznacenie;
    private javax.swing.JTextField fieldPocetLozok;
    private javax.swing.JFileChooser imgChooser;
    private javax.swing.JLabel labelCena;
    private javax.swing.JLabel labelIzba;
    private javax.swing.JLabel labelIzby;
    private javax.swing.JLabel labelKategoria;
    private javax.swing.JLabel labelOznacenie;
    private javax.swing.JLabel labelPocetLozok;
    private javax.swing.JLabel labelPopis;
    private javax.swing.JList<Izba> listIzby;
    private javax.swing.JScrollPane scrollPaneIzby;
    private javax.swing.JScrollPane scrollPanePopis;
    private javax.swing.JTextArea textAreaPopis;
    // End of variables declaration//GEN-END:variables

}
