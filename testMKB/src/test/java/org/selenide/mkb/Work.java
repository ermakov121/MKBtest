package org.selenide.mkb;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.MainPage;
import pages.WorkPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class Work extends WorkPage {

    private SelenideElement sendButton = $(By.xpath("//button[@type = 'submit']"));

    MainPage mainPage = new MainPage();

    @Test
    public void work() {
    mainPage.openPage();
    sckrollDown();
    switchTo().window(1);
    applicationForm();
    sendButton.shouldBe(Condition.disabled);
    }
}
