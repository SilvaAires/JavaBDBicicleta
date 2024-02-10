package Telas;

import javax.swing.JPanel;

import XAMPP.Banco_Bicicleta;
import XAMPP.Banco_Trajeto;
import XAMPP.Banco_Treino;
import XAMPP.Banco_Usuario;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import Entidades.Bicicleta;
import Entidades.ControleUsuario;
import Entidades.Trajeto;
import Entidades.Treino;
import Entidades.Usuario;

import javax.swing.JComboBox;
import java.awt.Color;

public class Tela_Menu extends JPanel {
	private JLabel txtTreinoDia;
	private JButton btCad;
	private JLabel txtNome;
	private JLabel txtDifi;
	private JLabel txtTreinoDia_3;
	private JLabel txtTreinoDia_4;
	private JLabel txtTreinoDia_5;
	private JLabel txtTreinoDia_6;
	private JLabel txtTreinoDia_7;
	private JTextField edNome;
	private JTextField edKM;
	private JTextField edCalorias;
	private JTextField edTempo;
	private JComboBox cbificuldade;
	private JComboBox cbBike;
	private JLabel cbTrajeto;
	private JLabel p;
	private JLabel p1;

	/**
	 * Create the panel.
	 */
	public Tela_Menu() {
		setBackground(new Color(204, 255, 255));
		initComponents();
		cb();
		ComboBike();
		acaoCombo();
	}

	private void initComponents() {
		setLayout(new MigLayout("", "[grow][181.00][227.00,fill][grow]", "[grow][][][][][][][][][][][][][grow]"));
		setBounds(100, 100, 975, 650);

		this.p = new JLabel("");
		this.p.setIcon(new ImageIcon("p.png"));
		add(this.p, "cell 0 0 1 14,alignx center,aligny bottom");

		this.txtTreinoDia = new JLabel("Treino do Dia");
		this.txtTreinoDia.setFont(new Font("Dialog", Font.BOLD, 20));
		add(this.txtTreinoDia, "cell 1 1 2 1,alignx center");

		this.txtNome = new JLabel("Nome do Treino");
		this.txtNome.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNome, "cell 1 3,alignx trailing");

