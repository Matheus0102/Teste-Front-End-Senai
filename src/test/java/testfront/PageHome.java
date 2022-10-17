package testfront;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageHome {
	@Test
	public void testNavegarPaginaHome() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new  ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.cssSelector("input[title='Pesquisar']")).sendKeys("Senai Mogi Das Cruzes");
		driver.findElement(By.cssSelector("input[title='Pesquisar']")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("a[href='https://mogidascruzes.sp.senai.br/']")).click();
		driver.findElement(By.cssSelector("a[title='Bolsas de Estudo']")).click();
		driver.findElement(By.cssSelector("a[title='POWER BI']")).click();
	}
}
