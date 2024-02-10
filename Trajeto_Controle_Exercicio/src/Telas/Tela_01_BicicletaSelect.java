package Telas;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Entidades.Bicicleta;
import Entidades.ControleUsuario;
import Entidades.Usuario;
import XAMPP.Banco_Bicicleta;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Tela_01_BicicletaSelect extends JPanel {
	private JLabel txtSelect;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox;
	private JLabel txtId;
	private JLabel txtId1;
	private JLabel txtfkUsuario1;
	private JLabel txtNome1;
	private JLabel txtMarca1;
	private JLabel txtModelo1;
	private JLabel txtAro1;
	private JLabel txtQuadro1;
	private JLabel txtKM1;
	private JLabel txtRevisao1;
	private JLabel txtTroca1;
	private JLabel txtLubri1;
	private JLabel txtEstado1;
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
	private JLabel icon;
	private JLabel monte;
	private JLabel monte1;

	/**
	 * Create the panel.
	 */
	public Tela_01_BicicletaSelect() {
		setBackground(new Color(116, 111, 145));
		initComponents();
		acaoCombo();
	}
	private void initComponents() {
		setLayout(new MigLayout("", "[grow][right][274.00][grow]", "[grow][][][][][][][][][][][][][][][][grow]"));
		setBounds(100, 100, 975, 650);
		
		this.icon = new JLabel("");
		this.icon.setIcon(new ImageIcon("info.png"));
		add(this.icon, "cell 2 1,alignx center");
		
		this.txtSelect = new JLabel("Informacoes de Bicicleta");
		this.txtSelect.setFont(new Font("Dialog", Font.BOLD, 18));
		add(this.txtSelect, "cell 2 2,alignx center");
		
		this.lblNewLabel_1 = new JLabel("                Selecione:");
		this.lblNewLabel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.lblNewLabel_1.setBackground(Color.WHITE);
		this.lblNewLabel_1.setOpaque(true);
		this.lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.lblNewLabel_1, "cell 1 3,growx");
		
		this.comboBox = new JComboBox();
		this.comboBox.setFont(new Font("Dialog", Font.BOLD, 16));
		this.comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acaoSelect();
			}
		});
		add(this.comboBox, "cell 2 3,grow");
		
		this.txtId = new JLabel("                               ID:");
		this.txtId.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtId.setBackground(Color.WHITE);
		this.txtId.setOpaque(true);
		this.txtId.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtId, "cell 1 4,growx");
		
		this.txtId1 = new JLabel("I______________________________");
		this.txtId1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtId1.setBackground(new Color(255, 255, 255));
		this.txtId1.setOpaque(true);
		this.txtId1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtId1, "cell 2 4,grow");
		
		this.txtfkUsuario = new JLabel("                fkUsuario:");
		this.txtfkUsuario.setBackground(Color.WHITE);
		this.txtfkUsuario.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtfkUsuario.setOpaque(true);
		this.txtfkUsuario.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtfkUsuario, "cell 1 5,growx");
		
		this.txtfkUsuario1 = new JLabel("I______________________________");
		this.txtfkUsuario1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtfkUsuario1.setBackground(new Color(255, 255, 255));
		this.txtfkUsuario1.setOpaque(true);
		this.txtfkUsuario1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtfkUsuario1, "cell 2 5,grow");
		
		this.txtNome = new JLabel("                       Nome:");
		this.txtNome.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtNome.setBackground(Color.WHITE);
		this.txtNome.setOpaque(true);
		this.txtNome.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNome, "cell 1 6,growx");
		
		this.txtNome1 = new JLabel("I______________________________");
		this.txtNome1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtNome1.setBackground(new Color(255, 255, 255));
		this.txtNome1.setOpaque(true);
		this.txtNome1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNome1, "cell 2 6,grow");
		
		this.monte = new JLabel("");
		this.monte.setIcon(new ImageIcon("monte.png"));
		add(this.monte, "cell 0 0 1 17,alignx center,aligny center");
		
		this.txtMarca = new JLabel("                       Marca:");
		this.txtMarca.setBackground(Color.WHITE);
		this.txtMarca.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtMarca.setOpaque(true);
		this.txtMarca.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtMarca, "cell 1 7,growx");
		
		this.txtMarca1 = new JLabel("I______________________________");
		this.txtMarca1.setBackground(new Color(255, 255, 255));
		this.txtMarca1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtMarca1.setOpaque(true);
		this.txtMarca1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtMarca1, "cell 2 7,grow");
		
		this.txtModelo = new JLabel("                     Modelo:");
		this.txtModelo.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtModelo.setBackground(Color.WHITE);
		this.txtModelo.setOpaque(true);
		this.txtModelo.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtModelo, "cell 1 8,growx");
		
		this.txtModelo1 = new JLabel("I______________________________");
		this.txtModelo1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtModelo1.setBackground(new Color(255, 255, 255));
		this.txtModelo1.setOpaque(true);
		this.txtModelo1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtModelo1, "cell 2 8,grow");
		
		this.monte1 = new JLabel("");
		this.monte1.setIcon(new ImageIcon("monte.png"));
		add(this.monte1, "cell 3 0 1 17,alignx center,aligny center");
		
		this.txtAro = new JLabel("                            Aro:");
		this.txtAro.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtAro.setBackground(Color.WHITE);
		this.txtAro.setOpaque(true);
		this.txtAro.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtAro, "cell 1 9,growx");
		
		this.txtAro1 = new JLabel("I______________________________");
		this.txtAro1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtAro1.setBackground(new Color(255, 255, 255));
		this.txtAro1.setOpaque(true);
		this.txtAro1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtAro1, "cell 2 9,grow");
		
		this.txtQuadro = new JLabel("                     Quadro:");
		this.txtQuadro.setBackground(Color.WHITE);
		this.txtQuadro.setOpaque(true);
		this.txtQuadro.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtQuadro, "cell 1 10,growx");
		
		this.txtQuadro1 = new JLabel("I______________________________");
		this.txtQuadro1.setBackground(new Color(255, 255, 255));
		this.txtQuadro1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtQuadro1.setOpaque(true);
		this.txtQuadro1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtQuadro1, "cell 2 10,grow");
		
		this.txtKM = new JLabel("      Quilometragem:");
		this.txtKM.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtKM.setBackground(Color.WHITE);
		this.txtKM.setOpaque(true);
		this.txtKM.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtKM, "cell 1 11,growx");
		
		this.txtKM1 = new JLabel("I______________________________");
		this.txtKM1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtKM1.setBackground(new Color(255, 255, 255));
		this.txtKM1.setOpaque(true);
		this.txtKM1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtKM1, "cell 2 11,grow");
		
		this.txtRevisao = new JLabel("                   Revis\u00E3o:");
		this.txtRevisao.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtRevisao.setBackground(Color.WHITE);
		this.txtRevisao.setOpaque(true);
		this.txtRevisao.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtRevisao, "cell 1 12,growx");
		
		this.txtRevisao1 = new JLabel("I______________________________");
		this.txtRevisao1.setBackground(new Color(255, 255, 255));
		this.txtRevisao1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtRevisao1.setOpaque(true);
		this.txtRevisao1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtRevisao1, "cell 2 12,grow");
		
		this.txtTroca = new JLabel(" Troca de corrente:");
		this.txtTroca.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtTroca.setBackground(Color.WHITE);
		this.txtTroca.setOpaque(true);
		this.txtTroca.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtTroca, "cell 1 13,growx");
		
		this.txtTroca1 = new JLabel("I______________________________");
		this.txtTroca1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtTroca1.setBackground(new Color(255, 255, 255));
		this.txtTroca1.setOpaque(true);
		this.txtTroca1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtTroca1, "cell 2 13,grow");
		
		this.txtLubri = new JLabel("           Lubrificacao:");
		this.txtLubri.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtLubri.setBackground(Color.WHITE);
		this.txtLubri.setOpaque(true);
		this.txtLubri.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtLubri, "cell 1 14,growx");
		
		this.txtLubri1 = new JLabel("I______________________________");
		this.txtLubri1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtLubri1.setBackground(new Color(255, 255, 255));
		this.txtLubri1.setOpaque(true);
		this.txtLubri1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtLubri1, "cell 2 14,grow");
		
		this.txtEstado = new JLabel("Estado dos pneus:");
		this.txtEstado.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtEstado.setBackground(Color.WHITE);
		this.txtEstado.setOpaque(true);
		this.txtEstado.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtEstado, "cell 1 15,grow");
		
		this.txtEstado1 = new JLabel("I______________________________");
		this.txtEstado1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.txtEstado1.setBackground(new Color(255, 255, 255));
		this.txtEstado1.setOpaque(true);
		this.txtEstado1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtEstado1, "cell 2 15,grow");
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
		b = bancoBicicleta.SELECT_BICICLETA_PROCURA(comboBox.getSelectedItem().toString());
		txtId1.setText(String.valueOf(b.getId()));
		txtfkUsuario1.setText(String.valueOf(b.getFkUsuario()));
		txtNome1.setText(b.getNome());
		txtMarca1.setText(b.getMarca());
		txtModelo1.setText(b.getModelo());
		txtAro1.setText(String.valueOf(b.getAro()));
		txtQuadro1.setText(String.valueOf(b.getQuadro()));
		txtKM1.setText(String.valueOf(b.getQuilometragem()));
		txtRevisao1.setText(String.valueOf(b.getRevisao()));
		txtTroca1.setText(String.valueOf(b.getTroca_de_Corrente()));
		txtLubri1.setText(String.valueOf(b.getLubrificacao()));
		txtEstado1.setText(b.getEstado_dos_Pneus());
	}

}
