package Telas;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Entidades.ControleUsuario;
import Entidades.Usuario;
import XAMPP.Banco_Usuario;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;

public class Tela_Login extends JPanel {
	private JLabel txtLogin;
	private JLabel txtNome;
	private JLabel txtSenha;
	private JTextField edNome;
	private JButton btEntrar;
	Banco_Usuario bu = new Banco_Usuario();
	Usuario us = new Usuario();
	private JPasswordField edSenha;
	private JLabel icon;

	/**
	 * Create the panel.
	 */
	public Tela_Login() {

		initComponents();
	}
	private void initComponents() {
		setBackground(new Color(151, 151, 255));
		setLayout(new MigLayout("", "[grow][85.00,fill][205.00][56.00,grow]", "[grow][][][][][][grow]"));
		setBounds(100, 100, 975, 650);
		
		this.icon = new JLabel("");
		this.icon.setIcon(new ImageIcon("login.png"));
		add(this.icon, "cell 2 1,alignx center");
		
		this.txtLogin = new JLabel("              Login");
		this.txtLogin.setOpaque(true);
		this.txtLogin.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.txtLogin.setFont(new Font("Dialog", Font.BOLD, 18));
		add(this.txtLogin, "cell 2 2,growx");
		
		this.txtNome = new JLabel("        Login:");
		this.txtNome.setOpaque(true);
		this.txtNome.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.txtNome.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNome, "cell 1 3");
		
		this.edNome = new JTextField();
		add(this.edNome, "cell 2 3,grow");
		this.edNome.setColumns(10);
		
		this.txtSenha = new JLabel("       Senha:");
		this.txtSenha.setOpaque(true);
		this.txtSenha.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.txtSenha.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtSenha, "cell 1 4,alignx trailing");
		
		this.btEntrar = new JButton("Entrar");
		this.btEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoTelaMenu();
			}
		});
		
		this.edSenha = new JPasswordField();
		add(this.edSenha, "cell 2 4,grow");
		this.btEntrar.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.btEntrar, "cell 2 5,alignx center");
	}
	
	public boolean verifica() {
		boolean v = false;
		if((edNome.getText().equals("")) &&(edSenha.getText().equals(""))) {
			return v = true;
		}
		return v;
	}
	
	public void acaoTelaMenu() {
		if(!(verifica())) {
			String login = edNome.getText().trim();
			String senha = edSenha.getText().trim();
			us = bu.SELECT_LOGIN(login, senha);
			if((us.getLogin()!=null) && (us.getSenha()!=null)) {
				if(((us.getLogin().equals("admin"))) &&((us.getSenha().equals("admin")))) {
					ControleUsuario.setUsuarioLogado(us);
					acaoMenu();
				}else {
					if((login.equals(us.getLogin())) && (senha.equals(us.getSenha()))) {
						ControleUsuario.setUsuarioLogado(us);
						acaoMenu1();
					}
				}
			}else{
				JOptionPane.showMessageDialog(null, "Senha Errada!!", "!_!", JOptionPane.ERROR_MESSAGE);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos!!", ":-(", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void acaoMenu() {
		Tela_Inicio.frame.setContentPane(new Tela_Menu());
		Tela_Inicio.frame.mostrarMenus();
		Tela_Inicio.frame.setVisible(true);
	}
	
	public void acaoMenu1() {
		Tela_Inicio.frame.setContentPane(new Tela_Menu());
		Tela_Inicio.frame.mostrarMenus1();
		Tela_Inicio.frame.setVisible(true);
	}

}
