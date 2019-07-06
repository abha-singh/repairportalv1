package com.ph.pageobject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ph.testcases.Ph_baseclass;

public class Loginobjects extends Ph_baseclass {
	WebDriver ldriver;

	public Loginobjects(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	// Login
	@FindBy(xpath = "//input[@id='mat-input-0']")
	WebElement username;
	@FindBy(xpath = "//input[@id='mat-input-1']")
	WebElement password;
	@FindBy(xpath = "//button[@class='mat-raised-button mat-accent']")
	WebElement Loginbutton;

	// Estimation
	@FindBy(xpath = "//span[@class='mat-button-wrapper' and text()='Estimation']//ancestor::tbody")
	List<WebElement> PendingEstimationTotalRecords;
	@FindBy(xpath = "//span[contains(text(),'865720041497659')]//parent::button//parent::td//parent::tr//child::span[text()='Estimation']")
	WebElement Estimationbutton;
	@FindBy(xpath = "//mat-select[@placeholder='Select ARC Model']")
	WebElement SelectArcModel;
	@FindBy(xpath = "//mat-option[@role='option']//child::span[@class='mat-option-text']")
	WebElement Modelname;
	@FindBy(xpath = "//span[@class='mat-button-wrapper' and text()='Submit']")
	WebElement SubmitEstimation;
	@FindBy(xpath = "//div[contains(text(),'Bill of Material')]")
	WebElement BillofMaterialbutton;
	@FindBy(xpath = "//mat-checkbox[@id='mat-checkbox-1']")
	WebElement selectPartcheckbox;
	@FindBy(xpath = "//th[text()='Price']//parent::tr/following::tbody//td//child::input[@maxlength='8']")
	WebElement enterpartprice;
	@FindBy(className = "mat-input-element")
	WebElement Labourcharge;
	@FindBy(xpath = "//mat-select[@placeholder='Tax (%)']")
	WebElement Taxdropdown;
	@FindBy(xpath = "//mat-option[@role='option']//child::span[@class='mat-option-text']")
	WebElement Taxdropdownvalue;
	@FindBy(xpath = "//span[contains(text(),'Calculate')]")
	WebElement Calculatebutton;
	@FindBy(xpath = "//textarea[@placeholder='Comments']")
	WebElement comments;
	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	WebElement submitclick;
	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	WebElement yesclick;
	// upload images
	@FindBy(xpath = "//div[contains(text(),'Upload Files')]")
	WebElement uploadfiles;
	@FindBy(xpath = "//input[@type='file']")
	WebElement Filetypeselect;
	@FindBy(xpath = "C:\\Users\\abha.singh\\Documents\\Repair portal\\quality check.png")
	WebElement filepath;
	@FindBy(xpath = "//span[contains(text(),'Upload')]")
	WebElement uploadclick;
	@FindBy(xpath = "//mat-select[@id='picklist']")
	WebElement Picklist;
	@FindBy(xpath = "//span[@class='mat-option-text' and contains(text(),\"Bottom Image\") ]")
	WebElement Bottomimage;
	@FindBy(xpath = "//span[@class='mat-option-text' and contains(text(),\"Back Image\") ]")
	WebElement Backimage;
	@FindBy(xpath = "//span[@class='mat-option-text' and contains(text(),\"Front Image\") ]")
	WebElement Frontimage;
	@FindBy(xpath = "//span[@class='mat-option-text' and contains(text(),\"Left Image\") ]")
	WebElement Leftimage;
	@FindBy(xpath = "//span[@class='mat-option-text' and contains(text(),\"Right Image\")]")
	WebElement Rightimage;
	@FindBy(xpath = "//span[@class='mat-option-text' and contains(text(),\"Top Image\") ]")
	WebElement Topimage;

	// repair in progress
	@FindBy(xpath = "//span[@class='mat-button-wrapper' and text()='Repair Complete']//ancestor::tbody")
	List<WebElement> TotalrecordsofRepairinprogress;
	@FindBy(xpath = "//input[@type='file']")
	WebElement QCfileselect;
	@FindBy(xpath = "C:\\\\Users\\\\abha.singh\\\\Documents\\\\Repair portal\\\\quality check.png")
	WebElement Filepath;
	@FindBy(xpath = "mat-input-element")
	WebElement repaircompletecomments;
	@FindBy(xpath = "mat-radio-outer-circle")
	WebElement Radiobuttonselect;
	@FindBy(xpath = "//button[@id='submitButton']")
	WebElement Submitclick;
	@FindBy(xpath = "//span[contains(text(),'865720041497659')]//parent::button//parent::td//parent::tr//child::span[text()='Repair Complete']")
	WebElement Repaircompletebutton;
	// pending for Dispatch Spoors
	@FindBy(xpath = "//span[@class='mat-button-wrapper' and text()='Dispatch']//ancestor::tbody")
	WebElement TotalPendingfordispatchrecords;
	@FindBy(xpath = "//span[text()='865720041497659']//parent::button//parent::td//parent::tr//child::span[text()='Dispatch']")
	WebElement Dispatchclick;
	@FindBy(xpath = "//span[text()='AWB Number']//parent::div//child::input")
	WebElement AWBnumber;
	@FindBy(xpath = "//span[text()='Picked Up By  ']//parent::div//child::input")
	WebElement Pickedupby;
	@FindBy(xpath = "//input[@placeholder='Pick Up Date/Time']")
	WebElement Pickupdatetime;
	@FindBy(xpath = "//span[contains(text(),'Set')]")
	WebElement Timedateset;
	@FindBy(xpath = "//textarea[@placeholder='Comments']")
	WebElement Dispatchcomments;
	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	WebElement Dispatchsubmit;
	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()='A']")
	WebElement subscribername;
	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()='Logout']")
	WebElement Logout;

	public void setusername(String user) {
		username.sendKeys(user);
	}

	public void setpassword(String psw) {
		password.sendKeys(psw);
	}

	public void login() {
		ldriver.manage().window().maximize();
		Loginbutton.click();
		
	}
   public void logout() throws InterruptedException {
	   subscribername.click();
	   Thread.sleep(2000);
	   Logout.click();
}
	public void estimation(String IMEI) throws Exception {
		List<WebElement> pending_estimation = PendingEstimationTotalRecords;
		System.out.println("This is size of tile:"+ PendingEstimationTotalRecords.size());
		/*if(pending_estimation==null  || pending_estimation.isEmpty()) {
		    //System.out.println("IMEI not available");
			System.out.println("Pending estimation---IMEI not found for Pending estimation");
		}*/
		
		for (int i = 0; i < pending_estimation.size(); i++) {
			if ((pending_estimation.get(i).getText()).contains(IMEI)) {
				Estimationbutton.click();
				System.out.println("estimation pop clicked and wait for 20 seconds");
				Thread.sleep(5000);
				System.out.println("after that click to show dropdown");
				WebDriverWait wait = new WebDriverWait(ldriver, 20);
				WebElement check1 = wait.until(ExpectedConditions.visibilityOf(SelectArcModel));
				check1.click();

				System.out.println("waiting for 20 sec");
				Thread.sleep(5000);
				Modelname.click();
				Thread.sleep(5000);

				WebElement submit_button = SubmitEstimation;
				submit_button.click();
				Thread.sleep(3000);
				this.uploadfile(imagepath, ldriver);
				BillofMaterialbutton.click();
				Thread.sleep(3000);
				selectPartcheckbox.click();
				enterpartprice.sendKeys("2000");
				Labourcharge.sendKeys("2000");

				WebElement check2 = wait.until(ExpectedConditions.visibilityOf(Taxdropdown));
				check2.click();
				WebElement options1 = wait.until(ExpectedConditions.visibilityOf(Taxdropdownvalue));
				this.clickElement(options1);
				ldriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebElement calculate_button = Calculatebutton;
				calculate_button.click();
				this.waiting();
				comments.sendKeys("Test123");
				this.waiting();
				submitclick.click();

				Thread.sleep(3000);
				yesclick.click();
				Thread.sleep(3000);
				break;
			} 
		}
		
	}


	public void waiting() {
		ldriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void clickElement(WebElement element) {

		element.click();
	}

	public WebElement getWebElement(String elem, String type, String type_val) {

		WebElement webElem = ldriver.findElement(By.xpath("//" + elem + "[@" + type + "='" + type_val + "']"));
		return webElem;
	}

	public void uploadfile(String imagepath, WebDriver driver) throws Exception {
		// log.info("Upload file done");
		uploadfiles.click();
		Thread.sleep(2000);
		Picklist.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement topimage = wait.until(ExpectedConditions.visibilityOf(Topimage));
		topimage.click();
		Thread.sleep(2000);
		WebElement fileselect = Filetypeselect;
		fileselect.sendKeys(imagepath);
		uploadclick.click();
		Thread.sleep(10000);
		Picklist.click();
		WebElement bottomimage = wait.until(ExpectedConditions.visibilityOf(Bottomimage));
		bottomimage.click();

		fileselect.sendKeys(imagepath);
		uploadclick.click();
		Thread.sleep(6000);
		Picklist.click();
		WebElement backimage = wait.until(ExpectedConditions.visibilityOf(Backimage));
		backimage.click();

		fileselect.sendKeys(imagepath);
		uploadclick.click();
		Thread.sleep(7000);

		Picklist.click();
		WebElement frontimage = wait.until(ExpectedConditions.visibilityOf(Frontimage));
		frontimage.click();

		fileselect.sendKeys(imagepath);
		uploadclick.click();

		Thread.sleep(7000);
		Picklist.click();
		WebElement leftimage = wait.until(ExpectedConditions.visibilityOf(Leftimage));
		leftimage.click();

		fileselect.sendKeys(imagepath);
		uploadclick.click();
		Thread.sleep(7000);
		Picklist.click();
		WebElement rightimage = wait.until(ExpectedConditions.visibilityOf(Rightimage));
		rightimage.click();

		fileselect.sendKeys(imagepath);
		uploadclick.click();
		Thread.sleep(7000);

	}

	public void repairinprogress(String IMEI, String imagepath) throws Exception {
		// log.info("Repair done");
		List<WebElement> pending = TotalrecordsofRepairinprogress;
		for (int i = 0; i < pending.size(); i++) {
			if ((pending.get(i).getText()).contains(IMEI)) {
				Repaircompletebutton.click();
				WebElement fileselect = QCfileselect;
				fileselect.sendKeys(imagepath);
				ldriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				repaircompletecomments.sendKeys("Test123");
				Radiobuttonselect.click();
				Submitclick.click();
				Thread.sleep(3000);
				break;

			} else {
				System.out.println("Repair In Progress---IMEI not found");
			}
		}
	}

}
