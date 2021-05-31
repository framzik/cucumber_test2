package steps;

import io.cucumber.java.en.Then;
import pages.LogInPage;

import static config.UserConfig.USER_EMAIL;
import static config.UserConfig.USER_PASSWORD;

public class LogInPageDef {
    LogInPage logInPage = new LogInPage();

    @Then("Input email")
    public void inputEmail() {
        logInPage.inputEmail(USER_EMAIL);
    }

    @Then("Input password")
    public void inputPassword() {
        logInPage.inputPassword(USER_PASSWORD);
    }
}
