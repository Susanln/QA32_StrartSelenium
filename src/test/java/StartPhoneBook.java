import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
public class StartPhoneBook {
    WebDriver wd;

    @Test
    public void startPhoneBook(){
        wd = new ChromeDriver();
        // wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");// open
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app");// open www + history
        //wd.navigate().
        wd.manage().window().maximize();

        wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        WebElement login = elements.get(2);
        login.click();

        WebElement element = wd.findElement(By.id("root"));
        WebElement element1= wd.findElement(By.className("container"));
        WebElement e = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement home = elements.get(0);
        WebElement about = elements.get(1);
        List<WebElement> input = wd.findElements(By.tagName("input"));
        WebElement email = elements.get(0);
        WebElement password = elements.get(1);
        List<WebElement> button = wd.findElements(By.tagName("font"));
        WebElement auth = elements.get(0);
        WebElement reg = elements.get(1);


        WebElement e10 = wd.findElement(By.linkText("HOME")); // если есть ссылка
        WebElement e11 = wd.findElement(By.linkText("ABOUT"));
        WebElement e12 = wd.findElement(By.linkText("LOGIN"));
        WebElement e13 = wd.findElement(By.partialLinkText("HO"));

//       WebElement el= wd.findElement(By.id("idel"));
//      List<WebElement> list = wd.findElements(By.id("idel"));

        //wd.close();//close on tab
        //wd.quit();//close all tabs


    }
    @Test
    public void cssLocatorsTest(){
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app");
        wd.manage().window().maximize();

        wd.findElement(By.cssSelector("div"));
       // wd.findElement(By.cssSelector(".login_login__3EHKB"));
        wd.findElement(By.cssSelector("#root"));
        //wd.findElement(By.cssSelector("[placeholder='Password']"));
        wd.findElement(By.cssSelector("[placeholder*='ss']"));
        wd.findElement(By.cssSelector("[placeholder^='Pa']"));
        wd.findElement(By.cssSelector("[placeholder$='d']"));





    }
}
