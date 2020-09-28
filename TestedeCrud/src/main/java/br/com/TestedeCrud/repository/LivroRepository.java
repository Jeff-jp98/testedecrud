package br.com.TestedeCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.TestedeCrud.model.Usuario;

public interface LivroRepository extends JpaRepository<Usuario, Integer> {

}
