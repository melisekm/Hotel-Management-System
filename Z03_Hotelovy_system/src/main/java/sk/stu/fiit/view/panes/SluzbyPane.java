package sk.stu.fiit.view.panes;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.stu.fiit.controller.SluzbaController;
import sk.stu.fiit.model.Sluzba;
import sk.stu.fiit.model.Ubytovanie;
import sk.stu.fiit.utils.ViewUtils;
import sk.stu.fiit.view.IViewRefresh;

/**
 *
 * @author Martin Melisek
 */
public class SluzbyPane extends javax.swing.JPanel implements IViewRefresh {

    private static final Logger logger = LoggerFactory.getLogger(SluzbyPane.class);

    private SluzbaController controller = new SluzbaController();

    private JTextComponent[] baseFields;
    private boolean novy = true;

    public SluzbyPane() {
        initComponents();
        this.baseFields = new JTextComponent[]{
            fieldMeno, fieldCena, textAreaPopis
        };
        this.refresh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelSluzby = new javax.swing.JLabel();
        scrollPaneSluzby = new javax.swing.JScrollPane();
        listSluzby = new javax.swing.JList<>();
        labelMeno = new javax.swing.JLabel();
        fieldMeno = new javax.swing.JTextField();
        labelCena = new javax.swing.JLabel();
        fieldCena = new javax.swing.JTextField();
        btnUlozit = new javax.swing.JButton();
        labelZakaznik = new javax.swing.JLabel();
        labelPopis = new javax.swing.JLabel();
        scrollPanePopis = new javax.swing.JScrollPane();
        textAreaPopis = new javax.swing.JTextArea();
        btnPridat = new javax.swing.JButton();
        labelVyuzitie = new javax.swing.JLabel();
        scrollPaneVyuzitie = new javax.swing.JScrollPane();
        tableVyuzitia = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelSluzby.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelSluzby.setText("Služby");
        add(labelSluzby, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 80, -1));

