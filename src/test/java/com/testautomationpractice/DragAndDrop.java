package com.testautomationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions acts = new Actions(driver);

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement square1 = driver.findElement(By.cssSelector("div#draggable"));
        WebElement square2 = driver.findElement(By.cssSelector("div#droppable"));
        acts.dragAndDrop(square1, square2).build().perform();


        String checkTextWhenDropped = driver.findElement(By.cssSelector("div#droppable")).getText();

        if (checkTextWhenDropped.equalsIgnoreCase("dropped!")) {
            System.out.println("Square1 is over square2");
        } else {
            System.out.println("Square1 is not over square2");
        }

        driver.quit();
    }
}
