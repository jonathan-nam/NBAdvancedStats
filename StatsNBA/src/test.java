import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	private static final int NUM_PLAYERS = 50;
	private static final int NUM_TABLES = 4;
	private static ArrayList <WebElement> players = new ArrayList<>();
	
	public static void main (String [] args) {
		init();
		
	}
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Java Projects\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://stats.nba.com/leaders/");
		
		for (int i = 1; i <= NUM_PLAYERS; i++) {
			WebElement player = 
					browser.findElement(By.xpath(
							"/html/body/main/div[2]/div/div[2]/div/div/nba-stat-table/div[2]/div[1]/table/tbody/tr["
							+ i
							+ "]/td[2]/a"));
			players.add(player);
		}
		
		for (WebElement p: players) {
			System.out.println(p.getText());
		}
	}
	
	public Object[][] getTopPPG() {
		Object[][] topPlayers = new Object[10][10];
		
		
		
		return topPlayers;
	}
}

//XPATH
///html/body/main/div[2]/div/div[2]/div/div/nba-stat-table/div[2]/div[1]/table/tbody/tr[46]/td[2]/a
//1 - /html/body/main/div[2]/div/div[2]/div/div/nba-stat-table/div[2]/div[1]/table/tbody/tr[1]/td[2]/a
//2 - /html/body/main/div[2]/div/div[2]/div/div/nba-stat-table/div[2]/div[1]/table/tbody/tr[2]/td[2]/a
//50 - /html/body/main/div[2]/div/div[2]/div/div/nba-stat-table/div[2]/div[1]/table/tbody/tr[50]/td[2]/a
// 51 - /html/body/main/div[2]/div/div[2]/div/div/nba-stat-table/div[2]/div[1]/table/tbody/tr[51]/td[2]/a
//#per_game_stats > tbody > tr:nth-child(1) > td:nth-child(2)