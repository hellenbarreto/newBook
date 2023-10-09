package com.newbook.newbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.newbook.newbook.entity.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, String> {

}
