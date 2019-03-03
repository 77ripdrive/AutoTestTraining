import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HardCore {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String totalEstimatedCost,mailTotalEstimateCost ;

        By exploreAllProductsButton = By.xpath("//a[@track-name='exploreProducts']");
        By seePricingButton = By.xpath("//a[@class='cloud-button cloud-button--secondary' and @track-name='seePricing']");
        By pricingNavigationCalculators = By.xpath("//*[@id='cloud-site']//a[@track-name='pricingNav/calculators']");
        By computeEngineOn = By.xpath("//div[@class='tab-holder compute' and @title='Compute Engine']");
        By numberOfInstans = By.id("input_46");
        By popUpInstanceType = By.xpath("//*[@id='select_value_label_42']");
        By selectInstanceTypeN_OneStandard = By.xpath("//*[@id='select_option_70']/div[1]");
        By ripplyAddGpus = By.xpath("//div[@class='md-icon']/..");


        By selectValueNumberOfGpus = By.xpath("//md-select-value[@id='select_value_label_327']");
        By selectValueNumberOfGpus1 = By.xpath("//*[@id='select_option_334']/div");
        By selectGpuType = By.xpath("//*[@id='select_value_label_328']/span[1]");
        By selectGpuTypeV100 = By.xpath("//*[@id='select_option_341']/div");
        By selectLocalSsd = By.xpath("//*[@id='select_value_label_43']");
        By selectLocalSsd2x375 = By.xpath("//*[@id='select_option_182']");
        By selectDataCenterLocation = By.xpath("//*[@id='select_value_label_44']");
        By selectDataCenterLocationEW3 = By.id("select_option_196");
        By selectCommitedUsage = By.id("select_value_label_45");
        By selectCommitedUsageOneYear = By.xpath("//*[@id='select_option_100']");
        By clickButtonAddToEstimate = By.xpath("//form/div[11]/button[@aria-label='Add to Estimate']");

        By tableTotalEstimateCost = By.xpath("//h2[@class='md-title']/b[@class='ng-binding']");
        By switchOnIframe = By.xpath("//*[@class='cp-header']//iframe") ;
        By switchOnIframeCalculator=By.xpath("//*[@id='idIframe']");
        By emailEstimate=By.xpath("//button[@id='email_quote']");
        By emailFromTenMinute=By.xpath("//*[@id='mailAddress']");

        By stringEmailCalculator=By.xpath("//*[@id='input_380']");
        By buttonSendEmailCalculator=By.xpath("//form[@name='emailForm']//button[@aria-label='Send Email']");
        By tenMinuteMail=By.xpath("//*[@id='ui-id-1']/span[2]");
        By mailTotalEstCost=By.xpath(".//table[@class='quote']/tbody/tr[2]/td[2]/h3");

        driver.get("https://cloud.google.com");
        actions.moveToElement( driver.findElement(exploreAllProductsButton)).build().perform();
        driver.findElement(exploreAllProductsButton).click();
        driver.findElement(seePricingButton).click();
        driver.findElement(pricingNavigationCalculators).click();

        driver.switchTo().frame(driver.findElement(switchOnIframe));
        driver.findElement(computeEngineOn).click();
        driver.findElement(numberOfInstans).sendKeys("4");

        driver.findElement(popUpInstanceType).click();
        driver.findElement(selectInstanceTypeN_OneStandard).click();

        driver.findElement(ripplyAddGpus).click();
        driver.findElement(selectValueNumberOfGpus).click();
        driver.findElement(selectValueNumberOfGpus1).click();
        driver.findElement(selectGpuType).click();
        driver.findElement(selectGpuTypeV100).click();

        driver.findElement(selectLocalSsd).click();
        driver.findElement(selectLocalSsd2x375).click();

        driver.findElement(selectDataCenterLocation).click();
        driver.findElement(selectDataCenterLocationEW3).click();

        driver.findElement(selectCommitedUsage).click();
        driver.findElement(selectCommitedUsageOneYear).click();

        driver.findElement(clickButtonAddToEstimate).click();
        totalEstimatedCost=driver.findElement(tableTotalEstimateCost).getText();

        driver.findElement(emailEstimate).click();
        String winHandleFirst = driver.getWindowHandle();
        driver.switchTo().defaultContent();

        String newWindow = "window.open('about:blank','_blank');";
        ((JavascriptExecutor)driver).executeScript(newWindow);

        for(String winHandle : driver.getWindowHandles())
        {            driver.switchTo().window(winHandle);         }
        driver.get("https://10minutemail.com");
        String winHandleSecond = driver.getWindowHandle();
        String emailFromTenMinuteMail = driver.findElement(emailFromTenMinute).getAttribute("value");
        System.out.println(emailFromTenMinuteMail);

        driver.switchTo().window(winHandleFirst);
        driver.switchTo().frame(driver.findElement(switchOnIframeCalculator));
        driver.findElement(stringEmailCalculator).sendKeys(emailFromTenMinuteMail);
        driver.findElement(buttonSendEmailCalculator).click();
        driver.switchTo().defaultContent();

        driver.switchTo().window(winHandleSecond);

        try {
            TimeUnit.SECONDS.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
  //      waitForElement(driver,tenMinuteMail);

  //      actions.moveToElement( driver.findElement(tenMinuteMail)).build().perform();
  //      actions.moveToElement(driver.findElement(tenMinuteMail),364,644);
  //      mouseOver(driver,driver.findElement(tenMinuteMail));
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        driver.findElement(tenMinuteMail).click();
        mailTotalEstimateCost = driver.findElement(mailTotalEstCost).getText();

         containsСheck(totalEstimatedCost,mailTotalEstimateCost);
         driver.switchTo().defaultContent();

         driver.close();
        driver.switchTo().window(winHandleFirst);
        driver.close();
    }

    private static void containsСheck(String string1, String string2){
        Boolean retValue= string1.contains(String.valueOf(string2));

        System.out.println("Total Estimated Cost the  : "+retValue+"-->"+string1 +"= contains = "+string2);
    }

    private static WebDriverWait waitForElement(WebDriver driver, By by) {
        return (WebDriverWait) new WebDriverWait(driver, 30).
                until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static void mouseOver(WebDriver driver,WebElement element) {
        String code = "var fireOnThis = arguments[0];"
                + "var evObj = document.createEvent('MouseEvents');"
                + "evObj.initEvent( 'mouseover', true, true );"
                + "fireOnThis.dispatchEvent(evObj);";
        ((JavascriptExecutor)driver).executeScript(code, element);
    }

}
