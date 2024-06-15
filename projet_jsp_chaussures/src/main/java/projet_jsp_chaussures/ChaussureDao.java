package projet_jsp_chaussures;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class ChaussureDao {
	static List<chaussure> listchaussure= new ArrayList<chaussure>();
	static public List<chaussure> getAllchaussure()throws Exception {

		String sql = "SELECT * FROM chaussure";
		Connection conn = Dbconnect.getConnection();
		Statement statement = conn.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String description= resultSet.getString("description");
			int prix= resultSet.getInt("prix");
			chaussure itemchaussure = new chaussure (id,description,prix);
			listchaussure.add(itemchaussure);
		}
		resultSet.close();
		statement.close();
		conn.close();

		// itemchaussursdisconnect();

		return listchaussure;

}
	static public chaussure getchaussureById(int chaussureid) throws Exception {

		Connection conn = Dbconnect.getConnection();

		String query = "select * from chaussure where id = " + chaussureid;
		Statement stmt = conn.createStatement();

		ResultSet res = stmt.executeQuery(query);
		res.next();
		int id = res.getInt("id");
		String description= res.getString("description");
		int prix= res.getInt("prix");
		chaussure unechaussure = new chaussure (id, description,prix);

		return unechaussure;

	}
}
