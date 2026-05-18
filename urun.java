import java.util.ArrayList;

abstract class Urun {
    protected String ad;
    protected double fiyat;

    public Urun(String ad, double fiyat) {
        this.ad = ad;
        this.fiyat = fiyat;
    }

    public abstract double fiyatHesapla();

    public String getAd() {
        return ad;
    }
}

class Yemek extends Urun {

    public Yemek(String ad, double fiyat) {
        super(ad, fiyat);
    }

    @Override
    public double fiyatHesapla() {
        return fiyat + 50;
    }
}

class Icecek extends Urun {

    public Icecek(String ad, double fiyat) {
        super(ad, fiyat);
    }

    @Override
    public double fiyatHesapla() {
        return fiyat + 10;
    }
}

class Tatli extends Urun {

    public Tatli(String ad, double fiyat) {
        super(ad, fiyat);
    }

    @Override
    public double fiyatHesapla() {
        return fiyat * 0.90;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Urun> urunler = new ArrayList<>();

        urunler.add(new Yemek("Kebap", 200));
        urunler.add(new Icecek("Kola", 40));
        urunler.add(new Tatli("Baklava", 100));

        for (Urun u : urunler) {
            System.out.println(
                u.getAd() + " Fiyat: " + u.fiyatHesapla()
            );
        }
    }
}
