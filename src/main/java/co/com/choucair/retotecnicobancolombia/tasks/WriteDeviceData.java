package co.com.choucair.retotecnicobancolombia.tasks;

import co.com.choucair.retotecnicobancolombia.userinterface.UtestSignupDevicePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class WriteDeviceData implements Task {
    private String strComputer;
    private String strVersion;
    private String strLanguage;
    private String strMobile;
    private String strModel;
    private String strOp;

    public WriteDeviceData(String strComputer, String strVersion, String strLanguage, String strMobile, String strModel, String strOp) {
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strMobile = strMobile;
        this.strModel = strModel;
        this.strOp = strOp;
    }

    public static WriteDeviceData onStep3(String strComputer,String strVersion, String strLanguage,String strMobile, String strModel, String strOp) {
        return Tasks.instrumented(WriteDeviceData.class,strComputer,strVersion,strLanguage,strMobile,strModel,strOp);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestSignupDevicePage.SELECT_COMPUTER),
                Enter.theValue("Windows").into(UtestSignupDevicePage.INPUT_COMPUTER),
                Click.on(UtestSignupDevicePage.OPTION_COMPUTER),

                Click.on(UtestSignupDevicePage.SELECT_VERSION),
                Enter.theValue("2000").into(UtestSignupDevicePage.INPUT_VERSION),
                Click.on(UtestSignupDevicePage.OPTION_VERSION),

                Click.on(UtestSignupDevicePage.SELECT_LANGUAGE),
                Enter.theValue("Spanish").into(UtestSignupDevicePage.INPUT_LANGUAGE),
                Click.on(UtestSignupDevicePage.OPTION_LANGUAGE),

                Click.on(UtestSignupDevicePage.SELECT_MOBILE),
                Enter.theValue("Xiaomi").into(UtestSignupDevicePage.INPUT_MOBILE),
                Click.on(UtestSignupDevicePage.OPTION_MOBILE),

                Click.on(UtestSignupDevicePage.SELECT_MODEL),
                Enter.theValue("Redmi note 9s").into(UtestSignupDevicePage.INPUT_MODEL),
                Click.on(UtestSignupDevicePage.OPTION_MODEL),

                Click.on(UtestSignupDevicePage.SELECT_OP),
                Enter.theValue("Android 10").into(UtestSignupDevicePage.INPUT_OP),
                Click.on(UtestSignupDevicePage.OPTION_OP),

                Click.on(UtestSignupDevicePage.BUTTON_NEXT_STEP)

        );
    }
}
