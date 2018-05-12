import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AnimalDAOImplementation implements AnimalDAO {

	@Override
	public void adicionar(Animal a) {
		try {
			Connection con = ConnectionBuilder.getConnection();
			String sql = "INSERT INTO animais (id, nome, nascimento, peso) VALUES (?, ?, ? ,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setLong(1, a.getId());
			stmt.setString(2, a.getNome());
			stmt.setDate(3, (Date) a.getNascimento());
			stmt.setFloat(4, a.getPeso());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void atualizar(long id, Animal a) {
		// TODO Auto-generated method stub
	}

	@Override
	public void adicionar(long id) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Animal> adicionar(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
