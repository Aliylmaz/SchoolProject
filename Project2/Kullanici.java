package Project2;

import java.sql.SQLOutput;
import java.util.AbstractList;
import java.util.Arrays;

/**
 * @file Kullanici
 * @description Bu kod sınıfı , premium kullanıcılara ve default kullanıcılara atama yapmak için kullanılır. sınıf abstract olduğu için bu sınıftan nesne oluşturulamaz.
 * @assignment Proje 2
 * @date 03/01/2023
 * @author Ali Yılmaz yilmazali170@gmail.com
 */

public abstract class Kullanici {
    private String ad;
    private String soyad;
    private String kullaniciAdi;
    private String UyelikTarihi;
    private Urun[] SatinAlinanUrunler;

    private Magaza[] TakipEttigiMagazalar;
    private Magaza[] BegendigiMagazalar;



    private Uretici[] BegendigiUreticiler;




    public Kullanici(String ad, String soyad, String kullaniciAdi, String UyelikTarihi) {
        this.ad = ad;

        this.soyad = soyad;
        this.kullaniciAdi = kullaniciAdi;
        this.UyelikTarihi = UyelikTarihi;
        this.SatinAlinanUrunler = new Urun[20];
        this.TakipEttigiMagazalar = new Magaza[50];
        this.BegendigiMagazalar = new Magaza[50];
        this.BegendigiUreticiler = new Uretici[50];


    }
    public Magaza[] getBegendigiMagazalar() {
        return BegendigiMagazalar;
    }

    public void setBegendigiMagazalar(Magaza[] begendigiMagazalar) {
        BegendigiMagazalar = begendigiMagazalar;
    }

