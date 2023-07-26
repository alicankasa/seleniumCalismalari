package video8_ActionSinifi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionClassUygulama {

    @Test
    public void test01(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://automationexercise.com");
        WebElement signUpElementi= driver.findElement(By.xpath("//a[@href='/login']"));
        Actions actions=new Actions(driver);
        actions.click(signUpElementi).perform(); //action sınıfını kullandıktan sonra .perform() metodunu kullanmalıyız.
        WebElement nameKutusu= driver.findElement(By.xpath("//input[@type='text']"));
        actions.click(nameKutusu)
                .sendKeys("Alican")
                .sendKeys(Keys.TAB)
                .sendKeys("asd@gkkf.com")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        WebElement titleCheckBox= driver.findElement(By.xpath("//div[@id='uniform-id_gender1']"));
        actions.click(titleCheckBox)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .sendKeys(Keys.TAB)
                .sendKeys("23")
                .sendKeys(Keys.TAB)
                .sendKeys("July")
                .sendKeys(Keys.TAB)
                .sendKeys("2000")
                .sendKeys(Keys.TAB)
                .sendKeys().click()
                .sendKeys(Keys.TAB)
                .sendKeys().click()
                .sendKeys("Alican")
                .sendKeys(Keys.TAB)
                .sendKeys("Kasa")
                .sendKeys(Keys.TAB)
                .sendKeys("Test")
                .sendKeys(Keys.TAB)
                .sendKeys("Arizona")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("India")
                .sendKeys(Keys.TAB)
                .sendKeys("Orlandfagdgfdgdfhgfhgfhfgdfgdo")
                .sendKeys(Keys.TAB)
                .sendKeys("Buca")
                .sendKeys(Keys.TAB)
                .sendKeys("35190")
                .sendKeys(Keys.TAB)
                .sendKeys("32432543534")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        // String expectedYazi="ACCOUNT CREATED!";
        //String actualYazi= driver.findElement(By.xpath("//h2[@data-qa='account-created']")).getText();
        //Assert.assertEquals(expectedYazi,actualYazi);


        //driver.close();

    }
}
