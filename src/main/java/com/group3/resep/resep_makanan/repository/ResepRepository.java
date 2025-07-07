package com.group3.resep.resep_makanan.repository;
import com.group3.resep.resep_makanan.model.Resep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResepRepository extends JpaRepository<Resep, Long> {
}
