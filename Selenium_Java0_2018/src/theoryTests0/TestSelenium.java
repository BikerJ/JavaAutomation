/**
 * 
 */
package theoryTests0;

/**
 * @author Jake Fulford
 *
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;






public class TestSelenium {
	  private static final Logger LOGGER = Logger.getLogger(TestSelenium.class.getName());
	  public static void main(String[] args) throws SecurityException, IOException {
		  
		  
		  LOGGER.info("Logger Name: "+LOGGER.getName());
			
			LOGGER.warning("Can cause ArrayIndexOutOfBoundsException");
			//An array of size 3
			int []a = {1,2,3};
			int index = 4;
			LOGGER.config("index is set to "+index);
			try{
				System.out.println(a[index]);
			}catch(ArrayIndexOutOfBoundsException ex){
				LOGGER.log(Level.SEVERE, "Exception occur", ex);
			}

/**
        // Send simple message
        SlackApi api = new SlackApi("https://hooks.slack.com/services/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");
        api.call(new SlackMessage("my message"));

        // Send simple message with custom name

        api.call(new SlackMessage("JavaBot", "I am running from InteliJ!"));


        // Send simple message in different room

        api.call(new SlackMessage("#general", null, "test to another channel..."));

        // Send simple message in different room with custom name

        api.call(new SlackMessage("#general", "JavaBot", "test to another channel2..."));

        // Send simple message in different room with custom name and tag someone in the message so he will get notified

        api.call(new SlackMessage("#general", "Mafagafo", "Hi @jake : Testing Java API").setLinkNames(true));
*/






        System.setProperty("webdriver.chrome.driver", "D:\\Driver/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/");
        WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");

        WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
        driver.quit();

    }
}