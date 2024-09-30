package stepdefinitions;
    import io.cucumber.java.en.*;
    import workflows.SeleniumWorkFlow;
    import org.junit.Assert;
    import common.Assertion;
    import common.WebBrowserUtil;
    public class AlgoShackStepDefinition
	{
        SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
        

            @When("^I clicked SignIn link in sign in$")			
            public void WhenIClickedSigninLinkInSignIn()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.SignInlinkButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Login to algoQA in sign in$")			
            public void ThenVerifyDisplayedLoginToAlgoqaInSignIn()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.LogintoalgoQALabelXPATH","XPATH"), "Then verify displayed Login to algoQA in sign in");
                WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I entered Email Address in sign in as '(.*)'$")			
            public void WhenIEnteredEmailAddressInSignInAsemailAddress(String  _emailAddress)
            {
                workFlow.enterText(_emailAddress,0,"AlgoShack","AlgoShack.EmailAddressTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Password in sign in as '(.*)'$")			
            public void WhenIEnteredPasswordInSignInAspassword(String  _password)
            {
                workFlow.enterText(_password,0,"AlgoShack","AlgoShack.PasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I clicked LogIn Button in sign in$")			
            public void WhenIClickedLoginButtonInSignIn()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.LogInButtonButtonXPATH","XPATH");
                
            }

             @Then("^verify content User Signed In Successfully in sign in as '(.*)'$")			
            public void ThenVerifyContentUserSignedInSuccessfullyInSignInAsuserSignedInSuccessfully(String  _userSignedInSuccessfully)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(_userSignedInSuccessfully,0,"AlgoShack","AlgoShack.UserSignedInSuccessfullyTextBoxXPATH","XPATH"), "Then verify content User Signed In Successfully in sign in as '<User Signed In Successfully>'");
      WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I click if visible Sign In Popup Close in sign in$")			
            public void WhenIClickIfVisibleSignInPopupCloseInSignIn()
            {
                workFlow.clickIfVisible(0,"AlgoShack","AlgoShack.SignInPopupCloseButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Dashboard Page in home page$")			
            public void ThenVerifyDisplayedDashboardPageInHomePage()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.DashboardPageLabelXPATH","XPATH"), "Then verify displayed Dashboard Page in home page");
                WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I wait for control visible My Profile in home page$")			
            public void WhenIWaitForControlVisibleMyProfileInHomePage()
            {
                workFlow.waitForControlVisible(0,"AlgoShack","AlgoShack.MyProfileButtonXPATH","XPATH");
                
            }

            @When("^I selected algoQA in home page$")			
            public void WhenISelectedAlgoqaInHomePage()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.algoQAButtonXPATH","XPATH");
                
            }

            @When("^I wait for control visible Project Explorer Label in project explorer$")			
            public void WhenIWaitForControlVisibleProjectExplorerLabelInProjectExplorer()
            {
                workFlow.waitForControlVisible(0,"AlgoShack","AlgoShack.ProjectExplorerLabelButtonXPATH","XPATH");
                
            }

            @When("^I click if visible Search The project in Project explorer Close Icon in project explorer$")			
            public void WhenIClickIfVisibleSearchTheProjectInProjectExplorerCloseIconInProjectExplorer()
            {
                workFlow.clickIfVisible(0,"AlgoShack","AlgoShack.SearchTheprojectinProjectexplorerCloseIconButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Project Explorer Label in project explorer$")			
            public void ThenVerifyDisplayedProjectExplorerLabelInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.ProjectExplorerLabelButtonXPATH","XPATH"), "Then verify displayed Project Explorer Label in project explorer");
                WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I entered Search Project name in project explorer as '(.*)'$")			
            public void WhenIEnteredSearchProjectNameInProjectExplorerAssearchProjectName1(String  _searchProjectName1)
            {
                workFlow.enterText(_searchProjectName1,0,"AlgoShack","AlgoShack.SearchProjectnameTextBoxXPATH","XPATH");
                
            }

            @When("^I wait in seconds for sometime in project explorer as '(.*)'$")			
            public void WhenIWaitInSecondsForSometimeInProjectExplorerAsforSometime2(String  _forSometime2)
            {
                workFlow.waitInSeconds(_forSometime2,0,"AlgoShack","AlgoShack.forsometimeTextBoxXPATH","XPATH");
                
            }

            @When("^I selected Existing Project in project explorer$")			
            public void WhenISelectedExistingProjectInProjectExplorer()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.ExistingProjectButtonXPATH","XPATH");
                
            }

            @When("^I click if visible Canvas Save highlight popup Close in project explorer$")			
            public void WhenIClickIfVisibleCanvasSaveHighlightPopupCloseInProjectExplorer()
            {
                workFlow.clickIfVisible(0,"AlgoShack","AlgoShack.CanvasSavehighlightpopupCloseButtonXPATH","XPATH");
                
            }

            @When("^I selected Project name 3 dots in project explorer$")			
            public void WhenISelectedProjectName3DotsInProjectExplorer()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.Projectname3dotsButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Assign Project in project explorer$")			
            public void ThenVerifyDisplayedAssignProjectInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.AssignProjectButtonXPATH","XPATH"), "Then verify displayed Assign Project in project explorer");
                WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I selected Assign Project in project explorer$")			
            public void WhenISelectedAssignProjectInProjectExplorer()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.AssignProjectButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Assign Project Page in assign project$")			
            public void ThenVerifyDisplayedAssignProjectPageInAssignProject()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.AssignProjectPageButtonXPATH","XPATH"), "Then verify displayed Assign Project Page in assign project");
                WebBrowserUtil.captureScreenshot();
                
            }

             @Then("^verify displayed Assign Project label in assign project$")			
            public void ThenVerifyDisplayedAssignProjectLabelInAssignProject()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.AssignProjectlabelLabelXPATH","XPATH"), "Then verify displayed Assign Project label in assign project");
                WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I entered Assign Project Search User in assign project as '(.*)'$")			
            public void WhenIEnteredAssignProjectSearchUserInAssignProjectAsassignProjectSearchUser5(String  _assignProjectSearchUser5)
            {
                workFlow.enterText(_assignProjectSearchUser5,0,"AlgoShack","AlgoShack.AssignProjectSearchUserTextBoxXPATH","XPATH");
                
            }

             @Then("^verify displayed Assign Project Searched user in assign project$")			
            public void ThenVerifyDisplayedAssignProjectSearchedUserInAssignProject()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.AssignProjectSearcheduserButtonXPATH","XPATH"), "Then verify displayed Assign Project Searched user in assign project");
                WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I checked Assign Project Assign checkbox in assign project$")			
            public void WhenICheckedAssignProjectAssignCheckboxInAssignProject()
            {
                workFlow.checkCheckbox(0,"AlgoShack","AlgoShack.AssignProjectAssigncheckboxCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify content Project assigned successfully popup in assign project as '(.*)'$")			
            public void ThenVerifyContentProjectAssignedSuccessfullyPopupInAssignProjectAsprojectAssignedSuccessfullyPopup(String  _projectAssignedSuccessfullyPopup)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(_projectAssignedSuccessfullyPopup,0,"AlgoShack","AlgoShack.ProjectassignedsuccessfullypopupTextBoxXPATH","XPATH"), "Then verify content Project assigned successfully popup in assign project as '<Project assigned successfully popup>'");
      WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I click if visible Assign Project Popup Close in assign project$")			
            public void WhenIClickIfVisibleAssignProjectPopupCloseInAssignProject()
            {
                workFlow.clickIfVisible(0,"AlgoShack","AlgoShack.AssignProjectPopupCloseButtonXPATH","XPATH");
                
            }

            @When("^I selected Assign Project Searched user in assign project$")			
            public void WhenISelectedAssignProjectSearchedUserInAssignProject()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.AssignProjectSearcheduserButtonXPATH","XPATH");
                
            }

            @When("^I selected Assign Project Access Setting arrow in assign project$")			
            public void WhenISelectedAssignProjectAccessSettingArrowInAssignProject()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.AssignProjectAccessSettingarrowButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Assign Project Access Settings Page in assign project$")			
            public void ThenVerifyDisplayedAssignProjectAccessSettingsPageInAssignProject()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.AssignProjectAccessSettingsPageButtonXPATH","XPATH"), "Then verify displayed Assign Project Access Settings Page in assign project");
                WebBrowserUtil.captureScreenshot();
                
            }

             @Then("^verify displayed Assign Project Node Features Permission in assign project$")			
            public void ThenVerifyDisplayedAssignProjectNodeFeaturesPermissionInAssignProject()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.AssignProjectNodeFeaturesPermissionButtonXPATH","XPATH"), "Then verify displayed Assign Project Node Features Permission in assign project");
                WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I checkingCountofCheckBoxs Assign Project Access Settings checkboxed in assign project as '(.*)'$")			
            public void WhenICheckingcountofcheckboxsAssignProjectAccessSettingsCheckboxedInAssignProjectAsassignProjectAccessSettingsCheckboxed(String  _assignProjectAccessSettingsCheckboxed)
            {
                workFlow.WhenICheckingcountofcheckboxsAssignProjectAccessSettingsCheckboxedInAssignProjectAsassignProjectAccessSettingsCheckboxed(_assignProjectAccessSettingsCheckboxed,0,"AlgoShack","AlgoShack.AssignProjectAccessSettingscheckboxedTextBoxXPATH","XPATH");
                
            }

            @When("^I unchecked Assign Project Node Features Permission CanAdd in assign project$")			
            public void WhenIUncheckedAssignProjectNodeFeaturesPermissionCanaddInAssignProject()
            {
                workFlow.uncheckCheckBox(0,"AlgoShack","AlgoShack.AssignProjectNodeFeaturesPermissionCanAddCheckBoxXPATH","XPATH");
                
            }

            @When("^I selected Assign Project Close in assign project$")			
            public void WhenISelectedAssignProjectCloseInAssignProject()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.AssignProjectCloseButtonXPATH","XPATH");
                
            }

            @When("^I selected My Profile in home page$")			
            public void WhenISelectedMyProfileInHomePage()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.MyProfileButtonXPATH","XPATH");
                
            }

            @When("^I selected Logout in my profile$")			
            public void WhenISelectedLogoutInMyProfile()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.LogoutButtonXPATH","XPATH");
                
            }

            @When("^I selected SignIn link in sign in$")			
            public void WhenISelectedSigninLinkInSignIn()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.SignInlinkButtonXPATH","XPATH");
                
            }

            @When("^I selected LogIn Button in sign in$")			
            public void WhenISelectedLoginButtonInSignIn()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.LogInButtonButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Project under Project Explorer in project explorer$")			
            public void ThenVerifyDisplayedProjectUnderProjectExplorerInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.ProjectunderProjectExplorerTextBoxXPATH","XPATH"), "Then verify displayed Project under Project Explorer in project explorer");
                WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I selected Node in node configuration$")			
            public void WhenISelectedNodeInNodeConfiguration()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.NodeButtonXPATH","XPATH");
                
            }

            @When("^I selected Node Edit in node configuration$")			
            public void WhenISelectedNodeEditInNodeConfiguration()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.NodeEditButtonXPATH","XPATH");
                
            }

            @When("^I disabledElement Add Nested Feature is restricted in node configuration$")			
            public void WhenIDisabledelementAddNestedFeatureIsRestrictedInNodeConfiguration()
            {
                workFlow.WhenIDisabledelementAddNestedFeatureIsRestrictedInNodeConfiguration(0,"AlgoShack","AlgoShack.AddNestedFeatureisrestrictedButtonXPATH","XPATH");
                
            }

            @When("^I mousehover Add Nested Feature is restricted in node configuration$")			
            public void WhenIMousehoverAddNestedFeatureIsRestrictedInNodeConfiguration()
            {
                workFlow.mouseHover(0,"AlgoShack","AlgoShack.AddNestedFeatureisrestrictedButtonXPATH","XPATH");
                
            }

             @Then("^verify tooltip You donot have permission to Add Feature in node configuration as '(.*)'$")			
            public void ThenVerifyTooltipYouDonotHavePermissionToAddFeatureInNodeConfigurationAsyouDonotHavePermissionToAddFeature(String  _youDonotHavePermissionToAddFeature)
            {
                Assertion.IsTrue(workFlow.verifyTooltip(_youDonotHavePermissionToAddFeature,0,"AlgoShack","AlgoShack.YoudonothavepermissiontoAddFeatureTextBoxXPATH","XPATH"), "Then verify tooltip You donot have permission to Add Feature in node configuration as '<You donot have permission to Add Feature>'");
      WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I disabledElement Move Feature is restricted in node configuration$")			
            public void WhenIDisabledelementMoveFeatureIsRestrictedInNodeConfiguration()
            {
                workFlow.WhenIDisabledelementMoveFeatureIsRestrictedInNodeConfiguration(0,"AlgoShack","AlgoShack.MoveFeatureisrestrictedButtonXPATH","XPATH");
                
            }

            @When("^I mousehover Move Feature is restricted in node configuration$")			
            public void WhenIMousehoverMoveFeatureIsRestrictedInNodeConfiguration()
            {
                workFlow.mouseHover(0,"AlgoShack","AlgoShack.MoveFeatureisrestrictedButtonXPATH","XPATH");
                
            }

             @Then("^verify tooltip You donot have permission to Move Control in node configuration as '(.*)'$")			
            public void ThenVerifyTooltipYouDonotHavePermissionToMoveControlInNodeConfigurationAsyouDonotHavePermissionToMoveControl(String  _youDonotHavePermissionToMoveControl)
            {
                Assertion.IsTrue(workFlow.verifyTooltip(_youDonotHavePermissionToMoveControl,0,"AlgoShack","AlgoShack.YoudonothavepermissiontoMoveControlTextBoxXPATH","XPATH"), "Then verify tooltip You donot have permission to Move Control in node configuration as '<You donot have permission to Move Control>'");
      WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I disabledElement Send to other Node is restricted in node configuration$")			
            public void WhenIDisabledelementSendToOtherNodeIsRestrictedInNodeConfiguration()
            {
                workFlow.WhenIDisabledelementSendToOtherNodeIsRestrictedInNodeConfiguration(0,"AlgoShack","AlgoShack.SendtootherNodeisrestrictedButtonXPATH","XPATH");
                
            }

            @When("^I mousehover Send to other Node is restricted in node configuration$")			
            public void WhenIMousehoverSendToOtherNodeIsRestrictedInNodeConfiguration()
            {
                workFlow.mouseHover(0,"AlgoShack","AlgoShack.SendtootherNodeisrestrictedButtonXPATH","XPATH");
                
            }

             @Then("^verify tooltip You donot have permission to send Node in node configuration as '(.*)'$")			
            public void ThenVerifyTooltipYouDonotHavePermissionToSendNodeInNodeConfigurationAsyouDonotHavePermissionToSendNode(String  _youDonotHavePermissionToSendNode)
            {
                Assertion.IsTrue(workFlow.verifyTooltip(_youDonotHavePermissionToSendNode,0,"AlgoShack","AlgoShack.YoudonothavepermissiontosendNodeTextBoxXPATH","XPATH"), "Then verify tooltip You donot have permission to send Node in node configuration as '<You donot have permission to send Node>'");
      WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I selected Node Configuration Close in node configuration$")			
            public void WhenISelectedNodeConfigurationCloseInNodeConfiguration()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.NodeConfigurationCloseButtonXPATH","XPATH");
                
            }

            @When("^I mousehover Assign Project Searched user in assign project$")			
            public void WhenIMousehoverAssignProjectSearchedUserInAssignProject()
            {
                workFlow.mouseHover(0,"AlgoShack","AlgoShack.AssignProjectSearcheduserButtonXPATH","XPATH");
                
            }

            @When("^I checked Assign Project Node Features Permission CanAdd in assign project$")			
            public void WhenICheckedAssignProjectNodeFeaturesPermissionCanaddInAssignProject()
            {
                workFlow.checkCheckbox(0,"AlgoShack","AlgoShack.AssignProjectNodeFeaturesPermissionCanAddCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify displayed Node Configuration label in node configuration$")			
            public void ThenVerifyDisplayedNodeConfigurationLabelInNodeConfiguration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.NodeConfigurationlabelLabelXPATH","XPATH"), "Then verify displayed Node Configuration label in node configuration");
                WebBrowserUtil.captureScreenshot();
                
            }

             @Then("^verify displayed Feature Name in node configuration$")			
            public void ThenVerifyDisplayedFeatureNameInNodeConfiguration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.FeatureNameTextBoxXPATH","XPATH"), "Then verify displayed Feature Name in node configuration");
                WebBrowserUtil.captureScreenshot();
                
            }

             @Then("^verify enabled Add Features in node configuration$")			
            public void ThenVerifyEnabledAddFeaturesInNodeConfiguration()
            {
                Assertion.IsTrue(workFlow.verifyEnabled(0,"AlgoShack","AlgoShack.AddFeaturesButtonXPATH","XPATH"), "Then verify enabled Add Features in node configuration");
                WebBrowserUtil.captureScreenshot();
                
            }

             @Then("^verify enabled Move Feature in node configuration$")			
            public void ThenVerifyEnabledMoveFeatureInNodeConfiguration()
            {
                Assertion.IsTrue(workFlow.verifyEnabled(0,"AlgoShack","AlgoShack.MoveFeatureButtonXPATH","XPATH"), "Then verify enabled Move Feature in node configuration");
                WebBrowserUtil.captureScreenshot();
                
            }

             @Then("^verify enabled Send to Other Node in node configuration$")			
            public void ThenVerifyEnabledSendToOtherNodeInNodeConfiguration()
            {
                Assertion.IsTrue(workFlow.verifyEnabled(0,"AlgoShack","AlgoShack.SendtoOtherNodeButtonXPATH","XPATH"), "Then verify enabled Send to Other Node in node configuration");
                WebBrowserUtil.captureScreenshot();
                
            }

             @Then("^verify enabled Displays control list panel in node configuration$")			
            public void ThenVerifyEnabledDisplaysControlListPanelInNodeConfiguration()
            {
                Assertion.IsTrue(workFlow.verifyEnabled(0,"AlgoShack","AlgoShack.DisplayscontrollistpanelButtonXPATH","XPATH"), "Then verify enabled Displays control list panel in node configuration");
                WebBrowserUtil.captureScreenshot();
                
            }

             @Then("^verify enabled Add Nested Feature in node configuration$")			
            public void ThenVerifyEnabledAddNestedFeatureInNodeConfiguration()
            {
                Assertion.IsTrue(workFlow.verifyEnabled(0,"AlgoShack","AlgoShack.AddNestedFeatureButtonXPATH","XPATH"), "Then verify enabled Add Nested Feature in node configuration");
                WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I selected Add Features in node configuration$")			
            public void WhenISelectedAddFeaturesInNodeConfiguration()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.AddFeaturesButtonXPATH","XPATH");
                
            }

            @When("^I entered Successfully Added Feature popup in node configuration as '(.*)'$")			
            public void WhenIEnteredSuccessfullyAddedFeaturePopupInNodeConfigurationAssuccessfullyAddedFeaturePopup(String  _successfullyAddedFeaturePopup)
            {
                workFlow.enterText(_successfullyAddedFeaturePopup,0,"AlgoShack","AlgoShack.SuccessfullyAddedFeaturepopupTextBoxXPATH","XPATH");
                
            }

            @When("^I selected Assign Project UnAssign in assign project$")			
            public void WhenISelectedAssignProjectUnassignInAssignProject()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.AssignProjectUnAssignButtonXPATH","XPATH");
                
            }

             @Then("^verify content Project unassigned successfully popup in assign project as '(.*)'$")			
            public void ThenVerifyContentProjectUnassignedSuccessfullyPopupInAssignProjectAsprojectUnassignedSuccessfullyPopup(String  _projectUnassignedSuccessfullyPopup)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(_projectUnassignedSuccessfullyPopup,0,"AlgoShack","AlgoShack.ProjectunassignedsuccessfullypopupTextBoxXPATH","XPATH"), "Then verify content Project unassigned successfully popup in assign project as '<Project unassigned successfully popup>'");
      WebBrowserUtil.captureScreenshot();
                
            }

             @Then("^verify displayed No Data Found in project explorer$")			
            public void ThenVerifyDisplayedNoDataFoundInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.NoDataFoundLabelXPATH","XPATH"), "Then verify displayed No Data Found in project explorer");
                WebBrowserUtil.captureScreenshot();
                
            }

             @Then("^'(.*)' is displayed with '(.*)'$")			
            public void ThenpageIsDisplayedWithcontent(String  _page, String _content)
            {
                Assertion.IsTrue(workFlow.VerifyDefaultpageIsdisplayed(_page), "Then '<page>' is displayed with '<content>'");
                Assertion.IsTrue(workFlow.VerifymessageIsDisplayed(_content), "");;
                //Assertion.assertAll();
            }
    }