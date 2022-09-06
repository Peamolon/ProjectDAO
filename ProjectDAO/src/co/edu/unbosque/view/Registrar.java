package co.edu.unbosque.view;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

public class Registrar {

	private JFrame frame;
	private JButton btnBack, btnRArray, btnRBinario, btnRSql, btnRCassandra;
	private JLabel lblTitle, lblName, lblAge, lblId, lblSex;
	private JTextField textName;
	private JTextField txtEdad;
	private JTextField textId;
	private JTextField textSex;

	
	public Registrar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 460, 305);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblTitle = new JLabel("Registro");
		lblTitle.setFont(new Font("Franchise", Font.PLAIN, 22));
		lblTitle.setBounds(185, 11, 80, 33);
		frame.getContentPane().add(lblTitle);
		
		lblName = new JLabel("Nombre:");
		lblName.setBounds(22, 73, 46, 14);
		frame.getContentPane().add(lblName);
		
		textName = new JTextField();
		textName.setBounds(78, 70, 86, 20);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		lblAge = new JLabel("Edad:");
		lblAge.setBounds(22, 120, 46, 14);
		frame.getContentPane().add(lblAge);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(78, 117, 86, 20);
		frame.getContentPane().add(txtEdad);
		txtEdad.setColumns(10);
		
		lblId = new JLabel("Identificación:");
		lblId.setBounds(22, 164, 73, 14);
		frame.getContentPane().add(lblId);
		
		textId = new JTextField();
		textId.setBounds(105, 161, 86, 20);
		frame.getContentPane().add(textId);
		textId.setColumns(10);
		
		lblSex = new JLabel("Sexo:");
		lblSex.setBounds(22, 208, 46, 14);
		frame.getContentPane().add(lblSex);
		
		textSex = new JTextField();
		textSex.setBounds(78, 205, 86, 20);
		frame.getContentPane().add(textSex);
		textSex.setColumns(10);
		
		btnRArray = new JButton("Array");
		btnRArray.setBounds(345, 77, 89, 18);
		btnRArray.setActionCommand("RArray");
		frame.getContentPane().add(btnRArray);
		
		btnBack = new JButton("");
		btnBack.setHorizontalAlignment(SwingConstants.RIGHT);
		btnBack.setIcon(new ImageIcon("C:\\Users\\Felipe\\Downloads\\volver1.png"));
		btnBack.setSelectedIcon(null);
		btnBack.setBounds(0, 0, 56, 33);
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setActionCommand("RBack");
		frame.getContentPane().add(btnBack);
		
		btnRBinario = new JButton("Binario");
		btnRBinario.setBounds(345, 111, 89, 20);
		btnRBinario.setActionCommand("RBinario");
		frame.getContentPane().add(btnRBinario);
		
		btnRSql = new JButton("SQL");
		btnRSql.setBounds(345, 145, 89, 20);
		btnRSql.setActionCommand("RSql");
		frame.getContentPane().add(btnRSql);
		
		btnRCassandra = new JButton("Cassandra");
		btnRCassandra.setBounds(345, 179, 89, 20);
		btnRCassandra.setActionCommand("RCassandra");
		frame.getContentPane().add(btnRCassandra);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

	public JTextField getTextName() {
		return textName;
	}

	public void setTextName(JTextField textName) {
		this.textName = textName;
	}

	public JTextField getTxtEdad() {
		return txtEdad;
	}

	public void setTxtEdad(JTextField txtEdad) {
		this.txtEdad = txtEdad;
	}

	public JTextField getTextId() {
		return textId;
	}

	public void setTextId(JTextField textId) {
		this.textId = textId;
	}

	public JTextField getTextSex() {
		return textSex;
	}

	public void setTextSex(JTextField textSex) {
		this.textSex = textSex;
	}

	public JButton getBtnRArray() {
		return btnRArray;
	}

	public void setBtnRArray(JButton btnRArray) {
		this.btnRArray = btnRArray;
	}

	public JButton getBtnRBinario() {
		return btnRBinario;
	}

	public void setBtnRBinario(JButton btnRBinario) {
		this.btnRBinario = btnRBinario;
	}

	public JButton getBtnRSql() {
		return btnRSql;
	}

	public void setBtnRSql(JButton btnRSql) {
		this.btnRSql = btnRSql;
	}

	public JButton getBtnRCassandra() {
		return btnRCassandra;
	}

	public void setBtnRCassandra(JButton btnRCassandra) {
		this.btnRCassandra = btnRCassandra;
	}

	public JLabel getLblTitle() {
		return lblTitle;
	}

	public void setLblTitle(JLabel lblTitle) {
		this.lblTitle = lblTitle;
	}

	public JLabel getLblName() {
		return lblName;
	}

	public void setLblName(JLabel lblName) {
		this.lblName = lblName;
	}

	public JLabel getLblAge() {
		return lblAge;
	}

	public void setLblAge(JLabel lblAge) {
		this.lblAge = lblAge;
	}

	public JLabel getLblId() {
		return lblId;
	}

	public void setLblId(JLabel lblId) {
		this.lblId = lblId;
	}

	public JLabel getLblSex() {
		return lblSex;
	}

	public void setLblSex(JLabel lblSex) {
		this.lblSex = lblSex;
	}
	
}
