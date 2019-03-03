import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HardCoreTestNG {
    private HardCoreForTestNG hardCoreTestNg;
    private String startUrl = "https://cloud.google.com";


    @BeforeTest
    public void setUp() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(startUrl);
        hardCoreTestNg=new HardCoreForTestNG(driver);
        hardCoreTestNg.pathToComputeEngine();
        hardCoreTestNg.addToEstimate();

    }

    @Test
    public void checkForTotalEstimateCostFromEmail(){
        String totalEstimateTable = hardCoreTestNg.getTotalEstimatedCost();
        hardCoreTestNg.nextStepToGetMailWithEstimateCost();
        String coastFromEmail=hardCoreTestNg.getTotalEstimateCostFromTenMinute();
     Assert.assertTrue(totalEstimateTable.contains(String.valueOf(coastFromEmail)));
    }

    @AfterTest
    public void exit(){
        hardCoreTestNg.closeHardCoreTest();

    }
}
