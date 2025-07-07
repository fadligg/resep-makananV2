# 🍽️ Aplikasi Resep Masakan

Proyek ini merupakan aplikasi web sederhana berbasis **Java Spring Boot** untuk menampilkan berbagai **resep makanan** dari berbagai daerah di Indonesia dan mancanegara. Data resep disimpan menggunakan **H2 database** dan dimuat otomatis dari file `data.sql`.

## 🚀 Fitur Utama

- Menampilkan daftar resep makanan lengkap
- Detail resep: judul, kategori, bahan, dan langkah memasak
- Desain data fleksibel menggunakan HTML `<br>` untuk tampilan list
- Dukungan **data.sql** agar mudah diekspor dan diimpor

## 🛠️ Teknologi yang Digunakan

- Java 17+
- Spring Boot 3.5.x
- Spring Web
- Spring Data JPA
- H2 Database (in-memory)
- Thymeleaf (opsional, jika menggunakan templating view)

## 🗂️ Struktur Proyek

resep-makanan/ <br>
├── src/ <br>
│ └── main/ <br>
│ ├── java/ <br>
│ │ └── com.group3.resep.resep_makanan/ <br>
│ │ ├── controller/ <br>
│ │ ├── model/ <br> 
│ │ ├── repository/ <br>
│ │ └── ResepMakananApplication.java <br>
│ └── resources/ <br>
│   ├── application.properties <br>
│   ├── data.sql <br>
│   └── templates/ (jika menggunakan thymeleaf) <br>
└── pom.xml 


## 💾 Database

- Menggunakan **H2 in-memory database**
- Data di-load otomatis dari `data.sql` saat aplikasi dijalankan
- Tidak membutuhkan setup database eksternal

### Contoh Data Resep

// ```sql
INSERT INTO resep (judul, kategori, bahan, langkah) VALUES
('Nasi Goreng Kampung', 'Masakan Indonesia', 
'1. Nasi putih<br>2. Bawang merah<br>3. Bawang putih<br>... (dst)', 
'1. Tumis bumbu...<br>2. Masukkan nasi...<br>... (dst)');

## ⚙️ Cara Menjalankan
1. Clone Repository
git clone https://github.com/fadligg/resep-makanan.git
cd resep-makanan

2. Jalankan Aplikasi
./mvnw spring-boot:run

##  📄 Lisensi
Proyek ini menggunakan lisensi MIT.
# resep-makananV2
# resep-makananV2
