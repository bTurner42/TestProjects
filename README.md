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
- Automation Framework: RestAssured
  - Tool pre-requisites: Java JDK, Maven, Eclipse
  - Test Framework: JUnit
  - Justification (Why RestAssured): 
    - It removes the need for writing a lot of boilerplate code required to set up an HTTP connection, send a request and receive and parse a response
    - Supports a Gherkin Given/When/Then test notation which is human readable
      - Easy to push for BDD (Business Driven Design) at the project level in this case
        - Bridging the gap between business strategy/requirements and IT solutions
      - Easy/quick translation of business requirements to automated code
        - Both IT and business stakeholders can read and understand what's happening here
    - Easy integration into a continuous integration / continuous delivery setup, especially when combined with a Java testing framework such as JUnit or TestNG
    - A common tool used in industry that I've heard up but never used directly (perfect opportunity to challenge myself by learning something new!)