		this.edNome = new JTextField();
		this.edNome.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.edNome, "cell 2 3,growx");
		this.edNome.setColumns(10);

		this.txtDifi = new JLabel("Dificuldade:");
		this.txtDifi.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtDifi, "cell 1 4,alignx trailing");

		this.cbificuldade = new JComboBox();
		this.cbificuldade.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.cbificuldade, "cell 2 4,growx");

		this.txtTreinoDia_3 = new JLabel("Trajeto Aleatorio:");
		this.txtTreinoDia_3.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtTreinoDia_3, "cell 1 5,alignx trailing");

		this.cbTrajeto = new JLabel("Treino do Dia");
		this.cbTrajeto.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.cbTrajeto, "cell 2 5");

		this.txtTreinoDia_4 = new JLabel("Nome da Bicicleta:");
		this.txtTreinoDia_4.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtTreinoDia_4, "cell 1 6,alignx trailing");

		this.cbBike = new JComboBox();
		this.cbBike.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.cbBike, "cell 2 6,growx");

		this.p1 = new JLabel("");
		this.p1.setIcon(new ImageIcon("p.png"));
		add(this.p1, "cell 3 0 1 14,alignx center,aligny bottom");

		this.txtTreinoDia_5 = new JLabel("Quilometragem:");
		this.txtTreinoDia_5.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtTreinoDia_5, "cell 1 7,alignx trailing");

		this.edKM = new JTextField();
		this.edKM.setFont(new Font("Dialog", Font.BOLD, 16));
		this.edKM.setColumns(10);
		add(this.edKM, "cell 2 7,growx");

		this.txtTreinoDia_6 = new JLabel("Calorias:");
		this.txtTreinoDia_6.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtTreinoDia_6, "cell 1 8,alignx trailing");

		this.edCalorias = new JTextField();
		this.edCalorias.setFont(new Font("Dialog", Font.BOLD, 16));
		this.edCalorias.setColumns(10);
		add(this.edCalorias, "cell 2 8,growx");

		this.txtTreinoDia_7 = new JLabel("Tempo:");
		this.txtTreinoDia_7.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtTreinoDia_7, "cell 1 9,alignx trailing");

		this.edTempo = new JTextField();
		this.edTempo.setFont(new Font("Dialog", Font.BOLD, 16));
		this.edTempo.setColumns(10);
		add(this.edTempo, "cell 2 9,growx");

		this.btCad = new JButton("Cadastrar Treino");
		this.btCad.setFont(new Font("Dialog", Font.BOLD, 16));
		this.btCad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cad();
			}
		});
		add(this.btCad, "cell 2 11");
	}

	public Trajeto fkTrajeto() {
		Banco_Trajeto bt = new Banco_Trajeto();
		Trajeto t = new Trajeto();
		t = bt.SELECT_TRAJETO_PROCURA(cbTrajeto.getText());
		return t;
	}

	public void cad() {
		Usuario a = ControleUsuario.getUsuarioLogado();
		Banco_Treino bt = new Banco_Treino();
		Treino t = new Treino();
		Trajeto tr = new Trajeto();
		tr = fkTrajeto();
		t.setFkUsuario(a.getId());
		t.setFkTrajeto(tr.getId());
		t.setDificuldade(cbificuldade.getSelectedItem().toString());
		t.setNomeTrajeto(cbTrajeto.getText());
		t.setNomeBicicleta(cbBike.getSelectedItem().toString());
		t.setQuilometragem(Double.parseDouble(edKM.getText()));
		t.setCalorias(Integer.parseInt(edCalorias.getText()));
		t.setTempo(edTempo.getText());
		t.setNome(edNome.getText());
		updateBike();
		boolean bbb = bt.INSERT_TREINO(t);
		
		if (bbb == false) {
			reset();
			JOptionPane.showMessageDialog(null, "Foi cadastrado um Treino", "Tabela Treino",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Opa, programador e um burro se isso acontecer!!", ":-(",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public void reset() {
		cbTrajeto.setText("");
		edKM.setText("");
		edCalorias.setText("");
		edTempo.setText("");
		edNome.setText("");
		cbificuldade.removeAllItems();
		cbBike.removeAllItems();
		acaoCombo();
		cb();
		ComboBike();

	}

	public void updateBike() {
		double km = Double.parseDouble(edKM.getText());
		double km1 = Double.parseDouble(edKM.getText());
		double km2 = Double.parseDouble(edKM.getText());
		double km3 = Double.parseDouble(edKM.getText());
		Banco_Bicicleta bb = new Banco_Bicicleta();
		Bicicleta b = new Bicicleta();
		Bicicleta b2 = new Bicicleta();
		b = bb.SELECT_BICICLETA_PROCURA(cbBike.getSelectedItem().toString());
		b2 = bb.SELECT_BICICLETA_QUILOMETRAGEM_UMA(b.getId());
		km += b2.getQuilometragem();
		km2 += b2.getKm2();
		km1 += b2.getKm1();
		bb.UPDATE_BICICLETA_KM(km, b.getId());
		bb.UPDATE_BICICLETA_KM1(km1, b.getId());// atualiza km de bike
		bb.UPDATE_BICICLETA_KM2(km2, b.getId());// atualiza km de bike variavel controladora
		if (km1 > 2000) {
			JOptionPane.showMessageDialog(null, "Trocar a corrente ja atingiu 2 mil quilometros", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			bb.UPDATE_BICICLETA_KM1(0, b.getId());// zera
		}
		if (km2 > 80) {
			JOptionPane.showMessageDialog(null, "Lubrificar e limpar a corrente ja atingiu 80 km rodados", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			bb.UPDATE_BICICLETA_KM2(0, b.getId());// zera
		}

		Banco_Usuario bu = new Banco_Usuario();// atualiza km de usuarios
		Usuario a = ControleUsuario.getUsuarioLogado();
		a = bu.SELECT_USUARIO_PROCURA1(a.getNome());
		km3 += a.getQuilometros_Pedalados();
		bu.UPDATE_USUARIO_KM(km3, a.getId());
	}

	public void acaoCombo() {
		Banco_Trajeto bt = new Banco_Trajeto();
		LinkedList<String> nt = bt.SELECT_TRAJETO_NOME();
		if (!nt.isEmpty()) {
			Random random = new Random();
			int iA = random.nextInt(nt.size());
			String trajetoA = nt.get(iA);
			this.cbTrajeto.setText(trajetoA);
		}
	}

	public void cb() {
		cbificuldade.addItem("Escolha:");
		cbificuldade.addItem("Tranquila");
		cbificuldade.addItem("Facil");
		cbificuldade.addItem("Normal");
		cbificuldade.addItem("Dificil");
		cbificuldade.addItem("Cansativa");
	}

	public void ComboBike() {
		Usuario a = ControleUsuario.getUsuarioLogado();
		Banco_Bicicleta bancoBicicleta = new Banco_Bicicleta();
		LinkedList<String> nomesBicicletas = bancoBicicleta.SELECT_BICICLETA_NOME_FK(a.getId());
		cbBike.addItem("Escolha: ");
		for (String nomeBicicleta : nomesBicicletas) {
			cbBike.addItem(nomeBicicleta);
		}
	}
}
