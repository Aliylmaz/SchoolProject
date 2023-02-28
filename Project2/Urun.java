package Project2;

/**
 * @file Urun
 * @description Bu kod sınıfı, ürünleri oluşturmak için kullanılır.
 * @assignment Proje 2
 * @date 03/01/2023
 * @author Ali Yılmaz yilmazali170@gmail.com
 */

public class Urun {

    private String urunAdi;
    private double urunFiyati;
    private Uretici uretici;

    public String getUrunAdi() {
        return urunAdi;

    }

    public double getUrunFiyati() {
        return urunFiyati;
    }

    public Uretici getUretici() {
        return uretici;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public void setUrunFiyati(double urunFiyati) {
        this.urunFiyati = urunFiyati;
    }

    public void setUretici(Uretici uretici) {
        this.uretici = uretici;
    }

    public Urun(String urunAdi, double urunFiyati, Uretici uretici) {
        this.urunAdi = urunAdi;
        this.urunFiyati = urunFiyati;
        this.uretici = uretici;
    }



    public void printUrunInfo() {
        // ürün bilgilerini yazdır
        System.out.println("Urun Adi: " + urunAdi);//ürün adını yazdırır.
        System.out.println("Urun Fiyati: " + urunFiyati);//ürün fiyatını yazdırır.
        System.out.println("Uretici Adi: " + uretici.getAd());//ürünün üreticisini yazdırır.
        System.out.println("Uretici Soyadi: " + uretici.getSoyad());//ürünün üreticisinin soyadını yazdırır.
    }

    public void UreticiBilgileri() {
        // üretici bilgilerini yazdır
        System.out.println("Urun Adi: " + urunAdi);//ürün adını yazdırır.
        System.out.println("Urun Fiyati: " + urunFiyati);//ürün fiyatını yazdırır.
        System.out.println("Uretici Adi: " + uretici.getAd());//ürünün üreticisini yazdırır.
        System.out.println("Uretici Soyadi: " + uretici.getSoyad());//ürünün üreticisinin soyadını yazdırır.
        System.out.println("Uretici Kullanici Adi: " + uretici.getKullaniciAdi());//ürünün üreticisinin kullanıcı adını yazdırır.
        System.out.println("Uretici Uyelik Tarihi: " + uretici.getUyelikTarihi());//ürünün üreticisinin üyelik tarihini yazdırır.
    }



}
