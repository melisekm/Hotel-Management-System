package sk.stu.fiit.view.charts;

import java.util.LinkedHashMap;
import org.jfree.chart.ChartFactory;
import java.util.Map;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Martin Melisek
 */
public class BarChart extends Chart {

    public BarChart(LinkedHashMap<String, Double> dataset, String nadpis) {
        super(dataset, nadpis);
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Map.Entry<String, Double> entry : this.getRawDataset().entrySet()) {
            String datum = entry.getKey();
            Double hodnota = entry.getValue();
            dataset.setValue(hodnota, "Výška príjmu v €", datum);
        }
        return dataset;
    }

    private JFreeChart createChart(CategoryDataset dataset, String nadpis) {
        JFreeChart barChart = ChartFactory.createBarChart(
                nadpis,
                "", // TODO
                "Výška príjmu v €", // TODO
                dataset,
                PlotOrientation.VERTICAL,
                false,
                true,
                false
        );
        return barChart;
    }

    public JPanel createBarPane() {
        JFreeChart chart = createChart(createDataset(), this.getNadpis());
        return new ChartPanel(chart);
    }

}
