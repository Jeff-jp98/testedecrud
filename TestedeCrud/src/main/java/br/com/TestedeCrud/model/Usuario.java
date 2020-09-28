package br.com.TestedeCrud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String dataEfetivacao;
	private boolean ativo;
	@OneToOne
	private Locacao locacao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataEfetivacao() {
		return dataEfetivacao;
	}
	public void setDataEfetivacao(String dataEfetivacao) {
		this.dataEfetivacao = dataEfetivacao;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Locacao getLocacao() {
		return locacao;
	}
	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}
	

}
