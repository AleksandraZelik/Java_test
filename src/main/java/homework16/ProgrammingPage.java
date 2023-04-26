package homework16;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;

public class ProgrammingPage extends HillelPage {
    private ElementsCollection additionalCourse = $$x("//*[@id=\"categories\"]/div[3]/div/ul/li[1]/div/div[2]/ul/li/a/div[2]");

    private ElementsCollection programmingLanguagesList = $$(".subcategories_item");

    public void goToProgrammingLanguages(ProgrammingLanguage language) {
        SelenideElement programLanguage;
        switch (language) {
            case FRONTEND:
                programLanguage = programmingLanguagesList.find(Condition.id("front-end"));
                break;
            case JAVA:
                programLanguage = programmingLanguagesList.find(Condition.id("java"));
                break;
            case PHP:
                programLanguage = programmingLanguagesList.find(Condition.id("php"));
                break;
            case PYTHON:
                programLanguage = programmingLanguagesList.find(Condition.id("python"));
                break;
            case DEVOPS:
                programLanguage = programmingLanguagesList.find(Condition.id("devops"));
                break;
            case HI_TECH:
                programLanguage = programmingLanguagesList.find(Condition.id("hi-tech"));
            case C_SHARP:
                programLanguage = programmingLanguagesList.find(Condition.id("c-sharp"));
                break;
            default:
                programLanguage = programmingLanguagesList.find(Condition.id("front-end"));
                programLanguage.click();
        }
    }
    public ElementsCollection getAdditionalCourses() {
        return additionalCourse;
    }
}