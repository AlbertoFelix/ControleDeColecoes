package controleDeColecoes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLColecao implements InterfaceColecionador {

	Connection conexao = new ConnectionSingleton().getConnection(); 
	
	public SQLColecao() {
	}

	public void inserir(ColecoesFacade colecoes) {
		
		String sql = "insert into colecaoLivros "+"(titulo,autor,id,emprestado) "+"VALUES (?,?,?,?)";
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, colecoes.livroTituloBD());
			stmt.setString(2, colecoes.livroAutorBD());
			stmt.setInt(3, colecoes.livroIdBD());
			stmt.setBoolean(4, colecoes.livroEmprestadoBD());
			stmt.execute();
			stmt.close();
			
			System.out.println("Livro adicionado!");
			conexao.close();
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}
	
}
