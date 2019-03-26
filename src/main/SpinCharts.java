package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author Wojciech Wasilewski
 * @date Created on 26.03.2019
 */
public class SpinCharts extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("fxmlfiles/spinCharts.fxml"));

        StackPane stackPane = loader.load();
        Scene scene = new Scene(stackPane);

        primaryStage.getIcons().add(new Image("main/diamond.png"));
        primaryStage.setOnCloseRequest(event -> {
            SpinChartsController spinCC = new SpinChartsController();
            spinCC.closeProgram();
        });
        primaryStage.setScene(scene);
        primaryStage.setTitle("SpinCharts");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
