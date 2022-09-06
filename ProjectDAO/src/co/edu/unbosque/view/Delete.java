package co.edu.unbosque.view;

import java.awt.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Delete {
	
	private JButton btnBack;
	private JFrame frame;
	private JTextField textId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete window = new Delete();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Delete() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Eliminar");
		lblTitle.setFont(new Font("Franchise", Font.PLAIN, 22));
		lblTitle.setBounds(183, 23, 78, 37);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblId = new JLabel("Identificación:");
		lblId.setBounds(27, 98, 70, 14);
		frame.getContentPane().add(lblId);
		
		textId = new JTextField();
		textId.setBounds(107, 95, 86, 20);
		frame.getContentPane().add(textId);
		textId.setColumns(10);
		
		Button buttonArray = new Button("Array");
		buttonArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonArray.setBounds(65, 211, 70, 22);
		frame.getContentPane().add(buttonArray);
		
		Button buttonBinary = new Button("Binario");
		buttonBinary.setBounds(145, 211, 70, 22);
		frame.getContentPane().add(buttonBinary);
		
		Button buttonSQL = new Button("SQL");
		buttonSQL.setBounds(229, 211, 70, 22);
		frame.getContentPane().add(buttonSQL);
		
		Button buttonNoSQL = new Button("Cassandra");
		buttonNoSQL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonNoSQL.setBounds(311, 211, 70, 22);
		frame.getContentPane().add(buttonNoSQL);
		
		btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.setHorizontalAlignment(SwingConstants.RIGHT);
		btnBack.setIcon(new ImageIcon("C:\\Users\\Felipe\\Downloads\\volver1.png"));
		btnBack.setSelectedIcon(null);
		btnBack.setBounds(0, 0, 65, 31);
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		frame.getContentPane().add(btnBack);
	}

	public JButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTextId() {
		return textId;
	}

	public void setTextId(JTextField textId) {
		this.textId = textId;
	}
	
}
