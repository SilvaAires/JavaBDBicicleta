package Entidades;

public class Trajeto {
	private int id;//1
	private String nome;//2
	private double distancia;//3
	private String tempo_Previsto;//4
	private String tipo_Terreno;//5
	private double calorias_Gastas;//6
	private String elevacao;//7
	
	public Trajeto(int id, String nome, double distancia, String tempo_Previsto, String tipo_Terreno,
			double calorias_Gastas, String elevacao) {
		this.id = id;
		this.nome = nome;
		this.distancia = distancia;
		this.tempo_Previsto = tempo_Previsto;
		this.tipo_Terreno = tipo_Terreno;
		this.calorias_Gastas = calorias_Gastas;
		this.elevacao = elevacao;
	}
	
	public Trajeto() {
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

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public String getTempo_Previsto() {
		return tempo_Previsto;
	}

	public void setTempo_Previsto(String tempo_Previsto) {
		this.tempo_Previsto = tempo_Previsto;
	}

	public String getTipo_Terreno() {
		return tipo_Terreno;
	}

	public void setTipo_Terreno(String tipo_Terreno) {
		this.tipo_Terreno = tipo_Terreno;
	}

	public double getCalorias_Gastas() {
		return calorias_Gastas;
	}

	public void setCalorias_Gastas(double calorias_Gastas) {
		this.calorias_Gastas = calorias_Gastas;
	}

	public String getElevacao() {
		return elevacao;
	}

	public void setElevacao(String elevacao) {
		this.elevacao = elevacao;
	}

	@Override
	public String toString() {
		return "id: " + id + ", nome: " + nome + ", distancia: " + distancia + ", tempo Previsto:"
				+ tempo_Previsto + ", tipo Terreno: " + tipo_Terreno + ", calorias Gastas: " + calorias_Gastas
				+ ", Elevação: " + elevacao;
	}
	
}
