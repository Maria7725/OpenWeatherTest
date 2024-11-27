package com.openweather.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

        protected WebDriver driver;


        @BeforeMethod
        public void setUp(){
            driver = new ChromeDriver();
            driver.get("https://openweathermap.org/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        }

        @AfterMethod
    public void tearDown() {
            if(driver != null) {
                driver.quit();
            }
        }

}