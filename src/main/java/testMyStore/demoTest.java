package testMyStore;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class demoTest {
    //varibles para setup
    private WebDriver driver;
    public static String CHROME_DRIVER  = "src/main/resources/driver/chromedriver.exe";
    public static String CHROME_KEY     = "webdriver.chrome.driver";
    public static String WEB_TEST       = "http://automationpractice.com/index.php";
    //localizadores
    public static By BTN_SIGNIN         = By.className("login");
    public static By BTN_SIGNIN1        = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a");
    public static By BTN_SIGNIN2        = By.linkText("Sign in");
    public static By BTN_SIGNIN3        = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");
    public static By BTN_SIGNIN4        = By.cssSelector("div[class='header_user_info']");
    public static By TXT_EMAIL          = By.id("email_create");
    public static By TXT_EMAIL1         = By.name("email_create");
    public static By TXT_EMAIL2         = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[2]/input");
    public static By TXT_EMAIL4         = By.cssSelector("#email_create");
    public static By BTN_CREAR          = By.id("SubmitCreate");
    //data inputs
    public static String EMAIL          = "tsoft2023@gmail.com";



    @Before
    public void setUp(){
           System.setProperty(CHROME_KEY, CHROME_DRIVER);
           driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           driver.get(WEB_TEST);

    }

    @Test
    public void test() throws InterruptedException {
            driver.findElement(BTN_SIGNIN).click();
            driver.findElement(TXT_EMAIL1).sendKeys(EMAIL);
            driver.findElement(BTN_CREAR).click();
            Thread.sleep(2000);
    }


    @After
    public void tearDown(){
           // driver.close();
    }
}
