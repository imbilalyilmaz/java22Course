package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 2;
		int remainder = number % 2;
		boolean asalMi = true;
		System.out.println(remainder);
		
		if(number == 1) {
			System.out.println("Sayı asal değildir.");
			return;
		}
		if(number<1) {
			System.out.println("Geçersiz sayı.");
			return;
		}
		
		for (int i = 2; i < number ; i++) {
			if(number % i == 0) {
				asalMi = false;
			}
			
		}
		
		if(asalMi) {
			System.out.println("Sayı asaldır.");
		}else {
			System.out.println("Sayı asal değildir.");
		}
		
	}

}
