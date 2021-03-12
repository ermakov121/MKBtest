package org.selenide.mkb;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    public SelenideElement searchBar(){
        return $(By.id("tbSrch"));
    }

    public void openPage(){
        open("https://www.wildberries.ru/");
    }

    public void goToBasket(){
        $(By.xpath("//a[@class='my-basket']")).click();
    }
}