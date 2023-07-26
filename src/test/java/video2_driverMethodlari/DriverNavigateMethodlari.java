package video2_driverMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethodlari {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // 1- driver.navigate().to("url") --> istenen url'e gider driver.get() metotundan farklı olarak
        // forward ve back yapılmasına imkan tanır
        driver.get("https://www.amazon.com");
        driver.navigate().to("https://facebook.com");

        // 2- driver.navigate().back() --> bir önceki sayfaya dönüş yapar
        driver.navigate().back(); //ornegimizde amazona dönüş yapacaktır.

        // 3- driver.navigate().forward() --> back() ile geldiği sayfaya dönüş yapar
        driver.navigate().forward(); //ornegimizde facebooka dönüş yapacaktır

        // 4- driver.navigate().refresh() --> içinde olduğu sayfayı yeniler
        driver.navigate().refresh();

        //driver oluşturulduğunda açılan sayfayı kapatmak istersek
        driver.close();

        // driver çalışırken birden fazla tab veya window açtıysa tümünü kapatmak için
        driver.quit();

    }
}
