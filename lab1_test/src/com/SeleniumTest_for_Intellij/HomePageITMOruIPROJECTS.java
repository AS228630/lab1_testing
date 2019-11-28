package com.SeleniumTest_for_Intellij;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
@SuppressWarnings("ALL")
public class HomePageITMOruIPROJECTS extends WebElementPageITMOru {

    public WebElement element;

    public void setElement(WebElement element) throws InterruptedException {
        this.element = element;
        WebDriver driver = new ChromeDriver();
        WebElement element22=driver.findElement(By.cssSelector(".row-offcanvas-right [href='\\/pages\\/14\\/']"));
        element22.click();
        Thread.sleep(2000);

        WebElement element33;
        element33 = driver.findElement(By.cssSelector(".row-offcanvas-right [href='\\/pages\\/15\\/']"));
        element33.click();
        Thread.sleep(2000);

        WebElement element44;
        element44 = driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[3]/a[@href='/pages/44/']"));
        element44.click();
        Thread.sleep(2000);

        WebElement element55;
        element55 = driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[4]/a[@href='/pages/46/']"));
        element55.click();
        Thread.sleep(2000);

        WebElement element66;
        element66 = driver.findElement(By.cssSelector("[href='\\/pages\\/50\\/']"));
        element66.click();
        Thread.sleep(2000);

        WebElement element77;
        element77 = driver.findElement(By.xpath("[href='\\/pages\\/52\\/']"));
        element77.click();
        Thread.sleep(2000);

        WebElement element88;
        element88 = driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[7]/a[@href='/pages/53/']"));
        element88.click();
        Thread.sleep(2000);

        WebElement element99;
        element99= driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[8]/a[@href='/pages/54/']"));
        element99.click();
        Thread.sleep(2000);

        WebElement element10;
        element10 = driver.findElement(By.cssSelector("[href='\\/pages\\/75\\/']"));
        element10.click();
        Thread.sleep(2000);

        WebElement element01;
        element01 = driver.findElement(By.cssSelector("[href='\\/pages\\/76\\/']"));
        element01.click();
        Thread.sleep(2000);


    }

}
