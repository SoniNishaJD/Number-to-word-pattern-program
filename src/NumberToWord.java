import java.util.Scanner;

public class NumberToWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num = 1;
			String word = " ";
			while(num != 0) {
				System.out.println("Enter any number(1 to 10)(0 for exit): ");
				
				Scanner sc = new Scanner(System.in);
				num = sc.nextInt();
				
				if(num > 0 && num <= 10) {
					switch(num) {
					case 1: word = "one"; break;
					case 2: word = "two"; break;
					case 3: word = "three"; break;
					case 4: word = "four"; break;
					case 5: word = "five"; break;
					case 6: word = "six"; break;
					case 7: word = "seven"; break;
					case 8: word = "eight"; break;
					case 9: word = "nine"; break;
					case 10: word = "ten"; break;
					}
					
					System.out.println("----------");
					System.out.println(num + " in word " + word);
				}
			}
			
	}

}
