package pages;


import com.microsoft.playwright.Page;

public class GooglePage {

    private Page page;

    public GooglePage(Page page) {
        this.page = page;
    }

    public void open(String url) {
        page.navigate(url);
    }

    public void search(String text) {
        page.fill("input[name='q']", text);
        page.keyboard().press("Enter");
    }
}

