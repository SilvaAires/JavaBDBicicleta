package XAMPP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import Entidades.Bicicleta;

public class Banco_Bicicleta {
	private Connection conexao;
	
	public Banco_Bicicleta() {
		this.conexao = Conexao.getConexao();
	}
	
	public boolean INSERT_BICICLETA(Bicicleta bicicleta) {//Verifica se foi inserido
		boolean ret = true;
		//id autoicrementavel
		String INSERT_BICICLETA = "INSERT INTO bicicleta ( fkUsuario, nome, marca, modelo, aro, quadro, "
				+ "quilometragem, revisao, troca_de_Corrente, lubrificacao, estado_dos_Pneus, km2, km1) VALUES "
				+ "( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(INSERT_BICICLETA);
			stmt.setInt(1, bicicleta.getFkUsuario());
			stmt.setString(2, bicicleta.getNome());
			stmt.setString(3, bicicleta.getMarca());
			stmt.setString(4, bicicleta.getModelo());
			stmt.setInt(5, bicicleta.getAro());
			stmt.setInt(6, bicicleta.getQuadro());
			stmt.setDouble(7, bicicleta.getQuilometragem());
			stmt.setDate(8, bicicleta.getRevisao());
			stmt.setDate(9, bicicleta.getTroca_de_Corrente());
			stmt.setDate(10, bicicleta.getLubrificacao());
			stmt.setString(11, bicicleta.getEstado_dos_Pneus());
			stmt.setDouble(12, bicicleta.getKm2());
			stmt.setDouble(13, bicicleta.getKm1());
			
			ret = stmt.execute();
			stmt.close();
			return ret; 
		}catch(SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public LinkedList<Bicicleta> SELECT_BICICLETA(){ //retorna tudo da tabela
		String SELECT_BICICLETA = "SELECT * FROM bicicleta";
		
		try {
			LinkedList<Bicicleta> bicicletas = new LinkedList<Bicicleta>();
			PreparedStatement stmt = this.conexao.prepareStatement(SELECT_BICICLETA);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Bicicleta b = new Bicicleta();
				b.setId(rs.getInt("id"));
				b.setFkUsuario(rs.getInt("fkUsuario"));
				b.setNome(rs.getString("nome"));
				b.setMarca(rs.getString("marca"));
				b.setModelo(rs.getString("modelo"));
				b.setAro(rs.getInt("aro"));
				b.setQuadro(rs.getInt("quadro"));
				b.setQuilometragem(rs.getDouble("quilometragem"));
				b.setRevisao(rs.getDate("revisao"));
				b.setTroca_de_Corrente(rs.getDate("troca_de_Corrente"));
				b.setLubrificacao(rs.getDate("lubrificacao"));
				b.setEstado_dos_Pneus(rs.getString("estado_dos_Pneus"));
				b.setKm2(rs.getDouble("km2"));
				b.setKm2(rs.getDouble("km1"));
				bicicletas.add(b);
			}
			rs.close();
			stmt.close();
			return bicicletas;
		}catch(SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public boolean UPDATE_BICICLETA(Bicicleta bicicleta) { // Atualiza todos os dados da tabela
		boolean ret = true;
		String UPDATE_BICICLETA = "UPDATE bicicleta SET nome = ?, marca = ?, modelo = ?"
				+ ", aro = ?, quadro = ?, quilometragem = ?, revisao = ?, troca_de_Corrente = ?, "
				+ "lubrificacao = ?, estado_dos_Pneus = ?, km2 = ?, km1 = ? WHERE id = ?";
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(UPDATE_BICICLETA);
			stmt.setString(1, bicicleta.getNome());
			stmt.setString(2, bicicleta.getMarca());
			stmt.setString(3, bicicleta.getModelo());
			stmt.setInt(4, bicicleta.getAro());
			stmt.setInt(5, bicicleta.getQuadro());
			stmt.setDouble(6, bicicleta.getQuilometragem());
			stmt.setDate(7, bicicleta.getRevisao());
			stmt.setDate(8, bicicleta.getTroca_de_Corrente());
			stmt.setDate(9, bicicleta.getLubrificacao());
			stmt.setString(10, bicicleta.getEstado_dos_Pneus());
			stmt.setDouble(11, bicicleta.getKm2());
			stmt.setDouble(12, bicicleta.getKm2());
			stmt.setInt(13, bicicleta.getId());
			ret = stmt.execute();
			stmt.close();
			return ret;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public boolean DELETE_BICICLETA(int id) { // Deleta tudo
		String DELETE_BICICLETA = "DELETE FROM bicicleta WHERE id = ?";
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
	
	public LinkedList<String> SELECT_BICICLETA_NOME(){ //retorna os nomes das bikes
		String SELECT_BICICLETA_NOME = "SELECT nome FROM bicicleta";
		
		try {
			LinkedList<String> nomes = new LinkedList<String>();
			PreparedStatement stmt = this.conexao.prepareStatement(SELECT_BICICLETA_NOME);
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
	
	public LinkedList<String> SELECT_BICICLETA_NOME_FK(int fk){ //retorna os nomes das bikes
		String SELECT_BICICLETA_NOME = "SELECT nome FROM bicicleta WHERE fkUsuario = ?";
		
		try {
			LinkedList<String> nomes = new LinkedList<String>();
			PreparedStatement stmt = this.conexao.prepareStatement(SELECT_BICICLETA_NOME);
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
	
	public LinkedList<Bicicleta> SELECT_BICICLETA_QUILOMETRAGEM(){ //retorna o KM da tabela
		String SELECT_BICICLETA = "SELECT id, nome, quilometragem, km2, km1 FROM bicicleta ORDER BY id";
		
		try {
			LinkedList<Bicicleta> bicicletas = new LinkedList<Bicicleta>();
			PreparedStatement stmt = this.conexao.prepareStatement(SELECT_BICICLETA);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Bicicleta b = new Bicicleta();
				b.setId(rs.getInt("id"));
				b.setNome(rs.getString("nome"));
				b.setQuilometragem(rs.getDouble("quilometragem"));
				b.setKm2(rs.getDouble("km2"));
				b.setKm1(rs.getDouble("km1"));
				bicicletas.add(b);
			}
			rs.close();
			stmt.close();
			return bicicletas;
		}catch(SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public Bicicleta SELECT_BICICLETA_QUILOMETRAGEM_UMA(int id){ //retorna o KM de uma bike da tabela
		String SELECT_BICICLETA = "SELECT id, nome, quilometragem, km2, km1 FROM bicicleta WHERE id = ?";
		
		try {
			Bicicleta b = new Bicicleta();
			PreparedStatement stmt = this.conexao.prepareStatement(SELECT_BICICLETA);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				
				b.setId(rs.getInt("id"));
				b.setNome(rs.getString("nome"));
				b.setQuilometragem(rs.getDouble("quilometragem"));
				b.setKm2(rs.getDouble("km2"));
				b.setKm1(rs.getDouble("km1"));
			}
			rs.close();
			stmt.close();
			return b;
		}catch(SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public Bicicleta SELECT_BICICLETA_PROCURA( String nome){ //retorna tudo sobre uma bike
		String SELECT_BICICLETA_PROCURA = "SELECT * FROM bicicleta WHERE nome LIKE ?";
		try {
			Bicicleta b = new Bicicleta();
			PreparedStatement stmt = this.conexao.prepareStatement(SELECT_BICICLETA_PROCURA);
			stmt.setString(1,'%'+nome+'%');
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				b.setId(rs.getInt("id"));
				b.setFkUsuario(rs.getInt("fkUsuario"));
				b.setNome(rs.getString("nome"));
				b.setMarca(rs.getString("marca"));
				b.setModelo(rs.getString("modelo"));
				b.setAro(rs.getInt("aro"));
				b.setQuadro(rs.getInt("quadro"));
				b.setQuilometragem(rs.getDouble("quilometragem"));
				b.setRevisao(rs.getDate("revisao"));
				b.setTroca_de_Corrente(rs.getDate("troca_de_Corrente"));
				b.setLubrificacao(rs.getDate("lubrificacao"));
				b.setEstado_dos_Pneus(rs.getString("estado_dos_Pneus"));
				b.setKm2(rs.getDouble("km2"));
				b.setKm1(rs.getDouble("km1"));
			}
			rs.close();
			stmt.close();
			return b;
		}catch (SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public boolean UPDATE_BICICLETA_KM(double km, int id) { // Atualiza automatico quando se conclui um treino 
		boolean ret = true;
		String UPDATE_BICICLETA_KM = "UPDATE bicicleta SET quilometragem = ? WHERE id = ?";
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(UPDATE_BICICLETA_KM);
			stmt.setDouble(1, km);
			stmt.setInt(2, id);
			ret = stmt.execute();
			stmt.close();
			return ret;
		}catch(SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public boolean UPDATE_BICICLETA_KM1(double km, int id) { // Atualiza automatico quando se conclui um treino 
		boolean ret = true;
		String UPDATE_BICICLETA_KM = "UPDATE bicicleta SET km1 = ? WHERE id = ?";
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(UPDATE_BICICLETA_KM);
			stmt.setDouble(1, km);
			stmt.setInt(2, id);
			ret = stmt.execute();
			stmt.close();
			return ret;
		}catch(SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public boolean UPDATE_BICICLETA_KM2(double km, int id) { // Atualiza automatico quando se conclui um treino 
		boolean ret = true;
		String UPDATE_BICICLETA_KM = "UPDATE bicicleta SET km2 = ? WHERE id = ?";
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(UPDATE_BICICLETA_KM);
			stmt.setDouble(1, km);
			stmt.setInt(2, id);
			ret = stmt.execute();
			stmt.close();
			return ret;
		}catch(SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public boolean UPDATE_BICICLETA_LIMITADO(Bicicleta bicicleta) { // Atualiza todos os dados da tabela
		boolean ret = true;
		String UPDATE_BICICLETA = "UPDATE bicicleta SET nome = ?, marca = ?, modelo = ?"
				+ ", aro = ?, quadro = ?, estado_dos_Pneus = ? WHERE id = ?";
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(UPDATE_BICICLETA);
			stmt.setString(1, bicicleta.getNome());
			stmt.setString(2, bicicleta.getMarca());
			stmt.setString(3, bicicleta.getModelo());
			stmt.setInt(4, bicicleta.getAro());
			stmt.setInt(5, bicicleta.getQuadro());
			stmt.setString(6, bicicleta.getEstado_dos_Pneus());
			stmt.setInt(7, bicicleta.getId());
			ret = stmt.execute();
			stmt.close();
			return ret;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
}