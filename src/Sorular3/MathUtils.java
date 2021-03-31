package Sorular3;

public class MathUtils {

    public static int karesiniAl(int sayi){   // kare al metod yazdık
        int kareSonuc = sayi * sayi;   // void değil de int dönmesini istiyoruz ondan public int yaptık
        return kareSonuc;               // stataic de yapıyoruz ki MathUtils den nesne oluşturmadan ulaşmak için
    }

    public static int sayiyiBesIleCarp(int sayi){
        int besKati = 5 * sayi; // bunun yerine aşağıya returnde yazmadan "return 5 * sayi;" diyede yazabiliridik
        return besKati;
    }
    public static double ortalamasınıAl(int sayi1, int sayi2 , int sayi3){  // double ise aşağıdakide double olamalı
        double sayilarinOrtalamasi = (sayi1 + sayi2 + sayi3) /3;
        return sayilarinOrtalamasi;  // clear code yazabiliridik yani "return (sayi1 + sayi2 + sayi3) /3; "

    }

    }
