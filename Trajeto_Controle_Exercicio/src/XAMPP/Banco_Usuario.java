package XAMPP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import Entidades.Usuario;


public class Banco_Usuario {
	private Connection conexao;
	
	public Banco_Usuario() {
		this.conexao = Conexao.getConexao();
	}
	
	public boolean INSERT_USUARIO(Usuario usuario) {//Verifica se foi inserido
		boolean ret = true;
		//id autoicrementavel
		String INSERT_USUARIO = "INSERT INTO usuario ( nome, login, senha, idade, estatura, peso, "
				+ "nivel_do_Ciclista, quilometros_Pedalados) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(INSERT_USUARIO);
			
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getLogin());
			stmt.setString(3, usuario.getSenha());
			stmt.setInt(4, usuario.getIdade());
			stmt.setDouble(5, usuario.getEstatura());
			stmt.setDouble(6, usuario.getPeso());
			stmt.setString(7, usuario.getNivel_do_Ciclista());
			stmt.setDouble(8, usuario.getQuilometros_Pedalados());
			
			ret = stmt.execute();
			stmt.close();
			return ret; 
		}catch(SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public LinkedList<Usuario> SELECT_USUARIO(){ //retorna tudo da tabela
		String SELECT_USUARIO = "SELECT * FROM usuario";
		
		try {
			LinkedList<Usuario> Usuarios = new LinkedList<Usuario>();
			PreparedStatement stmt = this.conexao.prepareStatement(SELECT_USUARIO);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Usuario u = new Usuario();
				u.setId(rs.getInt("id"));
				u.setNome(rs.getString("nome"));
				u.setLogin(rs.getString("login"));
				u.setSenha(rs.getString("senha"));
				u.setIdade(rs.getInt("idade"));
				u.setEstatura(rs.getDouble("estatura"));
				u.setPeso(rs.getDouble("peso"));
				u.setNivel_do_Ciclista(rs.getString("nivel_do_Ciclista"));
				u.setQuilometros_Pedalados(rs.getDouble("quilometros_Pedalados"));
				
				Usuarios.add(u);
			}
			rs.close();
			stmt.close();
			return Usuarios;
		}catch(SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public boolean UPDATE_USUARIO(Usuario usuario) { // Atualiza todos os dados da tabela
		boolean ret = true;
		String UPDATE_USUARIO = "UPDATE usuario SET nome = ?, login = ?"
				+ ", senha = ?, idade = ?, estatura = ?, peso = ?, nivel_do_Ciclista = ?, "
				+ "quilometros_Pedalados = ? WHERE id = ?";
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(UPDATE_USUARIO);
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getLogin());
			stmt.setString(3, usuario.getSenha());
			stmt.setInt(4, usuario.getIdade());
			stmt.setDouble(5, usuario.getEstatura());
			stmt.setDouble(6, usuario.getPeso());
			stmt.setString(7, usuario.getNivel_do_Ciclista());
			stmt.setDouble(8, usuario.getQuilometros_Pedalados());
			stmt.setInt(9, usuario.getId());
			ret = stmt.execute();
			stmt.close();
			return ret;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public boolean DELETE_USUARIO(int id) { // Deleta tudo
		String DELETE_USUARIO = "DELETE FROM usuario WHERE id = ?";
		boolean ret = true;
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(DELETE_USUARIO);
			stmt.setInt(1, id);
			ret = stmt.execute();
			stmt.close();
			return ret;
		}catch (SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	//Especiais
	
	public LinkedList<Usuario> SELECT_USUARIO_QUILOMETRAGEM_UMA(int id){ //retorna o KM de uma bike da tabela
		String SELECT_USUARIO = "SELECT id, nome, quilometros_Pedalados FROM usuario WHERE id = ? ORDER BY id";
		
		try {
			LinkedList<Usuario> usarios = new LinkedList<Usuario>();
			PreparedStatement stmt = this.conexao.prepareStatement(SELECT_USUARIO);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Usuario u = new Usuario();
				u.setId(rs.getInt("id"));
				u.setNome(rs.getString("nome"));
				u.setQuilometros_Pedalados(rs.getDouble("quilometros_Pedalados"));
				usarios.add(u);
			}
			rs.close();
			stmt.close();
			return usarios;
		}catch(SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public boolean UPDATE_USUARIO_KM(double km, int id) { // Atualiza automatico quando se conclui um treino 
		boolean ret = true;
		String UPDATE_USUARIO_KM = "UPDATE usuario SET quilometros_Pedalados = ? WHERE id = ?";
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(UPDATE_USUARIO_KM);
			stmt.setDouble(1, km);
			stmt.setInt(2, id);
			ret = stmt.execute();
			stmt.close();
			return ret;
		}catch(SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public LinkedList<String> SELECT_USUARIO_NOME(){ //retorna os nomes dos trajetos
		String SELECT_USUARIO_NOME = "SELECT nome FROM usuario ORDER BY nome";
		
		try {
			LinkedList<String> nomes = new LinkedList<String>();
			PreparedStatement stmt = this.conexao.prepareStatement(SELECT_USUARIO_NOME);
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
	
	public Usuario SELECT_USUARIO_PROCURA1(String nome){ //retorna tudo sobre um trajeto
		String SELECT_USUARIO_PROCURA = "SELECT * FROM usuario WHERE nome = ?";
		try {
			Usuario u = new Usuario();
			PreparedStatement stmt = this.conexao.prepareStatement(SELECT_USUARIO_PROCURA);
			stmt.setString(1,nome);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				u.setId(rs.getInt("id"));
				u.setNome(rs.getString("nome"));
				u.setLogin(rs.getString("login"));
				u.setSenha(rs.getString("senha"));
				u.setIdade(rs.getInt("idade"));
				u.setEstatura(rs.getDouble("estatura"));
				u.setPeso(rs.getDouble("peso"));
				u.setNivel_do_Ciclista(rs.getString("nivel_do_Ciclista"));
				u.setQuilometros_Pedalados(rs.getDouble("quilometros_Pedalados"));
			}
			rs.close();
			stmt.close();
			return u;
		}catch (SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public Usuario SELECT_LOGIN(String login, String senha) {
		String SELECT_LOGIN = "SELECT id, nome , login, senha FROM usuario WHERE login = ? AND senha = ?";
		try {
			Usuario us = new Usuario();
			PreparedStatement stmt = this.conexao.prepareStatement(SELECT_LOGIN);
			stmt.setString(1, login);
			stmt.setString(2, senha);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				us.setId(rs.getInt("id"));
				us.setNome(rs.getString("nome"));
				us.setLogin(rs.getString("login"));
				us.setSenha(rs.getString("senha"));
			}
			rs.close();
			stmt.close();
			return us;
		}catch (SQLException exception) {
			throw new RuntimeException(exception);
		}
	}
}
