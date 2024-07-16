package TimberExchange.Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver =WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://timber.staging.pellets.supply/login");
        driver.manage().window().maximize();
        driver.close();
	}

	@Test
	public void main() {
		
	}
	
	
	
}
