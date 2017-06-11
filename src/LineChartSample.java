import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import org.jfree.data.time.Millisecond;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class LineChartSample extends Application {

	private int x = 0;

	@Override
	public void start(Stage stage) {
		stage.setTitle("Graf-test med EKG data");
		// defining the axes
		final NumberAxis xAxis = new NumberAxis();
		xAxis.setAutoRanging(false);
		xAxis.setUpperBound(3000);
		xAxis.setForceZeroInRange(false);
		final NumberAxis yAxis = new NumberAxis();
		yAxis.setForceZeroInRange(true);
		xAxis.setLabel("Antal målinger");
		// creating the chart
		final LineChart<Number, Number> lineChart = new LineChart<Number, Number>(xAxis, yAxis);

		lineChart.setTitle("Graf test");
		// defining a series
		XYChart.Series series = new XYChart.Series();
		series.setName("EKG-dataset");
		lineChart.setCreateSymbols(false); // hide dots
		// lineChart.autosize();
		lineChart.setAnimated(false);
		lineChart.setLayoutX(2.0);

		String fil = "C:" + File.separator + "Users" + File.separator + "madso" + File.separator + "Documents"
				+ File.separator + "!Privat" + File.separator + "DTU 2016-2020" + File.separator + "MATLAB";
		String filnavn = "EKGdata";

		try {
			Scanner sc = new Scanner(new FileReader(fil + File.separator + filnavn));

			Scene scene = new Scene(lineChart, 800, 600);
			lineChart.getData().add(series);

			stage.setScene(scene);
			stage.show();

			Timer timer = new Timer();
			timer.scheduleAtFixedRate(new TimerTask() {

				@Override
				public void run() {
					if (sc.hasNext()) {
						series.getData().add(new XYChart.Data(x, Double.parseDouble(sc.nextLine())));
						x += 1;
					}

					else
						sc.close();
				}

			}, 100, 50);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}