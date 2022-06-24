package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SideBarPage extends BaseTest {


    WebElement textBox;
    WebElement checkBox;
    WebElement radioButton;
    WebElement webTables;
    WebElement buttons;
    WebElement links;
    WebElement brokenLinks;
    WebElement uploadAndDownload;
    WebElement dynamicProperties;

    public WebElement getTextBox() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[1]/span"));
    }

    public WebElement getCheckBox() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[2]"));
    }

    public WebElement getRadioButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[3]/span"));
    }

    public WebElement getWebTables() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[4]/span"));
    }

    public WebElement getButtons() {
        return driver.findElement(By.xpath("//*[@id=\"item-4\"]"));
    }

    public WebElement getLinks() {
        return driver.findElement(By.id("item-5"));
    }

    public WebElement getBrokenLinks() {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div[1]"));
    }

    public WebElement getUploadAndDownload() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[8]/span"));
    }

    public WebElement getDynamicProperties() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[9]"));
    }

    public void clickOnTextBox(){
        getTextBox().click();
    }

    public void clickOnCheckBox(){
        getCheckBox().click();
    }

    public void clickOnRadioButton(){
        getRadioButton().click();
    }

    public void clickOnWebTables(){
        getWebTables().click();
    }

    public void clickOnButtons(){
        getButtons().click();
    }

    public void clickOnLinks(){
        getLinks().click();
    }

    public void clickOnBrokenLinks(){
        getBrokenLinks().click();
    }

    public void clickOnUploadAndDownload(){
        getUploadAndDownload().click();
    }

    public void clickOnDynamicProperties(){
        getDynamicProperties().click();
    }
}

