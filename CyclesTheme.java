public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Подсчет суммы четных и нечетных чисел");
        int sumEvenNums = 0;
        int sumOddNums = 0;
        int rangeBegin = -10;
        int rangeEnd = 21;
        do {
            if(rangeBegin % 2 == 0) {
                sumEvenNums += rangeBegin;
            } else {
                sumOddNums += rangeBegin;
            }
            rangeBegin++;
        } while(rangeBegin <= rangeEnd);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = "
                + sumEvenNums + " нечетных = " + sumOddNums);

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int num = 5;
        int num1 = -1;
        int num2 = 10;
        int max = num;
        int min = num1;
        if(num2 < num && num2 < num1) {
           min = num2;
           if (num<num1){
               max = num1;
           }
        }else if(num2 > num && num2 > num1) {
           max = num2;
           if (num < num1){
               min = num;
           }
        }else if(num < num2 && num < num1) {
            min = num;
            max = num1;
        } else if(num1 > num && num1 > num2) {
            max = num1;
            min =num;
        }
        for(int i = --max; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n" + "\n3.Вывод реверсивного числа и суммы его цифр");
        int num3 = 1234;
        int sum = 0;
        while(num3 > 0) {
            int digit = num3 % 10;
            sum += digit;
            num3 /= 10;
            System.out.print(digit + "");
        }
        System.out.println(" исходное число в обратном порядке");
        System.out.println(sum + " сумма его цифр");

        System.out.println("\n4.Вывод чисел на консоль в несколько строк");
        int num4 = 24;
        int count = 0;
        for(int i = 1; i < num4; i += 2) {
            System.out.printf("%4d", i);
            count++;
            while(count == 5) {
                System.out.println();
                count = 0;
            }
        }
        for(int i = count; i < 5; i++) {
            if(count==0) break;
            System.out.printf("%4d", 0);
        }

        System.out.println("\n" + "\n5.Проверка количества двоек на четность/нечетность");
         int num5 = 1252292;
        int copyNum1 = num5;
        int countTwos = 0;
        while(num5 > 0) {
            if((num5 % 10) == 2) {
                countTwos++;
            }
            num5 /= 10;
        }
        if(countTwos % 2 == 0) {
            System.out.println("число  " + copyNum1 + " содержит :" + countTwos + " (четное) - количество двоек");
        } else {
            System.out.println("число  " + copyNum1 + " содержит :" + countTwos + " (нечетное) - количество двоек");
        }

        System.out.println("\n6.Отображение фигур в консоли\n");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                if(j < 5 - (5 + i)) {
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
        int verticalSymbols = 5;
        int horizontalSymbols = 0;
        do {
            System.out.print("#");
            horizontalSymbols++;
            if(horizontalSymbols == verticalSymbols) {
                verticalSymbols--;
                System.out.println();
                horizontalSymbols = 0;
            }
        } while(horizontalSymbols < verticalSymbols);
        int verticalSymbols1 = 0;
        int verticalSymbols2 = 3;
        do {
            while(verticalSymbols1 <= 3) {
                int horizontalSymbols1 = 1;
                while(horizontalSymbols1 <= verticalSymbols1) {
                    System.out.print("$");
                    horizontalSymbols1++;
                }
                System.out.println();
                verticalSymbols1++;
            }
            while(verticalSymbols2 >= 1) {
                int horizontalSymbols2 = 2;
                while(horizontalSymbols2 <= verticalSymbols2) {
                    System.out.print("$");
                    horizontalSymbols2++;
                }
                System.out.println();
                verticalSymbols2--;
            }
        } while(verticalSymbols1 == 3);

        System.out.println("7.Отображение ASCII-символов");
        char someChar = 0;
        System.out.println("Dec" + "\tChar");
        for(int num6 = 1; num6 <= 47; num6 = num6 + 2) {
            someChar++;
            System.out.printf("%3d %8s\n", num6, (someChar++));
        }
        System.out.println("\n" + "Dec" + "\tChar");
        char someChar1 = 97;
        for(int num7 = 98; num7 <= 122; num7 = num7 + 2) {
            someChar1++;
            System.out.printf("%3d %8s\n", num7, (someChar1++));
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        int num8 = 1234321;
        int num9 = 0;
        int num10 = num8;
        while(num5 != 0) {
            int digit = num8 % 10;
            num9 = num9 * 10 + digit;
            num8 = num8 / 10;
        }
        if(num9 == num10) {
                System.out.println("Число " + num8 + " является палиндромом");
        } else {
                System.out.println("Число " + num8 + " не является палиндромом");
        }

        System.out.println("\n9.Определение, является ли число счастливым");
        int num11 = 123321;
        int numHappy = num11 / 100000;
        int numHappy1 = num11 / 10000 % 10;
        int numHappy2 = num11 / 1000 % 10;
        int numHappy3 = num11 / 100 % 10;
        int numHappy4 = num11 / 10 % 10;
        int numHappy5 = num11 / 1 % 10;
        int sumNum = (numHappy + numHappy1 + numHappy2);
        int sumNum1 = (numHappy3 + numHappy4 + numHappy5);
        if(sumNum == sumNum1) {
            System.out.print("Сумма цифр " + numHappy + "" + numHappy1 + "" + numHappy2 + " = "
                    + sumNum + "; Сумма цифр " + numHappy3 + "" + numHappy4 + "" + numHappy5 + " = " + sumNum1 + "\n");
            System.out.println(num11 + " число является счастливым");
        } else {
            System.out.print("Сумма цифр " + numHappy + "" + numHappy1 + "" + numHappy2 + " = "
                    + sumNum + "; Сумма цифр " + numHappy3 + "" + numHappy4 + "" + numHappy5 + " = " + sumNum1 + "\n");
            System.out.println(num11 + " число не является счастливым");
        }

        System.out.println("\n10.Вывод таблицы умножения Пифагора\n");
        int i, j;
        System.out.println("    ТАБЛИЦА" + "    ПИФАГОРА\n");
        System.out.print("   |");
        for(i = 2; i < 10; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.printf("\n___|___");
        System.out.printf("____________________\n");
        for(i = 2; i < 10; i++) {
            System.out.printf("%2d |", i);
            for(j = 2; j < 10; j++) {
                System.out.printf("%2d ", i * j);
            }
        System.out.printf("\n");
        }
    }

}