package com.group3.resep.resep_makanan.model;
import jakarta.persistence.*;

@Entity
@Table(name = "resep")
public class Resep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String judul;
    private String kategori;

    @Column(columnDefinition = "TEXT")
    private String bahan;

    @Column(columnDefinition = "TEXT")
    private String langkah;
    

    // Getter
     public Long getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getBahan() {
        return bahan;
    }

    public String getLangkah() {
        return langkah;
    }

    public String getKategori() {
        return kategori;
    }

    // SETTER
    public void setId(Long id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public void setLangkah(String langkah) {
        this.langkah = langkah;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

}
