package controleDeColecoes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLColecao implements InterfaceColecionador {

	Connection conexao = new ConnectionSingleton().getConnection(); 
	
	public SQLColecao() {
	}

	public void inserir(ColecoesFacade colecoes, String tipo) {
		switch(tipo) {
		case "Livro":
			String sqlLivro = "insert into colecaoLivros "+"(titulo,autor,id,emprestado) "+"VALUES (?,?,?,?)";
			
			try {
				PreparedStatement stmt = conexao.prepareStatement(sqlLivro);
				stmt.setString(1, colecoes.livroTituloBD());
				stmt.setString(2, colecoes.livroAutorBD());
				stmt.setInt(3, colecoes.livroIdBD());
				stmt.setBoolean(4, colecoes.livroEmprestadoBD());
				stmt.execute();
				stmt.close();
				
				System.out.println("Livro adicionado!");
				//conexao.close();
			} catch (SQLException u) {
				throw new RuntimeException(u);
			} break;
			
		case "Filme":
			String sqlFilme = "insert into colecaoFilmes "+"(nome,genero,id,emprestado,ano) "+"VALUES (?,?,?,?,?)";
			
			try {
				PreparedStatement stmt = conexao.prepareStatement(sqlFilme);
				stmt.setString(1, colecoes.filmeNomeBD());
				stmt.setString(2, colecoes.filmeGeneroBD());
				stmt.setInt(3, colecoes.filmeIdBD());
				stmt.setBoolean(4, colecoes.filmeEmprestadoBD());
				stmt.setInt(5, colecoes.filmeAnoBD());
				stmt.execute();
				stmt.close();
				
				System.out.println("Filme adicionado!");
				//conexao.close();
			} catch (SQLException u) {
				throw new RuntimeException(u);
			} break;
		
		default:
			System.out.println("Tipo de coleção inexistente.");
			break;
		}
		
	}
	
}
