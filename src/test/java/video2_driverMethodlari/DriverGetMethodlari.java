package video2_driverMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethodlari {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // 1- driver.get("url") --> yazdigimiz url'e gider
        driver.get("https://www.amazon.com");

        // 2- driver.getTitle() --> içinde olduğu sayfanın başlığını döndürür.
        System.out.println("sayfa title:"+driver.getTitle()); //Amazon.com. Spend less. Smile more.

        // 3- driver.getCurrentUrl() --> içinde olduğu sayfanın Url'ini döndürür
        System.out.println(driver.getCurrentUrl()); //amazon.com

        // 4- driver.getPageSource() --> içinde olduğu sayfanın kaynak kodlarını döndürür.
        System.out.println(driver.getPageSource());

        // 5- driver.getWindowHandle() --> içinde olduğu sayfanın UNIQUE hash kodunu döndürür.
        System.out.println(driver.getWindowHandle());
    }
}
