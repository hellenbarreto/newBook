package com.newbook.newbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.newbook.newbook.entity.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, String> {

}
