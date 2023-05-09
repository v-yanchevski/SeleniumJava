package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckSelectedOption {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        driver.manage().window().maximize();

        driver.findElement(By.id("dropdown")).click();

        WebElement option1 = driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[2]"));
        WebElement option2 = driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[3]"));



        option1.click();

        if (option1.isSelected()) {
            System.out.println("Option one is selected");
        } else if (option2.isSelected()) {
            System.out.println("Option two is selected");
        }

        driver.quit();
    }

}
