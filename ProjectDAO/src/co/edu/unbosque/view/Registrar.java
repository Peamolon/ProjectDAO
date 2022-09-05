package co.edu.unbosque.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTable;
import java.awt.Button;
import java.awt.ScrollPane;
import java.awt.Choice;
import java.awt.TextField;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registrar {

	private JFrame frame;
	private JButton btnBack;
	private JTextField textName;
	private JTextField txtEdad;
	private JTextField textId;
	private JTextField textSex;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrar window = new Registrar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
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
		
		JLabel lblTitle = new JLabel("Registro");
		lblTitle.setFont(new Font("Franchise", Font.PLAIN, 22));
		lblTitle.setBounds(185, 11, 80, 33);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblName = new JLabel("Nombre:");
		lblName.setBounds(22, 73, 46, 14);
		frame.getContentPane().add(lblName);
		
		textName = new JTextField();
		textName.setBounds(78, 70, 86, 20);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		JLabel lblAge = new JLabel("Edad:");
		lblAge.setBounds(22, 120, 46, 14);
		frame.getContentPane().add(lblAge);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(78, 117, 86, 20);
		frame.getContentPane().add(txtEdad);
		txtEdad.setColumns(10);
		
		JLabel lblId = new JLabel("Identificación:");
		lblId.setBounds(22, 164, 73, 14);
		frame.getContentPane().add(lblId);
		
		textId = new JTextField();
		textId.setBounds(105, 161, 86, 20);
		frame.getContentPane().add(textId);
		textId.setColumns(10);
		
		JLabel lblSex = new JLabel("Sexo:");
		lblSex.setBounds(22, 208, 46, 14);
		frame.getContentPane().add(lblSex);
		
		textSex = new JTextField();
		textSex.setBounds(78, 205, 86, 20);
		frame.getContentPane().add(textSex);
		textSex.setColumns(10);
		
		JButton btnRArray = new JButton("Array");
		btnRArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRArray.setBounds(345, 77, 89, 18);
		frame.getContentPane().add(btnRArray);
		
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
		
		JButton btnRBinario = new JButton("Binario");
		btnRBinario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRBinario.setBounds(345, 111, 89, 20);
		frame.getContentPane().add(btnRBinario);
		
		JButton btnRSql = new JButton("SQL");
		btnRSql.setBounds(345, 145, 89, 20);
		frame.getContentPane().add(btnRSql);
		
		JButton btnRCassandra = new JButton("Cassandra");
		btnRCassandra.setBounds(345, 179, 89, 20);
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
	
}
