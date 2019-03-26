package main;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Wojciech Wasilewski
 * @date Created on 26.03.2019
 */
public class SpinChartsController implements Initializable {

    @FXML
    MenuItem close;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void closeProgram() {
        Platform.exit();
        System.exit(0);
    }
}
