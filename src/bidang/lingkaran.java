package bidang;

public class lingkaran extends tanah{
    //atribut
    private double jariJari;

    //Konstruktor
    public lingkaran(double jariJari){

        this.jariJari = jariJari;

    }

    //method menghitung luas lingkaran
    @Override
    public double hitungLuas(){
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling(){
        return 2 * Math.PI * jariJari;
    }

    public void setJariJari(double jariJari){
        this.jariJari = jariJari;
    }

}
