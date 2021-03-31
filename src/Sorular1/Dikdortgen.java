package Sorular1;

import Sorular1.BaseClass;

public class Dikdortgen extends BaseClass {

    int birinci_kenar;
    int ikinci_kenar;
    // bunlar için consractor açalım

    public Dikdortgen(int birinci_kenar, int ikinci_kenar) {
        this.birinci_kenar = birinci_kenar;
        this.ikinci_kenar = ikinci_kenar;

    }

    @Override
    public int alanHesapla() {
        int dikdortgen_alan = birinci_kenar * ikinci_kenar;
        return dikdortgen_alan;
    }

    @Override
    public int cevreHesapla() {
        int dikdortgen_cevre = 2 * (birinci_kenar + ikinci_kenar);
        return dikdortgen_cevre;
    }
}
