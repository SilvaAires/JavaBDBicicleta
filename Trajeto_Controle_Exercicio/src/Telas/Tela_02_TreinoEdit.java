package Telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

import Entidades.ControleUsuario;
import Entidades.Treino;
import Entidades.Usuario;
import XAMPP.Banco_Bicicleta;
import XAMPP.Banco_Trajeto;
import XAMPP.Banco_Treino;
import XAMPP.Banco_Usuario;
import java.awt.Color;

public class Tela_02_TreinoEdit extends JPanel {
	private JLabel txtSelect;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox;
	private JLabel txtId;
	private JLabel txtId1;
	private JLabel txtfkTrajeto1;
	private JLabel txtfkTrajeto;
	private JLabel txtdificuldade;
	private JLabel txtnomeTrajeto;
	private JLabel txtnomeBicicleta;
	private JLabel txtQuilometragem;
	private JLabel txtcalorias;
	private JLabel txtTempo;
	private JLabel txtNome;
	private JButton btUpdate;
	private JButton btDelete;
	private JComboBox cbDificuldade;
	private JTextField edCalorias;
	private JTextField edTempo;
	private JTextField edNome;
	private JComboBox cbNomeBike;
	private JComboBox edNomeTrajeto;
	private JLabel txtKM;
	private JLabel icon2;
	private JLabel icon3;
	private JLabel icon;
	private JLabel flo;
	private JLabel flo1;
	/**
	 * Create the panel.
	 */
	public Tela_02_TreinoEdit() {
		setBackground(new Color(180, 226, 226));
		initComponents();
		cb();
		acao2();
		acaobk();
		acaoCombo();
	}
	private void initComponents() {
		setLayout(new MigLayout("", "[grow][right][][grow]", "[grow][][][][][][][][][][][][][][][][grow]"));
		setBounds(100, 100, 975, 650);
		
		this.icon = new JLabel("");
		this.icon.setIcon(new ImageIcon("edit.png"));
		add(this.icon, "cell 2 1,alignx center");
		
		this.txtSelect = new JLabel("Editar Treino");
		this.txtSelect.setFont(new Font("Dialog", Font.BOLD, 18));
		add(this.txtSelect, "cell 2 2,alignx center");
		
		this.lblNewLabel_1 = new JLabel("Selecione:");
		this.lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.lblNewLabel_1, "cell 1 3,alignx right");
		
