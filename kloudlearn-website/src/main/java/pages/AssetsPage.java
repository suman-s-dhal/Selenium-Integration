package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Properties;
import java.io.BufferedReader;
//import static base.TestBase.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

import base.TestBase;

public class AssetsPage extends TestBase {

	// private static WebDriver browser;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/a[3]")
	public static WebElement assets;

	@FindBy(xpath = "//*[@id=\"search-input-dropdown\"]")
	public static WebElement search;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[3]/div[1]/div/div/svg/path")
	public static WebElement SearchAsset;

	@FindBy(css = "html body div#root div.primary-layout-container div.primary-body div#right-click-menu.layout-content div#right-click-menu.assets-container div#right-click-menu.assets_main-container div#right-click-menu.assets-header div#right-click-menu.assets-header-left div.InputSearchDropDown_root span.ant-input-affix-wrapper.ant-input-affix-wrapper-lg span.ant-input-suffix")
	public static WebElement Cancelsearch;

	// listgrid
	@FindBy(css = "html body div#root div.primary-layout-container div.primary-body div#right-click-menu.layout-content div#right-click-menu.assets-container div#right-click-menu.assets_main-container div#right-click-menu.assets-header div#right-click-menu.assets-header-right div#right-click-menu.assets-flex-row-center.assets-grid-container div#right-click-menu.assets-input-range-container button.ant-btn.assets-header-grid-button.ant-btn-lg")
	public static WebElement ListGrid;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='primary-layout-container']/div[@class='primary-body']/div[@id='right-click-menu']/div[@id='right-click-menu']/div[@id='right-click-menu']/div[@id='right-click-menu']/div[@id='right-click-menu']/div[@class='ant-spin-nested-loading']/div[@class='ant-spin-container']/div[@id='right-click-menu']/div[2]/div[1]/i[1]\n")
	public static WebElement SelectCourse;

	@FindBy(css = "html body.using-mouse div#root div.primary-layout-container div.primary-body div#right-click-menu.layout-content div#right-click-menu.assets-container div.Preview_root div.ant-row div.ant-col div h1.title.component-header-title button.cus-reset.focus-outline-chrome.undefined i.anticon.anticon-close.cursor-pointer-hover svg path")
	public static WebElement CloseCourse;

	// Filter
	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[3]/div[2]/div[1]/div[2]/button")
	public static WebElement filter;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[1]/div[3]/div[1]/div[2]/div/div")
	public static WebElement assertTypeSearch;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[1]/div[3]/div[1]/div[3]/div/div/div/ul/li[1]") // image
	public static WebElement selectasserttype;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div")
	public static WebElement SearchUser;

	@FindBy(xpath = "//li[@name='narmadha s']") // narmadha s
	public static WebElement SelectUser;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[1]/div[3]/div[3]/div[2]/div/div")
	public static WebElement SearchCourse;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[1]/div[3]/div[3]/div[3]/div/div/div/ul/li[3]") // Courses
	public static WebElement selectCourse;

	// @FindBy(xpath = "//div[contains(text(),'Search tag')]")
	// public static WebElement SearchTag;

	@FindBy(css = "div.primary-layout-container div.primary-body div.layout-content div.assets-container div.assets_main-container div.assets-filter-expand.assets-filter-expand-show:nth-child(1) div.assets-filter-expand-container div.assets-filter-expand-select:nth-child(3) div:nth-child(1) div.ant-select-dropdown.assets-filter-expand-select-dropdown.ant-select-dropdown--multiple.ant-select-dropdown-placement-bottomLeft div:nth-child(1) ul.ant-select-dropdown-menu.ant-select-dropdown-menu-root.ant-select-dropdown-menu-vertical > li.ant-select-dropdown-menu-item:nth-child(1)") // #api
	public static WebElement SelectTag;

	@FindBy(xpath = "//label[1]//span[1]//input[1]")
	public static WebElement LastSevenDays;

	@FindBy(xpath = "//label[2]//span[1]//input[1]")
	public static WebElement LastThirtyDays;

	@FindBy(xpath = "//label[3]//span[1]//input[1]")
	public static WebElement LastThreeMonth;

	@FindBy(xpath = "html body.using-mouse div#root div.primary-layout-container div.primary-body div#right-click-menu.layout-content div#right-click-menu.assets-container div#right-click-menu.assets_main-container div.assets-filter-expand.assets-filter-expand-show div.assets-filter-expand-container div.assets-filter-expand-select.assets-filter-expand-select-upload-date-filter.undefined div.ant-radio-group.ant-radio-group-outline label.ant-radio-wrapper span.ant-radio input.ant-radio-input")
	public static WebElement AllTime;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[1]/div[3]/div[5]/span/span/input[1]")
	public static WebElement StartDate;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[1]/div[3]/div[5]/span/span/input[2]")
	public static WebElement EndDate;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[1]/div[4]/button[1]")
	public static WebElement Apply;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[1]/div[4]/button[2]")
	public static WebElement Resetall;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[1]/div[4]/button[3]")
	public static WebElement cancel;

	@FindBy(css = "html body div#root div.primary-layout-container div.primary-body div#right-click-menu.layout-content div#right-click-menu.assets-container div#right-click-menu.assets_main-container div#right-click-menu.assets-main-body div div.clear-tags-button")
	public static WebElement ClearAllFilters;

	// Asset
	@FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div[2]/div/div[5]/div[3]/div[2]/ul/li[3]")
	public static WebElement Page2;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[5]/div[3]/div[2]/ul/li[5]/a/i/svg")
	public static WebElement NextPage;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[5]/div[3]/div[2]/ul/li[1]/a")
	public static WebElement PreviousPage;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[5]/div[3]/div[1]/div/div/div[1]/div[1]/span/div[1]/div")
	public static WebElement PlayVideo;

	@FindBy(xpath = "//*[@id=\"right-click-menu\"]")
	public static WebElement VideoSetting;

	@FindBy(xpath = "/html/body/div[5]/div/div/ul/li[2]")
	public static WebElement Deleteasset;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='primary-layout-container']/div[@class='primary-body']/div[@id='right-click-menu']/div[@id='right-click-menu']/div[@id='right-click-menu']/div[@id='right-click-menu']/div[@id='right-click-menu']/div[@class='ant-spin-nested-loading']/div[@class='ant-spin-container']/div[@id='right-click-menu']/div[4]/div[2]/div[1]")
	public static WebElement SelectVideo;

	@FindBy(xpath = "//body[@class='using-mouse']/div[@id='root']/div[@class='primary-layout-container']/div[@class='primary-body']/div[@id='right-click-menu']/div[@id='right-click-menu']/div[@id='right-click-menu']/div[@id='right-click-menu']/div[@class='multi-select-bar multi-select-bar_active']/div[@class='multi-select-bar_body']/div[@class='multi-select-bar_items-wrapper']/div[1]")
	public static WebElement View;

	@FindBy(xpath = "//*[@id=\"multi-select-bar-rename\"]")
	public static WebElement Rename;

