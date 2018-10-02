package www.prueba.com.Robots;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robots {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		BufferedImage pantalla = null;
		{
			try {
				Robot robot = new Robot();
				pantalla = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
				File file = new File("C:\\captura.jpg");
				ImageIO.write(pantalla, "jpg", file);
				
				robot.mouseMove(300, 400);
				
				robot.keyPress(KeyEvent.VK_D);
				Thread.sleep(500);
				robot.keyPress(KeyEvent.VK_T);
				Thread.sleep(500);
				robot.keyPress(KeyEvent.VK_P);
				Thread.sleep(500);
				robot.keyPress(KeyEvent.VK_I);
				Thread.sleep(500);
				robot.keyPress(KeyEvent.VK_N);
				Thread.sleep(500);
				robot.keyPress(KeyEvent.VK_E);
				Thread.sleep(500);
				robot.keyPress(KeyEvent.VK_D);
				Thread.sleep(500);

			} catch (Exception e) {
				e.printStackTrace();

				// robot.keyPress(KeyEvent.VK_SPACE);

				WebElement buscar = driver.findElement(By.name("btnK"));
				buscar.click();

				// robot.createScreenCapture(new
				// Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
				// File file = new
				// File(System.getProperty("home/usuario/pantalla.png") +
				// File.separator + "pantalla.png");
				// ImageIO.write(pantalla, "png", file);

			}
		}
		Thread.sleep(500);

		driver.quit();
		driver.close();
	}

}
