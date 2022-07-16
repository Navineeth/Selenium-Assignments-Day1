package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBroswer {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		// click create lead
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Navaneetha");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krishnan");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Naveen");

		driver.findElement(By.name("departmentName")).sendKeys("Non-IT");

		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Leaf Leads are so experienced");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("naveen803887@gmail.com");

		WebElement source = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select drop1 = new Select(source);

		drop1.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();

		String title = driver.getTitle();

		System.out.println(title);

	}

}
