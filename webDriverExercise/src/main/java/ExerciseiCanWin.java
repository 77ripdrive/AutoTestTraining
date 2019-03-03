import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExerciseiCanWin {

    public static class ExerciseICanWin {
        public static void main(String[] args) {
            WebElement searchInput,popUpWindowPasteExpiration,
                    inputTimeInPopUpWinPastExp,inputTitle;

            WebDriver driver=new ChromeDriver();
            driver.get("https://pastebin.com");

            new WebDriverWait(driver,10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@id='paste_code']")));

            searchInput=driver.findElement(By.xpath("//textarea[@id='paste_code']"));
            searchInput.sendKeys("Hello from WebDriver");

            popUpWindowPasteExpiration=driver.findElement(By.xpath
                    ("//*[@id='myform']/div[3]/div[2]/div[2]/span/span[1]/span/span[2]"));
            popUpWindowPasteExpiration.click();
            inputTimeInPopUpWinPastExp=driver.findElement(By.xpath("//li[text()='10 Minutes']"));
            inputTimeInPopUpWinPastExp.click();
            inputTitle=driver.findElement(By.xpath("//input[@ type='text'and @name='paste_name']"));
            inputTitle.sendKeys("helloweb");
            driver.findElement(By.xpath("//input [@name='submit'and @value='Create New Paste' ]")).click();
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}
