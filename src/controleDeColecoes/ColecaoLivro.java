package controleDeColecoes;

public class ColecaoLivro {
	public static String autor, titulo;
	public static int id;
	public static boolean emprestado;
	
	public static String getAutor() {
		return autor;
	}
	public static void setAutor(String autor) {
		ColecaoLivro.autor = autor;
	}
	
	public static String getTitulo() {
		return titulo;
	}
	public static void setTitulo(String titulo) {
		ColecaoLivro.titulo = titulo;
	}
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		ColecaoLivro.id = id;
	}
	
	public static boolean isEmprestado() {
		return emprestado;
	}
	public static void setEmprestado(boolean emprestado) {
		ColecaoLivro.emprestado = emprestado;
	}
}
