# Parameter

## 📖 Deskripsi
Folder ini berisi praktikum cara menggunakan **parameter** pada metode, sehingga metode bisa menerima dan memproses nilai dari luar.

---

## 📂 File

| File | Keterangan |
|------|-----------|
| `Sepeda.java` | Class Sepeda dengan metode berparameter |
| `SepedaBeraksi.java` | Main class — memanggil metode dengan mengirim nilai |

---

## 🧩 Konsep

- **Parameter** → nilai yang dikirim ke dalam metode saat dipanggil
- Ditulis di dalam tanda kurung `()` setelah nama metode

```java
// Metode dengan parameter
public void ubahKecepatan(int kecepatanBaru) {
    this.kecepatan = kecepatanBaru;
}

// Cara memanggilnya — kirim nilai 30 sebagai parameter
sepeda.ubahKecepatan(30);
```

> 💡 Parameter membuat metode lebih fleksibel karena nilainya bisa berbeda setiap dipanggil

---

## ▶️ Output
```
Merk: Polygon
Kecepatan: 20 km/jam
Merk: Polygon
Kecepatan: 30 km/jam
```
