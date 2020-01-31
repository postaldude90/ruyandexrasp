import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YandexTest {

    @Test
    public void yandexTest(){
        ChromeDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "F:\\Java\\ruyandexrasp\\\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://rasp.yandex.ru");

        //String title = driver.getTitle();
        //Assert.assertTrue(title.equals(""));

        WebElement inputStartPoint = driver.findElement(By.name("fromName"));
        inputStartPoint.clear();
        inputStartPoint.sendKeys("Кемерово");

        WebElement inputEndPoint = driver.findElement(By.name("toName"));
        inputEndPoint.sendKeys("Москва");

        WebElement inputDate = driver.findElement(By.id("when"));
        inputDate.sendKeys("7 апреля 2019"+ Keys.ENTER);

        WebElement submit = driver.findElement(By.className("Button SearchForm__submit"));
        submit.click();
    }

    @Test
    public void yandexEda(){
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rasp.yandex.ru");

    }


}
