package challange.livrousuario.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaVirtual {
    // Listas para armazenar livros e usuários do sistema
    private List<Livro> livros;
    private List<Usuario> usuarios;

    // Construtor da classe SistemaAluguel
    public BibliotecaVirtual() {
        // Inicializa as listas de livros e usuários
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    // Método para adicionar um livro ao sistema
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    // Método para adicionar um usuário ao sistema
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Método para listar os livros disponíveis para aluguel
    public List<Livro> listarLivrosDisponiveis() {
        List<Livro> livrosDisponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (!livro.isAlugado()) {
                livrosDisponiveis.add(livro);
            }
        }
        return livrosDisponiveis;
    }

    // Método para alugar um livro para um usuário
    public boolean alugarLivro(Livro livro, Usuario usuario) {
        if (livros.contains(livro) && usuarios.contains(usuario) && !livro.isAlugado()) {
            livro.setAlugado(true);
            return true; // Aluguel Ok
        } else {
            return false; // Aluguel falhou
        }
    }

    // Método para devolver um livro ao sistema
    public boolean devolverLivro(Livro livro) {
        if (livros.contains(livro) && livro.isAlugado()) {
            livro.setAlugado(false);
            return true; // Devolução Ok
        } else {
            return false; // Devolução falhou
        }
    }
}
