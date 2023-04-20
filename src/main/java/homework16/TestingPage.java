package homework16;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;

public class TestingPage extends HillelPage {
    private ElementsCollection additionalCourse=$$x("//*[@id=\"categories\"]/div[2]/div/ul/li/div/div[2]/ul/li/a/div[2]");
    public ElementsCollection getAdditionalCourses() {
        System.out.println("---------------Список додаткових курсів----------------");
        for (SelenideElement cours : additionalCourse) {
            System.out.println(cours.getText());
        }
        return additionalCourse;
    }
}
