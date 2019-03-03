import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HardCoreForTestNG {
private WebDriver driver;

    public HardCoreForTestNG(WebDriver driver) {
        this.driver = driver;
    }
    private By exploreAllProductsButton = By.xpath("//a[@track-name='exploreProducts']");
    private By seePricingButton = By.xpath("//a[@class='cloud-button cloud-button--secondary' and @track-name='seePricing']");
    private By pricingNavigationCalculators = By.xpath("//*[@id='cloud-site']//a[@track-name='pricingNav/calculators']");
    private By computeEngineOn = By.xpath("//div[@class='tab-holder compute' and @title='Compute Engine']");
    private By numberOfInstans = By.id("input_46");
    private By instancesForField=By.xpath("//input[@id='input_47']");
    private By operatingSystem=By.xpath("//*[@id='select_value_label_40']");
    private By choiceFree=By.xpath("//*[@id='select_option_48']/div[1]");

    private By popUpInstanceType = By.xpath("//*[@id='select_value_label_42']");
    private By selectInstanceTypeNOneStandard = By.xpath("//*[@id='select_option_70']/div[1]");
    private By ripplyAddGpus = By.xpath("//div[@class='md-icon']/..");
    private By selectValueNumberOfGpus = By.xpath("//md-select-value[@id='select_value_label_327']");
    private By selectValueNumberOfGpus1 = By.xpath("//*[@id='select_option_334']/div");
    private By selectGpuType = By.xpath("//*[@id='select_value_label_328']/span[1]");
    private By selectGpuTypeV100 = By.xpath("//*[@id='select_option_341']/div");
    private By selectLocalSsd = By.xpath("//*[@id='select_value_label_43']");
    private By selectLocalSsd2x375 = By.xpath("//*[@id='select_option_182']");
    private By selectDataCenterLocation = By.xpath("//*[@id='select_value_label_44']");
    private By selectDataCenterLocationEW3 = By.id("select_option_196");
    private By selectCommitedUsage = By.id("select_value_label_45");
    private By selectCommitedUsageOneYear = By.xpath("//*[@id='select_option_100']");
    private By clickButtonAddToEstimate = By.xpath("//form/div[11]/button[@aria-label='Add to Estimate']");

    private By tableTotalEstimateCost = By.xpath("//h2[@class='md-title']/b[@class='ng-binding']");
    private By tatbleVMClass=By.xpath("(//div[@class='md-list-item-text ng-binding'])[2]");
    private By tableInstanceType=By.xpath("(//div[@class='md-list-item-text ng-binding'])[3]");
    private By tableRegin=By.xpath("(//div[@class='md-list-item-text ng-binding'])[4]");
    private By tableLocalSsd=By.xpath("(//div[@class='md-list-item-text ng-binding'])[5]");
    private By tableCommitmentTerm=By.xpath("(//div[@class='md-list-item-text ng-binding'])[6]");
    private By switchOnIframe=(By.xpath("//*[@class='cp-header']//iframe"));


    private By switchOnIframeCalculator=By.xpath("//*[@id='idIframe']");
    private By emailEstimate=By.xpath("//button[@id='email_quote']");
    private By emailFromTenMinute=By.xpath("//*[@id='mailAddress']");

    private By stringEmailCalculator=By.xpath("//*[@id='input_380']");
    private By buttonSendEmailCalculator=By.xpath("//form[@name='emailForm']//button[@aria-label='Send Email']");
    private By tenMinuteMail=By.xpath("//*[@id='ui-id-1']/span[2]");
    private By mailTotalEstCost=By.xpath(".//table[@class='quote']/tbody/tr[2]/td[2]/h3");

    private HardCoreForTestNG pushExploreAllProducts(){
        driver.findElement(exploreAllProductsButton).click();
        return new HardCoreForTestNG(driver);
    }
    private HardCoreForTestNG pushSeePrising(){
        driver.findElement(seePricingButton).click();
        return new HardCoreForTestNG(driver);
    }
    private HardCoreForTestNG pushCalculators(){
        driver.findElement(pricingNavigationCalculators).click();
        return new HardCoreForTestNG(driver);
    }

    private HardCoreForTestNG activateComputeEngine(){
        driver.switchTo().frame(driver.findElement(switchOnIframe));
        driver.findElement(computeEngineOn);
        return this;
    }
    private HardCoreForTestNG setNumberOfInstances(){
        driver.findElement(numberOfInstans).sendKeys("4");
        return this;
    }
    private HardCoreForTestNG setInstacasForField(){
        driver.findElement(instancesForField).sendKeys("");
        return this;
    }
    private HardCoreForTestNG setInstanceOS(){
        driver.findElement(operatingSystem).click();
        driver.findElement(choiceFree).click();
        return this;
    }
    private HardCoreForTestNG setClassVM(){
        driver.findElement(popUpInstanceType).click();
        driver.findElement(selectInstanceTypeNOneStandard).click();
        return this;
    }
    private HardCoreForTestNG setAddGPU(){
        driver.findElement(ripplyAddGpus).click();
        driver.findElement(selectValueNumberOfGpus).click();
        driver.findElement(selectValueNumberOfGpus1).click();
        driver.findElement(selectGpuType).click();
        driver.findElement(selectGpuTypeV100).click();
        return this;
    }
    private HardCoreForTestNG setLocacSSD(){
        driver.findElement(selectLocalSsd).click();
        driver.findElement(selectLocalSsd2x375).click();
        return this;
    }

    private HardCoreForTestNG setDataCenter(){
        driver.findElement(selectDataCenterLocation).click();
        driver.findElement(selectDataCenterLocationEW3).click();
        return this;
    }
    private HardCoreForTestNG setCommitedUsage(){
        driver.findElement(selectCommitedUsage).click();
        driver.findElement(selectCommitedUsageOneYear).click();
        return this;
    }
    public HardCoreForTestNG pathToComputeEngine(){
        this.pushExploreAllProducts();
        this.pushSeePrising();
        this.pushCalculators();
        return new HardCoreForTestNG(driver);
    }

    public HardCoreForTestNG addToEstimate(){
        this.activateComputeEngine();
        this.setNumberOfInstances();
        this.setInstacasForField();
        this.setInstanceOS();
        this.setClassVM();
        this.setAddGPU();
        this.setLocacSSD();
        this.setDataCenter();
        this.setCommitedUsage();
        driver.findElement(clickButtonAddToEstimate).click();
        return new HardCoreForTestNG(driver);
    }

       public String getTotalEstimatedCost(){return driver.findElement(tableTotalEstimateCost).getText();}

       public String getClassVM(){return driver.findElement(tatbleVMClass).getText();}

       public String getInstataceType (){return  driver.findElement(tableInstanceType).getText();}

       public String getRegion (){return driver.findElement(tableRegin).getText();}

       public String getLocalSsd(){return  driver.findElement(tableLocalSsd).getText();}

       public String getCommitmentTerm(){return  driver.findElement(tableCommitmentTerm).getText();}


    public HardCoreForTestNG nextStepToGetMailWithEstimateCost(){

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
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        driver.findElement(tenMinuteMail).click();
        return new HardCoreForTestNG(driver);
    }

    public String getTotalEstimateCostFromTenMinute() {
        String mailTotalEstimateCost = driver.findElement(mailTotalEstCost).getText();
        return mailTotalEstimateCost;
    }
    public void closeHardCoreTest(){
       this.driver.switchTo().defaultContent();
        this.driver.close();
        for(String winHandle : driver.getWindowHandles())
        {            driver.switchTo().window(winHandle);}
            this.driver.close();
    }
    public void closeTestWintow(){
        this.driver.close();
    }


}








