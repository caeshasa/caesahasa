import java.sql.SQLOutput;

abstract class Batar{
    public abstract double hitungluas ();
    public void tampilkaninformasi() {
        System.out.println("ini sebuah batar");
    }
}

class persegi extends Batar {
    public double sisi;

    public persegi(double sisi)
    {
        this.sisi = sisi;
    }
    @Override
    public double hitungluas () {
        return sisi * sisi;
    }
}

class lingkaran extends Batar {
    public double jarijari;
    public lingkaran(double jarijari)
    {
        this.jarijari = jarijari;
    }
    @Override
    public double hitungluas () {
        return Math.PI*jarijari*jarijari;
    }
}
public class run {
    public static void main(String[] args) {
        lingkaran Lingkaran = new lingkaran(5.0);
        persegi Persegi = new persegi(12.2);

        Lingkaran.tampilkaninformasi();
        System.out.println("Luas Lingkaran : " + Lingkaran.hitungluas());

        Persegi.tampilkaninformasi();
        System.out.println("Luas persegi : " + Persegi.hitungluas());
    }
}
