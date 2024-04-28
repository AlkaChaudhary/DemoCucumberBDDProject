
![Screenshot 2024-04-28 at 14 23 50](https://github.com/AlkaChaudhary/DemoCucumberBDDProject/assets/87438786/26b9dbe7-ddc4-4921-b467-22c49ccf6a8a)


# DemoCucumberBDDProject
Created CucumberBDDProject using Selenium with Java
## Prerequisites for Cucumber and Selenium Setup
- Install Java.
- Install Eclipse IDE for Java.
- Install Maven.
- Install Selenium Webdriver.
- Install JUnit.
- Install Cucumber.

## Dependencies required
- Add dependency for Cucumber-Java.
- Add dependency for Cucumber-JUnit.
- Add dependency for Junit.
- Add dependency for testng.
- Add dependency for selenium chrome driver.

## BDD Cucumber FrameWork Diagram

![Screenshot 2024-04-28 at 14 21 14](https://github.com/AlkaChaudhary/DemoCucumberBDDProject/assets/87438786/af2f7936-9d91-4eed-9463-11d86dd4d980)

## Steps to be followed
Step1 Create features as Package and create the feature files(Filename.feature) inside it

Step2 Feature file has to to be form of Given, When and Then statements which is defined by business user.

Step3 create runner as package and create the runner file(Filename.java) inside it.

Step4 In runner need to define path of plugins, path of feature, path of glue(Step Definition)

Step5 create stepDefinition package and create test cases which defineded the steps followed in each instruction of Given, When and Then

Step6 Given instruction has steps like navigate to the application url

Step7 When instruction has steps like enter usename and password.

Step8 Then instruction has steps like assering that user is able to Login
