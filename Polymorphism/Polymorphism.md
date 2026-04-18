# Polymorphism (Polimorfisme)

## 📖 Deskripsi
Folder ini berisi praktikum **Polymorphism** — salah satu dari empat pilar OOP. Polimorfisme memungkinkan object dari class berbeda diperlakukan sebagai tipe yang sama (parent), namun tetap berperilaku sesuai class aslinya masing-masing.

---

## 📂 File

| File | Keterangan |
|------|-----------|
| `HewanPolimor.java` | Semua class (`Hewan`, `Herbivora`, `Karnivora`, `Kelinci`) + main class |

---

## 🧩 Konsep

- **Method Overriding** → child class menulis ulang metode `suara()` milik parent
- **Upcasting** → variabel bertipe parent (`Hewan`) tapi menyimpan object child
- Java secara otomatis menjalankan metode milik **child**, bukan parent

```java
Hewan hewan1 = new Hewan();      // normal
Hewan hewan2 = new Herbivora();  // upcasting → isi Herbivora, tipe Hewan
Hewan hewan4 = new Kelinci();    // upcasting → isi Kelinci, tipe Hewan

hewan1.suara(); // → "Suara hewan"
hewan2.suara(); // → "Suara herbivora"  (bukan "Suara hewan"!)
hewan4.suara(); // → "Suara kelinci"    (bukan "Suara herbivora"!)
```

### 🌳 Diagram Class
```
        Hewan
       /     \
 Herbivora  Karnivora
     |
  Kelinci
```

> 💡 Satu bentuk (`Hewan`), banyak perilaku — itulah inti dari **Poly** (banyak) + **Morphism** (bentuk)

---

## ▶️ Output
```
Suara hewan
Suara herbivora
Suara karnivora
Suara kelinci
```
