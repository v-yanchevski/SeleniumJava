package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticationPopup {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        String text = driver.findElement(By.cssSelector("p")).getText();

        System.out.println(text);

        driver.quit();
    }
}

