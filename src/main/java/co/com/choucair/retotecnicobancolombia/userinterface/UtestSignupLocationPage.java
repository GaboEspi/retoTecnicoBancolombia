package co.com.choucair.retotecnicobancolombia.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestSignupLocationPage {
    public static final Target INPUT_CITY = Target.the("to input the city")
            .located(By.xpath("//*[@id=\"city\"]"));
//    public static final Target SELECT_CITY = Target.the("to input the city")
//            .located(By.xpath(""));
    public static final Target VALIDATION_CITY = Target.the("to check the city is ok")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[1]/i"));

    public static final Target INPUT_POSTAL_CODE = Target.the("to input postal code")
            .located(By.xpath("//*[@id=\"zip\"]"));
    public static final Target INPUT_COUNTRY = Target.the("to input country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target SELECT_COUNTRY = Target.the("to input country")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-62-0\"]/span/div"));

    public static final Target BUTTON_NEXT_STEP = Target.the("to click and go to the next step")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
