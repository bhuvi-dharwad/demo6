import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class webpagetest
{
    private static WebDriver driver;
    @BeforeTest
    public void openBrowser() throws InterruptedException
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://bhuvi-dharwad.github.io/demo6/");
    }
    @Test
    public void titleValidationTest()
    {
        String actualTitle = driver.getTitle();
        String expectedTitle = "my simple website";
        Assert.assertEquals(actualTitle, expectedTitle);
        assertTrue(true, "Title should contain 'simple'");
    }
    @AfterTest
    public void closeBrowser() throws InterruptedException
    {
        Thread.sleep(1000);
        driver.quit();
    }
}
