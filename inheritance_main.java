import java.util.Scanner;

public class inheritance_main{
	public static void main(String[]args){
		String nama;
		String alamat;
		int bayar;
	
		inheritance_harga A = new inheritance_harga();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nama: ");
		nama = input.nextLine();	
		System.out.print("Masukkan alamat: ");
		alamat = input.nextLine();
		
		
		System.out.print("Masukkan tipe rumah(36/37): ");;
		byte tipe = input.nextByte();
		A.setTipe(tipe);
		System.out.print("Masukkan blok rumah(A/B): ");
		char blok = input.next().charAt(0);
		A.setBlok(blok);
		A.setHarga();
		System.out.println("Harga bayar: "+A.getHarga());
		
		System.out.print("Masukkan jumlah bayar: ");
		bayar = input.nextInt();
		A.setKembalian(bayar);
		System.out.println("Kembalian : " + A.getKembalian());
	}
}