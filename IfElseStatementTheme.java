public class IfElseStatementTheme {
	public static void main(String[] args) {

	System.out.println("1.Перевод псевдокода на язык Java");
	int age = 21;
	if (age > 20) {
		System.out.println("Ты совершеннолетний");
		
	} else {
		System.out.println("Ты подросток");

	}
	boolean malegender = true;
    if(malegender) {
    	System.out.println("Ты мужчина");

    	} else {
    		System.out.println("Ты женщина");

    	}
    	double tall = 1.65;
    	if(tall < 1.80) {
    		System.out.println("Ты высокий");

    		} else {
    			System.out.println("Ты низкий");
    			char firstNameLetter = "Макс".charAt(0);
    			if(firstNameLetter == 'M') {
    				System.out.println("Ты рожден в мае");
    			} else if(firstNameLetter == 'I') {
    				System.out.println("Ты рожден в июле");

    			} else {
    				System.out.println("Ты рожден в другие месяцы");
    			}
    		}
    		System.out.println("");

    		System.out.println("2.Поиск max и min числа");
    		int i = 1;
    		int j = 12;
    		System.out.println(i + " " + j);
    		if(i > j) {
    			System.out.println(i + " - max " + j + " - min ");
    			} else {
    			System.out.println(j + " - max " + i + " - min ");
    			}
    			
    	    if(i == j) {
    			System.out.println(i + " равно " + j);
                }

    		 System.out.println("");
    		 System.out.println("3.Проверка числа");
    		 int num = 0;
    		 System.out.println(num);
    		 if(num == 0){
    		 	System.out.println("Является нулем");
    		}else if(num > 0 && num % 2 == 0){
    		 System.out.println("положительное четное");
    		}else if(num > 0 && num % 2 != 0){
    		 System.out.println("положительное нечетное");	
    		}else if(num < 0 && num % 2 == 0) {
    		 	System.out.println("Отрицательное четное");
    		}else if(num < 0 && num % 2 != 0){
    		 	System.out.println("отрицательное нечетное");
	        }
	    }
   	}

