package starter.AddMembership;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.junit.platform.engine.discovery.PackageSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.automation.pageobject.BasePageObject;

import java.util.concurrent.TimeUnit;

public class AddMembership extends BasePageObject {
    private By onLoginPage() {
        return AppiumBy.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View");
    }
    private By nextBtn() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Next\"]");
    }
    private By nextBtn2() { return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Next\"]");}
    private By idLogin() {
        return AppiumBy.xpath("//android.view.View[@content-desc='Cashier ID']/following-sibling::android.widget.ImageView");
    }
    private By passwordLogin() {
        return AppiumBy.xpath("//android.view.View[@content-desc='Password']/following-sibling::android.widget.EditText");
    }
    private By loginButton() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }
    private By orderSushi() {
        return AppiumBy.className("android.widget.ScrollView");
    }
    private By navigationBtn() {

       return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button");
        //android.widget.Button[@content-desc="Open navigation menu"]
    }
    private By addMembership() {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Add New Membership\"]");
    }
    private By nameField() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Name\"]/following-sibling::android.widget.EditText");
    }
    private By addEmailField() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Email\"]/following-sibling::android.widget.EditText");
    }
    private By phoneField() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Phone Number\"]/following-sibling::android.widget.EditText");
    }
    private By birthField() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Birth Date\"]/following-sibling::android.view.View");
    }
    private By selectYear() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Select year\"]");
    }
    private By scrollYear() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"2014\"]");
    }
    private By selectDate() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"11, Wednesday, June 11, 2014\"]");
    }
    private By DateOK(){
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"OK\"]");
    }
    private By promoCheckbox() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.CheckBox[1]");
        //android.view.View[@content-desc="Receive promotional emails or text messages"]/following-sibling::android.widget.CheckBox
    }
    private By invoiceCheckbox() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.CheckBox[2]");
    }
    private By membershipSubmit() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Add Membership\"]");
    }

    @Step
    public void onOnboardingPageForAddMembership() {

        Assert.assertTrue(waitUntilVisible(onLoginPage()).isDisplayed());
    }

    @Step
    public void clickFirstNextButtonForAddMembership() {
        onClick(nextBtn());
    }
    @Step
    public void clickAgainNextButtonForAddMembership() {
        try {
            TimeUnit.SECONDS.sleep(5); // Menunda selama 2 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onClick(nextBtn2());
    }
    @Step
    public void inputIdForAddMembership(String idCashier) {
        try {
            TimeUnit.SECONDS.sleep(5); // Menunda selama 2 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onClick(idLogin());
        onType(idLogin(), idCashier);
    }

    @Step
    public void inputPasswordForAddMembership(String passwordLogin) {
        onClick(passwordLogin());
        onClick(passwordLogin());
        onType(passwordLogin(), passwordLogin);
    }

    @Step
    public void clickLoginButtonForAddMembership() {
        onClick(loginButton());
    }

    @Step
    public void clickNavigation() {
        waitUntilVisible(navigationBtn());
        try {
            TimeUnit.SECONDS.sleep(5); // Menunda selama 2 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onClick(navigationBtn());
    }
    @Step
    public void clickMembership() {
        onClick(addMembership());
    }
    @Step
    public void inputName(String name) {
        onClick(nameField());
        onType(nameField(), name);
    }
    @Step
    public void inputEmail(String email) {
        onClick(addEmailField());
        onClick(addEmailField());
        onType(addEmailField(), email);
    }
    @Step
    public void inputPhoneNumber(String phone) {
        onClick(phoneField());
        onClick(phoneField());
        onType(phoneField(), phone);
        getDriver().navigate().back();
    }
    @Step
    public void inputBirthDate() {
        onClick(birthField());
        onClick(selectYear());
        onClick(scrollYear());
        try {
            TimeUnit.SECONDS.sleep(2); // Menunda selama 2 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onClick(selectDate());
//        WebElement birthFieldElement = getDriver().findElement(birthField());
//        WebElement selectDateElement = getDriver().findElement(selectDate());
        onClick(DateOK());
        getDriver().navigate().back();
    }
    @Step
    public void clcikCheckBoxPromo() {
        try {
            TimeUnit.SECONDS.sleep(2); // Menunda selama 2 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onClick(promoCheckbox());
    }
    @Step
    public void clcikCheckBoxInvoice() {
        try {
            TimeUnit.SECONDS.sleep(2); // Menunda selama 2 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }onClick(invoiceCheckbox());
    }
    @Step
    public void clickSubmitMembership() {
       onClick(membershipSubmit());
    }
    @Step
    public void onNavBar() {
        Assert.assertTrue(waitUntilVisible(navigationBtn()).isDisplayed());
    }




}
