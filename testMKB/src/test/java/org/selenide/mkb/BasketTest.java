package org.selenide.mkb;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BasketTest extends BasketPage{

    MainPage mainPage = new MainPage();
    BasketPage basketPage = new BasketPage();


    @Test
    public void basketTest() {
        mainPage.openPage();        // открываем главную страницу
        basketPage.searchBasket();      // ищем корзину для мусора
        basketPage.addInBasket();       // добавляем товар в корзину
        mainPage.goToBasket();      // переходим в корзину
        $(By.xpath("//span[@class='good-name']")).shouldHave(text("Корзина"));


    }
}
