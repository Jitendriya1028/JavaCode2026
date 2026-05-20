package AutomationProject.TestAutomation;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LunchBrowser {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		ChromeOptions co = new ChromeOptions();
		co.setBrowserVersion("145");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		
		List<WebElement> links =
				driver.findElements(By.tagName("a"));

				for(WebElement link : links){

				    String url =
				    link.getAttribute("href");

				    HttpURLConnection conn =
				    (HttpURLConnection)
				    new URL(url).openConnection();

				    conn.setRequestMethod("HEAD");

				    conn.connect();

				    int responseCode =
				    conn.getResponseCode();

				    if(responseCode >= 400){

				        System.out.println(url +
				        " is broken");
				    }
				}
	}
}
