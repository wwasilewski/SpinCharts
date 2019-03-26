package main;

/**
 * @author Wojciech Wasilewski
 * @date Created on 26.03.2019
 */
public class TableValues {
    private String Btn;
    private String SBvsBTNLimp;
    private String SBvsBtn;
    private String SBvsBB;
    private String BBvsBtn;
    private String BBvsBtnLimp;
    private String BBvs2pp;
    private String BBvs2ppLimp;
    private String BBvsSB;
    private String BBvsSBLimp;

    public String getBtn() {
        return Btn;
    }

    public void setBtn(String btn) {
        Btn = btn;
    }

    public String getSBvsBTNLimp() {
        return SBvsBTNLimp;
    }

    public void setSBvsBTNLimp(String SBvsBTNLimp) {
        this.SBvsBTNLimp = SBvsBTNLimp;
    }

    public String getSBvsBtn() {
        return SBvsBtn;
    }

    public void setSBvsBtn(String SBvsBtn) {
        this.SBvsBtn = SBvsBtn;
    }

    public String getSBvsBB() {
        return SBvsBB;
    }

    public void setSBvsBB(String SBvsBB) {
        this.SBvsBB = SBvsBB;
    }

    public String getBBvsBtn() {
        return BBvsBtn;
    }

    public void setBBvsBtn(String BBvsBtn) {
        this.BBvsBtn = BBvsBtn;
    }

    public String getBBvsBtnLimp() {
        return BBvsBtnLimp;
    }

    public void setBBvsBtnLimp(String BBvsBtnLimp) {
        this.BBvsBtnLimp = BBvsBtnLimp;
    }

    public String getBBvs2pp() {
        return BBvs2pp;
    }

    public void setBBvs2pp(String BBvs2pp) {
        this.BBvs2pp = BBvs2pp;
    }

    public String getBBvs2ppLimp() {
        return BBvs2ppLimp;
    }

    public void setBBvs2ppLimp(String BBvs2ppLimp) {
        this.BBvs2ppLimp = BBvs2ppLimp;
    }

    public String getBBvsSB() {
        return BBvsSB;
    }

    public void setBBvsSB(String BBvsSB) {
        this.BBvsSB = BBvsSB;
    }

    public String getBBvsSBLimp() {
        return BBvsSBLimp;
    }

    public void setBBvsSBLimp(String BBvsSBLimp) {
        this.BBvsSBLimp = BBvsSBLimp;
    }

    public TableValues(String btn, String SBvsBTNLimp, String SBvsBtn, String SBvsBB, String BBvsBtn,
                       String BBvsBtnLimp, String BBvs2pp, String BBvs2ppLimp, String BBvsSB, String BBvsSBLimp) {
        this.Btn = btn;
        this.SBvsBTNLimp = SBvsBTNLimp;
        this.SBvsBtn = SBvsBtn;
        this.SBvsBB = SBvsBB;
        this.BBvsBtn = BBvsBtn;
        this.BBvsBtnLimp = BBvsBtnLimp;
        this.BBvs2pp = BBvs2pp;
        this.BBvs2ppLimp = BBvs2ppLimp;
        this.BBvsSB = BBvsSB;
        this.BBvsSBLimp = BBvsSBLimp;
    }
}
