import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /* Read input */
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        
        /* Reverse string and compare to original */
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed) ? "Yes" : "No");

	}

}
