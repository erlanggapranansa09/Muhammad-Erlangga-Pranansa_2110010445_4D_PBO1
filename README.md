# Muhammad-Erlangga-Pranansa_2110010445_4D_PBO1
# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data toko sepatu menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini  memberikan output berupa informasi detail dari kode tersebut seperti merk sepatu, ukuran sepatu,  dan harga sepatu.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Sepatu`, `TokoSepatu`, dan `Main` adalah contoh dari class.

```bash
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

public class TokoSepatu extends Sepatu{
     private ArrayList<Sepatu> daftarSepatu;

    public TokoSepatu() {
        daftarSepatu = new ArrayList<>();
    }

    public void tambahSepatu(Sepatu sepatu) {
        daftarSepatu.add(sepatu);
    }

    public void hapusSepatu(Sepatu sepatu) {
        daftarSepatu.remove(sepatu);
    }

    public ArrayList<Sepatu> getDaftarSepatu() {
        return daftarSepatu;
    }

}

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
```

2. **Object** adalah instance dari class. Pada kode ini, `mhs[i] = new MahasiswaDetail(nama, npm);` adalah contoh pembuatan object.

```bash
mhs[i] = new MahasiswaDetail(nama, npm);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `kode` , `merk`,`ukuran` , `harga` adalah contoh atribut.

```bash
String kode;
String merk;
int ukuran;
double harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `sepatu` dan `tokosepatu` .

```bash
public Sepatu(String kode, String merk, int ukuran, double harga {
    this.kode = kode;
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
}

public TokoSepatu(String kode, String merk) {
    super(kode, merk);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setHarga` adalah contoh method mutator.

```bash
public void setHarga(Double harga) {
    this.harga = harga;
}


```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getKode`, `getMerk`, `getUkuran`, dan `getHarga` adalah contoh method accessor.

```bash
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
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `kode` dan `merk` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String kode;
private String merk;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `TokoSepatu` mewarisi `Sepatu` dengan sintaks `extends`.

```bash
public class TokoSepatu extends Sepatu {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `sepatu` merupakan overloading method `displayInfo` dan `displayInfo` di `Tokosepatu` merupakan override dari method `displayInfo` di `Sepatu`.

```bash
 public TokoSepatu() {
        daftarSepatu = new ArrayList<>();
    }

    public void tambahSepatu(Sepatu sepatu) {
        daftarSepatu.add(sepatu);
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash
pub// Membuat objek toko
        TokoSepatu toko = new TokoSepatu();

        // Membuat objek sepatu
        Sepatu sepatu1;
         sepatu1 = new Sepatu("A004", "Adidas", 42, 800000);
        Sepatu sepatu2 = new Sepatu("A005", "Fila", 41, 200000);
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < mahasiswas.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
 System.out.println("Daftar Sepatu di Toko:");
        toko.getDaftarSepatu().forEach((sepatu) -> {
            System.out.println("Kode: " + sepatu.getKode() + ", Merk: " + sepatu.getMerk()
                    + ", Ukuran: " + sepatu.getUkuran() + ", Harga: " + sepatu.getHarga());
         });
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, toko.tambahSepatu(sepatu1)[] sepatu = new toko.tambahSepatu(sepatu2)[2];` adalah contoh penggunaan array.

```bash
toko.tambahSepatu(sepatu1)[] sepatu = new toko.tambahSepatu(sepatu2);
```



## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Erlangga Pranansa
NPM: 2110010445
