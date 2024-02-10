package Telas;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import javax.security.auth.login.LoginContext;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Tela_Fundo extends JPanel {
	private JLabel txtBemVindo;
	private JLabel txtcadastro;
	private JButton btEntrarUsuario;
	private JButton btCriarUsuario;
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public Tela_Fundo() {

		initComponents();
	}
	private void initComponents() {
		setBackground(new Color(153, 153, 0));
		setLayout(new MigLayout("", "[grow][grow,center][grow]", "[grow][][fill][][fill][][][grow]"));
		setBounds(100, 100, 975, 650);
		
		this.txtBemVindo = new JLabel("Bem vindo ao BikeTur");
		this.txtBemVindo.setFont(new Font("Dialog", Font.BOLD, 32));
		add(this.txtBemVindo, "cell 1 1");
		
		this.btEntrarUsuario = new JButton("Logar");
		this.btEntrarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoLogar();
			}
		});
		
		this.lblNewLabel = new JLabel("");
		this.lblNewLabel.setIcon(new ImageIcon("C:\\Users\\2022003610\\Downloads\\inicio (1).gif"));
		add(this.lblNewLabel, "cell 1 2,alignx center,aligny center");
		this.btEntrarUsuario.setFont(new Font("Dialog", Font.BOLD, 18));
		add(this.btEntrarUsuario, "cell 1 3,alignx center");
		
		this.txtcadastro = new JLabel("Ainda nao tem login? Clique no botao abaixo");
		this.txtcadastro.setForeground(Color.BLUE);
		this.txtcadastro.setFont(new Font("Dialog", Font.PLAIN, 16));
		add(this.txtcadastro, "cell 1 5");
		
		this.btCriarUsuario = new JButton("Criar conta");
		this.btCriarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoCad();
			}
		});
		this.btCriarUsuario.setFont(new Font("Dialog", Font.BOLD, 18));
		add(this.btCriarUsuario, "cell 1 6");
	}
	
	public void acaoLogar() {
		Tela_Inicio.frame.setContentPane(new Tela_Login());
		Tela_Inicio.frame.setVisible(true);
	}
	
	public void acaoCad() {
		Tela_Inicio.frame.setContentPane(new Tela_00_UsuarioInsert());
		Tela_Inicio.frame.setVisible(true);
	}

}
