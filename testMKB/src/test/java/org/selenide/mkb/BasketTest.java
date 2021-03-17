package org.selenide.mkb;

import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.BasketPage;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BasketTest extends BasketPage {

    MainPage mainPage = new MainPage();
    BasketPage basketPage = new BasketPage();

    private SelenideElement productName = $(By.xpath("//span[@class='good-name']"));
    private SelenideElement productNameInSearch = $(By.xpath("(//span[@class = 'goods-name c-text-sm'])[1]"));


    @Test
    public void basketTest() {
        mainPage.openPage();        // открываем главную страницу
        basketPage.searchBasket();      // ищем корзину для мусора
        String name = productNameInSearch.getText();
        basketPage.addInBasket();       // добавляем товар в корзину
        mainPage.goToBasket();      // переходим в корзину
        productName.shouldHave(text(name));     // сравниваем, что названия продуктов совпадают в каталоге и корзине


    }
}
