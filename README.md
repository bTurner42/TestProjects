# TestProjects

## Purpose: To demonstrate to Olo my recommended approach to automating a specified API.

## Requirements: In one of the following languages (C#, javascript, java, ruby, python, f#) develop a suite of automated API tests against the following API endpoints.

The API is defined here https://jsonplaceholder.typicode.com/guide

- GET https://jsonplaceholder.typicode.com/posts
- POST https://jsonplaceholder.typicode.com/posts
- PUT https://jsonplaceholder.typicode.com/posts/{postId}
- DELETE https://jsonplaceholder.typicode.com/posts/{postId}
- POST https://jsonplaceholder.typicode.com/posts/{postId}/comments
- GET https://jsonplaceholder.typicode.com/comments?postId={postId}

Acceptance Criteria: (in order of precedence)

- The code base is well organized, DRY, easily readable and appropriately commented
- The project’s git commit history is well commented and easy to understand.
- The tests are reliable, and can be executed numerous times in a row without failures
- Happy path tests were built for all major endpoints
- Negative path tests were built testing for standard failures
- Tests have detailed logs or reports helping to troubleshoot failures
- Tests can be executed in parallel
- Tests are data driven for maximum coverage

## Architectural Break-down:
- Language Used: Java
  - Justification: This is the native language used for my automated tool of choice. This was also the first coding language I was introduced to and one I've used the least in my career as a whole. It's time for a refreshing challenge!
  
- Test Framework: TestNG
  - TestNG is a next-generation test automation framework for Java taking inspiration from JUnit
  - Extends the JUnit functionality to support a wide range of testing methods such as Unit testing, integration testing, and end-to-end testing.
  - Offers powerful features such as Annotations, parameterization, and Data providers for Data-driven testing, flexible test execution, concurrent testing, and distributed testing.
  - Has some reporting features as well
  
- Automation Framework: RestAssured
  - Justification for Rest Assured: 
    - It removes the need for writing a lot of boilerplate code required to set up an HTTP connection, send a request and receive and parse a response
    - Supports a Gherkin Given/When/Then test notation which is human readable
      - Easy to push for BDD (Business Driven Design) at the project level in this case
        - Bridging the gap between business strategy/requirements and IT solutions
      - Easy/quick translation of business requirements to automated code
        - Both IT and business stakeholders can read and understand what's happening here
    - Easy integration into a continuous integration / continuous delivery setup, especially when combined with a Java testing framework such as JUnit or TestNG
    - A common tool used in industry that I've heard up but never used directly (perfect opportunity to challenge myself by learning something new!)

## Pre-requisites to building automation framework with RestAssured from scratch:
  - Tool pre-requisites: Java JDK, Maven, Eclipse
    - Install Java
    - Download Java Eclipse for Developers: Create folder for workspace + launch Eclipse
    - Create new maven project in Eclipse
      - Add the following dependencies in pom.xml file:
        - Rest Assured
        - TestNG: Built in features like DataProvider are used for Data Driven testing
        - JSON Simple
        - Surefire plugin (for future parallelization) 

## Additional inclusions with commited code
Check under C:\Users\lostboys85\Documents\Projects\Eclipse\RestAssuredAutomation\test-output for the emailable-report
  - This is a nicer readable report for latest test execution of the full suite courtesy of TestNG
  - You can also check out "Index" report
  - Under C:\Users\lostboys85\Documents\Projects\Eclipse\RestAssuredAutomation\test-output\junitreports you can see individual xml reports per test class
  - To make the tests data driven I created a separate class called "TestDataSets" where I can methods for declaring the test data sets. The test classes utilize this via inheritence hence you'll see in those files (Test extends TestDataSets)

##Future Enhancements
- Complete the configuration for to run tests in parallel (ran into some problems with setting up configuration in pom.xml to work with the testNG.xml and sure fire to execute).
- Add additional sad path scenarios: Checking for passing in of invalid data especially for Post endpoints, checking for empty/null values passed in

## Defects/Observations with API
- Included a sad path test to ensure we can't delete an entire collection of resources (posts for example)
- In this case I think the response should return 405 (method not allowed) instead of 404 (not found) - comment made in class file
- Curious as to know if Id and userId should be a GUIDs (hashable) rather than an integer (what it looks like it accepts)
  - Right now I'm seeing 1, 2, 10 for output here and these numbers could be and represent anything that's not necessarily unique to the user

  
