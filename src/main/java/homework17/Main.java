package homework17;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static homework17.User.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = Stream.generate(() -> new User(
                getRandomName(getRandomGender()),
                        getRandomAge(),
                        getRandomEmail(),
                        getRandomGender()))
                .limit(20)
                .filter(u -> u.getAge() > 18)
                .sorted(Comparator.comparing(User::getName))
                .filter(u -> u.getEmail() != null)
                .toList();


        Map<String, List<String>> genderGroup = users.stream()
                .collect(Collectors.groupingBy(User::getGender,
                        Collectors.mapping(User::getName, Collectors.toList())));

        System.out.println(genderGroup);
    }
}
