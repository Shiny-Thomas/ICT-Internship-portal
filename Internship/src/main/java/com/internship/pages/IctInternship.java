package com.internship.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IctInternship {
	
	WebDriver driver;
	public IctInternship(WebDriver driver)
    {
        this.driver=driver;
    }
//login....................................................................................................................................
	public void loginClick()
	{
		
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Login']"));
		element.click();
	}
	public void setEmail(String email) 
	{
		WebElement e=driver.findElement(By.xpath("//input[@id=':r0:']"));
		e.sendKeys(email);
	}
	public void setPassword(String Pssd)
	{
		WebElement password=driver.findElement(By.xpath("//input[@id=':r1:']"));
		password.sendKeys(Pssd);
	}
	
	public void loginSubmit()
	{
		
		WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		element.click();
	}
	public String getAdminhome()
    {
        WebElement txt=driver.findElement(By.xpath("//h6[normalize-space()='ADMIN-Dashboard']"));
        String actres=txt.getText();
        return actres;
    }
	public String getMentorhome()
    {
        WebElement txt=driver.findElement(By.xpath("//h6[normalize-space()='ICTAK-Mentor Dashboard']"));
        String actres=txt.getText();
        return actres;
    }


//Admin operations on Projects...............................................................................................

	
	public void projectClick()
	{
		
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Projects')]"));
		element.click();
	}
//adding projects	
	public void addProjectclick()
	{
		
		WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Add Project']"));
		element.click();
	}
	public void setProjectname(String Pname)
	{
		WebElement p=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		p.sendKeys(Pname);
	}
	public void add()
	{
		
		WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Add']"));
		element.click();
	}
//editing project	
	public void editProjectclick()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // 10 seconds timeout

        By dynamicElementLocator = By.xpath("//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]");
        WebElement dynamicElement = wait.until(ExpectedConditions.visibilityOfElementLocated(dynamicElementLocator));

        boolean elementClicked = false;
        int attempts = 0;

        while (attempts < 3) {
            try {
                // Try to click the element
                dynamicElement.click();
                elementClicked = true;
                break; // exit the loop if click is successful
            } catch (StaleElementReferenceException e) {
                // Re-locate the element
                dynamicElement = wait.until(ExpectedConditions.visibilityOfElementLocated(dynamicElementLocator));
            }
            attempts++;
        }

        if (!elementClicked) {
            System.out.println("Failed to click the element after 3 attempts.");
        }
	}
	public void editProjectname(String EPname)
	{
		WebElement p=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		p.sendKeys(EPname);
	}
	public void editProjectsave()
	{
		
		WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		element.click();
		 
    
	}
	private void editsaveAlert() {
        // TODO Auto-generated method stub
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println("Alert Text: " + alertText);
            alert.accept();
        } catch (Exception e) {
            System.out.println("No alert present or unable to handle alert: " + e.getMessage());
        }
    }
	
//deleting project	
	
	public void deleteProject()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // 10 seconds timeout

        By dynamicElementLocator = By.xpath("//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[2]/button[2]");
        WebElement dynamicElement = wait.until(ExpectedConditions.visibilityOfElementLocated(dynamicElementLocator));

        boolean elementClicked = false;
        int attempts = 0;

        while (attempts < 3) {
            try {
                // Try to click the element
                dynamicElement.click();
                elementClicked = true;
                break; // exit the loop if click is successful
            } catch (StaleElementReferenceException e) {
                // Re-locate the element
                dynamicElement = wait.until(ExpectedConditions.visibilityOfElementLocated(dynamicElementLocator));
            }
            attempts++;
        }

        if (!elementClicked) {
            System.out.println("Failed to click the element after 3 attempts.");
        }
	}
	
	private void deleteProjectalert() {
        // TODO Auto-generated method stub
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println("Alert Text: " + alertText);
            alert.accept();
        } catch (Exception e) {
            System.out.println("No alert present or unable to handle alert: " + e.getMessage());
        }
    }
//admin operation on mentors...................................................................................................................
	public void mentorformClick()
	{
		
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Mentor Form']"));
		element.click();
		
	}
