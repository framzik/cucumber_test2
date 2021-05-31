package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {
    public void click(String text) {
        $(By.xpath("//*[@id=\"__next\"]/section[1]/div[1]/div[4]/div[1]/div/a[text()='" + text + "']")).click();
    }

    public void clickBtnSpan(String text) {
        $(By.xpath("//span[text()='" + text + "']/..")).click();
    }

    public void contentIsVisible(String text) {
        $(By.xpath("//*[text()='" + text + "']")).shouldBe(Condition.visible);
    }

}
