package homework16;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public abstract class HillelPage {
    protected ElementsCollection courses=$$(".block-profession_list");

    protected ElementsCollection opportunities=$$(".opportunities_list");

    protected SelenideElement programmingCategory=$$(".categories_link").get(0);
    protected SelenideElement testingCategory=$$(".categories_link").get(1);
    protected SelenideElement managementCategory=$$(".categories_link").get(2);
    protected SelenideElement marketingCategory=$$(".categories_link").get(3);
    protected SelenideElement designCategory=$$(".categories_link").get(4);
    protected SelenideElement kidsCourseCategory=$$(".categories_link").get(5);

    public ElementsCollection getCourses() {
        System.out.println("--------------Список основних курсів-----------------");
        for (SelenideElement cours : courses) {
            System.out.println(cours.getText());
        }
        return courses;
    }

    public ElementsCollection getOpportunities() {
        System.out.println("---------------Чому варто..----------------");
        for (SelenideElement opportunity : opportunities) {
            System.out.println(opportunity.getText());
        }
        return opportunities;
    }

    public void goToCategory(String category) {
        if (category.equals("програмування")) {
            programmingCategory.click();
        } else if (category.equals("тестування")) {
            testingCategory.click();
        } else if (category.equals("менеджемент")) {
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







