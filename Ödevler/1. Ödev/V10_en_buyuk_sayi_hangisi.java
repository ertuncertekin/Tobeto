package homework_1;

import java.util.Scanner;

public class V10_en_buyuk_sayi_hangisi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Sayıyı giriniz.");
		int number1 = scanner.nextInt();
		System.out.println("2. Sayıyı giriniz.");
		int number2 = scanner.nextInt();
		System.out.println("3. Sayıyı giriniz.");
		int number3 = scanner.nextInt();

		if (number1 < number2 && number3 < number2) {
			System.out.println("En Büyük Sayı İkinci Sayıdır.");
		}
		else if (number1 < number3 && number2 < number3) {
			System.out.println("En Büyük Sayı Üçüncü Sayıdır.");
		}
		else if(number1 > number2 && number1 > number3) {System.out.println("En Büyük Sayı 1. Sayıdır");}
	}
}
