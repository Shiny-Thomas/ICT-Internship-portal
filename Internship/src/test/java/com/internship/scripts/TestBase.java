package com.internship.scripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
	WebDriver driver;
    Properties prop=null;
    
    public void loadprop() throws IOException {
        prop=new Properties();
        FileInputStream fileip=new FileInputStream("D:\\Internship\\Internship\\src\\test\\resources\\config.properties");
        prop.load(fileip);
    }
    
    @BeforeTest
    public void setup() throws IOException {
        loadprop();
        driver=new ChromeDriver();
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
