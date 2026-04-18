# Inheritance (Pewarisan)

## 📖 Deskripsi
Folder ini berisi praktikum **Inheritance** — salah satu dari empat pilar OOP. Pewarisan memungkinkan sebuah class mewarisi atribut dan metode dari class lain, sehingga kode tidak perlu ditulis ulang.

---

## 📂 File

| File | Keterangan |
|------|-----------|
| `Orang.java` | Parent class + child class `Mahasiswa` dan `Dosen` |
| `Main.java` | Main class — membuat object dari class turunan |

---

## 🧩 Konsep

- **`extends`** → keyword untuk mewarisi class lain
- **Parent class (superclass)** → class yang diwarisi → `Orang`
- **Child class (subclass)** → class yang mewarisi → `Mahasiswa`, `Dosen`
- Child class otomatis memiliki semua atribut dan metode dari parent

```java
class Orang {
    String nama;
    int umur;
}

// Mahasiswa MEWARISI nama & umur dari Orang
class Mahasiswa extends Orang {
    String nim; // atribut tambahan milik Mahasiswa sendiri
}
```

### 🌳 Diagram Pewarisan
```
        Orang
       /     \
Mahasiswa   Dosen
```

> 💡 Keuntungan: atribut `nama` dan `umur` cukup ditulis sekali di `Orang`, tidak perlu ditulis ulang di `Mahasiswa` maupun `Dosen`

---

## ▶️ Output
```
Nama: Budi
Umur: 20
NIM: 123456
Nama: Dr. Ahmad
Umur: 40
NIDN: 654321
```
