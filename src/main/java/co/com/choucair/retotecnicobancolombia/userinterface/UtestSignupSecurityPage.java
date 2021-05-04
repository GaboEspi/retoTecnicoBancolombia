package co.com.choucair.retotecnicobancolombia.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestSignupSecurityPage extends PageObject {
        public static final Target INPUT_PASSWORD = Target.the("to input password")
                .located(By.id("password"));
        public static final Target INPUT_PASSWORD_CONFIRM = Target.the("to input confirm password")
                .located(By.id("confirmPassword"));
        public static final Target CHECK_TERMS_USE = Target.the("to check for accept temrs of use")
                .located(By.id("termOfUse"));
        public static final Target CHECK_PRIVACY_POLICY = Target.the("to check for accept privacy and security policy")
                .located(By.id("privacySetting"));
        public static final Target BUTTON_COMPLETE_SETUP = Target.the("to click and complete the creation user process ")
                .located(By.id("laddaBtn"));

}
