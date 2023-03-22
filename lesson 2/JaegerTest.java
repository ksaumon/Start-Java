public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger = new Jaeger();
        jaeger.setModelName("Gipsy Danger");
        jaeger.setMark("Mark-3");
        jaeger.setHeight(260);
        jaeger.setWeight(1980);
        jaeger.setStrength(8);
        jaeger.setArmor(6);
        jaeger.setNumberPilots(3);
        System.out.println("Название робота " + jaeger.getModelName());
        System.out.println("Модель " + jaeger.getMark());
        System.out.println("Высота " + jaeger.getHeight());
        System.out.println("Вес " + jaeger.getWeight());
        System.out.println("Сила " + jaeger.getStrength());
        System.out.println("Броня " + jaeger.getArmor());
        System.out.println("Количество пилотов " + jaeger.getNumberPilots());
        jaeger.move();
        System.out.println(jaeger.drift());
        jaeger.attack();

        Jaeger jaeger1 = new Jaeger("Crimson Typhoon", "Mark-4", 250, 1722, 8, 6, 3);
        System.out.println("Название робота " + jaeger1.getModelName());
        System.out.println("Модель " + jaeger1.getMark());
        System.out.println("Высота " + jaeger1.getHeight());
        System.out.println("Вес " + jaeger1.getWeight());
        System.out.println("Сила " + jaeger1.getStrength());
        System.out.println("Броня " + jaeger1.getArmor());
        System.out.println("Количество пилотов " + jaeger1.getNumberPilots());
        jaeger1.move();
        System.out.println(jaeger1.drift());
        jaeger1.attack();
        jaeger1.block();
        System.out.println("Схожие характеристики роботов :");
        System.out.println("Сила ");
        System.out.println("Броня ");
        System.out.println("Количество пилотов ");
        System.out.println("Схожие действия роботов :");
        jaeger1.move();
        System.out.println(jaeger1.drift());
        jaeger1.attack();
    }
}


