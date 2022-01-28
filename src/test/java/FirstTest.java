import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public static void Test00(){

        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        // Launch website example
        driver.navigate().to("http://www.google.com/");

        // Click on the search text box and send value

        By inputBusqueda = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
        driver.findElement(inputBusqueda)
                .sendKeys("javatpoint tutorials test");


        // Click on the search button
        driver.findElement(inputBusqueda).sendKeys(Keys.BACK_SPACE);
        
        driver.findElement(inputBusqueda).sendKeys(Keys.ENTER);

        driver.close();

    }


}
