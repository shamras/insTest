package Test_Cases;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

/////Create a source Item on WIP//////////////
////////////////////////////////////this code is with extent reporting\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

public class TestCase2 {
    public String baseUrl = ("http://www.way2automation.com/angularjs-protractor/banking/#/login");
    String driverPath = "C:\\Users\\rassools\\Documents\\ChromeD\\chromedriver.exe";
    public WebDriver driver;
    ExtentReports report;
    ExtentTest test;
    SoftAssert softAssert = new SoftAssert();


    @Test(priority = 0)
    public void TestCaseV1() throws InterruptedException {
        driver.get(baseUrl);
        test.log(LogStatus.PASS, "Browser started");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div[@class='container-fluid ng-scope']/div[@class='ng-scope']//button[.='Customer Login']")).click();
        String CompanyNameActual = driver.getTitle();
        System.out.println("Actual Title:" +CompanyNameActual);
        String ExpectedTitle = "Protractor practice website - Banking App";

        softAssert.assertEquals(CompanyNameActual, ExpectedTitle);
        System.out.println("Assert passed");

        test.log(LogStatus.PASS, "Passed login");

        driver.findElement(By.cssSelector("#userSelect > option:nth-child(2)")).click();

        driver.findElement(By.cssSelector("form[role='form'] > .btn.btn-default")).click();
        WebElement element = driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div[@class='container-fluid ng-scope']/div[@class='ng-scope']//span[@class='fontBig ng-binding']"));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertEquals("Hermoine Granger", strng);
        System.out.println("Assert passed");
        test.log(LogStatus.PASS, "Select harry Potter then login");

        driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']/div/div[3]/button[2]")).click();
        System.out.println("click deposit");

        driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']//div[@class='container-fluid mainBox ng-scope']//form[@role='form']//input[@type='number']")).sendKeys("1500");
        System.out.println("insert amount");

        driver.findElement(By.cssSelector("form[role='form'] > button")).click();
        System.out.println("clicked deposit");
        WebElement element1 = driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']//div[@class='container-fluid mainBox ng-scope']//span[@class='error ng-binding']"));
        String strng2 = element1.getText();
        System.out.println(strng2);
        Assert.assertEquals("Deposit Successful", strng2);
        System.out.println("Assert passed");

        driver.findElement(By.cssSelector(".btn.logout")).click();
        System.out.println("Logout");
        WebElement element2 = driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']//form[@role='form']//label[.='Your Name :']"));
        String strng3 = element2.getText();
        System.out.println(strng3);
        Assert.assertEquals("Your Name :", strng3);
        System.out.println("Assert passed");
    }

    @Test(priority = 1)
    public void TestCase2() throws InterruptedException {
        driver.findElement(By.xpath("//select[@id='userSelect']/option[@value='2']")).click();
        System.out.println("new customer");
        driver.findElement(By.cssSelector("[type='submit']")).click();
        System.out.println("login");
/////////////account number 1////////////////////////////
        driver.findElement(By.xpath("//select[@id='accountSelect']/option[@label='1004']")).click();
        System.out.println("select account");
        driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']/div/div[3]/button[2]")).click();
        System.out.println("clicked deposit2");
        driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']//div[@class='container-fluid mainBox ng-scope']//form[@role='form']//input[@type='number']")).sendKeys("1500");
        System.out.println("insert amount");
        driver.findElement(By.cssSelector("form[role='form'] > button")).click();
        System.out.println("clicked deposit");
/////////////account number 2////////////////////////////
        driver.findElement(By.xpath("//select[@id='accountSelect']/option[@label='1005']")).click();
        System.out.println("clicked acc");
        driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']/div/div[3]/button[2]")).click();
        System.out.println("clicked deposit2");
        driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']//div[@class='container-fluid mainBox ng-scope']//form[@role='form']//input[@type='number']")).sendKeys("1500");
        System.out.println("insert amount");
        driver.findElement(By.cssSelector("form[role='form'] > button")).click();
        System.out.println("clicked deposit");
/////////////account number 3////////////////////////////
        driver.findElement(By.xpath("//select[@id='accountSelect']/option[@label='1006']")).click();
        System.out.println("clicked acc");
        driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']/div/div[3]/button[2]")).click();
        System.out.println("clicked deposit2");
        driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']//div[@class='container-fluid mainBox ng-scope']//form[@role='form']//input[@type='number']")).sendKeys("1500");
        System.out.println("insert amount");
        driver.findElement(By.cssSelector("form[role='form'] > button")).click();
        System.out.println("clicked deposit");
///////////////logout////////////////
        driver.findElement(By.cssSelector(".btn.logout")).click();
        System.out.println("Logout");
        WebElement element2 = driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']//form[@role='form']//label[.='Your Name :']"));
        String strng3 = element2.getText();
        System.out.println(strng3);
        Assert.assertEquals("Your Name :", strng3);
        System.out.println("Assert passed");

    }

    @Test(priority = 2)
    public void TestCase3() throws InterruptedException {


    }





    @Test(priority = 3)
    public void test_chooseCategory() throws InterruptedException {

    }




    @BeforeClass
    public void beforeClass() {
        report = new ExtentReports("C:\\Users\\rassools\\Desktop\\Extented Reports\\Automation_Tests.html");
        test = report.startTest("Log in to Wip and create a New Source Item");
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\rassools\\Documents\\ChromeD\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "http://www.way2automation.com/angularjs-protractor/banking/#/login";
        test.log(LogStatus.PASS, "Browser started");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        test.log(LogStatus.PASS, "Browser minimized");

    }

    @AfterClass
    public void afterClass() {
        //driver.quit();
        softAssert.assertAll();
        report.endTest(test);
        report.flush();
    }

}
