package org.testOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectionclass {
	public static void  mian(String[] args) {
		String selection ="https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
		String dd = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get(dd);
		driver.manage().window().maximize();
	}

}
