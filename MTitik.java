/* 
* Pembuat 	: Rafif Abbrar Maheswara 
* NIM  	: 24060121140163 
* Tanggal   : 1 Maret 2023 
* Deskripsi : Enkapsulasi
/* 


class MTitik {

	public static void main(String[] args) {
		Titik t1;
		Titik t2;
		Titik t3;
		t1 = new Titik();
		t2 = new Titik();
		t3 = new Titik();
		
		t1.setAbsis(1.0);
		t1.setOrdinat(2.0);
		
		t2.setAbsis(4.0);
		t2.setOrdinat(9.0);

		t3.setAbsis(5.0);
		t3.setOrdinat(8.0);

		
		System.out.println("t1.x = "+ t1.absis);
		System.out.println("t1.x = "+ t1.ordinat);

		System.out.println("t2.x = "+ t2.getAbsis());
		System.out.println("t2.x = "+ t2.getOrdinat());
		System.out.println("t3("+t3.getAbsis()+","+t3.getOrdinat()+")");
	}
}