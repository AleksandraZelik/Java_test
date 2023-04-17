package homework14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://ithillel.ua/ru/courses/testing");
        TestingCoursesPage page=new TestingCoursesPage(driver);
        page.getCourses();
        page.getAdditionalCourses();
        page.getOpportunities();
        page.goToCategory("дизайн");
        driver.quit();
    }
}
