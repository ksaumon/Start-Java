import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class WolfTest {
    public static void main(String[] args) {
        File file = new File("Wolf.java");
        Wolf wolf1 = new Wolf();
        wolf1.gender;
        wolf1.nickName;
        wolf1.weight;
        wolf1.age;
        wolf1.color;
        wolf1.walk();
        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
        System.out.println("Пол " + wolf1.gender + " Кличка " + wolf1.nickName + " Вес " + wolf1.weight
                + " Возраст " + wolf1.age + " Окрас " + wolf1.color);
    }
}
