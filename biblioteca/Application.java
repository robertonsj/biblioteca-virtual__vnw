package challange.livrousuario.biblioteca;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario("roberto", "111.222-5", "roberto@gmail", "8699-55");
		Livro livro = new Livro("Algortimos", "Manzano", "Atlas", (short)2015, 30);
		
		System.out.println(usuario);
		System.out.println(livro);
	}

}
