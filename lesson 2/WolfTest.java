import java.io.File;
public class WolfTest {
    public static void main(String[] args) {
        String path = "C:\\Users\\semen\\Desktop\\start java\\Wolf.java";
        File file = new File(path);
        Wolf wolf = new Wolf();
        wolf.gender = "man";
        wolf.nickName = "Richard";
        wolf.weight = 14;
        wolf.age = 5;
        wolf.color =  "grey";
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
        System.out.println("Пол " + wolf.gender + " Кличка " + wolf.nickName + " Вес " + wolf.weight
                + " Возраст " + wolf.age + " Окрас " + wolf.color);
    }
}
