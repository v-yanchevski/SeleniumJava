package com.saucedemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TitleCheckAfterLogIn {


        public static void main(String[] args) {

//            WebDriverManager.chromedriver().setup();
//
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--remote-allow-origins=*");

            WebDriver driver = new ChromeDriver();


            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

            WebElement userName = driver.findElement(By.id("user-name"));
            userName.click();
            userName.sendKeys("standard_user");

            WebElement password = driver.findElement(By.id("password"));
            password.click();
            password.sendKeys("secret_sauce");

            WebElement loginButton = driver.findElement(By.id("login-button"));
            loginButton.click();

            String expectedTitle = "Swag Labs";
            String actualTitle = driver.getTitle();

            if (expectedTitle.equals(actualTitle)) {
                System.out.println("Test passed. Actual title is " + actualTitle);
            } else {
                System.out.println("Test failed. Expected title is " + expectedTitle + " but actual title is " + actualTitle);
            }


            driver.quit();
        }
    }

