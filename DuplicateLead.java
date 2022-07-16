package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Navaneetha");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krishnan");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Naveen");

		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information Technology");

		driver.findElement(By.name("description"))
				.sendKeys("Leads from test leaf are very well industry experienced based employees");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("naveen803887@gmail.com");

		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select drop1 = new Select(state);

		drop1.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();

		String title = driver.getTitle();
		
		System.out.println(title);

		driver.findElement(By.className("subMenuButton")).click();

		driver.findElement(By.id("createLeadForm_companyName")).clear();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Leaf Grow");

		driver.findElement(By.id("createLeadForm_firstName")).clear();

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Navaneeth");

		driver.findElement(By.name("submitButton")).click();

		String title1 = driver.getTitle();
		
		System.out.println(title1);

	}
}

