package Tesst;

import PageObject.RozetkaHomePageElements;
import PageObject.TestInit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVacansy extends TestInit {
    @Test
    public void Vacansy(){
        RozetkaHomePageElements rozetkahome = new RozetkaHomePageElements(driver);
        driver.navigate();
        driver.manage().window().maximize();
        goToSite("ROZETKA");
        sleep(5);
        rozetkahome.getVacansy().click();
        rozetkahome.waitUntilElementIdClickAble(rozetkahome.getVacansy());
        rozetkahome.PortalVacancy().click();
        rozetkahome.waitUntilElementIdClickAble(rozetkahome.PortalVacancy());

        Assert.assertTrue(getURL().contains("careers/portal/it/"));
    }
}
