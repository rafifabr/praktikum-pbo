/* 
* Nama File : AngkaSial.java 
* Penulis 	: Rafif Abbrar M
* NIM		: 24060121140163
* Tanggal 	: 29 Maret 2023
* Deskripsi : program penggunaan exception buatan sendiri pengenalan kalusa 'throw' dan 'throws'
*/

public class AngkaSial{

    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+"bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

//Baris ke-12 dan 21 dalam kode AngkaSial.java tidak akan dieksekusi karena sebelumnya perlu dibuat class exception AngkaSial terlebih dahulu. 
//Kedua baris tersebut membutuhkan class AngkaSial yang merupakan turunan dari class exception. Oleh karena itu, langkah awal yang perlu dilakukan adalah membuat class exception AngkaSial sebelum dapat menjalankan baris tersebut.