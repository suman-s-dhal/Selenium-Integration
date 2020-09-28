package tests;

import java.io.IOException;

//import static base.TestBase.initialization;

//import java.sql.Driver;
//import java.util.concurrent.TimeUnit;

//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//import static base.TestBase.browser;

import pages.AssetsPage;


public class AssetTest{
	


	AssetsPage AssetsPage;
	
	SoftAssert softAssert = new SoftAssert();
	  
	@BeforeClass
	public void AssetModule(){
		 AssetsPage = new AssetsPage();
	       
	    }
	@Test
	public void validateAsset() throws InterruptedException
	{
		pages.AssetsPage.asset();
		System.out.println("Asset module");
	/*	String currentUrl = browser.getCurrentUrl();
	    softAssert.assertEquals(currentUrl, "https://customer-focused.kloudlearn.com/assets");
	    System.out.println("Asset url are same");
		softAssert.assertAll(); */
	}	
	
	@Test
	public void validateAssetSearch() throws InterruptedException, IOException {
		pages.AssetsPage.AssetSearch();
		System.out.println("Asset search ");
		Thread.sleep(3000);
		
		
		
	/*	SoftAssert softAssert1 = new SoftAssert();
		String actualTitle =  pages.AssetsPage.getSearchTitle();
		String expectedTitle = "Why newboston";	
		softAssert1.assertEquals(actualTitle,expectedTitle);
		softAssert.assertAll(); */
	} 
	
	@Test
	public void validateAddFile() throws InterruptedException {
		Thread.sleep(2000);
		pages.AssetsPage.AddFile();
		System.out.println("Asset upload file");
	//	pages.AssetsPage.AddFolder();
	//	pages.AssetsPage.AddYoutube();
	//	System.out.println("Asset Youtube");
	} 
	
	@Test
	public void validateAddYoutube() throws InterruptedException {
		Thread.sleep(3000);
		pages.AssetsPage.AddYoutube();
		System.out.println("Asset Youtube");
	} 
	
	@Test
	public void validateAddFolder() throws InterruptedException {
		Thread.sleep(3000);
		pages.AssetsPage.AddFolder();
		System.out.println("Asset upload folder ");
	} 
	
	@Test
	public void validateAddRecordVideo() throws IOException, InterruptedException {
		pages.AssetsPage.AddRecorVideo();
		System.out.println("Asset record Video");
	}

	@Test
	public void validateAddArticle() throws IOException, InterruptedException {
		pages.AssetsPage.AssetAddArticle();
		System.out.println("Asset Add Article");
	}

/*	@Test
	public void validateAddQuiz() throws IOException, InterruptedException {
		pages.AssetsPage.AddCreateQuiz();
		System.out.println("Asset Create Quiz");
	} */
	
	
	@Test
	public void validatePlayAsset() throws InterruptedException {
		Thread.sleep(3000);
		pages.AssetsPage.course();
		System.out.println("Asset play course");
	/*	SoftAssert softAssert2 = new SoftAssert();
		String actualTitle = pages.AssetsPage.getPlayvideoTitle();
		String expectedTitle = "Selenium WebDriver Tutorial | Selenium WebDriver Tutorial For Beginner | Selenium | Simplilearn";
		softAssert2.assertEquals(actualTitle,expectedTitle);
		System.out.println("play video are same");
		softAssert.assertAll(); */
	}
	
/*	@Test
	public void validatefilter() throws InterruptedException {
		pages.AssetsPage.filterLast7days();
		pages.AssetsPage.filterLast30days();
		pages.AssetsPage.filterLast3month();
		System.out.println("Asset filter");
		SoftAssert softAssert3 = new SoftAssert();
		String actualTitle = pages.AssetsPage.getFilterImageTitle();
		String expectedTitle = "api test image.png";
		softAssert3.assertEquals(actualTitle,expectedTitle,"Filter is working");
		softAssert.assertAll(); 
	} */
	
//	@Test
//	public void validateEdit() throws InterruptedException {
//		SoftAssert softAssert4 = new SoftAssert();
//
//		//String actualWebElement = browser.getTitle(); 
//	//	String expectedWebElement = browser.getTitle();
//		pages.AssetsPage.assetEdit();  
//		softAssert4.assertEquals(true,true); 
//		
//	} 
	
	@Test
	public void validateView() throws InterruptedException {
		Thread.sleep(3000);
		pages.AssetsPage.AssetViewCourse();
		System.out.println("Asset view course");
/*		SoftAssert softAssert5 = new SoftAssert();
		String currentUrl1 = browser.getCurrentUrl(); 
		softAssert5.assertEquals(currentUrl1,"https://customer-focused.kloudlearn.com/assets/view/15393");
		softAssert.assertAll(); */
	} 
	
	@Test
	public void ValidateAction() {
		pages.AssetsPage.AssetActionView();
	}
	
	@Test
	public void ValidateActionEdit() throws InterruptedException {
		pages.AssetsPage.ActionEdit();
	}
	
//	@Test
//	public void ValidateAction() {
//		
//	}
	
	@Test
	public void validateDeleteAsset() throws InterruptedException {
		Thread.sleep(3000);
		pages.AssetsPage.AssetDeleteVideo();
		System.out.println("Asset DeleteVideo");
	/*	SoftAssert softAssert6 = new SoftAssert();
		String actualTitle = pages.AssetsPage.getDeleteTitle();
		String expectedTitle = "Do you want to delete these assets?";
		softAssert6.assertEquals(actualTitle,expectedTitle,"Delete is working");
		softAssert.assertAll(); */ 
		
	} 

	@Test
	public void validateAssetCreateCourse() throws InterruptedException {
		Thread.sleep(3000);
		pages.AssetsPage.AssetCreateCourse();
		System.out.println("Asset CreateCourse");
	}
	
		
	@Test
	public void validateAssetCreate() {
		pages.AssetsPage.CourseSetting();
			System.out.println("Asset Create Setting");
		}
	
	@Test
	public void validateCourseAgenda() {
		pages.AssetsPage.CourseAgenda();
		System.out.println("Asset Course Agenda");
		
	}
	
	@Test
	public void validateAssignLearners() {
		pages.AssetsPage.AssignLearners();
		System.out.println("Asset Assign Learners");
		
	}
	
}

	
	


	
