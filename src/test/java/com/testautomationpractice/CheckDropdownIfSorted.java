package com.testautomationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckDropdownIfSorted {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement dropDownAnimals = driver.findElement(By.id("animals"));
        Select select = new Select(dropDownAnimals);

        List originalList = new ArrayList<>();
        List tempList = new ArrayList<>();


        List<WebElement> options = select.getOptions();

        for (WebElement e : options) {

            originalList.add(e.getText());
            tempList.add(e.getText());
        }

        System.out.println("Original list: " + originalList);

        Collections.sort(tempList);
        System.out.println("Sorted temporary list: " + tempList);

        if (originalList.equals(tempList)) {
            System.out.println("Dropdown is sorted");
        } else {
            System.out.println("Dropdown is not sorted");
        }

        driver.quit();
    }
}
