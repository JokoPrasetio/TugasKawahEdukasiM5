import bidang.lingkaran;
import bidang.persegi;
import bidang.persegiPanjang;
import bidang.segitiga;

public class Main {
    public static void main(String[] args) {

        //membuat objek lingkaran
        lingkaran lingkaran = new lingkaran(7);

        //mengakses method hitungLuas dan hitungKeliling pada objek lingkaran
        System.out.println("Lingkaran");
        System.out.println("Luas lingkaran : " + lingkaran.hitungLuas());
        System.out.println("Keliling lingkaran : " + lingkaran.hitungKeliling());

        //membuat objek persegi
        persegi persegi = new persegi(5);

        //mengakses method hitungLuas dan hitungKeliling pada objek persegi
        System.out.println("Persegi");
        System.out.println("Luas persegi : " + persegi.hitungLuas());
        System.out.println("Keliling persegi : " + persegi.hitungKeliling());

        //membuat objek persegiPanjang
        persegiPanjang persegiPanjang = new persegiPanjang(10, 5);
        System.out.println("Persegi Panjang");
       //mengakses method hitung luas dan keliling segitiga
        System.out.println("Luas Persegi Panjang : " + persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang : " + persegiPanjang.hitungKeliling());


        //membuat objek segitiga
        segitiga segitiga = new segitiga(8, 9, 10, 7);
        System.out.println("Segitiga");
        //mengakses method hitung luas dan keliling segitiga
        System.out.println("Luas Segititga : " + segitiga.hitungLuas());
        System.out.println("Keliling Segitiga : " + segitiga.hitungKeliling());

        }

    }