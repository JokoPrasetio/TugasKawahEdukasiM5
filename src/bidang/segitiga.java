package bidang;

public class segitiga extends tanah{
    //atribut
    private double sisi1;
    private double sisi2;
    private double alas;
    private double tinggi;

    //konstruktor
    public segitiga(double sisi1, double sisi2, double alas, double tinggi){
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    //method hitungLuas

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    //method hitungKeliling

    @Override
    public double hitungKeliling() {
        return sisi1 + sisi2 + alas;
    }
}
