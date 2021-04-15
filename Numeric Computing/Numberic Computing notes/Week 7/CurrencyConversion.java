import java.util.*;

public class CurrencyConversion {

	//@author Kush Patel
	//the website I used is https://www1.oanda.com/currency/converter/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int from = 0, to = 0;
		double amount1 = 0.0, amount2 = 0.0;
		boolean valid1 = false, valid2 = false, valid3 = false;
		
		while (valid1 == false) {
			
			System.out.println("Enter the number which represents the currency you want to convert from: \n1 = Canadian Dollar\n2 = US Dollar\n3 = Euro\n4 = Japanese Yen\n5 = Indian Rupees");
			from = input.nextInt();
			
			if((from > 0) && (from < 6)) {
				
				valid1 = true;
				
			}else {
				
				valid1 = false;
				
			}
			
		}
		
		while (valid2 == false) {
		
			System.out.println("Enter the number which represents the currency you want to convert to: \n1 = Canadian Dollar\n2 = US Dollar\n3 = Euro\n4 = Japanese Yen\n5 = Indian Rupees");
			to = input.nextInt();
		
			if(from == to) {
			
				valid2 = false;
			
			}else if ((to > 0) && (to < 6)){
			
				valid2 = true;
			
			}else {
				
				valid2 = false;
			
			}
			
		}
		
		while(valid3 == false){
			
			System.out.println("Enter amount of money you want to convert from");
			amount1 = input.nextDouble();
			
			if(amount1 > 0.0) {
				
				valid3 = true;
			
			}
		
		}
		
		if((from == 1) && (to == 2)) {
			
			amount2 = amount1*0.76527;
			System.out.println("The amount you have after converting is: " + amount2);
		
		}else if((from == 2) && (to == 1)) {
			
			amount2 = amount1*1.30647;
			System.out.println("The amount you have after converting is: " + amount2);
			
		}else if((from == 1) && (to == 3)) {
			
			amount2 = amount1*0.68960;
			System.out.println("The amount you have after converting is: " + amount2);
			
		}else if((from == 3) && (to == 1)) {
			
			amount2 = amount1*1.44957;
			System.out.println("The amount you have after converting is: " + amount2);
			
		}else if((from == 1) && (to == 4)) {
			
			amount2 = amount1*83.14;
			System.out.println("The amount you have after converting is: " + amount2);
			
		}else if((from == 4) && (to == 1)) {
			
			amount2 = amount1*0.01202;
			System.out.println("The amount you have after converting is: " + amount2);
			
		}else if((from == 1) && (to == 5)) {
			
			amount2 = amount1*54.0212;
			System.out.println("The amount you have after converting is: " + amount2);
			
		}else if((from == 5) && (to == 1)) {
			
			amount2 = amount1*0.01847;
			System.out.println("The amount you have after converting is: " + amount2);
			
		}else if((from == 2) && (to == 3)) {
			
			amount2 = amount1*0.90112;
			System.out.println("The amount you have after converting is: " + amount2);
			
		}else if((from == 3) && (to == 2)) {
			
			amount2 = amount1*1.10953;
			System.out.println("The amount you have after converting is: " + amount2);
			
		}else if((from == 2) && (to == 4)) {
			
			amount2 = amount1*108.64;
			System.out.println("The amount you have after converting is: " + amount2);
			
		}else if((from == 4) && (to == 2)) {
			
			amount2 = amount1*0.00920;
			System.out.println("The amount you have after converting is: " + amount2);
			
		}else if((from == 2) && (to == 5)) {
			
			amount2 = amount1*70.5914;
			System.out.println("The amount you have after converting is: " + amount2);
			
		}else if((from == 5) && (to == 2)) {
			
			amount2 = amount1*1.30647;
			System.out.println("The amount you have after converting is: " + amount2);
			
		}else if((from == 3) && (to == 4)) {
			
			amount2 = amount1*120.55;
			System.out.println("The amount you have after converting is: " + amount2);
			
		}else if((from == 4) && (to == 3)) {
			
			amount2 = amount1*0.00829;
			System.out.println("The amount you have after converting is: " + amount2);
			
		}else if((from == 3) && (to == 5)) {
			
			amount2 = amount1*78.3233;
			System.out.println("The amount you have after converting is: " + amount2);
			
		}else if((from == 5) && (to == 3)) {
			
			amount2 = amount1*0.01274;
			System.out.println("The amount you have after converting is: " + amount2);
			
		}else if((from == 4) && (to == 5)) {
			
			amount2 = amount1*0.64967;
			System.out.println("The amount you have after converting is: " + amount2);
			
		}else if((from == 5) && (to == 4)) {
			
			amount2 = amount1*1.54;
			System.out.println("The amount you have after converting is: " + amount2);
			
		}
		
	}

}