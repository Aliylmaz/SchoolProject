import java.util.Scanner;

public class Project {
    public static boolean Durdurma(String durdurma) {

        return durdurma.equals("DUr") || durdurma.equals("dur") || durdurma.equals("DUR") || durdurma.equals("dUR") ||
                durdurma.equals("DuR") || durdurma.equals("duR") || durdurma.equals("dUr") || durdurma.equals("Dur");
    }


    public static void main(String[] args) {

        Menu();
    }

    public static String buyukHarfeCevir(String input) {
        input = "" + input;
        String convert = "";
        for (int i = 0; i < input.length(); i++) {//for dögüsü içindeki i değişkeni inputun uzunluğu kadar dönecek
            char ch = input.charAt(i);//inputun i. karakterini ch değişkenine atadık


            if (ch == input.charAt(0)) {//eğer ch değişkeni inputun ilk karakterine eşitse
                convert += (char) (ch - 32);//  convert değişkenine ch değişkeninin değerini büyük harfe çevirip atadık

                if (ch > 'A' && ch < 'Z') {//eğer ch değişkeni A-Z arasında ise
                    convert += ch;

                }


            } else if (ch == ' ') {//eğer ch değişkeni boşluk karakterine eşitse
                convert = convert + ch;//convert değişkenine ch değişkeninin değerini atadık
                i++;//i değişkenini 1 arttırdık
                ch = input.charAt(i);//inputun i. karakterini ch değişkenine atadık
                convert += (char) (ch - 32);//  convert değişkenine ch değişkeninin değerini büyük harfe çevirip atadık

                if (ch >= 'A' && ch <= 'Z') {//eğer ch değişkeni A-Z arasında ise
                    convert += ch;
                }
            } else {//eğer hiçbir şart sağlanmazsa

                convert += ch;//convert değişkenine ch değişkeninin değerini atadık
            }
        }

        System.out.println(convert);
        return convert;
    }


    public static String KarakterDizisiCizdir(String input) {

        for (int i = 1; i < input.length(); i++) {
            char values = input.charAt(i); //values değişkeni inputun i. karakreri kadar dönecek
            char rakam = input.charAt(i - 1);//    ascii degerler döndürür

            if (values == 'b') { //b harfi girildiğinde

                if (rakam > 48 && rakam <= 57) {  // rakam girildiğinde
                    int rakam1 = rakam - 48;    // 1-9 arası rakama ulaşırız.
                    for (int j = 0; j < rakam1; j++) {  // girilen rakam kadar döner
                        System.out.print(" ");  // ve o kadar boşluk yazdırır
                    }
                } else {
                    System.out.print(" ");
                }

            } else if (values == 's') {


                if (rakam > 48 && rakam <= 57) { // 1 ile 9 arasındaki rakamları sorgulama.
                    int rakam1 = rakam - 48;
                    for (int j = 0; j < rakam1; j++) {
                        System.out.print("*");
                    }
                } else {


                    System.out.print("*");

                }
                // Aynı işlemler
            } else if (values == 'n') {


                if (rakam > 48 && rakam <= 57) {
                    int rakam1 = rakam - 48;
                    for (int j = 0; j < rakam1; j++) {
                        System.out.print("\n");
                    }
                } else {
                    System.out.print("\n");
                }
                // Aynı işlemler
            } else if (values == 't') {

                if (rakam > 48 && rakam <= 57) {
                    int rakam1 = rakam - 48;
                    for (int j = 0; j < rakam1; j++) {
                        System.out.print("\t");
                    }
                } else {
                    System.out.print("\t");
                }
            }


        }

        return input;

    }


