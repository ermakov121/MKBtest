package org.selenide.mkb;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class HeadphonesPage extends MainPage{

    private SelenideElement startPrice = $(By.xpath("//input[@name='startN']"));
    private SelenideElement endPrice = $(By.xpath("//input[@name='endN']"));


    MainPage mainPage = new MainPage();

    protected void searchHeadphones(){
        mainPage.searchBar().setValue("наушники sennheiser hd").pressEnter();
        $(By.xpath("//a [@class='ref_goods_n_p j-open-full-product-card']")).shouldHave(text("Наушники"));
    }

    public void inputPriceInFilter(String priceStart, String priceEnd){
        startPrice.shouldBe(enabled).click();
        mainPage.cleanField(startPrice);
        startPrice.setValue(priceStart);
        mainPage.cleanField(endPrice);
        endPrice.setValue(priceEnd).pressEnter();
    }
}
