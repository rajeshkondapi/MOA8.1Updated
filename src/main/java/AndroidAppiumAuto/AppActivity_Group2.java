package AndroidAppiumAuto;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.json.JSONException;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import AndroidAppiumAuto.exceptions.CustomException;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;



public class AppActivity_Group2 extends SupportMethods {
	
	AndroidDriver<AndroidElement> dr;
	DesiredCapabilities cap = new DesiredCapabilities();
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
	static SimpleDateFormat sdffolder = new SimpleDateFormat("yyyy_MM_dd");
	public static String getDate() {
		return sdf.format(new java.util.Date());
	}
	public static String getDatefolder() {
		return sdffolder.format(new java.util.Date());
	}

	
	
	@Test(description = "Login Pages with Nomsisdn1", priority = 1, enabled = false)
	//@org.testng.annotations.Parameters(value={"msisdn1"})
	public void Nomsisdn1() throws Exception {
		logger = extent.startTest("Login Page With No msisdn1 Scenarios", "Description to Login Page With No msisdn1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		withoutmsisdn();
	}
	
	@Test(description = "Login Pages InvalidMs", priority = 2, enabled = false)
	@org.testng.annotations.Parameters(value={"msisdn1"})
	public void Invalidmsisdn1(String msisdn1) throws Exception {
		logger = extent.startTest("Login Page Invalid msisdn1 Scenarios", "Description to Login Page Invalid msisdn1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		invalidnumber();
	}
		
	
	@Test(description = "Login Pages Correct", priority = 3, enabled = false)
	@org.testng.annotations.Parameters(value={"msisdn1"})
	public void LoginPage(String msisdn1) throws Exception {
		logger = extent.startTest("Login Page Success Scenario", "Description to LoginPage Success Scenario");
		loginpage(msisdn1);			
	}
	
	@Test(description = "OTP Page Validation", priority = 4, enabled = false)
	@org.testng.annotations.Parameters(value={"msisdn1"})
	public void OTPPageValidation(String msisdn1) throws Exception {
		logger = extent.startTest("OTP Page Validation", "Description to OTP Page Validation");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				
		OTPValidation(msisdn1);
	}
	
	
	@Test(description = "Resend & Fetch OTP", priority = 5, enabled = false)
	@org.testng.annotations.Parameters(value={"msisdn1"})
	public void ResendFetchOTP(String msisdn1) throws Exception {
	logger = extent.startTest("Resend & Fetch OTP from DB", "Description to Resend & Fetch OTP from DB");	
	resendandgetotp2();
	}
	
	@Test(description =  "Contextual Popup", priority = 6, enabled = false)
	public void contextpopup() throws Exception  {
		logger = extent.startTest("Context Popup", "Description to contextul  popup");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		propertyelements();
		contextmethod();
	}
	
	
	@Test(description =  "Banners Details", priority = 7, enabled = false)
	public void BannerDetails() throws Exception  {
		logger = extent.startTest("Banner Details(Manual Verification Required to Check Banners Displayed on the App)", "Description to BannerDetails (Manual Verification Required to Check Banners Displayed on the App)");
		AutoBannerheader();
	}
	
	
	@Test(description =  "QuickLinks", priority = 8, enabled = false)
	public void QuickLinks() throws Exception  {
		logger = extent.startTest("QuickLinks Redirections", "Description to QuickLinks  Redirections");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		QuickLinksPlus();
	}
	
	@Test(description =  "Notifications", priority = 9, enabled = false)
	public void Notifications() throws Exception  {
		logger = extent.startTest("Bell Icon Notifications Redirection", "Description to Notifications  Redirections");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		bellnotification();		
	}
	
	
	@Test(description =  "Usage History", priority = 10, enabled = false)
	public void UsageHistory() throws Exception  {
		logger = extent.startTest("User Usage History", "Description to Usage History");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		usage();		
	}
	
	
	@Test(description =  "UserRegisterStatus", priority = 11, enabled = false)
	public void UserRegisterStatus() throws Exception  {
		logger = extent.startTest("User SIM Registration Status", "Description to User Registration Status");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		registerstatus();
	}
	
	
	@Test(description =  "UserRegisterDetails", priority = 12, enabled = false)
	public void UserRegisterDetails() throws Exception  {
		logger = extent.startTest("User SIM Registration Details", "Description to User Registration Details");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		registerdetails();
		}
	
	

//  context pop up check header related	
		
		/*dbdetails("regsimdropdown", "regsimstatusquery");
		WebElement status = Webdr.findElement(sesiontoken);
		String userstatus = status.getText();
		System.out.println(userstatus);	
		
		//driver.resetApp();
		ETLiveTransApi("chkHeader", "Authentication", "1589867941209359", obj.getProperty("apiversion"), "popups",
				obj.getProperty("apiuri"), "order", "","data");	
		
		//System.out.println("Total pop up from API = "+popuporders.keySet().size());
		Map<String,String> ordername =  new HashMap<>();
		int count = 1;
		for(String key : popuporders.keySet()) {
           String[] arr = key.split("_");
           String ord = arr[0];	
           List<Schedule> li = popuporders.get(key);
           System.out.println("Key: " + key);
           System.out.println("---------------------");
           for(int orderwise = 1; orderwise<=li.size();orderwise++) {            
            for(Schedule schedule : li) {
            	if(Integer.valueOf(ord) == orderwise && schedule.getUserstatus().contains(userstatus)) {
            		System.out.println("scheduleName = "+schedule.getName() + "status = "+ord);
            		ordername.put(ord, schedule.getName());
            		count++;
            		
            		//
            	}
                System.out.println("scheduleName: " + schedule.getName() + " userStatus: " + schedule.getUserstatus());
            }
            System.out.println("---------------------");
           }
		}
		
		System.out.println(ordername);
		
		 */
		
		//driver.closeApp();
//		Key: 1_Status popup
//		---------------------
//		scheduleName: Sim Registration userStatus: [500,2,3]
//		scheduleName: Sim Registration Approved userStatus: [0]		
		/*ETLiveTransApi("GetPopupInfo", "contextual", "1600231037439", obj.getProperty("apiversion"), "vasdetails",
				obj.getProperty("apiuri"), "title", "");*/		
		//http://ecareapp.ooredoo.com.mm/SelfcareAPI7.2/api//
		//Thread.sleep(5000);		
		/*String ActivateName = driver.currentActivity();
		String curentpackage = driver.getCurrentPackage();
		System.out.println("ActivityName = "+ActivateName);	
		System.out.println("PackageName = "+curentpackage);		
		//driver.runAppInBackground(Duration.ofSeconds(5));		
		driver.terminateApp(curentpackage);		
		//driver.closeApp();
		//driver.launchApp();		
		Thread.sleep(3000);
		((AndroidDriver) driver).startActivity(new Activity(curentpackage, curentpackage+ActivateName));
		*/
	
	@Test(description = "Data Voice SMS Details", priority = 13, enabled = false)
	public void QueryBalanceApi() throws Exception {
		logger = extent.startTest("User Packs Details", "Description to Packs Details");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		querydataapi();
	}
	
	
	@Test(description =  "VIP HomePage", priority = 14, enabled = false)
	public void VIPHomePage() throws Exception, InterruptedException, CustomException {
		logger = extent.startTest("VIP HomePage", "Description to VIPHomePage");
		contextmap.clear();
		//driver.getSessionDetails();
		vipnewhomepages();		
	}	


	@Test(description =  "DDD Packs", priority = 15, enabled = false)
	public void DDDPacks() throws Exception  {
		logger = extent.startTest("Don Don Don Packs", "Description to DDD PAcks");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);					
		ddbanners();		
	}
	

	@Test(description =  "Pyaw Pyaw Yu", priority = 16, enabled = false)
	public void PyawPyawYu() throws Exception, InterruptedException, CustomException {
		logger = extent.startTest("Pyaw Pyaw Yu Pack Purchase", "Description to PyawPyawYu");		
		pyawpyawTestCase();		
	}
	
	
	@Test(description = "VIP PageLoad Time", priority = 17, enabled = false)
	public void PageloadTest() throws Exception {
		logger = extent.startTest("VIP Page Load Time", "Description to page load");	
		vipclickupdate();
		long starttime = System.currentTimeMillis();
		if(AppValidation("onlyfor").equals("Only For You"));
		long EndTime = System.currentTimeMillis();
		getResult1("pass");
		long totaltime = EndTime - starttime;
		logger.log(LogStatus.INFO, " VIP Page Load Time : " +totaltime + " milliseconds");
		//ClickEvents("homebtton");
		}
	
	
	@Test(description =  "VIPHomePageShortCutIcons", priority = 18, enabled = true)
	public void VIPHomePageShortCutIcons() throws Exception, InterruptedException, CustomException {
		logger = extent.startTest("VIP HomePage ShortCut Icons Navigations", "Description to VIPHomePageShortCutIcons"); 
		Thread.sleep(5000);
		propertyelements();
		vipshort();
	}	
	
	
	@Test(description = "VIP Spin The Wheel", priority = 19, enabled = true)
	public void VipSpinWheel() throws Exception {
		logger = extent.startTest("VIP Spin The Wheel", "Description to VIP Spin The Wheel");	
		spinwheel();		
		}
	
	
	@Test(description = "VIP RedeemPoints", priority = 20, enabled = true)
	public void VIPRedeemPoints() throws Exception {
		logger = extent.startTest("VIP Redeem Points", "Description to VIP RedeemPoints");	
		RedeemPoints();		
		}
	
	
	@Test(description = "VIP MyDiscounts", priority = 21, enabled = true)
	public void VIPMyDiscounts() throws Exception {
		logger = extent.startTest("VIP MyDiscounts", "Description to VIP MyDiscounts");	
		//Thread.sleep(2000);
		MyDiscounts();		
		}
	
	
	@Test(description = "VIP MyPoints", priority = 22, enabled = true)
	public void VIPMyPoints() throws Exception {
		logger = extent.startTest("VIP MyPoints", "Description to VIP MyPoints");	
		Thread.sleep(2000);
		MyPoints();
		}
	
	
	@Test(description =  "UpdateLocation", priority = 23, enabled = true)
	public void UpdateLocation() throws Exception, InterruptedException, CustomException {
		logger = extent.startTest("Update New Location", "Description to UpdateLocation");
		updatelocation();	
		ClickEvents("homebtton");
	}
	
	
	@Test(description = "VIP EarnMorePoints", priority = 24, enabled = false)
	public void VIPEarnMorePoints() throws Exception {
		logger = extent.startTest("VIPEarnMorePoints", "Description to VIP Earn More Points");	
		//Thread.sleep(5000);
		EarnMorePoints();		
		}	
	

	@Test(description = "VIP MyBenefits", priority = 25, enabled = true)
	public void VIPMyBenefits() throws Exception {
		logger = extent.startTest("VIPMyBenefits", "Description to MyBenefits");	
		//Thread.sleep(5000);
		MyBenefits();		
		}
	
	@Test(description = "VIP", priority = 26, enabled = true)
	public void VIP_Validation() throws Exception {
		logger = extent.startTest("VIP User Details", "Description to VIP User Details");
		vipvaliddb();
	}
	
	@Test(description = "VIP ProfileUpdate", priority = 27, enabled = true)
	public void VIPProfileUpdate() throws Exception {
		logger = extent.startTest("VIP ProfileUpdate", "Description to ProfileUpdate");	
		ClickEvents("homebtton");		
		ProfileUpdate();				
		}
	
	@Test(description = "Entertainment section redirection", priority = 28, enabled = true)
	public void BannerDet() throws Exception {
		logger = extent.startTest("Entertainment section redirection", "Description to Entertainment section redirection");
		propertyelements();
		ClickEvents("homebtton");
		scrolltill("Entertainment", "Entertainment");		
		Swipe(3, "ETbanners",65);		
		logger.log(LogStatus.PASS, "Entertainment banners ");		
		getResult1("pass");
		ClickEvents("ETbanners");
		Thread.sleep(10000);
		getResult1("pass");
		logger.log(LogStatus.PASS, "Navigated to External Page");
		driver.navigate().back();
		}

	// Updated 31/08/20
		
		/*@Test(description = "Buy Packs - Buy", priority = 12, enabled = false)
		public void BuyPackBuy() throws Exception {

			logger = extent.startTest("BuyPackBuy", "Description to Buy Packs-Buy");
			Thread.sleep(8000);
			propertyelements();
			//ClickEvents("HomeIcon");
			
			bygft("buypackBuy", "Valid");
		}

		// Updated 31/08/20

		@Test(description = "Buy Packs - Gift", priority = 13, enabled = false)
		public void GiftPackGift() throws Exception {
			logger = extent.startTest("GiftPackGift", "Description to Gift Packs-Gift");
			Thread.sleep(3000);
			propertyelements();
			ClickEvents("homebtton");		
			Thread.sleep(2000);
			//ScrollUp();
			 -- For Gift you need to get value from Sheet -- 
			bygft("buypackGift", "Valid");

		}	
		*/
		
		@Test(description = "LiveTV Details", priority = 29, enabled = true)
		public void LiveTVDetails() throws Exception {
			logger = extent.startTest("LiveTVDetails", "Description to LiveTVDetails");
			ClickEvents("homebtton");
			livetvdetails();
		}
		

		@Test(description = "Byop Home Page", priority = 19, enabled = false)
		public void ByopQueryBalance() throws Exception {
			logger = extent.startTest("BYOP Home Page", "Description to BYOP Home Page");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			propertyelements();
			//ScrollUp();
			//ScrollUp();
			//ClickEvents("HomeIcon");
			Thread.sleep(3000);
			ClickEvents("homebtton");
			String statetinekya = "Sate Tine Kya";
			scrolltill("byoptitle",statetinekya );	
			if(statetinekya.length()!=0) {
				List<String> APPByop = new ArrayList<>();
				APPByop.addAll(AppValidationList("isb_progress"));				
				APPByop.addAll(AppValidationList("tvEnd"));
				APPByop.addAll(AppValidationList("subbyoptitle"));
				System.out.println("APPByop ==> " + APPByop);
				logger.log(LogStatus.PASS, "Test Case Passed is ByopQueryBalance" +APPByop);
				getResult1("pass");
				
			} else {
				ClickEvents("homebtton");
				logger.log(LogStatus.PASS, "New User . Please Select your own pack from the BYOP Banner");
				swipeByElements();
				swipeByElements();
				String toastmesg = tc.ToastMessage(TakeScreenshot(),"Tine Kya");
				System.out.println("toastmesg == > "+toastmesg);				
				if(toastmesg.equals("True")) {
					getResult1("pass");
				} else {
					System.out.println("Failed to find BYOP Banner");
				}
			}			

			// scrolltill("buymorebyop", "Buy More");
			// ecarepreprod.ooredoo.com.mm/selfcareapistg7.1/api/
			//List<String> byopaapi = QueryBYOPBalance(obj.getProperty("apiversion"));
			//System.out.println("byopaapi ==>" + byopaapi);

			//if (byopaapi.size() > 2) {
				//Collections.sort(APPByop);
				//Collections.sort(byopaapi);
				//boolean ByopAPPByop = APPByop.equals(byopaapi);
				// Assert.asserttrue(ByopAPPByop);
				//if (ByopAPPByop) {
					//System.out.println("Passed");					
					// logger.log(LogStatus.INFO, "App Details : "+APPByop);
					// logger.log(LogStatus.INFO, "Api Details : "+byopaapi);
				/*} else {
					System.out.println("Failed");
					logger.log(LogStatus.FAIL, "MisMatch with App and Api Details : " + APPByop.removeAll(byopaapi));

					logger.log(LogStatus.FAIL, "App Details : " + APPByop);
					logger.log(LogStatus.FAIL, "Api Details : " + byopaapi);
				}
			} else {
				System.out.println("Passed");
				logger.log(LogStatus.PASS, "Banner Exists :" + byopaapi.get(0));
			}*/

		}	

	

		/*
	@Test(description = "Kyo Thone - Loan", priority = 6, enabled = false)
	public void KyoThone() throws Exception {
		logger = extent.startTest("KyoThone", "Description to Kyo Thone");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		propertyelements();
		// loan();
		ScrollUp();
		boolean loanthone = loan()
				.equalsIgnoreCase("Your request is being processed, please wait for a confirmation SMS.");
		if (loanthone) {
			logger.log(LogStatus.PASS, "Test Case Passed is Kyo Thone");
			getResult1("pass");
		} else {

			logger.log(LogStatus.FAIL, "Test Case failed due to = " + loanthone);
		}
		// test = extent.createTest("Test Case 6", "PASSED test case");
		ClickEvents("HomeIcon");

	}

	@Test(description = "Chat Box", priority = 6, enabled = false)
	public void chat() throws Exception {
		Thread.sleep(3000);
		ClickEvents("chat");
		Thread.sleep(3000);
		SendEvent("mesgchat", "hi");
		Thread.sleep(3000);

		ClickEvents("sendchat");
		// driver.navigate().back();
		System.out.println(driver.getDeviceTime());

		AppValidation("alltextfields");

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.TextView[contains(@resource-id,'com.ooredoo.selfcare:id/agent_name')]")));
		System.out.println(driver.getDeviceTime());
		ClickEvents("attach");
		driver.navigate().back();
		driver.navigate().back();

	}*/
	
	
	// log done
	@Test(description = "Top Up - Voucher", priority = 10, enabled = false)
	@org.testng.annotations.Parameters(value={"msisdn1"})
	public void TopUpVoucher(String msisdn1) throws JSONException, InterruptedException, Exception {
		
		logger = extent.startTest("TopUpVoucher", "Description to TopUpVoucher");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ClickEvents("homebtton");
		//if (AppValidation("Voucher").equalsIgnoreCase("Voucher")) {
		TopUpApp("TopUpText", "Voucher", "TopUp_Enter_VoucherCode", "Valid", "TopUp_ConfirmButton", "Voucher",msisdn1);
			// TopUpApp("TopUpText","Voucher","topuppin","Invalid","topupsubmit","Voucher");
			// TopUpApp("TopUpText","Voucher","topuppin","boundary","topupsubmit","Voucher");
			//ClickEvents("HomeIcon");
		//}
	}
	

	// log done
	@Test(description = "Top Up - MPitesan", priority = 30, enabled = true)
	@org.testng.annotations.Parameters(value={"msisdn1"})
	public void TopUpMPitesan(String msisdn1xml) throws Exception {
		// System.out.println("MPite init()");
		logger = extent.startTest("TopUpMPitesan", "Description to TopUpMPitesan");
		ClickEvents("homebtton");
		TopUpApp("TopUpText", "Mpitesan", "AmountPitesan", "Valid", "topupsubmit", "MPite",msisdn1xml);
		}

	
	@Test(description = "Report an Issue", priority = 31, enabled = true)
	public void Report_An_Issue() throws Exception {
		logger = extent.startTest("Report an Issue", "Description to Report an Issue");
		propertyelements();
		HSSFWorkbook report_an_issue_wb = Exceel();
		HSSFSheet report_an_issue_Sheet = report_an_issue_wb.getSheet("ContactUs");
		ClickEvents("MoreIcon");
		Thread.sleep(1000);
		getResult1("pass");
		ClickEvents("More_Contact_US_Support");
		Thread.sleep(1000);
		getResult1("pass");
		// driver.navigate().back();
		ClickEvents("Contact_Report_An_Issue");

		Thread.sleep(5000);
		getResult1("pass");
		try {
			for (int i = 1; i <= report_an_issue_Sheet.getPhysicalNumberOfRows(); i++) {
				String Enter_Name = report_an_issue_Sheet.getRow(i).getCell(1).getStringCellValue();
				System.out.println("Enter_Name ==>" + Enter_Name);
				String Category = report_an_issue_Sheet.getRow(i).getCell(2).getStringCellValue();
				// System.out.println("Category ==>"+Category);
				String Sub_Category = report_an_issue_Sheet.getRow(i).getCell(3).getStringCellValue();
				// System.out.println("Sub_Category ==>"+Sub_Category);
				String Date_Time = report_an_issue_Sheet.getRow(i).getCell(4).getStringCellValue();
				// System.out.println("Date_Time ==>"+Date_Time);
				String Description = report_an_issue_Sheet.getRow(i).getCell(5).getStringCellValue();
				// System.out.println("Description ==>"+Description);
				String Expected_Output = report_an_issue_Sheet.getRow(i).getCell(6).getStringCellValue();
				// System.out.println("Expected_Output ==>"+Expected_Output);
				Thread.sleep(8000);
				String result = Contact_Us_Page_Report_An_Issue(Enter_Name, Category, Sub_Category, Date_Time,
						Description, Expected_Output);
				System.out.println("result ==>" + result);
				if (result != null) {
					logger.log(LogStatus.PASS, "Report an Issue passed = " + result);
					getResult1("pass");
				} else {
					logger.log(LogStatus.FAIL, "Report an Issue Failed due to  " + result);
				}

			}
		} catch (Exception ex) {
			System.out.println("Report an Issue = " + ex);
		}

	}


	@Test(description = "More Settings", priority = 32, enabled = true)
	public void More_Settings() throws Exception {
		logger = extent.startTest("Settings (Roam, DND, Lang)", "Description to Settings");
		Settings();

	}
	
	@Test(description = "OoredooPlay", priority = 33, enabled = true)
	public void Ooredoo_Play() throws Exception {
		logger = extent.startTest("Ooredoo Play", "Description to Ooredoo Play");
		ClickEvents("homebtton");
		Ooredoo_Play_sub();
	}
	
	@Test(description="Existing Packages", priority = 34 , enabled = true)
	public void accountview() throws Exception {
		logger = extent.startTest("My Existing Packages", "Description to VIP Points");
		ExistingPacks();

	}
	
	@Test(description = "Log Out", priority = 35, enabled = true)
	public void LogOut() throws Exception {
		logger = extent.startTest("Logout", "logout Functoinality");
		logout();
		
	}


	

	/*@Test(description = "Service Banner", priority = 20, enabled = false)
	public void ServiceBanner() throws Exception  {
		logger = extent.startTest("Service Banner", "Description to Service Banner");
		ClickEvents("HomeIcon");
		scrolltill("ServiceText", "Services");
		getResult1("pass");
		String text = AppValidation("ServiceBanners");
		System.out.println("layout text == >"+text);

		String toastmesg = tc.ToastMessage(TakeScreenshot(),"discount");
		System.out.println("toastmesg == > "+toastmesg);
		if(toastmesg.equals("True")) {

			ClickEvents("ServiceBanners");
			Thread.sleep(5000);
			//getResult1("pass");
			//Thread.sleep(7000);			

			Set<String> contextNames = driver.getContextHandles();
			System.out.println(contextNames); 


			// logger.log(LogStatus.INFO, "contextName = "+contextNames);

			//String urlweb = AppValidation("WebUrl");

			// System.out.println("UrlWeb = "+urlweb);



			String BrowserRedirect = tc.ToastMessage(TakeScreenshot(),"pages.shop.com");
			System.out.println("toastmesg == > "+BrowserRedirect);
			if(BrowserRedirect.equals("True")) { 
				getResult1("pass");
				logger.log(LogStatus.PASS, "ServiceBanner Redirected Successfully "); 

			}
			else {
				logger.log(LogStatus.FAIL, "ServiceBanner Redirected UnSuccesfull . Please check again ! "); 
			}


			driver.navigate().back();


			for (String contextName : contextNames) {
	            System.out.println(contextName);	           
	            logger.log(LogStatus.INFO, "contextName = "+contextName);

	            if (contextName.contains("WEBVIEW")) {
	                //driver.context("WEBVIEW");
	                driver.switchTo().window(contextName);
	               System.out.println(driver.getCurrentUrl());
	                logger.log(LogStatus.INFO, "Redirected to Service Banner Page = "+driver.getCurrentUrl());

	            }
	        }
		}
		//You can switch to WEBVIEW using following code :			

		if(driver.getCurrentUrl().contains("pages.shop.com")) {
				logger.log(LogStatus.INFO, "Redirected to Service Banner Page");
				logger.log(LogStatus.PASS, "Redirected to Service Banner Page = "+driver.getCurrentUrl());
				getResult1("pass");
			} else {
				logger.log(LogStatus.FAIL, "Doesn't Redirected to Service Banner Page = "+driver.getCurrentUrl());				
			}


		} else {
			System.out.println("The Text you are trying to match doesnot found in the banner");
		}
	}*/


	
	
	

	@AfterMethod
	public void getResult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			String screenShotPath = capture(result.getName());
			logger.log(LogStatus.FAIL, "Snapshot below: " + logger.addBase64ScreenShot((screenShotPath)));
		}
		extent.endTest(logger);
	}

	public String capture(String screenShotName) throws IOException {

		String base64Image = null;
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src = ts1.getScreenshotAs(OutputType.FILE);
		System.out.println("Successfully captured a screenshot");
		// File source = new File(src);
		File destination = new File(System.getProperty("user.dir") + "\\ErrorScreenshots\\" + screenShotName + ".png");
		FileUtils.copyFile(src, destination);
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(destination);
			byte[] bytes = new byte[(int) destination.length()];
			fileInputStream.read(bytes);
			base64Image = new String(Base64.getEncoder().encodeToString(bytes));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return "data:image/png;base64,"+base64Image;
	}
	
	@AfterTest
	public void crashdetails(ITestResult resultcrash) {
		logger = extent.startTest("Crash Details", "Description to Crash");
		String activity = driver.currentActivity();
		if (!activity.equals("com.myapp.myactivity")){
			logger.log(LogStatus.FAIL, "App Crashed" +resultcrash.getName());
			logger.log(LogStatus.FAIL, "App Crashed" +resultcrash.getStatus());
			logger.log(LogStatus.FAIL, "App Crashed" +resultcrash.getTestName());
		}
	}

	@BeforeClass
	//@org.testng.annotations.Parameters(value={"config","environment","msisdn1"})
	@org.testng.annotations.Parameters(value={"config","msisdn1"})
	public void launchapp(String config_file,String msisdn1) throws Exception {
	//public void launchapp(String config_file,String environment,String msisdn1) throws Exception {
	//@org.testng.annotations.Parameters(value={"config"}) 
	//public void launchapp(String config_file) throws Exception {
		
		replacemsisdn(msisdn1);
		//replacemsisdn1("9971357267");	
		System.out.println("after = "+obj.getProperty("queryotp"));
		
		propertyelements();	
		
		Iterator it;
		//System.out.println(config_file);
		//System.out.println("environment = "+environment);
		
		System.out.println("Getting ready to Launch the APP ! ");			
		JSONParser parser = new JSONParser();
		Object config = parser.parse(new FileReader(System.getProperty("user.dir")+"\\src\\test\\java\\ConfigFiles\\"+config_file));
		
		
		   System.out.println("config = "+config);	    
		  org.json.simple.JSONObject jsonObject = (org.json.simple.JSONObject)config;	
		  
		/*  
		  Map<String,String> envs = (Map<String, String>) jsonObject.get("environment");
	      System.out.println(envs.size());
	      System.out.println("envs = "+envs);	      
	      Map<String, String> environ = new HashMap<String, String>();
	      
		try {
			environ = (Map<String, String>) ((org.json.simple.JSONObject) envs).get(environment);
			System.out.println("envCapabilities = "+environ);
		       it = environ.entrySet().iterator();
		      while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        cap.setCapability(pair.getKey().toString(), pair.getValue().toString());
		      }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  */
		
		
	      
	      try {
			Map<String,String> caps = (Map<String, String>) jsonObject.get("capabilities");
			  
			  it = caps.entrySet().iterator();

			    while (it.hasNext()) {

			        Map.Entry pair = (Map.Entry)it.next();

			        if(cap.getCapability(pair.getKey().toString()) == null){

			            cap.setCapability(pair.getKey().toString(), pair.getValue().toString());

			        }
			    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	         
	       	
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		cap.setCapability(MobileCapabilityType.UDID, "520074b4ee426523");
		//Oppo
		//cap.setCapability(MobileCapabilityType.UDID, "V4QKLNTK6PBYPJCU");		
		//cap.setCapability(MobileCapabilityType.UDID, "192.168.1.7:6666");
		cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		cap.setCapability("noReset", "true");
		System.setProperty("webdriver.http.factory", "apache");
		cap.setCapability("autoWebView", "true");
		driver = new AndroidDriver<MobileElement>(url, cap);
		System.out.println("Added cap = "+cap);
		/*String userName = "srikanthmuthyala3";
		String accessKey = "nnsoCESaU6obGbqeyb1x";	
		
	   driver = new AndroidDriver<MobileElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), cap);
		*/ 
		initmethods();
		//driver.startRecordingScreen();
		
		String now = getDate();
		String folderdir = getDatefolder();		
		 File f = null;
	       boolean bool = false;
	       try {
	    	  
	    	   String folderpath = System.getProperty("user.dir")+"\\"+folderdir+"_Reports";	    	   
	          f = new File(folderpath);
	          bool = f.mkdirs();	          
	          System.out.print("Directory created? "+bool);	          
	         // extent = new ExtentReports (folderpath+"\\"+now+"_"+environ.get("device") + ".html", true);
	          extent = new ExtentReports (folderpath+"\\"+now+"_MOAReport_Group2" + ".html", true);
	       } catch(Exception e) {
	          e.printStackTrace();
	       }
		extent.addSystemInfo("Host Name", "Ooredoo MOA").addSystemInfo("Environment", "Mobile Automation Testing")
		.addSystemInfo("User Name", "My Ooredoo Myanmar");
		extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
		//logger.getRunStatus();	
		
	}	
	
	
	

	
	@AfterClass
	public void tearDown() {	
		extent.flush();
		extent.close();
		Webdr.close();
		//driver.stopRecordingScreen();
		driver.quit();
	}

}






