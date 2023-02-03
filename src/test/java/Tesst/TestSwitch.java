package Tesst;

import PageObject.RozetkaHomePageElements;
import PageObject.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSwitch extends TestInit {
    @Test
    public void ClickSwitch() {
        RozetkaHomePageElements rozetkahome = new RozetkaHomePageElements(driver);
        driver.navigate();
        driver.manage().window().maximize();
        goToPlayMarket();
        sleep(3);
        rozetkahome.ClickonPrybutko().click();
        rozetkahome.waitUntilElementIdClickAble(rozetkahome.ClickonPrybutko());
        rozetkahome.GoTV().click();
        rozetkahome.waitUntilElementIdClickAble(rozetkahome.GoTV());

        Assert.assertTrue(getURL().contains("store/games?device=tv"));


    }
}
