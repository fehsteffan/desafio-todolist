package com.br.felipe.steffan.desafio_todolist.repository;

import com.br.felipe.steffan.desafio_todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
