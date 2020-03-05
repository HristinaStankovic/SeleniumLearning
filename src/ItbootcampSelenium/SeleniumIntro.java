package ItbootcampSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chromedriver.exe");
//System je klasa koja postoji u javi,setProperty je metoda. Imena klasa i projekata se uvek pisu velikim slovom.
    	WebDriver driver = new ChromeDriver();//Napravili smo objekat (sablonska sintaksa).
//i drajver je klasa koja sadrzi mnogo metoda.
    	driver.manage().window().maximize();
		driver.get("https://google.com/");	 //ove tri linije koda su basic,uvek se pisu.
		//povecavanje prozora na max
//webDrive-manage-metode-kod koji se pokrece
//navigat
		driver.navigate().to("https://www.youtube.com/channel/UCWv10Q9JJ0ztqSTSs7GRxaw");
		driver.navigate().back();
		driver.navigate().forward();
		driver.findElement(By.id("search")).sendKeys("Sport");
		driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
		//driver.findElement(By.id("search-icon-legacy")).click();
		
		
	}
}