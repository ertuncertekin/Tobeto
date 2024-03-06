package homework_1;

public class V26_parametreli_metodları_anlamak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=topla(5,8);
		String sehirGetir=sehirVer();
		System.out.println(sehirGetir);
		
	}

	public static void ekle() { // birşey döndürmüyor.
		System.out.println("Eklendi");
	}

	public static void guncelle() {
		System.out.println("guncellendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	// yapılacak işleme göre metod tipi belirleniyor.

	public static int topla(int num1, int num2) {
		int toplam=num1 + num2;
		System.out.println(toplam);
		return toplam;
	}
	
	public static String sehirVer() {
		return "Bursa";
		
		
	}

}
