package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage extends BaseTest {

    WebElement clickMeButton;
    WebElement notification;

   //Koristila sam getere i metode da bih posle lakse testirala



    public WebElement getClickMeButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
    }

    public void clickOnClickMeButton(){
        this.getClickMeButton().click();
    }

    public WebElement getNotification() {
        return driver.findElement(By.id("dynamicClickMessage"));
    }
}