/**
 * File      : LambdaHashmap.java		
 * Nama      : Rafif Abbrar Maheswara
 * NIM       : 24060121140163
 */
import java.util.*;

public class LambdaHashmap{

    public static void main(String[] args){

        //MEMBUAT HASH MAP
        //tipe collection yang mempunyai key (semacam indeks) dan value
        //kunci -> integer, nilai -> string
        Map<String, String> map = new HashMap<String, String>();

        //MEMBERI NILAI
        //menempatkan elemen kunci dan nilai
        map.put("24060121140163","Rafif");
        map.put("24060121140151","Dhiya");

        //mengambil semua kunci menggunakan collection
        Collection<String> kunci = map.keySet();

        //mengambil semua nilai menggunakan collection
        Collection<String> isi = map.values();

        System.out.println("\n== Mencetak NIM mahasiswa ==");
        //menggunakan lambda expression untuk mencetak semua kunci map
        kunci.forEach((key) -> System.out.println("NIM : " + key));

        System.out.println("\n== Mencetak nama mahasiswa ==");
        //menggunakan lambda expression untuk mencetak semua isi map
        isi.forEach((val) -> System.out.println("Nama : " + val));
    }
}