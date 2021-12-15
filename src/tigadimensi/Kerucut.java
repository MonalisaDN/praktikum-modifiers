package tigadimensi;
import duadimensi.Lingkaran;

public class Kerucut extends Lingkaran {
    Double tinggi;

    public Kerucut(Double jari, Double inputTinggi) {
        super(jari);
        this.tinggi = inputTinggi;
    }

    public Double volume() {
        return 0.3 * super.luas() * tinggi;
    }
}