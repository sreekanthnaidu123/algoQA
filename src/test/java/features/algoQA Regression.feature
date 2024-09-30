Feature: algoQA Regression1
#Regression Type
#Correct Values = true
#Incorrect Values = false
#Illegal Values = false
#Invalid Values = false
#Boundary Values = false
#Edge Cases Values = false

@Node_Feature_Permission
@uida741003086
@set21
@test001
@AssignProject
Scenario Outline: Verify Admin uncheck Node Features Permission for assign user in Assign Project
Given I have access to application
When I clicked SignIn link in sign in
Then verify displayed Login to algoQA in sign in
When I entered Email Address in sign in as '<Email Address>'
And I entered Password in sign in as '<Password>'
And I clicked LogIn Button in sign in
Then verify content User Signed In Successfully in sign in as '<User Signed In Successfully>'
When I click if visible Sign In Popup Close in sign in
Then verify displayed Dashboard Page in home page
When I wait for control visible My Profile in home page
And I selected algoQA in home page
And I wait for control visible Project Explorer Label in project explorer
And I click if visible Search The project in Project explorer Close Icon in project explorer
Then verify displayed Project Explorer Label in project explorer
When I entered Search Project name in project explorer as '<Search Project name1>'
And I wait in seconds for sometime in project explorer as '<for sometime2>'
And I selected Existing Project in project explorer
And I wait in seconds for sometime in project explorer as '<for sometime3>'
And I click if visible Canvas Save highlight popup Close in project explorer
And I wait in seconds for sometime in project explorer as '<for sometime4>'
And I selected Project name 3 dots in project explorer
Then verify displayed Assign Project in project explorer
When I selected Assign Project in project explorer
Then verify displayed Assign Project Page in assign project
And verify displayed Assign Project label in assign project
When I entered Assign Project Search User in assign project as '<Assign Project Search User5>'
Then verify displayed Assign Project Searched user in assign project
When I checked Assign Project Assign checkbox in assign project
Then verify content Project assigned successfully popup in assign project as '<Project assigned successfully popup>'
When I click if visible Assign Project Popup Close in assign project
And I selected Assign Project Searched user in assign project
And I selected Assign Project Access Setting arrow in assign project
Then verify displayed Assign Project Access Settings Page in assign project
And verify displayed Assign Project Node Features Permission in assign project
When I checkingCountofCheckBoxs Assign Project Access Settings checkboxed in assign project as '<Assign Project Access Settings checkboxed>'
And I unchecked Assign Project Node Features Permission CanAdd in assign project
Then verify content project access updated node feature permission in assign project plus as '<project access updated node feature permission>'
When I selected Assign Project Close in assign project
And I selected My Profile in home page
And I selected Logout in my profile
And I selected SignIn link in sign in
And I entered Email Address in sign in as '<Email Address6>'
And I entered Password in sign in as '<Password7>'
And I selected LogIn Button in sign in
Then verify content User Signed In Successfully in sign in as '<User Signed In Successfully8>'
When I click if visible Sign In Popup Close in sign in
Then verify displayed Dashboard Page in home page
When I wait for control visible My Profile in home page
And I selected algoQA in home page
And I wait for control visible Project Explorer Label in project explorer
And I entered Search Project name in project explorer as '<Search Project name9>'
And I wait in seconds for sometime in project explorer as '<for sometime10>'
Then verify displayed Project under Project Explorer in project explorer
When I selected Existing Project in project explorer
And I selected Node in node configuration
And I selected Node Edit in node configuration
And I disabledElement Add Nested Feature is restricted in node configuration
And I mousehover Add Nested Feature is restricted in node configuration
Then verify tooltip You donot have permission to Add Feature in node configuration as '<You donot have permission to Add Feature>'
When I disabledElement Move Feature is restricted in node configuration
And I mousehover Move Feature is restricted in node configuration
Then verify tooltip You donot have permission to Move Control in node configuration as '<You donot have permission to Move Control>'
When I disabledElement Send to other Node is restricted in node configuration
And I mousehover Send to other Node is restricted in node configuration
Then verify tooltip You donot have permission to send Node in node configuration as '<You donot have permission to send Node>'
When I disabledElement Add Nested Feature is restricted in node configuration
And I mousehover Add Nested Feature is restricted in node configuration
Then verify tooltip You donot have permission to Add Feature in node configuration as '<You donot have permission to Add Feature11>'
When I selected Node Configuration Close in node configuration
And I selected Logout in my profile
Then verify content user logged out successfully in sign in as '<user logged out successfully>'
When I selected SignIn link in sign in
Then verify displayed Login to algoQA in sign in
When I entered Email Address in sign in as '<Email Address12>'
And I entered Password in sign in as '<Password13>'
And I selected LogIn Button in sign in
Then verify content User Signed In Successfully in sign in as '<User Signed In Successfully14>'
When I selected algoQA in home page
Then verify displayed Project Explorer Label in project explorer
When I entered Search Project name in project explorer as '<Search Project name15>'
And I wait in seconds for sometime in project explorer as '<for sometime16>'
And I selected Existing Project in project explorer
And I selected Project name 3 dots in project explorer
And I selected Assign Project in project explorer
Then verify displayed Assign Project label in assign project
When I entered Assign Project Search User in assign project as '<Assign Project Search User17>'
Then verify displayed Assign Project Searched user in assign project
When I mousehover Assign Project Searched user in assign project
And I selected AssignProject plus in assign project
And I checked Assign Project Node Features Permission CanAdd in assign project
Then verify content project access updated node feature permission in assign project plus as '<project access updated node feature permission18>'
When I selected Assign project close in assign project plus
And I selected Logout in my profile
Then verify content user logged out successfully in sign in as '<user logged out successfully19>'
When I selected SignIn link in sign in
Then verify displayed Login to algoQA in sign in
When I entered Email Address in sign in as '<Email Address20>'
And I entered Password in sign in as '<Password21>'
And I selected LogIn Button in sign in
Then verify content User Signed In Successfully in sign in as '<User Signed In Successfully22>'
When I selected algoQA in home page
Then verify displayed Project Explorer Label in project explorer
When I entered Search Project name in project explorer as '<Search Project name23>'
And I wait in seconds for sometime in project explorer as '<for sometime24>'
And I selected Existing Project in project explorer
And I selected Node in node configuration
And I selected Node Edit in node configuration
Then verify displayed Node Configuration label in node configuration
And verify displayed Feature Name in node configuration
And verify enabled Add Features in node configuration
And verify enabled Move Feature in node configuration
And verify enabled Send to Other Node in node configuration
And verify enabled Displays control list panel in node configuration
And verify enabled Add Nested Feature in node configuration
When I selected Add Features in node configuration
And I entered Successfully Added Feature popup in node configuration as '<Successfully Added Feature popup>'
And I selected Node Configuration Close in node configuration
And I selected Logout in my profile
Then verify content user logged out successfully in sign in as '<user logged out successfully25>'
When I selected SignIn link in sign in
And I entered Email Address in sign in as '<Email Address26>'
And I entered Password in sign in as '<Password27>'
And I selected LogIn Button in sign in
Then verify content User Signed In Successfully in sign in as '<User Signed In Successfully28>'
When I selected algoQA in home page
Then verify displayed Project Explorer Label in project explorer
When I entered Search Project name in project explorer as '<Search Project name29>'
And I wait in seconds for sometime in project explorer as '<for sometime30>'
And I selected Existing Project in project explorer
And I selected Existing Project in project explorer
And I selected Project name 3 dots in project explorer
And I selected Assign Project in project explorer
Then verify displayed Assign Project label in assign project
When I entered Assign Project Search User in assign project as '<Assign Project Search User31>'
Then verify displayed Assign Project Searched user in assign project
When I mousehover Assign Project Searched user in assign project
And I selected Assign Project UnAssign in assign project
Then verify content Project unassigned successfully popup in assign project as '<Project unassigned successfully popup>'
When I selected Assign Project Close in assign project
And I selected Logout in my profile
And I selected SignIn link in sign in
Then verify displayed Login to algoQA in sign in
When I entered Email Address in sign in as '<Email Address32>'
And I entered Password in sign in as '<Password33>'
And I selected LogIn Button in sign in
Then verify content User Signed In Successfully in sign in as '<User Signed In Successfully34>'
When I selected algoQA in home page
Then verify displayed Project Explorer Label in project explorer
When I entered Search Project name in project explorer as '<Search Project name35>'
And I wait in seconds for sometime in project explorer as '<for sometime36>'
Then verify displayed No Data Found in project explorer
And '<page>' is displayed with '<content>'