		this.comboBox = new JComboBox();
		this.comboBox.setFont(new Font("Dialog", Font.BOLD, 14));
		this.comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoSelect();
			}
		});
		add(this.comboBox, "cell 2 3,growx");
		
		this.txtId = new JLabel("ID:");
		this.txtId.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtId, "cell 1 4");
		
		this.txtId1 = new JLabel("I______________________________");
		this.txtId1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtId1, "cell 2 4");
		
		this.txtfkTrajeto = new JLabel("FkTrajeto:");
		this.txtfkTrajeto.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtfkTrajeto, "cell 1 5");
		
		this.txtfkTrajeto1 = new JLabel("I______________________________");
		this.txtfkTrajeto1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtfkTrajeto1, "cell 2 5");
		
		this.txtNome = new JLabel("Nome do Treino:");
		this.txtNome.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNome, "cell 1 6,alignx trailing");
		
		this.edNome = new JTextField();
		this.edNome.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.edNome, "cell 2 6,growx");
		this.edNome.setColumns(10);
		
		this.flo = new JLabel("");
		this.flo.setIcon(new ImageIcon("floresta.png"));
		add(this.flo, "cell 0 0 1 17,alignx center,aligny center");
		
		this.txtdificuldade = new JLabel("Dificuldade:");
		this.txtdificuldade.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtdificuldade, "cell 1 7,alignx trailing");
		
		this.cbDificuldade = new JComboBox();
		this.cbDificuldade.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.cbDificuldade, "cell 2 7,growx");
		
		this.flo1 = new JLabel("");
		this.flo1.setIcon(new ImageIcon("floresta.png"));
		add(this.flo1, "cell 3 0 1 17,alignx center,aligny center");
		
		this.txtnomeTrajeto = new JLabel("Nome do trajeto:");
		this.txtnomeTrajeto.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtnomeTrajeto, "cell 1 8,alignx trailing");
		
		this.edNomeTrajeto = new JComboBox();
		this.edNomeTrajeto.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.edNomeTrajeto, "cell 2 8,growx");
		
		this.txtnomeBicicleta = new JLabel("Nome da bicicleta:");
		this.txtnomeBicicleta.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtnomeBicicleta, "cell 1 9,alignx trailing");
		
		this.cbNomeBike = new JComboBox();
		this.cbNomeBike.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.cbNomeBike, "cell 2 9,growx");
		
		this.txtQuilometragem = new JLabel("Quilometragem:");
		this.txtQuilometragem.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtQuilometragem, "cell 1 10,alignx trailing");
		
		this.txtKM = new JLabel("I______________________________");
		this.txtKM.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtKM, "cell 2 10");
		
		this.txtcalorias = new JLabel("Calorias:");
		this.txtcalorias.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtcalorias, "cell 1 11,alignx trailing");
		
		this.edCalorias = new JTextField();
		this.edCalorias.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.edCalorias, "cell 2 11,growx");
		this.edCalorias.setColumns(10);
		
		this.txtTempo = new JLabel("Tempo:");
		this.txtTempo.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtTempo, "cell 1 12,alignx trailing");
		
		this.edTempo = new JTextField();
		this.edTempo.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.edTempo, "cell 2 12,growx");
		this.edTempo.setColumns(10);
		
		this.btUpdate = new JButton("Alterar Dados");
		this.btUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update();
			}
		});
		this.btUpdate.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.btUpdate, "flowx,cell 2 14");
		
		this.btDelete = new JButton("Deletar Dados");
		this.btDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete();
			}
		});
		this.btDelete.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.btDelete, "cell 2 14");
		
		this.icon2 = new JLabel("");
		this.icon2.setIcon(new ImageIcon("alterar.png"));
		add(this.icon2, "flowx,cell 2 15,alignx center");
		
		this.icon3 = new JLabel("");
		this.icon3.setIcon(new ImageIcon("delete.png"));
		add(this.icon3, "cell 2 15,alignx center");
	}

	public void Update() {
		Banco_Treino bt = new Banco_Treino();
		Treino t = new Treino();
		if(!(txtId1.getText().equals(null))) {
			t.setId(Integer.parseInt(txtId1.getText().toString()));
			t.setDificuldade(cbDificuldade.getSelectedItem().toString());
			t.setNomeBicicleta(cbNomeBike.getSelectedItem().toString());
			t.setNomeTrajeto(edNomeTrajeto.getSelectedItem().toString());
			t.setQuilometragem(Double.parseDouble(txtKM.getText().toString()));
			t.setCalorias(Double.parseDouble(edCalorias.getText().toString()));
			t.setTempo(edTempo.getText().toString());
			t.setNome(edNome.getText().toString());
			boolean b = bt.UPDATE_TREINO(t); 
			System.out.println("Delete"+b);
			if(b == false) {
				JOptionPane.showMessageDialog(null, "Atualização Feita em Usuários", "Tabela Treino", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "Opa, programador é um burro se isso acontecer!!", ":-(", JOptionPane.ERROR_MESSAGE);
			}
			comboBox.removeAllItems();
			edNomeTrajeto.removeAllItems();
			cbDificuldade.removeAllItems();
			cbNomeBike.removeAllItems();
			cb();
	        acaobk();
	        acao2();
			acaoCombo();
	        acaoSelect();
		}
	}
	
	public void Delete() {
		Banco_Treino bt = new Banco_Treino();
		boolean b = bt.DELETE_TREINO(Integer.parseInt(txtId1.getText().toString()));
		System.out.println("Delete"+b);
		if(b == false) {
			JOptionPane.showMessageDialog(null, "Foi Deletado em Treino", "Tabela treino", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Opa, programador é um burro se isso acontecer!!", ":-(", JOptionPane.ERROR_MESSAGE);
		}
		comboBox.removeAllItems();
		edNomeTrajeto.removeAllItems();
		cbDificuldade.removeAllItems();
		cbNomeBike.removeAllItems();
        cb();
        acaobk();
        acao2();
		acaoCombo();
        acaoSelect();
	}
	
	public void cb() {
		cbDificuldade.addItem("Escolha:");
		cbDificuldade.addItem("Tranquila");
		cbDificuldade.addItem("Facil");
		cbDificuldade.addItem("Normal");
		cbDificuldade.addItem("Dificil");
		cbDificuldade.addItem("Cansativa");
	}
	
	public void acaoCombo() {
		Usuario a = ControleUsuario.getUsuarioLogado();
		Banco_Treino bt = new Banco_Treino();
	    LinkedList<String> nomesBicicletas = bt.SELECT_TREINO_NOME_FK(a.getId());
	    comboBox.addItem("Escolha: ");
	    for (String nomeBicicleta : nomesBicicletas) {
	    	comboBox.addItem(nomeBicicleta);
	    }
	}
	
	public void acaoSelect(){
		Banco_Treino bt = new Banco_Treino();
		Treino tt = new Treino();
		
		Object selectedItem = comboBox.getSelectedItem();

	    if (selectedItem != null) {
	    	tt = bt.SELECT_TRAJETO_PROCURA(comboBox.getSelectedItem().toString());
			txtId1.setText(String.valueOf(tt.getId()));
			txtfkTrajeto1.setText(String.valueOf(tt.getFkTrajeto()));
			cbDificuldade.setSelectedItem(tt.getDificuldade());
			edNomeTrajeto.setSelectedItem(tt.getNomeTrajeto());
			cbNomeBike.setSelectedItem(tt.getNomeBicicleta());
			txtKM.setText(String.valueOf(tt.getQuilometragem()));
			edCalorias.setText(String.valueOf(tt.getCalorias()));
			edTempo.setText(tt.getTempo());
			edNome.setText(tt.getNome());
	    }
	}
	
	public void acaobk() {
		Usuario a = ControleUsuario.getUsuarioLogado();
		Banco_Bicicleta bancoBicicleta = new Banco_Bicicleta();
	    LinkedList<String> nomesBicicletas = bancoBicicleta.SELECT_BICICLETA_NOME_FK(a.getId());
	    cbNomeBike.addItem("Escolha: ");
	    for (String nomeBicicleta : nomesBicicletas) {
	        cbNomeBike.addItem(nomeBicicleta);
	    }
	}
	
	public void acao2() {
		Banco_Trajeto bancoBicicleta = new Banco_Trajeto();
		edNomeTrajeto.addItem("Escolha: ");
	    LinkedList<String> nomesBicicletas = bancoBicicleta.SELECT_TRAJETO_NOME();
	    for (String nomeBicicleta : nomesBicicletas) {
	    	edNomeTrajeto.addItem(nomeBicicleta);
	    }
	}
}
