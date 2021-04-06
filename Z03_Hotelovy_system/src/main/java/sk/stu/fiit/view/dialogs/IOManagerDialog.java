package sk.stu.fiit.view.dialogs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.stu.fiit.controller.IOController;
import sk.stu.fiit.utils.ViewUtils;

/**
 *
 * @author Martin Melisek
 */
public class IOManagerDialog extends javax.swing.JDialog {

    private static final Logger logger = LoggerFactory.getLogger(IOManagerDialog.class);

    private IOController controller = new IOController();

    public IOManagerDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        btnGrp = new javax.swing.ButtonGroup();
        btnCesta = new javax.swing.JButton();
        btnVykonat = new javax.swing.JButton();
        radioBtnUlozit = new javax.swing.JRadioButton();
        radioBtnNacitat = new javax.swing.JRadioButton();
        labelCesta = new javax.swing.JLabel();
        fieldCesta = new javax.swing.JTextField();
        labelNazov = new javax.swing.JLabel();
        fieldNazov = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IO DB Manager");
        setPreferredSize(new java.awt.Dimension(434, 240));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCesta.setBackground(new java.awt.Color(153, 153, 153));
        btnCesta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCesta.setForeground(new java.awt.Color(255, 255, 255));
        btnCesta.setText("Vyberte..");
        btnCesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCestaMouseReleased(evt);
            }
        });
        getContentPane().add(btnCesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        btnVykonat.setBackground(new java.awt.Color(0, 184, 0));
        btnVykonat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVykonat.setForeground(new java.awt.Color(255, 255, 255));
        btnVykonat.setText("Uložiť");
        btnVykonat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnVykonatMouseReleased(evt);
            }
        });
        getContentPane().add(btnVykonat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 120, -1));

        btnGrp.add(radioBtnUlozit);
        radioBtnUlozit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioBtnUlozit.setSelected(true);
        radioBtnUlozit.setText("Uložiť databázu");
        radioBtnUlozit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                radioBtnUlozitMouseReleased(evt);
            }
        });
        getContentPane().add(radioBtnUlozit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        btnGrp.add(radioBtnNacitat);
        radioBtnNacitat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioBtnNacitat.setText("Načítať databázu");
        radioBtnNacitat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                radioBtnNacitatMouseReleased(evt);
            }
        });
        getContentPane().add(radioBtnNacitat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        labelCesta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelCesta.setText("Cesta:");
        getContentPane().add(labelCesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        fieldCesta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(fieldCesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 180, -1));

        labelNazov.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelNazov.setText("Názov:");
        getContentPane().add(labelNazov, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, 30));

        fieldNazov.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(fieldNazov, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioBtnNacitatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBtnNacitatMouseReleased
        labelNazov.setVisible(false);
        fieldNazov.setVisible(false);
        btnVykonat.setText("Načítať");
        ViewUtils.clearFields(fieldNazov, fieldCesta);
    }//GEN-LAST:event_radioBtnNacitatMouseReleased

    private void radioBtnUlozitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBtnUlozitMouseReleased
        labelNazov.setVisible(true);
        fieldNazov.setVisible(true);
        btnVykonat.setText("Uložiť");
        ViewUtils.clearFields(fieldNazov, fieldCesta);

    }//GEN-LAST:event_radioBtnUlozitMouseReleased

    private void btnCestaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCestaMouseReleased
        if (radioBtnNacitat.isSelected()) {
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        } else {
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        }
        int open = fileChooser.showOpenDialog(this);
        if (open == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (radioBtnNacitat.isSelected()) {
                fieldCesta.setText(file.toString());
            } else {
                fieldCesta.setText(file.toString() + "/" + fieldNazov.getText() + ".dbZ03");
            }
            logger.info("Zvoleny subor: " + file.getName());
        }
    }//GEN-LAST:event_btnCestaMouseReleased

    private void btnVykonatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVykonatMouseReleased
        File file = new File(fieldCesta.getText());
        try {
            if (radioBtnNacitat.isSelected()) {
                this.controller.loadDatabase(file);
                JOptionPane.showMessageDialog(this, "Nacitanie bolo uspesne", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (!ViewUtils.validateFieldsNotBlank(this, fieldCesta, fieldNazov)) {
                    logger.error("Neboli vyplnene vsetky polia");
                    return;
                }
                if (!file.exists()) {
                    logger.info("Prepisujem existujuci subor.");
                    file.createNewFile();
                }
                this.controller.saveDatabase(file);
                JOptionPane.showMessageDialog(this, "Ulozenie bolo uspesne", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
            this.setVisible(false);
            this.dispose();
        } catch (FileNotFoundException ex) {
            logger.error(ex.getMessage());
            logger.error("SUBOR " + file.getName() + " NEEXISTUJE");
            JOptionPane.showMessageDialog(this, "Subor neexistuje.", "SUBOR NEEXISTUJE", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            logger.error("SUBOR PRAVDEPODOBNE NIE JE KOMPATIBILNY");
            logger.error(ex.getMessage());
            JOptionPane.showMessageDialog(this, "Subor nie je kompatibilny. (code 1)", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            logger.error(ex.getMessage());
            logger.error("Bola nahrata databasa, ktora nie je kompatibilna alebo uplne ina trieda.");
            JOptionPane.showMessageDialog(this,"Neocakavana chyba. (code 2)", "ERROR", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnVykonatMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCesta;
    private javax.swing.ButtonGroup btnGrp;
    private javax.swing.JButton btnVykonat;
    private javax.swing.JTextField fieldCesta;
    private javax.swing.JTextField fieldNazov;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel labelCesta;
    private javax.swing.JLabel labelNazov;
    private javax.swing.JRadioButton radioBtnNacitat;
    private javax.swing.JRadioButton radioBtnUlozit;
    // End of variables declaration//GEN-END:variables
}
