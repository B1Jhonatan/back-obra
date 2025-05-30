package com.jaimes.back_obra.classes.tipo.repository;

import com.jaimes.back_obra.classes.tipo.entity.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoRepository extends JpaRepository<Tipo, Long> {
}
