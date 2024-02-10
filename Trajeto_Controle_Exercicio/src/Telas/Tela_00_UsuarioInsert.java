package Telas;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

import Entidades.ControleUsuario;
import Entidades.Usuario;
import XAMPP.Banco_Usuario;

import javax.print.attribute.AttributeSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class Tela_00_UsuarioInsert extends JPanel {
	private JLabel lblNewLabel;
	private JLabel txtNome;
	private JLabel txtLogin;
	private JLabel txtSenha;
	private JLabel txtIdade;
	private JLabel txtEstatura;
	private JLabel txtPeso;
	private JLabel txtNíveldociclista;
	private JLabel txtQuilometrospedalados;
	private JTextField edLogin;
	private JTextField edNome;
	private JTextField edIdade;
	private JTextField edEstatura;
	private JTextField edPeso;
	private JTextField edKmPedalados;
	private JButton btCadastrar;
	private JTextField edSenha;
	private JComboBox cbNivel;
	private JLabel icon;
	private JLabel arvore;
	private JLabel arvore2;

	/**
	 * Create the panel.
	 */
	public Tela_00_UsuarioInsert() {
		setBackground(new Color(245, 139, 160));
		initComponents();
		cb();
	}

	private void initComponents() {
		setLayout(new MigLayout("", "[grow][fill][231.00,center][grow]", "[grow][][][][][][][][][][][][][][grow]"));
		setBounds(100, 100, 975, 650);

		this.icon = new JLabel("");
		this.icon.setIcon(new ImageIcon("user.png"));
		add(this.icon, "cell 2 1,alignx center");

		this.lblNewLabel = new JLabel("Cadastra Usuario");
		this.lblNewLabel.setBackground(new Color(192, 192, 192));
		this.lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		add(this.lblNewLabel, "cell 2 2,alignx center");

		this.txtNome = new JLabel("Nome:");
		this.txtNome.setOpaque(true);
		this.txtNome.setBackground(new Color(192, 192, 192));
		this.txtNome.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtNome.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNome, "cell 1 4,alignx right");

		this.edNome = new JTextField();
		this.edNome.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(this.edNome, "cell 2 4,growx");
		this.edNome.setColumns(10);

		this.txtLogin = new JLabel("Login:");
		this.txtLogin.setOpaque(true);
		this.txtLogin.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtLogin.setBackground(new Color(192, 192, 192));
		this.txtLogin.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtLogin, "cell 1 5,alignx right");

		this.edLogin = new JTextField();
		this.edLogin.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(this.edLogin, "cell 2 5,growx");
		this.edLogin.setColumns(10);

		this.txtSenha = new JLabel("Senha:");
		this.txtSenha.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtSenha.setBackground(new Color(192, 192, 192));
		this.txtSenha.setOpaque(true);
		this.txtSenha.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtSenha, "cell 1 6,alignx right");

		edSenha = new JTextField();
		edSenha.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(edSenha, "cell 2 6,growx");
		edSenha.setColumns(10);

		this.arvore = new JLabel("");
		this.arvore.setIcon(new ImageIcon("cerejeira.png"));
		add(this.arvore, "cell 0 0 1 15,alignx center,aligny center");

		this.txtIdade = new JLabel("Idade:");
		this.txtIdade.setOpaque(true);
		this.txtIdade.setBackground(new Color(192, 192, 192));
		this.txtIdade.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtIdade.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtIdade, "cell 1 7,alignx trailing");

		this.edIdade = new JTextField();
		this.edIdade.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(this.edIdade, "cell 2 7,growx");
		this.edIdade.setColumns(10);

		this.arvore2 = new JLabel("");
		this.arvore2.setIcon(new ImageIcon("cerejeira.png"));
		add(this.arvore2, "cell 3 0 1 15,alignx center,aligny center");

		this.txtEstatura = new JLabel("Estatura:");
		this.txtEstatura.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtEstatura.setBackground(new Color(192, 192, 192));
		this.txtEstatura.setOpaque(true);
		this.txtEstatura.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtEstatura, "cell 1 8,alignx trailing");

		this.edEstatura = new JTextField();
		this.edEstatura.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(this.edEstatura, "cell 2 8,growx");
		this.edEstatura.setColumns(10);

		this.txtPeso = new JLabel("Peso:");
		this.txtPeso.setOpaque(true);
		this.txtPeso.setBackground(new Color(192, 192, 192));
		this.txtPeso.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtPeso.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtPeso, "cell 1 9,alignx trailing");

		this.edPeso = new JTextField();
		this.edPeso.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(this.edPeso, "cell 2 9,growx");
		this.edPeso.setColumns(10);

		this.txtNíveldociclista = new JLabel("Nivel do ciclista:");
		this.txtNíveldociclista.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtNíveldociclista.setBackground(new Color(192, 192, 192));
		this.txtNíveldociclista.setOpaque(true);
		this.txtNíveldociclista.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNíveldociclista, "cell 1 10,alignx trailing");

		this.cbNivel = new JComboBox();
		this.cbNivel.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.cbNivel, "cell 2 10,growx");

		this.txtQuilometrospedalados = new JLabel("KM pedalados:");
		this.txtQuilometrospedalados.setOpaque(true);
		this.txtQuilometrospedalados.setBackground(new Color(192, 192, 192));
		this.txtQuilometrospedalados.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtQuilometrospedalados.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtQuilometrospedalados, "cell 1 11,alignx trailing");

		this.edKmPedalados = new JTextField();
		this.edKmPedalados.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(this.edKmPedalados, "cell 2 11,growx");
		this.edKmPedalados.setColumns(10);

		this.btCadastrar = new JButton("Cadastrar");
		this.btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoCadastrar();
			}
		});
		this.btCadastrar.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.btCadastrar, "cell 2 13,alignx center");
	}

	public void cb() {
		cbNivel.addItem("Escolha:");
		cbNivel.addItem("Iniciante");
		cbNivel.addItem("Intermediario");
		cbNivel.addItem("Experiente");
		cbNivel.addItem("Avançado");
	}
	
	public boolean verifica() {
		boolean v = false;
		if((edNome.getText().equals("")) &&(edLogin.getText().equals("")) &&(edSenha.getText().equals("")) 
				&&(edIdade.getText().equals("")) &&(edEstatura.getText().equals("")) &&(edPeso.getText().equals("") 
						&&(cbNivel.getSelectedItem().toString().equals("Escolha:") &&(edKmPedalados.getText().equals(""))))) {
			return v = true;
		}
		return v;
	}

	public void acaoCadastrar() {
		if(!(verifica())) {
			Banco_Usuario bu = new Banco_Usuario();
			Usuario us = new Usuario();

			us.setNome(edNome.getText());
			us.setLogin(edLogin.getText());
			us.setSenha(edSenha.getText());
			us.setIdade(Integer.parseInt(edIdade.getText()));
			us.setEstatura(Double.parseDouble(edEstatura.getText()));
			us.setPeso(Double.parseDouble(edPeso.getText()));
			us.setNivel_do_Ciclista(cbNivel.getSelectedItem().toString());
			us.setQuilometros_Pedalados(Double.parseDouble(edKmPedalados.getText()));
			Usuario a = ControleUsuario.getUsuarioLogado();
			boolean f = bu.INSERT_USUARIO(us);
			if (f == false) {
				reset();
				JOptionPane.showMessageDialog(null, "Foi cadastrado um Usuario", "Tabela Bicicleta",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Opa, programador é um burro se isso acontecer!!", ":-(",
						JOptionPane.ERROR_MESSAGE);
			}
			if (a == null) {
				Tela_Inicio.frame.setContentPane(new Tela_Fundo());
				Tela_Inicio.frame.setVisible(true);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos!!", ":-(", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void reset() {
		edNome.setText("");
		edLogin.setText("");
		edSenha.setText("");
		edIdade.setText("");
		edEstatura.setText("");
		edPeso.setText("");
		edKmPedalados.setText("");
		cbNivel.removeAllItems();
		cb();

	}

}
