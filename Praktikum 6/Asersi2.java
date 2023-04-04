/* 
* Nama File : Asersi2.java 
* Penulis 	: Rafif Abbrar M
* NIM		: 24060121140163
* Tanggal 	: 29 Maret 2023
* Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
*/

//class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran (jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "
            +kelilingLingkaran);
    }
}

//Program Asersi2 di atas memiliki ketidaktepatan pada sintaks "jariJari > 0". Seharusnya, sintaks yang tepat adalah "jariJari != 0" karena jika menggunakan sintaks "jariJari > 0", nilai negatif pada jari-jari tidak dapat dijalankan.
//Oleh karena itu, untuk memeriksa nilai jari-jari, tanda yang paling tepat adalah "jariJari != 0" sehingga nilai jari-jari yang bukan nol, termasuk nilai negatif, dapat dijalankan.



