package subtask4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(new Skill("java", 10));
        skills.add(new Skill("C++", 10));
        skills.add(new Skill("C++++", 10));

        User user = new User(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.NON_BINARY, skills, "toyoda", 2001, 300);

        System.out.println(user);
    }
}
