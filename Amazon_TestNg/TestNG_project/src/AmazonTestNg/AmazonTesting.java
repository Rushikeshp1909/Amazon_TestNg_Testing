package AmazonTestNg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AmazonTesting {
	
	WebDriver driver;
	
	
	//Launch the browser
	
	@BeforeMethod
	public void Launch_browser() throws InterruptedException
	{
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(800);
	}
	
	
	
	//Login to Amazon
	
	@Test(priority = 0)
	public void Login_to_Amazon() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("rushikeshp1909@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Rushi@1909");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Thread.sleep(1000);
		
		System.out.println("Login Test is Passed\n");
	}
	
	
	
	//Search the item
	
	@Test(dependsOnMethods = {"Login_to_Amazon"})
	public void Search_item() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apple iphone 15");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(1100);
		
		System.out.println("Search Test is Passed\n");	
	}

	
	
	//Verify the title
	
	@Test(priority = 1)
	public void verifyTitle() throws InterruptedException
	{
	String ActualTitle = driver.getTitle();
	System.out.println("Actual Title = "+ActualTitle);
	String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	System.out.println("Exepected Title = "+ExpectedTitle);
	System.out.println("\nActual and Expected Title Both are Matched\n");

	//Check Actual & Expected Result
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	
	System.out.println("Title Test is Passed\n");
	}
	
	
	
	//Verify the Logo
	
	@Test (priority = 2)
	public void verifyLogo() throws InterruptedException
	{
		
	boolean VerifyLogo = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
	
	Assert.assertTrue(VerifyLogo);
	System.out.println("Logo Test is Passed");
	}

	
	
	//Close the Browser
		
	@AfterMethod(alwaysRun = true)
	public void Close_Browser() throws InterruptedException
	{
		driver.close();
		Thread.sleep(1000);
	}

}
