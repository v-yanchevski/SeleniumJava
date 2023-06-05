package com.testautomationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTableData {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.xpath("//tbody/tr/th[1]"));


        int rows = table.findElements(By.xpath("//table[@name=\"BookTable\"]/tbody/tr")).size();
        int columns = table.findElements(By.xpath("//table[@name=\"BookTable\"]/tbody/tr/th")).size();

        System.out.println("Rows are " + rows);
        System.out.println("Columns are " +columns);

        System.out.println(" ");

        for (int i = 2; i <= rows; i++){
            for (int j = 1; j <= columns; j++){

                System.out.printf(driver.findElement(By.xpath("//table[@name=\"BookTable\"]/tbody/tr["+i+"]/td["+j+"]")).getText() + "  ");
            }
            System.out.println(" ");
        }

        driver.quit();


    }
}
