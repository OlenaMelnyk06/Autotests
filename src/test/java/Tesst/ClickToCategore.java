package Tesst;

import PageObject.RozetkaHomePageElements;
import PageObject.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickToCategore extends TestInit {
    @Test
    public void ClickToCategore(){
        RozetkaHomePageElements rozetkahome = new RozetkaHomePageElements(driver);
        driver.navigate();
        driver.manage().window().maximize();
        goToSite("ROZETKA");
        sleep(5);
        rozetkahome.ClickOnWear().click();
        rozetkahome.waitUntilElementIdClickAble(rozetkahome.ClickOnWear());
        rozetkahome.ClickToCatecories().click();
        rozetkahome.waitUntilElementIdClickAble(rozetkahome.ClickToCatecories());

        Assert.assertTrue(rozetkahome.ClickToCatecories().isDisplayed());
    }
}
