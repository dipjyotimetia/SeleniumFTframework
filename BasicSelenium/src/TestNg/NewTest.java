package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	public String url="http://www.demo.guru99.com/V4/index.php";
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Research\\Resourses\\ChromeDriver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
	  System.out.println("Title of the page"+driver.getTitle());
	  driver.quit();
  }
}
