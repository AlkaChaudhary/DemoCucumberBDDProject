Feature: Login to Orange hrm application
@All @Login
Scenario Outline: User should be able to login with valid credentials

Given I navigate to application URL
When I enter username as <someusername> and password as <somepassword>
And I click on Login button
Then User should be able to login based on <expected> login status

Examples:
|someusername|somepassword|expected|
|Alka        |12345       |fail    |
|Admin       |admin123    |pass    |
|test        |87945       |fail    |
