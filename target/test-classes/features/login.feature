Feature: Login to Retail Website

#each feature file starts with Feature keyword and name for feature file
#Each scenario starts with Scenario keyword and : then name of scenario 
#Given is used for precondition 
#When is used for an action
#And is used for action step following When keyword
#Then is used for expected result and writing assertions
#Scenario runs one with provided data
#Scenario outline will run same scenario with multiple set of data and 
#we use Examples keyword to store the data under it 
# we can write same step in times as long as they are the same (case sensitive,
# and no extra space) but in step Definition we should have only one step 
#associated with this step.


@smokeTest  @Regression  @endtoendTesting
Scenario: Retail website Login test
Given  user is on Retail website
When user  click on Myaccount
And user click on login option
And user enter username '' and password ''
And user click on Login button
Then user should be logged in to MyAccount dashboard

@endtoendTesting
Scenario Outline: Retail Website Login test with multiple accounts
Given  user is on Retail website
When user  click on MyAcoount
And user click on login option
And user enter username '<userName>' and password '<password>'
And user click on Login button
Then user should be logged in to MyAcount dashboard

Examples:
|userName|password|
|hawks@tekschool.us|hawks|
|ulmay2017@gmail.com|1256620|
|falcons@tekchool.us|falcons|





