import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class LineChartSample2 extends Application {

	private ArrayList<Double> data = new ArrayList<>();
	private XYChart.Series<Number, Number> series = null;
	private int counter = 0;
	private static LineChartSample2 instance;
	final NumberAxis xAxis = new NumberAxis();
	final NumberAxis yAxis = new NumberAxis();
	private final LineChart<Number, Number> lineChart = new LineChart<Number, Number>(xAxis, yAxis);

	public LineChartSample2() {
		String fil = "C:" + File.separator + "Users" + File.separator + "madso" + File.separator + "Documents"
				+ File.separator + "!Privat" + File.separator + "DTU 2016-2020" + File.separator + "MATLAB";
		String filnavn = "EKGdata";
		try {
			Scanner sc = new Scanner(new FileReader(fil + File.separator + filnavn));
			while (sc.hasNext()) {
				data.add(Double.parseDouble(sc.nextLine()));
			}
			sc.close();
		} catch (Exception e) {
		}
	}

	@Override
	public void start(Stage stage) {

		stage.setTitle("Line Chart Sample");
		// defining the axes

		xAxis.setLabel("Målinger");
		xAxis.setTickLabelGap(100);

		// creating the chart

		lineChart.setTitle("Test");
		lineChart.setAnimated(false);
		// defining a series
		series = new XYChart.Series();
		series.setName("EKG-test");
		// populating the series with data
		for (int i = 0; i < (900); i++) {
			series.getData().add(new XYChart.Data<Number, Number>(i, data.get(i)));
			counter = i;
		}

		Scene scene = new Scene(lineChart, 800, 600);
		lineChart.getData().add(series);

		stage.setScene(scene);
		stage.show();
		try {

			Timer timer = new Timer();
			timer.scheduleAtFixedRate(new TimerTask() {
				public void run() {
					XYChart.Series<Number, Number> newSeries = new XYChart.Series<>();
					int j = 0;
					int i = counter;
					//series.getData().removeAll();
					for (; i < (900 + counter); i++) {
						newSeries.getData().add(new XYChart.Data(i, data.get(i)));
						j++;
					}
					// counter = i;
					// lineChart.getData().remove(series);
					// series = newSeries;
					lineChart.getData().add(newSeries);
				}
			}, 5000, 2000);
		} catch (Exception e) {
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}