package br.com.TestedeCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.TestedeCrud.model.Locacao;

public interface LocacaoRepository extends JpaRepository<Locacao, Integer> {

}
