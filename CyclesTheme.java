public class  CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Подсчет суммы четных и нечетных чисел");
        int evenNumSum = 0;
        int oddNumSum = 0;
        int rangeBegin = - 10;
        int rangeEnd = 21;
        do{
            if(rangeBegin % 2 == 0) {
                evenNumSum += rangeBegin;
            } else {
                oddNumSum += rangeBegin;
            }
            rangeBegin ++;
          } while(rangeBegin <= rangeEnd);
                System.out.println("в промежутке [-10, 21] сумма четных чисел ="
                        + evenNumSum + " нечетных =" + oddNumSum);

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num3;
        for(int num = 10;num >= -1;num --) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("\n3.Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int rev = 0;
        int sum = 0;
        while(number > 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println(rev + " исходное число в обратном порядке");
        System.out.println(sum + " сумма его цифр");

        System.out.println("\n4.Вывод чисел на консоль в несколько строк");
        int num1_ = 0;
        int num2_ = 31;
        int num = 1;
        int num_ = (num + 8);
        for(num = 1;num <= 31;num = num + 2) {
            System.out.printf("%4d", num);
            if(num == num_) {
                System.out.printf("%n");
            } else if(num == (num_ + 10)){
                System.out.printf("\n");
            } else if(num == num_ + 20) {
                System.out.printf("\n");
            } else if(num == num2_) {
                System.out.printf("%4d %3d %3d %3d", num1_, num1_, num1_, num1_);
            } else if(num == (num2_ -1)) {
                System.out.printf("%4d %3d %3d", num1_, num1_, num1_);
            } else if(num == (num2_ -1)) {
                System.out.printf("%4d %3d", num1_, num1_);
            }
        }
        System.out.println();

        System.out.println("\n5.Проверка количества двоек на четность/нечетность");
        int num3_ = 3242592;
        int num_1 = num3_;
        int gua = 0;
        int odd =0;
        int even = 0;
        while(num3_ != 0){
            int digit1 = num3_ % 10;
            num3_ = num3_ / 10;
            if(digit1  ==  2){
                gua += 1;
            }
            if(digit1 % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        System.out.println(" число  " + num_1 + " содержит :" + even + " - четных, "
                + odd + " - нечетных, " + gua + " - количество двоек");


        System.out.println("\n6.Отображение фигур в консоли\n");
        for(int star = 0;star < 5;star ++) {
            for(int ink = 0;ink < 10;ink ++) {
                if(ink < 5 - (5 + star)) {
                    System.out.print(" ");
                } else {
                System.out.print("*");
                }
            }
            System.out.println("\n");
        }
            System.out.println("\n");
            int lat = 5;
        while(lat >= 1) {
            int dig = 1;
            while(dig <= lat) {
                System.out.print(" #");
                    dig ++;
            }
            System.out.println("\n ");
                lat --;
        }
        System.out.println("\n");
        int arrow = 0;
        int arrow1 = 3;
        do {
            while(arrow <= 3) {
                int dig = 1;
                while(dig <= arrow) {
                    System.out.print(" $");
                        dig ++;
           }
               System.out.println("\n ");
                   arrow++;
           }
            while(arrow1 >= 1) {
                int dig1 = 2;
                while(dig1 <= arrow1) {
                    System.out.print(" $");
                        dig1 ++;
               }
                System.out.println("\n ");
                    arrow1--;
           }
           } while(arrow == 3);

        System.out.println("\n7.Отображение ASCII-символов");
        char symbol = 0;
        System.out.println("Dec" + "\tChar");
        for(int number1 = 1;number1 <= 47;number1 = number1 + 2) {
            symbol ++;
            System.out.printf("%3d %8s\n", number1, (symbol ++));
        }
        System.out.println();
        System.out.println("Dec" + "\tChar");
        char symbol1 = 97;
        for(int number2 = 98;number2 <= 122;number2 = number2 +2){
            symbol1 ++;
            System.out.printf("%3d %8s\n", number2, (symbol1 ++));
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        int numX = 1234321;
        int numX1 = 0;
        int numX2 = numX;
        while(numX != 0) {
            int digit = numX % 10;
            numX1 = numX1 * 10 + digit;
            numX = numX / 10;
        } if (numX1 == numX2 ) {
                System.out.println("Число " + numX2 + " является палиндромом");
        } else {
                System.out.println("Число " + numX2 + " не является палиндромом");
        }

        System.out.println("\n 9.Определение, является ли число счастливым");
        int namber = 123321;
        int num_1_ = namber / 100000;
        int num_2 = namber / 10000 % 10;
        int num_3 = namber / 1000 % 10;
        int num_4 = namber / 100 % 10;
        int num_5 = namber / 10 % 10;
        int num_6 = namber / 1 % 10;
        int sumNum = (num_1_ + num_2 + num_3);
        int sumNum1 = (num_4 + num_5 + num_6);
        if (sumNum == sumNum1) {
            System.out.print("Сумма цифр " + num_1_ + "" + num_2 + "" + num_3 + "="
                    + sumNum + "; Сумма цифр " + num_4 + "" + num_5 + "" + num_6 + "=" + sumNum1 + "\n");
            System.out.println(namber + " число является счастливым");
        } else {
            System.out.print("Сумма цифр " + num_1_ + "" + num_2 + "" + num_3 + "="
                    + sumNum + "; Сумма цифр " + num_4 + "" + num_5 + "" + num_6 + "=" + sumNum1 + "\n");
            System.out.println(namber + " число не является счастливым");
        }

        System.out.println("\n 10.Вывод таблицы умножения Пифагора\n");
        int factor, factor1;
        System.out.println("   ТАБЛИЦА" + "\t ПИФАГОРА\n");
        System.out.printf("   |");
        for(factor = 1 ;factor < 10;factor ++) {
            System.out.printf(" \t");
            System.out.printf("\n___|______");
            System.out.printf("____________________\n");
            for(factor = 1;factor < 10; factor ++) {
                System.out.printf("%2d |", factor);
                for(factor1 = 1;factor1 < 10;factor1 ++) {
                    System.out.printf("%2d ", factor * factor1);
                }
            System.out.printf("\n");
            }
        System.out.println();
        }
    }

}