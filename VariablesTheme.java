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
        int sum = pricePen + priceBook;
        int discount = sum * 11 / 100;
        System.out.println(sum);
        System.out.println(discount);
        System.out.println(sum - discount);

        System.out.println("\n3 Вывод слова JAVA");
        System.out.println("   J   a v     V a");
        System.out.println("   J  a a v   v a a");
        System.out.println("J  J aaaaa V V aaaaa");
        System.out.println(" JJ a     a V a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");
        byte maxValueByte= 127;
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
        int apple = 2;
        int pear = 5;
        int cherry;
        System.out.println("с помощью третьей переменной");
        System.out.println("apple =" + apple);
        System.out.println("pear =" + pear);
        cherry = apple;
        apple = pear;
        pear = cherry;
        System.out.println("apple =" + apple);
        System.out.println("pear =" + pear);
        System.out.println("с помощью арифметических операций");
        System.out.println("apple =" + apple);
        System.out.println("pear =" + pear);
        apple -= pear;
        pear += apple;
        apple = pear - apple;
        System.out.println("apple =" + apple);
        System.out.println("pear =" + pear);
        System.out.println("с помощью побитовой операции ^");
        System.out.println("apple =" + apple);
        System.out.println("pear =" + pear);
        apple ^= pear;
        pear ^= apple;
        apple ^= pear;
        System.out.println("apple =" + apple);
        System.out.println("pear =" + pear);

        System.out.println("\n6.Вывод символов и их кодов");
        char lattice = '#';
        char end = '&';
        char at = '@';
        char caret = '^';
        char underscore = '_';
        int latticeCode = 35;
        int endCode = 38;
        int atCode = 64;
        int caretCode = 94;
        int underscoreCode = 95;
        System.out.println(latticeCode + " " + lattice);
        System.out.println(endCode + " " + end);
        System.out.println(atCode + " " + at);
        System.out.println(caretCode + " " + caret);
        System.out.println(underscoreCode + " " + underscore);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");
        char virgule = '/';
        char reversedVirgule = '\\';
        char leftParentheses = '(';
        char rightParentheses = ')';
        char underscore1 = '_';
        System.out.println("        " + virgule + reversedVirgule + "   ");
        System.out.println("       " + virgule + "  " + reversedVirgule + "    ");
        System.out.println("      " + virgule + underscore1 + leftParentheses + " " + rightParentheses
                            + "" + reversedVirgule + "   ");
        System.out.println("     " + virgule + "   " + "   " + reversedVirgule + "    ");
        System.out.println("    " + virgule + underscore1 + underscore1 + underscore1 + underscore1
                            + virgule + reversedVirgule + underscore1 + underscore1
                            + "" + reversedVirgule + " ");

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        System.out.println("Число " + number + " содержит");
        System.out.println(number%1000/100 + " Сотню");
        System.out.println(number%100/10 + " Десятки"); 
        System.out.println(number%10 + " Единицы");
        int hundreds = 1;
        int dozens = 2;
        int units = 3;
        int sum_ = hundreds + dozens + units;
        System.out.println("Сумму его цифр = " + sum_);
        int mult = hundreds * dozens * units;
        System.out.println("Произведение = " + mult);

        System.out.println("\n9.Вывод времени");
        int seconds = 86399;
        int measure = 60;
        int minutes = seconds % measure;
        int hour = seconds / measure / 60;
        System.out.println(hour + ":" + minutes + ":" + minutes);
    }
    
}