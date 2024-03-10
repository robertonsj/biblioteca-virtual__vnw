package challange.livrousuario.biblioteca;

import java.time.LocalDate;

public class Emprestimo {
	Livro livro;
	Usuario usuario;
	LocalDate dataEmprestimo;
	LocalDate dataDevolucao;
	private int id = 0; //identificação exclusiva de cada livro.
	
	public Emprestimo(Livro livro, Usuario usuario) {
		this.livro = livro;
		this.usuario = usuario;
		this.id += 1;
		this.dataEmprestimo = LocalDate.now();
		this.dataDevolucao = LocalDate.now();
	}
	
	public Emprestimo(Livro livro, Usuario usuario, LocalDate dataEmprestimo,
			LocalDate dataDevolucao) {
		this.livro = livro;
		this.usuario = usuario;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}
	
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public String toString() {
		return String.format("Emprestimo nº-%d {\n"
				+ "Usuario-[%s] Livro-[%s]\n"
				+ "Data de Emprestimo-[%s] Data de Devolução-[%s]",
				id, usuario.getNome(), livro.getTitulo(), 
				dataEmprestimo.toString(), dataDevolucao.toString());
	}
	
	
}
