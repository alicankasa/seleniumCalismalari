package video7_junitAssertionOrnekler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.asynchttpclient.util.Assertions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_JunitAssertion {


    @Test
    public void test01(){

        //1- launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- navigate to url 'http://automationexercise.com'
        driver.get("https://www.automationexercise.com");

        //3- verify that home page is visible succesfully
        WebElement logoElementi= driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(logoElementi.isDisplayed()); // logonun görünür olup olmadığını kontrol edecek

        //4- click on 'Products' button
        driver.findElement(By.xpath("//a[text()=' Products']")).click();
        driver.findElement(By.xpath("//div[@role='button']")).click();

        //5- verify user is navigated to ALL PRODUCTS page successfully
        String expectedUrl="https://www.automationexercise.com/products";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        //6- enter product name in search input and click search button
        WebElement searchKutusu= driver.findElement(By.xpath("//input[@id='search_product']"));
        searchKutusu.sendKeys("tshirt");
        driver.findElement(By.xpath("//button[@id='submit_search']")).click();

        //7- verify 'SEARCH PRODUCT' is visible
        WebElement searchProOnay= driver.findElement(By.xpath("//h2[text()='Searched Products']"));
        Assert.assertTrue(searchProOnay.isDisplayed());

        //8- close driver
        driver.close();


    }
}
