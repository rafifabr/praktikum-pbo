/* 
* Nama File : Lingkaran.java 
* Penulis 	: Rafif Abbrar Maheswara
* NIM		: 24060121140163
* Tanggal 	: 25 Maret 2023
*/

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}
