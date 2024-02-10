package Telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Entidades.Bicicleta;
import Entidades.ControleUsuario;
import Entidades.Usuario;
import XAMPP.Banco_Bicicleta;
import XAMPP.Banco_Usuario;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;

public class Tela_01_UsuarioSelect extends JPanel {
	private JLabel txtSelect;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox;
	private JLabel txtId;
	private JLabel txtId1;
	private JLabel txtNome1;
	private JLabel txtLogin1;
	private JLabel txtSenha1;
	private JLabel txtIdade1;
	private JLabel txtEstatura1;
	private JLabel txtPeso1;
	private JLabel txtNivel1;
	private JLabel txtKM1;
	private JLabel txtNome;
	private JLabel txtLogin;
	private JLabel txtSenha;
	private JLabel txtIdade;
	private JLabel txtestatura;
	private JLabel txtPeso;
	private JLabel txtNivel;
	private JLabel txtKM;
	private JLabel icon;
	private JLabel monte1;
	private JLabel monte2;
	/**
	 * Create the panel.
	 */
	public Tela_01_UsuarioSelect() {
		setBackground(new Color(116, 111, 145));
		initComponents();
		acaoCombo();
	}
	private void initComponents() {
		setLayout(new MigLayout("", "[grow][fill][257.00][grow]", "[grow][][][][][][][][][][][][][grow]"));
		setBounds(100, 100, 975, 650);
		
		this.icon = new JLabel("");
		this.icon.setIcon(new ImageIcon("info.png"));
		add(this.icon, "cell 2 1,alignx center");
		
		this.txtSelect = new JLabel("Informacoes do Usuario");
		this.txtSelect.setFont(new Font("Dialog", Font.BOLD, 18));
		add(this.txtSelect, "cell 2 2,alignx center");
		
		this.lblNewLabel_1 = new JLabel("           Selecione:");
		this.lblNewLabel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.lblNewLabel_1.setBackground(Color.WHITE);
		this.lblNewLabel_1.setOpaque(true);
		this.lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.lblNewLabel_1, "cell 1 3,alignx right");
		
