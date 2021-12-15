package tigadimensi;

import duadimensi.Lingkaran;

public class Tabung extends Lingkaran{
    Double tinggi;

    public Tabung(Double r, Double tinggi) {
        super(r);
        this.tinggi = tinggi;
    }

    public Double volume() {
        return super.luas() * tinggi;
    }
}
