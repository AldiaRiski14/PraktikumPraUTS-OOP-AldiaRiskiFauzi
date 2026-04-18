# Constructor

## 📖 Deskripsi
Folder ini berisi praktikum cara membuat dan menggunakan **constructor** — metode khusus yang otomatis dipanggil saat object pertama kali dibuat.

---

## 📂 File

| File | Keterangan |
|------|-----------|
| `MobilBaru.java` | Class MobilBaru dengan constructor eksplisit |
| `MobilBaruBeraksi.java` | Main class — membuat object menggunakan constructor |

---

## 🧩 Konsep

- **Constructor** → metode dengan nama **sama persis** seperti nama class
- Otomatis dipanggil saat keyword `new` digunakan
- Fungsinya untuk **menginisialisasi** nilai atribut pertama kali

```java
// Constructor di MobilBaru.java
public MobilBaru(String warna, String merk) {
    this.warna = warna;
    this.merk = merk;
}

// Saat new dipanggil, constructor langsung berjalan
MobilBaru mobil = new MobilBaru("Putih", "Toyota");
//                               ↑ nilai langsung masuk lewat constructor
```

> 💡 Tanpa constructor eksplisit, Java otomatis membuat constructor default yang kosong

---

## ▶️ Output
```
Warna: Putih
Merk: Toyota
```
