package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span//div//span[normalize-space()='Accept All']")
    WebElement acceptCookies;

    @FindBy(id = "gdpr-consent-notice")
    WebElement iframe;

    @FindBy(xpath = "//*[@id=\"save\"]/span[1]/div/span")
    //@FindBy(xpath = "//span//div//span[normalize-space()='Accept All']")
    WebElement acceptCookiesButton;
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptAll;

    @FindBy(id = "keywords")
    WebElement jobTitle;

    @FindBy(xpath = "//input[@placeholder='e.g. town or postcode']")
    WebElement location;

    @FindBy(name = "distance")
    WebElement distance;

    @FindBy(xpath = "//form[@role='search']//div//button[@type='button']")
    WebElement moreSearchOptions;

    @FindBy(id = "salarymin")
    WebElement salaryMinimum;

    @FindBy(id = "salarymax")
    WebElement salaryMaximum;

    @FindBy(id = "salarytype")
    WebElement salaryType;

    @FindBy(id = "tempperm")
    WebElement jobType;

    @FindBy(id = "hp-search-btn")
    WebElement findJobs;

    public void acceptIFrameAlert() throws InterruptedException {
        Thread.sleep(2000);
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(acceptCookiesButton);
        driver.switchTo().defaultContent();}

        public void clickOnAcceptCookies () {
            clickOnElement(acceptCookies);
        }
        public void enterJobTitle (String title)
        {
            sendTextToElement(jobTitle, title);
        }
        public void enterLocation (String locate)
        {
            sendTextToElement(location, locate);
        }
        public void selectdistance (String key){
            selectByValueFromDropDown(distance, key);
        }
        public void clickOnMoreSearchOptionLink () {
            clickOnElement(moreSearchOptions);
        }
        public void enterMinimumSalary (String keys)
        {
            sendTextToElement(salaryMinimum, keys);
        }
        public void enterMaximumSalary (String keys)
        {
            sendTextToElement(salaryMaximum, keys);
        }
        public void selectSalaryType (String type)
        {
            selectByVisibleTextFromDropDown(salaryType, type);
        }
        public void selectJobType (String keys){
            selectByVisibleTextFromDropDown(jobType, keys);
        }
        public void clickOnFindJobsButton () {
            clickOnElement(findJobs);
        }

    }
