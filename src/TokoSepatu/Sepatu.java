package TokoSepatu;

public class Sepatu {
    private String kode;
    private String merk;
    private int ukuran;
    private double harga;

    public Sepatu(String kode, String merk, int ukuran, double harga) {
        this.kode = kode;
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    public String getKode() {
        return kode;
    }

    public String getMerk() {
        return merk;
    }

    public int getUkuran() {
        return ukuran;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}

