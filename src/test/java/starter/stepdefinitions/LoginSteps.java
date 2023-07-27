//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import org.junit.Assert;
//import starter.screen.LoginScreen;
//
//public class LoginSteps {
//    @Steps
//    LoginScreen login;
//
//    // Valid Data
//    @Given("cashier on onboarding page")
//    public void cashierOnOnboardingPage() {
//        login.onOnboardingPage();
//    }
//
//    @When("cashier click first next button")
//    public void cashierClickFirstNextButton() {
//        login.clickFirstNextButton();
//    }
//    @And("cashier click next again")
//    public void cashierClickNextAgain() {login.clickNextAgain();}
//
//    @And("cashier input id {string}")
//    public void cashierInputId(String idCashier) {
//        login.inputId(idCashier);
//    }
//    @And("cashier input password {string}")
//    public void cashierInputPassword(String passCashier) {
//        login.inputPassword(passCashier);
//    }
//
//    @And("cashier click login button")
//    public void cashierClickLoginButton() {
//        login.clickLoginButton();
//    }
//
//    @Then("cashier successfully login and entered the sushi order page")
//    public void cashierSuccessfullyLoginAndEnteredTheSushiOrderPage() {
//        login.successfullyLoginAndEnteredTheSushiOrderPage();
//    }
//
//    // Invalid ID
//
//    @Then("cashier still on the login page")
//    public void cashierStillOnTheLoginPage() {
//        login.cashierStillOnTheLoginPage();
//    }
//}



package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.screen.LoginScreen;

public class LoginSteps {
    @Steps
    LoginScreen login;

    // Valid Data
    @Given("cashier on onboarding page")
    public void cashierOnOnboardingPage() {
        login.onOnboardingPage();
    }

    @When("cashier click first next button")
    public void cashierClickFirstNextButton() {
        login.clickFirstNextButton();
    }
    @When("cashier click next again")
    public void cashierClickAgain() {
        login.clickAgainNextButton();
    }

    @And("cashier input id {string}")
    public void cashierInputId(String idCashier) {
        login.inputId(idCashier);
    }
    @And("cashier input password {string}")
    public void cashierInputPassword(String passCashier) {
        login.inputPassword(passCashier);
    }

    @And("cashier click login button")
    public void cashierClickLoginButton() {
        login.clickLoginButton();
    }

    @Then("cashier successfully login and entered the sushi order page")
    public void cashierSuccessfullyLoginAndEnteredTheSushiOrderPage() {
        login.successfullyLoginAndEnteredTheSushiOrderPage();
    }

    // Invalid ID

    @Then("cashier still on the login page")
    public void cashierStillOnTheLoginPage() {
        login.cashierStillOnTheLoginPage();
    }
}
