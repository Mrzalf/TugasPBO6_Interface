import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Penggadai pgd = new Penggadai();
        Kasir ksr1 = new Kasir();
        Kasir ksr2 = new Kasir();
        Emas ems = new Emas();
        Emas_Batangan embt = new Emas_Batangan();
        Transaksi trans = new Transaksi();
        int menu, pilih, n, no, i, j;
        int[] id  = new int[10];
        char[] bo = new char[10];
        String[] war = new String[10];
        int[] har = new int[10];
        String[] asl = new String[10];
        int[] id2 = new int[10];
        int id4, harga4, jumlah4 = 0;
        String tgl;
        String[] name2 = new String[10];
        char ulang;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("");
            System.out.println("======== Program Sistem Penggadaian Emas ===========");
            System.out.println("===== Dijamin Aman, Terpercaya, & Tanpa Riba =======");
            System.out.println("=== Selamat Datang Di Program Sistem Penggadaian ===");
            System.out.println("-------------------");
            System.out.println("Menu yang tersedia:");
            System.out.println("1. Jenis Penggadaian Emas");
            System.out.println("2. Data Penggadai");
            System.out.println("3. Data Kasir");
            System.out.println("4. Transaksi Pegadaian");
            System.out.println("5. Benefit");
            System.out.println("6. Pembayaran");
            System.out.println("-----------------------------");
            System.out.print("Masukkan menu yang ingin Anda pilih : ");
            menu = in.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Jenis Pengadaian Emas yang tersedia");
                    System.out.println("=============");
                    System.out.println("1. Emas Batangan");
                    System.out.println("2. Emas Perhiasan");
                    System.out.print("Masukkan pilihan anda : ");
                    pilih = in.nextInt();
                    if (pilih == 1) {
                        System.out.println("Emas Batangan");
                        System.out.println("=============");
                        // Emas Batangan 1
                        i = 1;
                        id[i] = 501;
                        bo[i] = '5';
                        war[i] = "Coklat Kekuningan";
                        har[i] = 2000000;
                        asl[i] = "Brazil";
                        // Emas Batangan 2
                        i = 2;
                        id[i] = 502;
                        bo[i] = '7';
                        war[i] = "Kuning Gelap";
                        har[i] = 4000000;
                        asl[i] = "Portugal";
                        for (i = 1; i <= 2 ; i++) {
                            System.out.println("Emas ["+i+"]");
                            System.out.println("");
                            embt.dataEmas(id[i], bo[i], war[i], har[i], asl[i]);
                            embt.cetakEmas();
                            System.out.println("");
                        }
                    }
                    if (pilih == 2) {
                        // Emas Perhiasan 1
                        i = 3;
                        id[i] = 503;
                        bo[i] = '9';
                        war[i] = "Kuning Kecoklatan";
                        har[i] = 3000000;
                        // Emas Perhiasan 2
                        i = 4;
                        id[i] = 504;
                        bo[i] = '6';
                        war[i] = "Kuning Mengkilap";
                        har[i] = 4500000;
                        j = 1;
                        for (i = 3; i <= 4 ; i++) {
                            System.out.println("Emas ["+j+"]");
                            embt.dataEmas(id[i], bo[i], war[i], har[i], asl[i]);
                            embt.cetakEmas();
                            j++;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Data Penggadai");
                    System.out.println("==============");
                    System.out.println("1. Tambah data");
                    System.out.println("2. Update data");
                    System.out.println("==============");
                    System.out.print("Masukkan pilihan anda : ");
                    pilih = in.nextInt();
                    if (pilih == 1) {
                        System.out.println("Tambah data");
                        System.out.println("===========");
                        System.out.print("Banyak data Penggadai yang ingin diinputkan: ");
                        n = in.nextInt();

                        for (i = 0; i < n; i++) {
                            System.out.println("Data Penggadai [" + (i + 1) + "]");
                            System.out.print("Masukkan id Penggadai : ");
                            id2[i] = in.nextInt();
                            System.out.print("Masukkan nama : ");
                            name2[i] = in.next();
                        }
                        System.out.println("\nOutput data Penggadai");
                        i = 0;
                        while (name2[i] != null) {
                            pgd.tambahData(id2[i], name2[i]);
                            System.out.println("["+(i+1)+"] "+ pgd.getId_penggadai()+" " +pgd.getNama());
                            i++;
                        }
                    }
                    if (pilih == 2) {
                        System.out.println("Update Data");
                        System.out.println("===========");
                        System.out.println("Output data Penggadai");
                        i = 0;
                        while (name2[i] != null) {
                            pgd.tambahData(id2[i], name2[i]);
                            System.out.println("[" +(i+1)+ "]"+pgd.getId_penggadai()+" "+pgd.getNama());
                            i++;
                        }
                        System.out.print("Masukkan nomor data yang ingin Anda diubah: ");
                        no = in.nextInt();
                        no = no-1;
                        System.out.print("Masukkan id Penggadai : ");
                        id2[no] = in.nextInt();
                        System.out.print("Masukkan nama : ");
                        name2[no] = in.next();
                        System.out.println("Mengubah data Ke-"+pgd.updateData(no, id2[no], name2[no])+"...");
                        System.out.println("Output setelah data Penggadai diupdate");
                        i = 0;
                        while (name2[i] != null) {
                            pgd.tambahData(id2[i], name2[i]);
                            System.out.println("[" +(i+1) + "] " + pgd.getId_penggadai() + " " + pgd.getNama());
                            i++;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Data Kasir");
                    System.out.println("==========");
                    System.out.println("1. Tambah data");
                    System.out.println("2. Update data");
                    System.out.println("===============");
                    System.out.print("Masukkan pilihan anda : ");
                    pilih = in.nextInt();
                    if (pilih == 1) {
                        System.out.println("Tambah Data");
                        System.out.println("===========");
                        System.out.println("Kasir 1");
                        System.out.print("Masukkan id_kasir : ");
                        ksr1.id_kasir = in.nextInt();
                        System.out.print("Masukkan nama : ");
                        ksr1.nama = in.next();
                        System.out.println("Kasir 2");
                        System.out.print("Masukkan id_kasir : ");
                        ksr2.id_kasir = in.nextInt();
                        System.out.print("Masukkan nama : ");
                        ksr2.nama = in.next();
                        System.out.println("Output data kasir");
                        System.out.println("Kasir 1");
                        System.out.println(ksr1.getId_kasir()+" "+ksr1.getNama());
                        System.out.println("Kasir 2");
                        System.out.println(ksr2.getId_kasir()+" "+ksr2.getNama());
                    }
                    if (pilih == 2) {
                        System.out.println("Update Data");
                        System.out.println("===========");
                        System.out.println("Output data kasir");
                        System.out.println("Kasir 1");
                        System.out.println(ksr1.getId_kasir()+" "+ksr1.getNama());
                        System.out.println("Kasir 2");
                        System.out.println(ksr2.getId_kasir()+" "+ksr2.getNama());
                        System.out.print("Masukkan nomor data yang ingin diubah");
                        no = in.nextInt();
                        if (no == 1) {
                            System.out.println("Kasir 1");
                            System.out.print("Masukkan id_kasir : ");
                            ksr1.id_kasir = in.nextInt();
                            System.out.print("Masukkan nama : ");
                            ksr1.nama = in.next();
                        }
                        if (no == 2) {
                            System.out.println("Kasir 2");
                            System.out.print("Masukkan id_kasir: ");
                            ksr2.id_kasir = in.nextInt();
                            System.out.print("Masukkan nama: ");
                            ksr2.nama = in.next();
                        }
                        System.out.println("Output data kasir setelah diupdate");
                        System.out.println("Kasir 1");
                        System.out.println(ksr1.getId_kasir()+" "+ksr1.getNama());
                        System.out.println("Kasir 2");
                        System.out.println(ksr2.getId_kasir()+" "+ksr2.getNama());
                    }
                    break;
                case 4:
                    System.out.println("Transaksi Penggadaian");
                    System.out.println("======================");
                    System.out.print("Masukkan id transaksi : ");
                    id4 = in.nextInt();
                    trans.setId_transaksi(id4);
                    System.out.print("Masukkan tanggal beli : ");
                    tgl = in.next();
                    trans.setTgl_beli(tgl);
                    System.out.print("Masukkan harga : ");
                    harga4 = in.nextInt();
                    trans.setHarga(harga4);
                    System.out.print("Masukkan jumlah : ");
                    jumlah4 = in.nextInt();
                    trans.setJumlah(jumlah4);
                    System.out.println("========================================");
                    System.out.println("Total harga = "+trans.totalHarga(jumlah4, harga4));
                    break;
                case 5:
                    Benefit customerPriority = new Customer_Priority();
                    Benefit customerReguler = new Customer_Reguler();
                    System.out.println(customerPriority.getBenefit());
                    System.out.println(customerReguler.getBenefit());
                    break;
                case 6 :
                    Scanner input = new Scanner(System.in);
                    System.out.println("Pilih jenis emas yang ingin dibeli:");
                        System.out.println("1. Emas Batangan");
                        System.out.println("2. Emas Perhiasan");
                    System.out.print("Masukkan pilihan Anda (1-2): ");
                    int pilihan2 = input.nextInt();
                    System.out.print("Masukkan jumlah emas: ");
                    double jumlahEmas = input.nextDouble();
                    System.out.print("Masukkan harga emas per gram: ");
                    double hargaEmasPerGram = input.nextDouble();
                    System.out.println("Pilih metode pembayaran:");
                            System.out.println("1. Tunai");
                            System.out.println("2. ATM");
                            System.out.println("3. Mobile Banking");
                            System.out.print("Masukkan pilihan Anda (1-3): ");
                            int pilihan = input.nextInt();
                            Pembayaran pembayaran = new Pembayaran();
                            switch (pilihan) {
                                case 1:
                                    pembayaran.bayarTunai(jumlahEmas, hargaEmasPerGram);
                                    break;
                                case 2:
                                    pembayaran.bayarATM(jumlahEmas, hargaEmasPerGram);
                                    break;
                                case 3:
                                    pembayaran.bayarMobileBanking(jumlahEmas, hargaEmasPerGram);
                                    break;
                                default:
                                    System.out.println("Mohon Maaf Pilihan Anda Tidak Valid, Pembayaran dibatalkan !");
                            break;
                            }
                    System.out.println("===== Silahkan Dibayar Sesuai Total Harga ! =====");
                    break;
                default:
                    System.out.println("Menu yang Anda pilih Tidak Teredia, Maaf :(");
            }
            System.out.print("Pilih opsi menu lainnya : (Y/T) ");
            ulang = in.next().charAt(0);
        } while(ulang != 'T');
    }
}