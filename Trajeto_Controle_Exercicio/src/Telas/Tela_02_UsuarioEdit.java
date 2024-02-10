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

import Entidades.Trajeto;
import Entidades.Usuario;
import XAMPP.Banco_Trajeto;
import XAMPP.Banco_Usuario;
import java.awt.Color;

public class Tela_02_UsuarioEdit extends JPanel {
	private JLabel txtSelect;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox;
	private JLabel txtId;
	private JLabel txtId1;
	private JLabel txtNome;
	private JLabel txtLogin;
	private JLabel txtSenha;
	private JLabel txtIdade;
	private JLabel txtestatura;
	private JLabel txtPeso;
	private JLabel txtNivel;
	private JLabel txtKM;
	private JButton btUpdate;
	private JButton btDelete;
	private JTextField edLogin;
	private JTextField edNome;
	private JTextField edSenha;
	private JTextField edIdade;
	private JTextField edEstatura;
	private JTextField edPeso;
	private JTextField edKM;
	private JComboBox cbNNivel;
	private JLabel icon2;
	private JLabel icon3;
	private JLabel icon;
	private JLabel flo1;
	private JLabel flo;
	/**
	 * Create the panel.
	 */
	public Tela_02_UsuarioEdit() {
		setBackground(new Color(180, 226, 226));
		initComponents();
		cb();
		acaoCombo();
	}
	private void initComponents() {
		setLayout(new MigLayout("", "[grow][right][][grow]", "[grow][][][][][][][][][][][][][][][][grow]"));
		setBounds(100, 100, 975, 650);
		
		this.icon = new JLabel("");
		this.icon.setIcon(new ImageIcon("edit.png"));
		add(this.icon, "cell 2 1,alignx center");
		
		this.txtSelect = new JLabel("Editar Usuario");
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
		
		this.txtNome = new JLabel("Nome:");
		this.txtNome.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNome, "cell 1 5,alignx trailing");
		
