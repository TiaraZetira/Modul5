package librarysystem;

public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean statusDipinjam;
    private static int jumlahBukuTersedia = 0;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.statusDipinjam = false;
        jumlahBukuTersedia++;
    }

    public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
    public int getTahunTerbit() { return tahunTerbit; }
    public boolean isStatusDipinjam() { return statusDipinjam; }
    public static int getJumlahBukuTersedia() { return jumlahBukuTersedia; }

    public void pinjamBuku() {
        if (!statusDipinjam) {
            statusDipinjam = true;
            jumlahBukuTersedia--;
            System.out.println(judul + " berhasil dipinjam.");
        } else {
            System.out.println(judul + " sudah dipinjam.");
        }
    }

    public void kembalikanBuku() {
        if (statusDipinjam) {
            statusDipinjam = false;
            jumlahBukuTersedia++;
            System.out.println(judul + " berhasil dikembalikan.");
        } else {
            System.out.println(judul + " tidak sedang dipinjam.");
        }
    }
}
