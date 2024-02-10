package Entidades;

public class Usuario {
	private int id;//1
	private String nome;//2
	private String login;//3
	private String senha;//4
	private int idade;//5
	private double estatura;//6
	private double peso;//7
	private String nivel_do_Ciclista;//8
	private double quilometros_Pedalados;//9
	
	public Usuario(int id, String nome, String login, String senha, int idade, double estatura,
			double peso, String nivel_do_Ciclista, double quilometros_Pedalados) {
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.idade = idade;
		this.estatura = estatura;
		this.peso = peso;
		this.nivel_do_Ciclista = nivel_do_Ciclista;
		this.quilometros_Pedalados = quilometros_Pedalados;
	}

	public Usuario() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNivel_do_Ciclista() {
		return nivel_do_Ciclista;
	}

	public void setNivel_do_Ciclista(String nivel_do_Ciclista) {
		this.nivel_do_Ciclista = nivel_do_Ciclista;
	}

	public double getQuilometros_Pedalados() {
		return quilometros_Pedalados;
	}

	public void setQuilometros_Pedalados(double quilometros_Pedalados) {
		this.quilometros_Pedalados = quilometros_Pedalados;
	}

	@Override
	public String toString() {
		return "id: " + id + ", nome: " + nome + ", login: " + login + ", senha: "
				+ senha + ", idade: " + idade + ", estatura: " + estatura + ", peso: " + peso + ", nivel do Ciclista: "
				+ nivel_do_Ciclista + ", quilômetros_Pedalados: " + quilometros_Pedalados;
	}
	
	
}
