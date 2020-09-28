package tests;

//import static base.TestBase.initialization;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

import pages.CoursePage;

public class CourseTest {
		CoursePage CoursePage;
		//SoftAssert softAssert = new SoftAssert();
		  
		@BeforeClass
		public void setUp(){
			//initialization();
		    CoursePage = new CoursePage();
		       
		    }

		@Test
		public void ValidateCourse() throws InterruptedException
		{
			pages.CoursePage.SelectCourse();
			System.out.println("Select Course");
		//	pages.CoursePage.SelectRecentCourse();

		}
		
		@Test
		public void validateKloudlearnCourse() throws InterruptedException {
			pages.CoursePage.Kloudlearncourse();
			System.out.println("Create KL Course");
		}
		
		@Test
		public void ValidateCompletionSetting() throws InterruptedException {
			pages.CoursePage.CompletionSetting();
			System.out.println("course completion Setting");
			pages.CoursePage.control();
			System.out.println("control setting");
			pages.CoursePage.controls1();
			System.out.println("control1 Setting");
		}
		
		@Test
		public void ValidateAssessmentSetting() {
			pages.CoursePage.AssessmentSetting();
			System.out.println("Assessment setting");
		}
		
		@Test
		public void ValidateCertificateSetting() {
			pages.CoursePage.CertificateSetting();
			System.out.println("Certificate Setting");
		}
		
		@Test
		public void ValidateAssignSkills() {
			pages.CoursePage.AssignSkills();
			System.out.println("Assign skills Setting");
		}
		
		@Test
		public void validateCourseSetting() {
			pages.CoursePage.CreateCourseSetting();
			System.out.println("Create course Setting");
		}
		
		@Test
		public void validateCourseAgenda() throws InterruptedException {
			pages.CoursePage.CreateCourseAgenda();
			System.out.println("Course Agenda");
		}
		
		
		@Test
		public void validateAssignLearner() throws InterruptedException {
	//		pages.CoursePage.AssignLearners();
	//		System.out.println("Assign learner");
			pages.CoursePage.CreateAssignLearners();
			System.out.println("finish");
		}
		
	/*	@Test
		public void validateCourseSummary() {
			pages.CoursePage.CourseSummary();
		}
		
		@Test
		public void validateCourseSearch() throws InterruptedException {
			pages.CoursePage.SelectSearch();
		}
		
		@Test
		public void validateCourseUpload() {
			pages.CoursePage.Course();
		} */
}
