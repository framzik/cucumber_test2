package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LogInPage {
    private SelenideElement emailInput = $(By.cssSelector("#email"));
    private SelenideElement passInput = $(By.cssSelector("#password"));

    public void inputEmail(String email) {
        this.emailInput.val(email);
    }

    public void inputPassword(String pass) {
        this.passInput.val(pass);
    }
}