//adding mentor details
	public void mentorName(String Mname)
	{
		WebElement m=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		m.sendKeys(Mname);
	}
	public void mentorEmail(String Memail)
	{
		WebElement m=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		m.sendKeys(Memail);
	}
	public void mentorPhonenum(String Mnum)
	{
		WebElement m=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]"));
		m.sendKeys(Mnum);
	}
	public void mentorPassword(String Mpass)
	{
		WebElement m=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]"));
		m.sendKeys(Mpass);
	}
	public void selectProjecttopic()
	{
//		WebElement drop=driver.findElement(By.xpath("//div[@id='demo-simple-select']"));
//		drop.click();
//		//driver.findElement(By.xpath("//li[normalize-space()='Digital Marketing']")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Digital Marketing']")));
//		element.click();
		
		WebElement element = driver.findElement(By.xpath("//div[@id='demo-simple-select']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		driver.findElement(By.xpath("//li[normalize-space()='Weather forecasting']")).click();
		
	}
	public void submitMentor()
	{
		
		WebElement element = driver.findElement(By.xpath("//button[normalize-space()='SUBMIT']"));
		element.click();
		
	}
//updating mentor details
	
	public void updateClick()
	{
		
		WebElement element = driver.findElement(By.xpath("//tbody/tr[16]/td[5]/button[1]"));
		element.click();
		
	}
	public void mentorNameupdate(String Mname)
	{
		WebElement m=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		m.clear();
		m.sendKeys(Mname);
	}
	public void mentorEmailupdate(String Memail)
	{
		WebElement m=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		m.clear();
		m.sendKeys(Memail);
	}
	public void mentorPhonenumupdate(String Mnum)
	{
		WebElement m=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]"));
		m.clear();
		m.sendKeys(Mnum);
	}
	public void mentorPasswordupdate(String Mpass)
	{
		WebElement m=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]"));
		m.clear();
		m.sendKeys(Mpass);
	}
	public void selectProjecttopicupdate()
	{

		
		WebElement element = driver.findElement(By.xpath("//div[@id='demo-simple-select']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		driver.findElement(By.xpath("//li[normalize-space()='Examination portal']")).click();
		
	}
	public void submitMentorupdate()
	{
		
		WebElement element = driver.findElement(By.xpath("//button[normalize-space()='SUBMIT']"));
		element.click();
		
	}
	private void updateAlert() {
        // TODO Auto-generated method stub
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println("Alert Text: " + alertText);
            alert.accept();
        } catch (Exception e) {
            System.out.println("No alert present or unable to handle alert: " + e.getMessage());
        }
    }
//deleting mentor details
	public void deleteMentor()
	{
		
		WebElement element = driver.findElement(By.xpath("//tbody/tr[15]/td[6]/button[1]"));
		element.click();
		
	}
	private void deleteMentoralert() {
        // TODO Auto-generated method stub
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println("Alert Text: " + alertText);
            alert.accept();
        } catch (Exception e) {
            System.out.println("No alert present or unable to handle alert: " + e.getMessage());
        }
    }
//logout
	public void logout()
	{
		
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
		element.click();
		
	}
//mentor operations on projects..................................................................................................................	

	public void showButton()
	{
		
		WebElement element = driver.findElement(By.xpath("//button[normalize-space()='SHOW']"));
		element.click();
		
	}
	
	public void viewAllotedprojectButton()
	{
		
		WebElement element = driver.findElement(By.xpath("//body/div[@id='root']/div/div/div/div[1]/div[2]/a[1]"));
		element.click();
		
	}
//submissions	
	
	public void viewStudentsubmissionButton()
	{
		
		WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'VIEW')])[1]"));
		element.click();
		
	}
	public void setMarks()
	{
		WebElement drop=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
		drop.click();
		driver.findElement(By.xpath("//body/div[@id='menu-Marks']/div[3]/ul[1]/li[9]")).click();
	}
	public void setComments(String com)
	{
		WebElement mc=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/textarea[1]"));
		mc.clear();
		mc.sendKeys(com);
	}
	public void updateSubmissionbutton()
	{
		
		WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Update']"));
		element.click();
		
	}
	private void updatedSubmissionalert() {
        // TODO Auto-generated method stub
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println("Alert Text: " + alertText);
            alert.accept();
        } catch (Exception e) {
            System.out.println("No alert present or unable to handle alert: " + e.getMessage());
        }
    }
	public void deleteSubmissionbutton()
	{
		
		WebElement element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[8]/button[1]"));
		element.click();
		
	}
	private void deletedSubmissionalert() {
        // TODO Auto-generated method stub
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println("Alert Text: " + alertText);
            alert.accept();
        } catch (Exception e) {
            System.out.println("No alert present or unable to handle alert: " + e.getMessage());
        }
    }
//filtering by batch
	
	public void filterDropdown()
	{
		WebElement drop=driver.findElement(By.xpath("//div[@role='combobox']"));
		drop.click();
		driver.findElement(By.xpath("//li[normalize-space()='KKEM March ST']")).click();
	}
//reference material
	public void referenceMaterialbutton()
	{
		
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Reference Material']"));
		element.click();
		
	}
	public void addReferencematerialButton()
	{
		
		WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Add Material']"));
		element.click();
		
	}
	public void setTitle(String t)
	{
		WebElement element=driver.findElement(By.xpath("//input[@id=':ra:']"));
		element.clear();
		element.sendKeys(t);
	}
	public void setDescription(String d)
	{
		WebElement element=driver.findElement(By.xpath("//input[@id=':rb:']"));
		element.clear();
		element.sendKeys(d);
	}
	public void setLink(String l)
	{
		WebElement element=driver.findElement(By.xpath("//input[@id=':rc:']"));
		element.clear();
		element.sendKeys(l);
	}
	public void addButton()
	{
		
		WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Add']"));
		element.click();
		
	}
	public void deleteButton()
	{
		
		WebElement element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]/button[1]"));
		element.click();
		
	}
	private void deleteReferencematerialAlert() {
        // TODO Auto-generated method stub
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println("Alert Text: " + alertText);
            alert.accept();
        } catch (Exception e) {
            System.out.println("No alert present or unable to handle alert: " + e.getMessage());
        }
    }
}



