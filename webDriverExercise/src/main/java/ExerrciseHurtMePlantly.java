import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExerrciseHurtMePlantly {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String classVM="VM class: regular";
        String instataceType="Instance type: n1-standard-8";
        String region="Region: Frankfurt";
        String localSsd="Total available local SSD space 2x375 GB";
        String commitmentTerm="Commitment term: 1 Year";
        String totalEstimatedCost="Total Estimated Cost: USD 1,187.77 per 1 month";

        By exploreAllProductsButton = By.xpath("//a[@track-name='exploreProducts']");
        By seePricingButton = By.xpath("//a[@class='cloud-button cloud-button--secondary' and @track-name='seePricing']");
        By pricingNavigationCalculators = By.xpath("//*[@id='cloud-site']//a[@track-name='pricingNav/calculators']");
        By computeEngineOn = By.xpath("//div[@class='tab-holder compute' and @title='Compute Engine']");
        By numberOfInstans = By.id("input_46");
        By popUpInstanceType = By.xpath("//*[@id='select_value_label_42']");
        By selectInstanceTypeNOneStandard = By.xpath("//*[@id='select_option_70']/div[1]");
        By ripplyAddGpus = By.xpath("//div[@class='md-icon']/..");
        By selectValueNumberOfGpus = By.xpath("//md-select-value[@id='select_value_label_319']");
        By selectValueNumberOfGpus1 = By.xpath("//*[@id='select_option_326']/div");
        By selectGpuType = By.xpath("//*[@id='select_value_label_320']");
        By selectGpuTypeV100 = By.xpath("//*[@id='select_option_333']/div[1]");
        By selectLocalSsd = By.xpath("//*[@id='select_value_label_43']");
        By selectLocalSsd2x375 = By.xpath("//*[@id='select_option_182']");
        By selectDataCenterLocation = By.xpath("//*[@id='select_value_label_44']");
        By selectDataCenterLocationEW3 = By.id("select_option_196");
        By selectCommitedUsage = By.id("select_value_label_45");
        By selectCommitedUsageOneYear = By.xpath("//*[@id='select_option_100']");
        By clickButtonAddToEstimate = By.xpath("//form/div[11]/button[@aria-label='Add to Estimate']");


            //Final table
        By tatbleVMClass=By.xpath("(//div[@class='md-list-item-text ng-binding'])[2]");
        By tableInstanceType=By.xpath("(//div[@class='md-list-item-text ng-binding'])[3]");
        By tableRegin=By.xpath("(//div[@class='md-list-item-text ng-binding'])[4]");
        By tableLocalSsd=By.xpath("(//div[@class='md-list-item-text ng-binding'])[5]");
        By tableCommitmentTerm=By.xpath("(//div[@class='md-list-item-text ng-binding'])[6]");
        By tableTotalEstimateCost=By.xpath("//h2[@class='md-title']/b[@class='ng-binding']");
        By switchOnIframe=(By.xpath("//*[@class='cp-header']//iframe"));

            driver.get("https://cloud.google.com");
//            waitForElement(driver,exploreAllProductsButton);
            driver.findElement(exploreAllProductsButton).click();
            driver.findElement(seePricingButton).click();
            //Calculators
//            waitForElement(driver,pricingNavigationCalculators);
            driver.findElement(pricingNavigationCalculators).click();
            //      part Compute Engine,switch On iframe
            driver.switchTo().frame(driver.findElement(switchOnIframe));
            driver.findElement(computeEngineOn).click();
            //Number of Instance 4
            driver.findElement(numberOfInstans).sendKeys("4");
            //Instance type n1-standard-8
            driver.findElement(popUpInstanceType).click();
            driver.findElement(selectInstanceTypeNOneStandard).click();
            //Instance type: n1-standard-8
            driver.findElement(ripplyAddGpus).click();
            driver.findElement(selectValueNumberOfGpus).click();
            driver.findElement(selectValueNumberOfGpus1).click();
            driver.findElement(selectGpuType).click();
            driver.findElement(selectGpuTypeV100).click();
            //Local SSD: 2*375 GB
            driver.findElement(selectLocalSsd).click();
            driver.findElement(selectLocalSsd2x375).click();
            //Region: Frankfurt(europe-west3)
            driver.findElement(selectDataCenterLocation).click();
            driver.findElement(selectDataCenterLocationEW3).click();
            //Commitment term: 1 Year
            driver.findElement(selectCommitedUsage).click();
            driver.findElement(selectCommitedUsageOneYear).click();
            //click button --> Add to Estimate
            driver.findElement(clickButtonAddToEstimate).click();

            complianceСheck(classVM,driver.findElement(tatbleVMClass).getText());
            complianceСheck(instataceType,driver.findElement(tableInstanceType).getText());
            complianceСheck(region,driver.findElement(tableRegin).getText());
            complianceСheck(localSsd,driver.findElement(tableLocalSsd).getText());
            complianceСheck(commitmentTerm,driver.findElement(tableCommitmentTerm).getText());
            complianceСheck(totalEstimatedCost,driver.findElement(tableTotalEstimateCost).getText());

            driver.quit();
        }
        private static WebDriverWait waitForElement(WebDriver driver, By by) {
            return (WebDriverWait) new WebDriverWait(driver, 10).
                    until(ExpectedConditions.presenceOfElementLocated(by));
        }
        private static void complianceСheck(String string1,String string2){
            Boolean retValue=string1.equals(string2);
            System.out.println("Data the same: "+retValue+"-->"+string1 +" <------> "+string2);
        }
}
