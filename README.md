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
- Automation Tool: RestAssured
  - Tool pre-requisites: Java JDK, Maven, Eclipse
  - Justification: 
