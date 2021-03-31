package Sorular3;

public class MainClass3 {
    /*
MathUtils adinda bir sinif olusturunuz ve bu sinifta
karesiniAl, sayiyiBesIleCarp ve girilen 3 sayinin
ortalamasiniAl metotlari olusturunuz, bu metotlari
MainClass da nesne olusturmadan kullaniniz.
 */

    public static void main(String[] args) {

        int onSyısınınKaresi = MathUtils.karesiniAl(10);
        System.out.println("on sayısının karesi: " + onSyısınınKaresi);

       double ortalamasınıAl =  MathUtils.ortalamasınıAl(6,7,8);
        System.out.println("üç sayısnın ortalaması: " + ortalamasınıAl);
        int sayısı5ileçarp = MathUtils.sayiyiBesIleCarp(9);
        System.out.println("sayıyı dokuz ile çarp" + sayısı5ileçarp);

        // ShareUtils   paylaşma
        // FileUtils    dosya işlemleri  util genel isimlerdirmeir herkesin anlaması için
        // BitmapUtils   resimler
    }
}
