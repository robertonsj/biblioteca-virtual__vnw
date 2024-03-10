package challange.livrousuario.biblioteca;
import java.util.List;
import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Livro> livros = new ArrayList<>();
		List<Usuario> usuarios = new ArrayList<>();
		List<Emprestimo> emprestimos = new ArrayList<>();
		
		livros.add(new Livro("Algortimos", "Manzano", "Atlas", (short)2015, 30));
		livros.add(new Livro("Python", "Nilo Menezes", "Novatec", (short)2019, 50));
		livros.add(new Livro("Clean Code", "Robert Martin", "Alta Books", (short)2009, 60));
		
		usuarios.add(new Usuario("Alexandre", "111.111", "9999-8888"));
		usuarios.add(new Usuario("Bianca", "222.222", "7777-5555"));
		usuarios.add(new Usuario("Thiago", "666.444", "3333-1111"));
		usuarios.add(new Usuario("Roberto", "333.222", "9999-5555"));
		
		emprestimos.add(new Emprestimo(livros.get(0), usuarios.get(3)));
		
		
		livros.forEach(livro -> System.out.println(livro));
		System.out.println();
		usuarios.forEach(usuario -> System.out.println(usuario));
		System.out.println();
		emprestimos.forEach(emprestimo -> System.out.println(emprestimo));
	}

}
