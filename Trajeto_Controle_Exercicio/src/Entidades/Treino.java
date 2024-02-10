package Entidades;

public class Treino {
	private int id;//1
	private int fkUsuario;//2
	private int fkTrajeto;//3
	private String dificuldade;//4
	private String nomeTrajeto;//5 //não tem na tabela trajeto do bd tem que fazer select
	private String nomeBicicleta;//6 //não tem na tabela trajeto do bd tem que fazer select
	private double quilometragem;//7
	private double calorias;//8
	private String tempo;//9
	private String nome;//10
	
	public Treino(int id, int fkUsuario, int fkTrajeto, String dificuldade, String nomeTrajeto, String nomeBicicleta,
			double quilometragem, double calorias, String tempo, String nome) {
		this.id = id;
		this.fkUsuario = fkUsuario;
		this.fkTrajeto = fkTrajeto;
		this.dificuldade = dificuldade;
		this.nomeTrajeto = nomeTrajeto;
		this.nomeBicicleta = nomeBicicleta;
		this.quilometragem = quilometragem;
		this.calorias = calorias;
		this.tempo = tempo;
		this.nome = nome;
	}

	public Treino() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFkUsuario() {
		return fkUsuario;
	}

	public void setFkUsuario(int fkUsuario) {
		this.fkUsuario = fkUsuario;
	}

	public int getFkTrajeto() {
		return fkTrajeto;
	}

	public void setFkTrajeto(int fkTrajeto) {
		this.fkTrajeto = fkTrajeto;
	}

	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}

	public String getNomeTrajeto() {
		return nomeTrajeto;
	}

	public void setNomeTrajeto(String nomeTrajeto) {
		this.nomeTrajeto = nomeTrajeto;
	}

	public String getNomeBicicleta() {
		return nomeBicicleta;
	}

	public void setNomeBicicleta(String nomeBicicleta) {
		this.nomeBicicleta = nomeBicicleta;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "id: " + id + ", fkUsuario: " + fkUsuario + ", fkTrajeto: " + fkTrajeto + ", dificuldade: "
				+ dificuldade + ", nomeTrajeto: " + nomeTrajeto + ", nomeBicicleta: " + nomeBicicleta + ", quilometragem: "
				+ quilometragem + ", calorias: " + calorias + ", tempo: " + tempo+ ", nome: " + nome;
	}
	
}
