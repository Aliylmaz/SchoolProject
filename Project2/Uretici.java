package Project2;
/**
 * @file Uretici
 * @description Bu kod sınıfı, üreticileri oluşturmak için kullanılır.
 * @assignment Proje 2
 * @date 03/01/2023
 * @author Ali Yılmaz yilmazali170@gmail.com
 */

public class Uretici extends Kullanici {

//extends ile kullanici classından aldığımız değişkenleri kullanıcı adı soyadı gibi değişkenleri burada tanımlıyoruz

    private Kullanici[] BegenenKullanicilar;

    public Kullanici[] getBegenenKullanicilar() {
        return BegenenKullanicilar;
    }

    public Uretici(String ad, String soyad, String kullaniciAdi, String UyelikTarihi) {
        super(ad, soyad, kullaniciAdi, UyelikTarihi);
        this.BegenenKullanicilar = new Kullanici[50];

    }
    public void printUretici(){
        System.out.println("Uretici adi: "+getAd());
        System.out.println("Uretici soyadi: "+getSoyad());
        System.out.println("Uretici kullanici adi: "+getKullaniciAdi());
        System.out.println("Uretici uyelik tarihi: "+getUyelikTarihi());
      for (int i = 0; i < BegenenKullanicilar.length; i++) {
            if (BegenenKullanicilar[i] != null) {
                System.out.println("Ureticiyi beğenen kullanicilar: " + BegenenKullanicilar[i].getKullaniciAdi());
            }
        }
    }


}

