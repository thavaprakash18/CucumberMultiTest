package com.makeMyTrip.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripBase {

	public static WebDriver openBrowser(WebDriver wd, String browser){
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			wd = new ChromeDriver();
		}else if (browser.equals("firefox")) {
		    WebDriverManager.firefoxdriver().setup();
		    wd=new FirefoxDriver();
		}
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return wd;
	}
    public static void loadUrl(WebDriver wd,String url){
		wd.get(url);
	}
	
	
	
	
	
	
	
}
