package Project2;
/**
 * @file Test
 * @description Bu kod sınıfı, tüm sınıfların nesnelerini oluşturmak için ve atamaları yapmak için kullanılır.
 * @assignment Proje 2
 * @date 06/01/2023
 * @author Ali Yılmaz yilmazali170@gmail.com
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Magaza magaza1 = new Magaza("ali bilgisayar", "İstanbul", "AB123", "15.11.2018");
        Magaza magaza2 = new Magaza("zuli bilgisayar", "ankara", "DB123", "06.03.2013");
        Magaza magaza3 = new Magaza("veli bilgisayar", "izmir", "CB123", "09.04.2010");
        Uretici uretici = new Uretici("vehdi", "parlak", "vehdiparlak", "01.01.2015");
        Uretici uretici2 = new Uretici("Kasım", "satıcı", "Kasimsatici", "21.08.2019");
        PremiumKullanici premiumKullanici = new PremiumKullanici("mehmet", "yarım", "mehmetyarim", "19.06.2020");
        DefaultKullanici defaultKullanici = new DefaultKullanici("ali", "yılmaz", "aliyilmaz", "26.04.2003");
        PremiumKullanici premiumKullanici2 = new PremiumKullanici("abdullah", "mengü", "abdullahmengü", "15.02.2014");
        DefaultKullanici defaultKullanici2 = new DefaultKullanici("Sevim", "şahin", "Sevimşahin", "05.04.2011");


        //magazaları takip ve beğenme işlemleri
        premiumKullanici.MagazaBegenme(magaza1);
        premiumKullanici.MagazaBegenme(magaza2);
        premiumKullanici2.MagazaBegenme(magaza1);
        premiumKullanici2.MagazaBegenme(magaza2);
        defaultKullanici.MagazaBegenme(magaza1);
        defaultKullanici.MagazaBegenme(magaza3);
        defaultKullanici2.MagazaBegenme(magaza1);
        premiumKullanici.MagazaTakipEtme(magaza1);
        premiumKullanici2.MagazaTakipEtme(magaza2);
        premiumKullanici2.MagazaTakipEtme(magaza1);
        defaultKullanici.MagazaTakipEtme(magaza1);
        defaultKullanici2.MagazaTakipEtme(magaza3);

        //Uretici beğenme ve işlemleri
        premiumKullanici.UreticiBegenme(uretici);
        premiumKullanici2.UreticiBegenme(uretici);
        defaultKullanici.UreticiBegenme(uretici);
        defaultKullanici2.UreticiBegenme(uretici2);
        premiumKullanici.UreticiBegenme(uretici2);
        premiumKullanici2.UreticiBegenme(uretici2);


        // Urunlerimizi oluşturuduk
        Urun urun1 = new Urun("lAPTOP", 1000, uretici);
        Urun urun2 = new Urun("MONİTOR", 300, uretici);
        Urun urun3 = new Urun("Klavye", 100, uretici2);
        Urun urun4 = new Urun("Mouse", 50, uretici2);
        Urun urun5 = new Urun("Kulaklık", 70, uretici);
        Urun urun6 = new Urun("Şarj Aleti", 40, uretici2);
        Urun urun7 = new Urun("Kulaklık", 70, uretici2);
        Urun urun8 = new Urun("Tablet", 400, uretici);
        Urun urun9 = new Urun("Mikrofon", 90, uretici2);
        Urun urun10 = new Urun("Oyuncu Koltuğu", 250, uretici2);



        Uretici[] ureticiListesi = {uretici, uretici2};
        Magaza[] magazalar = {magaza1, magaza2, magaza3};//magazalar arrayi oluşturduk
        Kullanici[] musteriler = {premiumKullanici, defaultKullanici, premiumKullanici2, defaultKullanici2};//müşteriler arrayi oluşturduk
        Urun[] urunler = {urun1, urun2, urun3, urun4, urun5, urun6, urun7, urun8, urun9, urun10};//urunler arrayi oluşturduk
        //kullanıcılara urunleri ekledik.




        premiumKullanici.UrunEkle(urun1, magaza1);
        premiumKullanici.UrunEkle(urun2, magaza1);
        premiumKullanici.UrunEkle(urun3, magaza2);
        premiumKullanici.UrunEkle(urun4, magaza2);
        premiumKullanici2.UrunEkle(urun5, magaza2);
        premiumKullanici2.UrunEkle(urun6, magaza3);
        premiumKullanici2.UrunEkle(urun6, magaza3);
        defaultKullanici.UrunEkle(urun1, magaza3);
        defaultKullanici.UrunEkle(urun7, magaza3);
        defaultKullanici.UrunEkle(urun8, magaza1);
        defaultKullanici2.UrunEkle(urun9, magaza1);
        //kullanıcımın sepetinde o ürün varsa ve  satınalınan ürün o magazadan alınmışsa o ürün varsa silme işlemi yapılacak.
        defaultKullanici2.UrunSil(urun9, magaza1);
        defaultKullanici2.UrunEkle(urun10, magaza1);
        defaultKullanici2.UrunEkle(urun10, magaza1);
        defaultKullanici2.UrunDegistirme(urun10, urun1, magaza1);


        //switch case ile kullanıcıya seçenekler sunuyoruz.Daha şık bir görüntü ve kolay denenmesi için  böyle yaptım.


        int sayi;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-------------------");
            System.out.println("1-Adı girilen kullanıcının bilgilerinin listelenmesi");
            System.out.println("2-Adı girilen mağazanın bilgilerinin listelenmesi");
            System.out.println("3-Adı girilen kullanıcının sepetindeki ürün bilgilerinin listelenmesi");
            System.out.println("4-En çok takipçiye sahip olan mağazanın bilgilerinin listelenmesi");
            System.out.println("5-En çok alışveriş yapan kullanıcının bilgilerinin listelenmesi");
            System.out.println("6-Tüm mağazalar arasından maksimum ve minimum beğeni alan mağazaların bilgilerinin listelenmesi");
            System.out.println("7-Oluşturulan tüm kullanıcıların sepetleri içerisindeki ürünler arasından tutarı maksimum ve minimum olan ürünün bilgilerin listelenmesi");
            System.out.println("8-Karmaşık String Taraması yapma ");
            System.out.println("9-Uretici bilglerini ve beğenen kullanıcıları listeleme");
            System.out.println("0-Çıkış");
            System.out.println("-------------------");
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz :");
            sayi = scanner.nextInt();


            switch (sayi) {
                case 1:
                    //for döngüsüyle dönüp musteriler arrayimizdeki kullanıcıların bilgilerini bastırıyoruz.
                    for (Kullanici musteri : musteriler) {
                        musteri.printKullaniciInfo();
                    }


                    break;
                case 2:
                    //for döngüsüyle dönüp magazalar arrayimizdeki magazaların bilgilerini bastırıyoruz.
                    for (Magaza magaza : magazalar) {
                        magaza.printMagazaInfo();
                    }
                    break;
                case 3:
                    //Kullaniciların aldığı ürünler ve üreticileri hakkında bilgieri bastırıyoruz

                    for (Kullanici kullanici : musteriler) {
                        kullanici.UrunleriGoster();


                    }


                    break;
                case 4:
                    int max = Integer.MIN_VALUE;
                    System.out.println("En çok takipçiye sahip olan mağaza :");
                    for (Magaza magaza : magazalar) { //forla dolanıp max değeri buluyoruz.
                        if (magaza.takipedenKullaniciSayisi() > max) {//magaza classındaki takipedenKullaniciSayisi metodunu çağırıp max değerini buluyoruz.
                            max = magaza.takipedenKullaniciSayisi();
                        }
                    }
                    //max değeri bulduktan sonra forla dolanıp max değerine eşit olanları bastırıyoruz.
                    for (Magaza magaza : magazalar) {
                        if (magaza.takipedenKullaniciSayisi() == max) {
                            magaza.printMagazaInfo();
                        }
                    }


                    break;
                case 5:


                    int max2 = Integer.MIN_VALUE;
                    for (Kullanici musteri : musteriler) {
                        if (musteri.AlinanUrunMiktari() > max2) {//Kullanıcı classındaki AlinanUrunMiktari metodunu çağırıp max değerini buluyoruz.
                            max2 = musteri.AlinanUrunMiktari();

                        }
                    }
                    for (Kullanici musteri : musteriler) {
                        if (musteri.AlinanUrunMiktari() == max2) {//max değeri bulduktan sonra forla dolanıp max değerine eşit OLANI bastırıyoruz.
                            System.out.println("En çok alışveriş yapan kullanıcı :");
                            musteri.printKullaniciInfo();
                        }
                    }


                    break;
                case 6:
                    int max1 = Integer.MIN_VALUE;
                    int min1 = Integer.MAX_VALUE;
                    for (Magaza magaza : magazalar) {
                        if (magaza.BegenenKullaniciSayisi() > max1) {//magaza classındaki BegenenKullaniciSayisi metodunu çağırıp max değerli magazayı buluyoruz.
                            max1 = magaza.BegenenKullaniciSayisi();
                        }
                        if (magaza.BegenenKullaniciSayisi() < min1) {//magaza classındaki BegenenKullaniciSayisi metodunu çağırıp min değerli magazayı buluyoruz.
                            min1 = magaza.BegenenKullaniciSayisi();
                        }

                    }
                    for (Magaza magaza : magazalar) {
                        if (magaza.BegenenKullaniciSayisi() == max1) {
                            System.out.println("En çok beğeni alan mağaza :");//max değeri bulduktan sonra forla dolanıp max değerine eşit olanı bastırıyoruz.
                            magaza.printMagazaInfo();
                        }
                        if (magaza.BegenenKullaniciSayisi() == min1) {
                            System.out.println("En az beğeni alan mağaza :");//min değeri bulduktan sonra forla dolanıp min değerine eşit olanı bastırıyoruz.
                            magaza.printMagazaInfo();
                        }
                    }


                    break;

                case 7:

                    double max3 = Integer.MIN_VALUE;
                    double min3 = Integer.MAX_VALUE;
                    for (Urun urun : urunler) {
                        if (urun.getUrunFiyati() > max3) {//urun classındaki getUrunFiyati metodunu çağırıp max değerli ürünü buluyoruz.
                            max3 = urun.getUrunFiyati();
                        }
                        if (urun.getUrunFiyati() < min3) {//urun classındaki getUrunFiyati metodunu çağırıp min değerli ürünü buluyoruz.
                            min3 = urun.getUrunFiyati();
                        }
                    }

                    for (Urun urun : urunler) {
                        //max değeri bulduktan sonra forla dolanıp max değerine eşit olanı bastırıyoruz.
                        if (urun.getUrunFiyati() == max3) {
                            System.out.println("En yüksek fiyatlı ürün :");
                            urun.printUrunInfo();

                            System.out.println("-------------------");
                        }
                        //min değeri bulduktan sonra min değerine eşit olanı bastırıyoruz.
                        if (urun.getUrunFiyati() == min3) {
                            System.out.println("En düşük fiyatlı ürün :");
                            urun.printUrunInfo();
                        }
                    }


                    break;
                case 8:

                    boolean found = false;

                    for (Kullanici kullanici : musteriler) {
                       //kullanıcıları for ile dolaşıp ad taraması yapıyoruz.
                        if (kullanici.getAd().charAt(0) == 'a' && kullanici.getAd().contains("dul") || kullanici.getAd().contains("hme") && kullanici.getAd().charAt(kullanici.getAd().length() - 1) == 't') {
                            kullanici.printKullaniciInfo();//adı a ile başlayıp dul veya hme içeren ve son harfi t olanları bastırıyoruz.
                            found = true;
                        }

                    }


                    if (!found) {//eğer bulamazsa bulunamadı yazdırıyoruz.
                        System.out.println("Aradığınız kullanıcı bulunamadı");
                    }

                    break;
                case 9:
                    for (Uretici ureticiler : ureticiListesi) {//uretici bilgileri ve beğenen kullanıcıları görmek için
                        ureticiler.printUretici();//ureticileri for ile dolaşıp printUreticiInfo metodunu çağırıyoruz.
                        System.out.println("-------------------");
                    }
                    break;
                case 0://çıkış
                    System.out.println("Güle Güle !");
                    break;
            }


        } while (sayi != 0);


    }
}
