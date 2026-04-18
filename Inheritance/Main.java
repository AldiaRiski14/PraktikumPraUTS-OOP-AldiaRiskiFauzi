package Inheritance;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Aldia";
        mahasiswa.umur = 20;
        mahasiswa.nim = "I.2510673";
        mahasiswa.tampilkanInfo();
        mahasiswa.tampilkanNim();

        Dosen dosen = new Dosen();
        dosen.nama = "Dr. Ahmad";
        dosen.umur = 40;
        dosen.nidn = "654321";
        dosen.tampilkanInfo();
        dosen.tampilkanNidn();
    }
}
