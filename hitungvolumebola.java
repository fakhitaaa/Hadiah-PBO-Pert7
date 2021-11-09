import java.util.Scanner;

class hitungvolumebola {
	public static void main(String args[]) {
	Double  hasil;
	int jari;
	
	// Proses Instansiasi Object baru dari Class RumusBola
	rumusbola rumus = new rumusbola();
	// Proses Instansiasi Object baru dari Class RumusBola
	
	Scanner input = new Scanner(System.in);
		
	System.out.println("Aplikasi polimorphisme dan inheritance untuk mencari volume bola");
	System.out.println();
	System.out.print("Silahkan Masukkan nilai jari-jari / r: ");
	jari = input.nextInt();
	System.out.println();
		
	// Proses Pemanggilan Method radius dari Class volbola(parent) melalui Class RumusBola(Child)	
	rumus.radius(jari);
	// Proses Pemanggilan Method radius dari Class volbola(parent) melalui Class RumusBola(Child)
	
	// Proses Pemanggilan Method tampil dari Class RumusBola(Child)
	rumus.tampil();
	// Proses Pemanggilan Method tampil dari Class RumusBola(Child)
	
	// Proses Pemanggilan Method hitung dari Class RumusBola(Child)
	rumus.hitung(jari);
	// Proses Pemanggilan Method hitung dari Class RumusBola(Child)
		
	}	
}