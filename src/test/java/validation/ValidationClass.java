package validation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationClass {

	
	
	public static void  mian(String[] args) {
		
		String dd = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get(dd);
		driver.manage().window().maximize();
	}

}
