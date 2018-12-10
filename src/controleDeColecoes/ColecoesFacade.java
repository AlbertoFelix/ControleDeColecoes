package controleDeColecoes;

public class ColecoesFacade {
	
	protected ColecaoLivros livro;
	protected ColecaoFilmes filme;
	
	// Metodos para adição de Livros ao Banco de Dados
	public void inserirLivroTitulo(String titulo) {
		livro.setTitulo(titulo);
	}
	
	public void inserirLivroAutor(String autor) {
		livro.setAutor(autor);
	}
	
	public void inserirLivroId(int id) {
		livro.setId(id);
	}
	
	public void inserirLivroEmprestado(boolean emprestado) {
		livro.setEmprestado(emprestado);
	}
	
	public String livroTituloBD() {
		return livro.getTitulo();
	}
	
	public String livroAutorBD() {
		return livro.getAutor();
	}
	
	public int livroIdBD() {
		return livro.getId();
	}
	
	public boolean livroEmprestadoBD() {
		return livro.isEmprestado();
	}
	
	//Metodos para adição de Filmes no Banco de Dados
	public void inserirFilmeNome(String nome) {
		filme.setNome(nome);
	}
	
	public void inserirFilmeGenero(String genero) {
		filme.setGenero(genero);
	}
	
	public void inserirFilmeId(int id) {
		filme.setId(id);
	}
	
	public void inserirFilmeEmprestado(boolean emprestado) {
		filme.setEmprestado(emprestado);
	}
	
	public void inserirFilmeAno(int ano) {
		filme.setAno(ano);
	}
	
	public String filmeNomeBD() {
		return filme.getNome();
	}
	
	public String filmeGeneroBD() {
		return filme.getGenero();
	}
	
	public int filmeIdBD() {
		return filme.getId();
	}
	
	public boolean filmeEmprestadoBD() {
		return filme.isEmprestado();
	}
	
	public int filmeAnoBD() {
		return filme.getAno();
	}
}