package demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GoseecarsSWextentreport {

	public String username = "ashwini.kamsala";
    public String accesskey = "ekmSvl35ZFhAUJXpVosVLuwh9sxSV005AtDAmUUQhe1B542DXA";
    public static RemoteWebDriver driver = null;
    public String gridURL = "@hub.lambdatest.com/wd/hub";
    boolean status = false;
    String str=System.getProperty("user.dir")+"\\reports\\index.html";	
 	ExtentReports extentreport = new ExtentReports();
 	  ExtentSparkReporter extentspark = new ExtentSparkReporter("GoseereportDesktopAUNZ.html");
    @BeforeClass
    public void setUp() throws Exception {
       DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "107.0");
//        capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get the any available one
        capabilities.setCapability("build", "GoseeCarR");
        capabilities.setCapability("name", "GoseeCarR");
        try {
            driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
        } catch (MalformedURLException e) {
            System.out.println("Invalid grid URL");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//    @Test
//    public void testSimple() throws Exception {
//       try {//Change it to production page
//            driver.get("https://lambdatest.github.io/sample-todo-app/");
//              //Let's mark done first two items in the list.
//              driver.findElement(By.name("li1")).click();
//            driver.findElement(By.name("li2")).click();
//             // Let's add an item in the list.
//              driver.findElement(By.id("sampletodotext")).sendKeys("Yey, Let's add it to list");
//            driver.findElement(By.id("addbutton")).click();
//              // Let's check that the item we added is added in the list.
//            String enteredText = driver.findElement(By.xpath("/html/body/div/div/div/ul/li[6]/span")).getText();
//            if (enteredText.equals("Yey, Let's add it to list")) {
//                status = true;
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
    
    @Test
    public void testUntitledTestCase() throws Exception {
    	extentspark.config().setTheme(Theme.STANDARD);
		extentspark.config().setDocumentTitle("RBF");
		  extentreport.attachReporter(extentspark);
//		  
		  ExtentTest test= extentreport.createTest("RBF report AUNZ");
    		Thread.sleep(2000);
    		driver.get("https://www.goseetravel.com/?rbf=true");
    		Thread.sleep(2000);
//    		driver.findElement(By.id("pickup_location")).click();
//    		Thread.sleep(2000);
//    		driver.findElement(By.id("pickup_location")).clear();
//    		Thread.sleep(2000);
//    		driver.findElement(By.id("pickup_location")).sendKeys("Auckland Airport (International) (AKL), New Zealand");
//    		Thread.sleep(2000);
//    		driver.findElement(By.name("dropOffAtSameLocation")).click();
//    		Thread.sleep(2000);
//    		driver.findElement(By.id("dropoff_location")).click();
//    		Thread.sleep(2000);
//    		driver.findElement(By.id("dropoff_location")).clear();
//    		Thread.sleep(2000);
//    		driver.findElement(By.id("dropoff_location")).sendKeys("Auckland Airport (International) (AKL), New Zealand");
//    		Thread.sleep(2000);
//    		driver.findElement(By.xpath("//div[@id='pickupDateField']/div/div/div/span")).click();
//    		Thread.sleep(2000);
//    		driver.findElement(By.xpath("//div[@id='date-picker-popper']/div/div/div/div/div/div/div[2]/div[2]/div/div[3]/div/table/tbody/tr[3]/td[2]")).click();
//    		Thread.sleep(2000);
//    		driver.findElement(By.xpath("//div[@id='date-picker-popper']/div/div/div/div/div/div/div[2]/div[2]/div/div[3]/div/table/tbody/tr[3]/td[3]")).click();
//    		Thread.sleep(2000);
//    		driver.findElement(By.xpath("//form[@id='widget-search-form']/div/div/div[3]")).click();
//    		Thread.sleep(2000);
//    		driver.findElement(By.name("customDriverDetails")).click();
//    		Thread.sleep(2000);
//    		driver.findElement(By.id("mui-615513465")).click();
//    		Thread.sleep(2000);
//    		driver.findElement(By.id("mui-615513465")).clear();
//    		Thread.sleep(2000);
//    		driver.findElement(By.id("mui-615513465")).sendKeys("Australia");
//    		Thread.sleep(2000);
//    		driver.findElement(By.id("search-cars-btn")).click();
    	
    	WebElement pickup = driver.findElement(By.id("pickup_location"));
		pickup.click();
		pickup.sendKeys("Auckland Airport (International) (AKL), New Zealand");
		Thread.sleep(2000);
		pickup.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		pickup.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		String Dest=pickup.getAttribute("defaultValue");//Dest print
		test.info("Pickup Location : "+Dest);
		
		Thread.sleep(2000);
		
		//checkbox Drop off at same location (to uncheck if different drop off location)
				driver.findElement(By.name("dropOffAtSameLocation")).click();
				Thread.sleep(2000);
				//DROP OFF LOCATION -- USE IF DROP OFF LOCATION IS DIFFERENT FROM PICKUP
				WebElement dropoff = driver.findElement(By.id("dropoff_location"));
				dropoff.click();
				dropoff.sendKeys("Wellington Airport (WLG), New Zealand");
				Thread.sleep(2000);
				dropoff.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(2000);
				dropoff.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				String Dest1=dropoff.getAttribute("defaultValue");//Destdrop print
				test.info("Dropoff Location : "+Dest1);
				
				//Select date - Method 2
				driver.findElement(By.id("pickupDateField")).click();
				String day = "19";
				String month = "January";
				String year = "2023";
				String pickupdate = String.format("%s %s, %s", month, day, year);
				Thread.sleep(2000);
				while (!driver.findElement(By.cssSelector(".DayPicker_1.DayPicker__horizontal.DayPicker")).getText().contains(month))
				{
				driver.findElement(By.cssSelector(".DayPickerNavigation__horizontal_2 > div:nth-child(2)")).click();
				}
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*/td[contains(@aria-label, ' "+ pickupdate +"')]")).click();
				Thread.sleep(2000); 
				
				
				 day = "21";
				 month ="January";
				 year ="2023";
				
			    String dropOffDate = String.format("%s %s, %s", month, day, year);
			    Thread.sleep(3000);
			    WebElement PickupDate=driver.findElement(By.xpath("//*[@id=\"pickupDateField\"]/div/div/div[1]/span"));//pickup Date print
			    String pickoff=PickupDate.getAttribute("innerText");
			    test.info("Pickup date : "+pickoff);
			    Thread.sleep(2000);
				while (!driver.findElement(By.cssSelector(".DayPicker_1.DayPicker__horizontal.DayPicker")).getText().contains(month))
				{
				driver.findElement(By.cssSelector(".DayPickerNavigation__horizontal_2 > div:nth-child(2)")).click();
				}
				Thread.sleep(2000); 
			   
				
			    driver.findElement(By.xpath("//*/td[contains(@aria-label, ' "+ dropOffDate +"')]")).click();
			    
			    Thread.sleep(3000);
			   
			    WebElement drpoffDate=driver.findElement(By.xpath("//*[@id=\"dropoffDateField\"]/div/div/div[1]/span"));//pickup Date print
			    String drpoff=drpoffDate.getAttribute("innerText");
			    test.info("Drop off date : "+drpoff);
			    Thread.sleep(3000);
			  //Calendar confirm button
				driver.findElement(By.xpath("//div/div[2]/button")).click();
				
				 Thread.sleep(3000);
				    driver.findElement(By.name("customDriverDetails")).click();
				    Thread.sleep(3000);
				    
				    WebElement CountryIlivein = driver.findElement(By.xpath("//div/div[2]/div[2]/div/div[2]/div/div/input"));
					CountryIlivein.click();
					CountryIlivein.sendKeys("Australia");
					CountryIlivein.sendKeys(Keys.ARROW_DOWN);
					CountryIlivein.sendKeys(Keys.ENTER);
					Thread.sleep(3000);
					String Source=CountryIlivein.getAttribute("defaultValue");//Source print
					test.info("Country I live in : "+Source);
									
					driver.findElement(By.xpath("//*[contains(button,'Search Cars')]")).click();
					Thread.sleep(10000);
					
					
//					Hertz supplier
					
//					WebElement supplier= driver.findElement(By.xpath("//*[@id='down-below']/div[3]/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/div/div/label/span[1]/input"));
//					supplier.click();
////					String supplierselected=supplier.
////					WebElement time = driver.findElement(By.id("input_name")).getAttribute("Hertz");
					
					
////					Hertz
//					WebElement suppliers= driver.findElement(By.xpath("//*[@id=\"down-below\"]/div[3]/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/div/div/label/span[1]/input"));
//					suppliers.click();
//					Thread.sleep(3000);
////					String carfind=suppliers.getAttribute("defaultValue");
//////					System.out.println(carfind); //carfind print
//////					test.info("Supplier : "+carfind);
//////					
////					List<WebElement> elem = driver.findElements(By.xpath("//*[@id=\"down-below\"]/div[3]/div[2]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div[1]/h3"));
////					
////					for(int i=0;i<elem.size();i++)
////					 {
////					 String cars=elem.get(i).getText();
//////					 System.out.println(cars); //Carmodel print
//////					 test.info("Vehicle Selected : "+cars);
////					 if(cars.contains("Hyundai I30"))
////					 {
////					 JavascriptExecutor js = (JavascriptExecutor) driver;
////					 js.executeScript("window.scrollBy(0,400)");
//					 Thread.sleep(2000);
//					 driver.findElement(By.xpath("//*[@id=\"down-below\"]/div[3]/div[2]/div/div[2]/div[2]/div[4]/div[3]/div/button")).click();
////					 break;
////					 
////					 }
////					 }
//					 Thread.sleep(10000);
//						JavascriptExecutor js = (JavascriptExecutor) driver;
//						js.executeScript("window.scrollBy(0,200)");	
//						Thread.sleep(20000);
////						JavascriptExecutor js = (JavascriptExecutor) driver;
//						js.executeScript("window.scrollBy(0,1000)");
//						WebElement insuranced=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div[3]/div/div[1]/div[4]/div/div[3]/div[8]/button"));
//						String insuranceselect=insuranced.getAttribute("innerText");
////						test.info("Insurance Protection : "+insuranceselect);	//insurance print
//						insuranced.click();
//						Thread.sleep(20000);
//						driver.findElement(By.xpath("//*[@id='mui-94']")).sendKeys("sumalatha.nallavelli@goseetravel.com");
//						Thread.sleep(3000);
//						driver.findElement(By.xpath("//*[@id='mui-95']")).sendKeys("sumalatha.nallavelli@goseetravel.com");
//						Thread.sleep(3000);
//						driver.findElement(By.xpath("//*[@id='mui-96']")).sendKeys("sumaautomation");
//						Thread.sleep(3000);
//						driver.findElement(By.xpath("//*[@id='mui-97']")).sendKeys("testing");
//						Thread.sleep(3000);
//						driver.findElement(By.xpath("//*[@id='phoneNumber']")).sendKeys("543");
//						Thread.sleep(3000);
////						driver.findElement(By.xpath("//*[@id='mui-99']")).sendKeys("120 State Route 45, Reservoir VIC, Australia");
////						Thread.sleep(4000);
////						
//						js.executeScript("window.scrollBy(0,200)");
//						WebElement Address = driver.findElement(By.xpath("//*[@id='mui-100']"));
//						Address.click();
//						Address.sendKeys("120 State Route 45, Reservoir VIC, Australia");
//						Thread.sleep(2000);
//						Address.sendKeys(Keys.ARROW_DOWN);
//						Address.sendKeys(Keys.ENTER);
//						Thread.sleep(3000);					
//						js.executeScript("window.scrollBy(0,800)");
//						Thread.sleep(2000);
//						driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"rezpayments_iframe\"]")));
//						System.out.println("you are in rez payment iframe");
//						
//						driver.findElement(By.xpath("//*[@id='card-number']")).sendKeys("4111111111111111");
//						Thread.sleep(1000);
//						driver.findElement(By.xpath("//*[@id='card-expiry']")).sendKeys("1222");
//						Thread.sleep(1000);
//						driver.findElement(By.xpath("//*[@id='security-code']")).sendKeys("213");
//						Thread.sleep(1000);
//						driver.findElement(By.xpath("//*[@id='card-name']")).sendKeys("test test");
//						Thread.sleep(1000);
//						driver.switchTo().defaultContent();
//						Thread.sleep(3000);
//						js.executeScript("window.scrollBy(0,500)");
//						driver.findElement(By.xpath("//*[@id='app']/main/div/div[2]/div/div[1]/div[1]/div[12]/div[1]/div/span/input")).click();
//						Thread.sleep(1000);
//						driver.findElement(By.xpath("//*[@id='app']/main/div/div[2]/div/div[1]/div[1]/div[12]/div[2]/div/span/input")).click();
//						Thread.sleep(2000);
////						driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div/div[1]/div[2]/div[1]/button")).click();
						
						
    	
    	
    }
    @AfterTest
    public void afterTest() {
    	  extentreport.flush();
    	  //driver.quit();
    }

     
    
    @AfterClass
    public void tearDown() throws Exception {
       if (driver != null) {
            ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
            driver.quit();
        }
    }

}
