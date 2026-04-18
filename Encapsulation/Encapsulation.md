# Encapsulation (Enkapsulasi)

## 📖 Deskripsi
Folder ini berisi praktikum **Encapsulation** — salah satu dari empat pilar OOP. Enkapsulasi adalah teknik menyembunyikan atribut dari akses langsung luar class, dan mengaksesnya hanya melalui metode getter dan setter.

---

## 📂 File

| File | Keterangan |
|------|-----------|
| `Mahasiswa.java` | Class dengan atribut `private` + getter & setter |
| `Sks.java` | Main class — mengakses atribut via getter/setter |

---

## 🧩 Konsep

- **`private`** → atribut tidak bisa diakses langsung dari luar class
- **Setter** → metode untuk **mengubah** nilai atribut
- **Getter** → metode untuk **membaca** nilai atribut

```java
// ❌ Tanpa enkapsulasi — berbahaya, tidak ada kontrol
mahasiswa.sks = -999;

// ✅ Dengan enkapsulasi — aman, bisa ditambah validasi
private int sks;

public void setSks(int sks) {
    this.sks = sks;
}
public int getSks() {
    return sks;
}
```

> 💡 Enkapsulasi melindungi data agar tidak bisa diubah sembarangan dari luar class

---

## ▶️ Output
```
Nama: Budi
SKS: 24
Nama: Budi
SKS: 30
```
