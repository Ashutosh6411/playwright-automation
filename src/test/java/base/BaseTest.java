package base;

import com.microsoft.playwright.*;
import utils.ConfigReader;

public class BaseTest {

    protected static Playwright playwright;
    protected static Browser browser;
    protected static BrowserContext context;
    protected static Page page;

    public void setup() {
        playwright = Playwright.create();

        String browserName = ConfigReader.get("browser");

        switch (browserName) {
            case "firefox":
                browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "webkit":
                browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            default:
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        }

        context = browser.newContext();
        page = context.newPage();
    }
//test
    public void tearDown() {
        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }
}
