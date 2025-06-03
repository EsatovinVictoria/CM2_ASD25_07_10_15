public class Kendaraan {

    String platNomor;
    String tipe;
    String merk;

    Kendaraan(String plat, String type, String merek) {

        platNomor = plat;
        tipe = type;
        merk = merek;

    }

    public void tampilKendaraan() {
        System.out.printf("%-15s %-15s %-15s", platNomor, tipe, merk);
    }
}

