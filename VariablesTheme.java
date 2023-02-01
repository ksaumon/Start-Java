public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Вывод значений переменных на консоль");
        byte numberOfcores = 8;
        System.out.println("numberOfcores 8");
        short cpuFreguency = 3300;
        System.out.println("cpuFreguency 3300");
        int hardDisk = 512;
        System.out.println("harDisk 512");
        long systemType = 64;
        System.out.println("sysnemType 64");
        float ram = 16;
        System.out.println("float 16");
        double videoCard = 5600;
        System.out.println("videoCard 5600");
        char motherBoard = 'L';
        System.out.println("motherboard L");
        boolean screen = true;
        System.out.println("screen true");

        System.out.println("\n2.Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        int sumGoods = pricePen + priceBook;
        int discount = sumGoods * 11 / 100;
        System.out.println("Общую стоимость товаров без скидки = " + sumGoods);
        System.out.println("Сумма скидки = " + discount);
        System.out.println("Общая стоимость товаров со скидкой = " + (sumGoods - discount));

        System.out.println("\n3 Вывод слова JAVA");
        System.out.println("   J   a v     V a");
        System.out.println("   J  a a v   v a a");
        System.out.println("J  J aaaaa V V aaaaa");
        System.out.println(" JJ a     a V a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");
        byte maxValueByte = 127;
        short maxValueShort = 32767;
        int maxValueInt = 2147483647;
        long maxValuelong = 9223372036854775807L;
        System.out.println(maxValueByte);
        System.out.println(++maxValueByte + " " + --maxValueByte);
        System.out.println(maxValueShort);
        System.out.println(++maxValueShort + " " + --maxValueShort);
        System.out.println(maxValueInt);
        System.out.println(++maxValueInt + " " + --maxValueInt);
        System.out.println(maxValuelong);
        System.out.println(++maxValuelong + " " + --maxValuelong);

        System.out.println("\n5.Перестановка значений переменных");
        int number1 = 2;
        int number2 = 5;
        char temp = 2;
        System.out.println("с помощью третьей переменной");
        System.out.println("number1 =" + number1);
        System.out.println("number2 =" + number2);
        number1 = number2;
        number2 = temp;
        System.out.println("number1 =" + number1);
        System.out.println("number2 =" + number2);
        System.out.println("с помощью арифметических операций");
        System.out.println("number1 =" + number1);
        System.out.println("number2 =" + number2);
        number1 -= number2;
        number2 += number1;
        number1 = number2 - number1;
        System.out.println("number1 =" + number1);
        System.out.println("number2 =" + number2);
        System.out.println("с помощью побитовой операции ^");
        System.out.println("number1 =" + number1);
        System.out.println("number2 =" + number2);
        number1 ^= number2;
        number2 ^= number1;
        number1 ^= number2;
        System.out.println("number1 =" + number1);
        System.out.println("number2 =" + number2);

        System.out.println("\n6.Вывод символов и их кодов");
        char lattice = '#';
        char end = '&';
        char at = '@';
        char caret = '^';
        char underscore = '_';
        System.out.println(35 + " " + lattice);
        System.out.println(38 + " " + end);
        System.out.println(64 + " " + at);
        System.out.println(94 + " " + caret);
        System.out.println(95 + " " + underscore);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char leftParentheses = '(';
        char rightParentheses = ')';
        char underscore1 = '_';
        System.out.println("        " + slash + backslash);
        System.out.println("       " + slash + "  " + backslash);
        System.out.println("      " + slash + underscore1 + leftParentheses + " " + rightParentheses
                + backslash);
        System.out.println("     " + slash + "   " + "   " + backslash);
        System.out.println("    " + slash + underscore1 + underscore1 + underscore1 + underscore1
                + slash + backslash + underscore1 + underscore1
                + backslash);

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        System.out.println("Число " + number + " содержит");
        System.out.println(number / 100 + " Сотню");
        System.out.println(number % 100 / 10 + " Десятки"); 
        System.out.println(number % 10 + " Единицы");
        int hundreds = number / 100;
        int tens = number % 100 / 10;
        int ones = number % 10;
        System.out.println("Сумму его цифр = " + (hundreds + tens + ones));
        System.out.println("Произведение = " + hundreds * tens * ones);

        System.out.println("\n9.Вывод времени");
        int srcSeconds = 86399;
        int hour = srcSeconds / 3600;
        int minutes = srcSeconds / 60 % 60;
        int seconds = srcSeconds % 60;
        System.out.println(hour + ":" + minutes + ":" + seconds);
    }
}