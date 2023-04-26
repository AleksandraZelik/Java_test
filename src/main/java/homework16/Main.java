package homework16;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class Main {
    public static void main(String[] args) {

        Selenide.open("https://ithillel.ua/courses/testing");
        TestingPage testPage = new TestingPage();

        for (SelenideElement course : testPage.getCourses()) {
            System.out.println(course.getText());
        }
        for (SelenideElement course : testPage.getAdditionalCourses()) {
            System.out.println(course.getText());
        }
        for (SelenideElement opportunity : testPage.getOpportunities()) {
            System.out.println(opportunity.getText());
        }
         testPage.goToCategory(CategoryCourses.CHILDREN);

        Selenide.open("https://ithillel.ua/courses/programming");
         ProgrammingPage programmingPage=new ProgrammingPage();

        for (SelenideElement course :  programmingPage.getCourses()) {
            System.out.println(course.getText());
        }
        for (SelenideElement course :  programmingPage.getAdditionalCourses()) {
            System.out.println(course.getText());
        }
        for (SelenideElement course :   programmingPage.getOpportunities()) {
            System.out.println(course.getText());
        }
        programmingPage.goToProgrammingLanguages(ProgrammingLanguage.C_SHARP);


        Selenide.open("https://ithillel.ua/courses/design");
        DesignPage designPage=new DesignPage();
        for (SelenideElement course : designPage.getCourses()) {
            System.out.println(course.getText());
        }
        for (SelenideElement course : designPage.getOpportunities()) {
            System.out.println(course.getText());
        }
        designPage.goToCategory(CategoryCourses.CHILDREN);
    }
}
