package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement createdLink;
    WebElement notFoundNotification;
    public LinksPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getCreatedLink() {
        return driver.findElement(By.id("created"));
    }

    public WebElement getCreatedNotification() {
        return driver.findElement(By.id("linkResponse"));
    }

    //----------------------------------------
    public void clickOnCreatedLink(){
        this.getCreatedLink().click();
    }
}