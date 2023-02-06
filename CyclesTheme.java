public class  CyclesTheme {
    public static void main(String[] args) {
         System.out.println("\n1.Подсчет суммы четных и нечетных чисел");
         int evenNumSum = 0;
         int oddNumSum = 0;
         int rangeBegin = - 10;
         int rangeEnd = 21;
         do {
         if(rangeBegin % 2 == 0) {
                 evenNumSum += rangeBegin;
         } else {
                 oddNumSum += rangeBegin;
         } rangeBegin ++;
         } while(rangeBegin <= rangeEnd);
         System.out.println("в промежутке [-10, 21] сумма четных чисел ="
                + evenNumSum + " нечетных =" + oddNumSum);

         System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
         int num1 = 10;
         int num2 = 5;
         int num3 = -1;
         int max = num1;
         int min = num3;
         for (int num = 10;num >= -1;num --) {
             System.out.print(num + " ");
         }
         System.out.println("\n3.Вывод реверсивного числа и суммы его цифр");
         int number = 1234;
         int rev = 0;
         int sum = 0;
         while(number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println(rev + " исходное число в обратном порядке");
        System.out.println(sum + " сумма его цифр");

        System.out.println("\n4.Вывод чисел на консоль в несколько строк");
    }
 }