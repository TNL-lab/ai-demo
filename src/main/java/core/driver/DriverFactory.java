package test.java.tests;

// Factory class to initialize Chrome WebDriver
// Support headless mode
// Singleton pattern
public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver(boolean headless) {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            if (headless) {
                options.addArguments("--headless");
            }
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }   
}
