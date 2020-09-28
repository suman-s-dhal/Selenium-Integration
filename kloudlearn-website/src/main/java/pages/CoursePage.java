package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

import base.TestBase;

public class CoursePage extends TestBase {
		
	    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/a[4]")
		public static WebElement ClickCourse ;
		
		@FindBy(xpath = "//button[@class='ant-btn filter-dropdown-button ant-dropdown-trigger ant-btn-lg']")
		public static WebElement RecentCourse;

		@FindBy(xpath = "//div[@class='sc-pbIaG ebFstP']//li[1]")
		public static WebElement A_Z;
		
		@FindBy(xpath ="//div[@class='sc-pbIaG ebFstP']//li[2]")
		public static WebElement Recent;
		
		@FindBy(xpath = "//div[@class='ant-tabs-nav ant-tabs-nav-animated']//div//div[2]")
		public static WebElement assignedcourse;
		
		@FindBy(xpath = "//div[contains(text(),'Organization Courses')]")
		public static WebElement orgcourse;
		
		@FindBy(xpath = "//*[@id=\"search-input-dropdown\"]")
		public static WebElement CourseSearch; 
		
		@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[1]/div[1]/div/div/svg/path")
		public static WebElement ClickSearch;
		
		@FindBy(xpath = "//i[@class='anticon anticon-close-circle InputSearchDropDown_icon']//*[local-name()='svg']")
		public static WebElement ClearCourseSearch;
		
		@FindBy(xpath = "//div[contains(text(),'Kloudlearn Course')]")
		public static WebElement kloudlearnCourse;
		
		@FindBy(xpath = "//button[@class='ant-btn ant-btn-lg ant-btn-primary']")
		public static WebElement ClickCreateCourse;
		
		@FindBy(xpath = "//div[contains(text(),'SCORM Course')]")
		public static WebElement ClickScromCourse;
		
		@FindBy(xpath = "//span[@class='ant-upload ant-upload-btn']")  
		public static WebElement ScromCourse;
		
		@FindBy(xpath = "//button[@class='ant-btn sc-qQYBZ wIkUb']")
		public static WebElement CourseSummary;
		
		//CREATE KloudlearnCourse
		
		@FindBy(xpath = "//input[contains(@placeholder,'Start by adding your course title')]")
		public static WebElement CourseTitle;

		@FindBy(xpath = "//button[contains(@class,'ant-btn ant-btn-ant-btn ant-btn-lg ant-btn-primary')]")
		public static WebElement ClickCreate;

