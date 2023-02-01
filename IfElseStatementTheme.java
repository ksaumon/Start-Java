public class IfElseStatementTheme {
 public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");
        int age = 21;
        if (age > 20) {
        System.out.println("Ты совершеннолетний");
        } else {
        System.out.println("Ты подросток");
        }
        boolean malegender = true;
        if(malegender) {
        System.out.println("Ты мужчина");
        } else {
        System.out.println("Ты женщина");
        }
        double tall = 1.65;
        if(tall < 1.80) {
        System.out.println("Ты высокий");
        } else {
        System.out.println("Ты низкий");
        char firstNameLetter = "Макс".charAt(0);
        if(firstNameLetter == 'M') {
        System.out.println("Ты рожден в мае");
        } else if(firstNameLetter == 'I') {
        System.out.println("Ты рожден в июле");
        } else {
        System.out.println("Ты рожден в другие месяцы");
        }
        }

        System.out.println("\n2.Поиск max и min числа");
        int num1 = 1;
        int num2 = 12;
        System.out.println(num1 + " " + num2);
        if(num1 > num2) {
        System.out.println(num1 + " - max " + num2 + " - min ");
        } else {
        System.out.println(num2 + " - max " + num1 + " - min ");
        }
        if(num1 == num2) {
        System.out.println(num1 + " равно " + num2);
        }

        System.out.println("\n3.Проверка числа");
        int num = 7;
        System.out.println(num);
        if(num == 0) {
        System.out.println("Является нулем");
        } else if(num > 0 && num % 2 == 0) {
        System.out.println("положительное четное");
        } else if(num > 0 && num % 2 != 0) {
        System.out.println("положительное нечетное");	
        } else if(num < 0 && num % 2 == 0) {
        System.out.println("Отрицательное четное");
        } else if(num < 0 && num % 2 != 0) {
        System.out.println("отрицательное нечетное");
        }
        
        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int fist = 123;
        int second = 124;
        int hundreds = fist%1000/100;
        int dozens = fist%100/10;
        int units = fist%10;
        int hundreds1 = second%1000/100;
        int dozens1 = second%100/10;
        int units1 = second%10;
        System.out.println(fist + " " + second);
        if(hundreds1 == hundreds) { 
        System.out.println(hundreds1 + " " + hundreds + "\nРавны сотни");
        } if (dozens == dozens1) {
        System.out.println(dozens + " " + dozens1 + "\nРавны десятки");	
        } if(units == units1) {
        System.out.println(units + " " + units1 + "\nРавны единици");
        }

        System.out.println("\n5.Определение символа по его коду");
        char recognition = '\u0057';
        int symbol1 = 92;
        int symbol2 = 117;
        int symbol3 = 00;
        int symbol4 = 57;
        if( symbol1 == '\\') {
        System.out.println('\\' + " " + "не буква и не число");
        } if(symbol2 == 'u') {
        System.out.println('u' + " " + "маленькая буква");
        } if(symbol3 == ' ') {
        System.out.println(' ' + " " + "не буква и не число");
        } if(symbol4 == '9') {
        System.out.println('9' + " " + "число");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");
        int deposit = 300000;
        if(deposit < 100000) {
        System.out.println(deposit + " " + "депозит");
        System.out.println(deposit / 100 * 5 + " " + "5% годовых");
        System.out.println(deposit + (deposit / 100 * 5) + " " + "сумма через год");
        } if(deposit >= 100000 || deposit <= 300000) {
        System.out.println(deposit + " " + "депозит");
        System.out.println(deposit / 100 * 7 + " " + "7% годовых");
        System.out.println(deposit + (deposit / 100 * 7) + " " + "сумма через год");
        } if(deposit >300000) {
        System.out.println(deposit + " " + "депозит");
        System.out.println(deposit / 100 * 10 + " " + "10% годовых");
        System.out.println(deposit + (deposit / 100 * 10) + " " + "сумма через год");
        }
    }
}
