package co.edu.unbosque.view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Edit {

	private JFrame frame;
	private JButton btnBack;
	private JTextField textName;
	private JTextField txtEdad;
	private JTextField textSex;
	private JTextField textId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit window = new Edit();
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
	public Edit() {
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
		
		JLabel lblTitle = new JLabel("Editar");
		lblTitle.setFont(new Font("Franchise", Font.PLAIN, 22));
		lblTitle.setBounds(192, 11, 89, 33);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblName = new JLabel("Nombre:");
		lblName.setBounds(24, 100, 46, 14);
		frame.getContentPane().add(lblName);
		
		textName = new JTextField();
		textName.setBounds(80, 97, 86, 20);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		JLabel lblAge = new JLabel("Edad:");
		lblAge.setBounds(24, 147, 46, 14);
		frame.getContentPane().add(lblAge);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(80, 144, 86, 20);
		frame.getContentPane().add(txtEdad);
		txtEdad.setColumns(10);
		
		JLabel lblSex = new JLabel("Sexo:");
		lblSex.setBounds(24, 190, 46, 14);
		frame.getContentPane().add(lblSex);
		
		textSex = new JTextField();
		textSex.setBounds(80, 187, 86, 20);
		frame.getContentPane().add(textSex);
		textSex.setColumns(10);
		
		JButton btnNewButton = new JButton("Editar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(345, 210, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("Escoger registro");
		frame.setJMenuBar(menuBar);
		
		btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.setHorizontalAlignment(SwingConstants.RIGHT);
		btnBack.setIcon(new ImageIcon("C:\\Users\\Felipe\\Downloads\\volver1.png"));
		btnBack.setSelectedIcon(null);
		btnBack.setBounds(0, 0, 56, 33);
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		frame.getContentPane().add(btnBack);
		
		JLabel lblId = new JLabel("Identificación:");
		lblId.setBounds(24, 47, 75, 17);
		frame.getContentPane().add(lblId);
		
		textId = new JTextField();
		textId.setBounds(109, 44, 86, 20);
		frame.getContentPane().add(textId);
		textId.setColumns(10);
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

	public JTextField getTextSex() {
		return textSex;
	}

	public void setTextSex(JTextField textSex) {
		this.textSex = textSex;
	}

	public JTextField getTextId() {
		return textId;
	}

	public void setTextId(JTextField textId) {
		this.textId = textId;
	}
	
}
