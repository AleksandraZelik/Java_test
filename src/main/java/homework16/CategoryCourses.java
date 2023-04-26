package homework16;

public enum CategoryCourses {
    CHILDREN("Дитячі курси"), DESIGN("Дизайн"), MANAGEMENT("Менеджмент"), MARKETING("Маркетинг"),
    PROGRAMING("Програмування"), TESTING("Тестування");
    private String name;

    CategoryCourses(String name) {
        this.name = name;
    }
}
