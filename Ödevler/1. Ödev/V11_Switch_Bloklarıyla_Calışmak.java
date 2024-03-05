package homework_1;

public class V11_Switch_Bloklarıyla_Calışmak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char harfNot='C';
		switch(harfNot) {
		case 'A':
			System.out.println("Mükemmel");
			break;
		case 'B':
			System.out.println("İyi");
			break;
		case 'C':
			System.out.println("Orta");
			break;
		case 'D':
			System.out.println("Kaldınız");
			break;
		default:System.out.println("Geçersiz Bir Not Girdiniz!");
		}
	
	}

}
