package com.testautomationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DoubleClick {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        String field1 = driver.findElement(By.id("field1")).getText();
        String field2 = driver.findElement(By.id("field2")).getText();
        WebElement copyButton = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));

        actions.doubleClick(copyButton);

        if (field1.equalsIgnoreCase(field2)){

            System.out.println("Successful double click");
        } else{
            System.out.println("Not successful double click");
        }

        driver.quit();
    }
}