package PageObject;

import org.openqa.selenium.WebDriver;

public class RozetkaPageHelper extends RozetkaHomePageElements{
    public RozetkaPageHelper(WebDriver driver){
        super(driver);
    }
    public void navigateRozetka(){driver.get("https://rozetka.com.ua/");}
}
