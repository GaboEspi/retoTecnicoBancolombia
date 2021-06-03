package co.com.choucair.retotecnicobancolombia.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestSignupDevicePage {
    public static final Target SELECT_COMPUTER = Target.the("to input the operating system on her computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target INPUT_COMPUTER = Target.the("to select the operating system on her computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target OPTION_COMPUTER = Target.the("to select the operating system on her computer")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-3-0\"]/span/div/span"));


    public static final Target SELECT_VERSION = Target.the("to activate the input version of operating system")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_VERSION = Target.the("to input version of operating system")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target OPTION_VERSION = Target.the("to selEct version of operating system")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-4-0\"]/span/div"));


    public static final Target SELECT_LANGUAGE = Target.the("to activate the input language of operating system")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_LANGUAGE = Target.the("to input language of operating system")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target OPTION_LANGUAGE = Target.the("to selEct language of operating system")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-5-0\"]/span/div"));


    public static final Target SELECT_MOBILE = Target.the("to activate the input option of mobile")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_MOBILE = Target.the("to input mobile")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target OPTION_MOBILE = Target.the("to select mobile")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-6-0\"]/span/div/span"));


    public static final Target SELECT_MODEL = Target.the("to activate the input model of mobile")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_MODEL = Target.the("to input model of mobile")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target OPTION_MODEL = Target.the("to select model of mobile")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-7-0\"]/span/div/span"));


    public static final Target SELECT_OP = Target.the("to activate the input op of mobile")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_OP = Target.the("to input op of mobile")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target OPTION_OP = Target.the("to select op of mobile")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-8-0\"]/span/div/span"));


    public static final Target BUTTON_NEXT_STEP = Target.the("to GO TO NEXT STEP")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
