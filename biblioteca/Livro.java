package livrousuario;
import java.util.Date;

public class Livro {
    private String nome;
    private String autor;
    private String dataPublicacao;
    private boolean alugado;

    public Livro(String nome, String autor, String dataPublicacao) {
        this.nome = nome;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
        this.alugado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
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
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", dataPublicacao='" + dataPublicacao + '\'' +
                ", alugado=" + alugado +
                '}';
    }
}
