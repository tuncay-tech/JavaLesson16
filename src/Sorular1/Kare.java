package Sorular1;

import Sorular1.BaseClass;

public class Kare extends BaseClass {

    int birinci_kenar;  // kare için bir kenar girdik ve bunun bir contractor unu açalım

    public Kare(int birinci_kenar) { // contractor
        this.birinci_kenar = birinci_kenar;
    }

    @Override   // override etmezseek karenin alanın bulmayıp baseclassdaki alan metoduna girip 0 dönecek
    public int alanHesapla() {
        int kare_alan = birinci_kenar * birinci_kenar;
        return kare_alan;
    }

    @Override
    public int cevreHesapla() {
        int kare_cevre = 4 * birinci_kenar;
        return kare_cevre;
    }
}
