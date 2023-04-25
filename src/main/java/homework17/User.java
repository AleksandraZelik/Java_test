package homework17;


import java.util.*;

public class User {
    private String name;
    private int age;
    private String email;
    private String gender;

    public User(String name, int age, String email, String gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }
    public static String getRandomGender() {
        List<String> genders = Arrays.asList("male", "female");
        Random random = new Random();
        return genders.get(random.nextInt(genders.size()));
    }
    public static String getRandomName(String gender) {
        Map<String, List<String>> namesMap = new HashMap<>();
        namesMap.put("male", Arrays.asList("John", "Bill", "Bob"));
        namesMap.put("female", Arrays.asList("Clara", "Kate", "Monica"));

        Random random = new Random();
        List<String> names = namesMap.get(gender);
        return names.get(random.nextInt(names.size()));
    }

    public static int getRandomAge() {
        Random random = new Random();
        return random.nextInt(50) + 10;
    }

    public static String getRandomEmail() {
        List<String> domains = Arrays.asList("gmail.com", "yahoo.com", "hotmail.com", "outlook.com");
        Random random = new Random();
        return "user" + random.nextInt(100) + "@" + domains.get(random.nextInt(domains.size()));
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }
}

