package Tesst;

import PageObject.RozetkaHomePageElements;
import PageObject.TestInit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchField extends TestInit {
    @Test
    public void Field(){
        RozetkaHomePageElements rozetkahome = new RozetkaHomePageElements(driver);
        driver.navigate();
        driver.manage().window().maximize();
        goToRozetka();
        sleep(7);
        rozetkahome.getSearchField().click();
        rozetkahome.getSearchField().sendKeys("Samsung A23");
        sleep(4);
        rozetkahome.driver.findElement(By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']")).click();
        sleep(4);

        Assert.assertTrue(getURL().contains("Samsung+A23&producer=samsung&page=1"));

    }
}
