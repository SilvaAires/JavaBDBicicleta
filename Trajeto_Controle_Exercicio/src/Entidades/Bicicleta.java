package Entidades;

import java.sql.Date;

public class Bicicleta {
	private int id;//1
	private int fkUsuario;//2
	private String nome;//3
	private String marca;//4
	private String modelo;//5
	private int aro;//6
	private int quadro;//7
	private double quilometragem;//8
	private Date revisao;//9
	private Date troca_de_Corrente;//10
	private Date lubrificacao;//11
	private String estado_dos_Pneus;//12
	private double km1;
	private double km2;//13

	public Bicicleta(int id, int fkUsuario, String nome, String marca, String modelo, int aro, int quadro,
			double quilometragem, Date revisao, Date troca_de_Corrente, Date lubrificacao, String estado_dos_Pneus, double km2, double km1) {
		this.id = id;
		this.fkUsuario = fkUsuario;
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.aro = aro;
		this.quadro = quadro;
		this.quilometragem = quilometragem;
		this.revisao = revisao;
		this.troca_de_Corrente = troca_de_Corrente;
		this.lubrificacao = lubrificacao;
		this.estado_dos_Pneus = estado_dos_Pneus;
		this.km2 = km2;
		this.km1 = km1;
	}

	public Bicicleta() {
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	public int getQuadro() {
		return quadro;
	}

	public void setQuadro(int quadro) {
		this.quadro = quadro;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}

	public Date getRevisao() {
		return revisao;
	}

	public void setRevisao(Date revisao) {
		this.revisao = revisao;
	}

	public Date getTroca_de_Corrente() {
		return troca_de_Corrente;
	}

	public void setTroca_de_Corrente(Date troca_de_Corrente) {
		this.troca_de_Corrente = troca_de_Corrente;
	}

	public Date getLubrificacao() {
		return lubrificacao;
	}

	public void setLubrificacao(Date lubrificacao) {
		this.lubrificacao = lubrificacao;
	}

	public String getEstado_dos_Pneus() {
		return estado_dos_Pneus;
	}

	public void setEstado_dos_Pneus(String estado_dos_Pneus) {
		this.estado_dos_Pneus = estado_dos_Pneus;
	}

	public double getKm1() {
		return km1;
	}

	public void setKm1(double km1) {
		this.km1 = km1;
	}

	public double getKm2() {
		return km2;
	}

	public void setKm2(double km2) {
		this.km2 = km2;
	}

	@Override
	public String toString() {
		return "id: " + id + "fkUsuario: " + fkUsuario + ", nome: " + nome + ", marca: " + marca + ", modelo: " + modelo + ", aro: " + aro
				+ ", quadro: " + quadro + ", Quilometragem: " + quilometragem + ", Revisão: " + revisao
				+ ", troca_de_Corrente: " + troca_de_Corrente + ", lubrificação: " + lubrificacao + ", Estado_dos_Pneus: "
				+ estado_dos_Pneus+ ", km2: " + km2+ ", km1: " + km1;
	}

}
