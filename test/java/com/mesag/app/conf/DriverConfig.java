package com.mesag.app.conf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mesag.app")
public class DriverConfig {

    @Bean
    public WebDriver webDriver() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/drivers/windows/chromedriver86.exe");
        return new ChromeDriver();
    }

}