    public static String sifreleCoz(String input, int kaydirma_degeri) {

        if ((kaydirma_degeri > -25 && kaydirma_degeri < -1) || kaydirma_degeri < 25 && kaydirma_degeri > 1) {//kaydırma değeri 1 ile 25 arasında ise
            char ch = 0;
            if (kaydirma_degeri > 0) {


                String encrypMsg = "";


                for (int i = 0; i < input.length(); i++) {
                    ch = input.charAt(i);


                    if ((int) input.charAt(i) == 32) {
                        encrypMsg += (char) 32; // boşluk karakteri
                        ch = encrypMsg.charAt(i);
                    } else if ((int) input.charAt(i) + kaydirma_degeri > 122) { //eğer inputun i. karakterinin ascii değeri 122 den büyükse
                        int temp = ((int) input.charAt(i) + kaydirma_degeri) - 122;  // 122 den büyükse 122 den çıkarıp temp değişkenine atadık.
                        encrypMsg += (char) (96 + temp);
                        ch = encrypMsg.charAt(i);


                    } else if ((int) input.charAt(i) + kaydirma_degeri > 90 && (int) input.charAt(i) < 96) { // eğer z ye ulaşmışsa ve büyük harf ise a ya döndürür
                        int temp = ((int) input.charAt(i) + kaydirma_degeri) - 90;  // 90 dan büyükse 90 dan çıkarıp temp değişkenine atadık.
                        encrypMsg += (char) (64 + temp);
                        ch = encrypMsg.charAt(i);

                    } else {
                        encrypMsg += (char) ((int) input.charAt(i) + kaydirma_degeri); // değerleri kaydırma değeri kadar arttırır
                        ch = encrypMsg.charAt(i);

                    }


                    if (ch > 96) { //büyük harfe çevirme

                        ch -= 32;
                    }
                    if (ch == 32) {
                        System.out.print("");
                    }
                    System.out.print(ch);

                }


            } else {
                String decrypMsg = "";

                for (int i = 0; i < input.length(); i++) {

                    if ((int) input.charAt(i) == 32) { // boşluk karakteri için kontrol yapıyoruz
                        decrypMsg += (char) 32;
                    } else if (((int) input.charAt(i) + kaydirma_degeri) < 97 && ((int) input.charAt(i) + kaydirma_degeri) > 90) {// küçük harf için kontrol yapıyoruz ve büyük harf ise aşağıdaki if bloğuna giriyor.
                        //KUCUK HARF
                        int temp = ((int) input.charAt(i) + kaydirma_degeri) + 26; // 26 harf sayısı olduğu için 26 ekliyoruz.
                        decrypMsg += (char) temp;
                    } else if ((input.charAt(i) + kaydirma_degeri) < 65) { // büyük harf için kontrol yapıyoruz ve küçük harf ise yukarıdaki if bloğuna giriyor.
                        // BUYUK HARF
                        int temp = ((int) input.charAt(i) + kaydirma_degeri) + 26;
                        decrypMsg += (char) temp;
                    } else {
                        decrypMsg += (char) ((int) input.charAt(i) + kaydirma_degeri);  // eğer hiçbir şart sağlanmazsa normal olarak karakteri kaydırıyoruz.
                    }

                }

                System.out.println("Şifrelenmiş metin :" + decrypMsg);

            }


        }
        return input;
    }

