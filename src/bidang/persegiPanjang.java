package bidang;

public class persegiPanjang extends tanah {
    //atribut
    private double panjang;
    private double lebar;

    //konstruktor
    public persegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // method hitungLuas
    @Override
    public double hitungLuas(){
        return panjang * lebar;
    }

    //method hitungKeliling


    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}
