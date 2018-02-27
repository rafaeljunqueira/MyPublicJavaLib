import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MedianaSubMatriz {

	public static void main(String[] args) {
		/* Save input */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [][] matriz = new int[size][size];
        for (int i = 0; i < size; i++) {
        	for (int j = 0; j < size; j++) {
        		matriz[i][j] = scan.nextInt();
        	}
        }
        
        int q = scan.nextInt();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i0 = 0; i0 < q; i0++) {
        	int r1 = scan.nextInt()-1;
        	int c1 = scan.nextInt()-1;
        	int r2 = scan.nextInt()-1;
        	int c2 = scan.nextInt()-1;
        	
        	ArrayList<Integer> qArray = new ArrayList<Integer>();
        	for (int i = r1; i <= r2; i++) {
            	for (int j = c1; j <= c2; j++) {
            		qArray.add(matriz[i][j]);
            	}
            }
        	Collections.sort(qArray);
        	
        	int tam = qArray.size();
        	if (tam==1)
        		result.add(qArray.get(0));
        	else if (tam%2==0) {
        		int a = qArray.get(((tam/2)-1));
        		int b = qArray.get(((tam/2)));
        		result.add((int)(a+b)/2);
        	} else {
        		result.add((int)qArray.get((tam-1)/2));
        	}
        	
        }

        scan.close();
        for (int i = 0; i < result.size(); i++)
        	System.out.println(result.get(i));
	}

}
