import java.util.Scanner;
public class Pembayaran implements PembayaranPegadaianEmas {
    public void bayar(double jumlahEmas, double hargaEmasPerGram) {
        double totalHarga = jumlahEmas * hargaEmasPerGram;
        System.out.println("Total harga emas: " + totalHarga);
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah pembayaran: ");
        double jumlahPembayaran = input.nextDouble();
        double kembalian = jumlahPembayaran - totalHarga;
        System.out.println("Kembalian: " + kembalian);
    }

    public void bayarTunai(double jumlahEmas, double hargaEmasPerGram) {
        double totalHarga = jumlahEmas * hargaEmasPerGram;
        System.out.println("Metode pembayaran: Tunai");
        System.out.println("Jumlah emas: " + jumlahEmas + " gram");
        System.out.println("Harga emas per gram: Rp " + hargaEmasPerGram);
        System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
    }

    public void bayarATM(double jumlahEmas, double hargaEmasPerGram) {
        double totalHarga = jumlahEmas * hargaEmasPerGram;
        System.out.println("Metode pembayaran: ATM");
        System.out.println("Jumlah emas: " + jumlahEmas + " gram");
        System.out.println("Harga emas per gram: Rp " + hargaEmasPerGram);
        System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
    }

    public void bayarMobileBanking(double jumlahEmas, double hargaEmasPerGram) {
        double totalHarga = jumlahEmas * hargaEmasPerGram;
        System.out.println("Metode pembayaran: Mobile Banking");
        System.out.println("Jumlah emas: " + jumlahEmas + " gram");
        System.out.println("Harga emas per gram: Rp " + hargaEmasPerGram);
        System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
    }

}