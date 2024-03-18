import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase002 {


    @Test
    public void Vwologin()
    {
             WebDriver driver=new FirefoxDriver();
             driver.get("http://thetestingacadamy.com");
             System.out.println(driver.getTitle());
    }
}
