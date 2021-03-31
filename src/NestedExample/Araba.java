package NestedExample;

public class Araba {  // POJO class oluşturalım

    private String marka;
    private Tekerlek tekerlek;

    private class Tekerlek{  // tekerlek diye bir sınıf açtık not: "()"  sınıfta bu olmaz // bir inner class
        private int cant;
        private boolean kislikMi;
    }

    public Araba(String marka, Tekerlek tekerlek) {
        this.marka = marka;
        this.tekerlek = tekerlek;
    }
}
