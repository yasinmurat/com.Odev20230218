package odev;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04Odev extends BaseClass{
   /* Scenario-4
            1. https://www.saucedemo.com/  adresine gidin
            2. kullanici adi ve sifre bilgilerini doldurun ve login butonuna tiklayin
3. login yaptiginizdan emin olun
4. Isminde "Backpack" gecen ürüne ait "ADD TO CART" butonuna tiklayin
5. Ürünün Cart'a eklendigini assert edin*/

    @Test
    public void odev3(){

        setDriver();
        String url="https://www.saucedemo.com/";
        driver.get(url);
        By usernameLocator=By.xpath("//input[@id='user-name']");
        By passwordLocator=By.xpath("//input[@id='password']");
        By loginLocator=By.xpath("//input[@type='submit']");
        By isdisplayLogin=By.xpath("//div[@class='app_logo']");
        By addButton=By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
        By sepetLocator=By.xpath("//span[text()='1']");
        driver.findElement(usernameLocator).sendKeys("standard_user");
        driver.findElement(passwordLocator).sendKeys("secret_sauce");
        click(loginLocator);
       boolean logo= driver.findElement(isdisplayLogin).isDisplayed();
        Assert.assertTrue(logo);
        click(addButton);
        boolean sepet=driver.findElement(sepetLocator).isDisplayed();
        Assert.assertTrue(sepet);
        quit();
    }
}
