package controleDeColecoes;

public class Colecionador {

	public static String login, senha;
	public static int id;
	
	
	public static String getLogin() {
		return login;
	}
	public static void setLogin(String login) {
		Colecionador.login = login;
	}
	
	public static String getSenha() {
		return senha;
	}
	public static void setSenha(String senha) {
		Colecionador.senha = senha;
	}
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Colecionador.id = id;
	}
		
}
