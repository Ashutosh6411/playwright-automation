package com.ashu.playwright_automation;



import com.microsoft.playwright.*;

public class ExampleTest {
    public static void main(String[] args) {
        // Create Playwright instance
        try (Playwright playwright = Playwright.create()) {

            // Launch browser
            Browser browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false)
            );

            // Create a new page test
            BrowserContext context = browser.newContext();
            Page page = context.newPage();

            // Go to Google
            page.navigate("https://www.google.com");

            // Type something into the search box
            page.fill("input[name='q']", "Playwright Java automation");

            // Wait 3 seconds so you can see it
            page.waitForTimeout(3000);

            // Close browser
            browser.close();
        }
    }
}


