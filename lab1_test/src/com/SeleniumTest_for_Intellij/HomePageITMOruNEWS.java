package com.SeleniumTest_for_Intellij;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

@SuppressWarnings("ALL")
public class HomePageITMOruNEWS<webElement, HeapByteBuffer> extends WebElementPageITMOru {

    private final ThreadLocal<HeapByteBuffer> element=new ThreadLocal<HeapByteBuffer>();

    public HomePageITMOruNEWS() {
    }
    webElement setElement(Class<?> aClass) {

        webElement webElement=setElement(element.get().getClass());


        return webElement;
    }

    protected <webElement> webElement setElement() {
        webElement webElement=setElement();
        return webElement;

    }

    protected <webElement> webElement setElement(WebElement element)
{       this.element.set(( HeapByteBuffer ) element);
        WebDriver driver = new ChromeDriver();
    WebElement element1;
    element1 = driver.findElement(By.linkText("НОВОСТИ"));
    element1.click();
    try {
        sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    WebElement elemento;
        elemento = driver.findElement(By.cssSelector("[class] .-on-news-list-page:nth-child(2) .title"));
        elemento.click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    WebElement elementu;
    elementu = driver.findElement(By.cssSelector("[class] .-on-news-list-page:nth-child(2) .title"));
    elementu.click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }


    WebElement elementml;
    elementml = driver.findElement(By.cssSelector(".navbar-nav [href='\\/newslist\\/']"));
    elementml.click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }


    WebElement elementp;
    elementp = driver.findElement(By.cssSelector("[class] .-on-news-list-page:nth-child(4) .title"));
    elementp.click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    WebElement elements;
    elements = driver.findElement(By.xpath("/html//header[@class='h-header']//nav[@role='navigation']/ul[@class='nav navbar-nav']//a[@href='/newslist/']"));
    elements.click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    WebElement elementw;
    elementw = driver.findElement(By.xpath("/html//div[@class='container h-main']//a[@href='/news/1370/']//article/h3[@class='title']"));
    elementw.click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();



    }
    return null;
}

}
