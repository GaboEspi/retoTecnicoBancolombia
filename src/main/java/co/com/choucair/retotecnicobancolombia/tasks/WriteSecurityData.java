package co.com.choucair.retotecnicobancolombia.tasks;

import co.com.choucair.retotecnicobancolombia.userinterface.UtestSignupSecurityPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

public class WriteSecurityData implements Task {
    private String strPassword;

    public WriteSecurityData(String strPassword) {
        this.strPassword = strPassword;
    }

    public static WriteSecurityData onStep4(String strPassword) {
        return Tasks.instrumented(WriteSecurityData.class,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(strPassword).into(UtestSignupSecurityPage.INPUT_PASSWORD),
                Enter.keyValues(strPassword).into(UtestSignupSecurityPage.INPUT_PASSWORD_CONFIRM),
                Click.on(UtestSignupSecurityPage.CHECK_TERMS_USE),
                Click.on(UtestSignupSecurityPage.CHECK_PRIVACY_POLICY),
                Click.on(UtestSignupSecurityPage.BUTTON_COMPLETE_SETUP)
        );
    }
}
