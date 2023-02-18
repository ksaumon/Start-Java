public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Подсчет суммы четных и нечетных чисел");
        int sumEvenNums = 0;
        int sumOddNums = 0;
        int rangeBegin = - 10;
        int rangeEnd = 21;
        do {
            if(rangeBegin % 2 == 0) {
                sumEvenNums += rangeBegin;
            } else {
                sumOddNums += rangeBegin;
            }
            rangeBegin++;
          } while(rangeBegin <= rangeEnd);
                System.out.println("в промежутке [-10, 21] сумма четных чисел ="
                        + sumEvenNums + " нечетных =" + sumOddNums);

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = - 1;
        int max = 10;
        int min = -1;
        if(num1 > num2) {
            max = num1;
        }
        if(num2 > num3 && num2 > num1) {
            max = num2;
        } else {
            min = num2;
        }
        if(num3 < num2) {
            min = num3;
        }
        for(int num = max; num > min; num--) {
            System.out.print(num + " ");
        }

        System.out.println("\n" + "\n3.Вывод реверсивного числа и суммы его цифр");
        int num0 = 1234;
        int sum = 0;
        while(num0 > 0) {
            int digit = num0 % 10;
            sum += digit;
            num0 /= 10;
            System.out.print(digit + "");
        }
        System.out.println(" исходное число в обратном порядке");
        System.out.println(sum + " сумма его цифр");

        System.out.println("\n4.Вывод чисел на консоль в несколько строк");
        int crsNum = 30;
        int num, quantity;
        for (num = 1, quantity = num; num <= crsNum && quantity <= 5; num += 2, quantity++) {
            System.out.printf("%4d", num);
            if (quantity == 5) {
                System.out.printf("\n");
                quantity = 0;
            }
        }
        for (quantity = quantity; quantity <= 5; quantity++) {
            if (quantity >= 2 ) {
                System.out.printf("%4d", 0);
            } else {
                break;
            }
        }
        System.out.println();

        System.out.println("\n5.Проверка количества двоек на четность/нечетность");
          int srcNum1 = 1242592;
        int copyNum = srcNum1;
        int two = 0;
        while(srcNum1 != 0) {
            int digit1 = srcNum1 % 10;
            srcNum1 /= 10;
            if (digit1 == 2) {
                two += 1;
            }
        }
        if (two % 2 == 0) {
            System.out.println("число  " + copyNum + " содержит :" + two + " (четное) - количество двоек");
        } else {
            System.out.println("число  " + copyNum + " содержит :" + two + " (нечетное) - количество двоек");
        }

        System.out.println("\n6.Отображение фигур в консоли\n");
        for(int star = 0; star < 5; star++) {
            for(int space = 0; space < 10; space++) {
                if(space < 5 - (5 + star)) {
                    System.out.print(" ");
                } else {
                System.out.print("*");
                }
            }
            System.out.println("\n");
        }
            System.out.println("\n");
            int lattice = 5;
        while(lattice >= 1) {
            int dig = 1;
            while(dig <= lattice) {
                System.out.print(" #");
                    dig++;
            }
            System.out.println("\n ");
                lattice--;
        }
        System.out.println("\n");
        int dollar = 0;
        int dollar1 = 3;
        do {
            while(dollar <= 3) {
                int dig = 1;
                while(dig <= dollar) {
                    System.out.print(" $");
                        dig++;
           }
               System.out.println("\n ");
                   dollar++;
           }
            while(dollar1 >= 1) {
                int dig1 = 2;
                while(dig1 <= dollar1) {
                    System.out.print(" $");
                        dig1++;
               }
                System.out.println("\n ");
                    dollar1--;
           }
           } while(dollar == 3);

        System.out.println("\n7.Отображение ASCII-символов");
        char someChar = 0;
        System.out.println("Dec" + "\tChar");
        for(int scrNum2 = 1; scrNum2 <= 47; scrNum2 = scrNum2 + 2) {
            someChar++;
            System.out.printf("%3d %8s\n", scrNum2, (someChar++));
        }
        System.out.println();
        System.out.println("Dec" + "\tChar");
        char someChar1 = 97;
        for(int scrNum3 = 98; scrNum3 <= 122; scrNum3 = scrNum3 + 2) {
            someChar1++;
            System.out.printf("%3d %8s\n", scrNum3, (someChar1++));
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        int numX = 1234321;
        int numX1 = 0;
        int numX2 = numX;
        while(numX != 0) {
            int digit = numX % 10;
            numX1 = numX1 * 10 + digit;
            numX = numX / 10;
        }
        if(numX1 == numX2) {
                System.out.println("Число " + numX2 + " является палиндромом");
        } else {
                System.out.println("Число " + numX2 + " не является палиндромом");
        }

        System.out.println("\n9.Определение, является ли число счастливым");
        int scrNum4 = 123321;
        int numHappy = scrNum4 / 100000;
        int numHappy1 = scrNum4 / 10000 % 10;
        int numHappy2 = scrNum4 / 1000 % 10;
        int numHappy3 = scrNum4 / 100 % 10;
        int numHappy4 = scrNum4 / 10 % 10;
        int numHappy5 = scrNum4 / 1 % 10;
        int sumNum = (numHappy + numHappy1 + numHappy2);
        int sumNum1 = (numHappy3 + numHappy4 + numHappy5);
        if(sumNum == sumNum1) {
            System.out.print("Сумма цифр " + numHappy + "" + numHappy1 + "" + numHappy2 + "="
                    + sumNum + "; Сумма цифр " + numHappy3 + "" + numHappy4 + "" + numHappy5 + "=" + sumNum1 + "\n");
            System.out.println(scrNum4 + " число является счастливым");
        } else {
            System.out.print("Сумма цифр " + numHappy + "" + numHappy1 + "" + numHappy2 + "="
                    + sumNum + "; Сумма цифр " + numHappy3 + "" + numHappy4 + "" + numHappy5 + "=" + sumNum1 + "\n");
            System.out.println(scrNum4 + " число не является счастливым");
        }

        System.out.println("\n10.Вывод таблицы умножения Пифагора\n");
        int factor, factor1;
        System.out.println("    ТАБЛИЦА" + "    ПИФАГОРА\n");
        System.out.print("   |");
        for(factor = 2; factor < 10; factor++) {
            System.out.printf("%2d ", factor);
        }
        System.out.printf("\n___|___");
        System.out.printf("____________________\n");
        for(factor = 2; factor < 10; factor++) {
            System.out.printf("%2d |", factor);
            for(factor1 = 2; factor1 < 10; factor1++) {
                System.out.printf("%2d ", factor * factor1);
            }
        System.out.printf("\n");
        }
    }

}