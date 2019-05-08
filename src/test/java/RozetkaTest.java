import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;

public class RozetkaTest {
    @Test
    public void testRozetka()
    {
        //Init chrome driver
        System.setProperty("webdriver.chrome.driver" ,  "C:\\Users\\vik\\Documents\\2 курс\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();

        //Test Body
        MainPage mainPage = PageFactory.initElements(chromeDriver, MainPage.class);
        mainPage.open();
        mainPage.steUAlLocalization();
    }


}
