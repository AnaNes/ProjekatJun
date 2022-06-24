package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTables {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement editButton1;
    WebElement editFirstName1;
    WebElement submitButton;

    public WebElement getFirstName() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getDeleteButton() {
        return driver.findElement(By.id("delete-record-1"));
    }

    WebElement firstName;
    WebElement deleteButton;
    WebElement deleteButton2;
    WebElement deleteButton3;

    public WebTables(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getEditButton1() {
        return driver.findElement(By.id("edit-record-1"));
    }

    public WebElement getEditFirstName1() {
        return driver.findElement(By.xpath("/html/body/iframe[1]"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getDeleteButton2() {
        return driver.findElement(By.id("delete-record-2"));
    }

    public WebElement getDeleteButton3() {
        return driver.findElement(By.id("delete-record-3"));
    }

    //-----------------------------------

    public void clickOnEditButton1(){
        this.getEditButton1().click();
    }

    public void clickOnFirstNameButton1(){
        this.getEditFirstName1().click();
    }

    public void changeName(){

        this.getEditFirstName1().clear();
        this.getEditFirstName1().sendKeys("Ana");
    }

    public void clickOnSubmit(){
        this.getSubmitButton().click();
    }

    public void clickOnDeleteButton(){
        this.getDeleteButton().click();
    }

    public void clickOnDeletButton2(){
        this.getDeleteButton2().click();
    }

    public void clickOnDeleteButton3(){
        this.getDeleteButton3().click();
    }
}
