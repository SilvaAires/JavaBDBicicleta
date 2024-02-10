package Telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Entidades.Bicicleta;
import Entidades.ControleUsuario;
import Entidades.Usuario;
import XAMPP.Banco_Bicicleta;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class Tela_00_BicicletaInsert extends JPanel {
	private JLabel txtBike;
	private JLabel txtBKBike;
	private JLabel txtMarca;
	private JLabel txtModelo;
	private JLabel txtAro;
	private JLabel txtQuadro;
	private JLabel txtKM;
	private JTextField edMarca;
	private JTextField edModelo;
	private JTextField edAro;
	private JTextField edQuadro;
	private JTextField edKmPedalados;
	private JButton btCadastrar;
	private JTextField edBKBike;
	private JLabel txtEstado;
	private JTextField edEstado;
	private JLabel icon;
	private JLabel arvore1;
	private JLabel arvore2;
	/**
	 * Create the panel.
	 */
	public Tela_00_BicicletaInsert() {
		
		initComponents();
	}
	private void initComponents() {
		setBackground(new Color(245, 139, 160));
		setLayout(new MigLayout("", "[grow][fill][239.00][grow]", "[grow][][][][][][][][][][][][][grow]"));
		setBounds(100, 100, 975, 650);
		
		this.icon = new JLabel("");
		this.icon.setIcon(new ImageIcon("C:\\Users\\Thiago\\eclipse-workspace\\Trajeto_Controle_Exercicio\\bike.png"));
		add(this.icon, "cell 2 1,alignx center");
		
		this.txtBike = new JLabel("Cadastra Bicicleta");
		this.txtBike.setFont(new Font("Dialog", Font.BOLD, 18));
		add(this.txtBike, "cell 2 2,alignx center");
		
		this.txtBKBike = new JLabel("Nome da bicicleta:");
		this.txtBKBike.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtBKBike.setBackground(new Color(192, 192, 192));
		this.txtBKBike.setOpaque(true);
		this.txtBKBike.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtBKBike, "cell 1 4,alignx right");
		
		edBKBike = new JTextField();
		edBKBike.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(edBKBike, "cell 2 4,growx");
		edBKBike.setColumns(10);
		
		this.txtMarca = new JLabel("Marca:");
		this.txtMarca.setBackground(new Color(192, 192, 192));
		this.txtMarca.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtMarca.setOpaque(true);
		this.txtMarca.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtMarca, "cell 1 5,alignx trailing");
		
		this.edMarca = new JTextField();
		this.edMarca.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(this.edMarca, "cell 2 5,growx");
		this.edMarca.setColumns(10);
		
		this.arvore1 = new JLabel("");
		this.arvore1.setIcon(new ImageIcon("cerejeira.png"));
		add(this.arvore1, "cell 0 0 1 14,alignx center,aligny center");
		
		this.txtModelo = new JLabel("Modelo:");
		this.txtModelo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtModelo.setBackground(new Color(192, 192, 192));
		this.txtModelo.setOpaque(true);
		this.txtModelo.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtModelo, "cell 1 6,alignx trailing");
		
		this.edModelo = new JTextField();
		this.edModelo.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(this.edModelo, "cell 2 6,growx");
		this.edModelo.setColumns(10);
		
		this.txtAro = new JLabel("Aro:");
		this.txtAro.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtAro.setBackground(new Color(192, 192, 192));
		this.txtAro.setOpaque(true);
		this.txtAro.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtAro, "cell 1 7,alignx trailing");
		
		this.edAro = new JTextField();
		this.edAro.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(this.edAro, "cell 2 7,growx");
		this.edAro.setColumns(10);
		
		this.arvore2 = new JLabel("");
		this.arvore2.setIcon(new ImageIcon("cerejeira.png"));
		add(this.arvore2, "cell 3 0 1 14,alignx center,aligny center");
		
		this.txtQuadro = new JLabel("Quadro:");
		this.txtQuadro.setBackground(new Color(192, 192, 192));
		this.txtQuadro.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtQuadro.setOpaque(true);
		this.txtQuadro.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtQuadro, "cell 1 8,alignx trailing");
		
		this.edQuadro = new JTextField();
		this.edQuadro.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(this.edQuadro, "cell 2 8,growx");
		this.edQuadro.setColumns(10);
		
		this.txtKM = new JLabel("KM:");
		this.txtKM.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtKM.setBackground(new Color(192, 192, 192));
		this.txtKM.setOpaque(true);
		this.txtKM.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtKM, "cell 1 9,alignx trailing");
		
		this.edKmPedalados = new JTextField();
		this.edKmPedalados.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(this.edKmPedalados, "cell 2 9,growx");
		this.edKmPedalados.setColumns(10);
		
		this.txtEstado = new JLabel("Estado dos Pneus");
		this.txtEstado.setBackground(new Color(192, 192, 192));
		this.txtEstado.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtEstado.setOpaque(true);
		this.txtEstado.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtEstado, "cell 1 10,alignx trailing");
		
		this.edEstado = new JTextField();
		this.edEstado.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.edEstado, "cell 2 10,growx");
		this.edEstado.setColumns(10);
		
		this.btCadastrar = new JButton("Cadastrar");
		this.btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrarBike();
			}
		});
		this.btCadastrar.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.btCadastrar, "cell 2 12,alignx center");
	}
	
	public boolean verifica() {
		boolean v = false;
		if((edBKBike.getText().equals("")) &&(edMarca.getText().equals("")) &&(edModelo.getText().equals("")) 
				&&(edAro.getText().equals("")) &&(edQuadro.getText().equals("")) &&(edKmPedalados.getText().equals("")) ) {
			return v = true;
		}
		return v;
	}
	
	public void cadastrarBike() {
		System.out.println(verifica());
		if(!(verifica())) {
			Usuario a = ControleUsuario.getUsuarioLogado();
			
			Banco_Bicicleta bb = new Banco_Bicicleta();
			Bicicleta b = new Bicicleta();
			
			b.setFkUsuario(a.getId());
			
			b.setNome(edBKBike.getText().toString());
			b.setMarca(edMarca.getText().toString());
			b.setModelo(edModelo.getText().toString());
			b.setAro(Integer.parseInt(edAro.getText()));
			b.setQuadro(Integer.parseInt(edQuadro.getText()));
			b.setQuilometragem(Double.parseDouble(edKmPedalados.getText()));
			
			b.setRevisao(DataAtual());
			b.setTroca_de_Corrente(DataAtual());
			b.setLubrificacao(DataAtual());
			
			b.setEstado_dos_Pneus(edEstado.getText());
			b.setKm2(Double.parseDouble(edKmPedalados.getText()));
			b.setKm1(Double.parseDouble(edKmPedalados.getText()));
			
			boolean bbb = bb.INSERT_BICICLETA(b);
			
			if(bbb == false) {
				reset();
				JOptionPane.showMessageDialog(null, "Foi cadastrado a Bicicleta", "Tabela Bicicleta", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "Opa, programador é um burro se isso acontecer!!", ":-(", JOptionPane.ERROR_MESSAGE);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos!!", ":-(", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	
	public void reset() {

		edBKBike.setText("");

		edMarca.setText("");
		edModelo.setText("");
		edAro.setText("");
		edQuadro.setText("");
		edKmPedalados.setText("");
		edEstado.setText("");
		
	}
	
	
	public Date DataAtual() {
        Calendar calendar = Calendar.getInstance();
        return new Date(calendar.getTime().getTime());
    }
}
