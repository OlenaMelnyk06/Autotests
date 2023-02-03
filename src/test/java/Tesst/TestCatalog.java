package Tesst;

import PageObject.RozetkaHomePageElements;
import PageObject.TestInit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCatalog extends TestInit {
    @Test
    public void сatalog(){
        RozetkaHomePageElements rozetkahome = new RozetkaHomePageElements(driver);
        driver.navigate();
        goToSite("ROZETKA");
        rozetkahome.openCatalog().click();
        rozetkahome.waitUntilElementIdClickAble(rozetkahome.openCatalog());
        rozetkahome.getNotebook().click();
        rozetkahome.waitUntilElementIdClickAble(rozetkahome.getNotebook());
        rozetkahome.getHP().click();
        sleep(4);


        Assert.assertTrue(rozetkahome.openCatalog().isDisplayed());
        Assert.assertTrue(getURL().contains("hp-hewlett-packard/?section_id=80253"));

    }
}
