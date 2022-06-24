package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage extends BaseTest {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement radioButtonTitle;
    WebElement yesButton;
    WebElement impressiveButton;
    WebElement yesConfirmationMessage;
    WebElement impressiveConfirmationMessage;

    public WebElement getRadioButtonTitle() {
        return driver.findElement(By.className("main-header"));
    }

    public WebElement getYesButton() {return driver.findElement(By.className("custom-control-input"));
    }

    public WebElement getImpressiveButton() {
        return driver.findElement(By.id("impressiveRadio"));
    }

    public WebElement getYesConfirmationMessage() {
        return driver.findElement(By.xpath("//span[text()='Yes']"));
    }

    public WebElement getImpressiveConfirmationMessage() {
        return driver.findElement(By.xpath("//span[text()='Impressive']"));
    }



    public void ClickOnYesButton(){
        getYesButton().click();
    }

    public void ClickOnImpressiveButton(){
        getImpressiveButton().click();
    }


}