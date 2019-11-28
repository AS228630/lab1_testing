package com.SeleniumTest_for_Intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;
@SuppressWarnings("ALL")
public class WebElementPageITMOru {
    WebDriver driver;
    JavascriptExecutor jse;

    public StudentClubs studentClubs = new StudentClubs();

    public void itmoBrowser() {

        try {
            System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            Thread.sleep(2000);
            driver.manage().deleteAllCookies();
            StudentClubs studentClubs = new StudentClubs();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.get("https://student.ifmo.ru/");

            String Title = driver.getTitle();
            System.out.println(Title);
            String Pagesource = driver.getPageSource();
            System.out.println(Pagesource);

            String url = driver.getCurrentUrl();
            System.out.println(url);

           driver.findElement(By.linkText("СОСТАВ")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(By.cssSelector("[class] .b-card-member:nth-child(4) [data-gallery]")).click();
              Thread.sleep(2000);
              driver.findElement(By.cssSelector(".fa-angle-right")).click();
              Thread.sleep(2000);

            driver.findElement(By.xpath("//div[@id='blueimp-gallery-team']//i[@class='fa fa-angle-right']")).click();
              Thread.sleep(2000);
              driver.findElement(By.cssSelector(".fa-angle-right")).click();
              Thread.sleep(2000);

            driver.findElement(By.xpath("//div[@id='blueimp-gallery-team']//i[@class='fa fa-angle-right']")).click();
              Thread.sleep(2000);
              driver.findElement(By.cssSelector(".fa-angle-right")).click();
              Thread.sleep(2000);
              driver.findElement(By.cssSelector(".fa-angle-right")).click();
              Thread.sleep(2000);

            driver.findElement(By.xpath("//div[@id='blueimp-gallery-team']//i[@class='fa fa-angle-right']")).click();
              Thread.sleep(2000);
              driver.findElement(By.cssSelector(".fa-angle-right")).click();
              Thread.sleep(2000);
              driver.findElement(By.xpath("//div[@id='blueimp-gallery-team']//i[@class='fa fa-angle-right']")).click();
              Thread.sleep(2000);

            driver.findElement(By.xpath("//div[@id='blueimp-gallery-team']//i[@class='fa fa-angle-right']")).click();
               Thread.sleep(2000);
               driver.findElement(By.cssSelector(".fa-angle-right")).click();
               Thread.sleep(2000);
               driver.findElement(By.cssSelector(".fa-angle-right")).click();

            driver.get("https://student.ifmo.ru/");
            driver.navigate().back();

            driver.findElement(By.linkText("Совет обучающихся Университета ИТМО")).click();
            driver.findElement(By.linkText("СОСТАВ")).click();

            driver.get("https://www.instagram.com/ctyz531/");
            Thread.sleep(2000);
            driver.get("https://student.ifmo.ru/");
            driver.navigate().forward();

            driver.findElement(By.linkText("Совет обучающихся Университета ИТМО")).click();
            driver.findElement(By.linkText("СОСТАВ")).click();

            driver.get("https://vk.com/id17339856");
            Thread.sleep(3000);
            driver.get("https://student.ifmo.ru/");
            driver.navigate().forward();

            driver.findElement(By.linkText("Совет обучающихся Университета ИТМО")).click();
            driver.findElement(By.linkText("СОСТАВ")).click();

            driver.get("https://vk.com/mikanuryweva");
            Thread.sleep(3000);
            driver.get("https://student.ifmo.ru/");
            driver.navigate().forward();

            driver.findElement(By.linkText("Совет обучающихся Университета ИТМО")).click();
            driver.findElement(By.linkText("СОСТАВ")).click();

            driver.get("https://www.instagram.com/mika_nuryweva/");
            Thread.sleep(3000);
            driver.get("https://student.ifmo.ru/");
            driver.navigate().forward();

            driver.findElement(By.linkText("Совет обучающихся Университета ИТМО")).click();
            driver.findElement(By.linkText("СОСТАВ")).click();

            driver.get("https://vk.com/id56425249");
            Thread.sleep(3000);
            driver.get("https://student.ifmo.ru/");
            driver.navigate().forward();

            driver.findElement(By.linkText("Совет обучающихся Университета ИТМО")).click();
            driver.findElement(By.linkText("СОСТАВ")).click();

            driver.get("https://www.instagram.com/little_miracle_96/");
            Thread.sleep(3000);
            driver.get("https://student.ifmo.ru/");
            driver.navigate().forward();

            driver.findElement(By.linkText("Совет обучающихся Университета ИТМО")).click();
            driver.findElement(By.linkText("СОСТАВ")).click();

            driver.get("https://vk.com/olga_horohorina");
            Thread.sleep(3000);
            driver.get("https://student.ifmo.ru/");
            driver.navigate().forward();

            driver.findElement(By.linkText("Совет обучающихся Университета ИТМО")).click();
            driver.findElement(By.linkText("СОСТАВ")).click();

            driver.get("https://student.ifmo.ru/persons/28/vk.com/typical_nick98");
            Thread.sleep(3000);
            driver.get("https://student.ifmo.ru/");
            driver.navigate().forward();

            driver.findElement(By.linkText("Совет обучающихся Университета ИТМО")).click();
            driver.findElement(By.linkText("СОСТАВ")).click();

            driver.get("https://vk.com/dlampadova");
            Thread.sleep(3000);
            driver.get("https://student.ifmo.ru/");
            driver.navigate().forward();

            driver.findElement(By.linkText("Совет обучающихся Университета ИТМО")).click();
            driver.findElement(By.linkText("СОСТАВ")).click();

            driver.get("https://vk.com/mhlsss");
            Thread.sleep(3000);
            driver.get("https://student.ifmo.ru/");
            driver.navigate().forward();

            driver.findElement(By.linkText("Совет обучающихся Университета ИТМО")).click();
            driver.findElement(By.linkText("СОСТАВ")).click();

            driver.get("https://vk.com/maximesmantovich");
            Thread.sleep(3000);
            driver.get("https://student.ifmo.ru/");
            driver.navigate().forward();

            driver.findElement(By.linkText("Совет обучающихся Университета ИТМО")).click();
            driver.findElement(By.linkText("СОСТАВ")).click();

            driver.get("https://vk.com/jullst");
            Thread.sleep(3000);
            driver.get("https://student.ifmo.ru/");
            driver.navigate().forward();

            driver.findElement(By.linkText("Совет обучающихся Университета ИТМО")).click();
            driver.findElement(By.linkText("СОСТАВ")).click();

            driver.get("https://vk.com/jullst");
            Thread.sleep(3000);
            driver.get("https://student.ifmo.ru/");
            driver.navigate().forward();

            driver.findElement(By.linkText("Совет обучающихся Университета ИТМО")).click();
            driver.findElement(By.linkText("СОСТАВ")).click();

            driver.get("https://student.ifmo.ru/persons/28/vk.com/shadrin_vladislav");
            Thread.sleep(3000);
            driver.get("https://student.ifmo.ru/");
            driver.navigate().forward();

            driver.findElement(By.linkText("Совет обучающихся Университета ИТМО")).click();
            driver.findElement(By.linkText("СОСТАВ")).click();

            driver.get("https://vk.com/id138335988");
            Thread.sleep(3000);
            driver.get("https://student.ifmo.ru/");
            driver.navigate().forward();


            driver.findElement(By.linkText("ДОСТИЖЕНИЯ")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement element1;
            element1 = driver.findElement(By.linkText("НОВОСТИ"));
            element1.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(By.cssSelector("[class] .-on-news-list-page:nth-child(2) .title")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(By.cssSelector(".navbar-nav [href='\\/newslist\\/']")).click();
               Thread.sleep(2000);
               driver.findElement(By.cssSelector("[class] .-on-news-list-page:nth-child(4) .title")).click();
               Thread.sleep(2000);

            driver.findElement(By.xpath("/html//header[@class='h-header']//nav[@role='navigation']/ul[@class='nav navbar-nav']//a[@href='/newslist/']")).click();
              Thread.sleep(2000);
              driver.findElement(By.xpath("/html//div[@class='container h-main']//a[@href='/news/1370/']//article/h3[@class='title']")).click();
              Thread.sleep(2000);


              driver.findElement(By.linkText("ПРОЕКТЫ")).click();

            driver.findElement(By.cssSelector(".row-offcanvas-right [href='\\/pages\\/14\\/']")).click();
            driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[3]/a[@href='/pages/44/']")).click();
            driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[4]/a[@href='/pages/46/']")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[4]/a[@href='/pages/46/']")).click();
            driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[5]/a[@href='/pages/50/']")).click();
            driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[6]/a[@href='/pages/52/']")).click();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[7]/a[@href='/pages/53/']")).click();
            driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[8]/a[@href='/pages/54/']")).click();
            driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[9]/a[@href='/pages/75/']")).click();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement element3;
            element3 = driver.findElement(By.linkText("ФАЙЛЫ"));
            element3.click();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement element4;
            element4 = driver.findElement(By.linkText("ПОЛЕЗНАЯ ИНФОРМАЦИЯ"));
            element4.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

             driver.findElement(By.cssSelector("[href='\\/pages\\/12\\/']")).click();
               Thread.sleep(2000);
               driver.findElement(By.cssSelector("[href='\\/pages\\/18\\/']")).click();
               Thread.sleep(2000);
               driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[4]/a[@href='/pages/22/']")).click();
               Thread.sleep(2000);

             driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[5]/a[@href='/pages/38/']")).click();
               Thread.sleep(2000);
               driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[6]/a[@href='/pages/45/']")).click();
               Thread.sleep(2000);

             driver.findElement(By.cssSelector("[href='\\/pages\\/56\\/']")).click();
               Thread.sleep(2000);
               driver.findElement(By.cssSelector("[title]")).click();
               Thread.sleep(2000);
               driver.findElement(By.xpath("//html[@id='ls-global']//header[@class='h-header']//nav[@role='navigation']/ul[@class='nav navbar-nav']//a[@href='/info/']")).click();
               Thread.sleep(2000);


             driver.findElement(By.linkText("Стипендии и иные формы материальной поддержки")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[1]/a[@href='/pages/60/']")).click();
                Thread.sleep(2000);
                driver.findElement(By.cssSelector("[href='\\/pages\\/62\\/']")).click();
                Thread.sleep(2000);

             driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[3]/a[@href='/pages/63/']")).click();
                Thread.sleep(2000);
                driver.findElement(By.cssSelector("[href='\\/pages\\/64\\/']")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[5]/a[@href='/pages/65/']")).click();
                Thread.sleep(2000);

             driver.findElement(By.linkText("ПАРТНЁРЫ")).click();
                Thread.sleep(2000);
                driver.findElement(By.cssSelector("[class=\"btn btn-sm btn-primary b-nav-top__search-expand-btn\"]")).click();
                Thread.sleep(2000);

            Random random = new Random();
            int n = random.nextInt(100) + 1;
            String search_query = "Hello ITMO" + n;
            WebElement element7;
            element7 = driver.findElement(By.id("search_query"));
            element7.sendKeys("Hello ITMO");
            Thread.sleep(2000);
            WebElement element8;
            element8 = driver.findElement(By.cssSelector("[id=\"async_search\"]"));
            element8.click();
            Thread.sleep(2000);

            //СОВЕТЫ ОБУЧАЮЩИХС ФАКУЛЬТЕТОВ (ИНСТИТУТОВ)
            driver.findElement(By.xpath("/html//header[@class='h-header']/div[@class='container']//div[@class='col-md-8 pos-static']/div/div[2]/a[@href='#']/div[@class='text']")).click();
               driver.findElement(By.linkText("Факультет инфокоммуникационных технологий")).click();
               Thread.sleep(2000);
               driver.findElement(By.linkText("О нас")).click();
               Thread.sleep(2000);

            driver.findElement(By.linkText("Состав")).click();
               Thread.sleep(2000);
               driver.findElement(By.xpath("/html/body//div[@class='row row-offcanvas row-offcanvas-right']/div[1]/article[1]/a[@title='Лунёв Вячеслав Валерьевич']")).click();
               Thread.sleep(2000);
               driver.findElement(By.xpath("//div[@id='blueimp-gallery-team']//i[@class='fa fa-angle-right']")).click();
               Thread.sleep(2000);

            driver.findElement(By.xpath("//div[@id='blueimp-gallery-team']//i[@class='fa fa-angle-right']")).click();
               Thread.sleep(2000);
               driver.findElement(By.xpath("//div[@id='blueimp-gallery-team']//i[@class='fa fa-angle-right']")).click();
               Thread.sleep(2000);
               driver.get("https://student.ifmo.ru/");
               driver.navigate().back();

            driver.get("https://vk.com/catgun");
                Thread.sleep(2000);
                driver.get("https://student.ifmo.ru/");
                driver.navigate().forward();

            driver.get("https://vk.com/lerastromtsova");
                Thread.sleep(2000);
                driver.get("https://student.ifmo.ru/");
                driver.navigate().forward();

            driver.get("https://vk.com/glazatkina");
                Thread.sleep(2000);
                driver.get("https://student.ifmo.ru/");
                driver.navigate().forward();

            driver.get("https://vk.com/irkefil");
                Thread.sleep(2000);
                driver.get("https://student.ifmo.ru/");
                driver.navigate().forward();

            driver.findElement(By.xpath("/html//header[@class='h-header']/div[@class='container']//div[@class='col-md-8 pos-static']/div/div[2]/a[@href='#']/div[@class='text']")).click();
                  Thread.sleep(2000);
                  driver.findElement(By.linkText("Факультет технологического менеджмента и инноваций")).click();
                  Thread.sleep(2000);
                  driver.findElement(By.linkText("О нас")).click();
                  Thread.sleep(2000);

            driver.findElement(By.linkText("Состав")).click();
                 Thread.sleep(2000);
                 driver.findElement(By.xpath("/html/body//div[@class='row row-offcanvas row-offcanvas-right']/div[1]/article[1]/a[@title='Шехтман Патрик Юзефович']")).click();
                 Thread.sleep(2000);

            driver.findElement(By.xpath("//div[@id='blueimp-gallery-team']//i[@class='fa fa-angle-right']")).click();
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//div[@id='blueimp-gallery-team']//i[@class='fa fa-angle-right']")).click();
                  Thread.sleep(2000);

            driver.findElement(By.xpath("//div[@id='blueimp-gallery-team']//i[@class='fa fa-angle-right']")).click();
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//div[@id='blueimp-gallery-team']//i[@class='fa fa-angle-right']")).click();
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//div[@id='blueimp-gallery-team']//i[@class='fa fa-angle-right']")).click();
                  Thread.sleep(2000);

            driver.get("https://student.ifmo.ru/");
                  driver.navigate().back();
                  driver.get("https://vk.com/patrik_stels");
                  Thread.sleep(2000);
                  driver.get("https://student.ifmo.ru/");
                  driver.navigate().forward();

            driver.get("https://vk.com/id79785798");
                  Thread.sleep(2000);
                  driver.get("https://student.ifmo.ru/");
                  driver.navigate().forward();
                  driver.get("https://vk.com/id3423757");
                  Thread.sleep(2000);

            driver.get("https://student.ifmo.ru/");
                  driver.navigate().forward();
                  driver.get("https://vk.com/alexandr_gomon");
                  Thread.sleep(2000);
                  driver.get("https://student.ifmo.ru/");
                  driver.navigate().forward();

            driver.get("https://vk.com/asvel01");
                   Thread.sleep(2000);
                   driver.get("https://student.ifmo.ru/");
                   driver.navigate().forward();
                   driver.get("https://vk.com/mnbv345678");
                   Thread.sleep(2000);

            driver.get("https://student.ifmo.ru/");
                  driver.navigate().forward();
                  driver.findElement(By.xpath("/html//header[@class='h-header']/div[@class='container']//div[@class='col-md-8 pos-static']/div/div[2]/a[@href='#']/div[@class='text']")).click();
                  Thread.sleep(2000);
                  driver.findElement(By.linkText("Факультет технологического менеджмента и инноваций")).click();
                  Thread.sleep(2000);
                  driver.findElement(By.linkText("Файлы")).click();
                  Thread.sleep(2000);

            //Студенческие клубы
            driver.findElement(By.xpath("/html//header[@class='h-header']/div[@class='container']//div[@class='col-md-8 pos-static']/div/div[1]/a[@href='#']/div[@class='text']")).click();
                   Thread.sleep(2000);
                   driver.findElement(By.linkText("О клубной системе")).click();
                   Thread.sleep(2000);
                   driver.findElement(By.linkText("Создание клуба")).click();
                   Thread.sleep(2000);

            driver.findElement(By.linkText("Менторство клубов")).click();
                  Thread.sleep(2000);
                  driver.findElement(By.linkText("Файлы и инструкции")).click();
                  Thread.sleep(2000);
                  driver.findElement(By.linkText("Руководителю клуба")).click();
                  Thread.sleep(2000);

            driver.findElement(By.linkText("Клубы")).click();
               Thread.sleep(2000);
               driver.findElement(By.cssSelector("[title]")).click();
               Thread.sleep(2000);
               driver.findElement(By.xpath("//html[@id='ls-global']//div[@id='footer_fotorama']/div/div[1]/div[3]")).click();
               Thread.sleep(2000);

            driver.findElement(By.cssSelector(".fotorama__pointer [tabindex='0']:nth-of-type(3)")).click();
               Thread.sleep(2000);
               driver.findElement(By.xpath("//html[@id='ls-global']//div[@id='footer_fotorama']/div/div[1]/div[3]")).click();
               Thread.sleep(2000);
               driver.findElement(By.cssSelector(".fotorama__pointer [tabindex='0']:nth-of-type(3)")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ////Программа развития деятельности студенческих объединений
            driver.findElement(By.cssSelector("[class='col-xs-6 col-md-3 b-circle-nav__link']:nth-of-type(3) .b-circle-nav__title")).click();
               Thread.sleep(2000);
               driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[1]/a[@href='/pages/19/']")).click();
               Thread.sleep(2000);
               driver.findElement(By.cssSelector("[href='\\/pages\\/25\\/']")).click();
               Thread.sleep(2000);


            driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[3]/a[@href='/pages/26/']")).click();
               Thread.sleep(2000);
               driver.findElement(By.cssSelector("[href='\\/pages\\/27\\/']")).click();
               Thread.sleep(2000);
               driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[5]/a[@href='/pages/28/']")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            driver.findElement(By.cssSelector("[href='\\/pages\\/29\\/']")).click();
               Thread.sleep(2000);
               driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[7]/a[@href='/pages/30/']")).click();
               Thread.sleep(2000);
               driver.findElement(By.cssSelector("[href='\\/pages\\/31\\/']")).click();
               Thread.sleep(2000);

            driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[9]/a[@href='/pages/32/']")).click();
               Thread.sleep(2000);
               driver.findElement(By.cssSelector("[href='\\/pages\\/33\\/']")).click();
               Thread.sleep(2000);
               driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[11]/a[@href='/pages/34/']")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

           //Совет обучающихся Университета ИТМО
            driver.findElement(By.cssSelector("[title]")).click();
               Thread.sleep(2000);
               driver.findElement(By.cssSelector("[class='col-xs-6 col-md-3 b-circle-nav__link']:nth-of-type(4) .b-circle-nav__title")).click();
               Thread.sleep(2000);

               driver.findElement(By.xpath("/html//header[@class='h-header']/div[@class='container']//a[@title='Совет обучающихся Университета ИТМО']")).click();
               Thread.sleep(2000);

            driver.findElement(By.xpath("//html[@id='ls-global']//footer[@class='h-footer']//a[@href='/pages/16/']/img[@alt='Департамент молодежной политики']")).click();
               Thread.sleep(2000);
               driver.findElement(By.cssSelector("[title]")).click();
               Thread.sleep(2000);

             driver.findElement(By.xpath("//html[@id='ls-global']//footer[@class='h-footer']/div[2]/div[@class='row']/div[2]/div[@class='row']/div[1]/ul[@class='nav nav-pills nav-stacked']//a[@href='/persons/28/']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html//footer[@class='h-footer']/div[2]/div[@class='row']/div[2]/div[@class='row']/div[1]/ul[@class='nav nav-pills nav-stacked']//a[@href='/achievements/']")).click();
            Thread.sleep(2000);


            driver.findElement(By.xpath("/html//footer[@class='h-footer']/div[2]/div[@class='row']/div[2]/div[@class='row']/div[1]/ul[@class='nav nav-pills nav-stacked']//a[@href='/newslist/']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html//footer[@class='h-footer']/div[2]/div[@class='row']/div[2]/div[@class='row']/div[1]/ul[@class='nav nav-pills nav-stacked']//a[@href='/projects/']")).click();
            Thread.sleep(2000);


            driver.findElement(By.xpath("/html//footer[@class='h-footer']/div[2]/div[@class='row']/div[2]/div[@class='row']/div[2]/ul[@class='nav nav-pills nav-stacked']//a[@href='/files/']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html//footer[@class='h-footer']/div[2]/div[@class='row']/div[2]/div[@class='row']/div[2]/ul[@class='nav nav-pills nav-stacked']//a[@href='/info/']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html//footer[@class='h-footer']/div[2]/div[@class='row']/div[2]/div[@class='row']/div[2]/ul[@class='nav nav-pills nav-stacked']//a[@href='/partners/28/']")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("[title]")).click();

            WebElement emial;
            emial =  driver.findElement(By.xpath("/html//footer[@class='h-footer']/div[2]/div[@class='row']//address/div/ul[2]//a[@href='mailto:student@corp.ifmo.ru']"));
            System.out.println(emial.getText());
            WebElement ponnombre;
            ponnombre =  driver.findElement(By.xpath("/html//footer[@class='h-footer']/div[2]/div[@class='row']//address/div/ul[2]/li[2]/a"));
            System.out.println(ponnombre.getText());


            WebElement emial1;
            emial1 =  driver.findElement(By.xpath("//html[@id='ls-global']//footer[@class='h-footer']/div[2]//h5[.='Информация © 2006-2019 Совет обучающихся']"));
            System.out.println(emial1.getText());
            WebElement ponnombre1;
            ponnombre1 =  driver.findElement(By.xpath("//html[@id='ls-global']//footer[@class='h-footer']/div[2]//p"));
            System.out.println(ponnombre1.getText());
            driver.findElement(By.cssSelector("[title]")).click();

            driver.findElement(By.xpath("//html[@id='ls-global']//div[@id='links']//a[@href='http://student.ifmo.ru/images/diplom.jpg']/img[@alt='']")).click();
               Thread.sleep(5000);
               driver.get("https://student.ifmo.ru/");
               driver.navigate().back();

               driver.findElement(By.cssSelector("[title]")).click();
               Thread.sleep(2000);
               driver.findElement(By.xpath("//html[@id='ls-global']//div[@id='links']//a[@href='http://student.ifmo.ru/images/layreaty.jpg']/img[@alt='']")).click();
               Thread.sleep(4000);

            driver.get("https://student.ifmo.ru/");
                 driver.navigate().back();
                 driver.findElement(By.cssSelector("[title]")).click();
                 Thread.sleep(2000);
                 driver.findElement(By.cssSelector(".fa.fa-vk")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            driver.findElement(By.cssSelector(".wall_post_text")).click();
               Thread.sleep(2000);
               Random random1 = new Random();
               int n1 = random1.nextInt(100) + 1;
               String quick_email = "+79500414896" + n;

                WebElement element56;
                element56 = driver.findElement(By.id("quick_email"));
                element56.sendKeys("+79500414896");
                Thread.sleep(2000);

            Random random3 = new Random();
               int n3 = random3.nextInt(100) + 1;
               String quick_pass = "ataullah1234" + n;
               WebElement element57;
               element57 = driver.findElement(By.id("quick_pass"));
               element57.sendKeys("ataullah1234");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            driver.findElement(By.xpath("/html//button[@id='quick_login_button']")).click();
               Thread.sleep(2000);
               driver.findElement(By.xpath("/html//a[@id='group_send_msg_status_block']")).click();
               Thread.sleep(2000);

            Random random5 = new Random();
               int n5 = random1.nextInt(100) + 1;
               String mail_box_editable = "Добрый день ,вы могли бы сказать ,А как можно поступить в ИТМО университете\n" +
                    "у меня интересуется\n" +
                    "И При каких условиях нужно быть:)" + n;
            WebElement element59;
            element59 = driver.findElement(By.id("mail_box_editable"));
            element59.sendKeys("Добрый день ,вы могли бы сказать ,А как можно поступить в ИТМО университете\n" +
                    "у меня интересуется\n" +
                    "И При каких условиях нужно быть:)");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            driver.findElement(By.xpath("/html//button[@id='mail_box_send']")).click();
               driver.get("https://student.ifmo.ru/");
               driver.navigate().forward();
               Thread.sleep(4000);
               driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchCourse() {
        try {
            Random random = new Random();
            int n = random.nextInt(100) + 1;
            String search_query = "Hello ITMO" + n;
            WebElement element7;
            element7 = driver.findElement(By.id("search_query"));
            element7.sendKeys("Hello ITMO");
            Thread.sleep(2000);
            WebElement element8;
            element8 = driver.findElement(By.cssSelector("[id=\"async_search\"]"));
            element8.click();
            Thread.sleep(30000);
            jse = (JavascriptExecutor) driver;
            jse.executeScript("scroll(0,10000)");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        WebElementPageITMOru myobj = new WebElementPageITMOru();
        myobj.itmoBrowser();
        new StudentClubs();
        new HomePageITMOruStudentDevelopmentProgram();
        new HomePageITMOruIPROJECTS();
        new HomePageITMOruScholarshipSSupport();
        new HomePageITMOruNEWS();

    }

}




