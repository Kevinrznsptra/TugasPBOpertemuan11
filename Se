public class Sepatu {
    public Sepatu(){

    }

    // deklarasi
    private String merk,tipe,ukuran,warna;
    private double harga;
    //setter

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    //getter

    public String getMerk() {
        return merk;
    }

    public String getTipe() {
        return tipe;
    }

    public String getUkuran() {
        return ukuran;
    }

    public String getWarna() {
        return warna;
    }

    public double getHarga() {
        return harga;
    }

    //method tambahan
    public double hargaDsikon (){
        double diskon = 0.05 * getHarga();
        double total = getHarga() - diskon;

        return total;
    }
    public void keterangan (){
        System.out.println("Harga sepatu sesudah diskon 5% = Rp."+hargaDsikon());
    }
}
