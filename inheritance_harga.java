class inheritance_harga extends inputdata {
	private int harga;
	private int kembalian;
	
	public void setHarga(){
		harga=0;
		switch(tipe) {
			case 36: 
				switch(blok) {
					case 'A': harga=500000; break;
					case 'B': harga=300000; break;
					default: System.out.println("Blok rumah salah");
				}; break;
			case 37:
				switch(this.blok) {
					case 'A': harga=800000; break;
					case 'B': harga=600000; break;
					default: System.out.println("Blok rumah salah");
				}; break;
				default: System.out.println("Tipe rumah salah");
		}
	}
	
	public int getHarga(){
		return harga;
	}
	
	public void setKembalian(int bayar){
		kembalian=bayar-harga;
	}
	
	public int getKembalian(){
		return kembalian;
	}
}