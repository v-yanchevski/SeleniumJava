package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckIfSortedByPrice {

    public static void main(String[] args) {


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

        Select sortFilter = new Select(driver.findElement(By.cssSelector("select.product_sort_container")));
        sortFilter.selectByValue("lohi");


        List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));
        boolean isSorted = true;
        for (int i = 0; i < prices.size() - 1; i++) {
            double price1 = Double.parseDouble(prices.get(i).getText().substring(1));
            double price2 = Double.parseDouble(prices.get(i + 1).getText().substring(1));
            if (price1 > price2) {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted ? "Products are sorted correctly." : "Products are not sorted correctly.");

        driver.quit();
    }
}