//		@FindBy(xpath = "")
//		public static WebElement EditRename;

	@FindBy(xpath = "/html/body/div[7]/div/div[2]/div/div[2]/div[1]")
	public static WebElement assignTagabove;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[5]/div[4]/div/div[2]/div[3]")
	public static WebElement AssignTags;

	@FindBy(xpath = "/html/body/div[5]/div/div[2]/div/div[2]/div[3]/button[2]")
	public static WebElement AssignTag;

	@FindBy(xpath = "//body[@class='using-mouse']/div[@id='root']/div[@class='primary-layout-container']/div[@class='primary-body']/div[@id='right-click-menu']/div[@id='right-click-menu']/div[@id='right-click-menu']/div[@id='right-click-menu']/div[@id='right-click-menu']/div[@class='ant-spin-nested-loading']/div[@class='ant-spin-container']/div[@id='right-click-menu']/div[2]/div[2]/div[1]")
	public static WebElement SelectVideo_Delete;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div[5]/div[4]/div/div[2]/div[4]")
	public static WebElement DeleteAssetVideo;

	@FindBy(xpath = "//button[@class='ant-btn']")
	public static WebElement AssetDeleteCancel;

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	public static WebElement Delete_ok;

	// create Course
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-lg']")
	public static WebElement CreateCourse;

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

	// @FindBy(xpath = "")
	// public static WebElement ;

	@FindBy(xpath = "//div[contains(text(),'Completion Settings')]//*[local-name()='svg']")
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

	/*
	 * @FindBy(xpath = "") public static WebElement ;
	 * 
	 * @FindBy(xpath = "") public static WebElement ;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath = "") public static WebElement ;
	 */

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

