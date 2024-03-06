package homework_1;

public class V25_metodları_anlamak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hesaplama=topla(6,9);
		int hesaplama2=tamBolenleriTopla(16);
		int[] dizi= {4,6,8,9,11};
		int dizitoplam=diziToplami(dizi);
		
	}
	
	public static int topla(int num1,int num2) {
		int toplam=num1+num2;
		System.out.println(toplam);
		return toplam;
	}
	
	public static int tamBolenleriTopla(int sayi) {
		
		int sum=0;
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				System.out.println("Tam Bölen Sayı: " + i);
				sum=sum+i;
			}
		}
		System.out.println("Tam Bölenler Toplamı: " + sum);
		return sum;
	}

	public static int diziToplami(int[] dizi ) {
		int toplama=0;
		for(int i=0;i<dizi.length;i++) {
			toplama=toplama+dizi[i];
			System.out.println("Dizideki " + (i+1) + "'inci sayı: " + dizi[i]);
		}
		System.out.println("Dizideki Sayıların Toplamı: " + toplama);
		return toplama;
	}
	
}
