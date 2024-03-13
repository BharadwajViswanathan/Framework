package com.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ExtentReport.Extentlogger;

public class coarts extends BaseClass {
@Test
	public void corts() {

	List<WebElement> findElement = driver.findElements(By.xpath("//ul[@class='site-index-list']//li//span//a"));
	int size = findElement.size();
	Extentlogger.info(size+"");
	for (int i = 0; i < size; i++) {
		String text = findElement.get(i).getText();
		implictwait(10);
		javascriptclick(findElement.get(i));
		implictwait(10);
	
		Extentlogger.pass("Screeshot of page "+text, true);
		implictwait(10);
		driver.navigate().back();
		implictwait(10);
}
}
}