		this.comboBox = new JComboBox();
		this.comboBox.setFont(new Font("Dialog", Font.BOLD, 16));
		this.comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoSelect();
			}
		});
		add(this.comboBox, "cell 2 3,grow");
		
		this.txtId = new JLabel("                          ID:");
		this.txtId.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtId.setBackground(Color.WHITE);
		this.txtId.setOpaque(true);
		this.txtId.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtId, "cell 1 4");
		
		this.txtId1 = new JLabel("I______________________________");
		this.txtId1.setOpaque(true); 
		this.txtId1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtId1.setBackground(new Color(255, 255, 255));
		this.txtId1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtId1, "cell 2 4,grow");
		
		this.txtNome = new JLabel("                  Nome:");
		this.txtNome.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtNome.setBackground(Color.WHITE);
		this.txtNome.setOpaque(true);
		this.txtNome.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNome, "cell 1 5");
		
		this.txtNome1 = new JLabel("I______________________________");
		this.txtNome1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtNome1.setBackground(new Color(255, 255, 255));
		this.txtNome1.setOpaque(true);
		this.txtNome1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNome1, "cell 2 5,grow");
		
		this.monte1 = new JLabel("");
		this.monte1.setIcon(new ImageIcon("monte.png"));
		add(this.monte1, "cell 0 0 1 14,alignx center,aligny center");
		
		this.txtLogin = new JLabel("                  Login:");
		this.txtLogin.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtLogin.setBackground(Color.WHITE);
		this.txtLogin.setOpaque(true);
		this.txtLogin.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtLogin, "cell 1 6");
		
		this.txtLogin1 = new JLabel("I______________________________");
		this.txtLogin1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtLogin1.setBackground(new Color(255, 255, 255));
		this.txtLogin1.setOpaque(true);
		this.txtLogin1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtLogin1, "cell 2 6,grow");
		
		this.txtSenha = new JLabel("                 Senha:");
		this.txtSenha.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtSenha.setBackground(Color.WHITE);
		this.txtSenha.setOpaque(true);
		this.txtSenha.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtSenha, "cell 1 7");
		
		this.txtSenha1 = new JLabel("I______________________________");
		this.txtSenha1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtSenha1.setBackground(new Color(255, 255, 255));
		this.txtSenha1.setOpaque(true);
		this.txtSenha1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtSenha1, "cell 2 7,grow");
		
		this.monte2 = new JLabel("");
		this.monte2.setIcon(new ImageIcon("monte.png"));
		add(this.monte2, "cell 3 0 1 14,alignx center,aligny center");
		
		this.txtIdade = new JLabel("                   Idade:");
		this.txtIdade.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtIdade.setBackground(Color.WHITE);
		this.txtIdade.setOpaque(true);
		this.txtIdade.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtIdade, "cell 1 8");
		
		this.txtIdade1 = new JLabel("I______________________________");
		this.txtIdade1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtIdade1.setBackground(new Color(255, 255, 255));
		this.txtIdade1.setOpaque(true);
		this.txtIdade1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtIdade1, "cell 2 8,grow");
		
		this.txtestatura = new JLabel("              Estatura:");
		this.txtestatura.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtestatura.setBackground(Color.WHITE);
		this.txtestatura.setOpaque(true);
		this.txtestatura.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtestatura, "cell 1 9");
		
		this.txtEstatura1 = new JLabel("I______________________________");
		this.txtEstatura1.setBackground(new Color(255, 255, 255));
		this.txtEstatura1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtEstatura1.setOpaque(true);
		this.txtEstatura1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtEstatura1, "cell 2 9,grow");
		
		this.txtPeso = new JLabel("                    Peso:");
		this.txtPeso.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtPeso.setBackground(Color.WHITE);
		this.txtPeso.setOpaque(true);
		this.txtPeso.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtPeso, "cell 1 10");
		
		this.txtPeso1 = new JLabel("I______________________________");
		this.txtPeso1.setBackground(new Color(255, 255, 255));
		this.txtPeso1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtPeso1.setOpaque(true);
		this.txtPeso1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtPeso1, "cell 2 10,grow");
		
		this.txtNivel = new JLabel("Nivel do ciclista:");
		this.txtNivel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtNivel.setBackground(Color.WHITE);
		this.txtNivel.setOpaque(true);
		this.txtNivel.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNivel, "cell 1 11");
		
		this.txtNivel1 = new JLabel("I______________________________");
		this.txtNivel1.setBackground(new Color(255, 255, 255));
		this.txtNivel1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtNivel1.setOpaque(true);
		this.txtNivel1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNivel1, "cell 2 11,grow");
		
		this.txtKM = new JLabel("  KM Pedalados:");
		this.txtKM.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtKM.setBackground(Color.WHITE);
		this.txtKM.setOpaque(true);
		this.txtKM.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtKM, "cell 1 12");
		
		this.txtKM1 = new JLabel("I______________________________");
		this.txtKM1.setOpaque(true);
		this.txtKM1.setBackground(new Color(255, 255, 255));
		this.txtKM1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtKM1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtKM1, "cell 2 12,grow");
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
		us = bu.SELECT_USUARIO_PROCURA1(comboBox.getSelectedItem().toString());
		txtId1.setText(String.valueOf(us.getId()));
		txtNome1.setText(us.getNome());
		txtLogin1.setText(us.getLogin());
		txtSenha1.setText(us.getSenha());
		txtIdade1.setText(String.valueOf(us.getIdade()));
		txtEstatura1.setText(String.valueOf(us.getEstatura()));
		txtPeso1.setText(String.valueOf(us.getPeso()));
		txtNivel1.setText(us.getNivel_do_Ciclista());
		txtKM1.setText(String.valueOf(us.getQuilometros_Pedalados()));
	}

}
