import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HurtMePlantyTestNG {
    private HardCoreForTestNG hurtMePlanty;
    private String startUrl = "https://cloud.google.com";
    private String classVM="VM class: regular";
    private String instataceType="Instance type: n1-standard-8";
    private String region="Region: Frankfurt";
    private String localSsd="Total available local SSD space 2x375 GB";
    private String commitmentTerm="Commitment term: 1 Year";
    private String totalEstimatedCost="Total Estimated Cost: USD 1,187.77 per 1 month";

    @BeforeTest
    public void setUp() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(startUrl);
        hurtMePlanty=new HardCoreForTestNG(driver);
        hurtMePlanty.pathToComputeEngine();
        hurtMePlanty.addToEstimate();
    }

    @Test
    public void checkClassVMFromEstimate(){
        Assert.assertEquals(hurtMePlanty.getClassVM(),classVM);
    }
    @Test
    public void checkInstanceTypeFromEstimate(){
        Assert.assertEquals(hurtMePlanty.getInstataceType(),instataceType);
    }
    @Test
    public void checkRegoinFromEstimate(){
        Assert.assertEquals(hurtMePlanty.getRegion(),region);
    }
    @Test
    public void checkLocalSSDFromEstimate(){
        Assert.assertEquals(hurtMePlanty.getLocalSsd(),localSsd);
    }
    @Test
    public void checkCommitmentFromEstimate(){
        Assert.assertEquals(hurtMePlanty.getCommitmentTerm(),commitmentTerm);
    }
    @Test
    public void checkTotalCoastFromEstimate(){
        Assert.assertEquals(hurtMePlanty.getTotalEstimatedCost(),totalEstimatedCost);
    }
    @AfterTest
    public void exit(){
        hurtMePlanty.closeTestWintow();
    }
}
