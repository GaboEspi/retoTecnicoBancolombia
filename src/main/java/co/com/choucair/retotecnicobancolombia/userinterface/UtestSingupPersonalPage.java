package co.com.choucair.retotecnicobancolombia.userinterface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestSingupPersonalPage extends PageObject {
//    public static final Target  = Target.the("")
//        .located(By.xpath(""));
    public static final Target INPUT_FIRSTNAME = Target.the("to input fist name ")
    .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("to input last name")
    .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("to input email")
    .located(By.id("email"));
    public static final Target DAY_BIRTH_MONTH = Target.the("to select day month of teh birth day")
    .located(By.id("birthMonth"));
    public static final Target DAY_BIRTH_DAY = Target.the("to select day of the birth day")
    .located(By.id("birthDay"));
    public static final Target DAY_BIRTH_YEAR = Target.the("to select year of the birth day")
    .located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGES = Target.the("to input languages")
    .located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target BUTTON_NEXT_SPET = Target.the("to click and go to the next step")
    .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

}
