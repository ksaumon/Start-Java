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
        int num = 10;
        int num1 = 5;
        int num2 = -1;
        int max = num--;
        int min = num2 + 1; // при использовании сокращении в виде ++ 0 не выводиться
        if(num1 > num2 && num1 > num) {
            max = num1;
        } else {
            min = num1;
        }
        for(int num3 = max; num3 > min; num3--) {
            System.out.print(num3 + " ");
        }

        System.out.println("\n" + "\n3.Вывод реверсивного числа и суммы его цифр");
        int num4 = 1234;
        int sum = 0;
        while(num4 > 0) {
            int digit = num4 % 10;
            sum += digit;
            num4 /= 10;
            System.out.print(digit + "");
        }
        System.out.println(" исходное число в обратном порядке");
        System.out.println(sum + " сумма его цифр");

        System.out.println("\n4.Вывод чисел на консоль в несколько строк");
        int srcNum = 24;
        int count = 0;
        for(int i = 1; i < srcNum; i += 2) {
            System.out.printf("%4d", i);
            count++;
            while(count == 5) {
                System.out.println("");
                count = 0;
            }
        }
        for(int i = count; i < 5; i++) {
            System.out.printf("%4d", 0);
        }

        System.out.println("\n" + "\n5.Проверка количества двоек на четность/нечетность");
        int srcNum1 = 1242592;
        int copyNum1 = srcNum1;
        int countTwos = 0;
        while(srcNum1 > 0) {
            int digit = srcNum1 % 10;
            srcNum1 /= 10;
            if (digit == 2) {
                countTwos ++;
            }
        }
        if (countTwos % 2 == 0) {
            System.out.println("число  " + copyNum1 + " содержит :" + countTwos + " (четное) - количество двоек");
        } else {
            System.out.println("число  " + copyNum1 + " содержит :" + countTwos + " (нечетное) - количество двоек");
        }

        System.out.println("\n6.Отображение фигур в консоли\n");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                if(j < 5 - (5 + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("\n");
        }
        System.out.println();
        int lattice = 5;
        while(lattice >= 1) {
            int digit = 1;
            while(digit <= lattice) {
                System.out.print(" #");
                digit++;
            }
            System.out.println("\n ");
            lattice--;
        }
        int dollar = 0;
        int dollar1 = 3;
        do {
            while(dollar <= 3) {
                int digit = 1;
                while(digit <= dollar) {
                    System.out.print(" $");
                    digit++;
                }
                System.out.println("\n ");
                dollar++;
            }
            while(dollar1 >= 1) {
                int digit = 2;
                while(digit <= dollar1) {
                    System.out.print(" $");
                    digit++;
                }
                System.out.println("\n ");
                dollar1--;
            }
        } while(dollar == 3);

        System.out.println("\n7.Отображение ASCII-символов");
        char someChar = 0;
        System.out.println("Dec" + "\tChar");
        for(int srcNum2 = 1; srcNum2 <= 47; srcNum2 = srcNum2 + 2) {
            someChar++;
            System.out.printf("%3d %8s\n", srcNum2, (someChar++));
        }
        System.out.println("\n" + "Dec" + "\tChar");
        char someChar1 = 97;
        for(int srcNum3 = 98; srcNum3 <= 122; srcNum3 = srcNum3 + 2) {
            someChar1++;
            System.out.printf("%3d %8s\n", srcNum3, (someChar1++));
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
        int srcNum4 = 123321;
        int numHappy = srcNum4 / 100000;
        int numHappy1 = srcNum4 / 10000 % 10;
        int numHappy2 = srcNum4 / 1000 % 10;
        int numHappy3 = srcNum4 / 100 % 10;
        int numHappy4 = srcNum4 / 10 % 10;
        int numHappy5 = srcNum4 / 1 % 10;
        int sumNum = (numHappy + numHappy1 + numHappy2);
        int sumNum1 = (numHappy3 + numHappy4 + numHappy5);
        if(sumNum == sumNum1) {
            System.out.print("Сумма цифр " + numHappy + "" + numHappy1 + "" + numHappy2 + " = "
                    + sumNum + "; Сумма цифр " + numHappy3 + "" + numHappy4 + "" + numHappy5 + " = " + sumNum1 + "\n");
            System.out.println(srcNum4 + " число является счастливым");
        } else {
            System.out.print("Сумма цифр " + numHappy + "" + numHappy1 + "" + numHappy2 + " = "
                    + sumNum + "; Сумма цифр " + numHappy3 + "" + numHappy4 + "" + numHappy5 + " = " + sumNum1 + "\n");
            System.out.println(srcNum4 + " число не является счастливым");
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