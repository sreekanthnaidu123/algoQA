package stepdefinitions;
    import io.cucumber.java.en.*;
    import workflows.SeleniumWorkFlow;
    import org.junit.Assert;
    import common.Assertion;
    import common.WebBrowserUtil;
    public class AssignProjectplusStepDefinition
	{
        SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
        

             @Then("^verify content project access updated node feature permission in assign project plus as '(.*)'$")			
            public void ThenVerifyContentProjectAccessUpdatedNodeFeaturePermissionInAssignProjectPlusAsprojectAccessUpdatedNodeFeaturePermission(String  _projectAccessUpdatedNodeFeaturePermission)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(_projectAccessUpdatedNodeFeaturePermission,0,"Assign Project plus","Assign Project plus.projectaccessupdatednodefeaturepermissionTextBoxXPATH","XPATH"), "Then verify content project access updated node feature permission in assign project plus as '<project access updated node feature permission>'");
      WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I selected Assign project close in assign project plus$")			
            public void WhenISelectedAssignProjectCloseInAssignProjectPlus()
            {
                workFlow.clickedElement(0,"Assign Project plus","Assign Project plus.AssignprojectcloseButtonXPATH","XPATH");
                
            }
    }