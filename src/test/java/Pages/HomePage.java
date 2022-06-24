package Pages;


import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BaseTest {

    public HomePage(){

        PageFactory.initElements(driver,this);
    }
    public @FindBy(className = "card-body")
    List<WebElement> elements;


    public void clickOnElements(){
        for(int i =0; i< elements.size();i++){
          if(elements.get(i).getText().equals("Elements")){
              elements.get(i).click();
              break;
          }
        }
    }
    public @FindBy(css = ".avatar.mx-auto.white")
    List<WebElement> forms;
    public void clickOnForms(){
        for(int i = 0; i<forms.size();i++){
            if (forms.get(i).getText().equals("Forms")){
                forms.get(i).click();
                break;
            }
        }

    }

    public  @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[3]/div/div[3]/h5")
    List<WebElement> alerts;
    public void clickOnAlertsFrameAndWindows(){
        for(int i =0;i<alerts.size();i++){
            if(alerts.get(i).getText().equals("Alerts,Frame & Windows")){
                alerts.get(i).click();
                break;
            }
        }
    }

    public @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[4]/div/div[2]/svg/path")
    List<WebElement> widgets;
    public void clickOnWidgets(){
        for (int i = 0; i<widgets.size();i++){
            if (widgets.get(i).getText().equals("Widgets")){
                widgets.get(i).click();
                break;
            }
        }
    }

    public @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[5]/div/div[2]/svg/path")
    List<WebElement> intracitons;
    public void clickOnInteractions(){
        for (int i =0; i<intracitons.size();i++){
            if(intracitons.get(i).getText().equals("Interactions")){
                intracitons.get(i).click();
                break;
            }
        }
    }

    /*public @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[1]/div/div[2]/svg")
    WebElement elementt;
    public void clickOnElement(){
        elementt.click();
    }*/

    public @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[6]/div/div[2]/svg")
    List<WebElement> bookstore;
    public void clickOnBookStoreAplication(){
        for (int i = 0; i<bookstore.size();i++){
            if (bookstore.get(i).getText().equals("Book Store Aplication")){
                bookstore.get(i).click();
                break;
            }
        }
    }
}
