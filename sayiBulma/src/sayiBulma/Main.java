package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 123;
		boolean varMi = false;
		
		for(int bul:sayilar) {
			if(aranacak==bul) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("Bu sayı dizinin içinde var.");
		}else {
			System.out.println("Bu sayı dizinin içinde yok.");
		}
		
	}

}
