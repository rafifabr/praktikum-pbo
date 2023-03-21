/* 
* Nama File : MKubus.java 
* Penulis 	: Rafif Abbrar M
* NIM		: 24060121140163
* Tanggal 	: 18 Maret 2023
* Deskripsi : File Main Kubus
*/

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar(4.0);
        Kubus kubus = new Kubus(bujurSangkar);

        System.out.println("Kubus dengan panjang sisi : " + bujurSangkar.getPanjangSisi());
        System.out.println("Luas alas Kubus : " + kubus.hitungLuasAlas());
        System.out.println("Volume Kubus : "+ kubus.hitungVolume());

    }
}