package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chef_\\OneDrive\\Documents\\java\\chromedriver_win32\\chromedriver.exe");

        WebDriver obj = new ChromeDriver() ;

        obj.get("https://www.facebook.com/");

        obj.manage().window().maximize();

        obj.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("test selenuim");

        //obj.quit();
    }
}
