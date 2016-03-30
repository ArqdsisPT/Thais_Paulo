package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import factory.ConnectionFactory;
import to.CursoTO;

public class CursoDAO extends ConnectionFactory {

	// Metodos CRUD
	// 
	public CursoDAO(){}
	public void cadastrar(CursoTO to) {
		String sql = "Insert into curso(codigo, nome, data_inicio, data_termino, horario, vagas, valor) values (?,?,?,?,?,?,?)";
		try {
			Connection conn = (Connection) ConnectionFactory.obtemConexao();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
			pst.setString(1,to.getCod());
			pst.setString(2,to.getNome());
			pst.setString(3,to.getDataIni());
			pst.setString(4,to.getDataTer());
			pst.setString(5,to.getHorario());
			pst.setInt(6, to.getVagas());
			pst.setDouble(7,to.getValor());
			pst.executeUpdate();
			pst.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public CursoTO consultar(String cod) {
		
		CursoTO to = new CursoTO();

		String sql = "select * from curso where codigo = ?";

		try {
			
			Connection conn = ConnectionFactory.obtemConexao();

			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, to.getCod());

			ResultSet rs = pst.executeQuery();

			if (rs.next()) {

				to.setCod(rs.getString("codigo"));
				to.setNome(rs.getString("nome"));
				to.setDataIni(rs.getString("data_inicio"));
				to.setDataTer(rs.getString("data_termino"));
				to.setHorario(rs.getString("horario"));
				to.setVagas(rs.getInt("vagas"));
				to.setValor(rs.getDouble("valor"));
				}
			pst.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return to;
	}
	public void alterar(CursoTO to) {
		String sql = "update curso set nome=?, data_inicio=?, data_termino=?, horario=?, vagas=?, valor=? where codigo=?";

		try {
			Connection conn = ConnectionFactory.obtemConexao();
			
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, to.getNome());
			pst.setString(2, to.getDataIni());
			pst.setString(3, to.getDataTer());
			pst.setString(4, to.getHorario());
			pst.setInt(5, to.getVagas());
			pst.setDouble(6, to.getValor());
			pst.setString(7, to.getCod());
			pst.executeUpdate();
			pst.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deletar(CursoTO to) {

		
		String sql = "delete from curso where codigo=?";

		try {
              
			Connection conn = ConnectionFactory.obtemConexao();
			
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, to.getCod());
			pst.executeUpdate();
			pst.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
