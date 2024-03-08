package challange.livrousuario.biblioteca;

public class Usuario {	
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	
	public Usuario() {}
	
	public Usuario(String nome, String cpf, String email, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toString() {
		return String.format("Nome - [%s] CPF - [%s] Email - [%s] Telefone - [%s]",
				nome, cpf, email, telefone);
	}
	
	
}
