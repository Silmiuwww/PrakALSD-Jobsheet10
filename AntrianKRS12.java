public class AntrianKRS12 {
    Mahasiswa12[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalProses;

    public AntrianKRS12(int max) {
        this.max = max;
        this.data = new Mahasiswa12[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.totalProses = 0;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void tambahAntrian(Mahasiswa12 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk antrian.");
        }
    }

    public void prosesKRSBatch() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa. Minimal 2 diperlukan untuk proses KRS.");
        } else {
            System.out.println("Memproses 2 mahasiswa untuk KRS:");
            for (int i = 0; i < 2; i++) {
                Mahasiswa12 mhs = data[front];
                front = (front + 1) % max;
                size--;
                totalProses++;
                System.out.println("Mahasiswa " + (i + 1) + ":");
                mhs.tampilkanData();
                System.out.println("-----------------------------");
            }
        }
    }

    public void lihatTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void lihatPalingBelakang() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling belakang:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (size < 2) {
            System.out.println("Tidak ada cukup mahasiswa untuk ditampilkan (minimal 2).");
        } else {
            System.out.println("2 Mahasiswa Terdepan:");
            for (int i = 0; i < 2; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void kosongkanAntrian() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getTotalProses() {
        return totalProses;
    }

    public int getSisaMahasiswa() {
        return 30 - totalProses;
    }
}
