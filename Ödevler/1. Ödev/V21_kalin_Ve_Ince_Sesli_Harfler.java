package homework_1;

import java.util.Scanner;

public class V21_kalin_Ve_Ince_Sesli_Harfler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sesli harf girin:");
		String harf = scanner.next();

		String[] inceSesliHarfler = { "e", "i", "ö", "ü" };
		String[] kalinSesliHarfler = { "a", "ı", "o", "u" };
		
		boolean inceSesli=false;
		boolean kalinSesli=false;

		for (int i = 0; i < inceSesliHarfler.length; i++) {
			if (harf.equals(inceSesliHarfler[i])) {
				inceSesli=true;
			}
		}
		
		for (int i = 0; i < kalinSesliHarfler.length; i++) {
			if (harf.equals(kalinSesliHarfler[i])) {
				kalinSesli=true;
			}
		}
		
		if(inceSesli) {System.out.println("Yazdığınız Harf İnce Seslidir.");}
		else if(kalinSesli) {System.out.println("Yazdığınız Harf Kalın Seslidir.");}
		else {System.out.println("Seçtiğiniz Harf İnce Veya Kalın Sesli Değildir.");}
		
	}
}
