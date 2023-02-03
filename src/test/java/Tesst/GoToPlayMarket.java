package Tesst;

import PageObject.RozetkaHomePageElements;
import PageObject.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoToPlayMarket extends TestInit {
    @Test
    public void ClickToCategore() {
        RozetkaHomePageElements rozetkahome = new RozetkaHomePageElements(driver);
        driver.navigate();
        driver.manage().window().maximize();
        goToSite("ROZETKA");
        sleep(5);
        rozetkahome.ClickToCooglePlay().click();
        sleep(3);

        Assert.assertTrue(rozetkahome.ClickToCooglePlay().isDisplayed());
    }
}
