package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;

public class BasketPage{

    MainPage mainPage = new MainPage();

    private SelenideElement firstElement =  $(By.xpath("//a [@class='ref_goods_n_p j-open-full-product-card']"));
    private SelenideElement buttonInBasket = $(By.xpath(".//button[@class='c-btn-main-lg-v1']"));
    private SelenideElement nameOfProuct = $(By.xpath("//span[@class = 'name ']"));


    public void searchBasket(){
        mainPage.searchBar().setValue("корзина для мусора").pressEnter();
        firstElement.shouldBe(enabled);
    }

    public String addInBasket(){
        firstElement.click();
        buttonInBasket.click();
        return nameOfProuct.getText();
    }

}
