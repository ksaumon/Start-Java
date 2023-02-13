public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Перевод псевдокода на язык Java");
        int age = 21;
        if(age > 20) {
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
        int num = 5;
        System.out.println(num);
        if(num == 0) {
            System.out.println("Является нулем");
        } else {
            if(num % 2 != 0) {
                System.out.println("нечетное");
            } else {
                System.out.println("четное");
            }
            if(num > 0) {
                System.out.println("положительное");
            } else {
                System.out.println("отрицательное");
            }
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int number1 = 223;
        int number2 = 124;
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
             if(hundreds1 == hundreds) {
                 System.out.println(hundreds1 + " " + hundreds + "\nравны сотни");
             }
             if(tens == tens1) {
                 System.out.println(tens + " " + tens1 + "\nравны десятки ");
             }
             if(ones == ones1) {
                 System.out.println(ones + " " + ones1 + "\nравны единицы");
            }
        }

        System.out.println("\n5.Определение символа по его коду");
        char someChar = 'a';
        if(someChar >= 'A' & someChar <= 'Z') {
            System.out.println(someChar + " " + "большая буква");
        } else if(someChar >= 'a' & someChar <= 'z') {
            System.out.println(someChar + " " + "маленькая буква");
        } else if(someChar >= '0' & someChar <= '9') {
            System.out.println(someChar + " " + "число");
        } else {
            System.out.println(someChar + " " + "не буква и не число");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");
        int deposit = 150000;
        int annualPercentage = 0;
        if(deposit < 100000) {
            annualPercentage = 5;
        } else if(deposit >= 100000 || deposit <= 300000) {
            annualPercentage = 7;
        } else if(deposit > 300000) {
            annualPercentage = 10;
        }
        annualPercentage = (deposit / 100 * annualPercentage);
        int annualProfit = (deposit + annualPercentage);
        System.out.println(deposit + " " + "депозит\n" + annualPercentage +
                 " начисленный %\n" + annualProfit + " " + " итоговую сумму с %");

        System.out.println("\n7.Определение оценки по предметам");
        int precentageOnHistory = 59;
        int precentageOnProgramming = 91;
        int historyGrade = 5;
        int programmingGrade = 5;
        if(precentageOnHistory  <= 60) {
            historyGrade = 2;
        } else if(precentageOnHistory > 60 & precentageOnHistory <= 73) {
            historyGrade = 3;
        } else if(precentageOnHistory > 73 & precentageOnHistory <= 91) {
            historyGrade = 4;
        }
        if(precentageOnProgramming <= 60) {
            programmingGrade = 2;
        } else if(precentageOnProgramming > 60 & precentageOnProgramming <= 73) {
            programmingGrade = 3;
        } else if(precentageOnProgramming > 73 & precentageOnProgramming <= 91) {
            programmingGrade = 4;
        }
        int averageGradePercentage = (precentageOnHistory + precentageOnProgramming) / 2;
        int averageGrade = (historyGrade + programmingGrade) / 2;
        System.out.println(historyGrade + " история");
        System.out.println(programmingGrade + " программирование");
        System.out.println(averageGrade + " средний бал по предметам");
        System.out.println(averageGradePercentage + " средний % по предметам");

        System.out.println("\n8.Расчет прибыли за год");
        int rentalPrice = 5000;
        int sales = 13000;
        int costPrice = 9000;
        int profitYear = ((sales - costPrice) - rentalPrice) * 12;
        if(profitYear > 0) {
            System.out.println("прибыль за год: + " + profitYear);
        } else {
            System.out.println("прибыль за год:" + profitYear);
        }

        System.out.println("\n9.Подсчет количества банкнот");
        int usd = 780;
        int hundredsUsd = usd / 100;
        int tensUsd = usd % 100 / 10;
        int onesUsd = usd % 10;
        int atAnAtmHundreds = 10;
        int atAnTens = 5;
        int atAnOnes = 50;
        int issuedHundreds = hundredsUsd;
        int issuedTens = tensUsd;
        int issuedMax = ((atAnAtmHundreds * 100) + (atAnTens * 10) + atAnOnes);
        if(usd > issuedMax) {
            System.out.println("банкнот не хватает для выдачи нужной суммы");
        } else {
            if(hundredsUsd > atAnAtmHundreds) {
                issuedHundreds = hundredsUsd - atAnAtmHundreds;
                issuedHundreds = hundredsUsd - issuedHundreds;
                tensUsd += (hundredsUsd - atAnAtmHundreds) * 10;
            }
            if(tensUsd > atAnTens) {
                issuedTens = tensUsd - atAnTens;
                issuedTens = tensUsd - issuedTens;
                onesUsd += (tensUsd - issuedTens) * 10;
            }
            System.out.println("номиналы банкнот\n" + issuedHundreds + " номиналом сто; "
                    + issuedTens + " номиналом десять; "
                    + onesUsd + " номиналом один." + "\nвыданная сумма " + usd);
        }
    }
}