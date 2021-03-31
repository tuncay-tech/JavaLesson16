package Sorular2;

import java.util.ArrayList;

public class MainClass2 {
    public static void main(String[] args) {
        /*
ram, islemci ve ekran buyuklugu field lerini
iceren bir Bilgisayar sinifi olusturunuz,
MainClass da 5 adet Bilgisayar nesnesi olusturunuz
bunlari bir array'e yerlestiriniz ve ekran'i 13 den
buyuk olanlari yazdiriniz.
 */


        // 5 tane bilgisayar nesnesi oluşturalım
        Bilgisayar b1 = new Bilgisayar("b1", 4, "i5", 13.3);
        Bilgisayar b2 = new Bilgisayar("b2", 8, "i7", 14.1);
        Bilgisayar b3 = new Bilgisayar("b3", 16, "i9", 12.2);
        Bilgisayar b4 = new Bilgisayar("b4", 4, "i3", 10.1);
        Bilgisayar b5 = new Bilgisayar("b5", 12, "i5", 13.3);

        // arraylist yapalım şimdi arraylistlerimiz bilgisayar objelerinden oluşacak
        ArrayList<Bilgisayar> bilgisayarlar = new ArrayList<>();
        bilgisayarlar.add(b1);
        bilgisayarlar.add(b2);
        bilgisayarlar.add(b3);
        bilgisayarlar.add(b4);
        bilgisayarlar.add(b5);

        // ekrana 13 den büyük olanları yazdırmak için for loop kullanalım

        for (int i = 0; i < bilgisayarlar.size(); i++) { // intel,ji burda bize bir öneri veriyor for loop yerine for each kullanın diye
            if (bilgisayarlar.get(i).getEkranBuyuklugu() > 13) {  // getter ve setter yapmaazssak ekran büyülğü gelmez
                System.out.println(bilgisayarlar.get(i).getIsim() + ": bilgisayırn ekranı 13 den büyüktür");
            } else {
                System.out.println(bilgisayarlar.get(i).getIsim() + ": bilgisayırn ekranı 13 den küçüktür");

            }
        }


    }
}
