/**
 * File      : LambdaList.java		
 * Nama      : Rafif Abbrar Maheswara
 * NIM       : 24060121140163
 * Deskripsi : Implementasi lambda pada list, digunakan sebagai parameter pada method.
 */
import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Ikhwan");
        mahasiswaList.add("Gopla");
        mahasiswaList.add("Dhimzy");
        mahasiswaList.add("Bhaslo");

        //lambda digunakan sebagai parameter pada method
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}