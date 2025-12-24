//Write a Selenium test using TestNG
// Open login page
// Input username/password
// Assert login success
package test.java.tests;

public class LoginTest {
    //define User and password variables
    String username = "testuser";
    String password = "testpassword";

    @Test
    public void testLogin() {
        // Set up WebDriver (Assuming ChromeDriver is set in system properties)
        WebDriver driver = new ChromeDriver();
        try {
            // Open login page
            driver.get("http://example.com/login");

            // Input username
            WebElement usernameField = driver.findElement(By.id("username"));
            usernameField.sendKeys(username);

            // Input password
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys(password);

            // Submit the login form
            WebElement loginButton = driver.findElement(By.id("loginButton"));
            loginButton.click();

            // Assert login success by checking for a logout button or user profile element
            WebElement logoutButton = driver.findElement(By.id("logoutButton"));
            Assert.assertTrue(logoutButton.isDisplayed(), "Login was not successful!");

        } finally {
            // Close the browser
            driver.quit();
        }
    }

}
