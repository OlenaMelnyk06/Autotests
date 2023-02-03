package Tesst;

import PageObject.RozetkaHomePageElements;
import PageObject.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLanguage extends TestInit {
    @Test
    public void Language() {
        RozetkaHomePageElements rozetkahome = new RozetkaHomePageElements(driver);
        driver.navigate();
        driver.manage().window().maximize();
        goToRozetka();
        sleep(5);
        rozetkahome.chooseLanguage().click();
        rozetkahome.waitUntilElementIdClickAble(rozetkahome.chooseLanguage());
        rozetkahome.getLeftWindow().click();
        rozetkahome.waitUntilElementIdClickAble(rozetkahome.getLeftWindow());
        rozetkahome.closeLeftWindow();
        rozetkahome.waitUntilElementIdClickAble(rozetkahome.closeLeftWindow());
        rozetkahome.Korzyna().click();
        sleep(3);

        Assert.assertTrue(getURL().contains("https://rozetka.com.ua/"));
    }
}
