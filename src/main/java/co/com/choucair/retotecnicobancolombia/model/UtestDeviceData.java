package co.com.choucair.retotecnicobancolombia.model;

import co.com.choucair.retotecnicobancolombia.userinterface.UtestSignupDevicePage;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class UtestDeviceData {
    private String strComputer;
    private String strVersion;
    private String strLanguage;
    private String strMobile;
    private String strModel;
    private String strOp;

    public String getStrComputer() {
        return strComputer;
    }

    public void setStrComputer(String strComputer) {
        this.strComputer = strComputer;
    }

    public String getStrVersion() {
        return strVersion;
    }

    public void setStrVersion(String strVersion) {
        this.strVersion = strVersion;
    }

    public String getStrLanguage() {
        return strLanguage;
    }

    public void setStrLanguage(String strLanguage) {
        this.strLanguage = strLanguage;
    }

    public String getStrMobile() {
        return strMobile;
    }

    public void setStrMobile(String strMobile) {
        this.strMobile = strMobile;
    }

    public String getStrModel() {
        return strModel;
    }

    public void setStrModel(String strModel) {
        this.strModel = strModel;
    }

    public String getStrOp() {
        return strOp;
    }

    public void setStrOp(String strOp) {
        this.strOp = strOp;
    }
}
