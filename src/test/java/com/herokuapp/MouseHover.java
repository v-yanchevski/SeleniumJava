package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/hovers");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        WebElement image = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
        act.moveToElement(image).build().perform();

        String userName = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/h5")).getText();
        System.out.println(userName);

        driver.quit();
    }
}