		this.edNome = new JTextField();
		this.edNome.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.edNome, "cell 2 5,growx");
		this.edNome.setColumns(10);
		
		this.flo1 = new JLabel("");
		this.flo1.setIcon(new ImageIcon("floresta.png"));
		add(this.flo1, "cell 3 0 1 17,alignx center,aligny center");
		
		this.txtLogin = new JLabel("Login:");
		this.txtLogin.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtLogin, "cell 1 6,alignx trailing");
		
		this.edLogin = new JTextField();
		this.edLogin.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.edLogin, "cell 2 6,growx");
		this.edLogin.setColumns(10);
		
		this.txtSenha = new JLabel("Senha:");
		this.txtSenha.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtSenha, "cell 1 7,alignx trailing");
		
		this.edSenha = new JTextField();
		this.edSenha.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.edSenha, "cell 2 7,growx");
		this.edSenha.setColumns(10);
		
		this.flo = new JLabel("");
		this.flo.setIcon(new ImageIcon("floresta.png"));
		add(this.flo, "cell 0 0 1 17,alignx center,aligny center");
		
		this.txtIdade = new JLabel("Idade:");
		this.txtIdade.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtIdade, "cell 1 8,alignx trailing");
		
		this.edIdade = new JTextField();
		this.edIdade.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.edIdade, "cell 2 8,growx");
		this.edIdade.setColumns(10);
		
		this.txtestatura = new JLabel("Estatura:");
		this.txtestatura.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtestatura, "cell 1 9,alignx trailing");
		
		this.edEstatura = new JTextField();
		this.edEstatura.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.edEstatura, "cell 2 9,growx");
		this.edEstatura.setColumns(10);
		
		this.txtPeso = new JLabel("Peso:");
		this.txtPeso.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtPeso, "cell 1 10,alignx trailing");
		
		this.edPeso = new JTextField();
		this.edPeso.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.edPeso, "cell 2 10,growx");
		this.edPeso.setColumns(10);
		
		this.txtNivel = new JLabel("Nivel do ciclista:");
		this.txtNivel.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNivel, "cell 1 11,alignx trailing");
		
		this.cbNNivel = new JComboBox();
		this.cbNNivel.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.cbNNivel, "cell 2 11,growx");
		
		this.txtKM = new JLabel("KM Pedalados:");
		this.txtKM.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtKM, "cell 1 12,alignx trailing");
		
		this.edKM = new JTextField();
		this.edKM.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.edKM, "cell 2 12,growx");
		this.edKM.setColumns(10);
		
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
		Banco_Usuario bt = new Banco_Usuario();
		Usuario u = new Usuario();
		if(!(txtId1.getText().equals(null))) {
			u.setId(Integer.parseInt(txtId1.getText().toString()));
			u.setNome(edNome.getText().toString());
			u.setLogin(edLogin.getText().toString());
			u.setSenha(edSenha.getText().toString());
			u.setIdade(Integer.parseInt(edIdade.getText().toString()));
			u.setEstatura(Double.parseDouble(edEstatura.getText().toString()));
			u.setPeso(Double.parseDouble(edPeso.getText().toString()));
			u.setNivel_do_Ciclista(cbNNivel.getSelectedItem().toString());
			u.setQuilometros_Pedalados(Double.parseDouble(edKM.getText().toString()));
			boolean b = bt.UPDATE_USUARIO(u); 
			System.out.println("Delete"+b);
			if(b == false) {
				JOptionPane.showMessageDialog(null, "Atualização Feita em Usuários", "Tabela Usuários", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "Opa, programador é um burro se isso acontecer!!", ":-(", JOptionPane.ERROR_MESSAGE);
			}
			comboBox.removeAllItems();
			cbNNivel.removeAllItems();
			cb();
			acaoCombo();
            acaoSelect();
		}
	}
	
	public void Delete() {
		JOptionPane.showMessageDialog(null, "O programador não gosta de Banco de Dados então essa parte ficar interditada até a contratação de um que goste de BD", "Aviso", JOptionPane.ERROR_MESSAGE);
		Banco_Usuario bt = new Banco_Usuario();
		boolean b = bt.DELETE_USUARIO(Integer.parseInt(txtId1.getText().toString()));
		System.out.println("Delete"+b);
		if(b == false) {
			JOptionPane.showMessageDialog(null, "Foi Deletado um Usuários", "Tabela Usuários", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Opa, programador é um burro se isso acontecer!!", ":-(", JOptionPane.ERROR_MESSAGE);
		}
		comboBox.removeAllItems();
		cbNNivel.removeAllItems();
		cb();
		acaoCombo();
        acaoSelect();
	}
	
	public void acaoCombo() {
		Banco_Usuario bu = new Banco_Usuario();
	    LinkedList<String> nomesBicicletas = bu.SELECT_USUARIO_NOME();
	    comboBox.addItem("Escolha: ");
	    for (String nomeBicicleta : nomesBicicletas) {
	    	comboBox.addItem(nomeBicicleta);
	    }
	}
	
	public void acaoSelect() {
		Banco_Usuario bu = new Banco_Usuario();
		Usuario us = new Usuario();
		
		Object selectedItem = comboBox.getSelectedItem();
		
		if (selectedItem != null) {
			us = bu.SELECT_USUARIO_PROCURA1(comboBox.getSelectedItem().toString());
			txtId1.setText(String.valueOf(us.getId()));
			edNome.setText(us.getNome());
			edLogin.setText(us.getLogin());
			edSenha.setText(us.getSenha());
			edIdade.setText(String.valueOf(us.getIdade()));
			edEstatura.setText(String.valueOf(us.getEstatura()));
			edPeso.setText(String.valueOf(us.getPeso()));
			cbNNivel.setSelectedItem(us.getNivel_do_Ciclista());
			edKM.setText(String.valueOf(us.getQuilometros_Pedalados()));
		}
	}
	
	public void cb() {
		cbNNivel.addItem("Escolha:");
		cbNNivel.addItem("Iniciante");
		cbNNivel.addItem("Intermediario");
		cbNNivel.addItem("Experiente");
		cbNNivel.addItem("Avançado");
	}
}