//		@FindBy(xpath = "")
//		public static WebElement ;
//
//		@FindBy(xpath = "")
//		public static WebElement ;

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

	/*
	 * @FindBy(xpath = "") public static WebElement ;
	 * 
	 * @FindBy(xpath = "") public static WebElement ;
	 * 
	 * @FindBy(xpath = "") public static WebElement ;
	 * 
	 * @FindBy(xpath = "") public static WebElement ;
	 * 
	 * @FindBy(xpath = "") public static WebElement ;
	 * 
	 * 
	 * @FindBy(xpath = "") public static WebElement ;
	 */

	// Rename
	@FindBy(xpath = "//*[@id=\"right-click-menu\"]")
	public static WebElement RenameValue;

	// write for rename confrim and cancel

	// AssignTag
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[2]/form/div/div[2]/div/span/div/div/div")
	public static WebElement CreateTagName;

	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[3]/button[2]")
	public static WebElement Assign;

	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[3]/button[1]")
	public static WebElement CancelAssign;

	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/button/span/i/svg")
	public static WebElement Close;

	// Delete Asset
	@FindBy(xpath = "/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[2]/button[2]")
	public static WebElement Ok;

	@FindBy(xpath = "/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[2]/button[1]")
	public static WebElement CancelAsset;

	// Create Course
	// Course Overview
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div[2]/input")
	public static WebElement CreateTitle;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div[2]/span[1]/div[1]")
	public static WebElement DragImage;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div[2]/button")
	public static WebElement Create;

	// Add Lesson
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div[2]/div/textarea")
	public static WebElement LessonDescription;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]")
	public static WebElement AddLesson;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div[2]/div/div[2]/div/button")
	public static WebElement AddAssets;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div[2]/div/div[4]/button[2]")
	public static WebElement Previous;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div[2]/div/div[4]/button[1]")
	public static WebElement next;

	@FindBy(xpath = "//*[@id=\"right-click-menu\"]")
	public static WebElement SelectLesson;

	@FindBy(xpath = "//*[@id=\"multi-select-bar-rename\"]")
	public static WebElement RenameLesson;

	@FindBy(xpath = "//*[@id=\"right-click-menu\"]")
	public static WebElement EditLessonName;

	// write Rename in Create Course

	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div[2]/div/div[4]/div/div/div[2]/div[2]")
	public static WebElement DeleteAddLesson;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div[2]/div/div[4]/button[1]")
	public static WebElement AddLessonNext;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div[2]/div/div[4]/button[2]")
	public static WebElement AddLessonPrevious;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div[2]/div/div[2]/div/button")
	public static WebElement AddAssetLesson;

	@FindBy(xpath = "//*[@id=\"search-input-dropdown\"]")
	public static WebElement SearchLesson;

	@FindBy(xpath = "/html/body/div[8]/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/div[1]/div[1]/div/div/div/svg")
	public static WebElement ClickSearch;

	@FindBy(xpath = "/html/body/div[8]/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/button")
	public static WebElement ClickFilter;

	// write filter

	@FindBy(xpath = "/html/body/div[9]/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/button")
	public static WebElement resetall;

	@FindBy(xpath = "/html/body/div[9]/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]")
	public static WebElement selectyoutube;

	@FindBy(xpath = "/html/body/div[9]/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div[2]/div[2]/div[1]/span/span/input")
	public static WebElement Sendkeysyoutube;

	@FindBy(xpath = "/html/body/div[9]/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div[2]/div[2]/div[1]/span/span/span/button")
	public static WebElement searchyoutube;

	@FindBy(xpath = "/html/body/div[9]/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div[2]/div[2]/div[3]/button[1]")
	public static WebElement previousyoutube;

	@FindBy(xpath = "/html/body/div[9]/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div[2]/div[2]/div[3]/button[2]")
	public static WebElement nextyoutube;

	@FindBy(xpath = "/html/body/div[9]/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]")
	public static WebElement selectvideo;

	// Add
	@FindBy(xpath = "//button[@class='ant-btn assets-add-button ant-btn ant-btn-lg ant-btn-primary ant-btn-button']")
	public static WebElement Add;

	@FindBy(xpath = "//div[@class='assets-add-content-container-button-new-designV2 create-article']")
	public static WebElement AddCreateArticle;

	@FindBy(xpath = "//div[@class='public-DraftEditorPlaceholder-root']")
	public static WebElement AddArticleTitle;

	@FindBy(xpath = "//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']")
	public static WebElement AddArticleTitleName;

	@FindBy(xpath = "//div[@class='RichTextEditor_header-preview']")
	public static WebElement AddPreview;

	@FindBy(xpath = "//div[contains(text(),'Back')]")
	public static WebElement AddBack;

	@FindBy(xpath = "//div[@class='RichTextEditor_header-publish']")
	public static WebElement AddPublish;

	@FindBy(xpath = "//div[@class='RichTextEditor_header-close']//*[local-name()='svg']//*[name()='path' and contains(@fill,'#8b9196')]")
	public static WebElement AddArticleClose;

	@FindBy(xpath = "//*[@id=\"step2\"]/input")
	public static WebElement AddFile;

	@FindBy(xpath = "//div[@class='assets-add-content-container-button-new-designV2 upload-a-folder']//input[@class='react-s3-upload-btn add-content-upload-s3 asset-upload-s3-input']")
	public static WebElement AddFolder;

	@FindBy(xpath = "//div[@id='step4']")
	public static WebElement AddYoutube;

	@FindBy(xpath = "//input[@placeholder='Search youtube videos']")
	public static WebElement AddSearchYoutube;

	@FindBy(xpath = "//button[@class='ant-btn ant-input-search-button ant-btn-primary ant-btn-lg']")
	public static WebElement AddYoutubeClickSearch;

	@FindBy(xpath = "//div[@id='youtube-card-0']//div[@class='assets-card-body-container assets-media-card']")
	public static WebElement AddSelectYoutubeVideo;

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	public static WebElement AddSaveYoutube;

	@FindBy(xpath = "//button[@class='ant-btn']")
	public static WebElement AddYoutubeCancel;

	@FindBy(xpath = "//*[name()='path' and contains(@d,'M563.8 512')]")
	public static WebElement AddYoutubeClose;

	@FindBy(xpath = "//div[@class='assets-add-content-container-button-new-designV2 create-quiz']")
	public static WebElement AddClickQuiz;

	@FindBy(xpath = "//input[@placeholder='Enter a Quiz Title']")
	public static WebElement AddEnterQuizTitle;

	@FindBy(xpath = "//textarea[@id='editor-area']")
	public static WebElement AddQuizQuetsions;
	
