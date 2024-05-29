package TestBase;

	import java.io.File;
	import java.text.SimpleDateFormat;
	import java.time.Duration;
	import java.util.Date;

	import org.apache.commons.io.FileUtils;
	
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.*;

	public class BaseClass {
		
		public static WebDriver driver;
		
		
		@BeforeClass
		public void setup()
		{
			
			driver=new ChromeDriver();
			driver.get("https://www.moglix.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		}
		
		@AfterClass
		public void close()
		{
			driver.quit();

		}
		
		public String captureScreen(String tname)
		{
			String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			
			TakesScreenshot screenshot=((TakesScreenshot)driver);
			File source=screenshot.getScreenshotAs(OutputType.FILE);
			String destination=System.getProperty("user.dir")+"\\Screenshots\\"+tname+"_"+timestamp+".png";
			try 
			{
				FileUtils.copyFile(source, new File(destination));
			}
			catch(Exception e)
			{
				e.getMessage();
			}
			return destination;
		}

	}






