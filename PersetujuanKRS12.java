import java.util.Scanner;

public class PersetujuanKRS12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS12 antrian = new AntrianKRS12(10); 
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa sekaligus)");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Lihat 2 Mahasiswa Terdepan");
            System.out.println("6. Lihat Mahasiswa Paling Belakang");
            System.out.println("7. Jumlah Mahasiswa dalam Antrian");
            System.out.println("8. Jumlah yang sudah diproses");
            System.out.println("9. Sisa dari total 30 mahasiswa");
            System.out.println("10. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM     : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama    : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi   : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas   : ");
                    String kelas = sc.nextLine();
                    Mahasiswa12 mhs = new Mahasiswa12(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.prosesKRSBatch();
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    antrian.tampilkanDuaTerdepan();
                    break;
                case 6:
                    antrian.lihatPalingBelakang();
                    break;
                case 7:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 8:
                    System.out.println("Jumlah yang sudah diproses KRS: " + antrian.getTotalProses());
                    break;
                case 9:
                    System.out.println("Sisa mahasiswa dari total 30: " + antrian.getSisaMahasiswa());
                    break;
                case 10:
                    antrian.kosongkanAntrian();
                    break;
                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }    
}
