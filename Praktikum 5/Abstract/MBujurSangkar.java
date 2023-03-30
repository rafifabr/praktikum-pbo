/* 
* Nama File : MBujurSangkar.java 
* Penulis 	: Rafif Abbrar M
* NIM		: 24060121140163
* Tanggal 	: 25 Maret 2023
*/

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}