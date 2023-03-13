public class Wolf {
    private String gender;
    private String nickName;
    private int weight;
    private int age;
    private String color;

    public String getGender() {
        return gender;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return gender;
    }

    void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if(age > 8) {
            System.out.println(age + " Некорректный возраст");
        } else {
        this.age = age;
        System.out.println("Возраст " + age);
        }
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
    public void walk() {
        System.out.println("walk");
    }

    public void sit() {
        System.out.println("sit down");
    }

    public void run() {
        System.out.println("run");
    }

    public void howl() {
        System.out.println("howl");
    }

    public void hunt() {
        System.out.println("hunt");
    }
}
