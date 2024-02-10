package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entidades.ControleUsuario;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_Inicio extends JFrame {
	private JMenuBar menuBar;
	private JMenu MenuLogin;
	private JMenuItem menuEntrar;
	private JMenuItem menuCadastrar;
	private JMenuItem menuSair;
	private JMenu MenuUsuario;
	private JMenuItem usuarioInsert;
	private JMenuItem usuarioSelect;
	private JMenuItem usuarioEditar;
	private JMenuItem trajetoInsert;
	private JMenuItem trajetoSelect;
	private JMenuItem trajetoEditar;
	private JMenu MenuBicicleta;
	private JMenuItem bicicletaInsert;
	private JMenuItem bicicletaSelect;
	private JMenuItem bicicletaEditar;
	private JMenu MenuTreino;
	private JMenuItem treinoInsert;
	private JMenuItem treinoSelect;
	private JMenuItem treinoEditar;
	static Tela_Inicio frame;
	private JMenu MenuTrajeto;
	private JMenuItem menu2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Tela_Inicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela_Inicio() {
		initComponents();
		this.setContentPane(new Tela_Fundo());
		this.setVisible(true);
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 975, 650);
		
		this.menuBar = new JMenuBar();
		setJMenuBar(this.menuBar);
		
		this.MenuLogin = new JMenu("Login");
		this.menuBar.add(this.MenuLogin);
		
		this.menuEntrar = new JMenuItem("Entrar");
		this.menuEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoLogar();
			}
		});
		this.MenuLogin.add(this.menuEntrar);
		
		this.menuCadastrar = new JMenuItem("Cadastrar");
		this.menuCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoCad();
			}
		});
		
		this.menu2 = new JMenuItem("Menu");
		this.menu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaomenu();
			}
		});
		this.menu2.setVisible(false);
		this.MenuLogin.add(this.menu2);
		this.MenuLogin.add(this.menuCadastrar);
		
		this.menuSair = new JMenuItem("Sair");
		this.menuSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoSair();
			}
		});
		this.MenuLogin.add(this.menuSair);
		
		MenuTrajeto = new JMenu("Trajeto");
		this.MenuTrajeto.setVisible(false);
		this.menuBar.add(MenuTrajeto);
		
		this.trajetoInsert = new JMenuItem("Inserir trajeto");
		this.trajetoInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoInserirTrajeto();
			}
		});
		MenuTrajeto.add(this.trajetoInsert);
		
		this.trajetoSelect = new JMenuItem("Mostra trajeto");
		this.trajetoSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoSelectTrajeto();
			}
		});
		MenuTrajeto.add(this.trajetoSelect);
		
		this.trajetoEditar = new JMenuItem("Editar trajeto");
		this.trajetoEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editTrajeto();
			}
		});
		MenuTrajeto.add(this.trajetoEditar);
		
		this.MenuBicicleta = new JMenu("Bicicleta");
		this.MenuBicicleta.setVisible(false);
		this.menuBar.add(this.MenuBicicleta);
		
		this.bicicletaInsert = new JMenuItem("Inserir bicicleta");
		this.bicicletaInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoInserirBicicleta();
			}
		});
		this.MenuBicicleta.add(this.bicicletaInsert);
		
		this.bicicletaSelect = new JMenuItem("Mostrar bicicleta");
		this.bicicletaSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoSelectBicicleta();
			}
		});
		this.MenuBicicleta.add(this.bicicletaSelect);
		
		this.bicicletaEditar = new JMenuItem("Editar Bicicleta");
		this.bicicletaEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editBicicleta();
			}
		});
		this.MenuBicicleta.add(this.bicicletaEditar);
		
		this.MenuTreino = new JMenu("Treino");
		this.MenuTreino.setVisible(false);
		this.menuBar.add(this.MenuTreino);
		
		this.treinoInsert = new JMenuItem("Inserir treino");
		this.treinoInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoInserirTreino();
			}
		});
		this.MenuTreino.add(this.treinoInsert);
		
		this.treinoSelect = new JMenuItem("Mostra treino");
		this.treinoSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoSelectTreino();
			}
		});
		this.MenuTreino.add(this.treinoSelect);
		
		this.treinoEditar = new JMenuItem("Editar treino");
		this.treinoEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editTreino();
			}
		});
		this.MenuTreino.add(this.treinoEditar);
		
		this.MenuUsuario = new JMenu("Usuario");
		this.MenuUsuario.setVisible(false);
		this.menuBar.add(this.MenuUsuario);
		
		this.usuarioInsert = new JMenuItem("Inserir usuario");
		this.usuarioInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoCad();
			}
		});
		this.MenuUsuario.add(this.usuarioInsert);
		
		this.usuarioSelect = new JMenuItem("Mostrar usuarios");
		this.usuarioSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoSelectUsuario();
			}
		});
		this.MenuUsuario.add(this.usuarioSelect);
		
		this.usuarioEditar = new JMenuItem("Editar usuarios");
		this.usuarioEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editUs();
			}
		});
		this.MenuUsuario.add(this.usuarioEditar);
		
	}
	
	public void mostrarMenus() {
        MenuTrajeto.setVisible(true);
        MenuBicicleta.setVisible(true);
        MenuTreino.setVisible(true);
        MenuUsuario.setVisible(true);
        menu2.setVisible(true);
        menuEntrar.setVisible(false);
        menuCadastrar.setVisible(false);
    }
	
	public void mostrarMenus1() {
        MenuTrajeto.setVisible(true);
        MenuBicicleta.setVisible(true);
        MenuTreino.setVisible(true);
        menu2.setVisible(true);
        menuEntrar.setVisible(false);
        menuCadastrar.setVisible(false);
    }
	
	public void esconderMenus() {
        MenuTrajeto.setVisible(false);
        MenuBicicleta.setVisible(false);
        MenuTreino.setVisible(false);
        MenuUsuario.setVisible(false);
        menu2.setVisible(false);
        menuEntrar.setVisible(true);
        menuCadastrar.setVisible(true);
    }
	
	public void editBicicleta() {
		Tela_Inicio.frame.setContentPane(new Tela_02_BicicletaEdit());
		Tela_Inicio.frame.setVisible(true);
	}
	
	public void editTrajeto() {
		Tela_Inicio.frame.setContentPane(new Tela_02_TrajetoEdit());
		Tela_Inicio.frame.setVisible(true);
	}
	
	public void editTreino() {
		Tela_Inicio.frame.setContentPane(new Tela_02_TreinoEdit());
		Tela_Inicio.frame.setVisible(true);
	}
	
	public void editUs() {
		Tela_Inicio.frame.setContentPane(new Tela_02_UsuarioEdit());
		Tela_Inicio.frame.setVisible(true);
	}
	
	public void acaoSelectUsuario() {
		Tela_Inicio.frame.setContentPane(new Tela_01_UsuarioSelect());
		Tela_Inicio.frame.setVisible(true);
	}
	
	public void acaoSelectTrajeto() {
		Tela_Inicio.frame.setContentPane(new Tela_01_TrajetoSelect());
		Tela_Inicio.frame.setVisible(true);
	}

	public void acaoSelectTreino() {
		Tela_Inicio.frame.setContentPane(new Tela_01_TreinoSelect());
		Tela_Inicio.frame.setVisible(true);
	}

	public void acaoLogar() {
		Tela_Inicio.frame.setContentPane(new Tela_Login());
		Tela_Inicio.frame.setVisible(true);
	}
	
	public void acaoSair() {
		ControleUsuario.setUsuarioLogado(null);
		esconderMenus();
		Tela_Inicio.frame.setContentPane(new Tela_Fundo());
		Tela_Inicio.frame.setVisible(true);
	}
	
	public void acaoCad() {
		Tela_Inicio.frame.setContentPane(new Tela_00_UsuarioInsert());
		Tela_Inicio.frame.setVisible(true);
	}
	
	public void acaoSelectBicicleta() {
		Tela_Inicio.frame.setContentPane(new Tela_01_BicicletaSelect());
		Tela_Inicio.frame.setVisible(true);
	}
	
	public void acaoInserirTrajeto() {
		Tela_Inicio.frame.setContentPane(new Tela_00_TrajetoInsert());
		Tela_Inicio.frame.setVisible(true);
	}
	
	public void acaoInserirTreino() {
		Tela_Inicio.frame.setContentPane(new Tela_00_TreinoInsert());
		Tela_Inicio.frame.setVisible(true);
	}
	
	public void acaoInserirBicicleta() {
		Tela_Inicio.frame.setContentPane(new Tela_00_BicicletaInsert());
		Tela_Inicio.frame.setVisible(true);
	}
	
	public void acaomenu() {
		Tela_Inicio.frame.setContentPane(new Tela_Menu());
		Tela_Inicio.frame.setVisible(true);
	}
}
