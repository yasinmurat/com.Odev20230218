package odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _03Odev extends BaseClass{

   /* Scenario-3
            1. https://www.saucedemo.com/  adresine gidin
            2. kullanici adi ve sifre bilgilerini doldurun ve login butonuna tiklayin
3. login yaptiginizdan emin olun
4. Sayfadaki ürünlerin hepsinin
    a. isimlerini consola yazdirin
    b. fiyatlarini consola yazdirin*/

    @Test
    public void odev03(){

        String url="https://www.saucedemo.com/";
        String expectedUrl="https://www.saucedemo.com/inventory.html";


        setDriver();
        driver.get(url);
        By usernameLocator=By.xpath("//*[@id='user-name']");
        By passwordLocator=By.xpath("//*[@id='password']");
        By loginButtonLocator=By.xpath("//*[@id='login-button']");
        By products=By.xpath("//div[@class='inventory_item_name']");
        By prices=By.xpath("//div[@class='inventory_item_price']");


        driver.findElement(usernameLocator).sendKeys("standard_user");
        driver.findElement(passwordLocator).sendKeys("secret_sauce");
        click(loginButtonLocator);
        String currentUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,currentUrl);

        List<WebElement> productsName=driver.findElements(products);
        for (WebElement webelement:productsName) {
            System.out.println("ürün isimi :"+webelement.getText());
        }
        List<WebElement> priceList=driver.findElements(prices);
        for (WebElement webelement2:priceList) {
            System.out.println("ürün Fiyatları"+webelement2.getText());
        }
        for (int i = 0; i <priceList.size() ; i++) {

            System.out.println("Ürün İsmi:"+productsName.get(i).getText()+"Ürün fiyatı :"+priceList.get(i).getText());

        }

        quit();


    }
}
