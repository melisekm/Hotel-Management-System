package sk.stu.fiit.view;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author Martin Melisek
 */
@SuppressWarnings("unchecked")
public class Chart {

    private HashMap<String, Double> datasetRaw;

    public Chart(HashMap<String, Double> dataset) {
        this.datasetRaw = dataset;
    }

    private PieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Map.Entry<String, Double> entry : datasetRaw.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            dataset.setValue(key, value);
        }
        return dataset;
    }

    public JFreeChart createChart(PieDataset dataset, String nadpis) {
        JFreeChart chart = ChartFactory.createPieChart(
                nadpis, // nadpis
                dataset, // data
                true, // legenda
                false, // tooltipy
                false // odkazy
        );
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setSimpleLabels(true);
        plot.setLegendLabelGenerator(new StandardPieSectionLabelGenerator("{0} - {1} ({2})")); // formatovanie legendy
        plot.setLabelGenerator(null); // nezobrazovať labely v grafe
        
        //farby
        Color farbaPozadia = new Color(214,217,223);
        plot.setBackgroundPaint(farbaPozadia);
        plot.setOutlinePaint(null);
        chart.setBackgroundPaint(farbaPozadia);
        chart.getLegend().setBackgroundPaint(farbaPozadia);
        return chart;
    }

    public JPanel createPiePane() {
        JFreeChart chart = createChart(createDataset(), "Nadpis");
        return new ChartPanel(chart);
    }
}
