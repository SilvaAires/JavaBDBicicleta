package Telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Entidades.ControleUsuario;
import Entidades.Treino;
import Entidades.Usuario;
import XAMPP.Banco_Treino;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Tela_01_TreinoSelect extends JPanel {
	private JLabel txtSelect;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox;
	private JLabel txtId;
	private JLabel txtId1;
	private JLabel txtfkTrajeto1;
	private JLabel txtdificuldade1;
	private JLabel txtnomeTrajeto1;
	private JLabel txtnomeBicicleta1;
	private JLabel txtQuilometragem1;
	private JLabel txtcalorias1;
	private JLabel txtTempo1;
	private JLabel txtnome1;
	private JLabel txtfkTrajeto;
	private JLabel txtdificuldade;
	private JLabel txtnomeTrajeto;
	private JLabel txtnomeBicicleta;
	private JLabel txtQuilometragem;
	private JLabel txtcalorias;
	private JLabel txttempo;
	private JLabel txtNome;
	private JLabel icon;
	private JLabel monte;
	private JLabel monte1;
	/**
	 * Create the panel.
	 */
	public Tela_01_TreinoSelect() {
		setBackground(new Color(116, 111, 145));

		initComponents();
		acaoCombo();
	}
	private void initComponents() {
		setLayout(new MigLayout("", "[grow][fill][258.00][grow]", "[grow][][][][][][][][][][][][][grow]"));
		setBounds(100, 100, 975, 650);
		
		this.icon = new JLabel("");
		this.icon.setIcon(new ImageIcon("info.png"));
		add(this.icon, "cell 2 1,alignx center");
		
		this.txtSelect = new JLabel("Informacoes do Treino");
		this.txtSelect.setFont(new Font("Dialog", Font.BOLD, 18));
		add(this.txtSelect, "cell 2 2,alignx center");
		
		this.lblNewLabel_1 = new JLabel("               Selecione:");
		this.lblNewLabel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.lblNewLabel_1.setBackground(Color.WHITE);
		this.lblNewLabel_1.setOpaque(true);
		this.lblNewLabel_1.setForeground(new Color(0, 0, 0));
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
		
		this.txtId = new JLabel("                              ID:");
		this.txtId.setBackground(Color.WHITE);
		this.txtId.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtId.setOpaque(true);
		this.txtId.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtId, "cell 1 4");
		
		this.txtId1 = new JLabel("I______________________________");
		this.txtId1.setOpaque(true);
		this.txtId1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtId1.setBackground(new Color(255, 255, 255));
		this.txtId1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtId1, "cell 2 4,grow");
		
		this.txtfkTrajeto = new JLabel("                FkTrajeto:");
		this.txtfkTrajeto.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtfkTrajeto.setBackground(Color.WHITE);
		this.txtfkTrajeto.setOpaque(true);
		this.txtfkTrajeto.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtfkTrajeto, "cell 1 5");
		
		this.txtfkTrajeto1 = new JLabel("I______________________________");
		this.txtfkTrajeto1.setOpaque(true);
		this.txtfkTrajeto1.setBackground(new Color(255, 255, 255));
		this.txtfkTrajeto1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtfkTrajeto1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtfkTrajeto1, "cell 2 5,grow");
		
		this.monte = new JLabel("");
		this.monte.setIcon(new ImageIcon("monte.png"));
		add(this.monte, "cell 0 0 1 14,alignx center,aligny center");
		
		this.txtNome = new JLabel("    Nome do Treino:");
		this.txtNome.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtNome.setBackground(Color.WHITE);
		this.txtNome.setOpaque(true);
		this.txtNome.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtNome, "cell 1 6");
		
		this.txtnome1 = new JLabel("I______________________________");
		this.txtnome1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtnome1.setBackground(new Color(255, 255, 255));
		this.txtnome1.setOpaque(true);
		this.txtnome1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtnome1, "cell 2 6,grow");
		
		this.monte1 = new JLabel("");
		this.monte1.setIcon(new ImageIcon("monte.png"));
		add(this.monte1, "cell 3 0 1 14,alignx center,aligny center");
		
		this.txtdificuldade = new JLabel("             Dificuldade:");
		this.txtdificuldade.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtdificuldade.setBackground(Color.WHITE);
		this.txtdificuldade.setOpaque(true);
		this.txtdificuldade.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtdificuldade, "cell 1 7");
		
		this.txtdificuldade1 = new JLabel("I______________________________");
		this.txtdificuldade1.setOpaque(true);
		this.txtdificuldade1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtdificuldade1.setBackground(new Color(255, 255, 255));
		this.txtdificuldade1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtdificuldade1, "cell 2 7,grow");
		
		this.txtnomeTrajeto = new JLabel("    Nome do trajeto:");
		this.txtnomeTrajeto.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtnomeTrajeto.setBackground(Color.WHITE);
		this.txtnomeTrajeto.setOpaque(true);
		this.txtnomeTrajeto.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtnomeTrajeto, "cell 1 8");
		
		this.txtnomeTrajeto1 = new JLabel("I______________________________");
		this.txtnomeTrajeto1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtnomeTrajeto1.setBackground(new Color(255, 255, 255));
		this.txtnomeTrajeto1.setOpaque(true);
		this.txtnomeTrajeto1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtnomeTrajeto1, "cell 2 8,grow");
		
		this.txtnomeBicicleta = new JLabel("Nome da bicicleta:");
		this.txtnomeBicicleta.setBackground(Color.WHITE);
		this.txtnomeBicicleta.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtnomeBicicleta.setOpaque(true);
		this.txtnomeBicicleta.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtnomeBicicleta, "cell 1 9");
		
		this.txtnomeBicicleta1 = new JLabel("I______________________________");
		this.txtnomeBicicleta1.setOpaque(true);
		this.txtnomeBicicleta1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtnomeBicicleta1.setBackground(new Color(255, 255, 255));
		this.txtnomeBicicleta1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtnomeBicicleta1, "cell 2 9,grow");
		
		this.txtQuilometragem = new JLabel("     Quilometragem:");
		this.txtQuilometragem.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtQuilometragem.setBackground(Color.WHITE);
		this.txtQuilometragem.setOpaque(true);
		this.txtQuilometragem.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtQuilometragem, "cell 1 10");
		
		this.txtQuilometragem1 = new JLabel("I______________________________");
		this.txtQuilometragem1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtQuilometragem1.setBackground(new Color(255, 255, 255));
		this.txtQuilometragem1.setOpaque(true);
		this.txtQuilometragem1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtQuilometragem1, "cell 2 10,grow");
		
		this.txtcalorias = new JLabel("                  Calorias:");
		this.txtcalorias.setBackground(Color.WHITE);
		this.txtcalorias.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtcalorias.setOpaque(true);
		this.txtcalorias.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtcalorias, "cell 1 11");
		
		this.txtcalorias1 = new JLabel("I______________________________");
		this.txtcalorias1.setOpaque(true);
		this.txtcalorias1.setBackground(new Color(255, 255, 255));
		this.txtcalorias1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtcalorias1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtcalorias1, "cell 2 11,grow");
		
		this.txttempo = new JLabel("                     Tempo:");
		this.txttempo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txttempo.setBackground(Color.WHITE);
		this.txttempo.setOpaque(true);
		this.txttempo.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txttempo, "cell 1 12");
		
		this.txtTempo1 = new JLabel("I______________________________");
		this.txtTempo1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.txtTempo1.setBackground(new Color(255, 255, 255));
		this.txtTempo1.setOpaque(true);
		this.txtTempo1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(this.txtTempo1, "cell 2 12,grow");
	}
	
	public void acaoCombo() {
		Usuario a = ControleUsuario.getUsuarioLogado();
		Banco_Treino bt = new Banco_Treino();
	    LinkedList<String> nomesBicicletas = bt.SELECT_TREINO_NOME_FK(a.getId());
	    comboBox.addItem("Escolha: ");
	    for (String nomeBicicleta : nomesBicicletas) {
	    	comboBox.addItem(nomeBicicleta);
	    }
	}
	
	public void acaoSelect(){
		Banco_Treino bt = new Banco_Treino();
		Treino tt = new Treino();
		tt = bt.SELECT_TRAJETO_PROCURA(comboBox.getSelectedItem().toString());
		txtId1.setText(String.valueOf(tt.getId()));
		txtfkTrajeto1.setText(String.valueOf(tt.getFkTrajeto()));
		txtdificuldade1.setText(tt.getDificuldade());
		txtnomeTrajeto1.setText(tt.getNomeTrajeto());
		txtnomeBicicleta1.setText(tt.getNomeBicicleta());
		txtQuilometragem1.setText(String.valueOf(tt.getQuilometragem()));
		txtcalorias1.setText(String.valueOf(tt.getCalorias()));
		txtTempo1.setText(tt.getTempo());
		txtnome1.setText(tt.getNome());
	}

}
