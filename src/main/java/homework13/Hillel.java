package homework13;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.List;

public class Hillel {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://ithillel.ua/");

        WebElement programmingCourse = driver.findElement(By.cssSelector(".course-cat-bar_icon[alt=\"Програмування\"]"));
        programmingCourse.click();

        WebElement frontendBasicCourse = driver.findElement(By.cssSelector(".block-profession_link[href*='front-end-basic']"));
        frontendBasicCourse.click();

        WebElement lazySectionCoaches = driver.findElement(By.id("lazySectionCoaches"));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", lazySectionCoaches);


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
