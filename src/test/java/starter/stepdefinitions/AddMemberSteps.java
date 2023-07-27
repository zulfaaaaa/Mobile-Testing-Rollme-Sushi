package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.AddMembership.AddMembership;
import starter.AddMembership.AddMembershipUncheckPromo;
import starter.screen.LoginScreen;

public class AddMemberSteps {
    @Steps
    AddMembership addMembership;
    @Steps
    AddMembershipUncheckPromo addMembershipUncheckPromo;

    // Valid Data
    @Given("cashier on onboarding page for add membership")
    public void cashierOnOnboardingPage() {
        addMembership.onOnboardingPageForAddMembership();
    }
    @When("cashier click first next button for add membership")
    public void cashierClickFirstNextButton() {
        addMembership.clickFirstNextButtonForAddMembership();    }
    @And("cashier click next again for add membership")
    public void cashierClickAgain() {
        addMembership.clickAgainNextButtonForAddMembership();
    }

    @And("cashier input id {string} for add membership")
    public void cashierInputId(String idCashier) {
        addMembership.inputIdForAddMembership(idCashier);
    }
    @And("cashier input password {string} for add membership")
    public void cashierInputPassword(String passCashier) {
        addMembership.inputPasswordForAddMembership(passCashier);
    }
    @And("cashier click login button for add membership")
    public void cashierClickLoginButton() {
        addMembership.clickLoginButtonForAddMembership();
    }
    @And("cashier click navigation bar")
    public void cashierClickNavBar() {
        addMembership.clickNavigation();
    }
    @And("cashier click add new membership")
    public void cashierClickMembership() {
        addMembership.clickMembership();
    }
    @And("cashier input name")
    public void cashierInputName() {
        addMembership.inputName("Zulfa Nursyadiyah");
    }
    @And("cashier input email")
    public void cashierInputEmail() {
        addMembership.inputEmail("zulfasydsrr@mail.com");
    }
    @And("cashier input phone number")
    public void cashierInputPhone() {
        addMembership.inputPhoneNumber("12345678942");
    }
    @And("cashier input birthday date")
    public void cashierInputBirthday() {
        addMembership.inputBirthDate();
    }
    @And("cashier click checkbox promo")
    public void cashierClickCheckBoxPromo() {
        addMembership.clcikCheckBoxPromo();
    }
    @And("cashier click checkbox invoice")
    public void cashierClickCheckBoxInvoice() {
        addMembership.clcikCheckBoxInvoice();
    }
    @And("cashier click add membership button")
    public void cashierSubmitMembership() {
        addMembership.clickSubmitMembership();
    }
    @Then("cashier direct to navigation menu")
    public void cashierOnNavBar() {addMembership.onNavBar();}

    // ====================== Add membership with uncheck promo ======================
    @Given("cashier on onboarding page for uncheck receive promotional")
    public void cashierOnOnboardingPageUncheckPromo() {
        addMembershipUncheckPromo.onOnboardingPageForAddMembershipUncheckPromo();
    }
    @When("cashier click first next button for uncheck receive promotional")
    public void cashierClickFirstNextButtonAddMembershipUncheckPromo() {
        addMembershipUncheckPromo.clickFirstNextButtonForAddMembershipUncheckPromo();    }
    @And("cashier click next again for uncheck receive promotional")
    public void cashierClickAgainAddMembershipUncheckPromo() {
        addMembershipUncheckPromo.clickAgainNextButtonForAddMembershipUncheckPromo();
    }
    @And("cashier input id {string} for uncheck receive promotional")
    public void cashierInputIdAddMembershipUncheckPromo(String idCashier) {
        addMembershipUncheckPromo.inputIdForAddMembershipUncheckPromo(idCashier);
    }
    @And("cashier input password {string} for uncheck receive promotional")
    public void cashierInputPasswordAddMembershipUncheckPromo(String passCashier) {
        addMembershipUncheckPromo.inputPasswordForAddMembershipUncheckPromo(passCashier);
    }
    @And("cashier click login button for uncheck receive promotional")
    public void cashierClickLoginButtonUncheckPromo() {
        addMembershipUncheckPromo.clickLoginButtonForAddMembershipUncheckPromo();
    }
    @And("cashier click navigation bar for uncheck receive promotional")
    public void cashierClickNavBarUncheckPromo() {
        addMembershipUncheckPromo.clickNavigationUncheckPromo();
    }
    @And("cashier click add new membership for uncheck receive promotional")
    public void cashierClickMembershipUncheckPromoO() {
        addMembershipUncheckPromo.clickMembershipUncheckPromo();
    }
    @And("cashier input name for uncheck receive promotional")
    public void cashierInputNameUncheckPromoO() {
        addMembershipUncheckPromo.inputNameUncheckPromo("Zulfa Nursyadiyah UncheckPromo");
    }
    @And("cashier input email for uncheck receive promotional")
    public void cashierInputEmailUncheckPromoO() {
        addMembershipUncheckPromo.inputEmailUncheckPromo("zulfasyUncheckPromo52@mail.com");
    }
    @And("cashier input phone number for uncheck receive promotional")
    public void cashierInputPhoneUncheckPromo() {
        addMembershipUncheckPromo.inputPhoneNumberUncheckPromo("858626537173");
    }
    @And("cashier input birthday date for uncheck receive promotional")
    public void cashierInputBirthdayUncheckPromo() {
        addMembershipUncheckPromo.inputBirthDateUncheckPromo();
    }
    @And("cashier click checkbox invoice for uncheck receive promotional")
    public void cashierClickCheckBoxInvoiceUncheckPromo() {
        addMembershipUncheckPromo.clcikCheckBoxInvoiceUncheckPromo();
    }
    @And("cashier click add membership button for uncheck receive promotional")
    public void cashierSubmitMembershipUncheckPromo() {
        addMembershipUncheckPromo.clickSubmitMembershipUncheckPromo();
    }
    @Then("cashier direct to navigation menu for uncheck receive promotional")
    public void cashierOnNavBarUncheckPromo() {addMembershipUncheckPromo.onNavBarUncheckPromo();}

}
