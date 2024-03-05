package homework_1;

public class V16_Diziler_Recap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList = { 1.6, 5.6, 7.4, 3.8 };
		double total = 0;
		double max = myList[0];

		for (int i = 0; i < myList.length; i++) {
			if (myList[i] < max ) {
				max = myList[i];
			}
			total = total + myList[i];
		}
		System.out.println(total);
		System.out.println("En Büyük Değer: " + max + "'tır.");

		System.out.println("_________________________");

		double[] mySecondList = { 4.7, 9.6, 14.4, 32.8 };
		double total2 = 0;
		double enBuyukSayi = mySecondList[0];

		for (double number : mySecondList) {
			if (enBuyukSayi < number) {
				enBuyukSayi = number;
			}
			total2 = total2 + number;
			System.out.println(number);
		}
		System.out.println("Sayılar Toplamı: " + total2 + " 'dir.");
		System.out.println("En Büyük Sayı: " + enBuyukSayi + " 'dir.");
	}

}
