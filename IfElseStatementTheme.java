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
            System.out.println("Ты рожден в другие месяцы");
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
        int number1 = 124;
        int number2 = 123;
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
        if(hundreds1 == hundreds && tens == tens1 && ones == ones1) {
            System.out.println(hundreds1 + " " + hundreds + ";" + tens + " " + tens1
                 + ";"  + ones + " " + ones1 + "\nравны сотни  равны десятки  равны единиц");
        } else if(hundreds1 == hundreds && tens == tens1) {
            System.out.println(hundreds1 + " " + hundreds + ";" + tens + " " + tens1
                 + "\nравны сотни  равны десятки");
        } else if(hundreds1 == hundreds && ones == ones1) {
            System.out.println(hundreds1 + " " + hundreds + ";" + ones + " "
                 + ones1 + "\nравны сотни  равны единиц");
        } else if(tens == tens1 && ones == ones1) {
            System.out.println(tens + " " + tens1 + ";"  
                 + ones + " " + ones1 + "\nравны десятки  равны единиц");
        }
        }

        System.out.println("\n5.Определение символа по его коду");
        char recognition = '\u0057';
        int symbol1 = 92;
        int symbol2 = 117;
        int symbol3 = 0;
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
        } else if(deposit >= 100000 || deposit <= 300000) {
            System.out.println(deposit + " " + "депозит");
            System.out.println(deposit / 100 * 7 + " " + "7% годовых");
            System.out.println(deposit + (deposit / 100 * 7) + " " + "сумма через год");
        } else if(deposit > 300000) {
            System.out.println(deposit + " " + "депозит");
            System.out.println(deposit / 100 * 10 + " " + "10% годовых");
            System.out.println(deposit + (deposit / 100 * 10) + " " + "сумма через год");
        }

        System.out.println("\n 7.Определение оценки по предметам");
        int story = 59;
        int programming = 91;
        boolean gradeStory2 = (story <= 60);
        boolean gradeProgramming2 = (programming <= 60);
        boolean gradeStory3 = (story >= 60 && story <= 73);
        boolean gradeProgramming3 = (programming >= 60 && programming <= 73);
        boolean gradeStory4 = (story >= 73 && story <= 91);
        boolean gradeProgramming4 = (programming >= 73 && programming <= 91);
        boolean gradeStory5 = (story > 91);
        boolean gradeProgramming5 = (programming > 91);
        int grade2 = 2;
        int grade3 = 3;
        int grade4 = 4;
        int grade5 = 5;
        if (gradeStory2) {
            System.out.println(grade2 + " История");
        } if(gradeProgramming2) {
            System.out.println(grade2 + " Программирование");
        } if(gradeStory3) {
            System.out.println(grade3 + " История");
        } if(gradeProgramming3) {
            System.out.println(grade3 + " Программирование");
        } if(gradeStory4) {
            System.out.println(grade4 + " История");
        } if(gradeProgramming4) {
            System.out.println(grade4 + " Программирование");
        } if(gradeStory5) {
            System.out.println(grade5 + " История");
        } if(gradeProgramming5) {
            System.out.println(grade5 + " Программирование");
        }
        int averageMark = (grade2 + grade4) / 2;
        System.out.println(averageMark + " " + "средний балл оценок по предметам");
        int percent = (story + programming) / 2;
        System.out.println(percent + " " + "средний % по предметам");

        System.out.println("\n 8.Расчет прибыли за год");
        int rentalPrice = 5000;
        int sales = 13000;
        int costPrice = 9000;
        int profitMonth = sales - costPrice;
        int profitYear = (profitMonth * 12) - (rentalPrice * 12);
        if(profitYear > 0) {
            System.out.println("прибыль за год:" + "+" + profitYear);
        }else if(profitYear == 0) {
            System.out.println("прибыль за год:" + profitYear);
        } else {
            System.out.println("прибыль за год:" + profitYear);
        }

        System.out.println("\n 9.Подсчет количества банкнот");
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