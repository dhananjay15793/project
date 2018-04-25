import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class youtube {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("(.//*[@id='search'])[2]")).sendKeys("jine bhi de duniya hume",Keys.ENTER);
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@id='sbse0']/div[2]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
		driver.findElement(By.xpath("(//a[@id='video-title'])[2]")).click();
		Thread.sleep(4000);
		WebElement wb=driver.findElement(By.xpath("//div[@id='movie_player']//div[@class='ytp-progress-bar-padding']"));
	    Point loc = wb.getLocation();
	    int x = loc.getX();
	    int y=loc.getX();
	    System.out.println(x+" "+y); 
	    Actions act=new Actions(driver);
	    act.moveByOffset(36, 30).perform();;
	    System.out.println("moved");
	}
}
