package Project2;

/**
 * @file PremiumKullanici
 * @description Bu kod sınıfı, premium kullanıcıları oluşturmak için kullanılır.
 * @assignment Proje 2
 * @date 06/01/2023
 * @author Ali Yılmaz yilmazali170@gmail.com
 */
public class PremiumKullanici extends Kullanici {
    //extends ile kullanici classından aldığımız değişkenleri kullanıcı adı soyadı gibi değişkenleri burada tanımlıyoruz
    public PremiumKullanici(String ad, String soyad, String kullaniciAdi, String UyelikTarihi) {
        super(ad, soyad, kullaniciAdi, UyelikTarihi);
    }

    @Override//override ile üstteki classın içindeki metodu burada kullanıyoruz
    public void UrunEkle(Urun urun, Magaza magaza) {
        super.UrunEkle(urun, magaza);



    }



}