Examples:
|SlNo.|Email Address|Password|User Signed In Successfully|Search Project name1|for sometime2|for sometime3|for sometime4|Assign Project Search User5|Project assigned successfully popup|Assign Project Access Settings checkboxed|project access updated node feature permission|Email Address6|Password7|User Signed In Successfully8|Search Project name9|for sometime10|You donot have permission to Add Feature|You donot have permission to Move Control|You donot have permission to send Node|You donot have permission to Add Feature11|user logged out successfully|Email Address12|Password13|User Signed In Successfully14|Search Project name15|for sometime16|Assign Project Search User17|project access updated node feature permission18|user logged out successfully19|Email Address20|Password21|User Signed In Successfully22|Search Project name23|for sometime24|Successfully Added Feature popup|user logged out successfully25|Email Address26|Password27|User Signed In Successfully28|Search Project name29|for sometime30|Assign Project Search User31|Project unassigned successfully popup|Email Address32|Password33|User Signed In Successfully34|Search Project name35|for sometime36|page|content|
|1|EmailAddress1|Password1|UserSignedInSuccessfully1|SearchProjectname1|forsometime1|forsometime1|forsometime1|AssignProjectSearchUser1|Projectassignedsuccessfullypopup1|AssignProjectAccessSettingscheckboxed1|projectaccessupdatednodefeaturepermission1|EmailAddress2|Password2|UserSignedInSuccessfully1|SearchProjectname1|forsometime1|YoudonothavepermissiontoAddFeature1|YoudonothavepermissiontoMoveControl1|YoudonothavepermissiontosendNode1|YoudonothavepermissiontoAddFeature1|userloggedoutsuccessfully1|EmailAddress1|Password1|UserSignedInSuccessfully1|SearchProjectname1|forsometime1|AssignProjectSearchUser1|projectaccessupdatednodefeaturepermission1|userloggedoutsuccessfully1|EmailAddress2|Password2|UserSignedInSuccessfully1|SearchProjectname1|forsometime1|SuccessfullyAddedFeaturepopup1|userloggedoutsuccessfully1|EmailAddress1|Password1|UserSignedInSuccessfully1|SearchProjectname1|forsometime1|AssignProjectSearchUser1|Projectunassignedsuccessfullypopup1|EmailAddress2|Password2|UserSignedInSuccessfully1|SearchProjectname1|forsometime1|AlgoShack|algoQA|


#Total No. of Test Cases : 1

