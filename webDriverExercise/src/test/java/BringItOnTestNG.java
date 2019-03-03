
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BringItOnTestNG {

    private BringItOnForTestNG bringItOnForTestNG;
    private String codeString="git config --global user.name  \"New Sheriff in Town\"\n" +
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
            "git push origin master --force";
    private String titleString="how to gain dominance among developers";
    private String startUrl="https://pastebin.com";

   @BeforeTest
    public    void setUp(){
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(startUrl);
        bringItOnForTestNG =new BringItOnForTestNG(driver);
        bringItOnForTestNG.createNewPastebin(codeString,titleString);

    }

    @Test
    public void checkTitleField(){
        Assert.assertEquals(bringItOnForTestNG.getTitleString(),titleString);
    }
    @Test
    public void checkCodeField(){
        Assert.assertEquals(bringItOnForTestNG.getCodeString(),codeString);
    }
    @Test
    public void checkSyntaxHighlighting(){
        Assert.assertEquals(bringItOnForTestNG.getFieldBash(),"Bash");
    }

    @AfterTest
    public void endSession(){
       bringItOnForTestNG.closeWindow();
    }
}

