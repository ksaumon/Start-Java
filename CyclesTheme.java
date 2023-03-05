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
        int num = -1;
        int num1 = 5;
        int num2 = 10;
        int max = num2;
        int min = num1;
        if(num1 > max) {
            max = num1;
        }
        if(num > max) {
            max = num;
        }
        if(num2 < min) {
            min = num2;
        }
        if(num < min) {
            min = num;
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
            if(count == 0) break;
            System.out.printf("%4d", 0);
        }

        System.out.println("\n" + "\n5.Проверка количества двоек на четность/нечетность");
        int num5 = 1252292;
        int copyNum5 = num5;
        int countTwos = 0;
        while(num5 > 0) {
            if((num5 % 10) == 2) {
                countTwos++;
            }
            num5 /= 10;
        }
        if(countTwos % 2 == 0) {
            System.out.println("число  " + copyNum5 + " содержит :" + countTwos + " (четное) - количество двоек");
        } else {
            System.out.println("число  " + copyNum5 + " содержит :" + countTwos + " (нечетное) - количество двоек");
        }

        System.out.println("\n6.Отображение фигур в консоли\n");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int countLines = 5;
        int countColumns = 0;
        do {
            System.out.print("#");
            countColumns++;
            if(countColumns == countLines) {
                countLines--;
                System.out.println();
                countColumns = 0;
            }
        } while(countColumns < countLines);
        System.out.println();

        countLines = 1;
        do {
            countColumns = 1;
            do {
                System.out.print("$");
                countColumns++;
            } while(countColumns <= countLines && countColumns <= 6 - countLines);
            System.out.println();
            countLines++;
        } while(countLines <= 5);

        System.out.println("\n7.Отображение ASCII-символов");
         System.out.println("Dec" + "\tChar");
        for(int i = 1; i <= 47; i += 2) {
            System.out.printf("%3d %8s\n", i, (char) i);
        }
        System.out.println("\n" + "Dec" + "\tChar");
        for(int i = 98; i <= 122; i += 2) {
            System.out.printf("%3d %8s\n", i, (char) i);
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        int num6 = 1234321;
        int reverseNum6 = 0;
        int copyNum6 = num6;
        while(num6 != 0) {
            int digit = num6 % 10;
            reverseNum6 = reverseNum6 * 10 + digit;
            num6 /= 10;
        }
        if(reverseNum6 == copyNum6) {
            System.out.println("Число " + copyNum6 + " является палиндромом");
        } else {
            System.out.println("Число " + copyNum6 + " не является палиндромом");
        }

        System.out.println("\n9.Определение, является ли число счастливым");
        int num7 = 123321;
        int leftHalfNum7 = num7 / 1000;
        int rightHalfNum7 = num7 % 1000;
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        int i,j;
        for(i = leftHalfNum7, j = rightHalfNum7; i > 0 & j > 0; j /= 10, i /=10) {
            int digit = i % 10;
            sumLeftHalf += digit;
            int digit1 = j % 10;
            sumRightHalf += digit1;
        }
        if(sumLeftHalf != sumRightHalf) {
            System.out.println(num7 + " число не является счастливым");
        } else {
            System.out.print("Сумма цифр " + leftHalfNum7 + " = "
                    + sumLeftHalf + "; Сумма цифр " + rightHalfNum7 + " = " + sumRightHalf + "\n");
            System.out.println(num7 + " число является счастливым");
        }

        System.out.println("\n10.Вывод таблицы умножения Пифагора\n");
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
            System.out.println();
        }
    }

}