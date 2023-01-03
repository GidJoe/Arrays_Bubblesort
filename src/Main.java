import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner krasserscanner = new Scanner(System.in);

		int temp;
		int[] zahlenarray = new int[6];




		for (int i = 0; i < zahlenarray.length; i++){
			System.out.println("Zahl " + (i+1));
			zahlenarray[i] = krasserscanner.nextInt();
		}

		System.out.println("So sieht das Array vorher aus");
		System.out.println(Arrays.toString(zahlenarray));


		// Die erste Schleife mit 'j++' und '-j' zählt Rückwerts, weil
		// wir nach einem "Vergleichungsdurchlauf" die letzten Ziffern nicht mehr
		// Vergleichen müssen. So wird die 'Sortierung des Arrays' deutlich effektiver.
		// Diese 'Optimierung' muss nicht sein, aber ansonsten werden immer wieder alle
		// Zahlen durchgegangen.


		for (int j = 0; j < zahlenarray.length; j++) {
			for (int i = 0; i < zahlenarray.length - 1 -j; i++) {
				if (zahlenarray[i] > zahlenarray[i + 1]) {
					temp = zahlenarray[i];
					zahlenarray[i] = zahlenarray[i + 1];
					zahlenarray[i + 1] = temp;
				}
				System.out.println("Schritt für i = " + i + ": " + Arrays.toString(zahlenarray));
			}
		}

		System.out.println("So sieht das Array nachher aus");
		System.out.println(Arrays.toString(zahlenarray));



	}
}