//	@FindBy(xpath = "//pre[contains(text(),'Who is father of Computer Science?')]")
//	public static WebElement EnterQuiz;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div/div[4]/div/button[2]")
	public static WebElement AddQuizsave;

	@FindBy(xpath = "//button[@class='ant-btn sc-pzMyG flrnRv ant-btn-secondary']")
	public static WebElement AddQuizCancel;

	@FindBy(xpath = "//div[@id='step3']")
	public static WebElement AddRecordVideo;

	@FindBy(xpath = "//button[@class='VideoRecorder_start-record']") 
	public static WebElement ClickStartRecord;
	  
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-default']")
	public static WebElement StopVideoRecord;
	  
	@FindBy(xpath = "//button[@class='ant-btn VideoRecorder_save-record-btn ant-btn-primary']") 
	public static WebElement SaveVideoRecord;
	  
	@FindBy(xpath = "//button[@class='ant-btn']")
	public static WebElement RecordAgain;
	  
	@FindBy(xpath = "//div[contains(text(),'Screen Record')]")
	public static WebElement AddScreenRecord;
	  
	@FindBy(xpath = "//button[@class='ScreenAndVideoRecorder_start-record']") 
	public static WebElement AddStartScreenRecord;
	  
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-default']")
	public static WebElement AddStopScreenRecording;

	@FindBy(xpath = "//div[@class='ScreenAndVideoRecorder_stop-record']//button[@class='ant-btn']")
	public static WebElement AddScreenRecordAgain;

	@FindBy(xpath = "//div[@class='ScreenAndVideoRecorder_stop-record']//button[@class='ant-btn ant-btn-primary']")
	public static WebElement AddSaveScreenRecord;
		
	@FindBy(xpath = "//div[contains(text(),'Screen + Video Record')]")
	public static WebElement AddScreenVideoRecord;

	@FindBy(xpath = "//button[@class='ScreenAndVideoRecorder_start-record']")
	public static WebElement AddStartScreenVideoRecord;

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-default']")
	public static WebElement AddStopScreenVideoRecord;

	@FindBy(xpath = "//div[@class='ScreenAndVideoRecorder_stop-record']//button[@class='ant-btn']")
	public static WebElement AddRecordAgainScreenVideo;

	@FindBy(xpath = "//div[@class='ScreenAndVideoRecorder_stop-record']//button[@class='ant-btn ant-btn-primary']")
	public static WebElement AddSaveVideoScreenRecord;

	@FindBy(xpath = "//i[@class='anticon anticon-close ant-modal-close-icon']//*[local-name()='svg']") 
	public static WebElement AddRecordVideoClose;

