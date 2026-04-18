# PraktikPraUTS OOP Java - Aldia Riski Fauzi

Repositori ini berisi kumpulan praktikum **Pemrograman Berorientasi Objek (OOP)** menggunakan Java. Setiap folder merepresentasikan satu konsep OOP lengkap dengan contoh kode dan penjelasannya.

---

## Daftar Folder

| No | Folder / Study Case | Konsep Utama | Apa yang Dipelajari |
|----|---------------------|--------------|----------------------|
| 1 | `Object & Class/` | Class sebagai cetak biru & instance | Definisi class, atribut, constructor, method, membuat object dengan `new` |
| 2 | `Parameter/` | Parameter pada metode | Cara mengirim nilai ke dalam metode saat dipanggil |
| 3 | `Constructor/` | Inisialisasi object | Membuat constructor eksplisit, inisialisasi atribut saat `new` dipanggil |
| 4 | `Encapsulation/` | Penyembunyian data | `private`, getter & setter, validasi data di setter |
| 5 | `Inheritance/` | Pewarisan (`extends`) | Mewarisi atribut & method, keyword `super`, method overriding sederhana |
| 6 | `Polymorphism/` | Banyak bentuk | Method overriding, runtime polymorphism (reference superclass → object subclass) |
| 7 | `MembuatClassMahasiswa/` | Latihan terintegrasi | Latihan G1: membuat class, object, dan memanggil method secara lengkap |

---

## Cara Menggunakan Modul Ini

1. Pastikan sudah terinstall **JDK** (minimal Java 8, disarankan Java 17 atau 21)

2. Buka terminal / command prompt di folder root repositori ini

3. Masuk ke folder konsep yang ingin dijalankan, compile, lalu jalankan:

```bash
# Contoh di folder Object & Class
cd "Object & Class"
javac *.java
java MotorBeraksi
```

```bash
# Contoh di folder Encapsulation
cd Encapsulation
javac *.java
java Sks
```

```bash
# Contoh di folder Inheritance
cd Inheritance
javac *.java
java Main
```

```bash
# Contoh di folder Polymorphism
cd Polymorphism
javac *.java
java HewanPolimor
```

```bash
# Contoh di folder MembuatClassMahasiswa
cd MembuatClassMahasiswa
javac *.java
java MahasiswaBeraksi
```

---

## Alur Belajar yang Disarankan

```
Object & Class  →  Parameter  →  Constructor  →  Encapsulation  →  Inheritance  →  Polymorphism
    (dasar)          (dasar)        (dasar)         (pilar OOP)      (pilar OOP)     (pilar OOP)
                                                                                          ↓
                                                                               MembuatClassMahasiswa
                                                                                  (latihan akhir)
```

---

> 📝 Dibuat sebagai bagian dari praktikum mata kuliah **Bahasa Pemrograman 1 / Pemrograman Berorientasi Objek (OOP)**
