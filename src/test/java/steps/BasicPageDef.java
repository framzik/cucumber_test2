package steps;

import io.cucumber.java.en.Then;
import pages.BasicPage;

public class BasicPageDef {

    BasicPage basicPage = new BasicPage();

    @Then("Click {string} button")
    public void clickButton(String btnName) {
        basicPage.click(btnName);
    }

    @Then("Click {string} button span")
    public void clickButtonSpan(String btnName) {
        basicPage.clickBtnSpan(btnName);
    }

    @Then("Content with {string} visible")
    public void contentWithVisible(String text) {
        basicPage.contentIsVisible(text);
    }
}
