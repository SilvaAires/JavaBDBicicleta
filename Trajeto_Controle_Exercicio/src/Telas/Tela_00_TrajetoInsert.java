package Telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Entidades.Trajeto;
import XAMPP.Banco_Trajeto;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class Tela_00_TrajetoInsert extends JPanel {
	private JLabel lblNewLabel;
	private JLabel txtNome;
	private JLabel txtDistancia;
	private JLabel txtTempo;
	private JLabel txtTipo;
	private JLabel txtCalorias;
	private JLabel txtElevacao;
	private JTextField edDistancia;
	private JTextField edNome;
	private JTextField edTipo;
	private JTextField edCalorias;
	private JTextField edElevacao;
	private JButton btCadastrar;
	private JTextField edTempo;
	private JLabel icon;
	private JLabel arvore1;
	private JLabel arvore2;
	/**
	 * Create the panel.
	 */
	public Tela_00_TrajetoInsert() {
		initComponents();
	}
	private void initComponents() {
		setBackground(new Color(245, 139, 160));
		setLayout(new MigLayout("", "[grow][fill][240.00][grow]", "[grow][][][][][][][][][][][][grow]"));
		setBounds(100, 100, 975, 650);
		
		this.icon = new JLabel("");
		this.icon.setIcon(new ImageIcon("trajeto.png"));
		add(this.icon, "cell 2 1,alignx center");
		
		this.lblNewLabel = new JLabel("Cadastra Trajeto");
		this.lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		add(this.lblNewLabel, "cell 2 2,alignx center");
		
		this.txtNome = new JLabel("Nome:");
		this.txtNome.setOpaque(true);
		this.txtNome.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtNome.setBackground(new Color(192, 192, 192));
		this.txtNome.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNome, "cell 1 4,alignx right");
		
		this.edNome = new JTextField();
		this.edNome.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(this.edNome, "cell 2 4,growx");
		this.edNome.setColumns(10);
		
		this.txtDistancia = new JLabel("Distancia:");
		this.txtDistancia.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtDistancia.setBackground(new Color(192, 192, 192));
		this.txtDistancia.setOpaque(true);
		this.txtDistancia.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtDistancia, "cell 1 5,growx");
		
		this.edDistancia = new JTextField();
		this.edDistancia.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(this.edDistancia, "cell 2 5,growx");
		this.edDistancia.setColumns(10);
		
		this.arvore1 = new JLabel("");
		this.arvore1.setIcon(new ImageIcon("cerejeira.png"));
		add(this.arvore1, "cell 0 0 1 13,alignx center,aligny center");
		
		this.txtTempo = new JLabel("Tempo Previsto:");
		this.txtTempo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtTempo.setBackground(new Color(192, 192, 192));
		this.txtTempo.setOpaque(true);
		this.txtTempo.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtTempo, "cell 1 6,alignx right");
		
		edTempo = new JTextField();
		edTempo.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(edTempo, "cell 2 6,growx");
		edTempo.setColumns(10);
		
		this.arvore2 = new JLabel("");
		this.arvore2.setIcon(new ImageIcon("cerejeira.png"));
		add(this.arvore2, "cell 3 0 1 13,alignx center,aligny center");
		
		this.txtTipo = new JLabel("Tipo de Terreno:");
		this.txtTipo.setBackground(new Color(192, 192, 192));
		this.txtTipo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtTipo.setOpaque(true);
		this.txtTipo.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtTipo, "cell 1 7,alignx trailing");
		
		this.edTipo = new JTextField();
		this.edTipo.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(this.edTipo, "cell 2 7,growx");
		this.edTipo.setColumns(10);
		
		this.txtCalorias = new JLabel("Calorias Gastas:");
		this.txtCalorias.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtCalorias.setBackground(new Color(192, 192, 192));
		this.txtCalorias.setOpaque(true);
		this.txtCalorias.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtCalorias, "cell 1 8,alignx trailing");
		
		this.edCalorias = new JTextField();
		this.edCalorias.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(this.edCalorias, "cell 2 8,growx");
		this.edCalorias.setColumns(10);
		
		this.txtElevacao = new JLabel("Elevacao:");
		this.txtElevacao.setBackground(new Color(192, 192, 192));
		this.txtElevacao.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.txtElevacao.setOpaque(true);
		this.txtElevacao.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtElevacao, "cell 1 9,alignx trailing");
		
		this.edElevacao = new JTextField();
		this.edElevacao.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(this.edElevacao, "cell 2 9,growx");
		this.edElevacao.setColumns(10);
		
		this.btCadastrar = new JButton("Cadastrar");
		this.btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoCadastrar();
			}
		});
		this.btCadastrar.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.btCadastrar, "cell 2 11,alignx center");
	}
	
	public boolean verifica() {
		boolean v = false;
		if((edNome.getText().equals("")) &&(edDistancia.getText().equals("")) &&(edTempo.getText().equals("")) 
				&&(edTipo.getText().equals("")) &&(edCalorias.getText().equals("")) &&(edElevacao.getText().equals("")) ) {
			return v = true;
		}
		return v;
	}
	
	public void acaoCadastrar() {
		if(!(verifica())) {
			Banco_Trajeto bt = new Banco_Trajeto();
			Trajeto t = new Trajeto();
			
			t.setNome(edNome.getText());
			t.setDistancia(Double.parseDouble(edDistancia.getText()));
			t.setTempo_Previsto(edTempo.getText());
			t.setTipo_Terreno(edTipo.getText());
			t.setCalorias_Gastas(Double.parseDouble(edCalorias.getText()));
			t.setElevacao(edElevacao.getText());
			
			boolean bbb = bt.INSERT_TRAJETO(t);
			if(bbb == false) {
				reset();
				JOptionPane.showMessageDialog(null, "Foi cadastrado um Trajeto", "Tabela Trajeto", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "Opa, programador � burro se isso acontecer!!", ":-(", JOptionPane.ERROR_MESSAGE);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos!!", ":-(", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public void reset() {

		edNome.setText("");

		edDistancia.setText("");
		edTempo.setText("");
		edTipo.setText("");
		edCalorias.setText("");
		edElevacao.setText("");

	}

}
