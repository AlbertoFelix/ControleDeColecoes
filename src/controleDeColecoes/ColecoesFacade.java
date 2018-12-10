package controleDeColecoes;

public class ColecoesFacade {
	
	protected ColecaoLivro livro;
	
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
}
