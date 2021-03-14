package org.selenide.mkb;

import com.codeborne.selenide.ElementsCollection;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class HeadphonesTest extends HeadphonesPage {

    HeadphonesPage headphones = new HeadphonesPage();
    MainPage mainPage = new MainPage();

    private ElementsCollection headphonesIcons = $$(By.xpath("//div[@class='dtList-inner']"));

/* Тест поиска наушников*/
    @Test
    public void SearchHeadphones() {
        mainPage.openPage();        // открываем главную страницу
        headphones.searchHeadphones();      // ищем наушники в поисковой строке
        headphones.inputPriceInFilter("2000", "5000");    // вводим значение в фильтр цены
        headphonesIcons.shouldHaveSize(3);     // проверяем, что отобразились только трое наушников
    }
}
