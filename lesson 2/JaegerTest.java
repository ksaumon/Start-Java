public class JaegerTest {
    public static void main(String[] args) {
        Jaeger1 jaeger1 = new Jaeger1();
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
        Jaeger2 jaeger2 = new Jaeger2("Crimson Typhoon", "Mark-4", 250, 1722, 8, 6, 3);
        System.out.println("Название робота " + jaeger2.modelName);
        System.out.println("Модель " + jaeger2.mark);
        System.out.println("Высота " + jaeger2.height);
        System.out.println("Вес " + jaeger2.weight);
        System.out.println("Сила " + jaeger2.strength);
        System.out.println("Броня " + jaeger2.armor);
        System.out.println("Количество пилотов " +jaeger2.numberPilots);
        jaeger2.move();
        System.out.println(jaeger2.drift());
        jaeger2.attack();
        jaeger2.block();
        System.out.println("Схожие характеристики роботов :");
        if(jaeger1.getModelName() == jaeger2.modelName) {
            System.out.println("Названия робота ");
        }
        if(jaeger1.getMark() == jaeger2.mark) {
            System.out.println("Модель ");
        }
        if(jaeger1.getHeight() == jaeger2.height) {
            System.out.println("Высота ");
        }
        if(jaeger1.getWeight() == jaeger2.weight) {
            System.out.println("Вес ");
        }
        if(jaeger1.getStrength() == jaeger2.strength) {
            System.out.println("Сила ");
        }
        if(jaeger1.getArmor() == jaeger2.armor) {
            System.out.println("Броня ");
        }
        if(jaeger1.getNumberPilots() == jaeger2.numberPilots) {
            System.out.println("Количество пилотов ");
        }
    }
}

class Jaeger1 {
    private String modelName;
    private String mark;
    private float height;
    private float weight;
    private int strength;
    private int armor;
    private int numberPilots;

    public String getModelName() {
        return modelName;
    }

    public void setModelName( String modelName ) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark( String mark ) {
        this.mark = mark;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight( float height ) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight( float weight ) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength( int strength ) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor( int armor ) {
        this.armor = armor;
    }

    public int getNumberPilots() {
        return numberPilots;
    }

    public void setNumberPilots( int numberPilots ) {
        this.numberPilots = numberPilots;
    }

    public void move() {
        System.out.println("moving");
    }

    public boolean drift() {
        return true;
    }

    public void attack() {
        System.out.println("damage");
    }
}

class Jaeger2 {
    String modelName;
    String mark;
    float height;
    float weight;
    int strength;
    int armor;
    int numberPilots;

    public Jaeger2(String modelName, String mark, float height, float weight,
                           int strength, int armor, int numberPilots ) {
        this.modelName = modelName;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
        this.numberPilots = numberPilots;
    }

    public void move() {
        System.out.println("moving");
    }

    public boolean drift() {
        return true;
    }

    public void block() {
        System.out.println("repulse");
    }

    public void attack() {
        System.out.println("damage");
    }
}