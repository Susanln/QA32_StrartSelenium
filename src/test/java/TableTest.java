import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
    public void xPathTests()
    {
        wd = new ChromeDriver();
        wd.navigate().to("file:///C:/Users/susan/Downloads/index.html");
        wd.manage().window().maximize();

        WebElement item1 = wd.findElement(By.xpath("//a[@href='#item1']"));
        String textItem1 = item1.getText();
        //System.out.println("My text   " + textItem1);
        // Assert.assertEquals(textItem1,"Item 1");
        item1.click();
        WebElement check = wd.findElement(By.xpath("//*[@class='message']"));
        String textCheck = check.getText();
        Assert.assertEquals(textCheck,"Clicked by Item 1");

        WebElement item2 = wd.findElement(By.xpath("//a[@href='#item2']"));
        item2.click();
        check = wd.findElement(By.xpath("//*[@class='message']"));
        textCheck = check.getText();
        Assert.assertEquals(textCheck,"Clicked by Item 2");

        WebElement item3 = wd.findElement(By.xpath("//a[@href='#item3']"));
        item3.click();
        check = wd.findElement(By.xpath("//*[@class='message']"));
        textCheck = check.getText();
        Assert.assertEquals(textCheck,"Clicked by Item 3");

        WebElement item4 = wd.findElement(By.xpath("//a[@href='#item4']"));
        item4.click();
        check = wd.findElement(By.xpath("//*[@class='message']"));
        textCheck = check.getText();
        Assert.assertEquals(textCheck,"Clicked by Item 4");

        WebElement europe = wd.findElement(By.xpath("//*[text()='Europe']"));
        String textEurope = europe.getText();
        Assert.assertEquals(textEurope,"Europe");

        WebElement asia = wd.findElement(By.xpath("//*[text()='Asia']"));
        String textAsia = asia.getText();
        Assert.assertEquals(textAsia,"Asia");

        WebElement america = wd.findElement(By.xpath("//*[text()='America']"));
        String textAmerica = america.getText();
        Assert.assertEquals(textAmerica,"America");

        WebElement ukraine = wd.findElement(By.xpath("//*[text()='Ukraine']"));
        String textUkraine = ukraine.getText();
        Assert.assertEquals(textUkraine,"Ukraine");

        WebElement israel = wd.findElement(By.xpath("//*[text()='Israel']"));
        String textIsrael = israel.getText();
        Assert.assertEquals(textIsrael,"Israel");

        WebElement usa = wd.findElement(By.xpath("//*[text()='USA']"));
        String textUsa = usa.getText();
        Assert.assertEquals(textUsa,"USA");

        WebElement germany = wd.findElement(By.xpath("//*[text()='Germany']"));
        String textGermany = germany.getText();
        Assert.assertEquals(textGermany,"Germany");

        WebElement russia = wd.findElement(By.xpath("//*[text()='Russia']"));
        String textRussia = russia.getText();
        Assert.assertEquals(textRussia,"Russia");

        WebElement canada= wd.findElement(By.xpath("//*[text()='Canada']"));
        String textCanada = canada.getText();
        Assert.assertEquals(textCanada,"Canada");

        WebElement poland= wd.findElement(By.xpath("//*[text()='Poland']"));
        String textPoland = poland.getText();
        Assert.assertEquals(textPoland,"Poland");

        WebElement chine= wd.findElement(By.xpath("//*[text()='Chine']"));
        String textChine = chine.getText();
        Assert.assertEquals(textChine,"Chine");

        WebElement mexico= wd.findElement(By.xpath("//*[text()='Mexico']"));
        String textMexico = mexico.getText();
        Assert.assertEquals(textMexico,"Mexico");
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
        wd.findElement(By.xpath("//*[text()='Maria Anders']"));
        wd.findElement((By.xpath("//*[@id='customers']//tr[2]/td[2]")));
        wd.findElement(By.xpath("//input[1]/ancestor::div[last()]")); //  ищет родителя
        wd.findElement(By.xpath("//input[1]/following-sibling::button[2]")); // ищет в пределах этого уровня вниз
        wd.findElement(By.xpath("//button[2]/preceding-sibling::"));// ищет в пределах этого уровня вверх

    }
}