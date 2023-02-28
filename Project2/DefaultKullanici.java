package Project2;

/**
 * @file DefaultKullanici
 * @description Bu kod sınıfı, default kullanıcıları oluşturmak için kullanılır.
 * @assignment Proje 2
 * @date 06/01/2023
 * @author Ali Yılmaz yilmazali170@gmail.com
 */
public class DefaultKullanici extends Kullanici {

    //extends ile kullanici classından aldığımız değişkenleri kullanıcı adı soyadı gibi değişkenleri burada tanımlıyoruz
    public DefaultKullanici(String ad, String soyad, String kullaniciAdi, String UyelikTarihi) {
        super(ad, soyad, kullaniciAdi, UyelikTarihi);


    }

    @Override//override ile üstteki classın içindeki metodu burada kullanıyoruz
    public void UrunEkle(Urun urun, Magaza magaza) {
        super.UrunEkle(urun, magaza);


    }

}
