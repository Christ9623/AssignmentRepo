package qaautomation.tugas4;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
//import org.testng.annotations.Test;

public class WebTest extends BaseWebTest {	
	
	
	@Test
	public void switchFrame() {
		
		driver.get().get("https://yopmail.com/en/");
		driver.get().findElement(By.xpath("//input[@id='login']")).sendKeys("automationtest");
		driver.get().findElement(By.xpath("//i[@class='material-icons-outlined f36']")).click();
		driver.get().switchTo().frame("ifinbox");
		driver.get().findElement(By.xpath("//div[@id='e_ZwVjBQN3ZGpmZGH2ZQNjZmRkAmZ2ZD==']//button[@class='lm']")).click();
		driver.get().switchTo().parentFrame();
		driver.get().switchTo().frame("ifmail");
		String body = driver.get().findElement(By.xpath("//div[@dir='ltr']")).getText();
		System.out.println(body);
//		String expectedResult = "test automation";
//		Assert.assertTrue(body.contains(expectedResult));
		//System.out.println(body);
//		String actualText = driver.get().findElement(By.xpath("//iframe[@id='ifinbox']")).getText();
//		String expectedResult = "Invygo Team <no-reply@invygo.com>";
//		AssertJUnit.assertTrue(actualText.contains(expectedResult));
		
		
	}
	
		
		


}
