package org.testOne;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.*;

public class Webtable {
	 


	public static void main(String[]args)throws Throwable {
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		
		List<WebElement> itable=driver.findElements(By.tagName("table"));
		for(int i=0;i<itable.size();i++) {
		WebElement table =itable.get(i);
	WebElement body=table.findElement(By.tagName("tbody"));
	List<WebElement> row =body.findElements(By.tagName("tr"));
	for(int j=0;j<row.size();j++){
		WebElement trow = row.get(j);
		List<WebElement>Data =trow.findElements(By.tagName("td"));
		for (int k = 0; k < Data.size(); k++) 
		{
			WebElement tdata =Data.get(k);
			String text = tdata.getText();
	         if(text.equals("Dubai")) {
				System.out.println(text+"is present one");
			}
			

		}
		
				}
	}

	}
}