		@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]") // /html/body/div[1]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[3]/div[1]/i
		public static WebElement Addlesson;

		@FindBy(xpath = "//button[contains(@class,'ant-btn assets-add-button ant-btn-ant-btn ant-btn-lg ant-btn-primary')]")
		public static WebElement AddAsset;

		@FindBy(xpath = "//div[contains(text(),'Youtube')]")
		public static WebElement SelectYoutube;

		@FindBy(xpath = "//input[contains(@placeholder,'Search youtube videos')]")
		public static WebElement YoutubeSearch;

		@FindBy(xpath = "//button[contains(@class,'ant-btn ant-input-search-button ant-btn-primary ant-btn-lg')]")
		public static WebElement youtubeClickSearch;

		@FindBy(xpath = "//div[@id='youtube-card-0']//div[@class='assets-card-body-container assets-media-card']")
		public static WebElement ClickYoutubeVideo;

		@FindBy(xpath = "//div[contains(@class,'CourseYoutubeUploader_prev-next')]//button[1]")
		public static WebElement PreviousButton;

		@FindBy(xpath = "//div[contains(@class,'ant-drawer ant-drawer-right ant-drawer-open Content-Drawer')]//button[2]")
		public static WebElement NextButton;

		@FindBy(xpath = "//div[@id='youtube-card-0']//div[contains(@class,'assets-card-body-container assets-media-card')]")
		public static WebElement SelectAnotherYoutubeVideo;

		@FindBy(xpath = "//div[contains(text(),'Assets')]")
		public static WebElement AssetButton;

		@FindBy(xpath = "//body/div/div[@class='ant-drawer ant-drawer-right ant-drawer-open Content-Drawer']/div[@class='ant-drawer-content-wrapper']/div[@class='ant-drawer-content']/div[@class='ant-drawer-wrapper-body']/div[@class='ant-drawer-body']/div[@class='Add-Content-Item-Container']/div[@class='ant-tabs ant-tabs-top Content-Container ant-tabs-line']/div[@class='ant-tabs-content ant-tabs-content-animated ant-tabs-top-content']/div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']/div[@class='CourseAssetsSearchPopUp_container']/div[@class='AssetsSearchPopUp_Body-root']/div[@class='ant-spin-nested-loading']/div[@class='ant-spin-container']/div[@class='AssetsSearchPopUp_Body-content']/div[1]/div[2]/div[1]")
		public static WebElement AssetVideo;

		@FindBy(xpath = "//button[contains(@class,'ant-btn ant-btn-primary')]")
		public static WebElement InsertButton;

		@FindBy(xpath = "//button[contains(@class,'ant-btn TwoIconDropDown_button-root ant-btn-primary')]")
		public static WebElement FilterButton;

		@FindBy(xpath = "//body[contains(@class,'using-mouse')]/div/div[contains(@class,'ant-drawer ant-drawer-right ant-drawer-open Content-Drawer')]/div[contains(@class,'ant-drawer-content-wrapper')]/div[contains(@class,'ant-drawer-content')]/div[contains(@class,'ant-drawer-wrapper-body')]/div[contains(@class,'ant-drawer-body')]/div[contains(@class,'Add-Content-Item-Container')]/div[contains(@class,'ant-tabs ant-tabs-top Content-Container ant-tabs-line')]/div[contains(@class,'ant-tabs-content ant-tabs-content-animated ant-tabs-top-content')]/div[contains(@class,'ant-tabs-tabpane ant-tabs-tabpane-active')]/div[contains(@class,'CourseAssetsSearchPopUp_container')]/div[contains(@class,'AssetsSearchPopUp_Header-root')]/div[contains(@class,'AssetsSearchPopUp_Header-right')]/div[contains(@class,'AssetsSearchPopUp_Header-right-filter')]/div[contains(@class,'AssetsSearchPopUp_Header-nestMenu')]/div[contains(@class,'NestMenu_SubMenu-root')]/div[1]")
		public static WebElement AssetTypeButton;

		@FindBy(xpath = "//div[contains(@class,'NestMenu_SubMenu-child NestMenu_SubMenu-child-0')]//div[contains(@class,'ant-select-selection__rendered')]")
		public static WebElement SearchAssetType;

		@FindBy(xpath = "//li[contains(@class,'ant-select-dropdown-menu-item ant-select-dropdown-menu-item-active ant-select-dropdown-menu-item-selected')]")
		public static WebElement SelectAssetTypeImage;

		@FindBy(xpath = "//body[contains(@class,'using-mouse')]/div/div[contains(@class,'ant-drawer ant-drawer-right ant-drawer-open Content-Drawer')]/div[contains(@class,'ant-drawer-content-wrapper')]/div[contains(@class,'ant-drawer-content')]/div[contains(@class,'ant-drawer-wrapper-body')]/div[contains(@class,'ant-drawer-body')]/div[contains(@class,'Add-Content-Item-Container')]/div[contains(@class,'ant-tabs ant-tabs-top Content-Container ant-tabs-line')]/div[contains(@class,'ant-tabs-content ant-tabs-content-animated ant-tabs-top-content')]/div[contains(@class,'ant-tabs-tabpane ant-tabs-tabpane-active')]/div[contains(@class,'CourseAssetsSearchPopUp_container')]/div[contains(@class,'AssetsSearchPopUp_Header-root')]/div[contains(@class,'AssetsSearchPopUp_Header-right')]/div[contains(@class,'AssetsSearchPopUp_Header-right-filter')]/div[contains(@class,'AssetsSearchPopUp_Header-nestMenu')]/div[contains(@class,'NestMenu_SubMenu-root')]/div[2]")
		public static WebElement UploaderButton;

		@FindBy(xpath = "//div[contains(@class,'NestMenu_SubMenu-child NestMenu_SubMenu-child-1')]//div[contains(@class,'ant-select-selection__rendered')]")
		public static WebElement UploaderSearch;

		@FindBy(xpath = "//li[contains(text(),'narmadha s')]")
		public static WebElement SelectUploader;

		@FindBy(xpath = "//body[contains(@class,'using-mouse')]/div/div[contains(@class,'ant-drawer ant-drawer-right ant-drawer-open Content-Drawer')]/div[contains(@class,'ant-drawer-content-wrapper')]/div[contains(@class,'ant-drawer-content')]/div[contains(@class,'ant-drawer-wrapper-body')]/div[contains(@class,'ant-drawer-body')]/div[contains(@class,'Add-Content-Item-Container')]/div[contains(@class,'ant-tabs ant-tabs-top Content-Container ant-tabs-line')]/div[contains(@class,'ant-tabs-content ant-tabs-content-animated ant-tabs-top-content')]/div[contains(@class,'ant-tabs-tabpane ant-tabs-tabpane-active')]/div[contains(@class,'CourseAssetsSearchPopUp_container')]/div[contains(@class,'AssetsSearchPopUp_Header-root')]/div[contains(@class,'AssetsSearchPopUp_Header-right')]/div[contains(@class,'AssetsSearchPopUp_Header-right-filter')]/div[contains(@class,'AssetsSearchPopUp_Header-nestMenu')]/div[contains(@class,'NestMenu_SubMenu-root')]/div[3]")
		public static WebElement TagButton;

		@FindBy(xpath = "//div[contains(@class,'NestMenu_SubMenu-child NestMenu_SubMenu-child-2')]//div[contains(@class,'ant-select-selection__rendered')]")
		public static WebElement TagSearch;

		@FindBy(xpath = "//li[contains(text(),'api')]")
		public static WebElement SelectTagButton;

		@FindBy(xpath = "//div[contains(@class,'AssetsSearchPopUp_Header-root')]//div[4]")
		public static WebElement UploadedDate;

		@FindBy(xpath = "//body[contains(@class,'using-mouse')]/div/div[contains(@class,'ant-drawer ant-drawer-right ant-drawer-open Content-Drawer')]/div[contains(@class,'ant-drawer-content-wrapper')]/div[contains(@class,'ant-drawer-content')]/div[contains(@class,'ant-drawer-wrapper-body')]/div[contains(@class,'ant-drawer-body')]/div[contains(@class,'Add-Content-Item-Container')]/div[contains(@class,'ant-tabs ant-tabs-top Content-Container ant-tabs-line')]/div[contains(@class,'ant-tabs-content ant-tabs-content-animated ant-tabs-top-content')]/div[contains(@class,'ant-tabs-tabpane ant-tabs-tabpane-active')]/div[contains(@class,'CourseAssetsSearchPopUp_container')]/div[contains(@class,'AssetsSearchPopUp_Header-root')]/div[contains(@class,'AssetsSearchPopUp_Header-right')]/div[contains(@class,'AssetsSearchPopUp_Header-right-filter')]/div[contains(@class,'AssetsSearchPopUp_Header-nestMenu')]/div[contains(@class,'NestMenu_SubMenu-root')]/div[contains(@class,'NestMenu_SubMenu-item')]/div[contains(@class,'NestMenu_SubMenu-child NestMenu_SubMenu-child-3')]/div[contains(@class,'SubMenuSelector-root')]/div[contains(@class,'ant-select ant-select-open ant-select-focused ant-select-enabled')]/div[1]")
		public static WebElement SearchDate;

		@FindBy(xpath = "/html/body/div[8]/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div[2]/div[2]/div[3]/button[3]")
		public static WebElement SaveButton;

		@FindBy(xpath = "//button[@class='ant-drawer-close']//i[@class='anticon anticon-close']//*[local-name()='svg']//*[name()='path' and contains(@d,'M563.8 512')]")
		public static WebElement CloseAddAssetButton;

		@FindBy(xpath = "//div[@class='NextContainer']//button[@class='ant-btn ant-btn-ant-btn ant-btn-lg ant-btn-primary']")
		public static WebElement NextButtonAddLesson;

		@FindBy(xpath = "//div[@class='NextContainer']//button[@class='ant-btn ant-btn-ant-btn ant-btn-lg ant-btn-primary']")
		public static WebElement nextButtonSave;

		@FindBy(xpath = "//*[contains(text(),'Privacy Settings')]")
		public static WebElement CoursePrivacy;
		
		@FindBy(xpath = "//*[contains(class(),'ant-select-arrow')]")
		public static WebElement CoursePrivacyDropDown;

		@FindBy(xpath = "//li[contains(text(),'Public (accesible by everyone outside)')]")
		public static WebElement CoursePrivacypublic; // public

		@FindBy(xpath = "//li[contains(text(),'Public (accesible by everyone outside)')]")
		public static WebElement CoursePublicWithinCompany;

		@FindBy(xpath = "//li[contains(text(),'Private')]")
		public static WebElement CoursePrivate;

		@FindBy(xpath = "//*[@id=\"step7\"]/div[2]/div[2]/div/div")
		public static WebElement CourseLicense;

		@FindBy(xpath = "//li[contains(text(),'User License - All IPR belongs to your organizatio')]")
		public static WebElement UserLicense; // user license select

		@FindBy(xpath = "//li[contains(text(),'Creative commons license - Attribution (BY)')]")
		public static WebElement CreativeCommonLicenseAttribution;

		@FindBy(xpath = "//li[contains(text(),'Creative commons license - Share Alike (SA)')]")
		public static WebElement CreativeCommonLicenseShareAlike;

		@FindBy(xpath = "//li[contains(text(),'Non commercial (NC)')]")
		public static WebElement CourseLicenseNonCommercial;

		@FindBy(xpath = "//li[contains(text(),'Non derivative (ND)')]")
		public static WebElement CourseLicenseNonDerivative;

		 @FindBy(xpath = "//*[@id=\"right-click-menu\"]/div/div/div[2]/div[3]/div[3]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div")
		 public static WebElement ShowButtonCompletion;

		@FindBy(xpath = "//*[@id=\"right-click-menu\"]/div/div/div[2]/div[3]/div[3]/div[2]/div/div[1]/div[2]")
		public static WebElement CompletionSetting;

		@FindBy(xpath = "//li[contains(text(),'Towards the end of the course or asset')]")
		public static WebElement TowardsEndCourse;

		@FindBy(xpath = "//div[4]//div[2]//div[2]//input[1]")
		public static WebElement CourseCompletePercentage;

		@FindBy(xpath = "//div[5]//div[2]//div[2]//input[1]")
		public static WebElement AssetCompletePercentage;

		@FindBy(xpath = "//div[6]//button[1]")
		public static WebElement AssetManditarybuttonOff;

		@FindBy(xpath = "//button[@class='ant-switch ant-switch-checked']")
		public static WebElement AssetManditarybuttonOn;

		@FindBy(xpath = "//button[@class='ant-switch']")
		public static WebElement HideControlButtonOff;

		@FindBy(xpath = "//div[7]//button[1]")
		public static WebElement HideControlButtonOn;

		@FindBy(xpath = "//div[contains(text(),'Assessment Setting')]")
		public static WebElement AssessmentSetting;

		@FindBy(xpath = "//div[@class='ant-collapse-content ant-collapse-content-active']//input[@class='ant-input-number-input']")
		public static WebElement PassRequirement;

		@FindBy(xpath = "//div[contains(text(),'Certificate Setting')]")
		public static WebElement CertificateSetting;

		@FindBy(xpath = "//div[@class='ant-collapse-content ant-collapse-content-active']//button[@class='ant-switch ant-switch-checked']")
		public static WebElement IssueCertificateOn;

		@FindBy(xpath = "//button[@class='ant-switch']")
		public static WebElement IssueCertificateOff;

		@FindBy(xpath = "//div[@class='cert-card selected']")
		public static WebElement SelectDefaultCertificate;

		@FindBy(xpath = "//div[contains(text(),'Assign Skills')]")
		public static WebElement AssignSkills;

		@FindBy(xpath = "//input[@id='skillInput']")
		public static WebElement Skill;

		
		  @FindBy(xpath = "//*[@id=\"right-click-menu\"]/div/div/div[2]/div[3]/div[3]/div[2]/div/div[1]/div[2]/div[2]/div/div[3]/div[2]/div/div")
		  public static WebElement ClickShowbutton;
		  
		  @FindBy(xpath = "//*[@id=\"3b1156a3-3adf-46ed-b956-6b8154e934c7\"]/ul/li[2]")
		  public static WebElement towardsEndOfCourse;
		  
		  @FindBy(xpath = "//*[@id=\"3b1156a3-3adf-46ed-b956-6b8154e934c7\"]/ul/li[1]")
		  public static WebElement NoConditions;
		  
		  @FindBy(xpath = "//*[@id=\"3b1156a3-3adf-46ed-b956-6b8154e934c7\"]/ul/li[3]")
		  public static WebElement WithTimeenforcement;
		 
		  @FindBy(xpath = "//*[@id=\"right-click-menu\"]/div/div/div[2]/div[3]/div[3]/div[2]/div/div[1]/div[2]/div[2]/div/div[4]/div[2]/div[2]/input")
		  public static WebElement CourseCompeletepercentage;
		  
		  @FindBy(xpath = "//*[@id=\"right-click-menu\"]/div/div/div[2]/div[3]/div[3]/div[2]/div/div[1]/div[2]/div[2]/div/div[5]/div[2]/div[2]/input")
		  public static WebElement AssetCompeletepercentage;
		  
		  @FindBy(xpath ="//button[@class='ant-switch']")
		  public static WebElement clickbtoff;
		  	
		  @FindBy(xpath = "//div[6]//button[1]")
		  public static WebElement clickbton;
		  	
		  @FindBy(xpath ="//div[7]//button[1]")
		  public static WebElement clickbtn2on;
		  	
		  @FindBy(xpath ="//*[@id=\"right-click-menu\"]/div[2]/div/div[1]/div[1]/div[2]/div/div[7]/button")
		  public static WebElement clickbtn2off;
		  
		  @FindBy(xpath = "//*[@id=\"right-click-menu\"]/div/div/div[2]/div[3]/div[3]/div[2]/div/div[1]/div[3]")
		  public static WebElement AssessmentSettingClick;
		  
		  @FindBy(xpath = "//*[@id=\"right-click-menu\"]/div/div/div[2]/div[3]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/input")
		  public static WebElement CoursePassRequirement;
		  
		  @FindBy(xpath = "//*[@id=\"right-click-menu\"]/div/div/div[2]/div[3]/div[3]/div[2]/div/div[1]/div[4]")
		  public static WebElement AssignCertificateSetting;
		  
		  @FindBy(xpath = "//*[@id=\"right-click-menu\"]/div/div/div[2]/div[3]/div[3]/div[2]/div/div[1]/div[4]/div[2]/div/div[1]/button")
		  public static WebElement issuecertificateTrue;
		  
		  @FindBy(xpath = "//button[@class='ant-switch ant-switch-checked']")
		  public static WebElement issueCertificateFalse;
		  
		  @FindBy(xpath = "//*[@id=\"right-click-menu\"]/div/div/div[2]/div[3]/div[3]/div[2]/div/div[1]/div[4]/div[2]/div/div[2]/div[2]/div[4]")
		  public static WebElement SelectCertificate;
		  
		  @FindBy(xpath = "//*[@id=\"right-click-menu\"]/div/div/div[2]/div[3]/div[3]/div[2]/div/div[1]/div[5]")
		  public static WebElement SelectAssignSkill;
		 
		  @FindBy(xpath = "//*[@id=\"skillInput\"]")
		  public static WebElement SkillInput;
		  
		  @FindBy(xpath = "//*[@id=\"SkillSetWithSlide-list-wrapper\"]/div/div/div[2]")
		  public static WebElement SkillPercentage;
		  
		  @FindBy(xpath = "//li[@class='ant-select-dropdown-menu-item ant-select-dropdown-menu-item-selected']")
		  public static WebElement SelectAssignCourse;

		@FindBy(xpath = "//button[@class='ant-btn ant-btn ant-btn-lg ant-btn-primary']")
		public static WebElement courseSettingNext;

		@FindBy(xpath = "//*[@id=\"right-click-menu\"]/div/div/div[2]/div[3]/div[4]/div[2]/div[3]/button[1]")
		public static WebElement CourseAgendaNext;

		@FindBy(xpath = "//button[@class='ant-btn sc-psEpA bdrbgN previous-button ant-btn ant-btn-lg ant-btn-primary']")
		public static WebElement CourseAgendaPrevious;

		@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//span[1]//i[1]//*[local-name()='svg']//*[name()='path' and contains(@d,'M884 256h-')]")
		public static WebElement SelectAssignment;

		@FindBy(xpath = "//li[contains(text(),'Selected groups and users')]")
		public static WebElement SelectGroups;

		@FindBy(xpath = "//tr[1]//td[1]")
		public static WebElement SelectTesting;

		@FindBy(xpath = "//div[contains(text(),'Users')]")
		public static WebElement AssetSelectUser;

		@FindBy(xpath = "//input[@placeholder='Search Group']")
		public static WebElement AssetSearchGroup;

		@FindBy(xpath = "//body[@class='using-mouse']//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//tr[3]//td[1]")
		public static WebElement AssetUserClick;

		@FindBy(xpath = "//input[@placeholder='Search User']")
		public static WebElement AssetSearchUser;

			@FindBy(xpath = "//li[@class='ant-select-dropdown-menu-item ant-select-dropdown-menu-item-selected']")
			public static WebElement AddUser;
	
			@FindBy(xpath = "//*[@id=\"step8\"]/div[3]/div/div[1]/div/div/div/div/div[1]/div[2]")
			public static WebElement SelectUser;

			@FindBy(xpath = "//*[@id=\"step8\"]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div/div/div[2]/table/tbody/tr[21]/td[1]/span/label/span/input")
			public static WebElement SelectUser1; //vasavi
	
			@FindBy(xpath = "//*[@id=\"step8\"]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div/div/div[2]/table/tbody/tr[20]/td[1]/span/label/span/input")
			public static WebElement SelectUser2; //Naveen

			@FindBy(xpath="//*[@id=\"step8\"]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div/div/div[2]/table/tbody/tr[19]/td[1]/span/label/span/input")
			public static WebElement SelectUser3;//Narmadha
			
			@FindBy(xpath ="//*[@id=\"step8\"]/div[3]/div/div[1]/div/div/div/div/div[1]/div[1]")
			public static WebElement Group;
			
			@FindBy(xpath="//*[@id=\"step8\"]/div[3]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[1]/span/label/span/input")
			public static WebElement SelectGroup;
			
		@FindBy(xpath = "//*[@id=\"right-click-menu\"]/div/div/div[2]/div[3]/div[5]/div[2]/button[1]")
		public static WebElement FinishCourse;

		@FindBy(xpath = "//div[contains(text(),'Record')]")
		public static WebElement ClickRecord;

		@FindBy(xpath = "//button[@class='VideoRecorder_start-record']")
		public static WebElement StartRecording;

		@FindBy(xpath = "//div[@class='VideoRecorder_stop-record']")
		public static WebElement StopRecording;

		@FindBy(xpath = "//button[@class='ant-btn VideoRecorder_save-record-btn ant-btn-primary']")
		public static WebElement saveRecording;

		@FindBy(xpath = "//div[contains(text(),'Screen Record')]")
		public static WebElement ScreenRecord;

		@FindBy(xpath = "//button[@class='ScreenAndVideoRecorder_start-record']")
		public static WebElement StartScreenRecord;

		@FindBy(xpath = "//button[@class='ant-btn ant-btn-default']")
		public static WebElement StopScreenRecording;

		@FindBy(xpath = "//div[@class='ScreenAndVideoRecorder_stop-record']//button[@class='ant-btn']")
		public static WebElement ScreenRecordAgain;

		@FindBy(xpath = "//div[@class='ScreenAndVideoRecorder_stop-record']//button[@class='ant-btn ant-btn-primary']")
		public static WebElement SaveScreenRecord;
		@FindBy(xpath = "//div[contains(text(),'Screen + Video Record')]")
		public static WebElement ScreenVideoRecord;

		@FindBy(xpath = "//button[@class='ScreenAndVideoRecorder_start-record']")
		public static WebElement StartScreenVideoRecord;

		@FindBy(xpath = "//button[@class='ant-btn ant-btn-default']")
		public static WebElement StopScreenVideoRecord;

		@FindBy(xpath = "//div[@class='ScreenAndVideoRecorder_stop-record']//button[@class='ant-btn']")
		public static WebElement RecordAgainScreenVideo;

		@FindBy(xpath = "//div[@class='ScreenAndVideoRecorder_stop-record']//button[@class='ant-btn ant-btn-primary']")
		public static WebElement SaveVideoScreenRecord;

		@FindBy(xpath = "//div[contains(text(),'Article')]")
		public static WebElement ClickArticle;

		@FindBy(xpath = "//div[@class='DraftEditor-editorContainer']")
		public static WebElement AddTitle;

		@FindBy(xpath = "//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']")
		public static WebElement AddTitleName;

		@FindBy(xpath = "//div[@class='RichTextEditor_header-preview']")
		public static WebElement Preview;

		@FindBy(xpath = "//div[contains(text(),'Back')]")
		public static WebElement Back;

		@FindBy(xpath = "//div[@class='RichTextEditor_header-publish']")
		public static WebElement Publish;

		@FindBy(xpath = "//div[@class='RichTextEditor_header-close']//*[local-name()='svg']")
		public static WebElement ArticleClose;

		@FindBy(xpath = "//a[@class='ant-dropdown-trigger']")
		public static WebElement MoreSetting;

		@FindBy(xpath = "//button[@class='ant-drawer-close']//i[@class='anticon anticon-close']//*[local-name()='svg']")
		public static WebElement CloseAddContent;

		@FindBy(xpath = "//li[@class='ant-btn MoreContent']//button[@id='upload-from-computer']")
		public static WebElement MoreSettingFile;

		@FindBy(xpath = "//body//li[2]")
		public static WebElement MoreSettingFolder;

		
		
		
	//	private  static WebDriverWait wait =new WebDriverWait(browser, 30);
		
	    public CoursePage(){
	        PageFactory.initElements(browser, this);
	        //browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    }

		
		public static void SelectCourse() {
			browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			ClickCourse.click();
				}
		
		public static void SelectRecentCourse() throws InterruptedException {
			RecentCourse.click();
			Thread.sleep(2000);
			A_Z.click();
			Recent.click();
			Thread.sleep(2000);
			A_Z.click();
			Thread.sleep(2000);
			Recent.click();
		}
		
		public static void SelectSearch() throws InterruptedException {
			browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			CourseSearch.sendKeys("React");
			Thread.sleep(2000);
			ClickSearch.click();
			ClearCourseSearch.click();
		}

		public static void SelectAssignedCourse() {
			browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			assignedcourse.click();
		}
		
		public static void SelectOrganisationCourse() {
			browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			orgcourse.click();
			
		}
		
	/*	public static void Course() {
			browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			ClickCreateCourse.click();
		//	kloudlearnCourse.click();
			
			ClickScromCourse.click();
		//	ScromCourse.click();
		//	Actions action = new Actions(browser);
		//	action.moveToElement(browser.findElement(By.className("ant-upload ant-upload-drag"))).click().perform();
	//		ScromCourse.sendKeys("/home/narmadha/Downloads/SequencingPostTestRollup4thEd_SCORM20044thEdition.zip");
					
		}*/
		
		public static void Kloudlearncourse() throws InterruptedException {
			browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			ClickCreateCourse.click();
			kloudlearnCourse.click();
			
			CourseTitle.sendKeys("new test");
			ClickCreate.click();
			Addlesson.click();
			AddAsset.click();
			Thread.sleep(1000);
			SelectYoutube.click();
			Thread.sleep(2000);
			AssetButton.click();
			AssetVideo.click();
			Thread.sleep(2000);
			InsertButton.click();
			Thread.sleep(2000);
//			NextButtonAddLesson.click(); // ##
//			Thread.sleep(2000);
//			SelectYoutube.click();
//			YoutubeSearch.click();
//			YoutubeSearch.sendKeys("aws");
//			youtubeClickSearch.click();
//			ClickYoutubeVideo.click();
		//	Thread.sleep(2000);
			ClickRecord.click();
			StartRecording.click();
			StopRecording.click();
			saveRecording.click();
			Thread.sleep(1000);
			
			ScreenRecord.click();
			StartScreenRecord.click();
			StopScreenRecording.click();
			ScreenRecordAgain.click();
			StopScreenRecording.click();
			SaveScreenRecord.click();
			Thread.sleep(1000);
			
			ScreenVideoRecord.click();
			StartScreenVideoRecord.click();
			StopScreenVideoRecord.click();
			RecordAgainScreenVideo.click();
			StopScreenVideoRecord.click();
			SaveVideoScreenRecord.click();
			Thread.sleep(2000);
			
			ClickArticle.click();
			AddTitle.click();
			AddTitleName.sendKeys("course 2");
			Preview.click();
			Back.click();
			Publish.click();
			ArticleClose.click();
			Thread.sleep(2000);
			MoreSetting.click();
//			MoreSettingFile.click();
//			Thread.sleep(2000);
//			MoreSettingFile.sendKeys("/home/narmadha/Downloads/test.jpeg");
//			Thread.sleep(2000);
//			AddAsset.click();
//			MoreSetting.click();
//			Thread.sleep(2000);

			// MoreSettingFolder.sendKeys("/home/narmadha/Downloads/sampleImages");

		//	CloseAddContent.click();
//			Thread.sleep(2000);
			NextButtonAddLesson.click();
//			Thread.sleep(10000);
//			 FilterButton.click();
//			 AssetTypeButton.click();
//			 SearchAssetType.sendKeys("Image");
//			 SelectAssetTypeImage.click();
//			 UploaderButton.click();
//			 UploaderSearch.sendKeys("narmadha");
//			 UploaderSearch.clear();
//			 SelectUploader.click();
//			 TagButton.click();
//			 TagSearch.sendKeys("api");
//			 TagSearch.clear();
//			 SelectTagButton.click();
//			 UploadedDate.click();
//			 SearchDate.sendKeys("Last 7 Days");
//			CoursePrivacy.click();
//			
			
//			CoursePrivacyDropDown.click();
//			CoursePrivacypublic.click();
//			Thread.sleep(2000);
//			CoursePrivacy.click();
//			Thread.sleep(2000);
//			CoursePublicWithinCompany.click();
//			Thread.sleep(2000);
//			CoursePrivacy.click();
//			Thread.sleep(2000);
//			CoursePrivate.click();
//			
//			CourseLicense.click();
//			Thread.sleep(2000);
//			CreativeCommonLicenseAttribution.click();
//			Thread.sleep(2000);
//			CreativeCommonLicenseShareAlike.click();
//			Thread.sleep(2000);
//			CourseLicenseNonCommercial.click();
//			Thread.sleep(2000);
//			CourseLicenseNonDerivative.click();
//			Thread.sleep(2000);
//			UserLicense.click();
//			Thread.sleep(1000);

			
			
			
//			CourseCompletePercentage.click();
//			CourseCompletePercentage.clear();
//			CourseCompletePercentage.sendKeys("90");
			
	//
//			courseSettingNext.click();
//			CourseAgendaNext.click();
//			SelectAssignment.click();
//			SelectGroups.click();
//			FinishCourse.click();

		}
		
		public static void CompletionSetting() throws InterruptedException {
			browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			CompletionSetting.click();
		//	ShowButtonCompletion.click();
			Thread.sleep(2000);
		//	ClickShowbutton.click();
		//	Thread.sleep(2000);
			towardsEndOfCourse.click();
			Thread.sleep(2000);
			ClickShowbutton.click();
			NoConditions.click();
			Thread.sleep(2000);
			ClickShowbutton.click();
			WithTimeenforcement.click();
			Thread.sleep(2000);
			CourseCompeletepercentage.click();
			CourseCompeletepercentage.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			CourseCompeletepercentage.sendKeys("80");
			Thread.sleep(2000);
			AssetCompeletepercentage.click();
			AssetCompeletepercentage.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			AssetCompeletepercentage.sendKeys("90");
			Thread.sleep(2000);
		}
		
		public static void control() throws InterruptedException {
			clickbton.click();
    		Thread.sleep(2000);
    		clickbtoff.click();
    		Thread.sleep(2000);
    	if(clickbtoff.isSelected()) {
    		clickbton.click();
    		System.out.println("Assets mandatory is clicked");
    	}
		}
		
		public static void controls1() {
			clickbtn2on.click();
    		if(clickbtn2off.isSelected()) {
    			clickbtn2on.click();
    	System.out.println("Hide controls unselected");	
    	}
    		else {
    			clickbtn2off.click();
    		}
    	}

		public static void AssessmentSetting() {
			AssessmentSettingClick.click();
			CoursePassRequirement.click();
			CoursePassRequirement.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			CoursePassRequirement.sendKeys("90");
		}
		
		public static void CertificateSetting() {
			AssignCertificateSetting.click();
			issuecertificateTrue.click();
		//	issueCertificateFalse.click();
			SelectCertificate.click();
			
		}
		
		
		public static void AssignSkills() {
			SelectAssignSkill.click();
			SkillInput.sendKeys("new");
			SkillInput.sendKeys(Keys.chord(Keys.ENTER));
			SkillPercentage.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			SkillPercentage.sendKeys("6");
		}
		
		public static void CreateCourseSetting() {
			courseSettingNext.click();
		}
		
		public static void CreateCourseAgenda() throws InterruptedException {
			CourseAgendaNext.click();
			Thread.sleep(2000);
		}
		
		public static void AssignLearners() throws InterruptedException {
			Thread.sleep(2000);
		//	SelectAssignCourse.click();
//			AddUser.click();
//			SelectUser.click();
//			SelectUser1.click();
//			SelectUser3.click();
//			Group.click();
//			SelectGroup.click();
		}
		
		public static void CreateAssignLearners() {
		//	SelectAssignment.click();
		//	SelectGroups.click();
			FinishCourse.click();
		}

		
		
		
	/*	public static void CourseSummary() {
			browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			CourseSummary.click();
		} */
	}


