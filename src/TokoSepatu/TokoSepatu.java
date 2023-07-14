package TokoSepatu;

import java.util.ArrayList;


public class TokoSepatu {
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
