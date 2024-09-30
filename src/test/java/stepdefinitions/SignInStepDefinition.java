package stepdefinitions;
    import io.cucumber.java.en.*;
    import workflows.SeleniumWorkFlow;
    import org.junit.Assert;
    import common.Assertion;
    import common.WebBrowserUtil;
    public class SignInStepDefinition
	{
        SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
        

             @Then("^verify content user logged out successfully in sign in as '(.*)'$")			
            public void ThenVerifyContentUserLoggedOutSuccessfullyInSignInAsuserLoggedOutSuccessfully(String  _userLoggedOutSuccessfully)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(_userLoggedOutSuccessfully,0,"Sign In","Sign In.userloggedoutsuccessfullyTextBoxXPATH","XPATH"), "Then verify content user logged out successfully in sign in as '<user logged out successfully>'");
      WebBrowserUtil.captureScreenshot();
                
            }
    }