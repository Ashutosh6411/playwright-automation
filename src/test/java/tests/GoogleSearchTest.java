package tests;


import base.BaseTest;
import pages.GooglePage;
import utils.ConfigReader;

public class GoogleSearchTest extends BaseTest {

    public static void main(String[] args) {
        GoogleSearchTest test = new GoogleSearchTest();
        test.setup();

        GooglePage google = new GooglePage(page);
        google.open(ConfigReader.get("baseUrl"));
        google.search("Playwright Java Framework");

        test.tearDown();
    }
}

