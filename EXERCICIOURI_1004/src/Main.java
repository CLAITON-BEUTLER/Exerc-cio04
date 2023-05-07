import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		
		int VALOR1;
		int VALOR2;
		int PROD;
		
		VALOR1 = sc.nextInt();
		VALOR2 = sc.nextInt();
				
		PROD = VALOR1 * VALOR2;
		
		System.out.println("PROD = " + PROD);
		
		sc.close();
	}

}
