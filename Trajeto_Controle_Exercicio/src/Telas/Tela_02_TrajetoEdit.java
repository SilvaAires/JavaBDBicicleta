package Telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;

import Entidades.Trajeto;
import XAMPP.Banco_Trajeto;
import java.awt.Color;

public class Tela_02_TrajetoEdit extends JPanel {
	private JLabel txtSelect;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox;
	private JLabel txtId;
	private JLabel txtId1;
	private JLabel txtNome;
	private JLabel txtDistancia;
	private JLabel txtTempo_Previsto;
	private JLabel txttipo_Terreno;
	private JLabel txtcalorias_Gastas;
	private JLabel txtelevacao;
	private JButton btUpdate;
	private JButton btDelete;
	private JTextField edNome;
	private JTextField edDistancia;
	private JTextField edTempo;
	private JTextField edTipo;
	private JTextField edCalorias;
	private JTextField edElecacao;
	private JLabel icon;
	private JLabel icon2;
	private JLabel icon3;
	private JLabel flo;
	private JLabel flo1;
	/**
	 * Create the panel.
	 */
	public Tela_02_TrajetoEdit() {
		setBackground(new Color(180, 226, 226));
		initComponents();
		acaoCombo();
	}
	private void initComponents() {
		setLayout(new MigLayout("", "[grow][right][center][grow]", "[grow][][][][][][][][][][][][][][grow]"));
		setBounds(100, 100, 975, 650);
		
		this.icon = new JLabel("");
		this.icon.setIcon(new ImageIcon("edit.png"));
		add(this.icon, "cell 2 1,alignx center");
		
		this.txtSelect = new JLabel("Editar Trajeto");
		this.txtSelect.setFont(new Font("Dialog", Font.BOLD, 18));
		add(this.txtSelect, "cell 2 2");
		
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
		add(this.txtId1, "cell 2 4,growx");
		
		this.txtNome = new JLabel("Nome:");
		this.txtNome.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNome, "cell 1 5,alignx trailing");
		
		this.edNome = new JTextField();
		this.edNome.setFont(new Font("Dialog", Font.BOLD, 14));
		add(this.edNome, "cell 2 5,growx");
		this.edNome.setColumns(10);
		
