package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WorkPage {

    private SelenideElement workButton = $(By.xpath("//a[contains(.,'Устроиться')]"));
    private SelenideElement lastName = $(By.id("lastName"));
    private SelenideElement firstName = $(By.id("firstName"));
    private SelenideElement workPlace = $(By.xpath("//input[@id='workPlace']/parent::*"));
    private SelenideElement phone = $(By.id("phone"));

    public void sckrollDown(){
        $(By.xpath("//a[contains(.,'Трудоустройство')]")).scrollTo().click();
    }

    public void applicationForm() {
        workButton.click();
        lastName.setValue("Иванов");
        firstName.setValue("Иван");
        workPlace.click();
//        workPlace.sendKeys(Keys.DOWN);
//        workPlace.pressEnter();
        phone.setValue("9537469911");
    }
}
