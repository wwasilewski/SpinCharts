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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
    ImageView imageview1, imageview2;

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
                        if ("25+".equals(item)) {
                            Image image = new Image("main/images/btn/3w_btn_25+.png");
                            imageview1.setImage(image);
                            Image image2 = new Image("main/images/btn/legendip.png");
                            imageview2.setImage(image2);
                        } else if ("20-25".equals(item)) {
                            Image image = new Image("main/images/btn/3w_btn_20-25.png");
                            imageview1.setImage(image);
                            Image image2 = new Image("main/images/btn/legendip.png");
                            imageview2.setImage(image2);
                        } else if ("16-20".equals(item)) {
                            Image image = new Image("main/images/btn/3w_btn_16-20.png");
                            imageview1.setImage(image);
                            Image image2 = new Image("main/images/btn/legendip.png");
                            imageview2.setImage(image2);
                        } else if ("13-16".equals(item)) {
                            Image image = new Image("main/images/btn/3w_btn_13-16.png");
                            imageview1.setImage(image);
                            Image image2 = new Image("main/images/btn/legendip.png");
                            imageview2.setImage(image2);
                        } else if ("10-13".equals(item)) {
                            Image image = new Image("main/images/btn/3w_btn_10-13.png");
                            imageview1.setImage(image);
                            Image image2 = new Image("main/images/btn/legendip.png");
                            imageview2.setImage(image2);
                        } else if ("9".equals(item)) {
                            Image image = new Image("main/images/btn/3w_btn_9.png");
                            imageview1.setImage(image);
                            Image image2 = new Image("main/images/btn/legendip2.png");
                            imageview2.setImage(image2);
                        } else if ("8".equals(item)) {
                            Image image = new Image("main/images/btn/3w_btn_8.png");
                            imageview1.setImage(image);
                            Image image2 = new Image("main/images/btn/legendip2.png");
                            imageview2.setImage(image2);
                        } else if ("<8".equals(item)) {
                            Image image = new Image("main/images/btn/3w_btn__8.png");
                            imageview1.setImage(image);
                            Image image2 = new Image("main/images/btn/legendip_blank.png");
                            imageview2.setImage(image2);
                        } else {
                            Image image = new Image("main/images/btn/3w_btn_odds.png");
                            imageview1.setImage(image);
                            Image image2 = new Image("main/images/btn/legendip_blank.png");
                            imageview2.setImage(image2);
                        }
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
                        if ("20+".equals(item)) {
                            Image image1 = new Image("main/images/sbvsbtnlimp/vs_btn_limp_20+.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/sbvsbtnlimp/leg2.png");
                            imageview2.setImage(image2);
                        } else if ("16-20".equals(item)) {
                            Image image1 = new Image("main/images/sbvsbtnlimp/vs_btn_limp_16-20.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/sbvsbtnlimp/leg2.png");
                            imageview2.setImage(image2);
                        } else if ("13-16".equals(item)) {
                            Image image1 = new Image("main/images/sbvsbtnlimp/vs_btn_limp_13-16.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/sbvsbtnlimp/leg2.png");
                            imageview2.setImage(image2);
                        } else if ("10-13".equals(item)) {
                            Image image1 = new Image("main/images/sbvsbtnlimp/vs_btn_limp_10-13.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/sbvsbtnlimp/leg2.png");
                            imageview2.setImage(image2);
                        } else if ("8-10".equals(item)) {
                            Image image1 = new Image("main/images/sbvsbtnlimp/vs_btn_limp_8-10.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/sbvsbtnlimp/leg2.png");
                            imageview2.setImage(image2);
                        } else {
                            Image image1 = new Image("main/images/sbvsbtnlimp/vs_btn_limp_6-8.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/sbvsbtnlimp/leg2.png");
                            imageview2.setImage(image2);
                        }
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
                        if ("vs AI".equals(item)) {
                            Image image1 = new Image("main/images/sbvsbtn/3w_sb_vs_btn_vs_ai.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/sbvsbtn/leg_blank.png");
                            imageview2.setImage(image2);
                        } else if ("20+".equals(item)) {
                            Image image1 = new Image("main/images/sbvsbtn/3w_sb_vs_btn_20+.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/sbvsbtn/legendvsmnr.png");
                            imageview2.setImage(image2);
                        } else if ("16-20".equals(item)) {
                            Image image1 = new Image("main/images/sbvsbtn/3w_sb_vs_btn_16-20.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/sbvsbtn/legendvsmnr.png");
                            imageview2.setImage(image2);
                        } else if ("13-16".equals(item)) {
                            Image image1 = new Image("main/images/sbvsbtn/3w_sb_vs_btn_13-16.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/sbvsbtn/legendvsmnr.png");
                            imageview2.setImage(image2);
                        } else {
                            Image image1 = new Image("main/images/sbvsbtn/3w_sb_vs_btn_10-13.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/sbvsbtn/legendvsmnr.png");
                            imageview2.setImage(image2);
                        }
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
                        if ("20+".equals(item)) {
                            Image image1 = new Image("main/images/sbvsbb/vs_bb_20+.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/sbvsbb/leg2.png");
                            imageview2.setImage(image2);
                        } else if ("16-20".equals(item)) {
                            Image image1 = new Image("main/images/sbvsbb/vs_bb_16-20.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/sbvsbb/leg2.png");
                            imageview2.setImage(image2);
                        } else if ("13-16".equals(item)) {
                            Image image1 = new Image("main/images/sbvsbb/vs_bb_13-16.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/sbvsbb/leg2.png");
                            imageview2.setImage(image2);
                        } else if ("10-13".equals(item)) {
                            Image image1 = new Image("main/images/sbvsbb/vs_bb_10-13.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/sbvsbb/leg2.png");
                            imageview2.setImage(image2);
                        } else if ("8-10".equals(item)) {
                            Image image1 = new Image("main/images/sbvsbb/vs_bb_8-10.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/sbvsbb/leg2.png");
                            imageview2.setImage(image2);
                        } else if ("6-8".equals(item)) {
                            Image image1 = new Image("main/images/sbvsbb/vs_bb_6-8.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/sbvsbb/leg2.png");
                            imageview2.setImage(image2);
                        } else {
                            Image image1 = new Image("main/images/sbvsbb/vs_bb_4-6.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/sbvsbb/leg2.png");
                            imageview2.setImage(image2);
                        }
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
                        if ("vs AI".equals(item)) {
                            Image image1 = new Image("main/images/bbvsbtn/vs_btn_vs_ai.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvsbtn/leg_blank.png");
                            imageview2.setImage(image2);
                        } else if ("20+".equals(item)) {
                            Image image1 = new Image("main/images/bbvsbtn/vs_btn_20+.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvsbtn/legendvsmnr.png");
                            imageview2.setImage(image2);
                        } else if ("16-20".equals(item)) {
                            Image image1 = new Image("main/images/bbvsbtn/vs_btn_16-20.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvsbtn/legendvsmnr.png");
                            imageview2.setImage(image2);
                        } else if ("13-16".equals(item)) {
                            Image image1 = new Image("main/images/bbvsbtn/vs_btn_13-16.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvsbtn/legendvsmnr.png");
                            imageview2.setImage(image2);
                        } else if ("10-13".equals(item)) {
                            Image image1 = new Image("main/images/bbvsbtn/vs_btn_10-13.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvsbtn/legendvsmnr.png");
                            imageview2.setImage(image2);
                        } else if ("8-10".equals(item)) {
                            Image image1 = new Image("main/images/bbvsbtn/vs_btn_8-10.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvsbtn/legendvsmnr.png");
                            imageview2.setImage(image2);
                        } else {
                            Image image1 = new Image("main/images/bbvsbtn/vs_btn_vs_3x_20-25.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvsbtn/legendvsmnr.png");
                            imageview2.setImage(image2);
                        }
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
                        if ("20+".equals(item)) {
                            Image image1 = new Image("main/images/bbvsbtnlimp/vs_btn_l_20+.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvsbtnlimp/legiso.png");
                            imageview2.setImage(image2);
                        } else if ("16-20".equals(item)) {
                            Image image1 = new Image("main/images/bbvsbtnlimp/vs_btn_l_16-20.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvsbtnlimp/legiso.png");
                            imageview2.setImage(image2);
                        } else if ("13-16".equals(item)) {
                            Image image1 = new Image("main/images/bbvsbtnlimp/vs_btn_l_13-16.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvsbtnlimp/legiso.png");
                            imageview2.setImage(image2);
                        } else if ("10-13".equals(item)) {
                            Image image1 = new Image("main/images/bbvsbtnlimp/vs_btn_l_10-13.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvsbtnlimp/legiso.png");
                            imageview2.setImage(image2);
                        } else {
                            Image image1 = new Image("main/images/bbvsbtnlimp/vs_btn_l_8-10.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvsbtnlimp/legiso.png");
                            imageview2.setImage(image2);
                        }
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
                        if ("vs AI".equals(item)) {
                            Image image1 = new Image("main/images/bbvs2pp/vs_2pp_vs_ai.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvs2pp/leg_blank.png");
                            imageview2.setImage(image2);
                        } else if ("20+".equals(item)) {
                            Image image1 = new Image("main/images/bbvs2pp/vs_2pp_20+.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvs2pp/legvsmnr.png");
                            imageview2.setImage(image2);
                        } else if ("16-20".equals(item)) {
                            Image image1 = new Image("main/images/bbvs2pp/vs_2pp_16-20.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvs2pp/legvsmnr.png");
                            imageview2.setImage(image2);
                        } else if ("13-16".equals(item)) {
                            Image image1 = new Image("main/images/bbvs2pp/vs_2pp_13-16.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvs2pp/legvsmnr.png");
                            imageview2.setImage(image2);
                        } else if ("10-13".equals(item)) {
                            Image image1 = new Image("main/images/bbvs2pp/vs_2pp_10-13.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvs2pp/legvsmnr.png");
                            imageview2.setImage(image2);
                        } else {
                            Image image1 = new Image("main/images/bbvs2pp/vs_2pp_8-10.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvs2pp/legvsmnr.png");
                            imageview2.setImage(image2);
                        }
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
                        if ("20+".equals(item)) {
                            Image image1 = new Image("main/images/bbvs2pplimp/vs_2pp_l_20+.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvs2pplimp/legiso.png");
                            imageview2.setImage(image2);
                        } else if ("16-20".equals(item)) {
                            Image image1 = new Image("main/images/bbvs2pplimp/vs_2pp_l_16-20.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvs2pplimp/legiso.png");
                            imageview2.setImage(image2);
                        } else if ("13-16".equals(item)) {
                            Image image1 = new Image("main/images/bbvs2pplimp/vs_2pp_l_13-16.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvs2pplimp/legiso.png");
                            imageview2.setImage(image2);
                        } else if ("10-13".equals(item)) {
                            Image image1 = new Image("main/images/bbvs2pplimp/vs_2pp_l_10-13.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvs2pplimp/legiso.png");
                            imageview2.setImage(image2);
                        } else {
                            Image image1 = new Image("main/images/bbvs2pplimp/vs_2pp_l_8-10.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvs2pplimp/legiso.png");
                            imageview2.setImage(image2);
                        }
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
                        if ("vs AI".equals(item)) {
                            Image image1 = new Image("main/images/bbvssb/vsai.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvssb/blank.png");
                            imageview2.setImage(image2);
                        } else if ("25+".equals(item)) {
                            Image image1 = new Image("main/images/bbvssb/sb25+.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvssb/leg.png");
                            imageview2.setImage(image2);
                        } else if ("20-25".equals(item)) {
                            Image image1 = new Image("main/images/bbvssb/sb20-25.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvssb/leg.png");
                            imageview2.setImage(image2);
                        } else if ("16-20".equals(item)) {
                            Image image1 = new Image("main/images/bbvssb/sb16-20.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvssb/leg.png");
                            imageview2.setImage(image2);
                        } else if ("13-16".equals(item)) {
                            Image image1 = new Image("main/images/bbvssb/sb13-16.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvssb/leg.png");
                            imageview2.setImage(image2);
                        } else if ("10-13".equals(item)) {
                            Image image1 = new Image("main/images/bbvssb/sb10-13.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvssb/leg.png");
                            imageview2.setImage(image2);
                        } else if ("8-10".equals(item)) {
                            Image image1 = new Image("main/images/bbvssb/sb8-10.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvssb/leg.png");
                            imageview2.setImage(image2);
                        } else {
                            Image image1 = new Image("main/images/bbvssb/sb3x.png");
                            imageview1.setImage(image1);
                            Image image2 = new Image("main/images/bbvssb/leg.png");
                            imageview2.setImage(image2);
                        }
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
                        if ("25+".equals(item)) {
                            Image image = new Image("main/images/bbvssblimp/sb_l25+.png");
                            imageview1.setImage(image);
                            Image image2 = new Image("main/images/bbvssblimp/leg.png");
                            imageview2.setImage(image2);
                        } else if ("20-25".equals(item)) {
                            Image image = new Image("main/images/bbvssblimp/sb_l20-25.png");
                            imageview1.setImage(image);
                            Image image2 = new Image("main/images/bbvssblimp/leg.png");
                            imageview2.setImage(image2);
                        } else if ("16-20".equals(item)) {
                            Image image = new Image("main/images/bbvssblimp/sb_l16-20.png");
                            imageview1.setImage(image);
                            Image image2 = new Image("main/images/bbvssblimp/leg.png");
                            imageview2.setImage(image2);
                        } else if ("13-16".equals(item)) {
                            Image image = new Image("main/images/bbvssblimp/sb_l13-16.png");
                            imageview1.setImage(image);
                            Image image2 = new Image("main/images/bbvssblimp/leg.png");
                            imageview2.setImage(image2);
                        } else if ("10-13".equals(item)) {
                            Image image = new Image("main/images/bbvssblimp/sb_l10-13.png");
                            imageview1.setImage(image);
                            Image image2 = new Image("main/images/bbvssblimp/leg.png");
                            imageview2.setImage(image2);
                        } else if ("8-10".equals(item)) {
                            Image image = new Image("main/images/bbvssblimp/sb_l8-10.png");
                            imageview1.setImage(image);
                            Image image2 = new Image("main/images/bbvssblimp/leg.png");
                            imageview2.setImage(image2);
                        } else if ("6-8".equals(item)) {
                            Image image = new Image("main/images/bbvssblimp/sb_l6-8.png");
                            imageview1.setImage(image);
                            Image image2 = new Image("main/images/bbvssblimp/leg.png");
                            imageview2.setImage(image2);
                        } else {
                            Image image = new Image("main/images/bbvssblimp/sb_l4-6.png");
                            imageview1.setImage(image);
                            Image image2 = new Image("main/images/bbvssblimp/leg.png");
                            imageview2.setImage(image2);
                        }
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
