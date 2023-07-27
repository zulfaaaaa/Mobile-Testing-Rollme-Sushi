package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class InvalidRegistPasswordScreen extends BasePageObject {
    private By createButton() {
        return AppiumBy.id("textViewLinkRegister");
    }
    private By nameField() { return AppiumBy.id("textInputEditTextName"); }
    private By emailFiled() {  return AppiumBy.id("textInputEditTextEmail"); }
    private By passwordField() { return AppiumBy.id("textInputEditTextPassword"); }
    private By confirmPasswordField() { return AppiumBy.id("textInputEditTextConfirmPassword"); }
    private By registerButton() { return AppiumBy.id("appCompatButtonRegister"); }
    private By errorMessageOnPasswordField() { return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.support.v7.widget.LinearLayoutCompat/TextInputLayout[4]/android.widget.LinearLayout/android.widget.TextView"); }

    @Step
    public void onLoginPageFoRegist() { Assert.assertTrue(waitUntilVisible(createButton()).isDisplayed()); }
    @Step
    public void tapCreateButton() {onClick(createButton());}
    @Step
    public void inputName(String name) { onType(nameField(), name);}
    @Step
    public void inputEmailRegist(String email) { onType(emailFiled(), email);}
    @Step
    public void inputPasswordRegist(String password) { onType(passwordField(), password);}
    @Step
    public void inputConfirmPassword(String confirmPassword) { onType(confirmPasswordField(), confirmPassword);}
    @Step
    public void tapRegistButton() {onClick(registerButton());}
    @Step
    public String getErrorMessagePasswordField() {return waitUntilVisible(errorMessageOnPasswordField()).getText();
    }


}
