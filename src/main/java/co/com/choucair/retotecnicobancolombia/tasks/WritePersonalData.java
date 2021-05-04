package co.com.choucair.retotecnicobancolombia.tasks;

import co.com.choucair.retotecnicobancolombia.userinterface.UtestSingupPersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.support.ui.Select;

public class WritePersonalData implements Task {
//    private String firstName;
//    private String lastName;
//    private String email;
//    private String month;
//    private String day;
//    private String year;
//
//    public WritePersonalData(String firstName, String lastName, String email, String month, String day, String year) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.month = month;
//        this.day = day;
//        this.year = year;
//    }

    public static WritePersonalData onStep1() {
        return Tasks.instrumented(WritePersonalData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue("gabriel jaime").into(UtestSingupPersonalPage.INPUT_FIRSTNAME),
            Enter.theValue("espitia genes").into(UtestSingupPersonalPage.INPUT_LASTNAME),
            Enter.theValue("gaesge@hotmail.com").into(UtestSingupPersonalPage.INPUT_EMAIL),
            SelectFromOptions.byVisibleText("May").from(UtestSingupPersonalPage.DAY_BIRTH_MONTH),
            SelectFromOptions.byVisibleText("5").from(UtestSingupPersonalPage.DAY_BIRTH_DAY),
            SelectFromOptions.byVisibleText("1993").from(UtestSingupPersonalPage.DAY_BIRTH_YEAR),
            Click.on(UtestSingupPersonalPage.BUTTON_NEXT_SPET)

        );
    }
}
