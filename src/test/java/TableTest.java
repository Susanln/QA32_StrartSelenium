import org.openqa.selenium.By;
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

        WebElement i1 = wd.findElement(By.cssSelector("[href= '#item1'"));
        WebElement i2 = wd.findElement(By.cssSelector("[href= '#item2'"));
        WebElement i3 = wd.findElement(By.cssSelector("[href= '#item3'"));
        WebElement i4 = wd.findElement(By.cssSelector("[href= '#item4'"));
      //  WebElement i5 = wd.findElement(By.cssSelector("#nav ul li:first-child a"));

        WebElement inputName = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
       // WebElement inputName1 = wd.findElement(By.cssSelector("name='name'"));
        WebElement inputSurename = wd.findElement(By.cssSelector("[placeholder='Type your surename']"));
        WebElement button = wd.findElement(By.cssSelector(".btn"));

        WebElement Europe = wd.findElement(By.cssSelector("#country-table tr:first-child td:first-child"));
        WebElement Asia = wd.findElement(By.cssSelector("#country-table tr:first-child td:nth-child(2)"));
       WebElement America = wd.findElement(By.cssSelector("#country-table tr:first-child td:last-child"));
        WebElement Ukraine = wd.findElement(By.cssSelector("#country-table tr:nth-child(2) td:first-child"));
        WebElement Israel = wd.findElement(By.cssSelector("#country-table tr:nth-child(2) td:nth-child(2)"));
        WebElement USA = wd.findElement(By.cssSelector("#country-table tr:nth-child(2) td:last-child"));
        WebElement Germany = wd.findElement(By.cssSelector("#country-table tr:nth-child(3) td:first-child"));
        WebElement Russia = wd.findElement(By.cssSelector("#country-table tr:nth-child(3) td:nth-child(2)"));
        WebElement Canada = wd.findElement(By.cssSelector("#country-table tr:nth-child(3) td:last-child"));
        WebElement Poland = wd.findElement(By.cssSelector("#country-table tr:last-child td:first-child"));
        WebElement Chine = wd.findElement(By.cssSelector("#country-table tr:last-child td:nth-child(2)"));
        WebElement Mexico = wd.findElement(By.cssSelector("#country-table tr:last-child td:last-child"));

        WebElement allert = wd.findElement(By.cssSelector("#alert"));

    }
}