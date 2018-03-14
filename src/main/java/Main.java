import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\N1nth\\Downloads\\SeleniumTest-1\\driver\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();


        //-----------------Lesson 40-41 ------------------------------//
        /*
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(500, 500));
        driver.get("https://yandex.ru/");
        driver.navigate().to("https://google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());

        driver.quit();
        */
        //--------------------------------------------------------------------//



        //-----------------Lesson 42 ------------------------------//
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.get("https://yandex.ru/");


        WebElement link = driver.findElement(By.linkText("Почта")); //поиск элемента по тексту
        WebElement link2= driver.findElement(By.partialLinkText("Завести")); //поиск эдемента по части текста
        WebElement searchField = driver.findElement(By.name("text")); //поиск эелемента по ее имени
        WebElement searchButton = driver.findElement(By.className("home-logo__default")); //поиск эелемента по имени класса
        WebElement span = driver.findElement(By.id("wd-wrapper-_weather")); //поиск эелемента по id
        WebElement logo = driver.findElement(By.xpath("//div[@role='navigation']/a[@data-id='video']"));

        driver.quit();
        //--------------------------------------------------------------------//








    }

}
