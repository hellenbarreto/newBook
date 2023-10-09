package com.newbook.newbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.newbook.newbook.entity.Livro;
@Repository
public interface LivroRepository extends JpaRepository<Livro, String>{


}
