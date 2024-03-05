package homework_1;

import java.util.Scanner;

public class v20_mini_proje_asal_sayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Lütfen bir sayı girin:");
	        int sayi = scanner.nextInt();
	        boolean isPrime=true;
	        if(sayi<=1) {
	        	System.out.println("1 veya 1'den küçük sayılar asal olamaz.");
	        	 return;
	        }
	        for(int i=2;i<sayi;i++) {
	        	if(sayi%i==0) {
	        		isPrime=false;
	        	}
	        }
	        if(isPrime) {System.out.println("Sayı Asaldır.");} //karşılaştırma işleminde == kullanırız.
	        else if(isPrime==false) {System.out.println("Sayı Asal Değildir.");}
}
}
