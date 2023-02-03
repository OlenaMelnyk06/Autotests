package Tesst;


import PageObject.RozetkaHomePageElements;
import PageObject.TestInit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLeftWindow extends TestInit {
    @Test
    public void LeftWindow() {
        RozetkaHomePageElements rozetkahome = new RozetkaHomePageElements(driver);
        driver.navigate();
        driver.manage().window().maximize();
        goToRozetka();
        rozetkahome.getLeftWindow().click();
        rozetkahome.waitUntilElementIdClickAble(rozetkahome.getLeftWindow());
        rozetkahome.getDowidkowy().click();
        rozetkahome.waitUntilElementIdClickAble(rozetkahome.getDowidkowy());
        rozetkahome.getDostawka().click();
        rozetkahome.waitUntilElementIdClickAble(rozetkahome.getDostawka());
        rozetkahome.Yak_diye().click();
        sleep(3);

        Assert.assertTrue(getURL().contains("yak-diye-dostavka-do-tochok-vydachi-rozetka"));


    }
}
