package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

//U ovom ispod delu deklarisem driver, webdriverwait ako bude potrebe i sve stranice koje cu da testiram
// public WebDriver driver;
//  public WebDriverWait wdwait;
//  public ExcelReader excelReader;

public class BaseTest {

 public static WebDriver driver;
 public WebDriverWait wdwait;

 public ExcelReader excelReader;
 public HomePage homePage;
 public String homePageUrl;
 public ElementsPage elementsPage;
 public SideBarPage sideBarPage;
 public CheckBoxPage checkBoxPage;
 public RadioButtonPage radioButtonPage;
    public JavascriptExecutor js;
    public LinksPage linksPage;
    public  WebTables webTables;
    public ButtonsPage buttonsPage;


    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        excelReader = new ExcelReader("C:\\Users\\BG HiL Computers\\OneDrive\\Desktop\\ProjekatSelenium.xlsx");
        homePage = new HomePage();
        homePageUrl = excelReader.getStringData("textBox",1,4);
        elementsPage= new ElementsPage();
        sideBarPage = new SideBarPage();
        checkBoxPage = new CheckBoxPage();
        radioButtonPage = new RadioButtonPage();
        js = (JavascriptExecutor) driver;
        linksPage = new LinksPage(driver,wdwait);
        webTables = new WebTables(driver,wdwait);
        buttonsPage = new ButtonsPage();
    }

    public void vissibilityWait(WebElement element){
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
        driver.close();
    }
}
// Tokom testiranja koristim IntelliJ Idea u kome kreiram Maven projekat iz razloga sto mi je lakse da ubacujem biblioteke preko pom fajla
//Prilikom testiranja koristim POM jer je laksi za odrzavanje, lakse se prati rad i elementi se definisu na samo jednom mestu
//Koristim i JUnit kako ne bih morao da ponavljam neke blokove koda i koristim Before, After i Test anotacije
//Mogu i da koristim TestNG ali sam izabrao JUnit
//Da izbegnem hardkodiranje koristim DataDrivenTesting kako lakse mogu da menjam/dodajem testne podatke ili uporedjujem dobijeni rezultat sa ocekivanim rezultatom
//Testiranje vrsim na Chrome browseru jer prema izvoru Chrome koristi trenutno 67% korisnika na svetu preko Desktopa
//Izvor: https://gs.statcounter.com/browser-market-share/desktop/worldwide
//Ako bude potrebe da se testira i na drugim browserima samo treba zameniti driver i ubaciti u directory. Na primer gecko driver za Firefox.


