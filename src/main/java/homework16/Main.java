package homework16;


import com.codeborne.selenide.Selenide;

public class Main {
    public static void main(String[] args) {

        Selenide.open("https://ithillel.ua/courses/testing");
        TestingPage testPage=new TestingPage();
         testPage.getCourses();
         testPage.getAdditionalCourses();
         testPage.getOpportunities();
         testPage.goToCategory("дитячі курси");

        Selenide.open("https://ithillel.ua/courses/programming");
         ProgrammingPage programmingPage=new ProgrammingPage();
        programmingPage.getCourses();
        programmingPage.getAdditionalCourses();
        programmingPage.getOpportunities();
        programmingPage.goToProgrammingLanguages("Java");



        Selenide.open("https://ithillel.ua/courses/design");
        DesignPage designPage=new DesignPage();
        designPage.getCourses();
        designPage.getOpportunities();
        designPage.goToCategory("тестування");







    }
}
