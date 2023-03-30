/* 
* Nama File : BujurSangkar.java 
* Penulis 	: Rafif Abbrar M
* NIM		: 24060121140163
* Tanggal 	: 25 Maret 2023
*/

public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        luas = sisi*sisi;
        return luas;
    }
    // jika implementeasi metode dari abstrak tidak dibuat maka akan terjadi errpr
    // dimana file bujursangkat tidak dapat dikompile dan tidak dianggap sebagai inherit abstract dari bangun datar
}