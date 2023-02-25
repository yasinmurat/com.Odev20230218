package odev;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class _02Odev extends BaseClass  {

   /* Scenario-2
            1. http://opencart.abstracta.us/  adresine gidin
            2. searchbox'a "mac" yazin
            3. arama butonuna tiklayin
4. ismi "iMac" olan bilgisayarin fiyatini consola yazdirin*/

    @Test
    public void odev2(){
        String url=" http://opencart.abstracta.us/";
        By buttonlocator=By.xpath("//span/button[@type='button']");


        setDriver();
        driver.get(url);
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("mac");
        click(buttonlocator);

       element= driver.findElement(By.xpath("//*/p[@class='price' ][1]"));
        System.out.println("Imac Fiyatı" + element.getText());

        quit();
    }
}
