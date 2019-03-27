package main;

import javafx.beans.property.SimpleStringProperty;

/**
 * @author Wojciech Wasilewski
 * @date Created on 26.03.2019
 */
public class TableValues {

    //uzywam SimpleStringProperty do TableView bo ma listenery i moge potem z tym cos zrobic
    private SimpleStringProperty Btn;
    private SimpleStringProperty SBvsBtnLimp;
    private SimpleStringProperty SBvsBtn;
    private SimpleStringProperty SBvsBB;
    private SimpleStringProperty BBvsBtn;
    private SimpleStringProperty BBvsBtnLimp;
    private SimpleStringProperty BBvs2pp;
    private SimpleStringProperty BBvs2ppLimp;
    private SimpleStringProperty BBvsSB;
    private SimpleStringProperty BBvsSBLimp;

    //taki konstruktor by bylo latwiej, beda podawane Stringi a on bedzie sobie sam zamienial
    public TableValues(String btn, String SBvsBtnLimp, String SBvsBtn, String SBvsBB, String BBvsBtn,
                       String BBvsBtnLimp, String BBvs2pp, String BBvs2ppLimp, String BBvsSB, String BBvsSBLimp) {
        this.Btn = new SimpleStringProperty(btn);
        this.SBvsBtnLimp = new SimpleStringProperty(SBvsBtnLimp);
        this.SBvsBtn = new SimpleStringProperty(SBvsBtn);
        this.SBvsBB = new SimpleStringProperty(SBvsBB);
        this.BBvsBtn = new SimpleStringProperty(BBvsBtn);
        this.BBvsBtnLimp = new SimpleStringProperty(BBvsBtnLimp);
        this.BBvs2pp = new SimpleStringProperty(BBvs2pp);
        this.BBvs2ppLimp = new SimpleStringProperty(BBvs2ppLimp);
        this.BBvsSB = new SimpleStringProperty(BBvsSB);
        this.BBvsSBLimp = new SimpleStringProperty(BBvsSBLimp);
    }

    public String getBtn() {
        return Btn.get();
    }

    public void setBtn(String btn) {
        this.Btn.set(btn);
    }

    public String getSBvsBtnLimp() {
        return SBvsBtnLimp.get();
    }

    public void setSBvsBtnLimp(String SBvsBTNLimp) {
        this.SBvsBtnLimp.set(SBvsBTNLimp);
    }

    public String getSBvsBtn() {
        return SBvsBtn.get();
    }

    public void setSBvsBtn(String SBvsBtn) {
        this.SBvsBtn.set(SBvsBtn);
    }

    public String getSBvsBB() {
        return SBvsBB.get();
    }

    public void setSBvsBB(String SBvsBB) {
        this.SBvsBB.set(SBvsBB);
    }

    public String getBBvsBtn() {
        return BBvsBtn.get();
    }

    public void setBBvsBtn(String BBvsBtn) {
        this.BBvsBtn.set(BBvsBtn);
    }

    public String getBBvsBtnLimp() {
        return BBvsBtnLimp.get();
    }

    public void setBBvsBtnLimp(String BBvsBtnLimp) {
        this.BBvsBtnLimp.set(BBvsBtnLimp);
    }

    public String getBBvs2pp() {
        return BBvs2pp.get();
    }

    public void setBBvs2pp(String BBvs2pp) {
        this.BBvs2pp.set(BBvs2pp);
    }

    public String getBBvs2ppLimp() {
        return BBvs2ppLimp.get();
    }

    public void setBBvs2ppLimp(String BBvs2ppLimp) {
        this.BBvs2ppLimp.set(BBvs2ppLimp);
    }

    public String getBBvsSB() {
        return BBvsSB.get();
    }

    public void setBBvsSB(String BBvsSB) {
        this.BBvsSB.set(BBvsSB);
    }

    public String getBBvsSBLimp() {
        return BBvsSBLimp.get();
    }

    public void setBBvsSBLimp(String BBvsSBLimp) {
        this.BBvsSBLimp.set(BBvsSBLimp);
    }
}
