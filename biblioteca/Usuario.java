package challange.livrousuario.biblioteca;
import java.util.List;
import java.util.ArrayList;

public class Usuario {	
	private String nome;
	private String cpf;
	private String telefone;
	private List<Emprestimo> historicoEmprestimos = new ArrayList<>();
	
	public Usuario() {}
	
	public Usuario(String nome, String cpf, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
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
	
	public String toString() {
		return String.format("Nome-[%s] CPF-[%s] Telefone-[%s]",
				nome, cpf, telefone);
	}
	
	
}
