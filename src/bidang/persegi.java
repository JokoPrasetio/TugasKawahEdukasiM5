package bidang;

public class persegi extends tanah{
    //atribut
    private double sisi;

    //konstruktor
    public persegi(double sisi){
        this.sisi = sisi;
    }

    //method hitungLuas
    @Override
    public double hitungLuas(){
        return sisi * sisi;
    }

    //method hitungKeliling
    @Override
    public double hitungKeliling(){
        return 4 * sisi;
    }

}
