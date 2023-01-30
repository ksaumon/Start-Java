public class VariablesTheme {
	public static void main(String[] args) {

        System.out.println("1.Вывод значений переменных на консоль");
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
        System.out.println("");

        System.out.println("2.Расчет стоимости товара со скидкой");
        int pen = 100;
        int book = 200;
        int sum = pen + book;
        System.out.println(sum);
        System.out.println(sum - 267);
        System.out.println(sum - 33);
        System.out.println("");

        System.out.println("3 Вывод слова JAVA");
        System.out.println("   J   a v     V a  ");
        System.out.println("   J  a a v   v a  a  ");
        System.out.println("J  J aaaaa V V  aaaaa ");
        System.out.println(" JJ a     a V a       a");
        System.out.println("");

        System.out.println("4.Вывод min и max значений целых числовых типов");
        byte max = 127;
        short max1 = 9999;
        int max2 = 999999999;
        long max3 = 999999999;
        System.out.println(max);
        System.out.println(++ max);
        System.out.println(-- max);
        System.out.println(max1);
        System.out.println(++ max1);
        System.out.println(-- max1);
        System.out.println(max2);
        System.out.println(++ max2);
        System.out.println(-- max2);
        System.out.println(max3);
        System.out.println(++ max3);
        System.out.println(-- max3);
        System.out.println("");

        System.out.println("5.Перестановка значений переменных");
        int two = 2;
        int five = 5;
        int i;
        System.out.println("с помощью третьей переменной");
        System.out.println("two =" + two);
        System.out.println("five =" + five);
        i = two;
        two = five;
        five = i;
        System.out.println("two =" + two);
        System.out.println("five =" + five);
        System.out.println("с помощью арифметических операций");
        System.out.println("two =" + five);
        System.out.println("five =" + two);
        five += two;
        two = five - two;
        five = five - two;
        System.out.println("two =" + five);
        System.out.println("five =" + two);
        System.out.println("с помощью побитовой операции ^");
        System.out.println("two =" + two);
        System.out.println("five =" + five);
        two ^= five;
        five ^= two;
        two ^= five;
        System.out.println("two =" + two);
        System.out.println("five =" + five);
        System.out.println("");

        System.out.println("6.Вывод символов и их кодов");
        char num = '#';
        char num1 = '&';
        char num2 = '@';
        char num3 = '^';
        char num4 = '_';
        System.out.println("35 " + num);
        System.out.println("38 " + num1);
        System.out.println("64 " + num2);
        System.out.println("94 " + num3);
        System.out.println("95 " + num4);
        System.out.println("");

        System.out.println("7.Вывод в консоль ASCII-арт Дюка");
        char num47 = '/';
        char num92 = '\\';
        char num40 = '(';
        char num41 = ')';
        char num43 = '_';
        System.out.println("        " + num47 + num92 + "   ");
        System.out.println("       " + num47 + "  " + num92 + "    ");
        System.out.println("      " + num47 + num43 + num40 + " " + num41 + "" + num92 + "   ");
        System.out.println("     " + num47 + "   " + "   " + num92 + "    ");
        System.out.println("    " + num47 + num43 + num43 + num43 + num43 + num47 + num92 + num43 + num43 + "" + num92 + " ");
        System.out.println("");

        System.out.println("8.Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        System.out.println("Число " + number + " содержит");
        System.out.println(number%1000/100 + " Сотню");
        System.out.println(number%100/10 + " Десятки"); 
        System.out.println(number%10 + " Единицы");
        int i1 = 1;
        int j = 2;
        int k = 3;
        int sum_ = i1 + j + k;
        System.out.println("Сумму его цифр = " + sum_);
        int mult = i1 * j * k;
        System.out.println("Произведение = " + mult);
        System.out.println("");

        System.out.println("9.Вывод времени");
        int r = 86399;
        int t = 60;
        int e = r % t;
        int h = r / t / 60;
        System.out.println(h + ":" + e + ":" + e);
    }
    
}