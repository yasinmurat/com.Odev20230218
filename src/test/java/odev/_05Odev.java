package odev;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class _05Odev extends BaseClass {


   /* Scenario-5
            1. https://www.saucedemo.com/  adresine gidin
            2. kullanici adi ve sifre bilgilerini doldurun ve login butonuna tiklayin
3. login yaptiginizdan emin olun
4. Isminde "Bolt" gecen ürünün
    tam adini ve fiyatini getText() ile consola yazdirin*/


    @Test

    public void odev5(){

        setDriver();
        String url="https://www.saucedemo.com/";
        By username=By.xpath("//*/input[@id='user-name']");
        By password=By.xpath("//*/input[@type='password']");
        By loginbutton=By.xpath("//*/input[@type='submit']");
        By textUrunAdi=By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']");
        By urunFiyati=By.xpath("//div[@class='inventory_item' and contains(.,'Bolt')]//*[@class='inventory_item_price']");


        driver.get(url);
        driver.findElement(username).sendKeys("problem_user");
        driver.findElement(password).sendKeys("secret_sauce");
        click(loginbutton);
        System.out.println("Ürün Adı :"+ driver.findElement(textUrunAdi).getText());
        System.out.println("Ürünün Fiyatı :"+driver.findElement(urunFiyati).getText());




    }

}
