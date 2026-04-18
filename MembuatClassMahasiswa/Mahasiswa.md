# Tugas 1 - Membuat Class Mahasiswa

## 📖 Deskripsi
Tugas ini mengimplementasikan pembuatan **class**, **atribut**, **metode**, dan **object** secara bersamaan. Dibuat 3 object dari class `Mahasiswa` yang masing-masing memiliki data nama dan NIM berbeda.

---

## 📂 File

| File | Peran |
|------|-------|
| `Mahasiswa.java` | **Class** — berisi atribut `nama`, `nim`, dan 3 metode |
| `MahasiswaBeraksi.java` | **Main class** — membuat 3 object dari class Mahasiswa |

---

## 🧩 Konsep yang Digunakan

- **Class** → `Mahasiswa.java` adalah blueprint/cetakan
- **Atribut** → `nama` dan `nim` sebagai data yang dimiliki tiap object
- **Metode** → `tampilkanNama()`, `tampilkanNim()`, `olahraga()` sebagai aksi yang bisa dilakukan
- **Object** → `mahasiswa1`, `mahasiswa2`, `mahasiswa3` adalah 3 instance berbeda dari class yang sama

```java
// Satu class, tiga object berbeda
Mahasiswa mahasiswa1 = new Mahasiswa(); // object 1
Mahasiswa mahasiswa2 = new Mahasiswa(); // object 2
Mahasiswa mahasiswa3 = new Mahasiswa(); // object 3
```

> 💡 Meskipun berasal dari class yang sama, tiap object punya data (`nama` & `nim`) yang berbeda-beda

---

## 💻 Kode

### `Mahasiswa.java`
```java
public class Mahasiswa {
    String nama;
    String nim;

    void tampilkanNama() {
        System.out.println("Nama: " + nama);
    }

    void tampilkanNim() {
        System.out.println("NIM: " + nim);
    }

    void olahraga() {
        System.out.println("Olahraga favorit: Sepak bola");
    }
}
```

### `MahasiswaBeraksi.java`
```java
public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Ahmad";
        mahasiswa1.nim = "123456";
        mahasiswa1.tampilkanNama();
        mahasiswa1.tampilkanNim();
        mahasiswa1.olahraga();

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Budi";
        mahasiswa2.nim = "654321";
        mahasiswa2.tampilkanNama();
        mahasiswa2.tampilkanNim();
        mahasiswa2.olahraga();

        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.nama = "Citra";
        mahasiswa3.nim = "112233";
        mahasiswa3.tampilkanNama();
        mahasiswa3.tampilkanNim();
        mahasiswa3.olahraga();
    }
}
```

---

## ▶️ Output
```
Nama: Ahmad
NIM: 123456
Olahraga favorit: Sepak bola
Nama: Budi
NIM: 654321
Olahraga favorit: Sepak bola
Nama: Citra
NIM: 112233
Olahraga favorit: Sepak bola
```
