package senaicursos;


import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TesteCurso<webDriver> {
	private webDriver driver;
		
	@Before
	public void abrirNavegador() {
		System.setProperty("webDriver.chrome.driver", "c://arquivos de programa//chromedriver//chromedriver.exe");
		driver new = ChromrDriver();
		driver.manage().window().maximize();
	}
	/*}
	@Test
	public void testeNavegador() {
	   driver.get(https://sp.senai.br/)
		   drive.manage().timeouts().implicitlywait(3, TimeUnit.SECONDS);
		   driver.findElement(By.id("oqEstabuscando")).sendKeys("gestão");
	   driver.findElement(By.className("btnBuscaJavaScript")).click();
	}*/
	
	@Test
	public void testeNavegador() {
		driver.get("https://informatica.sp.senai.br/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("gestão");
		driver.findElement(By.id("Busca1_btnBusca")).click();
	
} 

}	