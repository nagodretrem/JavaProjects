package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Mert";
		ogrenciler[1] = "Ayse";
		ogrenciler[2] = "Fatma";
		ogrenciler[3] = "Mehmet";
		
		for(int i =0; i< ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("------------------------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
