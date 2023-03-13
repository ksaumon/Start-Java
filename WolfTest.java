public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.gender = "man";
        wolf1.nickName = "Richard";
        wolf1.weight = 14;
        wolf1.age = 5;
        wolf1.color = "grey";
        System.out.println("Пол " + wolf1.gender);
        System.out.println("Кличка " + wolf1.nickName);
        System.out.println("Вес " + wolf1.weight);
        System.out.println("Возраст " + wolf1.age);
        System.out.println("Окрас " + wolf1.color);
        wolf1.walk();
        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
    }
}