        listSluzby.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listSluzby.setModel(new DefaultListModel<Sluzba>());
        listSluzby.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listSluzby.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listSluzbyMouseReleased(evt);
            }
        });
        scrollPaneSluzby.setViewportView(listSluzby);

        add(scrollPaneSluzby, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 260, 340));

        labelMeno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelMeno.setText("Názov:");
        add(labelMeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 40));

        fieldMeno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(fieldMeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 250, 40));

        labelCena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelCena.setText("Cena:");
        add(labelCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, 40));

        fieldCena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(fieldCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 250, 40));

        btnUlozit.setBackground(new java.awt.Color(51, 153, 0));
        btnUlozit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUlozit.setForeground(new java.awt.Color(255, 255, 255));
        btnUlozit.setText("ULOŽIŤ");
        btnUlozit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUlozitMouseReleased(evt);
            }
        });
        add(btnUlozit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 250, -1));

        labelZakaznik.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelZakaznik.setText("Služby");
        add(labelZakaznik, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        labelPopis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPopis.setText("Popis:");
        add(labelPopis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 90, 40));

        textAreaPopis.setColumns(20);
        textAreaPopis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textAreaPopis.setLineWrap(true);
        textAreaPopis.setRows(5);
        textAreaPopis.setWrapStyleWord(true);
        scrollPanePopis.setViewportView(textAreaPopis);

        add(scrollPanePopis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 250, 140));

        btnPridat.setBackground(new java.awt.Color(102, 102, 255));
        btnPridat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPridat.setForeground(new java.awt.Color(255, 255, 255));
        btnPridat.setText("PRIDAŤ");
        btnPridat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPridatMouseReleased(evt);
            }
        });
        add(btnPridat, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 260, -1));

        labelVyuzitie.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelVyuzitie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVyuzitie.setText("Táto služba sa nikde nevyužíva");
        add(labelVyuzitie, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 250, -1));

        scrollPaneVyuzitie.setBorder(null);

        tableVyuzitia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ubytovanie", "Dátum", "Zaplatené"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneVyuzitie.setViewportView(tableVyuzitia);

        add(scrollPaneVyuzitie, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 250, 270));
    }// </editor-fold>//GEN-END:initComponents

    private void listSluzbyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSluzbyMouseReleased
        this.setSluzbaInfo();
    }//GEN-LAST:event_listSluzbyMouseReleased

    private void btnUlozitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUlozitMouseReleased
        if (!ViewUtils.validateFieldsNotBlank(this, baseFields)) {
            logger.error("Neboli vyplnene vsetky potrebne polia.");
            return;
        }
        if (!ViewUtils.validateDoubleTextField(this, fieldCena)) {
            logger.error("V Poli cena bola zadana invalidna hodnota.");
            return;
        }
        String meno = fieldMeno.getText();
        Double cena = Double.parseDouble(fieldCena.getText());
        String popis = textAreaPopis.getText();
        if (this.novy) {
            logger.info(String.format("Ukladam novu sluzbu %s", meno));
            this.controller.saveSluzba(meno, popis, cena);
        } else {
            logger.info(String.format("Editujem existujucu sluzbu %s", meno));
            Sluzba povodnaSluzba = listSluzby.getSelectedValue();
            this.controller.saveZakaznik(povodnaSluzba, meno, popis, cena);
        }
        JOptionPane.showMessageDialog(this, "Sluzba ulozena", "SUCESS", JOptionPane.INFORMATION_MESSAGE);
        this.refresh();
    }//GEN-LAST:event_btnUlozitMouseReleased

    private void btnPridatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPridatMouseReleased
        ViewUtils.clearFields(baseFields);
        scrollPaneVyuzitie.setVisible(false);
        labelVyuzitie.setVisible(false);
        this.novy = true;
    }//GEN-LAST:event_btnPridatMouseReleased
    private void setSluzbaInfo() {
        Boolean zoznamJePrazdny = listSluzby.getModel().getSize() == 0;
        if (zoznamJePrazdny) {
            ViewUtils.clearFields(baseFields);
            scrollPaneVyuzitie.setVisible(false);
            labelVyuzitie.setVisible(false);
            return;
        }
        Sluzba s = listSluzby.getSelectedValue();
        fieldMeno.setText(s.getNazov());
        fieldCena.setText(String.format("%.02f", s.getCena()));
        textAreaPopis.setText(s.getPopis());
        tableVyuzitia.setVisible(true);
        this.setTableVyuzitia();
        this.novy = false;
    }

    private void naplnListSluzieb() {
        DefaultListModel model = (DefaultListModel) listSluzby.getModel();
        ArrayList<Sluzba> sluzby = this.controller.getSluzby();
        model.setSize(0);
        for (Sluzba sluzba : sluzby) {
            model.addElement(sluzba);
        }
        listSluzby.setSelectedIndex(0);
    }

    private void setTableVyuzitia() {
        Sluzba s = listSluzby.getSelectedValue();
        if (s.getVyuzitie().isEmpty()) {
            labelVyuzitie.setVisible(true);
            scrollPaneVyuzitie.setVisible(false);
            return;
        }
        labelVyuzitie.setVisible(false);
        scrollPaneVyuzitie.setVisible(true);
        DefaultTableModel model = (DefaultTableModel) tableVyuzitia.getModel();
        ((DefaultTableModel) tableVyuzitia.getModel()).setRowCount(0);
        for (Ubytovanie ubytovanie : s.getVyuzitie()) {
            int index = ubytovanie.getSluzby().indexOf(s);
            boolean isZaplatene = true ? ubytovanie.getPlatba() != null : false;
            model.addRow(new Object[]{
                ubytovanie.getId(),
                ubytovanie.getSluzby().get(index).getDatumVyuzitia(),
                isZaplatene
            });
        }
    }

    @Override
    public void refresh() {
        this.naplnListSluzieb();
        this.setSluzbaInfo();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPridat;
    private javax.swing.JButton btnUlozit;
    private javax.swing.JTextField fieldCena;
    private javax.swing.JTextField fieldMeno;
    private javax.swing.JLabel labelCena;
    private javax.swing.JLabel labelMeno;
    private javax.swing.JLabel labelPopis;
    private javax.swing.JLabel labelSluzby;
    private javax.swing.JLabel labelVyuzitie;
    private javax.swing.JLabel labelZakaznik;
    private javax.swing.JList<Sluzba> listSluzby;
    private javax.swing.JScrollPane scrollPanePopis;
    private javax.swing.JScrollPane scrollPaneSluzby;
    private javax.swing.JScrollPane scrollPaneVyuzitie;
    private javax.swing.JTable tableVyuzitia;
    private javax.swing.JTextArea textAreaPopis;
    // End of variables declaration//GEN-END:variables

}
