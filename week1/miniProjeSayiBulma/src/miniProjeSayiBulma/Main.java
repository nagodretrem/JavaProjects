package miniProjeSayiBulma;

public class Main {

	public static void main(String[] args) {

		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 12;
		
		for(int sayi:sayilar) {
			if(sayi == aranacak) {
				System.out.println("sayı bulundu.");
				return;
			}
		}
		System.out.println("sayı dizide bulunamadı.");
	}

}
