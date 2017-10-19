package lista;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class URI1548 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		Integer a[];
		int cont=0;
		for (int i = 0; i < n; i++) {
			int quant = scanner.nextInt();
			a = new Integer[quant];
			for (int j = 0; j <quant; j++) {
				a[j] = scanner.nextInt();
			}
			Integer b[] = a.clone();
			Arrays.sort(a,Collections.reverseOrder());
			for (int k = 0; k < a.length; k++) {
				if (b[k]==a[k]) {
					cont++;
				}
			}
			System.out.println(cont);
			cont =0;
		}
	}
}	
