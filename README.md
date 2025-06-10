# Selenium Login Test Automation

## Overview
This project contains automated tests for the login functionality of [The Internet Herokuapp](https://the-internet.herokuapp.com/login) using Selenium WebDriver with Java and TestNG framework.

## Tests Included
- **loginTest**: Tests login with correct username and password, then logs out.
- **wrongUsernameTest**: Tests login with incorrect username and correct password.
- **wrongPasswordTest**: Tests login with correct username and incorrect password.
- **wrongCredentialsTest**: Tests login with both username and password incorrect.

## Prerequisites
- Java JDK installed (version 8 or above recommended)
- Maven or your preferred build tool (optional but recommended)
- Chrome browser installed
- ChromeDriver executable matching your Chrome version ([download here](https://chromedriver.chromium.org/downloads))
- Selenium WebDriver and TestNG dependencies added to your project

## Setup Instructions

1. **Clone the repository** (or copy your project files).
2. Add ChromeDriver or specify the path in your code using:
   ```java
   WebDriver driver = new ChromeDriver();
   
## Add dependencies to your pom.xml if using Maven:
```java
    <dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.x.x</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.x.x</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```
## Run tests using your IDE's TestNG runner or command line:
```java
    mvn test
```

### How It Works?
- Each test opens a new Chrome browser instance.

- Navigates to the login page.

- Inputs credentials and submits the login form.

- For successful login, it clicks the logout button.

- Closes the browser.

### License
This project is open-source and free to use.

Let me know if you want me to generate it as a downloadable file or add anything else!
