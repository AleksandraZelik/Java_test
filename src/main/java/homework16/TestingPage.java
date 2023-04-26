package homework16;

import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$x;

public class TestingPage extends HillelPage {
     ElementsCollection additionalCourses=$$x("//*[@id=\"categories\"]/div[2]/div/ul/li/div/div[2]/ul/li/a/div[2]");
    public ElementsCollection getAdditionalCourses() {
        return additionalCourses;
    }
}
