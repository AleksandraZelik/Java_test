package homework13;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Hillel {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://ithillel.ua/");

        WebElement programmingCourse = driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/main/section[2]/div/div/div[1]/div/ul/li[1]/a/div/p[2]"));
        programmingCourse.click();

        WebElement frontendBasicCourse = driver.findElement(By.xpath("//*[@id=\"categories\"]/div[3]/div/ul/li[1]/div/div[1]/ul/li[1]/a/div[2]"));
        frontendBasicCourse.click();

        WebElement lazySectionCoaches = driver.findElement(By.id("lazySectionCoaches"));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", lazySectionCoaches);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement button= driver.findElement(By.cssSelector("#coachesShowAllButton"));
        button.click();
        List<WebElement> coachesList = driver.findElements(By.className("coach-card_name"));

        System.out.println("Імена викладачів на курсі Front-End Basic:");
        for (WebElement coaches : coachesList) {
            System.out.println(coaches.getText());
        }
            driver.quit();
        }
    }
