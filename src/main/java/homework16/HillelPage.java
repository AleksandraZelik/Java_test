package homework16;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public abstract class HillelPage {
    protected ElementsCollection courses=$$(".block-profession_list");

    protected ElementsCollection opportunities=$$(".opportunities_list");
    protected ElementsCollection categoriesLink=$$(".categories_link");

    public ElementsCollection getCourses() {
        return courses;
    }

    public ElementsCollection getOpportunities() {
        return opportunities;
    }

    public void goToCategory(CategoryCourses category) {
        SelenideElement course;
        switch (category){
            case PROGRAMING:course =categoriesLink.find(Condition.text("Програмування"));
                break;
            case TESTING:course = categoriesLink.find(Condition.text("Тестування"));
                break;
            case MANAGEMENT:course = categoriesLink.find(Condition.text("Менеджемент"));
                break;
            case MARKETING:course = categoriesLink.find(Condition.text("Маркетинг"));
                break;
            case DESIGN:course = categoriesLink.find(Condition.text("Дизайн"));
                break;
            case CHILDREN:course = categoriesLink.find(Condition.text("Дитячі курси"));
                break;
            default:course = categoriesLink.find(Condition.text("Програмування"));
        }
        course.click();
    }
}







