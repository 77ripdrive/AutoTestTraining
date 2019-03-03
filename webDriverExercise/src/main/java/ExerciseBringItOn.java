import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ExerciseBringItOn {
    public static void main(String[] args) throws IOException {
        WebElement searchInput,inputTitle,inputHighlightint,popUpWin;
        String text1,text2,text3;
        text1="";text2="";text3="";

        WebDriver driver=new ChromeDriver();
        driver.get("https://pastebin.com");
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@id='paste_code']")));

        //Filling the field New Paste with code.
        String codeString="git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force";
        searchInput=driver.findElement(By.xpath("//textarea[@id='paste_code']"));
        searchInput.sendKeys(codeString);

        // Filling the field with value "Bash"--> Syntax Highlighting: "Bash"

         inputHighlightint = driver.findElement(By.xpath("//span[@title='None']"));
         inputHighlightint.click();
         popUpWin=driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[3]" ));

        popUpWin.click();

        //Filling the field with value "10 Minutes"-->Paste Expiration: "10 Minutes"
        driver.findElement(By.xpath("//span[@title='Never']")).click();
        driver.findElement(By.xpath("//li[text()='10 Minutes']")).click();

        ////Filling the field with value" " --> Paste Name / Title: "how to gain dominance among developers"
        inputTitle=driver.findElement(By.xpath("//input[@ type='text'and @name='paste_name']"));
        String titleString="how to gain dominance among developers";
        inputTitle.sendKeys(titleString);

        // Submit with "Create New Paste"
        driver.findElement(By.xpath("//input [@name='submit'and @value='Create New Paste' ]")).click();
        //Test all field
        String titleStringFromPage=driver.findElement(By.xpath("//div[@class='paste_box_line1']")).getText();


        if (titleString.equals(titleStringFromPage)) { text1="Text from page  and Title string the same";
        }
        if (driver.findElement(By.xpath("//*[@id='code_buttons']/span[2]/a")).getText().equals("Bash")){
        text2="The table is marked Bash.All Ok.:))\n";
        }
        if (driver.findElement(By.xpath("//textarea[@id='paste_code']")).getText().equals(codeString)){
        text3=" The source code -->\n";
        }

        writeToFile(titleStringFromPage +"\nPaste Name / Title:   "+titleString + text1+
                "\nField is Bash:-->"+driver.findElement(By.xpath("//*[@id='code_buttons']/span[2]/a")).getText()+
                text2 +text3+driver.findElement(By.xpath("//textarea[@id='paste_code']")).getText() ,true);

      driver.quit();
    }
    static void writeToFile(String content,boolean next) throws IOException {
        File file = new File("BringInOn.txt");
        if (!file.exists())
            file.createNewFile();
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close();
    }
}
