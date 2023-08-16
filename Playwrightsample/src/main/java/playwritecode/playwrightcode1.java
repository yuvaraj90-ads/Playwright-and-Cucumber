package playwritecode;

import com.microsoft.playwright.Browser;
//import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
//import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class playwrightcode1 {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		LaunchOptions ip = new LaunchOptions();
		ip.setChannel("chrome");
		ip.setHeadless(false);
		Browser browser = playwright.chromium().launch(ip);
		Page page = browser.newPage();
		 page.navigate("https://google.com");
	      page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Sign In")).click();
	      page.getByPlaceholder("Email").click();
	      page.getByPlaceholder("Email").fill("gokul.mca2023@gmail.com");
	      page.getByPlaceholder("Password").click();
	      page.getByPlaceholder("Password").fill("**************");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();		
//		browser.close();
//		browserContext.close();
		playwright.close();
		
	}
}
