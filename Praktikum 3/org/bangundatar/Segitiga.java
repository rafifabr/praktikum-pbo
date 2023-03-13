/*
* File : Segitiga.java 02/04/2014
* Penulis : Rafif Abbrar
* Deskripsl : representasi dasar dari objek poligon dan segitiga
*/

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon {

    private double alas;
    private double tinggi;
    private double sisiMiring;

    public Segitiga(double alas, double tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
		this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        return alas + tinggi + sisiMiring;
    }
	public void printInfo(){
		System.out.println("Bangun segitiga bersisi "+this.getJumlahSisi());
	}
	
}