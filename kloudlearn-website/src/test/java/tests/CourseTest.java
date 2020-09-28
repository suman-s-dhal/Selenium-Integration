package tests;

import static base.TestBase.initialization;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.CoursePage;

public class CourseTest {
		CoursePage CoursePage;
		//SoftAssert softAssert = new SoftAssert();
		  
		@BeforeClass
		public void setUp(){
			//initialization();
		    CoursePage = new CoursePage();
		       
		    }

		/*@Test
		public void ValidateCourse() throws InterruptedException
		{
			pages.CoursePage.SelectCourse();
		//	pages.CoursePage.SelectRecentCourse();

		}

		@Test
		public void validateCourseSearch() throws InterruptedException {
			pages.CoursePage.SelectSearch();
		}
		
		@Test
		public void validateCourseUpload() {
			pages.CoursePage.Course();
		}
		
		@Test
		public void validateCourseSummary() {
			pages.CoursePage.CourseSummary();
		}
}
*/
