package miniProjeMukemmelSayi;

public class Main {

	public static void main(String[] args) {
		//6-->1,2,3
		//28->1,2,4,7,14
		
		int number = 14;
		int tempTotal = 0;
		
		for(int i = 1; i < number; i++) {
			if(number % i == 0) {
				tempTotal += i;
			}
		}
		if(tempTotal == number)
			System.out.println(number + " mükemmel sayıdır.");
		else
			System.out.println(number + " mükemmel sayı değildir.");
		

	}
}