import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class barGraph extends Application {
    final static String one = "1";
    final static String two = "2";
    final static String three = "3";
    final static String four = "4";
    final static String five = "5";
    final static String six = "6";
    final static String seven = "7";
    final static String eight = "8";
    final static String nine = "9";

    @Override public void start(Stage stage) {
        stage.setTitle("bar graph");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = 
        new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Benford's Law Distribution First Digit");
        xAxis.setLabel("digit");       
        yAxis.setLabel("percent");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("digit frequency");       
        series1.getData().add(new XYChart.Data(one, 3));
        series1.getData().add(new XYChart.Data(two, 4));
        series1.getData().add(new XYChart.Data(three,6));
        series1.getData().add(new XYChart.Data(four,8));
        series1.getData().add(new XYChart.Data(five, 10));
        series1.getData().add(new XYChart.Data(six, 9));
        series1.getData().add(new XYChart.Data(seven, 5));
        series1.getData().add(new XYChart.Data(eight, 3));
        series1.getData().add(new XYChart.Data(nine, 6));

        Scene scene  = new Scene(bc,800,600);
        bc.getData().addAll(series1);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}