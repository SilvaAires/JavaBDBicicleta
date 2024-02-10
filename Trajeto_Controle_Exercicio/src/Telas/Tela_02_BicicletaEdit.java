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

import Entidades.Bicicleta;
import Entidades.ControleUsuario;
import Entidades.Usuario;
import XAMPP.Banco_Bicicleta;
import java.awt.Color;

public class Tela_02_BicicletaEdit extends JPanel {
	private JLabel txtSelect;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox;
	private JLabel txtId;
	private JLabel txtId1;
	private JLabel txtfkUsuario1;
	private JLabel txtKM1;
	private JLabel txtRevisao1;
	private JLabel txtTroca1;
	private JLabel txtLubri1;
	private JLabel txtfkUsuario;
	private JLabel txtNome;
	private JLabel txtMarca;
	private JLabel txtModelo;
	private JLabel txtAro;
	private JLabel txtQuadro;
	private JLabel txtKM;
	private JLabel txtRevisao;
	private JLabel txtTroca;
	private JLabel txtLubri;
	private JLabel txtEstado;
	private JButton btUpdate;
	private JButton btDelete;
	private JTextField edNome;
	private JTextField edMarca;
	private JTextField edModelo;
	private JTextField edAro;
	private JTextField edQuadro;
	private JTextField edEstado;
	private JLabel txtKM2;
	private JLabel txtKM22;
	private JLabel lblKm;
	private JLabel txtKM2_1;
	private JLabel icon;
	private JLabel icon2;
	private JLabel icon3;
	private JLabel flo;
	private JLabel flo1;
	/**
	 * Create the panel.
	 */
	public Tela_02_BicicletaEdit() {
		setBackground(new Color(180, 226, 226));
		initComponents();
		acaoCombo();
	}
	private void initComponents() {
		setLayout(new MigLayout("", "[grow][185.00,right][239.00][grow]", "[grow][][][][][][][][][][][][][][][][][][][][][grow]"));
		setBounds(100, 100, 975, 650);
		
		this.icon = new JLabel("");
		this.icon.setIcon(new ImageIcon("edit.png"));
		add(this.icon, "cell 2 1,alignx center");
		
		this.txtSelect = new JLabel("Editar Bicicleta");
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
		add(this.txtId1, "cell 2 4,growx");
		
		this.txtfkUsuario = new JLabel("fkUsuario:");
		this.txtfkUsuario.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtfkUsuario, "cell 1 5");
		
