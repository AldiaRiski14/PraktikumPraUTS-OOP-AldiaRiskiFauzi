package Inheritance;

class Orang {
    String nama;
    int umur;

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

class Mahasiswa extends Orang {
    String nim;

    void tampilkanNim() {
        System.out.println("NIM: " + nim);
    }
}

class Dosen extends Orang {
    String nidn;

    void tampilkanNidn() {
        System.out.println("NIDN: " + nidn);
    }
}
