package homework14;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TestingCoursesPage {
    private WebDriver driver;
    @FindBy(xpath = "/html/body/div[1]/main/section[1]/div[2]/div/ul/li/div/div[1]")
    private List<WebElement> testingCourses;

    @FindBy(xpath =" /html/body/div[1]/main/section[1]/div[2]/div/ul/li/div/div[2]")
    private List<WebElement> additionalCourse;

    @FindBy(className="opportunities_list")
    private List<WebElement> opportunities;

    @FindBy(xpath="/html/body/div[1]/main/section[1]/div[1]/div/ul/li[1]/a")
    private WebElement programmingCategory;

    @FindBy(xpath = "/html/body/div[1]/main/section[1]/div[1]/div/ul/li[3]/a")
    private WebElement managementCategory;

    @FindBy(xpath = "/html/body/div[1]/main/section[1]/div[1]/div/ul/li[4]/a")
    private WebElement marketingCategory;
    @FindBy(xpath = "/html/body/div[1]/main/section[1]/div[1]/div/ul/li[2]/a")
    private WebElement testingCategory;
    @FindBy(xpath = "/html/body/div[1]/main/section[1]/div[1]/div/ul/li[5]/a")
    private WebElement designCategory;
    @FindBy(xpath = "/html/body/div[1]/main/section[1]/div[1]/div/ul/li[6]/a")
    private WebElement kidsCourseCategory;

    public TestingCoursesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getCourses() {
        System.out.println("--------------Список основних курсів-----------------");
             for (WebElement courses : testingCourses) {
                System.out.println(courses.getText());
            }
        return testingCourses;
    }

    public List<WebElement> getAdditionalCourses() {
        System.out.println("---------------Список додаткових курсів----------------");
            for (WebElement courses : additionalCourse) {
                System.out.println(courses.getText());
            }
        return additionalCourse;
    }
    public  List<WebElement> getOpportunities() {

        System.out.println("---------------Чому варто стати тестувальником?----------------");
            for (WebElement opportunity : opportunities) {
                System.out.println(opportunity.getText());
            }
        return opportunities;
    }
    public void goToCategory(String category) {
        if (category.equals("програмування")) {
            programmingCategory.click();
        } else if (category.equals("тестування")) {
            testingCategory.click();
        } else if (category.equals("менеджмент")) {
            managementCategory.click();
        } else if (category.equals("маркетинг")) {
            marketingCategory.click();
        } else if (category.equals("дизайн")) {
            designCategory.click();
        } else if (category.equals("дитячі курси")) {
            kidsCourseCategory.click();
        } else {
            System.out.println("Непідтримувана категорія курсів");
        }
    }
}
