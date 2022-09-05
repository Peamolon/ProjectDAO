package co.edu.unbosque.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.SystemColor;
import java.awt.Dialog.ModalExclusionType;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  /**
	 * Create the frame.
	 */
	public Principal() {
		setResizable(false);
		setForeground(Color.GRAY);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Personas");
		lblTitulo.setFont(new Font("Franchise", Font.PLAIN, 34));
		lblTitulo.setForeground(Color.DARK_GRAY);
		lblTitulo.setBounds(161, -14, 127, 63);
		contentPane.add(lblTitulo);
		
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 11));
		btnRegistro.setBounds(23, 185, 95, 23);
		contentPane.add(btnRegistro);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 11));
		btnEditar.setBounds(180, 185, 89, 23);
		contentPane.add(btnEditar);
		
		JButton btnVer = new JButton("Visualizar");
		btnVer.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 11));
		btnVer.setBounds(340, 185, 89, 23);
		contentPane.add(btnVer);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 11));
		btnEliminar.setBounds(180, 231, 89, 23);
		contentPane.add(btnEliminar);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\Felipe\\Downloads\\grupo, personas.jpg"));
		lblFondo.setBounds(-627, 0, 1108, 857);
		contentPane.add(lblFondo);
	}
}
