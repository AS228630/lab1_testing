package com.SeleniumTest_for_Intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("ALL")

public class HomePageITMOruStudentDevelopmentProgram extends WebElementPageITMOru {

    private static Object HomePageITMOru;
    private final WebDriverWait wait=null;
    
        protected final ThreadLocal<WebDriverWait>  WebDriverWait=new ThreadLocal<WebDriverWait>();

        public HomePageITMOruStudentDevelopmentProgram (WebDriver driver) {
        this.driver = driver;
        }

    public
    HomePageITMOruStudentDevelopmentProgram() {

    }

    void main() throws InterruptedException {
        main(HomePageITMOru);

    }
    public static
    void main(Object homePageITMOru) {

    }
    public static
    void main(String... args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        ////Программа развития деятельности студенческих объединений
        driver.findElement(By.cssSelector("[class='col-xs-6 col-md-3 b-circle-nav__link']:nth-of-type(3) .b-circle-nav__title")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[1]/a[@href='/pages/19/']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.findElement(By.cssSelector("[href='\\/pages\\/25\\/']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[3]/a[@href='/pages/26/']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.findElement(By.cssSelector("[href='\\/pages\\/27\\/']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[5]/a[@href='/pages/28/']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.findElement(By.cssSelector("[href='\\/pages\\/29\\/']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[7]/a[@href='/pages/30/']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.findElement(By.cssSelector("[href='\\/pages\\/31\\/']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[9]/a[@href='/pages/32/']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.findElement(By.cssSelector("[href='\\/pages\\/33\\/']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[11]/a[@href='/pages/34/']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

