import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BringItOnForTestNG {
    private WebDriver driver;

    public BringItOnForTestNG(WebDriver driver) {
        this.driver = driver;
    }

    private By codeField=By.xpath("//textarea[@id='paste_code']");
    private By inputHighlightint = By.xpath("//span[@title='None']");
    private By popUpWin=By.xpath("//ul[@class='select2-results__options']//li[3]" );
    private By fieldPaste=By.xpath("//span[@title='Never']");
    private By tenMinute=By.xpath("//li[text()='10 Minutes']");
    private By inputTitle=By.xpath("//input[@ type='text'and @name='paste_name']");
    private By buttonCreateNewPaste=By.xpath("//input [@name='submit'and @value='Create New Paste' ]");
    private By checkTitleString=By.xpath("//div[@class='paste_box_line1']");
    private By checkFieldBash=By.xpath("//*[@id='code_buttons']/span[2]/a");
    private By checkFieldPaiste=By.xpath("//textarea[@id='paste_code']");

    private BringItOnForTestNG typeCodeField(String stringCode){
        driver.findElement(codeField).sendKeys(stringCode);
        return this;
    }
    private BringItOnForTestNG typeSyntaxField(){
        driver.findElement(inputHighlightint).click();
        driver.findElement(popUpWin).click();
        return this;
    }
    private BringItOnForTestNG typeTenMinute(){
        driver.findElement(fieldPaste).click();
        driver.findElement(tenMinute).click();
        return this;
    }
   private BringItOnForTestNG typeTitle(String stringTitle){
        driver.findElement(inputTitle).sendKeys(stringTitle);
        return this;
    }
    public BringItOnForTestNG createNewPastebin(String stringCode, String stringTitle){
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated(codeField));
        this.typeCodeField(stringCode);
        this.typeSyntaxField();
        this.typeTenMinute();
        this.typeTitle(stringTitle);
        driver.findElement(buttonCreateNewPaste).click();
        return new BringItOnForTestNG(driver);
    }
    public String getTitleString(){
        return driver.findElement(checkTitleString).getText();
    }
    public String getCodeString(){
        return driver.findElement(checkFieldPaiste).getText();
    }
    public String getFieldBash(){
        return driver.findElement(checkFieldBash).getText();
    }

    public void closeWindow(){
        this.driver.close();
    }
}