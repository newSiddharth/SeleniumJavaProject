package org.example.testCases;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.example.utilities.ReadConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import static org.apache.logging.log4j.Logger.*;

public class BaseClass {
    ReadConfig readconfig=new ReadConfig();
    public String baseURL=readconfig.getApplicationURL();
    public String username=readconfig.getUsername();
    public String password=readconfig.getPassword();
    public static WebDriver driver;
    public static Logger logger;
    @BeforeClass
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        logger= Logger.getLogger("ebanking");
        PropertyConfigurator.configure("log4j.properties");
    }

    @AfterClass
    public void teardown()
    {
        driver.quit();
    }
}
