package org.selenide.mkb;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;

public class BasketPage extends MainPage{

    MainPage mainPage = new MainPage();

    private SelenideElement firstElement =  $(By.xpath("//a [@class='ref_goods_n_p j-open-full-product-card']"));
    private SelenideElement buttonInBasket = $(By.xpath(".//button[@class='c-btn-main-lg-v1']"));


    protected void searchBasket(){
        mainPage.searchBar().setValue("корзина для мусора").pressEnter();
        firstElement.shouldBe(enabled);
    }

    protected void addInBasket(){
        firstElement.click();
        buttonInBasket.click();
    }

}
