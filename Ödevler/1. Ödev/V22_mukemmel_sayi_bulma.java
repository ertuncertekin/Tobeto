package homework_1;

import java.util.Scanner;

public class V22_mukemmel_sayi_bulma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı girin:");
		int sayi = scanner.nextInt();
		int total=0;
		
		for(int i=1;i<sayi;i++) {
		if(sayi%i==0) {
			total=total +i;
			System.out.println(i);
		}
		}
		if(sayi==total) {System.out.println("Mükemmel Sayıdır.");}
		else {System.out.println("Mükemmel Sayı Değildir.");}
		
	}

}
