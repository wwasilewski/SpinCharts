package main;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Wojciech Wasilewski
 * @date Created on 26.03.2019
 */
public class SpinChartsController implements Initializable {

    @FXML
    MenuItem close;

    @FXML
    TableView<TableValues> tableView;

    @FXML
    TableColumn<TableValues, String> btn;

    @FXML
    TableColumn<TableValues, String> sBvsBtnLimp;

    @FXML
    TableColumn<TableValues, String> sBvsBtn;

    @FXML
    TableColumn<TableValues, String> sBvsBB;

    @FXML
    TableColumn<TableValues, String> bBvsBtn;

    @FXML
    TableColumn<TableValues, String> bBvsBtnLimp;

    @FXML
    TableColumn<TableValues, String> bBvs2pp;

    @FXML
    TableColumn<TableValues, String> bBvs2ppLimp;

    @FXML
    TableColumn<TableValues, String> bBvsSB;

    @FXML
    TableColumn<TableValues, String> bBvsSBLimp;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //ustawia kolumny w tabeli
        btn.setCellValueFactory(new PropertyValueFactory<TableValues, String>("Btn"));
        sBvsBtnLimp.setCellValueFactory(new PropertyValueFactory<TableValues, String>("sBvsBtnLimp"));
        sBvsBtn.setCellValueFactory(new PropertyValueFactory<TableValues, String>("SBvsBtn"));
        sBvsBB.setCellValueFactory(new PropertyValueFactory<TableValues, String>("SBvsBB"));
        bBvsBtn.setCellValueFactory(new PropertyValueFactory<TableValues, String>("BBvsBtn"));
        bBvsBtnLimp.setCellValueFactory(new PropertyValueFactory<TableValues, String>("BBvsBtnLimp"));
        bBvs2pp.setCellValueFactory(new PropertyValueFactory<TableValues, String>("BBvs2pp"));
        bBvs2ppLimp.setCellValueFactory(new PropertyValueFactory<TableValues, String>("BBvs2ppLimp"));
        bBvsSB.setCellValueFactory(new PropertyValueFactory<TableValues, String>("BBvsSB"));
        bBvsSBLimp.setCellValueFactory(new PropertyValueFactory<TableValues, String>("BBvsSBLimp"));

        //dodanie danych do tabeli (dodawane wierszami)
        tableView.setItems(getDataForTheTable());
    }

    //metoda dodajaca dane do tabeli wierszami
    public ObservableList<TableValues> getDataForTheTable() {
        ObservableList<TableValues> rowsValues = FXCollections.observableArrayList();
        rowsValues.add(new TableValues("1", "2", "3", "", "", "4",
                "5", "6", "", "7"));
        rowsValues.add(new TableValues("2", "2", "3", "", "", "4",
                "5", "4", "", "5"));

        return rowsValues;
    }

    public void closeProgram() {
        Platform.exit();
        System.exit(0);
    }
}
