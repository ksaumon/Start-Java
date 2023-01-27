public class IfElseStatementTheme{
	public static void main(String[] args) {

	System.out.println("1.Перевод псевдокода на язык Java");
	int age = 21;
	if (age > 20) {
		System.out.println("Ты совершеннолетний");
		
	}else{
		System.out.println("Ты подросток");

	}
	boolean malegender = true;
    if(malegender) {
    	System.out.println("Ты мужчина");

    	}else{
    		System.out.println("Ты женщина");

    	}
    	double tall = 1.65;
    	if (tall < 1.80) {
    		System.out.println("Ты высокий");

    		}else{
    			System.out.println("Ты низкий");
    			char firstNameLetter = "Макс".charAt(0);
    			if(firstNameLetter == 'M'){
    				System.out.println("Ты рожден в мае");
    			}else if(firstNameLetter == 'I') {
    				System.out.println("Ты рожден в июле");

    			}else{
    				System.out.println("Ты рожден в другие месяцы");
    			}
    		}
    		System.out.println("");
    		System.out.println("2.Поиск max и min числа");
    		int a = 12;
    		int b = 7;
    		if(a > b){
    			System.out.println(" a - max" + " b - min");
    			System.out.println("a не равно b");
    		}if(a < b){
    			System.out.println(" b - max" + " a - min");
    			System.out.println("a не равно b");
    		}if(a==b){
    			System.out.println("a равно b");
    		}else{
    				System.out.println("a не равно b");
    			}
    		}
    	}