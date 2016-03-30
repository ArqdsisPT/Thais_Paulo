package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import factory.ConnectionFactory;
import to.AlunoTO; 
public class AlunoDAO {

	// Metodos CRUD
	// Cadastrar
	public void cadastrar(AlunoTO to){
		String sqlInsert = "INSERT TO Aluno(nome,telefone,endereco,email,rg,cpf) VALUES (?,?,?,?,?)";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);){
			stm.setString(1,to.getNome());
			stm.setString(2,to.getTelefone());
			stm.setString(3, to.getEndereco());
			stm.setString(3, to.getEmail());
			stm.setString(4, to.getRg());
			stm.setInt(5, to.getCpf());
			stm.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	// Consultar 
	public AlunoTO consultar(int cpf){
		AlunoTO to = new AlunoTO();
		String sqlSelect = "select * from Aluno WHERE cpf = ?";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);){
			stm.setInt(1,to.getCpf());
			try (ResultSet rs = stm.executeQuery();){
				if(rs.next()){
					to.setNome("nome");
					to.setTelefone("telefone");
					to.setEndereco("endereco");
					to.setEmail("email");
					to.setRg("rg");
					to.setCpf(cpf);
				}
			} catch(SQLException e){
				e.printStackTrace();
			}
		}catch(SQLException e1){
			e1.printStackTrace();
		}
		return to;
	}
	// Alterar 
	public void alterar(AlunoTO to){
		String sqlUpdate = "UPDATE Aluno SET nome = ?, telefone = ?, endereco = ?,email = ?, rg = ?, cpf = ? WHERE cpf ?";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlUpdate);){
			stm.setString(1,to.getNome());
			stm.setString(2,to.getTelefone());
			stm.setString(3, to.getEndereco());
			stm.setString(3, to.getEmail());
			stm.setString(4, to.getRg());
			stm.setInt(5, to.getCpf());
			stm.execute();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	// Deletar

	public void deletar(AlunoTO to){
		String sqlDelete = "DELETE FROM Aluno WHERE cpf = ?";
		try(Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlDelete);){
			stm.setInt(1,to.getCpf());
			stm.execute();
		}catch(Exception e){
			e.printStackTrace();
		}		
	}



}
