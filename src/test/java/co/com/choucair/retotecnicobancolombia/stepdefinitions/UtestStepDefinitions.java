package co.com.choucair.retotecnicobancolombia.stepdefinitions;

import co.com.choucair.retotecnicobancolombia.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Gabriel want to create a user$")
    public void thanGabrielWantToCreateAUser() {
        OnStage.theActorCalled("Gabriel").wasAbleTo(OpenUp.thePage(), (SignUp.onThePage()));
    }

//    @When("^he type his data on the utest platform$")
//    public void heTypeHisDataOnTheUtestPlatform() {
//        OnStage.theActorInTheSpotlight().attemptsTo(WritePersonalData.onStep1());
//    }

    @When("^he type his personal data on the utest platform signUp step one$")
    public void heTypeHisPersonalDataOnTheUtestPlatformSignUpStepOne() {
        OnStage.theActorInTheSpotlight().attemptsTo(WritePersonalData.onStep1());
    }

    @When("^he type his address data on the utest platform signUp step two$")
    public void heTypeHisAddressDataOnTheUtestPlatformSignUpStepTwo() {
        OnStage.theActorInTheSpotlight().attemptsTo(WriteLocationData.onStep2());
    }

    @When("^he type his devices data on the utest platform signUp step tree$")
    public void heTypeHisDevicesDataOnTheUtestPlatformSignUpStepTree() {
        OnStage.theActorInTheSpotlight().attemptsTo(WriteDeviceData.onStep3());
    }

    @When("^he type his security acces data on the utest platform signUp step four$")
    public void heTypeHisSecurityAccesDataOnTheUtestPlatformSignUpStepFour() {
        OnStage.theActorInTheSpotlight().attemptsTo(WriteSecurityData.onStep4());
    }

    @Then("^he finally create a user on the utest platform$")
    public void heFinallyCreateAUserOnTheUtestPlatform() {
        // Write code here that turns the phrase above into concrete actions
    }
}
