package com.SeleniumTest_for_Intellij;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
@SuppressWarnings("ALL")
public class StudentClubs {
    private Object StudentClubs;

    public WebElement getStudent() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        WebElement Student;
        Student = driver.findElement(By.xpath("/html//header[@class='h-header']/div[@class='container']//div[@class='col-md-8 pos-static']/div/div[1]/a[@href='#']/div[@class='text']"));
        Student.click();
        WebElement Student1;
        Student1 = driver.findElement(By.cssSelector("[href='\\/pages\\/77\\/']"));
        Student1.click();
        Thread.sleep(2000);

        WebElement Student2 ;
        Student2 = driver.findElement(By.cssSelector(".row-offcanvas-right [href='\\/pages\\/78\\/']"));
        Student2.click();
        Thread.sleep(2000);

        WebElement Student3;
        Student3 = driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[3]/a[@href='/pages/79/']"));
        Student3.click();
        Thread.sleep(2000);

        WebElement Student4;
        Student4 = driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[4]/a[@href='/pages/81/']"));
        Student4.click();
        Thread.sleep(2000);


        return (WebElement) StudentClubs;
    }
}

