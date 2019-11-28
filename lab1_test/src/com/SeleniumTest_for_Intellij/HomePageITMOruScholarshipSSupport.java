package com.SeleniumTest_for_Intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
@SuppressWarnings("ALL")
public class HomePageITMOruScholarshipSSupport<element0897> extends WebElementPageITMOru {
    public WebElement element;

    public void setElement(WebElement element) {
        this.element = element;
        WebDriver driver = new ChromeDriver();
        WebElement element0897;

        element0897 = driver.findElement(By.cssSelector("[href='\\/pages\\/12\\/']"));
        element0897.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement element0999;
        element0999 = driver.findElement(By.cssSelector("[href='\\/pages\\/18\\/']"));
        element0999.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement element094=driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[4]/a[@href='/pages/22/']"));
        element094.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement element0222;
        element0222 = driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[5]/a[@href='/pages/38/']"));
        element0222.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement element0555;
        element0555 = driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[6]/a[@href='/pages/45/']"));
        element0555.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement element0666;
        element0666 = driver.findElement(By.cssSelector("[href='\\/pages\\/56\\/']"));
        element0666.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement element0234;
        element0234 = driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[8]/a[@href='/pages/87/']"));
        element0234.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}



