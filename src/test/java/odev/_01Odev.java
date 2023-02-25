package odev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class _01Odev extends BaseClass {
    /*Scenario-1
            1. http://opencart.abstracta.us/  adresine gidin
            2. searchbox'a "mac" yazin
            3. arama butonuna tiklayin
4. kac tane ürün listelendigini ve ürün isimlerini
   driver.findElements() kullanarak ekrana yazdirin*/

    @Test
    public void odev1() {
        String url = "http://opencart.abstracta.us/";
        By macList=By.xpath("//div//h4/a");
        setDriver();
        navigateTo(url);
     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mac");
     driver.findElement(By.xpath("//span/button[@type='button']")).click();
        System.out.println("Çıkan Sonuc Sayısı :"+driver.findElements(macList).size());

        List<WebElement> macler=driver.findElements(macList);

        for (WebElement webElement: macler  ) {
            System.out.println(webElement.getText());

        }
        quit();

    }
}



