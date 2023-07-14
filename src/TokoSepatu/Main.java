package TokoSepatu;


public class Main {
     public static void main(String[] args) {
        // Membuat objek toko
        TokoSepatu toko = new TokoSepatu();

        // Membuat objek sepatu
        Sepatu sepatu1;
         sepatu1 = new Sepatu("A004", "Adidas", 42, 800000);
        Sepatu sepatu2 = new Sepatu("A005", "Fila", 41, 200000);

        // Menambahkan sepatu ke toko
        toko.tambahSepatu(sepatu1);
        toko.tambahSepatu(sepatu2);

        // Menampilkan daftar sepatu di toko
        System.out.println("Daftar Sepatu di Toko:");
        toko.getDaftarSepatu().forEach((sepatu) -> {
            System.out.println("Kode: " + sepatu.getKode() + ", Merk: " + sepatu.getMerk()
                    + ", Ukuran: " + sepatu.getUkuran() + ", Harga: " + sepatu.getHarga());
         });
    }
}