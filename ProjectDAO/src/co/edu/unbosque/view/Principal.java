package co.edu.unbosque.view;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JButton btnRegistro, btnEditar, btnVer, btnEliminar;

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
		initialize();

	}
	
	public void initialize() {
		JLabel lblTitulo = new JLabel("Personas");
		lblTitulo.setFont(new Font("Franchise", Font.PLAIN, 34));
		lblTitulo.setForeground(Color.DARK_GRAY);
		lblTitulo.setBounds(161, -14, 127, 63);
		contentPane.add(lblTitulo);

		btnRegistro = new JButton("Registro");
		btnRegistro.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 11));
		btnRegistro.setBounds(23, 185, 95, 23);
		btnRegistro.setActionCommand("BRegister");
		contentPane.add(btnRegistro);

		btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 11));
		btnEditar.setBounds(180, 185, 89, 23);
		btnEditar.setActionCommand("BEdit");
		contentPane.add(btnEditar);

		btnVer = new JButton("Visualizar");
		btnVer.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 11));
		btnVer.setBounds(340, 185, 89, 23);
		btnVer.setActionCommand("BView");
		contentPane.add(btnVer);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 11));
		btnEliminar.setBounds(180, 231, 89, 23);
		btnEliminar.setActionCommand("BDelete");
		contentPane.add(btnEliminar);

		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\Felipe\\Downloads\\grupo, personas.jpg"));
		lblFondo.setBounds(-627, 0, 1108, 857);
		contentPane.add(lblFondo);
	}

	public JButton getBtnRegistro() {
		return btnRegistro;
	}

	public void setBtnRegistro(JButton btnRegistro) {
		this.btnRegistro = btnRegistro;
	}

	public JButton getBtnEditar() {
		return btnEditar;
	}

	public void setBtnEditar(JButton btnEditar) {
		this.btnEditar = btnEditar;
	}

	public JButton getBtnVer() {
		return btnVer;
	}

	public void setBtnVer(JButton btnVer) {
		this.btnVer = btnVer;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}
	
}
