package video4_webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElements02 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com");
        WebElement eMailKutusu = driver.findElement(By.xpath("//input[@type='text']"));
        eMailKutusu.sendKeys("ornekalican@gmail.com");
        WebElement sifreKutusu = driver.findElement(By.xpath("//input[@type='password']"));
        sifreKutusu.sendKeys("alico232323");
        WebElement girisYapBtn = driver.findElement(By.xpath("//button[@name='login']"));
        girisYapBtn.click();
        WebElement sonucYazi= driver.findElement(By.xpath("//div[@class='_9ay7']"));
        String expectedSonucYazisi="Girdiğin e-posta bir hesaba bağlı değil. Hesabını bul ve giriş yap.";
        String actualSonucYazisi=sonucYazi.getText();

        if (expectedSonucYazisi.equals(actualSonucYazisi)){
            System.out.println("girilemedi testi passed");
        }
        else {
            System.out.println("girilemedi testi failed");
        }

        driver.close();






    }
}
