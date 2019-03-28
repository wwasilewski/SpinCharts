package main;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableCell;
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
    TableColumn<TableValues, String> sbvsBtnLimp;
    @FXML
    TableColumn<TableValues, String> sbvsBtn;
    @FXML
    TableColumn<TableValues, String> sbvsBB;
    @FXML
    TableColumn<TableValues, String> bbvsBtn;
    @FXML
    TableColumn<TableValues, String> bbvsBtnLimp;
    @FXML
    TableColumn<TableValues, String> bbvs2pp;
    @FXML
    TableColumn<TableValues, String> bbvs2ppLimp;
    @FXML
    TableColumn<TableValues, String> bbvsSB;
    @FXML
    TableColumn<TableValues, String> bbvsSBLimp;

    @SuppressWarnings("Duplicates")
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //ustawia kolumny w tabeli
        btn.setCellValueFactory(new PropertyValueFactory<TableValues, String>("btn"));
        sbvsBtnLimp.setCellValueFactory(new PropertyValueFactory<TableValues, String>("sbvsBtnLimp"));
        sbvsBtn.setCellValueFactory(new PropertyValueFactory<TableValues, String>("sbvsBtn"));
        sbvsBB.setCellValueFactory(new PropertyValueFactory<TableValues, String>("sbvsBB"));
        bbvsBtn.setCellValueFactory(new PropertyValueFactory<TableValues, String>("bbvsBtn"));
        bbvsBtnLimp.setCellValueFactory(new PropertyValueFactory<TableValues, String>("bbvsBtnLimp"));
        bbvs2pp.setCellValueFactory(new PropertyValueFactory<TableValues, String>("bbvs2pp"));
        bbvs2ppLimp.setCellValueFactory(new PropertyValueFactory<TableValues, String>("bbvs2ppLimp"));
        bbvsSB.setCellValueFactory(new PropertyValueFactory<TableValues, String>("bbvsSB"));
        bbvsSBLimp.setCellValueFactory(new PropertyValueFactory<TableValues, String>("bbvsSBLimp"));

        //dodanie danych do tabeli (dodawane wierszami)
        tableView.setItems(getDataForTheTable());

        //kod do tworzenia komorek w kolumnach i ustawienia listenera
        btn.setCellFactory(param -> new TableCell<TableValues, String>() {
            @Override
            public void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty) {
                    setText(null);
                    setCursor(Cursor.DEFAULT);
                    setOnMouseClicked(null);
                } else {
                    setText(item);
                    setCursor(Cursor.HAND);
                    setOnMouseClicked(event -> {
                        System.out.println("Clicked on " + item);
                        //tu co robic na klik
                    });
                }
            }
        });

        sbvsBtnLimp.setCellFactory(param -> new TableCell<TableValues, String>() {
            @Override
            public void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty) {
                    setText(null);
                    setCursor(Cursor.DEFAULT);
                    setOnMouseClicked(null);
                } else {
                    setText(item);
                    setCursor(Cursor.HAND);
                    setOnMouseClicked(event -> {
                        System.out.println("Clicked on " + item);
                        //tu co robic na klik
                    });
                }
            }
        });

        sbvsBtn.setCellFactory(param -> new TableCell<TableValues, String>() {
            @Override
            public void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty) {
                    setText(null);
                    setCursor(Cursor.DEFAULT);
                    setOnMouseClicked(null);
                } else {
                    setText(item);
                    setCursor(Cursor.HAND);
                    setOnMouseClicked(event -> {
                        System.out.println("Clicked on " + item);
                        //tu co robic na klik
                    });
                }
            }
        });

        sbvsBB.setCellFactory(param -> new TableCell<TableValues, String>() {
            @Override
            public void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty) {
                    setText(null);
                    setCursor(Cursor.DEFAULT);
                    setOnMouseClicked(null);
                } else {
                    setText(item);
                    setCursor(Cursor.HAND);
                    setOnMouseClicked(event -> {
                        System.out.println("Clicked on " + item);
                        //tu co robic na klik
                    });
                }
            }
        });

        bbvsBtn.setCellFactory(param -> new TableCell<TableValues, String>() {
            @Override
            public void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty) {
                    setText(null);
                    setCursor(Cursor.DEFAULT);
                    setOnMouseClicked(null);
                } else {
                    setText(item);
                    setCursor(Cursor.HAND);
                    setOnMouseClicked(event -> {
                        System.out.println("Clicked on " + item);
                        //tu co robic na klik
                    });
                }
            }
        });

        bbvsBtnLimp.setCellFactory(param -> new TableCell<TableValues, String>() {
            @Override
            public void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty) {
                    setText(null);
                    setCursor(Cursor.DEFAULT);
                    setOnMouseClicked(null);
                } else {
                    setText(item);
                    setCursor(Cursor.HAND);
                    setOnMouseClicked(event -> {
                        System.out.println("Clicked on " + item);
                        //tu co robic na klik
                    });
                }
            }
        });

        bbvs2pp.setCellFactory(param -> new TableCell<TableValues, String>() {
            @Override
            public void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty) {
                    setText(null);
                    setCursor(Cursor.DEFAULT);
                    setOnMouseClicked(null);
                } else {
                    setText(item);
                    setCursor(Cursor.HAND);
                    setOnMouseClicked(event -> {
                        System.out.println("Clicked on " + item);
                        //tu co robic na klik
                    });
                }
            }
        });

        bbvs2ppLimp.setCellFactory(param -> new TableCell<TableValues, String>() {
            @Override
            public void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty) {
                    setText(null);
                    setCursor(Cursor.DEFAULT);
                    setOnMouseClicked(null);
                } else {
                    setText(item);
                    setCursor(Cursor.HAND);
                    setOnMouseClicked(event -> {
                        System.out.println("Clicked on " + item);
                        //tu co robic na klik
                    });
                }
            }
        });

        bbvsSB.setCellFactory(param -> new TableCell<TableValues, String>() {
            @Override
            public void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty) {
                    setText(null);
                    setCursor(Cursor.DEFAULT);
                    setOnMouseClicked(null);
                } else {
                    setText(item);
                    setCursor(Cursor.HAND);
                    setOnMouseClicked(event -> {
                        System.out.println("Clicked on " + item);
                        //tu co robic na klik
                    });
                }
            }
        });

        bbvsSBLimp.setCellFactory(param -> new TableCell<TableValues, String>() {
            @Override
            public void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty) {
                    setText(null);
                    setCursor(Cursor.DEFAULT);
                    setOnMouseClicked(null);
                } else {
                    setText(item);
                    setCursor(Cursor.HAND);
                    setOnMouseClicked(event -> {
                        System.out.println("Clicked on " + item);
                        //tu co robic na klik
                    });
                }
            }
        });
    }

    //metoda dodajaca dane do tabeli wierszami
    public ObservableList<TableValues> getDataForTheTable() {
        ObservableList<TableValues> rowsValues = FXCollections.observableArrayList();
        rowsValues.add(new TableValues(null, null, "vs AI", null, "vs AI", null,
                "vs AI", null, "vs AI", null));
        rowsValues.add(new TableValues("25+", null, null, null, null, null,
                null, null, "25+", "25+"));
        rowsValues.add(new TableValues("20-25", "20+", "20+", "20+", "20+", "20+",
                "20+", "20+", "20-25", "20-25"));
        rowsValues.add(new TableValues("16-20", "16-20", "16-20", "16-20", "16-20", "16-20",
                "16-20", "16-20", "16-20", "16-20"));
        rowsValues.add(new TableValues("13-16", "13-16", "13-16", "13-16", "13-16", "13-16",
                "13-16", "13-16", "13-16", "13-16"));
        rowsValues.add(new TableValues("10-13", "10-13", "10-13", "10-13", "10-13", "10-13",
                "10-13", "10-13", "10-13", "10-13"));
        rowsValues.add(new TableValues("9", "8-10", null, "8-10", "8-10", "8-10",
                "8-10", "8-10", "8-10", "8-10"));
        rowsValues.add(new TableValues("8", "6-8", null, "6-8", "vs 3x 20-25", null,
                null, null, "vs 2.5x-3x 20-25", "6-8"));
        rowsValues.add(new TableValues("<8", null, null, "4-6", null, null,
                null, null, null, "4-6"));
        rowsValues.add(new TableValues(null, null, null, null, null, null,
                null, null, null, null));
        rowsValues.add(new TableValues("ODDS", null, null, null, null, null,
                null, null, null, null));

        return rowsValues;
    }

    public void closeProgram() {
        Platform.exit();
        System.exit(0);
    }
}
