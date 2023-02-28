package Project2;
import java.util.Arrays;


/**
 * @file Magaza
 * @description Bu kod sınıfı, magazaları oluşturmak için kullanılır.
 * @assignment Proje 2
 * @date 03/01/2023
 * @author Ali Yılmaz yilmazali170@gmail.com
 */
public class Magaza {

    private String magazaAdi;
    private String magazaAdresi;
    private String magazaKodu;
    private String KuruslusTarihi;
    private Kullanici[] TakipEdenKullanicilar;
    private Kullanici[] MagazayiBegenenKullanicilar;
    private Urun[] SatilanUrunBilgisi;




    public String getMagazaAdi() {
        return magazaAdi;
    }

    public String getMagazaAdresi() {
        return magazaAdresi;
    }

    public String getMagazaKodu() {
        return magazaKodu;
    }

    public String getKuruslusTarihi() {
        return KuruslusTarihi;
    }

    public Urun[] getSatilanUrunBilgisi() {
        return SatilanUrunBilgisi;
    }

    public Kullanici[] getMagazayiBegenenKullanicilar() {
        return MagazayiBegenenKullanicilar;

    }

    public Kullanici[] getTakipEdenKullanicilar() {
        return TakipEdenKullanicilar;
    }



    public void setMagazaAdi(String magazaAdi) {
        this.magazaAdi = magazaAdi;
    }

    public void setMagazaAdresi(String magazaAdresi) {
        this.magazaAdresi = magazaAdresi;
    }

    public void setMagazaKodu(String magazaKodu) {
        this.magazaKodu = magazaKodu;
    }

    public void setKuruslusTarihi(String KuruslusTarihi) {
        this.KuruslusTarihi = KuruslusTarihi;
    }

    public void setSatilanUrunBilgisi(String SatilanUrunBilgisi) {
        this.SatilanUrunBilgisi = new Urun[SatilanUrunBilgisi.length()];
    }

    public void setMagazayiBegenenKullanicilar(Kullanici[] magazayiBegenenKullanicilar) {
        MagazayiBegenenKullanicilar = magazayiBegenenKullanicilar;
    }

    public void setTakipEdenKullanicilar(Kullanici[] takipEdenKullanicilar) {
        TakipEdenKullanicilar = takipEdenKullanicilar;
    }



    public void setSatilanUrunBilgisi(Urun[] satilanUrunBilgisi) {
        SatilanUrunBilgisi = satilanUrunBilgisi;
    }


    public Magaza(String magazaAdi, String magazaAdresi, String magazaKodu, String KuruslusTarihi) {
        this.magazaAdi = magazaAdi;
        this.magazaAdresi = magazaAdresi;
        this.magazaKodu = magazaKodu;
        this.KuruslusTarihi = KuruslusTarihi;
        this.MagazayiBegenenKullanicilar = new Kullanici[50];
        Kullanici[] satinAlinanUrunler = new Kullanici[50];
        this.SatilanUrunBilgisi = new Urun[satinAlinanUrunler.length];
        this.TakipEdenKullanicilar = new Kullanici[50];


    }

    public void printMagazaInfo() {     //Magaza bilgilerini yazdırır.
        System.out.println("------------------");
        System.out.println("Magaza Adi: " + this.magazaAdi); //Magaza adını yazdırır.
        System.out.println("Magaza Adresi: " + this.magazaAdresi);//Magaza adresini yazdırır.
        System.out.println("Magaza Kodu: " + this.magazaKodu);//Magaza kodunu yazdırır.
        System.out.println("Kuruslus Tarihi: " + this.KuruslusTarihi);//Kuruslus tarihini yazdırır.
        System.out.println("Takipci Sayisi: " + this.takipedenKullaniciSayisi());//Takipçi sayısını yazdırır.
        System.out.println("Beğeni Sayisi: " + (this.BegenenKullaniciSayisi()));//Beğeni sayısını yazdırır.
        YapilanSatisSayisiniGoster();//Yapılan satış sayısını yazdırır.
        for (int i = 0; i < SatilanUrunBilgisi.length; i++) {//Satılan ürün bilgilerini yazdırır.
            if (SatilanUrunBilgisi[i] != null) {
                System.out.println("Satilan Urun Bilgisi: " + SatilanUrunBilgisi[i].getUrunAdi());
            }
        }

        System.out.println("------------------");
    }


    public void YapilanSatisSayisiniGoster() {//Yapılan satış sayısını yazdırır.
        int sayac = 0;
        for (int i = 0; i < this.SatilanUrunBilgisi.length; i++) {//satılan ürün length kadar döner.
            if (this.SatilanUrunBilgisi[i] != null) {//satılan ürün null değilse sayacı 1 arttırır.
                sayac++;

            }

        }
        System.out.println("Yapilan Satis Sayisi: " + sayac);
    }

    public int takipedenKullaniciSayisi() {//Takipçi sayısını yazdırır.
        int sayac = 0;
        for (int i = 0; i < this.TakipEdenKullanicilar.length; i++) {//Takipçi length kadar döner.
            if (this.TakipEdenKullanicilar[i] != null) {//Takipçi null değilse sayacı 1 arttırır.
                sayac++;
            }
        }
        return sayac;
    }

    public int BegenenKullaniciSayisi() {//Beğeni sayısını yazdırır.
        int sayac = 0;
        for (int i = 0; i < this.MagazayiBegenenKullanicilar.length; i++) {//Beğeni length kadar döner.
            if (this.MagazayiBegenenKullanicilar[i] != null) {//Beğeni null değilse sayacı 1 arttırır.
                sayac++;
            }
        }

        return sayac;

    }





}
