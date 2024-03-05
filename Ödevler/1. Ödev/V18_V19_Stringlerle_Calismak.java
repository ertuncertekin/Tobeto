package homework_1;

public class V18_V19_Stringlerle_Calismak {

	public static void main(String[] args) {
		
		String mesaj = "    Bugün Hava Çok Güzel.";
		System.out.println(mesaj);
		System.out.println(mesaj.length()); // toplam karakter sayısını verir.
		System.out.println(mesaj.charAt(4)); // 5. elemanın hangi karakter olduğunu verir.
		System.out.println(mesaj.concat(" Dışarı Çıkalım mı?")); // Metinsel ifadelerde birleştirme yapıyor.
		System.out.println(mesaj.startsWith("B")); //Boolean veri tipi "B" ile başlıyor mu? Anlamı taşır.
		System.out.println(mesaj.endsWith("l")); // Boolean veri tipi "l" ile bitiyor mu? Anlamı taşır.
		char[] karakterler=new char[5];
		mesaj.getChars(0, 5, karakterler, 0);  //burada yazan 5 char'a özel bir durum
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a")); //metinsel bir ifade de aranabilir. başran arayıp kaçıncı indexte olduğunu söyler
		System.out.println(mesaj.lastIndexOf("a"));  // sonuncu o harfin indexini verir.
		
		String yeniMesaj=mesaj.replace(" ","-"); //karakterleri değiştirmeye yarıyor.
		System.out.println(yeniMesaj);
		System.out.println(yeniMesaj.substring(2,6)); //2. indexten itibaren parçala.(indexler dahil olarak.
		
		String[] kelimeler=mesaj.split(" ");  //önce array'a çevirdik. boşluklara göre ayırdık.
		for(int i=0;i<kelimeler.length;i++) {
			System.out.println(kelimeler[i]);
		}
		System.out.println(yeniMesaj.toLowerCase());
		System.out.println(yeniMesaj.toUpperCase());
		System.out.println(mesaj.trim());
		}
				
	}
	