    public Uretici[] getBegendigiUreticiler() {
        return BegendigiUreticiler;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getUyelikTarihi() {
        return UyelikTarihi;
    }

    public Urun[] getSatinAlinanUrunler() {
        return SatinAlinanUrunler;

    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public void setUyelikTarihi(String UyelikTarihi) {
        this.UyelikTarihi = UyelikTarihi;
    }

    public void setSatinAlinanUrunler(Urun[] SatinAlinanUrunler) {
        this.SatinAlinanUrunler = SatinAlinanUrunler;

    }

    public Magaza[] getTakipEttigiMagazalar() {
        return TakipEttigiMagazalar;
    }

    public void setTakipEttigiMagazalar(Magaza[] takipEttigiMagazalar) {
        TakipEttigiMagazalar = takipEttigiMagazalar;
    }


    public void UrunEkle(Urun urun, Magaza magaza) {

        if (kullaniciAdi.equals(this.getKullaniciAdi())) {
            for (int i = 0; i < SatinAlinanUrunler.length; i++) {//kullanıcı arrayi için
                if (SatinAlinanUrunler[i] == null) {//satınalınanurunler arrayinin boş olduğu yerlere ürün ekleniyor
                    SatinAlinanUrunler[i] = urun;
                    break;
                }
            }

            for (int i = 0; i < magaza.getSatilanUrunBilgisi().length; i++) {//magaza arrayi için
                if (magaza.getSatilanUrunBilgisi()[i] == null) {//satılan ürün bilgisi arrayinin boş olduğu yerlere ürün ekleniyor
                    magaza.getSatilanUrunBilgisi()[i] = urun;
                    break;
                }
            }


        }


    }

    public void UrunSil(Urun DelUrun, Magaza DelMagaza) {


        if (kullaniciAdi.equals(this.getKullaniciAdi())) {

            for (int i = 0; i < SatinAlinanUrunler.length; i++) {//Satın alınan ürünler lengthi kadar döngüye giriyor
                if (SatinAlinanUrunler[i] == DelUrun) {//satın alınan ürünler arrayinin i. elemanı urun eşitse
                    SatinAlinanUrunler[i] = null;//satın alınan ürünler arrayinin i. elemanı null oluyor
                    break;
                }

            }


            if (DelMagaza.getMagazaKodu().equals(DelMagaza.getMagazaKodu())) {//magaza kodları ve kullanıcı adı eşitse
                for (int i = 0; i < DelMagaza.getSatilanUrunBilgisi().length; i++) {//satılan ürün bilgisi arrayinin lengthi kadar döngüye giriyor
                    if (DelMagaza.getSatilanUrunBilgisi()[i] == DelUrun) {//satılan ürün bilgisi arrayinin i. elemanı urun eşitse
                        DelMagaza.getSatilanUrunBilgisi()[i] = null;//satılan ürün bilgisi arrayinin i. elemanı null oluyor
                        break;
                    }
                }


            } else {//eğer kullanıcı adı ve magaza kodu eşit değilse
                System.out.println("Kullanıcı bu ürünü başka bir mağazadan aldığı için silme işlemi gerçekleştirilmedi.");
            }
        }


    }

    public void UrunleriGoster() {
        //kullanıcı adı bastırıyoruz
        System.out.println(this.getKullaniciAdi() + " adlı kullanıcının sepetindeki ürünlerin bilgileri: ");
        System.out.println();
        //satın aldıgı ürünlerin bilgilerini bastırıyoruz
        for (Urun urun : SatinAlinanUrunler) {
            if (urun != null) {

                urun.UreticiBilgileri();//ürün üreticisinin bilgilerini bastırıyoruz
                System.out.println("-----------------------------");

            }
        }


        SepettekiUrunAdet();//sepetteki ürün adetini gösteriyoruz
        System.out.println("-----------------------------------");

    }


    public void printKullaniciInfo() {
        //kullanıcı bilgilerini bastırıyoruz
        System.out.println("------------------");
        System.out.println("Adı: " + this.getAd());
        System.out.println("Soyadı: " + this.getSoyad());
        System.out.println("Kullanıcı Adı: " + this.getKullaniciAdi());
        System.out.println("Üyelik Tarihi: " + this.getUyelikTarihi());

        System.out.println("Takip Ettiği Mağaza Sayisi: " + TakipEdilenMagazSayisi());
        System.out.println("Beğendiği Mağaza Sayisi: " + BegilenMagazaSayisi());

        for (int i = 0; i < SatinAlinanUrunler.length; i++) {
            //kullanıcının satın aldığı ürünlerin bilgilerini bastırıyoruz
            if (SatinAlinanUrunler[i] != null) {
                System.out.println("Satın Alınan Ürünler: " + SatinAlinanUrunler[i].getUrunAdi() + " " + SatinAlinanUrunler[i].getUrunFiyati() + " TL");

            }
        }

        SepettekiUrunAdet();
        for (int i=0;i< getBegendigiUreticiler().length;i++){
            if (getBegendigiUreticiler()[i]!=null){
                System.out.println("Beğendiği Üreticiler: "+getBegendigiUreticiler()[i].getAd()+" "+getBegendigiUreticiler()[i].getSoyad());
            }
        }
        if (this instanceof PremiumKullanici) {// bu metodu çağıran premium kullanıcı ise
            System.out.println("Kullanıcı Tipi: Premium Kullanıcı");

            ToplamAlisverisTutari();//toplam alışveriş tutarını gösteriyoruz
        } else {//bu metodu çağıran normal kullanıcı ise
            System.out.println("Kullanıcı Tipi: Standart Kullanıcı");
            ToplamAlisverisTutari();//toplam alışveriş tutarını gösteriyoruz
        }
        System.out.println("------------------");
    }


    public void ToplamAlisverisTutari() {
        //kullanıcının satın aldığı ürünlerin fiyatlarını topluyoruz
        int toplam = 0;
        for (int i = 0; i < SatinAlinanUrunler.length; i++) {//SatinAlinanUrunler arrayinin boyutu kadar dönüyoruz
            if (SatinAlinanUrunler[i] != null) {//arrayin boş olmadığı yerlerdeki ürünlerin fiyatlarını topluyoruz
                toplam += SatinAlinanUrunler[i].getUrunFiyati();
            }


        }
        if (this instanceof PremiumKullanici) {//bu metodu çağıran premium kullanıcı ise
            System.out.println("Eski Alışveriş Tutarı: " + toplam + " TL");//eski alışveriş tutarını bastırıyoruz
            System.out.println("İndirimli Alışveriş Tutarı: " + toplam * 0.8 + " TL");//indirimli alışveriş tutarını bastırıyoruz
            System.out.println("Premium Kullanıcı olduğunu için %20 indirim uygulandı.");//indirim uygulandığını belirtiyoruz
        } else {//bu metodu çağıran normal kullanıcı ise
            if (toplam > 1000) {//toplam alışveriş tutarı 1000 TL den büyükse
                System.out.println("Eski Alışveriş Tutarı: " + toplam + " TL");//eski alışveriş tutarını bastırıyoruz
                System.out.println("İndirimli Alışveriş Tutarı: " + toplam * 0.9 + " TL");//indirimli alışveriş tutarını bastırıyoruz
                System.out.println("1000 TL üzeri alışveriş yaptığınız için %10 indirim uygulandı.");//indirim uygulandığını belirtiyoruz
            } else {
                System.out.println("Toplam Alışveriş Tutarı: " + toplam + " TL");//1000 TL den küçükse indirim uygulanmadığı için toplam alışveriş tutarını bastırıyoruz
            }

        }


    }

    //Sepetteki kaç tane  ürün oldugunu gösteriyoruz
    public void SepettekiUrunAdet() {
        int adet = 0;
        for (int i = 0; i < SatinAlinanUrunler.length; i++) {//SatınAlinanUrunler dizisindeki elemanları geziyoruz
            if (SatinAlinanUrunler[i] != null) {//boş değilse
                adet++;//adet arttırıyoruz
            }
        }
        System.out.println(getKullaniciAdi() + " Alınan ürün miktarı : " + adet);
    }

    public int AlinanUrunMiktari() {//Alınan ürün miktarını döndürüyoruz
        int adet = 0;
        for (int i = 0; i < SatinAlinanUrunler.length; i++) {//SatınAlinanUrunler dizisindeki elemanları geziyoruz
            if (SatinAlinanUrunler[i] != null) {//boş değilse
                adet++;//adet arttırıyoruz
            }
        }

        return adet;
    }

    public void MagazaTakipEtme(Magaza magaza) {
        // kullanıcının haberi olması için
        for (int i = 0; i < this.getTakipEttigiMagazalar().length; i++) {//takipEttigiMagazalar dizisindeki elemanları geziyoruz
            if (this.getTakipEttigiMagazalar()[i] == null) {//boş ise
                this.getTakipEttigiMagazalar()[i] = magaza;//magaza nesnesini atıyoruz

                break;
            }
        }
        //magazanın haberi olması için
        for (int i = 0; i < magaza.getTakipEdenKullanicilar().length; i++) {//magaza nesnesinin takipEdenKullanicilar dizisindeki elemanları geziyoruz
            if (magaza.getTakipEdenKullanicilar()[i] == null) {//boş ise
                magaza.getTakipEdenKullanicilar()[i] = this;//kullanıcı nesnesini atıyoruz
                //  System.out.println(kullanici.getKullaniciAdi()+" "+magaza.getMagazaAdi()+" magazasını beğendi.");
                break;
            }
        }

    }

    //takip edilen mağaza sayısını döndürüyoruz
    public int TakipEdilenMagazSayisi() {

        int sayac = 0;
        for (int i = 0; i < getTakipEttigiMagazalar().length; i++) {//takipEttigiMagazalar dizisindeki elemanları geziyoruz
            if (getTakipEttigiMagazalar()[i] != null) {//boş değilse
                sayac++;//sayacı arttırıyoruz
            }
        }
        return sayac;
    }

    public void MagazaBegenme(Magaza magaza) {//magaza beğenme
        // kullanıcının haberi olması için
        for (int i = 0; i < getBegendigiMagazalar().length; i++) {//begendigiMagazalar dizisindeki elemanları geziyoruz
            if (this.getBegendigiMagazalar()[i] == null) {//boş ise
                getBegendigiMagazalar()[i] = magaza;//magaza nesnesini atıyoruz
                break;
            }
        }
        //magazanın haberi olması için
        for (int i = 0; i < magaza.getMagazayiBegenenKullanicilar().length; i++) {//magaza nesnesinin magazayiBegenenKullanicilar dizisindeki elemanları geziyoruz
            if (magaza.getMagazayiBegenenKullanicilar()[i] == null) {//boş ise
                magaza.getMagazayiBegenenKullanicilar()[i] = this;//kullanıcı nesnesini atıyoruz

                break;
            }
        }

    }

    public int BegilenMagazaSayisi() {
        int sayac = 0;
        for (int i = 0; i < getBegendigiMagazalar().length; i++) {//begendigiMagazalar dizisindeki elemanları geziyoruz
            if (getBegendigiMagazalar()[i] != null) {//boş değilse
                sayac++;//sayacı arttırıyoruz
            }
        }

        return sayac;
    }

    public void UrunDegistirme(Urun eskiurun, Urun yeniUrun, Magaza magaza) {

        if (magaza.getMagazaKodu().equals(magaza.getMagazaKodu())) {//magaza kodları eşitse
            for (int i = 0; i < magaza.getSatilanUrunBilgisi().length; i++) {//magaza nesnesinin satilanUrunBilgisi dizisindeki elemanları geziyoruz
                if (magaza.getSatilanUrunBilgisi()[i] == eskiurun) {//eski ürününse
                    magaza.getSatilanUrunBilgisi()[i] = yeniUrun;// yerine yeni ürünü atıyoruz
                    break;
                }
            }
        } else {
            //magaza kodları eşit değilse
            System.out.println("Bu ürün bu mağazada bulunmamaktadır.");
        }
        for (int i = 0; i < SatinAlinanUrunler.length; i++) {//SatınAlinanUrunler dizisindeki elemanları geziyoruz
            if (SatinAlinanUrunler[i] == eskiurun) {//eski ürününse
                SatinAlinanUrunler[i] = yeniUrun;// yerine yeni ürünü atıyoruz
                break;
            }
        }
    }
    public void UreticiBegenme(Uretici uretici){
        for (int i = 0; i < getBegendigiUreticiler().length; i++) {//begendigiUreticiler dizisindeki elemanları geziyoruz
            if (getBegendigiUreticiler()[i] == null) {//boş ise
                getBegendigiUreticiler()[i] = uretici;//uretici nesnesini atıyoruz
                break;
            }
        }
        for (int i = 0; i < uretici.getBegenenKullanicilar().length; i++) {//uretici nesnesinin getBegenenKullanicilar dizisindeki elemanları geziyoruz
            if (uretici.getBegenenKullanicilar()[i] == null) {//boş ise
                uretici.getBegenenKullanicilar()[i] = this;//kullanıcı nesnesini atıyoruz
                break;
            }
        }



    }



}
