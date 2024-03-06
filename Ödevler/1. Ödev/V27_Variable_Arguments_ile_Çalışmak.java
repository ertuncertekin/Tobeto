package homework_1;

public class V27_Variable_Arguments_ile_Çalışmak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int toplam = topla(3, 4, 5, 6, 7, 8,1);
	}

	public static int topla(int... sayilar) {   //Birden fazla int değeri göndermek istiyor isem değişken sonuna ... ekliyorum
		int sum=0;
		for(int i=0;i<sayilar.length;i++) {  //buradaki sayıları bir array haline getiriyor..
			sum+=sayilar[i];
		}
		System.out.println(sum);
		return sum;
	}

}
