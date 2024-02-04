## **Specification** ##
- Create a test framework using any language and tool(s) that does the following:
- Visit one or more search engine(s); i.e google, bing, yahoo, etc...
- Submit a search term
- On the results page, take the first returned item and assert it as the expected result.

_While this may seem like a simple test, you should take into consideration the following requirements._
1. The framework when implemented should use industry standard design patterns and principles.
1. The framework should be capable of supporting enterprise level applications.
1. The framework should minimize the presence of code anti-patterns.
1. The framework should be easily extended and/or modified to satisfy changes in requirements.
   
## **Solution** ##
This automation framework incorporates the Singleton design pattern to reduce resource usage,  improve performance, and simplify the code. Also it employs the Page Object model to enhance maintainability, reusability and readability.

<br> If we need to run our test against different environments in the future, 
we can separate property files for each environment, such as config-dev.properties, config-test.properties, and config-prod.properties. Each file will contain key-value pairs representing different configuration properties.

```
url=https://test.bing.com
browser=chrome
```
```
url=https://dev.bing.com
browser=firefox
```
<br>To run Maven in headless mode for cloud-based environments, I configured the Maven Surefire Plugin to run tests in headless mode using the following command:
```
mvn clean test -Dsurefire.headless=true
```
A User navigates to the search engine 
[bing](https://bing.com/) and searches **BMW** in the search window. 
<br>On the results page, it takes the first returned item and assert it as the expected result.



   ![cat](https://myoctocat.com/assets/images/base-octocat.svg)


<a name="top"></a>

[Back to top](#top)

[:arrow_up:](#top)
