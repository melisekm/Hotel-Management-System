package sk.stu.fiit.utils;

import java.awt.Component;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Library pre View
 *
 * @author Martin Melisek
 */
public class ViewUtils {

    private static final Logger logger = LoggerFactory.getLogger(ViewUtils.class);

    private ViewUtils() {
    }

    public static void showDialog(JDialog dialog) {
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    /**
     * Overi, ci boli vsetky fieldy vyplnene, vypise err dialog, ak nie
     *
     * @param parent Window - parent pre Dialog s infom
     * @param fields Pole alebo var arg fieldov/text arey
     * @return true, ak boli vsetky fieldy vyplnene, false ak opak
     */
    public static boolean validateFieldsNotBlank(Component parent, JTextComponent... fields) {
        for (JTextComponent field : fields) {
            if (field.getText().isBlank()) {
                JOptionPane.showMessageDialog(parent, "Vsetky polia musia byt vyplnene", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    public static boolean validateDoubleTextField(Component parent, JTextComponent... fields) {
        try {
            for (JTextComponent field : fields) {
                double convertedField = Double.parseDouble(field.getText());
                boolean isFieldMimoRozsah = Boolean.logicalOr(convertedField < 0, convertedField > Long.MAX_VALUE);
                if (isFieldMimoRozsah) {
                    throw new ArithmeticException();
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(parent, "Neplatna hodnota v ciselnom poli.", "Invalid input.", JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(parent, "Hodnota je mimo rozsah.", "Invalid input.", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public static void clearFields(JTextComponent... fields) {
        for (JTextComponent field : fields) {
            field.setText("");
        }
    }

    public static void clearLabels(JLabel... labels) {
        clearLabels("", labels);
    }

    public static void clearLabels(String defaultValue, JLabel... labels) {
        for (JLabel label : labels) {
            label.setText(defaultValue);
        }
    }
}
