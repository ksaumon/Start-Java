public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Gipsy Danger");
        jaeger1.setMark("Mark-3");
        jaeger1.setHeight(260);
        jaeger1.setWeight(1980);
        jaeger1.setStrength(8);
        jaeger1.setArmor(6);
        jaeger1.setNumberPilots(3);
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
        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("Crimson Typhoon");
        jaeger2.setMark("Mark-4");
        jaeger2.setHeight(250);
        jaeger2.setWeight(1722);
        jaeger2.setStrength(8);
        jaeger2.setArmor(6);
        jaeger2.setNumberPilots(3);
        System.out.println("Название робота " + jaeger2.getModelName());
        System.out.println("Модель " + jaeger2.getMark());
        System.out.println("Высота " + jaeger2.getHeight());
        System.out.println("Вес " + jaeger2.getWeight());
        System.out.println("Сила " + jaeger2.getStrength());
        System.out.println("Броня " + jaeger2.getArmor());
        System.out.println("Количество пилотов " + jaeger2.getNumberPilots());
        jaeger2.move();
        System.out.println(jaeger2.drift());
        jaeger2.attack();
        System.out.println("Схожие характеристики роботов :");
        if(jaeger1.getModelName() == jaeger2.getModelName()) {
            System.out.println("Названия робота ");
        }
        if(jaeger1.getMark() == jaeger2.getMark()) {
            System.out.println("Модель ");
        }
        if(jaeger1.getHeight() == jaeger2.getHeight()) {
            System.out.println("Высота ");
        }
        if(jaeger1.getWeight() == jaeger2.getWeight()) {
            System.out.println("Вес ");
        }
        if(jaeger1.getStrength() == jaeger2.getStrength()) {
            System.out.println("Сила ");
        }
        if(jaeger1.getStrength() == jaeger2.getStrength()) {
            System.out.println("Броня ");
        }
        if(jaeger1.getArmor() == jaeger2.getArmor()){
            System.out.println("Количество пилотов ");
        }
    }
}
