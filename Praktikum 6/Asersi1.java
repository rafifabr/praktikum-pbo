/* 
* Nama File : Asersi1.java 
* Penulis 	: Rafif Abbrar M
* NIM		: 24060121140163
* Tanggal 	: 29 Maret 2023
* Deskripsi : Program untuk menunjukkan asersi
*/

public class Asersi1{
	public static void main(String[] args){
		int x=0;
		if(x>0) {
			System.out.println("x bilangan positif");
		}else{
			assert(x<0) : "ada kesalahan kode";
			System.out.println("x bilangan negatif");
		}
	}
}