package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaHomePageElements extends BasePage{
    public RozetkaHomePageElements(WebDriver driver){super(driver);}
    public WebElement getLeftWindow(){
        return driver.findElement(By.xpath("//button[@class='header__button ng-tns-c96-1']"));
    }
    public WebElement getDowidkowy(){
         return driver.findElement(By.xpath("//a[@class='button button--large side-menu__button ng-tns-c96-1 ng-star-inserted']"));
    }
    public WebElement getDostawka(){
        return driver.findElement(By.xpath("//a[@href='/p/97-dostavka']"));
    }
    public WebElement Yak_diye(){
        return driver.findElement(By.xpath("//a[@href='/p/36-yak-diye-dostavka-do-tochok-vydachi-rozetka']"));
    }
    public WebElement closeLeftWindow(){
        return driver.findElement(By.xpath("(//*[@class='ng-tns-c96-1'])[4]"));
    }

    public WebElement chooseLanguage(){
        return driver.findElement(By.xpath("//a[@href='https://rozetka.com.ua/']"));
    }
    public WebElement openCatalog(){
        return driver.findElement(By.xpath("//button[@class='button button--medium button--with-icon menu__toggle ng-star-inserted']"));
    }
    public WebElement getNotebook(){
        return driver.findElement(By.xpath("(//a[@href='https://rozetka.com.ua/ua/computers-notebooks/c80253/'])[1]"));
    }
    public WebElement getHP(){
        return driver.findElement(By.xpath("(//a[@class='portal-brands__item ng-star-inserted'])[3]"));
    }
    public WebElement getSearchField(){
        return driver.findElement(By.xpath("//input[@name='search']"));
    }
    public WebElement getVacansy(){
        return driver.findElement(By.xpath("//a[@href='https://rozetka.com.ua/ua/careers/']"));
    }
    public WebElement PortalVacancy(){
        return driver.findElement(By.xpath("//a[@href='https://rozetka.com.ua/ua/careers/portal/it']"));
    }
    public WebElement Korzyna(){
        return driver.findElement(By.xpath("(//*[@class='side-menu__button-icon ng-tns-c96-1'])[4]"));
    }

    public WebElement ClickOnWear(){
        return driver.findElement(By.xpath("(//a[@class='menu-categories__link'])[10]"));
    }
    public WebElement ClickToCatecories(){
        return driver.findElement(By.xpath("//a[text()=' Жінкам ']"));
    }
    public WebElement ClickToCart(){
        return driver.findElement(By.xpath("//rz-cart[@class='header-actions__component']"));
    }
    public WebElement ClickToCooglePlay(){
        return driver.findElement(By.xpath("//img[@alt='Google Play']"));
    }
    public WebElement ClickOnFilmes(){
        return driver.findElement(By.xpath("(//span[@class='VfPpkd-YVzG2b'])[3]"));
    }
    public WebElement ClickonPrybutko(){
        return driver.findElement(By.xpath("(//span[@class='ypTNYd'])[6]"));
    }
    public WebElement GoTV(){
        return driver.findElement(By.xpath("(//span[@class='ypTNYd'])[3]"));
    }

}