    public static void SecimEkrani() {

        //String menu = "Menu :\n 1. Karakter dizisini çizdir.\n 2. Büyük harfe çevir.\n 3. Şifrele ve şifre çöz. \n 4. Harf çiz\n";
        Scanner sc = new Scanner(System.in);


        System.out.print("Lütfen bir işlem seçiniz :");
        String secim = sc.nextLine();


        String temp = null;
        char deger = 0;
        do {


            switch (secim) {
                //bu bölümde her bir case için bir fonksiyon yazdım. ve fonksiyonları çağırdım. Ardından da fonksiyonlarda işlemleri yaptırdım. Sonrasında menüyü tekrar gösterdim.
                case "1" -> {

                    System.out.print("Bir dizi karakter giriniz:");
                    String input = sc.next();
                    KarakterDizisiCizdir(input);
                    System.out.println();

                }
                case "2" -> {
                    Scanner tarayici = new Scanner(System.in);
                    System.out.print("Cümle giriniz :");
                    String cevirme = tarayici.nextLine();
                    buyukHarfeCevir(cevirme);
                    System.out.println();

                }
                case "3" -> {
                    Scanner scn = new Scanner(System.in);
                    System.out.print("Bir cümle giriniz :");
                    String giris = scn.nextLine();
                    System.out.print("Kaydırma değeri giriniz : ");
                    int kaydirma_degeri = scn.nextInt();
                    sifreleCoz(giris, kaydirma_degeri);
                    System.out.println();

                }
                case "4" -> {
                    int boyut = 0;
                    String karakter;

                    while (true) {//while döngüsü içerisinde bir değişken tanımladım. Bu değişkeni kullanıcıdan alacağımız değerlerle karşılaştırdım.

                        System.out.print("Bir karakter giriniz :");
                        karakter = sc.next();
                        if ((karakter.equals("Z") || karakter.equals("X"))) { // karakter eşitliği sorgulama.

                            break;

                        } else {
                            System.out.println("Girilen karakter geçersiz");
                        }

                    }
                    while (true) {// bu while döngüsü sayesinde kullanıcı yanlış bir değer girerse tekrar girmesini sağlıyoruz.
                        System.out.print("Bir boyut değeri giriniz :");
                        boyut = sc.nextInt();
                        if ((boyut % 2 == 1 && boyut >= 5)) { // boyut değeri sorgulaması
                            break;
                        } else {
                            System.out.println("Geçerli değil");

                        }
                    }

                    System.out.println();
                    harfCizdir(karakter, boyut);


                }
            }
            if (!(Durdurma(secim))) {// bu kısımda ise kullanıcı yanlış bir değer girdiğinde menüyü tekrar göstermesini sağladım.

                Menu();
                break;
            }


        } while (!(Durdurma(secim)));// bu kısımda dur komutlarının farklı kombinasyonlarını girince durdurmayı yaptım.
    }


    public static void Menu() {
        //Menu için farklı bir metot oluşturup içerisinde menüyü yazdırdım. Ardından da menüden seçim yapılması için bir fonksiyon çağırdım. Bu menüyü de main metodunun içerisinde çağırdım.


        String menu = "Menu :\n 1. Karakter dizisini çizdir.\n 2. Büyük harfe çevir.\n 3. Şifrele ve şifre çöz. \n 4. Harf çiz\n";
        System.out.println(menu);
        SecimEkrani();


    }


    public static void harfCizdir(String karakter, int boyut) {

//bu kısımda ise kullanıcıdan alınan değerlere göre harf çizdirme işlemini yaptım.

        if (karakter.equals("X") || karakter.equals("Z")) {//kullanıcı X veya Z harflerinden birini girdiğinde işlem yapılmasını sağladım.
            if ((boyut % 2 == 1 && boyut >= 5)) {//kullanıcı 5 ve 5 den büyük tek sayı girerse işlem yapılacak.
                if (karakter.equals("X")) {  // kullanıcı X harfini girdiğinde işlem yapacak.
                    for (int satir = 1; satir <= boyut; satir++) {  //satır sayısı boyut kadar olacak.
                        for (int sutun = 1; sutun <= boyut; sutun++) {  //sütun sayısı boyut kadar olacak.
                            if (satir == sutun || satir + sutun == boyut + 1)  // eğer satır sütuna eşitse veya satır  sütunun toplamı boyut+1 e eşitse işlem yapılacak.
                                System.out.print("*");
                            else//değilse boşluk bırakılacak.
                                System.out.print(" ");
                        }
                        System.out.println();


                    }

                } else {// kullanıcı Z harfini girdiğinde işlem yapacak.
                    for (int satir = 1; satir <= boyut; satir++) {//satır sayısı boyut kadar olacak.
                        for (int sutun = 1; sutun <= boyut; sutun++) {//sütun sayısı boyut kadar olacak.
                            if (satir == 1 || satir + sutun == boyut + 1 || satir == boyut) {  // eğer satır 1 e eşitse veya satır  sütunun toplamı boyut+1 e eşitse veya satır boyuta eşitse işlem yapılacak.
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }


                        }
                        System.out.println();
                    }


                }

            }


        }


    }


}
