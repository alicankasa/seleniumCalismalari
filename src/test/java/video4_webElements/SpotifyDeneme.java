package video4_webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SpotifyDeneme {

    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://open.spotify.com/");

    }

    @Test
    public void test01(){


        WebElement oturumAcBtn= driver.findElement(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 bABUvF encore-inverted-light-set']"));
        oturumAcBtn.click();

        WebElement eMailKutusu= driver.findElement(By.xpath("//input[@id='login-username']"));
        eMailKutusu.sendKeys("alicancagan35@gmail.com");

        WebElement sifreKutusu= driver.findElement(By.xpath("//input[@id='login-password']"));
        sifreKutusu.sendKeys("236712141As");

        WebElement girisYapBtn= driver.findElement(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 cJdEzG encore-bright-accent-set']"));
        girisYapBtn.click();

        WebElement calmaListOlstr= driver.findElement(By.xpath("//button[@class='Button-sc-1dqy6lx-0 feKImU OMCDc2F7g_AufJAtaKfL TxO7Ee8iwqBpkgznKHsd ufICQKJq0XJE5iiIsZfj caTDfb6Oj7a5_8jBLUSo vOp2HlcPkxOHebo3If32 eZnAGhYcXE4Bt0a7958z']"));
        calmaListOlstr.click();

        WebElement kucukSekmeCalmaLst= driver.findElement(By.xpath("//button[@class='wC9sIed7pfp47wZbmU6m']"));
        kucukSekmeCalmaLst.click();

        WebElement listeAdiDegis= driver.findElement(By.xpath("//h1[@dir='auto']"));
        listeAdiDegis.click();

        WebElement yeniAdKutusu= driver.findElement(By.cssSelector("[placeholder='Ad ekle']"));
        yeniAdKutusu.clear();
        yeniAdKutusu.sendKeys("Selenium Ornek Otomasyon");
        
        WebElement kaydetBtn=driver.findElement(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 bABUvF encore-inverted-light-set']"));
        kaydetBtn.click();

        WebElement aramaKutusu= driver.findElement(By.xpath("//li[.='Ara']"));
        aramaKutusu.click();

        WebElement sarkiYaz= driver.findElement(By.cssSelector("[placeholder='Ne dinlemek istiyorsun?']"));
        sarkiYaz.sendKeys("Daft Punk");
        sarkiYaz.submit();

        WebElement sarkiEkleme= driver.findElement(By.xpath("//div[@class='ShMHCGsT93epRGdxJp2w']/div[@class='JUa6JJNj7R_Y3i4P8YUX']/div[2]/div[1]//button[@class='Button-sc-1dqy6lx-0 jaXpQg mYN_ST1TsDdC6q1k1_xs']"));
        sarkiEkleme.click();

        WebElement kucukPencereEkleme= driver.findElement(By.xpath("//button[.='Çalma listesine ekle']"));
        kucukPencereEkleme.click();

        WebElement calmaListesiArama= driver.findElement(By.xpath("//button[.='Çalma listesine ekle']"));
        calmaListesiArama.click();

        WebElement calmaListEkle = driver.findElement(By.xpath("//*[text()='Selenium Ornek Otomasyon']"));
        calmaListEkle.click();

    }


    @Test
    public void test02(){

        WebElement cookieKapat= driver.findElement(By.xpath("//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']"));
        cookieKapat.click();

        WebElement oturumAcBtn= driver.findElement(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 bABUvF encore-inverted-light-set']"));
        oturumAcBtn.click();

        WebElement eMailKutusu= driver.findElement(By.xpath("//input[@id='login-username']"));
        eMailKutusu.sendKeys("alicancagan35@gmail.com");

        WebElement sifreKutusu= driver.findElement(By.xpath("//input[@id='login-password']"));
        sifreKutusu.sendKeys("236712141As");

        WebElement girisYapBtn= driver.findElement(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 cJdEzG encore-bright-accent-set']"));
        girisYapBtn.click();

        WebElement calmaListOlstr= driver.findElement(By.xpath("//button[@class='Button-sc-1dqy6lx-0 feKImU OMCDc2F7g_AufJAtaKfL TxO7Ee8iwqBpkgznKHsd ufICQKJq0XJE5iiIsZfj caTDfb6Oj7a5_8jBLUSo vOp2HlcPkxOHebo3If32 eZnAGhYcXE4Bt0a7958z']"));
        calmaListOlstr.click();

        WebElement kucukSekmeCalmaLst= driver.findElement(By.xpath("//button[@class='wC9sIed7pfp47wZbmU6m']"));
        kucukSekmeCalmaLst.click();

        WebElement listeAdiDegis= driver.findElement(By.xpath("//h1[@dir='auto']"));
        listeAdiDegis.click();

        WebElement yeniAdKutusu= driver.findElement(By.cssSelector("[placeholder='Ad ekle']"));
        yeniAdKutusu.clear();

        yeniAdKutusu.sendKeys("Çalınacak Şarkı");
        WebElement kaydetBtn=driver.findElement(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 bABUvF encore-inverted-light-set']"));
        kaydetBtn.click();

        WebElement aramaKutusu= driver.findElement(By.xpath("//li[.='Ara']"));
        aramaKutusu.click();

        WebElement sarkiYaz= driver.findElement(By.cssSelector("[placeholder='Ne dinlemek istiyorsun?']"));
        sarkiYaz.sendKeys("The Final Countdown");
        sarkiYaz.submit();

        WebElement sarkiEkleme= driver.findElement(By.xpath("//div[@class='ShMHCGsT93epRGdxJp2w']/div[@class='JUa6JJNj7R_Y3i4P8YUX']/div[2]/div[1]//button[@class='Button-sc-1dqy6lx-0 jaXpQg mYN_ST1TsDdC6q1k1_xs']"));
        sarkiEkleme.click();

        WebElement kucukPencereEkleme= driver.findElement(By.xpath("//button[.='Çalma listesine ekle']"));
        kucukPencereEkleme.click();

        WebElement calmaListesiArama= driver.findElement(By.xpath("//button[.='Çalma listesine ekle']"));
        calmaListesiArama.click();

        WebElement calmaListEkle = driver.findElement(By.xpath("//*[text()='Çalınacak Şarkı']"));
        calmaListEkle.click();

        WebElement sarkiyaTikla= driver.findElement(By.xpath("//div[@class='ShMHCGsT93epRGdxJp2w']/div[@class='JUa6JJNj7R_Y3i4P8YUX']/div[2]/div[1]//div[@class='Type__TypeElement-sc-goli3j-0 fZDcWX t_yrXoUO3qGsJS4Y6iXX standalone-ellipsis-one-line']"));
        sarkiyaTikla.click();

        WebElement oynatmaBtn= driver.findElement(By.cssSelector(".gGxSiT"));
        oynatmaBtn.click();

        String expectedUrl="https://open.spotify.com/track/3MrRksHupTVEQ7YbA0FsZK";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        WebElement simgeDurumu= driver.findElement(By.cssSelector("[height='28'] > [d='M5.7 3a.7.7 0 0 0-.7.7v16.6a.7.7 0 0 0 .7.7h2.6a.7.7 0 0 0 .7-.7V3.7a.7.7 0 0 0-.7-.7H5.7zm10 0a.7.7 0 0 0-.7.7v16.6a.7.7 0 0 0 .7.7h2.6a.7.7 0 0 0 .7-.7V3.7a.7.7 0 0 0-.7-.7h-2.6z']"));
        Assert.assertTrue(simgeDurumu.isDisplayed());




    }









}
