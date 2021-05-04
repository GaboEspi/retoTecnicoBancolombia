package co.com.choucair.retotecnicobancolombia.tasks;

import co.com.choucair.retotecnicobancolombia.userinterface.UtestSignupLocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class WriteLocationData implements Task {
    private String strPostalCode;

    public WriteLocationData(String strPostalCode) {
        this.strPostalCode = strPostalCode;
    }

    public static WriteLocationData onStep2(String strPostalCode) {
        return Tasks.instrumented(WriteLocationData.class,strPostalCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestSignupLocationPage.INPUT_CITY),
                Enter.theValue(strPostalCode).into(UtestSignupLocationPage.INPUT_POSTAL_CODE),
                Click.on(UtestSignupLocationPage.BUTTON_NEXT_STEP)
        );
    }
}
