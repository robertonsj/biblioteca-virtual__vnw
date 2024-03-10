
### Escopo de Projeto

#### 1. Cadastro de Livros
- Permitir o cadastro de informações sobre cada livro, como título, autor, editora, ano de publicacao, e número de cópias disponíveis.
- Possibilitar a atualização e exclusão de registro de livros.
  
#### 2. Controle de Empréstimos:
- Permitir o registro de empréstimos de livros para usuários da biblioteca.
- Manter o histórico de empréstimos, incluindo datas de empréstimo e devolução.

#### 3. Gerenciamento de Usuários:
- Cadastrar informações sobre os usuários, incluindo nome, cpf, contato e histórico de empréstimos.
- Permitir a atualização e exclusão de registros de usuários.

#### 4. Consulta de Livros:
- Implementar um sistema de busca para localizar livros com base em critérios como título, autor, ou categoria.
- Apresentar informações detalhadas sobre a disponibilidade de exemplares.

### Entidades
1. Livro(titulo, autor, isbn, anoPublicacao, numeroDeCopias);
2. Usuario(nome, contato, cpf, historicoEmprestimos);
3. Emprestimos(livro, usuario, dataEmprestimo, dataDevolucao);
4. Biblioteca(livros, usuarios, emprestismos)


### Regras de Negócio
Usuários não cadastrados não podem alugar livros. 

Cada usuário poderá ficar com o livro por 2 semanas.

### Diagrama de Classes
![Imagem do diagrama](https://lucid.app/publicSegments/view/f668dfdf-d012-4f7d-9207-da3ef1b21316/image.png)

### Componentes do Grupo
- Roberto Nascimento - Classe Usuario
- Alexandre Carvalho - Classe BibliotecaVirtual
- Bianca Leal - Classe Livro
- Thiago Augusto - Classe Applucation - Teste das classes


