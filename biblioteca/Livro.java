package challange.livrousuario.biblioteca;
import java.util.Date;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private short anoDePublicacao;
    private int numeroDeCopias;
    private boolean alugado = false;

    public Livro(String titulo, String autor, String editora, 
    		short anoDePublicacao, int numeroDeCopias) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoDePublicacao = anoDePublicacao;
        this.numeroDeCopias = numeroDeCopias;
    }

    

    public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    

    public short getAnoDePublicacao() {
		return anoDePublicacao;
	}



	public void setAnoDePublicacao(short anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}


	
	
    public String getEditora() {
		return editora;
	}



	public void setEditora(String editora) {
		this.editora = editora;
	}



	public int getNumeroDeCopias() {
		return numeroDeCopias;
	}



	public void setNumeroDeCopias(int numeroDeCopias) {
		this.numeroDeCopias = numeroDeCopias;
	}

	public boolean isAlugado() {
		return alugado;
	}
	
	
	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	@Override
    public String toString() {
        return "Livro{" +
                "nome = '" + titulo + '\'' +
                ", autor = '" + autor + '\'' +
                ", ano de publicação = '" + anoDePublicacao + '\'' +
                ", Número de cópias = " + numeroDeCopias +
                '}';
    }
}
