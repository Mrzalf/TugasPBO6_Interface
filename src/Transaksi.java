public class Transaksi {
    private int id_transaksi;
    private int jumlah;
    private int harga;
    private static int total;

    private String tgl_beli;

    public int getId_transaksi() {
        return id_transaksi;
    }

    public Transaksi(){
        id_transaksi = 0;
        harga = 0;
        jumlah = 0;
        total = 0;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public String getTgl_beli() {
        return tgl_beli;
    }

    public void setTgl_beli(String tgl_beli) {
        this.tgl_beli = tgl_beli;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public static int totalHarga(int jum, int har){
        total = jum*har;
        return total;
    }

}
