package controleDeColecoes;

public class ColecaoLivros {
	public static String autor, titulo;
	public static int id;
	public static boolean emprestado;
	
	public static String getAutor() {
		return autor;
	}
	public static void setAutor(String autor) {
		ColecaoLivros.autor = autor;
	}
	
	public static String getTitulo() {
		return titulo;
	}
	public static void setTitulo(String titulo) {
		ColecaoLivros.titulo = titulo;
	}
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		ColecaoLivros.id = id;
	}
	
	public static boolean isEmprestado() {
		return emprestado;
	}
	public static void setEmprestado(boolean emprestado) {
		ColecaoLivros.emprestado = emprestado;
	}
}
