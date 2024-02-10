package XAMPP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import Entidades.Treino;


public class Banco_Treino {
	private Connection conexao;
	
	public Banco_Treino() {
		this.conexao = Conexao.getConexao();
	}
	
	public boolean INSERT_TREINO(Treino treino) {//Verifica se foi inserido
		boolean ret = true;
		//id autoicrementavel
		String INSERT_TREINO = "INSERT INTO treino ( fkUsuario, fkTrajeto, dificuldade, nomeTrajeto, "
				+ "nomeBicicleta, quilometragem, calorias, tempo, nome) VALUES "
				+ "( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(INSERT_TREINO);
			stmt.setInt(1, treino.getFkUsuario());
			stmt.setInt(2, treino.getFkTrajeto());
			stmt.setString(3, treino.getDificuldade());
			stmt.setString(4, treino.getNomeTrajeto());
			stmt.setString(5, treino.getNomeBicicleta());
			stmt.setDouble(6, treino.getQuilometragem());
			stmt.setDouble(7, treino.getCalorias());
			stmt.setString(8, treino.getTempo());
			stmt.setString(9, treino.getNome());
			
			ret = stmt.execute();
			stmt.close();
			return ret; 
		}catch(SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public LinkedList<Treino> SELECT_TREINO(){ //retorna tudo da tabela
		String SELECT_TREINO = "SELECT * FROM treino";
		
		try {
			LinkedList<Treino> treinos = new LinkedList<Treino>();
			PreparedStatement stmt = this.conexao.prepareStatement(SELECT_TREINO);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Treino t = new Treino();
				t.setId(rs.getInt("id"));
				t.setFkUsuario(rs.getInt("fkUsuario"));
				t.setFkTrajeto(rs.getInt("fkTrajeto"));
				t.setDificuldade(rs.getString("dificuldade"));
				t.setNomeTrajeto(rs.getString("nomeTrajeto"));
				t.setNomeBicicleta(rs.getString("nomeBicicleta"));
				t.setQuilometragem(rs.getDouble("quilometragem"));
				t.setCalorias(rs.getDouble("calorias"));
				t.setTempo(rs.getString("tempo"));
				t.setNome(rs.getString("nome"));
				
				treinos.add(t);
			}
			rs.close();
			stmt.close();
			return treinos;
		}catch(SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public boolean UPDATE_TREINO(Treino treino) { // Atualiza todos os dados da tabela
		boolean ret = true;
		String UPDATE_TREINO= "UPDATE treino SET dificuldade = ?, nomeTrajeto = ?"
				+ ", nomeBicicleta = ?, quilometragem = ?, calorias = ?, tempo = ?, nome = ? "
				+ " WHERE id = ?";
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(UPDATE_TREINO);
			stmt.setString(1, treino.getDificuldade());
			stmt.setString(2, treino.getNomeTrajeto());
			stmt.setString(3, treino.getNomeBicicleta());
			stmt.setDouble(4, treino.getQuilometragem());
			stmt.setDouble(5, treino.getCalorias());
			stmt.setString(6, treino.getTempo());
			stmt.setString(7, treino.getNome());
			stmt.setInt(8, treino.getId());
			ret = stmt.execute();
			stmt.close();
			return ret;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public boolean DELETE_TREINO(int id) { // Deleta tudo
		String DELETE_BICICLETA = "DELETE FROM treino WHERE id = ?";
		boolean ret = true;
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(DELETE_BICICLETA);
			stmt.setInt(1, id);
			ret = stmt.execute();
			stmt.close();
			return ret;
		}catch (SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	//Especiais
	
	public LinkedList<Integer> SELECT_TREINO_ID(){ //retorna os nomes dos trajetos
		String SELECT_TREINO_ID = "SELECT id FROM treino ORDER BY id";
		
		try {
			LinkedList<Integer> ids = new LinkedList<Integer>();
			PreparedStatement stmt = this.conexao.prepareStatement(SELECT_TREINO_ID);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				ids.add(id);
			}
			rs.close();
			stmt.close();
			return ids;
		}catch(SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public Treino SELECT_TRAJETO_PROCURA(String nome){ //retorna tudo sobre um trajeto
		String SELECT_TREINO_PROCURA = "SELECT * FROM treino WHERE nome = ?";
		try {
			Treino t = new Treino();
			PreparedStatement stmt = this.conexao.prepareStatement(SELECT_TREINO_PROCURA);
			stmt.setString(1,nome);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				
				t.setId(rs.getInt("id"));
				t.setFkUsuario(rs.getInt("fkUsuario"));
				t.setFkTrajeto(rs.getInt("fkTrajeto"));
				t.setDificuldade(rs.getString("dificuldade"));
				t.setNomeTrajeto(rs.getString("nomeTrajeto"));
				t.setNomeBicicleta(rs.getString("nomeBicicleta"));
				t.setQuilometragem(rs.getDouble("quilometragem"));
				t.setCalorias(rs.getDouble("calorias"));
				t.setTempo(rs.getString("tempo"));
				t.setNome(rs.getString("nome"));
			}
			rs.close();
			stmt.close();
			return t;
		}catch (SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public LinkedList<String> SELECT_TREINO_NOME(){ //retorna os nomes das bikes
		String SELECT_TREINO_NOME = "SELECT nome FROM treino";
		
		try {
			LinkedList<String> nomes = new LinkedList<String>();
			PreparedStatement stmt = this.conexao.prepareStatement(SELECT_TREINO_NOME);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String nome = rs.getString("nome");
				nomes.add(nome);
			}
			rs.close();
			stmt.close();
			return nomes;
		}catch(SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public LinkedList<String> SELECT_TREINO_NOME_FK(int fk){ //retorna os nomes das bikes
		String SELECT_TREINO_NOME = "SELECT nome FROM treino WHERE fkUsuario = ?";
		
		try {
			LinkedList<String> nomes = new LinkedList<String>();
			PreparedStatement stmt = this.conexao.prepareStatement(SELECT_TREINO_NOME);
			stmt.setInt(1, fk);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String nome = rs.getString("nome");
				nomes.add(nome);
			}
			rs.close();
			stmt.close();
			return nomes;
		}catch(SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
}
