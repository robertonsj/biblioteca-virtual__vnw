package challange.livrousuario.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private String cpf;
	private String telefone;
	private List<Livro> livrosEmprestados;

	public Usuario(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.livrosEmprestados = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Livro> getLivrosEmprestados() {
		return livrosEmprestados;
	}

	public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
		this.livrosEmprestados = livrosEmprestados;
	}

	public void adicionarLivroEmprestado(Livro livro) {
		livrosEmprestados.add(livro);
	}

	public boolean removerLivroEmprestado(Livro livro) {
		return livrosEmprestados.remove(livro);
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", CPF: " + cpf + ", Telefone: " + telefone;
	}

}
