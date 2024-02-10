package Telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Entidades.Trajeto;
import Entidades.Treino;
import XAMPP.Banco_Trajeto;
import XAMPP.Banco_Treino;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class Tela_01_TrajetoSelect extends JPanel {
	private JLabel txtSelect;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox;
	private JLabel txtId;
	private JLabel txtId1;
	private JLabel txtNome1;
	private JLabel txtDistancia1;
	private JLabel txttempo_Previsto1;
	private JLabel txttipo_Terreno1;
	private JLabel txtcalorias_Gastas1;
	private JLabel txtelevacao1;
	private JLabel txtNome;
	private JLabel txtDistancia;
	private JLabel txttempo_Previsto;
	private JLabel txttipo_Terreno;
	private JLabel txtcalorias_Gastas;
	private JLabel txtelevacao;
	private JLabel icon;
	private JLabel monte;
	private JLabel monte1;
	/**
	 * Create the panel.
	 */
	public Tela_01_TrajetoSelect() {
		setBackground(new Color(116, 111, 145));

		initComponents();
		acaoCombo();
	}
	private void initComponents() {
		setLayout(new MigLayout("", "[grow][fill][227.00][grow]", "[grow][][][][][][][][][][][grow]"));
		setBounds(100, 100, 975, 650);
		
		this.icon = new JLabel("");
		this.icon.setIcon(new ImageIcon("info.png"));
		add(this.icon, "cell 2 1,alignx center");
		
		this.txtSelect = new JLabel("Informacoes de Trajeto");
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
		this.txtId.setBackground(Color.WHITE);
		this.txtId.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtId.setOpaque(true);
		this.txtId.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtId, "cell 1 4");
		
		this.txtId1 = new JLabel("I______________________________");
		this.txtId1.setOpaque(true);
		this.txtId1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.txtId1.setBackground(new Color(255, 255, 255));
		this.txtId1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtId1, "cell 2 4,grow");
		
		this.monte = new JLabel("");
		this.monte.setIcon(new ImageIcon("monte.png"));
		add(this.monte, "cell 0 0 1 12,alignx center,aligny center");
		
		this.txtNome = new JLabel("                   Nome:");
		this.txtNome.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtNome.setBackground(Color.WHITE);
		this.txtNome.setOpaque(true);
		this.txtNome.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNome, "cell 1 5");
		
		this.txtNome1 = new JLabel("I______________________________");
		this.txtNome1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.txtNome1.setBackground(new Color(255, 255, 255));
		this.txtNome1.setOpaque(true);
		this.txtNome1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNome1, "cell 2 5,grow");
		
		this.monte1 = new JLabel("");
		this.monte1.setIcon(new ImageIcon("monte.png"));
		add(this.monte1, "cell 3 0 1 12,alignx center,aligny center");
		
		this.txtDistancia = new JLabel("            Distancia:");
		this.txtDistancia.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtDistancia.setBackground(Color.WHITE);
		this.txtDistancia.setOpaque(true);
		this.txtDistancia.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtDistancia, "cell 1 6");
		
		this.txtDistancia1 = new JLabel("I______________________________");
		this.txtDistancia1.setOpaque(true);
		this.txtDistancia1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.txtDistancia1.setBackground(new Color(255, 255, 255));
		this.txtDistancia1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtDistancia1, "cell 2 6,grow");
		
		this.txttempo_Previsto = new JLabel("Tempo Previsto:");
		this.txttempo_Previsto.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txttempo_Previsto.setBackground(Color.WHITE);
		this.txttempo_Previsto.setOpaque(true);
		this.txttempo_Previsto.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txttempo_Previsto, "cell 1 7");
		
		this.txttempo_Previsto1 = new JLabel("I______________________________");
		this.txttempo_Previsto1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.txttempo_Previsto1.setBackground(new Color(255, 255, 255));
		this.txttempo_Previsto1.setOpaque(true);
		this.txttempo_Previsto1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txttempo_Previsto1, "cell 2 7,grow");
		
		this.txttipo_Terreno = new JLabel("Tipo de Terreno:");
		this.txttipo_Terreno.setBackground(Color.WHITE);
		this.txttipo_Terreno.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txttipo_Terreno.setOpaque(true);
		this.txttipo_Terreno.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txttipo_Terreno, "cell 1 8");
		
		this.txttipo_Terreno1 = new JLabel("I______________________________");
		this.txttipo_Terreno1.setOpaque(true);
		this.txttipo_Terreno1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.txttipo_Terreno1.setBackground(new Color(255, 255, 255));
		this.txttipo_Terreno1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txttipo_Terreno1, "cell 2 8,grow");
		
		this.txtcalorias_Gastas = new JLabel("Calorias Gastas:");
		this.txtcalorias_Gastas.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtcalorias_Gastas.setBackground(Color.WHITE);
		this.txtcalorias_Gastas.setOpaque(true);
		this.txtcalorias_Gastas.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtcalorias_Gastas, "cell 1 9");
		
		this.txtcalorias_Gastas1 = new JLabel("I______________________________");
		this.txtcalorias_Gastas1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.txtcalorias_Gastas1.setBackground(new Color(255, 255, 255));
		this.txtcalorias_Gastas1.setOpaque(true);
		this.txtcalorias_Gastas1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtcalorias_Gastas1, "cell 2 9,grow");
		
		this.txtelevacao = new JLabel("             Elevacao:");
		this.txtelevacao.setBackground(Color.WHITE);
		this.txtelevacao.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtelevacao.setOpaque(true);
		this.txtelevacao.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtelevacao, "cell 1 10");
		
		this.txtelevacao1 = new JLabel("I______________________________");
		this.txtelevacao1.setOpaque(true);
		this.txtelevacao1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.txtelevacao1.setBackground(new Color(255, 255, 255));
		this.txtelevacao1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtelevacao1, "cell 2 10,grow");
	}
	
	public void acaoCombo() {
		Banco_Trajeto bt = new Banco_Trajeto();
	    LinkedList<String> nomesBicicletas = bt.SELECT_TRAJETO_NOME();
	    comboBox.addItem("Escolha: ");
	    for (String nomeBicicleta : nomesBicicletas) {
	    	comboBox.addItem(nomeBicicleta);
	    }
	}
	
	public void acaoSelect(){
		Banco_Trajeto btj = new Banco_Trajeto();
		Trajeto tt = new Trajeto();
		tt = btj.SELECT_TRAJETO_PROCURA(comboBox.getSelectedItem().toString());
		txtId1.setText(String.valueOf(tt.getId()));
		txtNome1.setText(tt.getNome());
		txtDistancia1.setText(String.valueOf(tt.getDistancia()));
		txttempo_Previsto1.setText(tt.getTempo_Previsto());
		txttipo_Terreno1.setText(tt.getTipo_Terreno());
		txtcalorias_Gastas1.setText(String.valueOf(tt.getCalorias_Gastas()));
		txtelevacao1.setText(tt.getElevacao());
	}

}
