package org.selenide.mkb;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private int numberOfCharacters;

    public SelenideElement searchBar(){
        return $(By.id("tbSrch"));
    }

    public void openPage(){
        open("https://www.wildberries.ru/");
    }

    public void goToBasket(){
        $(By.xpath("//a[@class='my-basket']")).click();
    }

    public void cleanField(SelenideElement element){
        element.shouldBe(enabled).click();
        element.sendKeys(Keys.CONTROL, "A");
        numberOfCharacters = element.getValue().length();
        while (numberOfCharacters > 0){
            element.sendKeys(Keys.BACK_SPACE);
            numberOfCharacters --;
        }
    }
}