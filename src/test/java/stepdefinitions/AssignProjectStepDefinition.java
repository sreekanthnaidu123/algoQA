package stepdefinitions;
    import io.cucumber.java.en.*;
    import workflows.SeleniumWorkFlow;
    import org.junit.Assert;
    import common.Assertion;
    import common.WebBrowserUtil;
    public class AssignProjectStepDefinition
	{
        SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
        

            @When("^I selected AssignProject plus in assign project$")			
            public void WhenISelectedAssignprojectPlusInAssignProject()
            {
                workFlow.clickedElement(0,"Assign Project","Assign Project.AssignProjectplusButtonXPATH","XPATH");
                
            }
    }