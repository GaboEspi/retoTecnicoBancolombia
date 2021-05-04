package co.com.choucair.retotecnicobancolombia.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestSignupFinish {
    public static final Target WELCOME_TEXT = Target.the("The welcome message when user is registered")
            .located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
