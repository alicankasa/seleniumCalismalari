package video2_driverMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethodlari {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // driver.manage().window() method'ları

        // 1- driver.manage().window().getSize() --> içinde olduğu sayfanın pixel olarak ölçülerini döndürür.
        driver.manage().window().getSize();

        // 2- driver.manage().window().getPosition() --> içinde olduğu sayfanın pixel olarak konumunu döndürür.
        driver.manage().window().getPosition();

        // 3- driver.manage().window().setPosition(new Point(15,15)); --> içinde olduğu sayfanın sol alt köşesini bizim yazacağımız pixel noktasına taşır
        driver.manage().window().setPosition(new Point(15,15));

        // 4- driver.manage().window().setSize(new Dimension(900,600)) --> içinde olduğu sayfanın sol alt köşesi sabit olarak bizim yazacağımız ölçülere getirir
        driver.manage().window().setSize(new Dimension(900,600));

        // 3 ve 4de konumu ve boyutu yeniledikten sonra tekrar yazdırıyoruz
        System.out.println("yeni pencere olculeri: "+ driver.manage().window().getSize());
        System.out.println("yeni pencere konumu: "+ driver.manage().window().getPosition());

        // 5- driver.manage().window().maximaze() --> içinde olduğu sayfayı maximize yapar
        // 6- driver.manage().window().fullscreen() --> içinde olduğu sayfayı fullscreen yapar

        //farkları görmek için bu methodları kullanıp, başlangıç noktalarını ve boyutlarını yazdırdık
        driver.manage().window().maximize();
        System.out.println("maximize konum :"+ driver.manage().window().getPosition());
        System.out.println("maximize boyut :"+ driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        System.out.println("fullscreen konum :"+ driver.manage().window().getPosition());
        System.out.println("fullscreen boyut :"+ driver.manage().window().getSize());

        // 7- driver.manage().window().minimize() --> sayfayı simge durumunda kucultur
        driver.manage().window().minimize();

        // driver.manage().timeouts() methodlari

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*

            implicitlyWait : driver'a sayfanın yuklenmesi ve kullanacağımız web elementlerin bulunması için
            bekleyeceği maximum süreyi belirtir.
            driver bu sure içerisinde yuklenir/web elemen bulunursa
            beklemeden çalışmaya devam eder
            bu sure bittiği halde sayfa yüklenememiş/web elemen bulunamamışsa
            exception vererek çalışmayı durdurur.

            Duration.ofSeconds(15) : duration class'i selenium-4 ile gelen zaman class'idir
            yani drivera ne kadar bekleyeceğini söyler
            Duration.ofSeconds(15) yerine milis,minutes,hours da kullanilabilir

         */

        /*

            *NOT : Driverin istediğimiz işlemleri yaparken sorunla karışlaşmaması için
            driver.manage() methodlarından
            maximize() ve implicitlyWait() methodlarının her testte kullanılması faydalı olacaktır.
         */
    }
}
