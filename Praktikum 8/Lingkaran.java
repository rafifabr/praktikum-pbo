/* 
* Nama File : Lingkaran.java 
* Penulis 	: Rafif Abbrar M
* NIM		: 24060121140163
* Tanggal 	: 20 Mei 2023
* Deskripsi : File Lingkaran class
*/

public class Lingkaran extends BangunDatar{
	private double jejari;

	public Lingkaran (double jejari){
		this.jejari = jejari;
	}
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}