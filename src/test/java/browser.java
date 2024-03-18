import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class browser {

    @Test
    public void Vwologin()
    {
        WebDriver driver=new FirefoxDriver();
        driver.get("http://thetestingacadamy.com");
        System.out.println(driver.getTitle());
    }
}
