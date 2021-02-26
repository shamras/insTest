package Test_Cases;

import Pages.web_Elements;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import org.openqa.selenium.WebDriver;
import Library.Utility;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing1 {


    public WebDriver driver;
    web_Elements PageTesting;
    web_Elements PageTesting2;
    web_Elements PageTesting3;
    ExtentReports report;
    ExtentTest test;
    SoftAssert softAssert = new SoftAssert();


    @BeforeTest
    public void Initialize_driver() throws InterruptedException {
        ///Initialize diver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Documents\\ChromeD\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
        driver.manage().window().maximize();



    }

    @Test(priority = 0)
    public void TestCase1() throws InterruptedException {
        Utility.captureScreenshots(driver,"Browser Started");
        PageTesting = new web_Elements(driver);
        PageTesting.LoginTest();
        Utility.captureScreenshots(driver,"login");
        String CompanyNameActual = driver.getTitle();
        System.out.println("Actual Title:" + CompanyNameActual);
        String ExpectedTitle = "Protractor practice website - Banking App";

        softAssert.assertEquals(CompanyNameActual, ExpectedTitle);
        System.out.println("Assert passed");
        Utility.captureScreenshots(driver,"login successfull");

        //test.log(LogStatus.PASS, "Passed login");

        PageTesting.SelectYourName();
        Utility.captureScreenshots(driver,"Name Selected");
        PageTesting.NameSelectedSubmit();
        Utility.captureScreenshots(driver,"Name submitted");
        //test.log(LogStatus.PASS, "Select Hermoine Granger then login");

        PageTesting.Select_Deposit();
        Utility.captureScreenshots(driver,"Select_Deposit");
        PageTesting.TransactionAmount("1500");
        Utility.captureScreenshots(driver,"Insert TransAmount");
        PageTesting.SubmitTransactionAmount();
        Utility.captureScreenshots(driver,"Trans Amount submit");
        PageTesting.DepositSuccessful();
        Utility.captureScreenshots(driver,"successfulDeposit1");
        PageTesting.LogoutUser();
        Utility.captureScreenshots(driver,"UserLoggedOut");
    }


    @Test(priority = 1)
    public void TestCase2() throws InterruptedException {
        PageTesting2 = new web_Elements(driver);
        ////Deposit account1//////////////////////////
        PageTesting2.NewUserLogin();
        Utility.captureScreenshots(driver,"New User");
        PageTesting2.SelectAccount1();
        Utility.captureScreenshots(driver,"Select acc1");
        PageTesting2.SelectOptionDeposit();
        Utility.captureScreenshots(driver,"Select Opt deposit");
        PageTesting2.TransactionAmount("1500");
        Utility.captureScreenshots(driver,"Insert TransAmount2");
        PageTesting.SubmitTransactionAmount();
        Utility.captureScreenshots(driver,"Trans Amount submit2");
        PageTesting2.Select_Deposit();
        Utility.captureScreenshots(driver,"Select_Deposit2");
        PageTesting2.DepositSuccessful();
        Utility.captureScreenshots(driver,"Successful2");
        ///Deposit account2//////////////////////////
        PageTesting2.SelectAccount2();
        Utility.captureScreenshots(driver,"Select acc2");
        PageTesting2.TransactionAmount("1500");
        Utility.captureScreenshots(driver,"Insert TransAmount3");
        PageTesting.SubmitTransactionAmount();
        Utility.captureScreenshots(driver,"Trans Amount submit3");
        PageTesting2.Select_Deposit();
        Utility.captureScreenshots(driver,"Select_Deposit3");
        PageTesting2.DepositSuccessful();
        Utility.captureScreenshots(driver,"Successful3");

        ////Deposit account3//////////////////////////
        PageTesting2.SelectAccount3();
        Utility.captureScreenshots(driver,"Select acc3");
        PageTesting2.TransactionAmount("1500");
        Utility.captureScreenshots(driver,"Insert TransAmount4");
        PageTesting.SubmitTransactionAmount();
        Utility.captureScreenshots(driver,"Trans Amount submit4");
        PageTesting2.Select_Deposit();
        Utility.captureScreenshots(driver,"Select_Deposit4");
        PageTesting2.DepositSuccessful();
        Utility.captureScreenshots(driver,"Successful4");
        PageTesting.LogoutUser();
        Utility.captureScreenshots(driver,"logout4");
    }
    @Test(priority = 2)
    public void TestCase3() throws InterruptedException {
        PageTesting3 = new web_Elements(driver);
        PageTesting3.HomePage();
        Utility.captureScreenshots(driver,"HomePage");
        PageTesting3.LoginTest();
        Utility.captureScreenshots(driver,"logging in");
        //////////deposit on first account////////////////////////////////
        PageTesting3.NewUserLogin();
        Utility.captureScreenshots(driver,"New User2");
        PageTesting3.SelectOptionDeposit();
        Utility.captureScreenshots(driver,"Select_Deposit5");
        PageTesting3.TransactionAmount("31459");
        Utility.captureScreenshots(driver,"Trans Amount submit4");
        PageTesting.SubmitTransactionAmount();
        Utility.captureScreenshots(driver,"Trans Amount submit5");
        PageTesting3.Select_Deposit();
        Utility.captureScreenshots(driver,"Select_Deposit6");
        PageTesting3.DepositSuccessful();
        Utility.captureScreenshots(driver,"Successful5");
        //////////////////////////Verify deposit//////////////////////////
        //PageTesting3.OpenTransaction();

        ///////////click withdrawl////////////////////////////////////////
        PageTesting3.ClickWithdrawl();
        Utility.captureScreenshots(driver,"Select Withdrawal");
        PageTesting3.WithdrawAmount("31459");
        Utility.captureScreenshots(driver,"Withdraw amount");



    }
    public void wait(int seconds) {
        try {
            Thread.sleep(2000);
        } catch (final InterruptedException e) {
            e.printStackTrace();

        }
    }
}