//	  @FindBy(xpath = "") 
//	  public static WebElement ;
//
//	  @FindBy(xpath = "") 
//	  public static WebElement ;
//
	
	 
		
	
//Actions
	
	  @FindBy(xpath = "//body/div[@id='root']/div[@class='primary-layout-container']/div[@class='primary-body']/div[@id='right-click-menu']/div[@id='right-click-menu']/div[@id='right-click-menu']/div[@id='right-click-menu']/div[@id='right-click-menu']/div[@class='ant-spin-nested-loading']/div[@class='ant-spin-container']/div[@id='right-click-menu']/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]") 
	  public static WebElement AssetAction;

	  @FindBy(xpath = "//div[@class='ant-dropdown ant-dropdown-placement-bottomLeft']//li[1]") 
	  public static WebElement ActionView;

	  @FindBy(xpath = "//div[@class='ant-dropdown ant-dropdown-placement-bottomLeft']//li[2]") 
	  public static WebElement ActionEdit;

	  @FindBy(xpath = "//input[@id='name']") 
	  public static WebElement ActionEditName;

	  @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']") 
	  public static WebElement ActionEditnameUpdate;

	  @FindBy(xpath = "//button[@class='ant-btn']") 
	  public static WebElement ActionRenameCancel;

	  @FindBy(xpath = "//i[@class='anticon anticon-close ant-modal-close-icon']") 
	  public static WebElement ActionEditnameClose;

	  @FindBy(xpath = "//div[@class='ant-dropdown ant-dropdown-placement-bottomLeft']//li[3]") 
	  public static WebElement ActionAssignTag;

