package controleDeColecoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingleton {
	
	private static Connection connectionSingleton;
	
	private static String dsn = "jdbc:mysql://localhost:3306/colecoes";
    private static String username = "root";
    private static String password = "210112";
    
    public static Connection getConnection() {
		if(connectionSingleton == null) {
			try {
				connectionSingleton = DriverManager.getConnection(dsn, username, password);
				System.out.println("Conexão feita");
			} catch(SQLException ex) {
				System.out.println("Houve um erro ao conectar com o Banco de Dados.");
			}
		}
    	
    	return connectionSingleton;
    	
    }

}
