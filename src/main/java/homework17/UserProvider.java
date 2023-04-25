package homework17;

import java.util.*;

public class UserProvider {
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
}
