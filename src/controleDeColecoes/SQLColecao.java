package controleDeColecoes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTable;

public class SQLColecao implements InterfaceColecionador {

	Connection conexao = new ConnectionSingleton().getConnection(); 
	
	public SQLColecao() {
		
	}
	
	public void consultar(JTable tbl) {
		try {
			Statement stmt = conexao.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from colecoes.colecao");
			javax.swing.table.DefaultTableModel dtm2 = (javax.swing.table.DefaultTableModel)tbl.getModel();
			dtm2.setNumRows(0);
			int x = 0;
			
			while(rs.next()) {
				dtm2.addRow(new Object[] {"","","","","","",""});
				tbl.setValueAt(rs.getString(1), x, 0);
				tbl.setValueAt(rs.getString(2), x, 1);
				tbl.setValueAt(rs.getString(3), x, 2);
				tbl.setValueAt(rs.getString(4), x, 3);
				tbl.setValueAt(rs.getString(5), x, 4);
				tbl.setValueAt(rs.getString(6), x, 5);
				tbl.setValueAt(rs.getString(7), x, 6);
			}
		} catch(SQLException ex) {
			System.out.println("ErroSQL");
		}
	}
	
	public void adicionarColecionador(ColecoesFacade colecionador) {
		//String sqlT
	}
	
	
	public void inserir(ColecoesFacade colecoes, String nome_objeto) {
		switch(nome_objeto) {
		case "colecionador":
			String sqlColecionador = "insert into colecoes.colecionador "+"(login,senha) "+"VALUES (?,?)";
			
			try {
				PreparedStatement stmt = conexao.prepareStatement(sqlColecionador);
				stmt.setString(1, colecoes.colecionadorLogin());
				stmt.setString(2, colecoes.colecionadorSenha());
				stmt.execute();
				stmt.close();
				
				System.out.println("Colecionador adicionado!");
				//conexao.close();
			} catch (SQLException u) {
				throw new RuntimeException(u);
			} break;
			
		case "colecao":
			String sqlColecao = "insert into colecoes.colecao "+"(objeto_colecao,nome,situacao,autor,ano) "+"VALUES (?,?,?,?,?)";
			
			try {
				PreparedStatement stmt = conexao.prepareStatement(sqlColecao);
				stmt.setString(1, colecoes.colecao_objeto());
				stmt.setString(2, colecoes.objeto_nome());
				stmt.setBoolean(3, colecoes.objeto_situacao());
				stmt.setString(4, colecoes.objeto_autor());
				stmt.setInt(5, colecoes.objeto_ano());
				stmt.execute();
				stmt.close();
				
				System.out.println("Coleção adicionada!");
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
