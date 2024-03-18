import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAutomation {

    @BeforeTest
    public void beforecall()
    {
        System.out.println("I am before test method");
    }

    @Test
    public void Vwologin()
    {
        WebDriver driver=new FirefoxDriver();
        driver.get("http://thetestingacadamy.com");
        System.out.println(driver.getTitle());
    }
    @Step("Test Case one")
    @Test
    public void TestCases()
    {
        System.out.println("i am test one");
    }
    @Step("Test Case two")
    @Test
    public void TestCases1()
    {
        System.out.println("I am Test two");
    }

    @AfterTest
    public void tearDown()
    {
        System.out.println("I am after test method");
    }
}
