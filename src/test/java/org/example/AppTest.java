package org.example;

import static org.junit.Assert.assertTrue;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static WebDriver driver;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()

    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://www.google.co.in");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Govind Ballabh Pant Engineering College");
        driver.findElement(By.name("btnK")).submit();
        driver.findElement(By.xpath("//h3[text()='Gbpec']")).click();
        String title=driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.equals("Govind Ballabh Pant Institute of Engineering & Technology, Pauri Garhwal(Formerly Known as G.B. Pant Engineering College)"));
        driver.close();
    }
}
