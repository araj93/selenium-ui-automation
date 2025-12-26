
Used AI to generate this READ.md

# Selenium UI Automation Framework (Java)  

A   scalable, maintainable UI automation framework   built using   Java, Selenium WebDriver, TestNG, and Maven  .
Designed with   Page Object Model (POM)  ,   parallel execution  ,   cross-browser support  , and   test grouping (Smoke / Regression)  .

Ideal for   real-world automation projects  ,   CI/CD pipelines  , and   interview demonstrations  .

---

##    Tech Stack  

  🔹   Java 11+  
  🔹   Selenium WebDriver 4  
  🔹   TestNG  
  🔹   Maven  
  🔹   WebDriverManager  
  🔹   Page Object Model (POM)  

---

##    Project Structure  

```text
selenium-ui-automation
 ├── pom.xml
 ├── testng.xml
 ├── README.md
 └── src
     └── test
         └── java
             ├── base
             │   └── BaseTest.java
             ├── pages
             │   └── LoginPage.java
             └── tests
                 └── LoginTest.java
```

---

##    Application Under Test  

   Website:   [https://the-internet.herokuapp.com/login](https://the-internet.herokuapp.com/login)
   Purpose:   Demo login page for UI automation practice

###    Valid Credentials  

```
Username: tomsmith
Password: SuperSecretPassword!
```

---

## ⚙️   Framework Features  

✅   Page Object Model (POM)  
✅   Cross-browser execution   (Chrome & Firefox)
✅   Parallel execution using TestNG  
✅   Test grouping   (Smoke / Regression)
✅   Maven-based execution  
✅   Clean & extensible architecture  

---

## 🧪   Test Scenarios Covered  

  ✅   Valid Login   → Smoke Test
  ❌   Invalid Login   → Regression Test

---

## 🔀   Browser Parameterization  

Browser selection is controlled via   `testng.xml`  :

```xml
<parameter name="browser" value="chrome"/>
```

### 🌍   Supported Browsers  

  `chrome`
  `firefox`

---

## 🧩   Test Groups  

Tests are tagged using   TestNG groups  :

```java
@Test(groups = {"smoke"})
@Test(groups = {"regression"})
```

🎯 This allows:

  Running   only smoke tests  
  Running   full regression suite  
    Selective execution   in CI pipelines

---

## ⚡   Parallel Execution  

Parallel execution is enabled in   `testng.xml`  :

```xml
<suite parallel="tests" thread-count="2">
```

🚀 Benefits:

  Faster execution time
  Simultaneous cross-browser testing
  CI/CD friendly execution

---

## ▶️   How to Run Tests  

### 1️⃣ Run via Maven (  Recommended  )

```bash
mvn clean test
```

### 2️⃣ Run via IDE

  Right-click on `testng.xml`
  Select   Run  

---

## 🧠   Design Decisions  

  🔹   BaseTest   handles WebDriver setup & teardown
  🔹   TestNG XML   controls:

    Browser selection
    Test groups
    Parallel execution
  🔹   No static WebDriver   → Thread-safe execution
  🔹   POM   improves readability & maintainability

---

## 🚧   Pre-Requisites  

  ☑ Java 11+
  ☑ Maven
  ☑ Chrome / Firefox installed
  ☑ Internet access (for WebDriverManager)

---

## 🛠️   Future Enhancements  

🔸 ThreadLocal WebDriver (Selenium Grid ready)
🔸 Allure / Extent reporting
🔸 `config.properties` for environment control
🔸 Jenkins CI pipeline
🔸 Docker + Selenium Grid
🔸 Data-driven testing

---

## 👤   Author  

  Ankur Raj  
💼 QA Automation | Selenium | TestNG | CI/CD

🔗   GitHub:   [https://github.com/araj93](https://github.com/araj93)

---

## ⭐   How to Use  

1️⃣ Clone the repository
2️⃣ Update `testng.xml` as needed
3️⃣ Run `mvn test`
4️⃣ Extend framework with new pages & tests

