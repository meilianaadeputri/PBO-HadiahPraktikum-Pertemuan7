import java.util.Scanner;

public class polimorphisme_main{
	public static void main(String[]args){
		String nama;
		String alamat;
		int bayar;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nama: ");
		nama = input.nextLine();	
		System.out.print("Masukkan alamat: ");
		alamat = input.nextLine();
		
		
		System.out.print("Masukkan tipe rumah(36/37): ");;
		byte tipe = input.nextByte();
		
		switch (tipe) {
			case 36: 
				polimorphisme_Tipe36 A = new polimorphisme_Tipe36();
				A.setTipe(tipe);
				System.out.print("Masukkan blok rumah(A/B): ");
				char blok = input.next().charAt(0);
				A.setBlok(blok);
				A.setHarga();
				System.out.println("Harga bayar: "+A.getHarga());
						
				System.out.print("Masukkan jumlah bayar: ");
				bayar = input.nextInt();
				A.setKembalian(bayar);
				System.out.println("Kembalian : " + A.getKembalian());; break;
			case 37: 
				polimorphisme_Tipe37 B = new polimorphisme_Tipe37(); 
				B.setTipe(tipe);
				System.out.print("Masukkan blok rumah(A/B): ");
				blok = input.next().charAt(0);
				B.setBlok(blok);
				B.setHarga();
				System.out.println("Harga bayar: "+B.getHarga());
						
				System.out.print("Masukkan jumlah bayar: ");
				bayar = input.nextInt();
				B.setKembalian(bayar);
				System.out.println("Kembalian : " + B.getKembalian());; break;
			default: System.out.println("Tipe rumah salah");
		}
	}
}