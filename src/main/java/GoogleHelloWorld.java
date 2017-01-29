import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
public class GoogleHelloWorld
{

    static String driverPath = "C:\\";


    public static WebDriver driver;


    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
        System.out.println("starting selenium web driver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        try{
            Thread.sleep(2000);
        }catch(Exception e){}

        driver.close();
        driver.quit();
    }
}
