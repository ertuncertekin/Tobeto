package homework_1;

import java.util.Scanner;

public class V9_if_bloklariyla_calismak {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayıyı giriniz.");
		double chosenNumber = scanner.nextDouble();
		
		if (chosenNumber < 40) {
			System.out.println("Sayı 40'tan küçüktür.");
		} else if (chosenNumber == 40) {
			System.out.println("Sayı 40'a Eşittir.");
		}
		else {System.out.println("Sayı 40'tan Büyüktür.");}
	}
}
