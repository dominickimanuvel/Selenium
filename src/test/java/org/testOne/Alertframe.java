package org.testOne;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertframe {
	private static final int i = 0;

	public static void main(String[]args)throws Throwable{
		String alert = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
		String frames = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(frames);
		driver.manage().window().maximize();
		
		

		
	}

}
