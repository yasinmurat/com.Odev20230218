package odev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

    protected WebDriver driver;
    protected WebElement element;

    public void setDriver(){
        setDriver("crome");
    }

    public void setDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "firefox":
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
            default:
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
        }


    }
    public void navigateTo(String url){
        driver.get(url);
    }
    public void click(By locator){
        element=driver.findElement(locator);
        element.click();
    }
    public void sendKeys(By locator,String text){
        element.sendKeys();

    }
    public void quit(){
        driver.quit();
    }
    public void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}