package Pages;

import Library.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class web_Elements {

    WebDriver driver;

    ////clicked Login customer///
    public void LoginTest() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,20);
        driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div[@class='container-fluid ng-scope']/div[@class='ng-scope']//button[.='Customer Login']")).click();

    }

    public void HomePage(){
        driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']//button[@class='btn home']")).click();

    }

    public void SelectYourName() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#userSelect > option:nth-child(2)")).click();
    }

    public void NameSelectedSubmit() throws InterruptedException{
        driver.findElement(By.cssSelector("form[role='form'] > .btn.btn-default")).click();
        Thread.sleep(4000);
        WebElement element = driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div[@class='container-fluid ng-scope']/div[@class='ng-scope']//span[@class='fontBig ng-binding']"));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertEquals("Hermoine Granger", strng);
        System.out.println("Assert passed");


    }

    public void Select_Deposit() throws InterruptedException {
        driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']/div/div[3]/button[2]")).click();
        System.out.println("Select Options deposit");

    }

    public void TransactionAmount (String Amount) throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']//div[@class='container-fluid mainBox ng-scope']//form[@role='form']//input[@type='number']")).sendKeys(Amount);
        System.out.println("insert amount");
    }

    public void SubmitTransactionAmount(){
        driver.findElement(By.cssSelector("form[role='form'] > button")).click();
        System.out.println("Deposit transaction");


    }

    public void LogoutUser() throws InterruptedException {
        driver.findElement(By.cssSelector(".btn.logout")).click();
        System.out.println("Logout");
        WebElement element2 = driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']//form[@role='form']//label[.='Your Name :']"));
        String strng3 = element2.getText();
        System.out.println(strng3);
        Assert.assertEquals("Your Name :", strng3);
        System.out.println("Assert passed");
    }


    public void NewUserLogin() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//select[@id='userSelect']/option[@value='2']")).click();
        System.out.println("new customer");
        Utility.captureScreenshots(driver,"New Customer selected");
        driver.findElement(By.cssSelector("[type='submit']")).click();
        Utility.captureScreenshots(driver,"Logged in");
        System.out.println("login");
        WebElement element2 = driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div[@class='container-fluid ng-scope']/div[@class='ng-scope']//span[@class='fontBig ng-binding']"));
        String strng = element2.getText();
        System.out.println(strng);
        Assert.assertEquals("Harry Potter", strng);
        System.out.println("Assert passed");

    }

    public void SelectAccount1() throws InterruptedException {
        driver.findElement(By.xpath("//select[@id='accountSelect']/option[@label='1004']")).click();
        System.out.println("select account 1004");
        ///validate if correct account number////
        WebElement element3 = driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']/div/div[2]/strong[1]"));
        String strng = element3.getText();
        System.out.println(strng);
        Assert.assertEquals("1004", strng);
        System.out.println("Assert passed");

    }


    public void SelectOptionDeposit() throws InterruptedException {
        driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']/div/div[3]/button[2]")).click();
        System.out.println("Select Deposit");
    }


    public void SelectAccount2() throws InterruptedException {
        driver.findElement(By.xpath("//select[@id='accountSelect']/option[@label='1005']")).click();
        System.out.println("clicked acc 1005");
        ///validate if correct account number////
        WebElement element4 = driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']/div/div[2]/strong[1]"));
        String strng = element4.getText();
        System.out.println(strng);
        Assert.assertEquals("1005", strng);
        System.out.println("Assert passed");
    }


    public void SelectAccount3() throws InterruptedException {
        driver.findElement(By.xpath("//select[@id='accountSelect']/option[@label='1006']")).click();
        System.out.println("clicked acc 1005");
        ///validate if correct account number////
        WebElement element4 = driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']/div/div[2]/strong[1]"));
        String strng = element4.getText();
        System.out.println(strng);
        Assert.assertEquals("1006", strng);
        System.out.println("Assert passed");
    }

    public void DepositSuccessful() {
        WebElement element5 = driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']//div[@class='container-fluid mainBox ng-scope']//span[@class='error ng-binding']"));
        String strng = element5.getText();
        System.out.println(strng);
    }

    public void OpenTransaction() throws InterruptedException {
        ///OPEN TRANSACTIONS
        driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']/div/div[3]/button[1]")).click();
        ///VERIFY TRANSACTIONS
        Thread.sleep(4000);
        WebElement element5 = driver.findElement(By.xpath("//html/body/div[3]/div/div[2]/div/div[2]/table/tbody/tr[2]/td[1]"));
        WebElement element6 = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/table/tbody/tr[2]/td[2]"));
        String TransactionDate = element5.getText();
        String TransactionAmount = element6.getText();
        Assert.assertTrue("Feb 25, 2021 6:32:09 PM".contains("Feb "));
        Assert.assertEquals("31459", TransactionAmount);

    }


    public void OpenTransactionafterwithdrawl(){
        driver.findElement(By.cssSelector("tr:nth-of-type(5) > td:nth-of-type(2)")).click();
        WebElement element9 = driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']//table[@class='table table-bordered table-striped']/tbody/tr[2]/td[2]"));
        String TransactionAmount = element9.getText();
        Assert.assertEquals("31459", TransactionAmount);
    }

    public void BackButton() {
        driver.findElement(By.cssSelector("[ng-click='back\\(\\)']")).click();
        }

    public void ClickWithdrawl() {
        driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']/div/div[3]/button[3]")).click();

    }

    public void WithdrawAmount(String WithdrawAmount) throws InterruptedException {
        driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']//div[@class='container-fluid mainBox ng-scope']//form[@role='form']//input[@type='number']")).sendKeys(WithdrawAmount);
        System.out.println("insert amount");
        driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']//div[@class='container-fluid mainBox ng-scope']//form[@role='form']/button")).click();

    }

    public void validateBalance() {
        WebElement element7 = driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div/div[@class='ng-scope']/div/div[2]/strong[2]"));
        String ValidateBalance = element7.getText();
        Assert.assertEquals("5096", ValidateBalance);
    }

    public web_Elements(WebDriver driver) {
        this.driver = driver;

    }


}

