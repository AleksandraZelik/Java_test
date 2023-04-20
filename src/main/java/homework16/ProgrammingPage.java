package homework16;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;

public class ProgrammingPage extends HillelPage {
    private ElementsCollection additionalCourse=$$x("//*[@id=\"categories\"]/div[3]/div/ul/li[1]/div/div[2]/ul/li/a/div[2]");

    private ElementsCollection programmingLanguages=$$(".subcategories_item");

    public void goToProgrammingLanguages(String category) {
        if (category.equals("Front-end")) {
            programmingLanguages.get(0).click();
        } else if (category.equals("Java")) {
            programmingLanguages.get(1).click();
        } else if (category.equals("PHP")) {
            programmingLanguages.get(2).click();
        } else if (category.equals("Python")) {
            programmingLanguages.get(3).click();
        } else if (category.equals("DevOps")) {
            programmingLanguages.get(4).click();
        } else if (category.equals("Hi-tech")) {
            programmingLanguages.get(5).click();
        } else if (category.equals("C#")){
            programmingLanguages.get(6).click();
        } else {
            System.out.println("Непідтримувана категорія курсів");
        }
    }

    public ElementsCollection getAdditionalCourses() {
        System.out.println("---------------Список додаткових курсів----------------");
        for (SelenideElement cours : additionalCourse) {
            System.out.println(cours.getText());
        }
        return additionalCourse;
    }
    }