		this.txtDistancia = new JLabel("Distancia:");
		this.txtDistancia.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtDistancia, "cell 1 6,alignx trailing");
		
		this.edDistancia = new JTextField();
		this.edDistancia.setFont(new Font("Dialog", Font.BOLD, 14));
		this.edDistancia.setColumns(10);
		add(this.edDistancia, "cell 2 6,growx");
		
		this.flo = new JLabel("");
		this.flo.setIcon(new ImageIcon("floresta.png"));
		add(this.flo, "cell 0 0 1 15,alignx center,aligny center");
		
		this.txtTempo_Previsto = new JLabel("Tempo Previsto:");
		this.txtTempo_Previsto.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtTempo_Previsto, "cell 1 7,alignx trailing");
		
		this.edTempo = new JTextField();
		this.edTempo.setFont(new Font("Dialog", Font.BOLD, 14));
		this.edTempo.setColumns(10);
		add(this.edTempo, "cell 2 7,growx");
		
		this.flo1 = new JLabel("");
		this.flo1.setIcon(new ImageIcon("floresta.png"));
		add(this.flo1, "cell 3 0 1 15,alignx center,aligny center");
		
		this.txttipo_Terreno = new JLabel("Tipo de Terreno:");
		this.txttipo_Terreno.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txttipo_Terreno, "cell 1 8,alignx trailing");
		
		this.edTipo = new JTextField();
		this.edTipo.setFont(new Font("Dialog", Font.BOLD, 14));
		this.edTipo.setColumns(10);
		add(this.edTipo, "cell 2 8,growx");
		
		this.txtcalorias_Gastas = new JLabel("Calorias Gastas:");
		this.txtcalorias_Gastas.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtcalorias_Gastas, "cell 1 9,alignx trailing");
		
		this.edCalorias = new JTextField();
		this.edCalorias.setFont(new Font("Dialog", Font.BOLD, 14));
		this.edCalorias.setColumns(10);
		add(this.edCalorias, "cell 2 9,growx");
		
		this.txtelevacao = new JLabel("Elevacao:");
		this.txtelevacao.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtelevacao, "cell 1 10,alignx trailing");
		
		this.edElecacao = new JTextField();
		this.edElecacao.setFont(new Font("Dialog", Font.BOLD, 14));
		this.edElecacao.setColumns(10);
		add(this.edElecacao, "cell 2 10,growx");
		
		this.btUpdate = new JButton("Alterar Dados");
		this.btUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update();
			}
		});
		this.btUpdate.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.btUpdate, "flowx,cell 2 12");
		
		this.btDelete = new JButton("Deletar Dados");
		this.btDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete();
			}
		});
		this.btDelete.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.btDelete, "cell 2 12");
		
		this.icon3 = new JLabel("");
		this.icon3.setIcon(new ImageIcon("alterar.png"));
		add(this.icon3, "flowx,cell 2 13,alignx center");
		
		this.icon2 = new JLabel("");
		this.icon2.setIcon(new ImageIcon("delete.png"));
		add(this.icon2, "cell 2 13,alignx center");
	}
	
	public void Update() {
		Banco_Trajeto bt = new Banco_Trajeto();
		Trajeto t = new Trajeto();
		if((!(txtId1.getText().equals(null))) && (!(txtId1.getText().equals("0")))) {
			t.setId(Integer.parseInt(txtId1.getText().toString()));
			t.setNome(edNome.getText().toString());
			t.setDistancia(Double.parseDouble(edDistancia.getText().toString()));
			t.setTempo_Previsto(edTempo.getText().toString());
			t.setTipo_Terreno(edTipo.getText().toString());
			t.setCalorias_Gastas(Double.parseDouble(edCalorias.getText().toString()));
			t.setElevacao(edElecacao.getText().toString());
			boolean b = bt.UPDATE_TRAJETOS(t); 
			System.out.println("Delete"+b);
			if(b == false) {
				JOptionPane.showMessageDialog(null, "Atualização Feita em Trajetos", "Tabela Trajetos", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "Opa, programador é um burro se isso acontecer!!", ":-(", JOptionPane.ERROR_MESSAGE);
			}
			comboBox.removeAllItems();
			acaoCombo();
            acaoSelect();
		}
	}
	
	public void Delete() {
		JOptionPane.showMessageDialog(null, "O programador não gosta de Banco de Dados então essa parte ficar interditada até a contratação de um que goste de BD", "Aviso", JOptionPane.ERROR_MESSAGE);
		Banco_Trajeto bt = new Banco_Trajeto();
		boolean b = bt.DELETE_TRAJETO(Integer.parseInt(txtId1.getText()));
		if(b == false) {
			JOptionPane.showMessageDialog(null, "Foi Deletado um Trajetos", "Tabela Trajetos", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Opa, programador é um burro se isso acontecer!!", ":-(", JOptionPane.ERROR_MESSAGE);
		}
		comboBox.removeAllItems();
		acaoCombo();
        acaoSelect();
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

	    Object selectedItem = comboBox.getSelectedItem();

	    if (selectedItem != null) {
	        tt = btj.SELECT_TRAJETO_PROCURA(selectedItem.toString());
	        txtId1.setText(String.valueOf(tt.getId()));
	        edNome.setText(tt.getNome());
	        edDistancia.setText(String.valueOf(tt.getDistancia()));
	        edTempo.setText(tt.getTempo_Previsto());
	        edTipo.setText(tt.getTipo_Terreno());
	        edCalorias.setText(String.valueOf(tt.getCalorias_Gastas()));
	        edElecacao.setText(tt.getElevacao());
	    } 
	}
}
