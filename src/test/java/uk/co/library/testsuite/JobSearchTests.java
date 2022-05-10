package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.testbase.TestBase;
@Listeners(CustomListeners.class)
public class JobSearchTests extends TestBase  {
    HomePage homePage;
    @BeforeMethod()
    public void inIt(){
       homePage= new HomePage();
    }

    @Test(groups={"sanity","smoke","regression"},dataProvider = "Job", dataProviderClass = TestData.class)
      public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String
              distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                             String result) throws InterruptedException {
        homePage.acceptIFrameAlert();
        homePage.clickOnAcceptCookies();
        homePage.enterJobTitle(jobTitle);
        homePage.enterLocation(location);
        homePage.selectdistance(distance);
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinimumSalary(salaryMin);
        homePage.enterMaximumSalary(salaryMax);
        homePage.selectSalaryType(salaryType);
        homePage.selectJobType(jobType);
        homePage.clickOnFindJobsButton();
    }
}
