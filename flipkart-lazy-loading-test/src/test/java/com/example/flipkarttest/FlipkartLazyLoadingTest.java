package com.example.flipkarttest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class FlipkartLazyLoadingTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jadha\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // Configure Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        // Set Chrome capabilities
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        // Initialize ChromeDriver
        driver = new ChromeDriver(capabilities);
    }

    @Test
    public void testLazyLoading() {
        // Navigate to the Flipkart website
        driver.get("https://www.flipkart.com/");

        // Close the login popup if present (you may need to update this selector based on the actual popup)
        try {
            WebElement closeButton = driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z"));
            if (closeButton.isDisplayed()) {
                closeButton.click();
            }
        } catch (Exception e) {
            // The popup close button may not be present, so just ignore the exception
        }

        // Scroll down to the end of the page to trigger lazy loading of products
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        // Add a wait here to allow the page to load and the lazy loading button to become visible
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement lazyLoadButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div._2doB4z button")));
            lazyLoadButton.click();
        } catch (Exception e) {
            // If the button is not found, it means lazy loading is not available or the selector has changed
            // You may want to handle this case accordingly, such as logging a message or failing the test gracefully
            System.out.println("Lazy loading button not found or not available on this page.");
        }

        // Get all product images on the page
        List<WebElement> productImages = driver.findElements(By.cssSelector("img[src*='flipkart.com']"));

        // Check if the images are loaded and visible till the screen height only
        long screenHeight = (long) ((JavascriptExecutor) driver).executeScript("return window.innerHeight;");
        for (WebElement image : productImages) {
            Assert.assertTrue(image.isDisplayed(), "Image is not visible on the screen.");
            long imageBottom = (long) ((JavascriptExecutor) driver).executeScript(
                    "return arguments[0].getBoundingClientRect().bottom;", image);
            Assert.assertTrue(imageBottom <= screenHeight, "Image extends beyond the screen height.");
        }
        try {
            Thread.sleep(100000); // Add a delay of 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() {
        // Close the browser after the test
        driver.quit();
    }
}
