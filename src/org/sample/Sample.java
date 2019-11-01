package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\091819\\ScreenShotProgram\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	TakesScreenshot tk = (TakesScreenshot)driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\DELL\\Desktop\\screenshot\\firstpage.png");
	FileUtils.copyFile(src, dest);
	WebElement name = driver.findElement(By.id("email"));
	name.sendKeys("vishnu");
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("vishnu");
	WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
	btn.click();
	File src1 = tk.getScreenshotAs(OutputType.FILE);
	File dest1 = new File("C:\\Users\\DELL\\Desktop\\screenshot\\loginpage.png");
	FileUtils.copyFile(src1, dest1);
	}

}