		this.txtfkUsuario1 = new JLabel("I______________________________");
		this.txtfkUsuario1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtfkUsuario1, "cell 2 5,growx");
		
		this.txtNome = new JLabel("Nome:");
		this.txtNome.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNome, "cell 1 6,alignx trailing");
		
		this.edNome = new JTextField();
		this.edNome.setFont(new Font("Dialog", Font.BOLD, 14));
		this.edNome.setColumns(10);
		add(this.edNome, "cell 2 6,growx");
		
		this.txtMarca = new JLabel("Marca:");
		this.txtMarca.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtMarca, "cell 1 7,alignx trailing");
		
		this.edMarca = new JTextField();
		this.edMarca.setFont(new Font("Dialog", Font.BOLD, 14));
		this.edMarca.setColumns(10);
		add(this.edMarca, "cell 2 7,growx");
		
		this.txtModelo = new JLabel("Modelo:");
		this.txtModelo.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtModelo, "cell 1 8,alignx trailing");
		
		this.edModelo = new JTextField();
		this.edModelo.setFont(new Font("Dialog", Font.BOLD, 14));
		this.edModelo.setColumns(10);
		add(this.edModelo, "cell 2 8,growx");
		
		this.flo = new JLabel("");
		this.flo.setIcon(new ImageIcon("floresta.png"));
		add(this.flo, "cell 0 0 1 22,alignx center,aligny center");
		
		this.txtAro = new JLabel("Aro:");
		this.txtAro.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtAro, "cell 1 9,alignx trailing");
		
		this.edAro = new JTextField();
		this.edAro.setFont(new Font("Dialog", Font.BOLD, 14));
		this.edAro.setColumns(10);
		add(this.edAro, "cell 2 9,growx");
		
		this.txtQuadro = new JLabel("Quadro:");
		this.txtQuadro.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtQuadro, "cell 1 10,alignx trailing");
		
		this.edQuadro = new JTextField();
		this.edQuadro.setFont(new Font("Dialog", Font.BOLD, 14));
		this.edQuadro.setColumns(10);
		add(this.edQuadro, "cell 2 10,growx");
		
		this.flo1 = new JLabel("");
		this.flo1.setIcon(new ImageIcon("floresta.png"));
		add(this.flo1, "cell 3 0 1 22,alignx center,aligny center");
		
		this.txtKM = new JLabel("Quilometragem:");
		this.txtKM.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtKM, "cell 1 11");
		
		this.txtKM1 = new JLabel("I______________________________");
		this.txtKM1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtKM1, "cell 2 11");
		
		this.txtRevisao = new JLabel("Revisão:");
		this.txtRevisao.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtRevisao, "cell 1 12");
		
		this.txtRevisao1 = new JLabel("I______________________________");
		this.txtRevisao1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtRevisao1, "cell 2 12");
		
		this.txtTroca = new JLabel("Troca de corrente:");
		this.txtTroca.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtTroca, "cell 1 13");
		
		this.txtTroca1 = new JLabel("I______________________________");
		this.txtTroca1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtTroca1, "cell 2 13");
		
		this.txtLubri = new JLabel("Lubrificacao:");
		this.txtLubri.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtLubri, "cell 1 14");
		
		this.txtLubri1 = new JLabel("I______________________________");
		this.txtLubri1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtLubri1, "cell 2 14");
		
		this.txtEstado = new JLabel("Estado dos pneus:");
		this.txtEstado.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtEstado, "cell 1 15,alignx trailing");
		
		this.edEstado = new JTextField();
		this.edEstado.setFont(new Font("Dialog", Font.BOLD, 14));
		this.edEstado.setColumns(10);
		add(this.edEstado, "cell 2 15,growx");
		
		this.txtKM22 = new JLabel("KM:");
		this.txtKM22.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtKM22, "cell 1 16");
		
		this.txtKM2 = new JLabel("I______________________________");
		this.txtKM2.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtKM2, "cell 2 16");
		
		this.btUpdate = new JButton("Alterar Dados");
		this.btUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update();
			}
		});
		
		this.lblKm = new JLabel("KM1:");
		this.lblKm.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.lblKm, "cell 1 17");
		
		this.txtKM2_1 = new JLabel("I______________________________");
		this.txtKM2_1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtKM2_1, "cell 2 17");
		this.btUpdate.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.btUpdate, "flowx,cell 2 19");
		
		this.btDelete = new JButton("Deletar Dados");
		this.btDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete();
			}
		});
		this.btDelete.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.btDelete, "cell 2 19");
		
		this.icon3 = new JLabel("");
		this.icon3.setIcon(new ImageIcon("alterar.png"));
		add(this.icon3, "flowx,cell 2 20,alignx center");
		
		this.icon2 = new JLabel("");
		this.icon2.setIcon(new ImageIcon("delete.png"));
		add(this.icon2, "cell 2 20,alignx center");
	}
	
	public void Update() {
		Banco_Bicicleta bb = new Banco_Bicicleta();
		Bicicleta b = new Bicicleta();
		if(!(txtId1.getText().equals(null))) {
			b.setId(Integer.parseInt(txtId1.getText().toString()));
			b.setNome(edNome.getText().toString());
			b.setMarca(edMarca.getText().toString());
			b.setModelo(edModelo.getText().toString());
			b.setAro(Integer.parseInt(edAro.getText().toString()));
			b.setQuadro(Integer.parseInt(edQuadro.getText().toString()));
			b.setEstado_dos_Pneus(edEstado.getText().toString());
			boolean bbb = bb.UPDATE_BICICLETA_LIMITADO(b);
			if(bbb == false) {
				JOptionPane.showMessageDialog(null, "Atualização Feita em Bicicleta", "Tabela Bicicleta", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "Opa, programador é um burro se isso acontecer!!", ":-(", JOptionPane.ERROR_MESSAGE);
			}
			comboBox.removeAllItems();
			acaoCombo();
            acaoSelect();
		}
	}
	
	public void Delete() {
		Banco_Bicicleta bb = new Banco_Bicicleta();
		boolean m = bb.DELETE_BICICLETA(Integer.parseInt(txtId1.getText().toString()));
		if(m == false) {
			JOptionPane.showMessageDialog(null, "Foi Deletado em Bicicleta", "Tabela Bicicleta", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Opa, programador e um burro se isso acontecer!!", ":-(", JOptionPane.ERROR_MESSAGE);
		}
		comboBox.removeAllItems();
		acaoCombo();
        acaoSelect();
	}
	
	public void acaoCombo() {
		Usuario a = ControleUsuario.getUsuarioLogado();
		Banco_Bicicleta bancoBicicleta = new Banco_Bicicleta();
	    LinkedList<String> nomesBicicletas = bancoBicicleta.SELECT_BICICLETA_NOME_FK(a.getId());
	    comboBox.addItem("Escolha: ");
	    for (String nomeBicicleta : nomesBicicletas) {
	    	comboBox.addItem(nomeBicicleta);
	    }
	}
	
	public void acaoSelect() {
		Banco_Bicicleta bancoBicicleta = new Banco_Bicicleta();
		Bicicleta b = new Bicicleta();
		
		Object selectedItem = comboBox.getSelectedItem();

	    if (selectedItem != null) {
	    	b = bancoBicicleta.SELECT_BICICLETA_PROCURA(comboBox.getSelectedItem().toString());
			txtId1.setText(String.valueOf(b.getId()));
			txtfkUsuario1.setText(String.valueOf(b.getFkUsuario()));
			edNome.setText(b.getNome());
			edMarca.setText(b.getMarca());
			edModelo.setText(b.getModelo());
			edAro.setText(String.valueOf(b.getAro()));
			edQuadro.setText(String.valueOf(b.getQuadro()));
			txtKM1.setText(String.valueOf(b.getQuilometragem()));
			txtRevisao1.setText(String.valueOf(b.getRevisao()));
			txtTroca1.setText(String.valueOf(b.getTroca_de_Corrente()));
			txtLubri1.setText(String.valueOf(b.getLubrificacao()));
			edEstado.setText(b.getEstado_dos_Pneus());
			txtKM2.setText(String.valueOf(b.getKm2()));
			txtKM2_1.setText(String.valueOf(b.getKm1()));
	    }
	}

}
