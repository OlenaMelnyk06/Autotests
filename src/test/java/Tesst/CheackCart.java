package Tesst;

import PageObject.RozetkaHomePageElements;
import PageObject.TestInit;
import com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheackCart extends TestInit {
    @Test
    public void ClickToCart() {
        RozetkaHomePageElements rozetkahome = new RozetkaHomePageElements(driver);
        driver.navigate();
        driver.manage().window().maximize();
        goToSite("ROZETKA");
        sleep(5);
        rozetkahome.ClickToCart().click();
        rozetkahome.waitUntilElementIdClickAble(rozetkahome.ClickToCart());


        Assert.assertTrue(rozetkahome.ClickToCart().isDisplayed());
    }
}