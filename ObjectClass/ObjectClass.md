# Object & Class

## 📖 Deskripsi
Folder ini berisi praktikum dasar OOP — cara membuat **class** sebagai blueprint, lalu membuat **object** dari class tersebut.

---

## 📂 File

| File | Keterangan |
|------|-----------|
| `Motor.java` | Class Motor dengan atribut dan metode dasar |
| `MotorBeraksi.java` | Main class — membuat object dari class Motor |

---

## 🧩 Konsep

- **Class** → blueprint/cetakan yang mendefinisikan atribut dan metode
- **Object** → hasil instansiasi dari class menggunakan keyword `new`

```java
// Motor.java adalah CLASS
public class Motor {
    private String warna;
    private String merk;
    ...
}

// Di MotorBeraksi.java, "motor" adalah OBJECT
Motor motor = new Motor("Merah", "Honda");
```

> 💡 Analogi: Class = cetakan kue, Object = kuenya

---

## ▶️ Output
```
Warna: Merah
Merk: Honda
```
