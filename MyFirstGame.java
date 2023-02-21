public class MyFirstGame {
    public static void main(String[] args) {
        int unknownNumber = 34;
        int userNumber = 1;
        int max = 100;
        int min = 1;
        do {
            if (userNumber > max || unknownNumber > max) {
                System.out.println("Число не входит в полуинтервал ( 0 - 100]");
                break;
            } else if(userNumber < min || unknownNumber < min) {
                System.out.println("Число не входит в полуинтервал ( 0 - 100]");
                break;
            } else if(userNumber < unknownNumber) {
                userNumber = userNumber + 2;
            } else if(userNumber > unknownNumber) {
                userNumber--;
            }else {
                userNumber++;
            }
            if(userNumber > unknownNumber) {
                System.out.println("число " + userNumber + " больше того, что загадал компьютер.");
            } else if(userNumber < unknownNumber) {
                System.out.println("число " + userNumber + " меньше того, что загадал компьютер.");
            } else if (userNumber == unknownNumber) {
                System.out.println("число " + userNumber + " загадал компьютер. \nВы победили!");
            }
        } while (userNumber != unknownNumber);
    }
}