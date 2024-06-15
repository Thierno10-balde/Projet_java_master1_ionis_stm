package projet_jsp_chaussures;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnect {
	
		public static Connection getConnection() throws Exception { // fonction de classe

			String login = "root";
			String password = "";
			String url = "jdbc:mysql://localhost:3306/chaussures";// socket ip:port
																// emetteur <=>
																// ip:port
																// destinataire

			Connection cn = null;

			// Etape 1 : chargement du driver
			Class.forName("com.mysql.jdbc.Driver"); // MySQL database connection

			// Etape 2 : r�cup�ration de la connexion
			cn = (Connection) DriverManager.getConnection(url, login, password);

			return cn; // return de la connection

		}
	
}
