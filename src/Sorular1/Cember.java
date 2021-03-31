package Sorular1;

import Sorular1.BaseClass;

public class Cember extends BaseClass {

    int yaricap;

    public Cember(int yaricap) {   // contractor
        this.yaricap = yaricap;    // biz bu contractor ile çember nesnesi oluştucağız yoksa olmaz.

    }

    @Override
    public int alanHesapla() {
        double cember_alan = 3.14 * yaricap * yaricap;
        int cember_alan_int = (int) cember_alan;  // double burda int cevirdik
        return cember_alan_int;
    }

    @Override
    public int cevreHesapla() {
        double cember_cevre = 2 * 3.14 * yaricap;
        int cember_cevre_int = (int) cember_cevre;
        return cember_cevre_int;

    }
}
