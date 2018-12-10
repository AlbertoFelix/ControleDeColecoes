package controleDeColecoes;

public class ColecaoFilmes {
	public static String nome, genero;
	public static int id, ano;
	public static boolean emprestado;
	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		ColecaoFilmes.nome = nome;
	}
	public static String getGenero() {
		return genero;
	}
	public static void setGenero(String genero) {
		ColecaoFilmes.genero = genero;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		ColecaoFilmes.id = id;
	}
	public static int getAno() {
		return ano;
	}
	public static void setAno(int ano) {
		ColecaoFilmes.ano = ano;
	}
	public static boolean isEmprestado() {
		return emprestado;
	}
	public static void setEmprestado(boolean emprestado) {
		ColecaoFilmes.emprestado = emprestado;
	}

}
