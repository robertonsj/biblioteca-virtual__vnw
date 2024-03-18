package challange.livrousuario.biblioteca;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        BibliotecaVirtual biblioteca = new BibliotecaVirtual();
        Scanner scanner = new Scanner(System.in);

        int escolha;
        do {
            exibirMenuInicial();
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    menuLivraria(biblioteca, scanner);
                    break;
                case 2:
                    menuUsuario(biblioteca, scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 3);

        scanner.close();
    }

    public static void exibirMenuInicial() {
        System.out.println("=== Bem-vindo à Biblioteca ===");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Menu Livraria");
        System.out.println("2. Menu do Usuário");
        System.out.println("3. Sair");
        System.out.print("Escolha: ");
    }

    public static void menuLivraria(BibliotecaVirtual biblioteca, Scanner scanner) {
        int escolha;
        do {
            exibirMenuLivraria();
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    adicionarLivro(biblioteca, scanner);
                    break;
                case 2:
                    adicionarUsuario(biblioteca, scanner);
                    break;
                case 3:
                    biblioteca.listarLivrosDisponiveis();
                    break;
                case 4:
                    biblioteca.listarUsuarios();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 5);
    }


    public static void menuUsuario(BibliotecaVirtual biblioteca, Scanner scanner) {
        Usuario usuarioAutenticado = autenticarUsuario(biblioteca, scanner);
        if (usuarioAutenticado != null) {
            int escolha;
            do {
                exibirMenuUsuario();
                escolha = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                switch (escolha) {
                    case 1:
                        biblioteca.listarLivrosDisponiveis();
                        break;
                    case 2:
                        alugarLivro(biblioteca, scanner, usuarioAutenticado);
                        break;
                    case 3:
                        devolverLivro(biblioteca, scanner, usuarioAutenticado);
                        break;
                    case 4:
                        biblioteca.consultarEmprestimosUsuario(usuarioAutenticado);
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (escolha != 5);
        } else {
            System.out.println("Usuário não autenticado.");
        }
    }

    public static void exibirMenuLivraria() {
        System.out.println("=== Menu Livraria ===");
        System.out.println("1. Adicionar Livro");
        System.out.println("2. Adicionar Usuário");
        System.out.println("3. Consultar Livros Disponíveis");
        System.out.println("4. Listar Usuários");
        System.out.println("5. Sair");
        System.out.print("Escolha: ");
    }

    public static void adicionarLivro(BibliotecaVirtual biblioteca, Scanner scanner) {
        System.out.println("\n=== Adicionar Livro ===");
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o nome do autor: ");
        String autor = scanner.nextLine();
        System.out.print("Digite o nome da editora: ");
        String editora = scanner.nextLine();
        System.out.print("Digite o ano de publicação: ");
        short anoPublicacao = scanner.nextShort();
        System.out.print("Digite o número de cópias disponíveis: ");
        int numCopias = scanner.nextInt();

        Livro livro = new Livro(titulo, autor, editora, anoPublicacao, numCopias);
        biblioteca.adicionarLivro(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    public static void adicionarUsuario(BibliotecaVirtual biblioteca, Scanner scanner) {
        System.out.println("\n=== Adicionar Usuário ===");
        System.out.print("Digite o nome do usuário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF do usuário: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o telefone do usuário: ");
        String telefone = scanner.nextLine();

        Usuario usuario = new Usuario(nome, cpf, telefone);
        biblioteca.adicionarUsuario(usuario);
        System.out.println("Usuário adicionado com sucesso!");
    }

    public static void exibirMenuUsuario() {
        System.out.println("\n=== Menu do Usuário ===");
        System.out.println("1. Consultar Livros Disponíveis");
        System.out.println("2. Alugar Livro");
        System.out.println("3. Devolver Livro");
        System.out.println("4. Consultar Meus Empréstimos");
        System.out.println("5. Voltar ao Menu Inicial");
        System.out.print("Escolha: ");
    }

    public static Usuario autenticarUsuario(BibliotecaVirtual biblioteca, Scanner scanner) {
        System.out.println("\n=== Autenticação ===");
        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite seu telefone: ");
        String telefone = scanner.nextLine();

        Usuario usuarioAutenticado = biblioteca.autenticarUsuario(cpf, telefone);
        if (usuarioAutenticado != null) {
            System.out.println("Usuário autenticado com sucesso: " + usuarioAutenticado.getNome());
        } else {
            System.out.println("Usuário não encontrado ou credenciais inválidas.");
        }
        return usuarioAutenticado; // Retorna o usuário autenticado
    }

    public static void alugarLivro(BibliotecaVirtual biblioteca, Scanner scanner, Usuario usuario) {
        System.out.println("=== Alugar Livro ===");
        System.out.print("Digite o título do livro que deseja alugar: ");
        String tituloLivro = scanner.nextLine();

        Livro livro = biblioteca.buscarLivroPorTitulo(tituloLivro);

        if (livro != null && usuario != null) {
            if (biblioteca.alugarLivro(livro, usuario)) {
                System.out.println("Livro alugado com sucesso!");
            } else {
                System.out.println("Não foi possível alugar o livro. Verifique se você está autenticado e se o livro está disponível.");
            }
        } else {
            System.out.println("Livro ou usuário não encontrado.");
        }
    }

    public static void devolverLivro(BibliotecaVirtual biblioteca, Scanner scanner, Usuario usuario) {
        System.out.println("=== Devolver Livro ===");
        System.out.print("Digite o título do livro que deseja devolver: ");
        String tituloLivro = scanner.nextLine();

        Livro livro = biblioteca.buscarLivroPorTitulo(tituloLivro);

        if (livro != null && usuario != null) {
            if (biblioteca.devolverLivro(livro, usuario)) {
                System.out.println("Livro devolvido com sucesso!");
            } else {
                System.out.println("Não foi possível devolver o livro. Verifique se o livro foi alugado anteriormente.");
            }
        } else {
            System.out.println("Livro ou usuário não encontrado.");
        }
    }
}

