package Telas;

import javax.swing.JPanel;
import javax.swing.JTextField;

import Entidades.Bicicleta;
import Entidades.ControleUsuario;
import Entidades.Trajeto;
import Entidades.Treino;
import Entidades.Usuario;
import XAMPP.Banco_Bicicleta;
import XAMPP.Banco_Trajeto;
import XAMPP.Banco_Treino;
import XAMPP.Banco_Usuario;
import net.miginfocom.swing.MigLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class Tela_00_TreinoInsert extends JPanel {
	private JLabel txtTreino;
	private JLabel txtDifi;
	private JLabel txtNoTrajeto;
	private JLabel txtNoBike;
	private JLabel txtKM;
	private JLabel txtCalorias;
	private JLabel txtTempo;
	private JTextField edKM;
	private JTextField edCalorias;
	private JTextField edTempo;
	private JButton btCadastrar;
	private JComboBox cbBike;
	private JComboBox cbTrajeto;
	private JComboBox cbificuldade;
	private JTextField edNome;
	private JLabel txtNome;
	private JLabel icon;
	private JLabel arvore1;
	private JLabel arvore2;

	/**
	 * Create the panel.
	 */
	public Tela_00_TreinoInsert() {
		setBackground(new Color(245, 139, 160));
		initComponents();
		acaoCombo();
		acao2();
		cb();
	}

	private void initComponents() {
		setLayout(new MigLayout("", "[grow][fill][304.00][grow]", "[grow][][][][][][][][][][][][][grow]"));
		setBounds(100, 100, 975, 650);

		this.icon = new JLabel("");
		this.icon
				.setIcon(new ImageIcon("C:\\Users\\Thiago\\eclipse-workspace\\Trajeto_Controle_Exercicio\\treino.png"));
		add(this.icon, "cell 2 1,alignx center");

		this.txtTreino = new JLabel("Cadastra Treino");
		this.txtTreino.setFont(new Font("Dialog", Font.BOLD, 18));
		add(this.txtTreino, "cell 2 2,alignx center");

		this.txtNome = new JLabel("Nome do Treino");
		this.txtNome.setOpaque(true);
		this.txtNome.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtNome.setBackground(new Color(192, 192, 192));
		this.txtNome.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNome, "cell 1 4,alignx trailing");

		this.edNome = new JTextField();
		this.edNome.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.edNome, "cell 2 4,growx");
		this.edNome.setColumns(10);

		this.txtDifi = new JLabel("Dificuldade:");
		this.txtDifi.setBackground(new Color(192, 192, 192));
		this.txtDifi.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtDifi.setOpaque(true);
		this.txtDifi.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtDifi, "cell 1 5,alignx trailing");

		this.cbificuldade = new JComboBox();
		this.cbificuldade.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.cbificuldade, "cell 2 5,growx");

		this.txtNoTrajeto = new JLabel("Nome do Trajeto:");
		this.txtNoTrajeto.setOpaque(true);
		this.txtNoTrajeto.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtNoTrajeto.setBackground(new Color(192, 192, 192));
		this.txtNoTrajeto.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNoTrajeto, "cell 1 6,alignx trailing");

		this.cbTrajeto = new JComboBox();
		this.cbTrajeto.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.cbTrajeto, "cell 2 6,growx");

		this.arvore1 = new JLabel("");
		this.arvore1.setIcon(new ImageIcon("cerejeira.png"));
		add(this.arvore1, "cell 0 0 1 14,alignx center,aligny center");

		this.txtNoBike = new JLabel("Nome da Bicicleta:");
		this.txtNoBike.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtNoBike.setBackground(new Color(192, 192, 192));
		this.txtNoBike.setOpaque(true);
		this.txtNoBike.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNoBike, "cell 1 7,alignx trailing");

		this.cbBike = new JComboBox();
		this.cbBike.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.cbBike, "cell 2 7,growx");

		this.arvore2 = new JLabel("");
		this.arvore2.setIcon(new ImageIcon("cerejeira.png"));
		add(this.arvore2, "cell 3 0 1 14,alignx center,aligny center");

		this.txtKM = new JLabel("Quilometragem:");
		this.txtKM.setOpaque(true);
		this.txtKM.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtKM.setBackground(new Color(192, 192, 192));
		this.txtKM.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtKM, "cell 1 8,alignx trailing");

		this.edKM = new JTextField();
		this.edKM.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.edKM, "cell 2 8,growx");
		this.edKM.setColumns(10);

		this.txtCalorias = new JLabel("Calorias:");
		this.txtCalorias.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtCalorias.setBackground(new Color(192, 192, 192));
		this.txtCalorias.setOpaque(true);
		this.txtCalorias.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtCalorias, "cell 1 9,alignx trailing");

		this.edCalorias = new JTextField();
		this.edCalorias.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.edCalorias, "cell 2 9,growx");
		this.edCalorias.setColumns(10);

		this.txtTempo = new JLabel("Tempo:");
		this.txtTempo.setOpaque(true);
		this.txtTempo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtTempo.setBackground(new Color(192, 192, 192));
		this.txtTempo.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtTempo, "cell 1 10,alignx trailing");

		this.edTempo = new JTextField();
		this.edTempo.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.edTempo, "cell 2 10,growx");
		this.edTempo.setColumns(10);

		this.btCadastrar = new JButton("Cadastrar");
		this.btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoCadastrar();
			}
		});
		this.btCadastrar.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.btCadastrar, "cell 2 12,alignx center");
	}
	
	public boolean verifica() {
		boolean v = false;
		if((cbificuldade.getSelectedItem().toString().equals("Escolha:")) &&(cbTrajeto.getSelectedItem().toString().equals("Escolha:")) &&(cbBike.getSelectedItem().toString().equals("Escolha:")) 
				&&(edKM.getText().equals("")) &&(edCalorias.getText().equals("")) &&(edTempo.getText().equals("") &&(edNome.getText().equals("")))) {
			return v = true;
		}
		return v;
	}

	public void acaoCadastrar() {
		if(!(verifica())) {
			Usuario a = ControleUsuario.getUsuarioLogado();
			Banco_Treino bt = new Banco_Treino();
			Treino t = new Treino();
			Trajeto tr = new Trajeto();
			tr = fkTrajeto();
			t.setFkUsuario(a.getId());
			t.setFkTrajeto(tr.getId());
			t.setDificuldade(cbificuldade.getSelectedItem().toString());
			t.setNomeTrajeto(cbTrajeto.getSelectedItem().toString());
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
		}else {
			JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos!!", ":-(", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void reset() {
		edNome.setText("");
		edTempo.setText("");
		edCalorias.setText("");
		edKM.setText("");
		cbificuldade.removeAllItems();
		cbBike.removeAllItems();
		cbTrajeto.removeAllItems();
		acaoCombo();
		cb();
		acao2();

	}

	public void cb() {
		cbificuldade.addItem("Escolha:");
		cbificuldade.addItem("Tranquila");
		cbificuldade.addItem("Facil");
		cbificuldade.addItem("Normal");
		cbificuldade.addItem("Dificil");
		cbificuldade.addItem("Cansativa");
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
			JOptionPane.showMessageDialog(null, "Trocar a corrente ja� atingiu 2 mil quilometros", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			bb.UPDATE_BICICLETA_KM1(0, b.getId());// zera
		}
		if (km2 > 80) {
			JOptionPane.showMessageDialog(null, "Lubrificar e limpar a corrente ja� atingiu 80 km rodados", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			bb.UPDATE_BICICLETA_KM2(0, b.getId());// zera
		}

		Banco_Usuario bu = new Banco_Usuario();// atualiza km de usuarios
		Usuario a = ControleUsuario.getUsuarioLogado();
		a = bu.SELECT_USUARIO_PROCURA1(a.getNome());
		km3 += a.getQuilometros_Pedalados();
		bu.UPDATE_USUARIO_KM(km3, a.getId());
	}

	public Trajeto fkTrajeto() {
		Banco_Trajeto bt = new Banco_Trajeto();
		Trajeto t = new Trajeto();
		t = bt.SELECT_TRAJETO_PROCURA(cbTrajeto.getSelectedItem().toString());
		return t;
	}

	public void acaoCombo() {
		Usuario a = ControleUsuario.getUsuarioLogado();
		Banco_Bicicleta bancoBicicleta = new Banco_Bicicleta();
		LinkedList<String> nomesBicicletas = bancoBicicleta.SELECT_BICICLETA_NOME_FK(a.getId());
		cbBike.addItem("Escolha: ");
		for (String nomeBicicleta : nomesBicicletas) {
			cbBike.addItem(nomeBicicleta);
		}
	}

	public void acao2() {
		Banco_Trajeto bancoBicicleta = new Banco_Trajeto();
		cbTrajeto.addItem("Escolha: ");
		LinkedList<String> nomesBicicletas = bancoBicicleta.SELECT_TRAJETO_NOME();
		for (String nomeBicicleta : nomesBicicletas) {
			cbTrajeto.addItem(nomeBicicleta);
		}
	}
}
