package main;

import javafx.beans.property.SimpleStringProperty;

/**
 * @author Wojciech Wasilewski
 * @date Created on 26.03.2019
 */
public class TableValues {

    //uzywam SimpleStringProperty do TableView bo ma listenery i moge potem z tym cos zrobic
    private SimpleStringProperty btn;
    private SimpleStringProperty sbvsBtnLimp;
    private SimpleStringProperty sbvsBtn;
    private SimpleStringProperty sbvsBB;
    private SimpleStringProperty bbvsBtn;
    private SimpleStringProperty bbvsBtnLimp;
    private SimpleStringProperty bbvs2pp;
    private SimpleStringProperty bbvs2ppLimp;
    private SimpleStringProperty bbvsSB;
    private SimpleStringProperty bbvsSBLimp;

    //taki konstruktor by bylo latwiej, beda podawane Stringi a on bedzie sobie sam zamienial
    public TableValues(String btn, String sbvsBtnLimp, String sbvsBtn, String sbvsBB, String bbvsBtn,
                       String bbvsBtnLimp, String bbvs2pp, String bbvs2ppLimp, String bbvsSB, String bbvsSBLimp) {
        this.btn = new SimpleStringProperty(btn);
        this.sbvsBtnLimp = new SimpleStringProperty(sbvsBtnLimp);
        this.sbvsBtn = new SimpleStringProperty(sbvsBtn);
        this.sbvsBB = new SimpleStringProperty(sbvsBB);
        this.bbvsBtn = new SimpleStringProperty(bbvsBtn);
        this.bbvsBtnLimp = new SimpleStringProperty(bbvsBtnLimp);
        this.bbvs2pp = new SimpleStringProperty(bbvs2pp);
        this.bbvs2ppLimp = new SimpleStringProperty(bbvs2ppLimp);
        this.bbvsSB = new SimpleStringProperty(bbvsSB);
        this.bbvsSBLimp = new SimpleStringProperty(bbvsSBLimp);
    }

    public String getBtn() {
        return btn.get();
    }

    public void setBtn(String btn) {
        this.btn.set(btn);
    }

    public String getSbvsBtnLimp() {
        return sbvsBtnLimp.get();
    }

    public void setSbvsBtnLimp(String SBvsBTNLimp) {
        this.sbvsBtnLimp.set(SBvsBTNLimp);
    }

    public String getSbvsBtn() {
        return sbvsBtn.get();
    }

    public void setSbvsBtn(String SBvsBtn) {
        this.sbvsBtn.set(SBvsBtn);
    }

    public String getSbvsBB() {
        return sbvsBB.get();
    }

    public void setSbvsBB(String SBvsBB) {
        this.sbvsBB.set(SBvsBB);
    }

    public String getBbvsBtn() {
        return bbvsBtn.get();
    }

    public void setBbvsBtn(String BBvsBtn) {
        this.bbvsBtn.set(BBvsBtn);
    }

    public String getBbvsBtnLimp() {
        return bbvsBtnLimp.get();
    }

    public void setBbvsBtnLimp(String BBvsBtnLimp) {
        this.bbvsBtnLimp.set(BBvsBtnLimp);
    }

    public String getBbvs2pp() {
        return bbvs2pp.get();
    }

    public void setBbvs2pp(String BBvs2pp) {
        this.bbvs2pp.set(BBvs2pp);
    }

    public String getBbvs2ppLimp() {
        return bbvs2ppLimp.get();
    }

    public void setBbvs2ppLimp(String BBvs2ppLimp) {
        this.bbvs2ppLimp.set(BBvs2ppLimp);
    }

    public String getBbvsSB() {
        return bbvsSB.get();
    }

    public void setBbvsSB(String BBvsSB) {
        this.bbvsSB.set(BBvsSB);
    }

    public String getBbvsSBLimp() {
        return bbvsSBLimp.get();
    }

    public void setBbvsSBLimp(String BBvsSBLimp) {
        this.bbvsSBLimp.set(BBvsSBLimp);
    }
}
