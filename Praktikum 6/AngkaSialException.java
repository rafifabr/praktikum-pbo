/* 
* Nama File : AngkaSialException.java 
* Penulis 	: Rafif Abbrar M
* NIM		: 24060121140163
* Tanggal 	: 29 Maret 2023
* Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
*/

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial!!!");
    }
}