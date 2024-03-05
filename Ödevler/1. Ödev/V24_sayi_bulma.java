package homework_1;

import java.util.Scanner;

public class V24_sayi_bulma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı girin:");
		int sayi = scanner.nextInt();

		int[] numbers = { 1, 4, 7, 9, 6, 11, 24 };
		boolean bulundu = false;

		for (int i = 0; i < numbers.length; i++) {
			if (sayi == numbers[i]) {
				bulundu = true;
			}
		}
		
		if(bulundu) {System.out.println("Seçilen Sayı Dizi İçinde Mevcut.");}
		else {System.out.println("Seçilen Sayı Dizi İçerisinde Mevcut Değil!");}

	}
}
