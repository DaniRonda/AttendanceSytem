package easv.dk.gui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.Axis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StudentStatisticsController {

    @FXML
    public AreaChart <Number, Number> chart;
    public Button cancelStatsViewButton;

    public void showChart(ActionEvent actionEvent) {

        Axis<Number> xAxis = chart.getXAxis();
        xAxis.setLabel("Date");

        Axis <Number> yAxis = chart.getYAxis();
        yAxis.setLabel("Percentage");


        XYChart.Series<Number, Number> series = new XYChart.Series<Number, Number>();
        series.setName("Attendance");

        series.getData().add(new XYChart.Data<>(1, 90));
        series.getData().add(new XYChart.Data<>(2, 85));
    }

    public void cancelStatsView(ActionEvent actionEvent) {
        Stage stage = (Stage) cancelStatsViewButton.getScene().getWindow();
        stage.close();
    }
}
