/* Nama File : Titik.java */
/* Deskripsi : Program utama yang memanfaatkan OperasiTitik */
/* NIM/Nama  : 24060121140163/Rafif Abbrar Maheswara */
/* Tanggal   : 22 Februari 2023 */


class Titik{
	double absis; 
	double ordinat;
	static int counterTitik;

	Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}

	Titik(int a, int b){
		counterTitik++;
		absis = a;
		ordinat = b;
	}

	void setAbsis(double a){
		absis =a;
	}

	void setOrdinat(double o){
		ordinat = o;
	}

	double getAbsis(){
		return absis;
	}

	double getOrdinat(){
		return ordinat;
	}

	double getCounterTitik(){
		return counterTitik;
	}
}