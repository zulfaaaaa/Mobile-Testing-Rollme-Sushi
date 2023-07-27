//package starter.screen;
//
//import io.appium.java_client.AppiumBy;
//import io.cucumber.java.en.Then;
//import net.thucydides.core.annotations.Step;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import test.automation.pageobject.BasePageObject;
//
//public class LoginScreen extends BasePageObject {
//    //====================== Locator ====================
//    private By onLoginPage() {
//        return AppiumBy.xpath("\t\n" +
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View");
//    }
//    private By nextBtn() {
//        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Next\"]");
//    }
//    private By nextBtn2() {
//        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Next\"]");
//    }
//    private By idLogin() {
//        return AppiumBy.xpath("//android.view.View[@content-desc='Cashier ID']/following-sibling::android.widget.ImageView");
//    }
//    private By passwordLogin() {
//        return AppiumBy.xpath("//android.view.View[@content-desc='Password']/following-sibling::android.widget.EditText");
//    }
//    private By loginButton() {
//        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
//    }
//    private By orderSushi() {
//        return AppiumBy.className("android.widget.ScrollView");
//    }
//
//    // Kalau semisal emelentnya sama 1 saja buat functionalnya
//    // Invalid ID
//
//
//    // ================== Functional ==================
//
//    // @PositiveLogin
//    @Step
//    public void onOnboardingPage() {
//
//        Assert.assertTrue(waitUntilVisible(onLoginPage()).isDisplayed());
//    }
//    @Step
//    public void clickFirstNextButton() {
//        onClick(nextBtn());
//    }
//    @Step
//    public void clickNextAgain() {
//        onClick(nextBtn2());
//    }
//    @Step
//    public void inputId(String idCashier) {
//        onClick(idLogin());
//        onType(idLogin(), idCashier);
//    }
//
//    @Step
//    public void inputPassword(String passwordLogin) {
//        onClick(passwordLogin());
//        onClick(passwordLogin());
//        onType(passwordLogin(), passwordLogin);
//    }
//
//    @Step
//    public void clickLoginButton() {
//        onClick(loginButton());
//    }
//
//    @Step
//    public void successfullyLoginAndEnteredTheSushiOrderPage() {
//        onClick(orderSushi());
//    }
//
//    // Invalid ID
//    @Step
//    public void cashierStillOnTheLoginPage() {
//        onClick(onLoginPage());
//    }
//}

package starter.screen;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

import java.util.concurrent.TimeUnit;

public class LoginScreen extends BasePageObject {
    //====================== Locator ====================
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

    // Kalau semisal emelentnya sama 1 saja buat functionalnya
    // Invalid ID


    // ================== Functional ==================

    // @PositiveLogin
    public void onOnboardingPage() {

        Assert.assertTrue(waitUntilVisible(onLoginPage()).isDisplayed());
    }

    @Step
    public void clickFirstNextButton() {
        onClick(nextBtn());
    }
    @Step
    public void clickAgainNextButton() {
        try {
            TimeUnit.SECONDS.sleep(5); // Menunda selama 2 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onClick(nextBtn2());
    }
    @Step
    public void inputId(String idCashier) {
        try {
            TimeUnit.SECONDS.sleep(5); // Menunda selama 2 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onClick(idLogin());
        onType(idLogin(), idCashier);
    }

    @Step
    public void inputPassword(String passwordLogin) {
        onClick(passwordLogin());
        onClick(passwordLogin());
        onType(passwordLogin(), passwordLogin);
    }

    @Step
    public void clickLoginButton() {
        onClick(loginButton());
    }

    @Step
    public void successfullyLoginAndEnteredTheSushiOrderPage() {
        onClick(orderSushi());
    }

    // Invalid ID
    @Step
    public void cashierStillOnTheLoginPage() {
        onClick(onLoginPage());
    }
}
