public class VariablesTheme{
	public static void main(String[] args) {
        System.out.println("1 Вывод значений переменных на консоль");

        byte numberofcores = 8;
        System.out.println("numberofcores 8");
        short cpufreguency = 3300;
        System.out.println("cpufreguency 3300");
        int harddisk = 512;
        System.out.println("harddisk 512");
        long sysnemtype = 64;
        System.out.println("sysnemtype 64");
        float ram = 16;
        System.out.println("float 16");
        double videocard = 5600;
        System.out.println("videocard 5600");
        char motherboard = 'L';
        System.out.println("motherboard L");
        boolean screen = true;
        System.out.println("screen true");

        System.out.println("2 Расчет стоимости товара со скидкой");

        int pen = 100;
        int book = 200;
        int sum = pen + book;
        System.out.println(sum);
        System.out.println(sum - 267);
        System.out.println(sum - 33);

        System.out.println("3 Вывод слова JAVA");
        
        System.out.println("   J   a v     V a  ");
        System.out.println("   J  a a v   v a  a  ");
        System.out.println("J  J aaaaa V V  aaaaa ");
        System.out.println(" JJ a     a V a       a");

        System.out.println("4 Вывод min и max значений целых числовых типов");
        byte max = 127;
        short max1 = 9999;
        int max2 = 999999999;
        long max3 = 999999999;
        System.out.println(max);
        System.out.println(max + 1);
        System.out.println(max - 1);
        System.out.println(max1);
        System.out.println(max1 + 1);
        System.out.println(max1 - 1);
        System.out.println(max2);
        System.out.println(max2 + 1);
        System.out.println(max2 - 1);
        System.out.println(max3);
        System.out.println(max3 + 1);
        System.out.println(max3 - 1);

        System.out.println("5 Перестановка значений переменных");
        int two = 2;
        int five = 5;
        int c;
        System.out.println("с помощью третьей переменной");
        System.out.println("two =" + two);
        System.out.println("five =" + five);
        c = two;
        two = five;
        five = c;
        System.out.println("two =" + two);
        System.out.println("five =" + five);
    
        System.out.println("с помощью арифметических операций");
        System.out.println("two =" + five);
        System.out.println("five =" + two);
        
        five = two + five;
        two = five - two;
        five = five - two;
        System.out.println("two =" + five);
        System.out.println("five =" + two);
        System.out.println("с помощью побитовой операции ^");
        System.out.println("two =" + two);
        System.out.println("five =" + five);
        two = two ^ five;
        five = two ^ five;
        two = two ^ five;
        System.out.println("two =" + two);
        System.out.println("five =" + five);

        System.out.println("6 Вывод символов и их кодов");
        char n = '#';
        char n1 = '&';
        char n2 = '@';
        char n3 = '^';
        char n4 = '_';
        System.out.println("35 " + n);
        System.out.println("38 " + n1);
        System.out.println("64 " + n2);
        System.out.println("94 " + n3);
        System.out.println("95 " + n4);

        System.out.println("7 Вывод в консоль ASCII-арт Дюка");
        char n47 = '/';
        char n92 = '\';
        char n40 = '(';
        char n41 = ')';
        char n43 = '_';
        System.out.println("       " + v92);



    }

    
}