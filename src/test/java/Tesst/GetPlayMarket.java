package Tesst;

import PageObject.RozetkaHomePageElements;
import PageObject.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetPlayMarket extends TestInit {
    @Test
    public void ClickToCategore() {
        RozetkaHomePageElements rozetkahome = new RozetkaHomePageElements(driver);
        driver.navigate();
        driver.manage().window().maximize();
        goToPlayMarket();
        sleep(4);
        rozetkahome.ClickOnFilmes().click();
        sleep(4);

        Assert.assertTrue(rozetkahome.ClickOnFilmes().isDisplayed());

    }
}
