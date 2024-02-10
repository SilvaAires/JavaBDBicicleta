package XAMPP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import Entidades.Trajeto;


public class Banco_Trajeto {
	private Connection conexao;
	
	public Banco_Trajeto() {
		this.conexao = Conexao.getConexao();
	}
	
	public boolean INSERT_TRAJETO(Trajeto trajeto) {//Verifica se foi inserido
		boolean ret = true;
		//id autoicrementavel
		String INSERT_TRAJETO = "INSERT INTO trajeto ( nome, distancia, tempo_Previsto, tipo_Terreno, "
				+ "calorias_Gastas, elevacao) VALUES ( ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(INSERT_TRAJETO);
			stmt.setString(1, trajeto.getNome());
			stmt.setDouble(2, trajeto.getDistancia());
			stmt.setString(3, trajeto.getTempo_Previsto());
			stmt.setString(4, trajeto.getTipo_Terreno());
			stmt.setDouble(5, trajeto.getCalorias_Gastas());
			stmt.setString(6, trajeto.getElevacao());
			
			ret = stmt.execute();
			stmt.close();
			return ret; 
		}catch(SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public LinkedList<Trajeto> SELECT_TRAJETO(){ //retorna tudo da tabela
		String SELECT_TRAJETO = "SELECT * FROM trajeto";
		
		try {
			LinkedList<Trajeto> trajetos = new LinkedList<Trajeto>();
			PreparedStatement stmt = this.conexao.prepareStatement(SELECT_TRAJETO);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Trajeto j = new Trajeto();
				j.setId(rs.getInt("id"));
				j.setNome(rs.getString("nome"));
				j.setDistancia(rs.getDouble("distancia"));
				j.setTempo_Previsto(rs.getString("tempo_Previsto"));
				j.setTipo_Terreno(rs.getString("tipo_Terreno"));
				j.setCalorias_Gastas(rs.getDouble("calorias_Gastas"));
				j.setElevacao(rs.getString("elevacao"));
				trajetos.add(j);
			}
			rs.close();
			stmt.close();
			return trajetos;
		}catch(SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public boolean UPDATE_TRAJETOS(Trajeto trajeto) { // Atualiza todos os dados da tabela
		boolean ret = true;
		String UPDATE_TRAJETO = "UPDATE trajeto SET nome = ?, distancia = ?, tempo_Previsto = ?"
				+ ", tipo_Terreno = ?, calorias_Gastas = ?, elevacao = ? WHERE id = ?";
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(UPDATE_TRAJETO);
			stmt.setString(1, trajeto.getNome());
			stmt.setDouble(2, trajeto.getDistancia());
			stmt.setString(3, trajeto.getTempo_Previsto());
			stmt.setString(4, trajeto.getTipo_Terreno());
			stmt.setDouble(5, trajeto.getCalorias_Gastas());
			stmt.setString(6, trajeto.getElevacao());
			stmt.setInt(7, trajeto.getId());
			ret = stmt.execute();
			stmt.close();
			return ret;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public boolean DELETE_TRAJETO(int id) { // Deleta tudo
		String DELETE_TRAJETO = "DELETE FROM trajeto WHERE id = ?";
		boolean ret = true;
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(DELETE_TRAJETO);
			stmt.setInt(1, id);
			ret = stmt.execute();
			stmt.close();
			return ret;
		}catch (SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	//Especiais
	
	public LinkedList<String> SELECT_TRAJETO_NOME(){ //retorna os nomes dos trajetos
		String SELECT_TRAJETO_NOME = "SELECT nome FROM trajeto ORDER BY nome";
		
		try {
			LinkedList<String> nomes = new LinkedList<String>();
			PreparedStatement stmt = this.conexao.prepareStatement(SELECT_TRAJETO_NOME);
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
	
	public Trajeto SELECT_TRAJETO_PROCURA(String nome){ //retorna tudo sobre um trajeto
		String SELECT_TRAJETO_PROCURA = "SELECT * FROM trajeto WHERE nome LIKE ?";
		try {
			Trajeto j = new Trajeto();
			PreparedStatement stmt = this.conexao.prepareStatement(SELECT_TRAJETO_PROCURA);
			stmt.setString(1,'%'+nome+'%');
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				
				j.setId(rs.getInt("id"));
				j.setNome(rs.getString("nome"));
				j.setDistancia(rs.getDouble("distancia"));
				j.setTempo_Previsto(rs.getString("tempo_Previsto"));
				j.setTipo_Terreno(rs.getString("tipo_Terreno"));
				j.setCalorias_Gastas(rs.getDouble("calorias_Gastas"));
				j.setElevacao(rs.getString("elevacao"));
			}
			rs.close();
			stmt.close();
			return j;
		}catch (SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
}