//	  @FindBy(xpath = "") 
//	  public static WebElement ;
//
//	  @FindBy(xpath = "") 
//	  public static WebElement ;
//
//	  @FindBy(xpath = "") 
//	  public static WebElement ;

	  
	  
	  
	// Assertion

	@FindBy(xpath = "//span[contains(text(),'Why newboston')]")
	public static WebElement GetSearchtitle;

	@FindBy(xpath = "//span[contains(text(),'Selenium WebDriver Tutorial | Selenium WebDriver T')]")
	public static WebElement GetPlayVideoTitle;

	@FindBy(xpath = "//div[contains(text(),'api test image.png')]")
	public static WebElement GetImageTitle;

	@FindBy(xpath = "//span[@class='ant-modal-confirm-title']")
	public static WebElement GetDeleteTitle;

	// @FindBy(xpath = "")
	// public static WebElement ;

	// private static WebDriverWait wait =new WebDriverWait(browser, 30);

	public AssetsPage() {
		PageFactory.initElements(browser, this);
	}

	public static void asset() throws InterruptedException {
		browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		assets.click();
		ListGrid.click();
		Thread.sleep(1000);
		ListGrid.click();
		// browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	public static void AssetSearch() throws InterruptedException {
		browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		search.click();
		search.sendKeys("Perl");
		Thread.sleep(3000);
		Cancelsearch.click();
		// browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

/*	public static String getSearchTitle() {

		String searchTitle = GetSearchtitle.getText();
		return searchTitle;
	} */

	public static void course() throws InterruptedException {
		browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		SelectCourse.click();
		Thread.sleep(2000);
		CloseCourse.click();
	}

/*	public static String getPlayvideoTitle() {
		String videoTitle = GetPlayVideoTitle.getText();
		return videoTitle;
	} */

	
/*	public static void filterLast7days() throws InterruptedException {
		browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		filter.click();
		assertTypeSearch.click();
		assertTypeSearch.sendKeys("Video");
		selectasserttype.click();
		SearchUser.click();
		SelectUser.click();
		SearchCourse.click();
		selectCourse.click();
		// SearchTag.click();
		SelectTag.click();
		LastSevenDays.click();
		Resetall.click();

	} */

/*	public static void filterLast30days() throws InterruptedException {
		browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		filter.click();
		assertTypeSearch.click();
		assertTypeSearch.sendKeys("Video");
		selectasserttype.click();
		SearchUser.click();
		SelectUser.click();
		SearchCourse.click();
		selectCourse.click();
		// SearchTag.click();
		SelectTag.click();
		LastThirtyDays.click();
		cancel.click();

	}

	public static void filterLast3month() throws InterruptedException {
		filter.click();
		assertTypeSearch.click();
		assertTypeSearch.sendKeys("Video");
		selectasserttype.click();
		SearchUser.click();
		SelectUser.click();
		SearchCourse.click();
		selectCourse.click();
		// SearchTag.click();
		SelectTag.click();
		LastThreeMonth.click();
		Apply.click();
		Thread.sleep(3000);
		ClearAllFilters.click();

	}

	public static String getFilterImageTitle() {
		String ImageTitle = GetImageTitle.getText();
		return ImageTitle;
	} */

	public static void AssetViewCourse() throws InterruptedException {
		browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		SelectVideo.click();
		View.click();
		Thread.sleep(3000);
		CloseCourse.click();

	}
	
	public static void AssetActionView() {
		browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		AssetAction.click();
		ActionView.click();
		CloseCourse.click();
	}

	public static void ActionEdit() throws InterruptedException {
		browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		AssetAction.click();
		ActionEdit.click();
		ActionEditName.clear();
		ActionEditName.sendKeys("Rename");
		ActionEditnameUpdate.click();
		Thread.sleep(2000);
		AssetAction.click();
		ActionEdit.click();
		ActionEditName.clear();
		ActionEditName.sendKeys("Rename");
		ActionEditnameUpdate.click();
		ActionRenameCancel.click();	
		Thread.sleep(2000);
		AssetAction.click();
		ActionEdit.click();
		ActionEditName.clear();
		ActionEditName.sendKeys("Rename");
		ActionEditnameUpdate.click();
		ActionEditnameClose.click();
	}
	
//	public static void Action
	
	
	public static void AssetDeleteVideo() throws InterruptedException {
		browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		SelectVideo_Delete.click();
		DeleteAssetVideo.click();
		Thread.sleep(1000);
		AssetDeleteCancel.click();
		SelectVideo_Delete.click();

	}

/*	public static String getDeleteTitle() {
		String DeleteTitle = GetDeleteTitle.getText();
		return DeleteTitle;
	} */

	public static void AssetCreateCourse() throws InterruptedException {
		browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		SelectVideo.click();
		CreateCourse.click();
		CourseTitle.sendKeys("Title");
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
//		NextButtonAddLesson.click(); // ##
//		Thread.sleep(2000);
//		SelectYoutube.click();
//		YoutubeSearch.click();
//		YoutubeSearch.sendKeys("aws");
//		youtubeClickSearch.click();
//		ClickYoutubeVideo.click();
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
		AddTitleName.sendKeys("Title");
		Preview.click();
		Back.click();
		Publish.click();
		ArticleClose.click();
		Thread.sleep(2000);
		MoreSetting.click();
//		MoreSettingFile.click();
//		Thread.sleep(2000);
//		MoreSettingFile.sendKeys("/home/narmadha/Downloads/test.jpeg");
//		Thread.sleep(2000);
//		AddAsset.click();
//		MoreSetting.click();
//		Thread.sleep(2000);

		// MoreSettingFolder.sendKeys("/home/narmadha/Downloads/sampleImages");

	//	CloseAddContent.click();
//		Thread.sleep(2000);
		NextButtonAddLesson.click();
//		Thread.sleep(10000);
//		 FilterButton.click();
//		 AssetTypeButton.click();
//		 SearchAssetType.sendKeys("Image");
//		 SelectAssetTypeImage.click();
//		 UploaderButton.click();
//		 UploaderSearch.sendKeys("narmadha");
//		 UploaderSearch.clear();
//		 SelectUploader.click();
//		 TagButton.click();
//		 TagSearch.sendKeys("api");
//		 TagSearch.clear();
//		 SelectTagButton.click();
//		 UploadedDate.click();
//		 SearchDate.sendKeys("Last 7 Days");
//		CoursePrivacy.click();
//		
		
//		CoursePrivacyDropDown.click();
//		CoursePrivacypublic.click();
//		Thread.sleep(2000);
//		CoursePrivacy.click();
//		Thread.sleep(2000);
//		CoursePublicWithinCompany.click();
//		Thread.sleep(2000);
//		CoursePrivacy.click();
//		Thread.sleep(2000);
//		CoursePrivate.click();
//		
//		CourseLicense.click();
//		Thread.sleep(2000);
//		CreativeCommonLicenseAttribution.click();
//		Thread.sleep(2000);
//		CreativeCommonLicenseShareAlike.click();
//		Thread.sleep(2000);
//		CourseLicenseNonCommercial.click();
//		Thread.sleep(2000);
//		CourseLicenseNonDerivative.click();
//		Thread.sleep(2000);
//		UserLicense.click();
//		Thread.sleep(1000);

//		CompletionSetting.click();
//		TowardsEndCourse.click();
//		CourseCompletePercentage.click();
//		CourseCompletePercentage.clear();
//		CourseCompletePercentage.sendKeys("90");
		
//
//		courseSettingNext.click();
//		CourseAgendaNext.click();
//		SelectAssignment.click();
//		SelectGroups.click();
//		FinishCourse.click();

	}
	
	public static void CourseSetting() {
		courseSettingNext.click();
	}
	
	public static void CourseAgenda() {
		CourseAgendaNext.click();
	}
	
	public static void AssignLearners() {
	//	SelectAssignment.click();
	//	SelectGroups.click();
		FinishCourse.click();
	}
	
	
	public static void AssetAddArticle() throws InterruptedException {
		browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Add.click();
		AddCreateArticle.click();
		AddArticleTitle.click();
		Thread.sleep(2000);
		AddArticleTitleName.sendKeys("NewTitle");
		Thread.sleep(2000);
		AddPreview.click();
		Thread.sleep(2000);
		AddBack.click();
		AddPublish.click();
		AddArticleClose.click();

	}

	public static void AddFile() throws InterruptedException {
		browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		Add.click();
		Thread.sleep(3000);
		AddFile.sendKeys("/home/narmadha/Downloads/winner-badge-8228225.jpg");
		Thread.sleep(5000);
	}

	public static void AddFolder() throws InterruptedException {
		browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		Add.click();
		Thread.sleep(3000);
		AddFolder.sendKeys("/home/narmadha/Downloads/sampleImages");
		Thread.sleep(5000);
	}

	public static void AddYoutube() throws InterruptedException {
//		Add.click();
//		Thread.sleep(3000);
//		AddYoutube.click();
//		Thread.sleep(3000);
//		AddSearchYoutube.click();
//		Thread.sleep(2000);
//		AddSearchYoutube.sendKeys("perl");
//		AddSearchYoutube.clear();
//		Thread.sleep(2000);
//		AddYoutubeClickSearch.click();
//		Thread.sleep(2000);
//		AddSelectYoutubeVideo.click();
//		Thread.sleep(2000);
//		AddYoutubeCancel.click();
//		Thread.sleep(2000);
		
		
//		Add.click();
//		AddYoutube.click();
//		AddSearchYoutube.click();
//		AddSearchYoutube.sendKeys("perl");
//		AddYoutubeClickSearch.click();
//		AddSelectYoutubeVideo.click();
//		AddSaveYoutube.click();
		
		Add.click();
		AddYoutube.click();
		AddSearchYoutube.click();
		AddSearchYoutube.sendKeys("perl");
		AddYoutubeClickSearch.click();
//		AddSelectYoutubeVideo.click();
		AddYoutubeClose.click();
		Thread.sleep(5000);
	}

	public static void AddCreateQuiz() throws IOException, InterruptedException {
		browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Add.click();
		AddClickQuiz.click();
		
		File file = new File(
				"/home/narmadha/Documents/Selenium/automation-master/kloudlearn-website/src/main/java/pages/Quiz.txt");
		FileReader fr = new FileReader(file);

		BufferedReader reader = new BufferedReader(fr);
		StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
		String line;  
		while((line=reader.readLine())!=null)  
		{  
		sb.append(line);      //appends line to string buffer  
		sb.append("\n");     //line feed   
		}  
		fr.close();    //closes the stream and release the resources  
		System.out.println("Contents of File: ");  
		AddQuizQuetsions.sendKeys(sb.toString());
		System.out.println(sb.toString());   //returns a string that textually represents the object  
		AddEnterQuizTitle.sendKeys("New Quiz");
		Thread.sleep(2000);
		
//		WebDriverWait wait = new WebDriverWait(browser, 15);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Save')]")));
		
		AddQuizsave.click();

	//	AddQuizCancel.click();

	
	}
	
	public static void AddRecorVideo() throws InterruptedException {
		browser.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Add.click();
		AddRecordVideo.click();
		ClickStartRecord.click();
		Thread.sleep(2000);
		StopVideoRecord.click();
		RecordAgain.click();
		Thread.sleep(2000);
		StopVideoRecord.click();
		SaveVideoRecord.click();
		Thread.sleep(4000);
		
		Add.click();
		AddRecordVideo.click();
		AddScreenRecord.click();
		AddStartScreenRecord.click();
		Thread.sleep(2000);
		AddStopScreenRecording.click();
		AddScreenRecordAgain.click();
		Thread.sleep(2000);
		AddStopScreenRecording.click();
		AddSaveScreenRecord.click();
		Thread.sleep(4000);
		
		Add.click();
		AddRecordVideo.click();
		AddScreenVideoRecord.click();
		AddStartScreenVideoRecord.click();
		Thread.sleep(2000);
		AddStopScreenVideoRecord.click();
		AddRecordAgainScreenVideo.click();
		Thread.sleep(2000);
		AddStopScreenVideoRecord.click();
		AddSaveVideoScreenRecord.click();
		Thread.sleep(4000);
		
	//	AddRecordVideoClose.click();
		
	}
}
