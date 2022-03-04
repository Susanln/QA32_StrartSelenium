import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableTest {
    WebDriver wd;
    @Test
    public void tableCss()
    {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
        wd.manage().window().maximize();


    }
    @Test

   public void homeWork(){
        wd = new ChromeDriver();
        wd.navigate().to("file:///C:/Users/susan/Downloads/index.html#item2");
        wd.manage().window().maximize();

       // WebElement e = wd.findElement(By.)
        
    }
}