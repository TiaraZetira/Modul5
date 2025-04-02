import librarysystem.*;

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        Buku buku1 = new Buku("Jaringan Komputer", "Nisrina Sofwa", 2014);
        Buku buku2 = new Buku("Aljabar Linear", "Viesto Purnama Putra", 2019);

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        perpustakaan.tampilkanBuku();

        User user1 = new User("Tiara Zetira", 100);
        user1.pinjamBuku(buku1);
        perpustakaan.tampilkanBuku();

        user1.kembalikanBuku(buku1);
        perpustakaan.tampilkanBuku();
    }
}
