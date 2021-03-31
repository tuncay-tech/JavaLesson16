package Sorular2;

public class Bilgisayar {

    // bunların hepsine Model Class veya POJO(plain old java object) class denir
    // yani variablelerin ve constructor ların ve getter ve setter ların olduğu sınıfa POJO denir
    private String isim;    // private yapmak aslında diğer başka sınıfladan ulaşmasını istemiyorsak ama
                            // private yapmazsak daolur.
    private int ram;
    private String islemci;
    private double ekranBuyuklugu;

    // bilgisayar nesnesi oluşturmak için constructor oluşturmaıyız


    public Bilgisayar(String isim, int ram, String islemci, double ekranBuyuklugu) {
        this.isim = isim;
        this.ram = ram;
        this.islemci = islemci;
        this.ekranBuyuklugu = ekranBuyuklugu;
    }

    // tüm getter ve setter ları alalım
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getIslemci() {
        return islemci;
    }

    public void setIslemci(String islemci) {
        this.islemci = islemci;
    }

    public double getEkranBuyuklugu() {
        return ekranBuyuklugu;
    }

    public void setEkranBuyuklugu(double ekranBuyuklugu) {
        this.ekranBuyuklugu = ekranBuyuklugu;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
