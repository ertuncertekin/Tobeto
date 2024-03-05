package homework_1;

public class V15_Dizilerle_Çalışmaya_Başlamak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ogrenciler=new String[4];
		ogrenciler[0]="Ahmet";
		ogrenciler[1]="Mehmet";
		ogrenciler[2]="Asuman";
		ogrenciler[3]="Esra";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("_______________________");
		
		//Aynı Kullanım Farklı Gösterim
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		System.out.println("_______________________");
		
		//Aynı Kullanım Farklı Gösterim
		String[] arabalar= {"Volvo","BMW","Mercedes","Toyota"};
		for (int i=0;i<arabalar.length;i++)
		{System.out.println(arabalar[i]);}
	}

}
