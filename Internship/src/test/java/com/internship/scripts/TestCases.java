package com.internship.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internship.constants.AutomationConstants;
import com.internship.pages.IctInternship;

public class TestCases extends TestBase {

	IctInternship tesobj=null;
	@Test(priority=1)
	public void loginAdmin() {
		tesobj=new IctInternship(driver);
		tesobj.loginClick();
		tesobj.setEmail(prop.getProperty("AdminEmail"));
		tesobj.setPassword(prop.getProperty("AdminPassword"));
		tesobj.loginSubmit();
		String actualresult=tesobj.getAdminhome();
		Assert.assertEquals(actualresult, AutomationConstants.ExpectedAdminHome);
		
	}
	@Test(priority=2)
	public void addProjects() {
		tesobj=new IctInternship(driver);
		tesobj.projectClick();
		tesobj.addProjectclick();
		tesobj.setProjectname(prop.getProperty("ProjectName"));
		tesobj.add();
		tesobj.editProjectclick();
		tesobj.editProjectname(prop.getProperty("EditProjectName"));
		tesobj.editProjectsave();
		tesobj.deleteProject();
	}
	@Test(priority=3)
	public void addingMentordetails() {
		tesobj=new IctInternship(driver);
		tesobj.mentorformClick();
		tesobj.mentorName(prop.getProperty("MentorName"));
		tesobj.mentorEmail(prop.getProperty("MentorEmail"));
		tesobj.mentorPhonenum(prop.getProperty("MentorPhonenum"));
		tesobj.mentorPassword(prop.getProperty("MentorPassword"));
		tesobj.selectProjecttopic();
		tesobj.submitMentor();
	}
	@Test(priority=4)
	public void updatingMentordetails() {
		tesobj=new IctInternship(driver);
		tesobj.updateClick();
		tesobj.mentorNameupdate(prop.getProperty("MentorNameUpdate"));
		tesobj.mentorEmailupdate(prop.getProperty("MentorEmailUpdate"));
		tesobj.mentorPhonenumupdate(prop.getProperty("MentorPhonenumUpdate"));
		tesobj.mentorPasswordupdate(prop.getProperty("MentorPasswordUpdate"));
		tesobj.selectProjecttopicupdate();
		tesobj.submitMentorupdate();
	}
	@Test(priority=5)
	public void deletingMentordetails() {
		tesobj=new IctInternship(driver);
		tesobj.deleteMentor();
		tesobj.logout();
		
	}
	@Test(priority=6)
	public void loginMentor() {
		tesobj=new IctInternship(driver);
		tesobj.loginClick();
		tesobj.setEmail(prop.getProperty("MentorEmail"));
		tesobj.setPassword(prop.getProperty("MentorPassword"));
		tesobj.loginSubmit();
		String actualresult=tesobj.getMentorhome();
		Assert.assertEquals(actualresult, AutomationConstants.ExpectedMentorHome);
		
	}
	@Test(priority=7)
	public void viewAllotedprojects() {
		tesobj=new IctInternship(driver);
		tesobj.showButton();
		tesobj.viewAllotedprojectButton();
			
	}
	@Test(priority=8)
	public void submission() {
		tesobj=new IctInternship(driver);
		tesobj.viewStudentsubmissionButton();
		tesobj.setMarks();
		tesobj.setComments(prop.getProperty("Comments"));
		tesobj.updateSubmissionbutton();
		tesobj.deleteSubmissionbutton();
		tesobj.filterDropdown();
		
		
		
	}
	@Test(priority=9)
	public void referenceMaterial() {
		tesobj=new IctInternship(driver);
		tesobj.referenceMaterialbutton();
		tesobj.addReferencematerialButton();
		tesobj.setTitle(prop.getProperty("Title"));
		tesobj.setDescription(prop.getProperty("Description"));
		tesobj.setLink(prop.getProperty("Link"));
		tesobj.addButton();
		tesobj.deleteButton();
		
		
		
	}
}