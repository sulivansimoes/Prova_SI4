package br.edu.univas.si.prova.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Tela extends JFrame {

	private static final long serialVersionUID = 6843370137920558837L;
	private JPanel pane = null;
	
	private final int width = 500;
	private final int heigth = 450;
	private final int larguraButton = 90;
	private final int alturaButton = 30;
	
	public Tela(){
		this.setTitle("Prova");
		
		this.setSize(new Dimension(width,heigth));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		configurePane();
		addComponents();
	}
	
	private void configurePane(){
		pane = new JPanel(new BorderLayout());
		this.setContentPane(pane);
	}
	
	private void addComponents(){
		
		JPanel panelButtons = new JPanel();
		panelButtons.setPreferredSize(new Dimension(width-350,heigth));
		panelButtons.setBackground(Color.white); //TODO COLOCAR COR PLUS
		populatePanelButtons(panelButtons);
		pane.add(panelButtons,BorderLayout.WEST);
		
		JPanel otherComponents = new JPanel(new GridBagLayout());
		otherComponents.setPreferredSize(new Dimension(width - 150, heigth));
		populateOtherComponents(otherComponents);
		pane.add(otherComponents, BorderLayout.EAST);
		
	}
	
	private void populatePanelButtons(JPanel panelbuttons){
				
		JButton button1 = new JButton("Botão 1");
		button1.setPreferredSize(new Dimension(larguraButton,alturaButton));
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				message();				
			}
		});
		panelbuttons.add(button1);
		
		JButton button2 = new JButton("Botão 2");
		button2.setPreferredSize(new Dimension(larguraButton, alturaButton));
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				message();
			}
		});
		panelbuttons.add(button2);
		
		JButton button3 = new JButton("Botão 3");
		button3.setPreferredSize(new Dimension(larguraButton, alturaButton));
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				message();
			}
		});
		panelbuttons.add(button3);
		
		JButton button4 = new JButton("Botão 4");
		button4.setPreferredSize(new Dimension(larguraButton, alturaButton));
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				message();
			}
		});
		panelbuttons.add(button4);
		
		JButton button5 = new JButton("Botão 5");
		button5.setPreferredSize(new Dimension(larguraButton, alturaButton));
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				message();
			}
		});
		panelbuttons.add(button5);
		
		JButton button6 = new JButton("Botão 6");
		button6.setPreferredSize(new Dimension(larguraButton,alturaButton));
		button6.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				message();
				
			}
		});
		panelbuttons.add(button6);
		
		JButton button7 = new JButton("Botão 7");
		button7.setPreferredSize(new Dimension(larguraButton, alturaButton));
		button7.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				message();
			}
		});
		panelbuttons.add(button7);
		
		JButton button8 = new JButton("Botão 8");
		button8.setPreferredSize(new Dimension(larguraButton, alturaButton));
		button8.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				message();
				
			}
		});
		panelbuttons.add(button8);
		
		JButton button9 = new JButton("Botão 9");
		button9.setPreferredSize(new Dimension(larguraButton, alturaButton));
		button9.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				message();
				
			}
		});
		panelbuttons.add(button9);
		
		JButton button10 = new JButton("Botão 10");
		button10.setPreferredSize(new Dimension(larguraButton, alturaButton));
		button10.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				message();				
			}
		});
		panelbuttons.add(button10);


	}
	
	private void populateOtherComponents(JPanel otherComponents){
		
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(10, 10, 10, 10);
		
		JLabel labelNome = new JLabel("Nome:	");
		constraints.gridx = 1;
		constraints.gridy = 1;
		otherComponents.add(labelNome, constraints);
		
		JTextField textNome = new JTextField();
		textNome.setColumns(50);
		constraints.ipadx = 200;
		constraints.gridx = 2;
		constraints.gridy = 1;
		otherComponents.add(textNome, constraints);
		
		JLabel labelEmail = new JLabel("Email:	");
		constraints.ipadx = 0;
		constraints.gridx = 1;
		constraints.gridy = 2;
		otherComponents.add(labelEmail, constraints);
		
		JTextField textEmail = new JTextField();
		textEmail.setColumns(50);
		constraints.ipadx = 200;
		constraints.gridx = 2;
		constraints.gridy = 2;
		otherComponents.add(textEmail, constraints);
				
		
		JButton buttonSalvar = new JButton("Salvar");
		buttonSalvar.setPreferredSize(new Dimension(larguraButton, alturaButton));
		constraints.ipadx = 0 ;
		constraints.ipady = 0;
		constraints.gridx = 2;
		constraints.gridy = 3;
		otherComponents.add(buttonSalvar, constraints);
		
		criaTable(otherComponents,constraints);
	}
	
	private void criaTable(JPanel otherComponents, GridBagConstraints constraints){
		
		String[] nameColumns = {"Nome","CPF","E-mail"};
		Object[][] data = {{"João"	,"111.111.111-11",	"joao@gmail.com"	},
						   {"Maria"	,"222.222.222-22",	"maria@gmail.com"	},
						   {"José"	,"333.333.333-33",	"jose@gmail.com"	}};
		
				
		JTable table = new JTable(data, nameColumns);
		//table.setFillsViewportHeight(true);
		constraints.ipady = 10;
		constraints.ipadx = 0;
		
//		constraints.gridwidth = 10;
	//	constraints.gridheight =9;
//		constraints.ipadx = 150;
//		constraints.ipady = 200;
		constraints.gridx = 10;
	    constraints.gridy = 10;
	    otherComponents.add(table, constraints);
		
	}
	
	private void message(){
		System.out.println("Eu sou responsável pelo meu futuro!");
	}
}
