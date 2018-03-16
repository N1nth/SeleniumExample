import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    static WebDriver driver;


    public static void main(String[] args) {


        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\N1nth\\Downloads\\SeleniumTest-1\\driver\\geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", "/Users/astemirpachev/SeleniumTest-1/driver/geckodriver");

        driver = new FirefoxDriver();

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
        /*
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
        */
        //--------------------------------------------------------------------//




        //-----------------Lesson 43 - Работа с кнопками ----------------------------//
        /*
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //driver.get("https://ru.wikipedia.org");
        //driver.findElement(By.xpath("//input[@id = 'searchButton']")).click();


        driver.get("https://github.com/");

        WebElement button = driver.findElement(By.xpath("//form[@class='home-hero-signup js-signup-form']//button"));

        if (button.getText().equals("Sign up for GitHub")){
            System.out.println("Success!");
        } else {
            System.out.println("Failed!");
        }

        button.submit();
        */
        //--------------------------------------------------------------------//



        //------------ Lesson 44 - Работа с текстовыми полями (полями ввода) --------//
        /*
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://ru.wikipedia.org");

        driver.findElement(By.xpath("//input[@id = 'searchInput']")).sendKeys("Selenium WebDriver");
        driver.findElement(By.xpath("//input[@id = 'searchButton']")).click();

        System.out.println(driver.findElement(By.xpath("//div[@id = 'searchText']/input")).getAttribute("value"));
        driver.findElement(By.xpath("//div[@id = 'searchText']/input")).clear();
        */
        //--------------------------------------------------------------------//



        //------------ Lesson 45 - Работа с ссылками -------------------------//
        /*
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://ru.wikipedia.org");

        WebElement link = driver.findElement(By.xpath("//li[@id = 'n-browse']/a"));

        System.out.println(link.getText());
        link.click();
        */
        //--------------------------------------------------------------------//



        //------------ Lesson 46 - Работа с чекбоксами и радио-кнопками -------------------------//
        /*
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://market.yandex.ru/catalog/71639/list?track=menuleaf&onstock=1&local-offers-first=0");


        System.out.println(driver.findElement(By.xpath("//input[@id = '7893318_152941']")).isSelected());
        driver.findElement(By.xpath("//div[@class = 'LhMupC0dLR']//span[text()='ATLANT']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id = '7893318_152941']")).isSelected());


        System.out.println(driver.findElement(By.xpath("//input[@id = 'offer-shipping_delivery']")).isSelected());
        driver.findElement(By.xpath("//div[@class = '_2zRi9ex2Rl']//span[text()='С доставкой']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id = 'offer-shipping_delivery']")).isSelected());
        */
        //--------------------------------------------------------------------//



        //------------ Lesson 47 - Работа с выпадающими списками -------------------------//
        /*
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Fwww.google.ru%2Fwebhp%3Fhl%3Dru%26sa%3DX%26ved%3D0ahUKEwi-ubCd6rDVAhUFvxQKHUVLBLYQPAgD&hl=ru");


        driver.findElement(By.xpath("//div[@id = 'Gender']//div[@title = 'Пол']")).click();

        driver.findElement(By.xpath("//div[text()='Женский']/parent::div[@role = 'option']")).click();
        */
        //--------------------------------------------------------------------//





        //------------ Lesson 48 - Поиск списка эелементов -------------------------//
        /*
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://market.yandex.ru/catalog/71639/list?track=menuleaf&onstock=1&local-offers-first=0");


        //получили список эелементов и тут же сохраняем в лист
        //МЕТОД findElements ВОЗВРАЩАЕТ ЛИСТ
        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class = '_178jz2CyDL']//div[4]//span[@class = 'NVoaOvqe58']"));

        checkboxes.get(1).click();
        */
        //--------------------------------------------------------------------//






        //------------ Lesson 49 - Работа с таблицами -------------------------//

        //В самой лекции

        //--------------------------------------------------------------------//





        //------------ Lesson 50 - Явные ожидания -------------------------//
        /*
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(...)));
        */
        //--------------------------------------------------------------------//





        //------------ Lesson 51 - Выполнение сложных действий -------------------------//
        /*
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement link = driver.findElement(By.xpath(...));
        WebElement element = driver.findElement(By.xpath(...));

        Actions actions = new Actions(driver);

        actions.moveToElement(link).build().perform(); //наведение курсора на эелемент "линк"

        actions.dragAndDrop(element, link).build().perform(); //перенос элемента "элемент" в элемент "линк"

        actions.clickAndHold(element).moveToElement(link).release().build().perform(); //нажатие и удерживание элемента "элемент"
        // и в это же время наведение курсора на элемент "линк" и "release" - отпустить

        actions.doubleClick(element); //двойной клик
        actions.contextClick(element); // нажатие правой кнопкой мышкин на элемент

        */
        //--------------------------------------------------------------------//





        //------------ Lesson 52 - Выполнение javascript -------------------------//
        /*
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("alert('HelloWord');");

        //можно, например, скролить страницу вниз и т.п. использование js

        */
        //--------------------------------------------------------------------//




        //------------ Lesson 53 - Работа с Alert -------------------------//
        /*
        driver.get("http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html");
        driver.findElement(By.xpath("//a[text()='jdk-8u121-windows-x64.exe']")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().alert().accept();

        driver.get("http://google.com");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("confirm('Are you sure?');");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().alert().dismiss();
        */
        //--------------------------------------------------------------------//





        //------------ Lesson 54 - Работа с окнами браузера -------------------------//
        /*
        driver.get("http://signup.live.com");
        String mainTab = driver.getWindowHandle();

        driver.findElement(By.xpath("//a[text()='соглашения об использовании служб Майкрософт']")).click();

        for (String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }

        driver.findElement(By.xpath("(//span[text()='Часто задаваемые вопросы']/parent::a)[2]")).click();

        driver.switchTo().window(mainTab);

        driver.findElement(By.xpath(".//*[@id='LastName']")).sendKeys("test");
        */
        //--------------------------------------------------------------------//




        //------------ Lesson 55 - Работа с вкладками -------------------------//
        /*
        driver.get("http://signup.live.com");
        String mainTab = driver.getWindowHandle();

        driver.findElement(By.xpath("//a[text()='соглашения об использовании служб Майкрософт']")).click();

        for (String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }

        driver.findElement(By.xpath("(//span[text()='Часто задаваемые вопросы']/parent::a)[2]")).click();

        driver.switchTo().window(mainTab);

        driver.findElement(By.xpath(".//*[@id='LastName']")).sendKeys("TEST TEXT");
        */
        //--------------------------------------------------------------------//




        //------------ Lesson 56 - Проверка доступности эелементов -------------------------//
        /*
        driver.get("http://www.w3schools.com/jsref/prop_pushbutton_disabled.asp");

        WebElement button1 = driver.findElement(By.xpath("//button[text()='My Button']"));
        WebElement button2 = driver.findElement(By.xpath("//a[@title='Home']"));

        System.out.println(button1.isEnabled()); //Позволяет узнать доступен или нет элемент (кнопка/баттан)
        System.out.println(button2.isEnabled());

        if (button1.isEnabled()) button1.click();
        if (button2.isEnabled()) button2.click();

        driver.get("http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html");

        WebElement rb1 = driver.findElement(By.xpath("(//input[@name='agreementjdk-8u121-oth-JPR'])[1]"));
        WebElement rb2 = driver.findElement(By.xpath("(//input[@name='agreementjdk-8u121-oth-JPR'])[2]"));

        System.out.println("Radio button 2 selected: " + rb2.isSelected()); //Позволяет узнать выделен элемент или нет (радиобатоны и чекбоксы)

        if (!rb1.isSelected()) rb1.click();

        driver.get("http://ebay.com");

        WebElement link1 = driver.findElement(By.xpath("//a[contains(text(), 'Бытовая электроника')]"));
        WebElement link2 = driver.findElement(By.xpath("//a[text()='Подписки']"));

        System.out.println(link1.isDisplayed()); //Позволяет узнать виден ли данный элемент на странице
        System.out.println(link2.isDisplayed());

        if (link1.isDisplayed()) link1.click();
        else link2.click();
        */
        //--------------------------------------------------------------------//




        //------------ Lesson 57 - Проверка наличия элемента на странице -------------------------//
        /*
        driver.get("http://github.com");

        if (driver.findElements(By.xpath("//a[text()='Log in']")).size() > 0) System.out.println("Such element is presented");
        else System.out.println("Cannot find such element");
        */
        //--------------------------------------------------------------------//







        //------------ Lesson 58 - Имитация нажатия клавиш -------------------------//
        /*
        driver.get("http://en.wikipedia.org/");

        WebElement searchInput = driver.findElement(By.xpath("//input[@id=\"searchInput\"]"));

        String select = Keys.chord(Keys.CONTROL, "a"); //сочетание клавиш
        String cut = Keys.chord(Keys.CONTROL, "x");
        String paste = Keys.chord(Keys.CONTROL, "v");

        searchInput.sendKeys("test text");
        searchInput.sendKeys(select);
        searchInput.sendKeys(cut);
        searchInput.sendKeys(paste);
        searchInput.sendKeys(Keys.ENTER); //нажатие клавиши enter
        */
        //--------------------------------------------------------------------//





        //------------ Lesson 59 - Скриншоты -------------------------//
        /*
        Date dateNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
        String fileName = format.format(dateNow) + ".png";

        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Screenshots\\" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }


        driver.quit();
        */
        //--------------------------------------------------------------------//




        //------------ Lesson 60 - Загрузка файлов -------------------------//
        /*
        driver.get("http://images.google.com");
        driver.findElement(By.xpath("//a[@aria-label=\"Поиск по картинке\"]")).click();
        driver.findElement(By.xpath("//a[text()='Загрузить файл']")).click();
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\test\\pic.jpg");
        */
        //--------------------------------------------------------------------//



    }





    /*
    //ВСЕ ПОВТОРЯЮЩИЕСЯ ДЕЙСТВИЯ МОЖНО ЗАПИСАТЬ В ОДИН МЕТОД И ВЫЗЫВАТЬ ПОВТОРНО, НЕ ПЛОДЯ МНОГОКОДА
    //ПРИМЕР ИЗ ЛЕКЦИИ 46

    public static void selectCheckBox(String str){

        System.out.println(driver.findElement(By.xpath(str)).isSelected());
        driver.findElement(By.xpath(str)).click();
    }
    */


}
