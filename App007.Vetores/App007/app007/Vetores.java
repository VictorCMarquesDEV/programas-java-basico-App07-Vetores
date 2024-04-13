package app007;

import java.util.Arrays;

public class Vetores {

	public static void main(String[] args) {
		String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
						"Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i = 0; i < mes.length; i++) {
			System.out.println(mes[i] + " tem " + tot[i] + " dias.");
		}
		
		int n[] = new int[20];
		Arrays.fill(n, 0);
		for(int v: n) {
			System.out.print(v + " ");
		}
		System.out.println("");
		
		
		int num[] = {3, 7, 6, 1, 9, 4, 2};
		int pos = Arrays.binarySearch(num, 1);
		Arrays.sort(num);
		System.out.println("Posição: " + pos);
		for(int v: num) {
			System.out.print(v + " ");
		}
	}
}