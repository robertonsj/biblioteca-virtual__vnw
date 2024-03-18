package challange.livrousuario.biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaVirtual {
    // Listas para armazenar livros e usuários do sistema
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    // Construtor da classe SistemaAluguel
    public BibliotecaVirtual() {
        // Inicializa as listas de livros e usuários
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public Usuario autenticarUsuario(String cpf, String telefone) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCpf().equals(cpf) && usuario.getTelefone().equals(telefone)) {
                return usuario; // Usuário autenticado
            }
        }
        return null; // Usuário não encontrado ou credenciais inválidas
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
    public void listarLivrosDisponiveis() {
        System.out.println("=== Livros Disponíveis ===");
        // Lista os livros disponíveis na biblioteca
        for (Livro livro : livros) {
            if (!livro.isAlugado()) {
                System.out.println(livro);
            }
        }
    }
    public void listarUsuarios() {
        System.out.println("=== Usuários Cadastrados ===");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    // Método para alugar um livro para um usuário
    public boolean alugarLivro(Livro livro, Usuario usuario) {
        if (livros.contains(livro) && !livro.isAlugado()) {
            livro.setAlugado(true);
            usuario.adicionarLivroEmprestado(livro);

            // Calcula a data de devolução como 2 semanas (14 dias) a partir da data atual
            LocalDate dataDevolucao = LocalDate.now().plusWeeks(2);

            // Cria um novo empréstimo com a data de devolução calculada
            emprestimos.add(new Emprestimo(usuario, livro, LocalDate.now(), dataDevolucao));
            return true; // Aluguel Ok
        } else {
            return false; // Aluguel falhou
        }
    }

    // Método para devolver um livro ao sistema
    public boolean devolverLivro(Livro livro, Usuario usuario) {
        if (livros.contains(livro) && livro.isAlugado()) {
            livro.setAlugado(false);
            usuario.removerLivroEmprestado(livro);
            return true; // Devolução Ok
        } else {
            return false; // Devolução falhou
        }
    }

    // Método para buscar um livro pelo título
    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro; // Livro encontrado
            }
        }
        return null; // Livro não encontrado
    }

    // Método para buscar um usuário pelo nome
    public Usuario buscarUsuarioPorNome(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(nome)) {
                return usuario;
            }
        }
        return null; // Retorna null se o usuário não for encontrado
    }

    // Método para consultar os empréstimos de um usuário
    public void consultarEmprestimosUsuario(Usuario usuario) {
        System.out.println("=== Meus Empréstimos ===");

        List<Emprestimo> emprestimosUsuario = new ArrayList<>();
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getUsuario().equals(usuario)) {
                emprestimosUsuario.add(emprestimo);
            }
        }

        if (emprestimosUsuario.isEmpty()) {
            System.out.println("Você não tem livros emprestados no momento.");
        } else {
            System.out.println("Livros emprestados:");
            for (Emprestimo emprestimo : emprestimosUsuario) {
                System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
                System.out.println("Data de Empréstimo: " + emprestimo.getDataEmprestimo());
                System.out.println("Data de Devolução prevista: " + emprestimo.getDataDevolucao());
                System.out.println();
            }
        }
    }


}