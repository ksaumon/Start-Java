public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Перевод псевдокода на язык Java");
        int age = 21;
        if (age > 20) {
            System.out.println("Ты совершеннолетний");
        } else {
            System.out.println("Ты подросток");
        }

        boolean maleGender = true;
        if(maleGender) {
            System.out.println("Ты мужчина");
        } else {
            System.out.println("Ты женщина");
        }

        double height = 1.65;
        if(height < 1.80) {
            System.out.println("Ты высокий");
        } else {
            System.out.println("Ты низкий");
        }

        char firstNameLetter = "Макс".charAt(0);
        if(firstNameLetter == 'M') {
            System.out.println("Ты рожден в мае");
        } else if(firstNameLetter == 'I') {
            System.out.println("Ты рожден в июле");
        } else {
            System.out.println("Ты рожден в сентябре");
        }

        System.out.println("\n2.Поиск max и min числа");
        int num1 = 1;
        int num2 = 12;
        System.out.println(num1 + " " + num2);
        if(num1 == num2) {
            System.out.println(num1 + " равно " + num2);
        } else if(num1 < num2) {
            System.out.println(num1 + " - min " + num2 + " - max");
        } else {
            System.out.println(num1 + " - max " + num2 + " - min");
        }

        System.out.println("\n3.Проверка числа");
        int num = 6;
        System.out.println(num);
        if(num == 0) {
            System.out.println("Является нулем");
        } else {
        if(num % 2 != 0) {
            System.out.println("нечетное");
        } else {
            System.out.println("четное");
        } if(num > 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
        }
        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int number1 = 323;
        int number2 = 323;
        int hundreds = number1 / 100;
        int tens = number1 % 100 / 10;
        int ones = number1 % 10;
        int hundreds1 = number2 / 100;
        int tens1 = number2 % 100 / 10;
        int ones1 = number2 % 10;
        System.out.println(number1 + " " + number2);
        if(hundreds != hundreds1 && tens != tens1 && ones != ones1) {
            System.out.println("равных цифр нет");
        } else {
        if(hundreds1 == hundreds & tens == tens1 & ones == ones1) {
            System.out.println(hundreds1 + " " + hundreds + ";" + tens + " " + tens1
                 + ";"  + ones + " " + ones1 + "\nравны сотни  равны десятки  равны единицы");
        } else if(hundreds1 == hundreds & tens == tens1) {
            System.out.println(hundreds1 + " " + hundreds + ";" + tens + " " + tens1
                 + "\nравны сотни  равны десятки");
        }else if(hundreds1 == hundreds & ones == ones1) {
            System.out.println(hundreds1 + " " + hundreds + ";" + ones + " "
                 + ones1 + "\nравны сотни  равны единицы");
        } else if(tens == tens1 && ones == ones1) {
            System.out.println(tens + " " + tens1 + ";"  
                 + ones + " " + ones1 + "\nравны десятки  равны единицы");
        } else if(tens == tens1) {
            System.out.println(tens + " " + tens1 + "\nравны десятки");
        } else if(ones == ones1) {
            System.out.println(ones + " " + ones1 + "\nравны единицы");
        } else if(hundreds1 == hundreds) {
            System.out.println(hundreds1 + " " + hundreds + ";" + "\nравны сотни ");
        }
        }

        System.out.println("\n5.Определение символа по его коду");
        char symbolChar = 'a';
        if(symbolChar == 'Q' || symbolChar == 'W' || symbolChar == 'E' || symbolChar == 'R' ||
                   symbolChar == 'T' || symbolChar == 'Y' || symbolChar == 'U' ||
                   symbolChar == 'I' || symbolChar == 'O' || symbolChar == 'P' || symbolChar == 'A' ||
                   symbolChar == 'S' || symbolChar == 'D' || symbolChar == 'F' || 
                   symbolChar == 'G' || symbolChar == 'H' || symbolChar == 'J' || 
                   symbolChar == 'K' || symbolChar == 'L' || symbolChar == 'Z' || symbolChar == 'X' ||
                   symbolChar == 'C' || symbolChar == 'V' || symbolChar == 'B' || 
                   symbolChar == 'N' || symbolChar == 'M') {
            System.out.println(symbolChar + " " + "большая буква");
        } else if(symbolChar == 'q' || symbolChar == 'w' || symbolChar == 'e' || symbolChar == 'r' ||
                   symbolChar == 't' || symbolChar == 'y' || symbolChar == 'u' ||
                   symbolChar == 'i' || symbolChar == 'o' || symbolChar == 'p' || symbolChar == 'a' ||
                   symbolChar == 's' || symbolChar == 'd' || symbolChar == 'f' || 
                   symbolChar == 'g' || symbolChar == 'h' || symbolChar == 'j' || 
                   symbolChar == 'k' || symbolChar == 'l' || symbolChar == 'z' || symbolChar == 'x' ||
                   symbolChar == 'c' || symbolChar == 'v' || symbolChar == 'b' || 
                   symbolChar == 'n' || symbolChar == 'm') {
            System.out.println(symbolChar + " " + "маленькая буква");
        } else if(symbolChar == '9' || symbolChar == '0' || symbolChar == '1' ||
                   symbolChar == '2' || symbolChar == '3' || symbolChar == '4' ||
                   symbolChar == '5' || symbolChar == '6' || symbolChar == '7' || symbolChar == '8') {
            System.out.println(symbolChar + " " + "число");
        } else{
            System.out.println(symbolChar + " " + "не буква и не число");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");
        int deposit = 300000;
        int annualPercentage5 = (deposit / 100 * 5);
        int annualPercentage7 = (deposit / 100 * 7);
        int annualPercentage10 = (deposit / 100 * 10);
        int annualProfit5 = (deposit + annualPercentage5);
        int annualProfit7 = (deposit + annualPercentage7);
        int annualProfit10 = (deposit + annualPercentage10);
        if(deposit < 100000) {
            System.out.println(deposit + " " + "депозит\n" + annualPercentage5 +
                 " 5% годовых\n" + annualProfit5 + " " + "сумма через год");
        } else if(deposit >= 100000 || deposit <= 300000) {
            System.out.println(deposit + " " + "депозит\n" + annualPercentage7 +
                 " 7% годовых\n" + annualProfit7 + " " + "сумма через год");
        } else if(deposit > 300000) {
            System.out.println(deposit + " " + "депозит\n" + annualPercentage10 +
                 " 10% годовых\n" + annualProfit10 + " " + "сумма через год");
        }

        System.out.println("\n7.Определение оценки по предметам");
        int story = 59;
        int programming = 91;
        int grade2 = 2;
        int grade3 = 3;
        int grade4 = 4;
        int grade5 = 5;
        int grade = 0;
        int grade1 = 0;
        int gradePointAverage1 = (story + programming) / 2;
        if (story  <= 60) {
            grade = grade2;
            System.out.println(grade2 + "история");
        } if(programming <= 60){
            grade1 = grade2;
             System.out.println(grade2 + "программирование");
        } if(story > 60 & story <= 73) {
            grade = grade3;
             System.out.println(grade3 + "история");
        } if(programming > 60 & programming <= 73){
            grade1 = grade3;
             System.out.println(grade3 + "программирование");
        } if(story > 73 & story <= 91) {
            grade = grade4;
             System.out.println(grade4 + "история");
        } if(programming > 73 & programming <= 91) {
            grade1 = grade4;
             System.out.println(grade4 + "программирование");
        } if(story > 91) {
            grade = grade5;
             System.out.println(grade5 + "история");
        } if(programming > 91) {
            grade1 = grade5;
             System.out.println(grade5 + "программирование");
        }
        int gradePointAverage = (grade + grade1) / 2;
        System.out.println(gradePointAverage + " " + "средний бал по предметам");
        System.out.println(gradePointAverage1 + " " + "средний % по предметам");

        System.out.println("\n8.Расчет прибыли за год");
        int rentalPrice = 5000;
        int sales = 13000;
        int costPrice = 9000;
        int profitYear = ((sales - costPrice) * 12) - (rentalPrice * 12);
        if(profitYear > 0) {
            System.out.println("прибыль за год: + " + profitYear);
        } else {
            System.out.println("прибыль за год:" + profitYear);
        }

        System.out.println("\n9.Подсчет количества банкнот");
        int usd = 567;
        int hundredsUsd = usd / 100;
        int tensUsd = usd % 100 / 10;
        int onesUsd = usd % 10;
        int atAnAtmHundreds = 10;
        int atAnTens = 5;
        int atAnOnes = 50;
        int issuedhundreds = hundredsUsd;
        int issuedTens = tensUsd;
        int issuedOnes = onesUsd;
        if(hundredsUsd > atAnAtmHundreds) {
            issuedhundreds = atAnAtmHundreds;
            tensUsd += (hundredsUsd - atAnAtmHundreds) * 10;
        } if(tensUsd > atAnTens) {
                issuedTens = atAnTens;
                onesUsd += (tensUsd - atAnTens) * 10;
        } if(onesUsd > atAnOnes) {
                System.out.println("банкнот не хватает для выдачи нужной суммы");
        } else {
                System.out.println("номиналы банкнот\n" + hundredsUsd + " номиналом сто; "
                            + atAnTens + " номиналом десять; "
                            + onesUsd + " номиналом один." + "\nвыданная сумма " + usd);
        }
    }
}