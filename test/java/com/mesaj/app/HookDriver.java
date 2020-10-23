package com.mesaj.app;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HookDriver {


    public static WebDriver driver;
    @Before
    public void createDriver() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @After
    public  void quitDriver(){
        if(driver != null)
        {driver.quit();
        }
    }
}
