package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementsPage extends BaseTest {

    WebElement clickOntextbox;
    WebElement fullName;
    WebElement email;
    WebElement currentAddress;
    WebElement permanentAddress;
    WebElement subbmitButton;
    WebElement correctCredentials;
    WebElement redEmailField;

    public ElementsPage() {
    }

  //Koristila sam getere i preko findElement nalazila lokatore za trazene elemente
    //Nakon toga sam pravila metode za te elemente


    public WebElement getFullName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubbmitButton() {
        return driver.findElement(By.cssSelector(".btn.btn-primary"));
    }

    public WebElement getSelectedMessage() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/span[1]"));
    }

    public WebElement getExpandeButton() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[1]/svg/path"));
    }

    public WebElement getCollapseButton() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[2]/svg/path"));
    }

    public void insertFullName(String fullName){
        getFullName().clear();
        getFullName().sendKeys(fullName);
    }

    public void insertEmail(String email){
        getEmail().clear();
        getEmail().sendKeys(email);
    }

    public void insertCurrenntAddress(String currentAddress){
        getCurrentAddress().clear();
        getCurrentAddress().sendKeys(currentAddress);
    }

    public void insertPermanentAddress(String permanentAddress){
        getPermanentAddress().clear();
        getPermanentAddress().sendKeys(permanentAddress);
    }

    public void clickSubmitButton(){
        getSubbmitButton().click();
    }

    public WebElement getRedEmailField() {
        return driver.findElement(By.cssSelector(".mr-sm-2.field-error.form-control"));
    }
    public WebElement getCorrectCredentials() {
        return driver.findElement(By.cssSelector(".border.col-md-12.col-sm-12"));
    }





}
