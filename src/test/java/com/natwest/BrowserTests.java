package com.natwest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserTests {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\Desktop\\Natwest\\SeleniumWebDriver\\src\\test\\java\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        String titleName=driver.getTitle();
        if(titleName.contains("Google")){
            System.out.println("Greeting message is correct.");
        }else {
            System.out.println("Greeting message is Incorrect");
        }
        driver.quit();

    }

}
