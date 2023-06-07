package com.testautomationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));

        Actions actions = new Actions(driver);

        actions.moveToElement(slider).dragAndDropBy(slider, 50, 0).build().perform();
    }


}
