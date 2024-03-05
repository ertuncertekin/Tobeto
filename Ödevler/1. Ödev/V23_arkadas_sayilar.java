package homework_1;

import java.util.Scanner;

public class V23_arkadas_sayilar {

	public static void main(String[] args) {    //1184 ve 1210, 2620 ve 2924, 5020 ve 5564, 220 ve 284
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen 1. sayıyı girin:");
		int number1 = scanner.nextInt();
		System.out.println("Lütfen 2. sayıyı girin:");
		int number2 = scanner.nextInt();
		int total1=0;
		int total2=0;
		
		for(int i=1;i<number1;i++) {
			if(number1%i==0) {
				total1=total1+i;
			}
		}
		System.out.println("Birinci Sayının Tam Sayı Bölenler Toplamı: "+ total1 + "'dir." );
		
		for(int i=1;i<number2;i++) {
			if(number2%i==0) {
				total2=total2+i;
			}
		}
		System.out.println("İkinci Sayının Tam Sayı Bölenler Toplamı: "+ total2 + "'dir." );
		
		if(total1==number2&&total2==number1) {System.out.println("Sayılar Arkadaş Sayıdır.");}
		else {System.out.println("Girilen Sayılar Arkadaş Sayı Değildir.");}
		}
		
	}
