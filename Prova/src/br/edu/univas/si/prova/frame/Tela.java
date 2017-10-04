package br.edu.univas.si.prova.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela extends JFrame {

	private static final long serialVersionUID = 6843370137920558837L;
	private JPanel pane = null;
	
	private final int width = 500;
	private final int heigth = 450;
	
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
		panelButtons.setBackground(Color.blue); //TODO COLOCAR COR PLUS
		populatePanelButtons(panelButtons);
		pane.add(panelButtons,BorderLayout.WEST);
		
		JPanel otherComponents = new JPanel(new GridBagLayout());
		otherComponents.setPreferredSize(new Dimension(width - 150, heigth));
		otherComponents.setBackground(Color.white); //TODO RETIRAR
		populateOtherComponents(otherComponents);
		pane.add(otherComponents, BorderLayout.EAST);
		
	}
	
	private void populatePanelButtons(JPanel panelbuttons){
		
		final int larguraButton = 90;
		final int alturaButton = 30;
		
		JButton button1 = new JButton("Botão 1");
		button1.setPreferredSize(new Dimension(larguraButton,alturaButton));
		panelbuttons.add(button1);
		
		JButton button2 = new JButton("Botão 2");
		button2.setPreferredSize(new Dimension(larguraButton, alturaButton));
		panelbuttons.add(button2);
		
		JButton button3 = new JButton("Botão 3");
		button3.setPreferredSize(new Dimension(larguraButton, alturaButton));
		panelbuttons.add(button3);
		
		JButton button4 = new JButton("Botão 4");
		button4.setPreferredSize(new Dimension(larguraButton, alturaButton));
		panelbuttons.add(button4);
		
		JButton button5 = new JButton("Botão 5");
		button5.setPreferredSize(new Dimension(larguraButton, alturaButton));
		panelbuttons.add(button5);
		
		JButton button6 = new JButton("Botão 6");
		button6.setPreferredSize(new Dimension(larguraButton,alturaButton));
		panelbuttons.add(button6);
		
		JButton button7 = new JButton("Botão 7");
		button7.setPreferredSize(new Dimension(larguraButton, alturaButton));
		panelbuttons.add(button7);
		
		JButton button8 = new JButton("Botão 8");
		button8.setPreferredSize(new Dimension(larguraButton, alturaButton));
		panelbuttons.add(button8);
		
		JButton button9 = new JButton("Botão 9");
		button9.setPreferredSize(new Dimension(larguraButton, alturaButton));
		panelbuttons.add(button4);
		
		JButton button10 = new JButton("Botão 10");
		button10.setPreferredSize(new Dimension(larguraButton, alturaButton));
		panelbuttons.add(button10);


	}
	
	private void populateOtherComponents(JPanel otherComponents){
		
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(10, 10, 10, 10);
		
		JLabel labelNome = new JLabel("Nome:	");
		constraints.gridx = 2;
		constraints.gridy = 2;
		otherComponents.add(labelNome, constraints);
		
		JTextField textNome = new JTextField();
		textNome.setColumns(50);
		constraints.ipadx = 200;
		//constraints.anchor = GridBagConstraints.LINE_END;
		constraints.gridx = 4;
		constraints.gridy = 2;
		otherComponents.add(textNome, constraints);
		
		
		
		
		
		
	}
}
