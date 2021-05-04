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
    public static WriteSecurityData onStep4() {
        return Tasks.instrumented(WriteSecurityData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues("Gab34*.**$%gb").into(UtestSignupSecurityPage.INPUT_PASSWORD),
                Enter.keyValues("Gab34*.**$%gb").into(UtestSignupSecurityPage.INPUT_PASSWORD_CONFIRM),
                Click.on(UtestSignupSecurityPage.CHECK_TERMS_USE),
                Click.on(UtestSignupSecurityPage.CHECK_PRIVACY_POLICY),
                Click.on(UtestSignupSecurityPage.BUTTON_COMPLETE_SETUP)
        );
    }
}
