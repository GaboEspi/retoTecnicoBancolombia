package co.com.choucair.retotecnicobancolombia.stepdefinitions;

import co.com.choucair.retotecnicobancolombia.model.*;
import co.com.choucair.retotecnicobancolombia.questions.Answer;
import co.com.choucair.retotecnicobancolombia.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Gabriel want to create a user$")
    public void thanGabrielWantToCreateAUser() {
        OnStage.theActorCalled("Gabriel").wasAbleTo(OpenUp.thePage(), (SignUp.onThePage()));
    }

    @When("^he type his personal data on the utest platform signUp step one$")
    public void heTypeHisPersonalDataOnTheUtestPlatformSignUpStepOne(List<UtestPersonalData> utestPersonalData) {
        OnStage.theActorInTheSpotlight().attemptsTo(WritePersonalData.onStep1(utestPersonalData.get(0).getStrFirstName(),
                utestPersonalData.get(0).getStrLastName(),
                utestPersonalData.get(0).getStrEmail(),
                utestPersonalData.get(0).getStrMonth(),
                utestPersonalData.get(0).getStrDay(),
                utestPersonalData.get(0).getStrYear()
        ));
    }

    @When("^he type his address data on the utest platform signUp step two$")
    public void heTypeHisAddressDataOnTheUtestPlatformSignUpStepTwo(List<UtestLocationData> utestLocationData) {
        OnStage.theActorInTheSpotlight().attemptsTo(WriteLocationData.onStep2(utestLocationData.get(0).getStrPostalCode()));
    }

    @When("^he type his devices data on the utest platform signUp step tree$")
    public void heTypeHisDevicesDataOnTheUtestPlatformSignUpStepTree(List<UtestDeviceData> utestDeviceData) {
        OnStage.theActorInTheSpotlight().attemptsTo(WriteDeviceData.onStep3(utestDeviceData.get(0).getStrComputer(),
                utestDeviceData.get(0).getStrVersion(),
                utestDeviceData.get(0).getStrLanguage(),
                utestDeviceData.get(0).getStrMobile(),
                utestDeviceData.get(0).getStrModel(),
                utestDeviceData.get(0).getStrOp()
        ));
    }

    @When("^he type his security acces data on the utest platform signUp step four$")
    public void heTypeHisSecurityAccesDataOnTheUtestPlatformSignUpStepFour(List<UtestSecurityData> utestSecurityData) {
        OnStage.theActorInTheSpotlight().attemptsTo(WriteSecurityData.onStep4(utestSecurityData.get(0).getStrPassword()));
    }

    @Then("^he finally create a user on the utest platform$")
    public void heFinallyCreateAUserOnTheUtestPlatform(List<UtestQuestionData> utestQuestionData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestQuestionData.get(0).getStrQwestion())));
    }
}
