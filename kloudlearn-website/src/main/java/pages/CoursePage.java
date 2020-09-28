package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class CoursePage extends TestBase {
		
	    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/a[4]")
		public static WebElement ClickCourse ;
		
		@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[1]/div[2]/button[2]")
		public static WebElement RecentCourse;

		@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[1]/div[2]/div[2]/div/div/ul/li[1]/div")
		public static WebElement A_Z;
		
		@FindBy(xpath = "//*[@id=\"search-input-dropdown\"]")
		public static WebElement CourseSearch; 
		
		@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[1]/div[1]/div/div/svg/path")
		public static WebElement ClickSearch;
		
		@FindBy(xpath = "//*[@class='anticon anticon-close-circle InputSearchDropDown_icon']//*[local-name()='svg']//*[name()='path' and contains(@d,'M512 64C26')]")
		public static WebElement ClearCourseSearch;
		
		@FindBy(xpath = "//button[@class='ant-btn ant-btn-lg ant-btn-primary']")
		public static WebElement ClickCreateCourse;
		
		@FindBy(xpath = "//div[contains(text(),'SCORM Course')]")
		public static WebElement ClickScromCourse;
		
		@FindBy(xpath = "//span[@class='ant-upload ant-upload-btn']")  
		public static WebElement ScromCourse;
		
		@FindBy(xpath = "//button[@class='ant-btn sc-oUBxg jTobxd']")
		public static WebElement CourseSummary;
		
		private  static WebDriverWait wait =new WebDriverWait(browser, 30);
		
	    public CoursePage(){
	        PageFactory.initElements(browser, this);
	        browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    }

		
		public static void SelectCourse() {
			ClickCourse.click();
				}
		
		public static void SelectRecentCourse() throws InterruptedException {
			browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			RecentCourse.click();
			Thread.sleep(2000);
			A_Z.click();
			Thread.sleep(2000);
		}
		
		public static void SelectSearch() throws InterruptedException {
			browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			CourseSearch.sendKeys("Courses");
			Thread.sleep(2000);
			ClickSearch.click();
			Thread.sleep(2000);
			ClearCourseSearch.click();
		}

		public static void Course() {
			browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			ClickCreateCourse.click();
			ClickScromCourse.click();
		//	ScromCourse.click();
		//	Actions action = new Actions(browser);
		//	action.moveToElement(browser.findElement(By.className("ant-upload ant-upload-drag"))).click().perform();
			ScromCourse.sendKeys("/home/narmadha/Downloads/SequencingPostTestRollup4thEd_SCORM20044thEdition.zip");
			
			
		}
		
		public static void CourseSummary() {
			browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			CourseSummary.click();
		}
	}


