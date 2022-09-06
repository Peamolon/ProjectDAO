package co.edu.unbosque.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ListSelectionModel;
import javax.swing.JMenuBar;

public class View {

	private JFrame frame;
	private JScrollPane scrollPane;
	private JTable table;
	private JMenu mnNewMenu;
	private JMenuItem mntmArreglo;
	private JMenuItem mntmBinary;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuBar menuBar_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
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
	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		scrollPane = new JScrollPane();
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 456, 305);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Visualizar");
		lblNewLabel.setFont(new Font("Franchise", Font.PLAIN, 22));
		lblNewLabel.setBounds(172, 11, 96, 34);
		frame.getContentPane().add(lblNewLabel);
		scrollPane.setBounds(0, 56, 434, 210);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setRowSelectionAllowed(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Nombre", "Identificaci\u00F3n", "Edad", "Sexo"
			}
		));
		table.getTableHeader().setReorderingAllowed(false);
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		scrollPane.setViewportView(table);
		
		menuBar_1 = new JMenuBar();
		frame.setJMenuBar(menuBar_1);
		
		mnNewMenu = new JMenu("Ver");
		menuBar_1.add(mnNewMenu);
		
		mntmArreglo = new JMenuItem("Arreglo");
		mntmArreglo.setSelected(true);
		mnNewMenu.add(mntmArreglo);
		
		mntmBinary = new JMenuItem("Binario");
		mnNewMenu.add(mntmBinary);
		
		mntmNewMenuItem_1 = new JMenuItem("SQL");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("NoSQL");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmVolver = new JMenuItem("Volver...");
		mnNewMenu.add(mntmVolver);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JMenu getMnNewMenu() {
		return mnNewMenu;
	}

	public void setMnNewMenu(JMenu mnNewMenu) {
		this.mnNewMenu = mnNewMenu;
	}

	public JMenuItem getMntmArreglo() {
		return mntmArreglo;
	}

	public void setMntmArreglo(JMenuItem mntmArreglo) {
		this.mntmArreglo = mntmArreglo;
	}

	public JMenuItem getMntmBinary() {
		return mntmBinary;
	}

	public void setMntmBinary(JMenuItem mntmBinary) {
		this.mntmBinary = mntmBinary;
	}

	public JMenuItem getMntmNewMenuItem_1() {
		return mntmNewMenuItem_1;
	}

	public void setMntmNewMenuItem_1(JMenuItem mntmNewMenuItem_1) {
		this.mntmNewMenuItem_1 = mntmNewMenuItem_1;
	}

	public JMenuItem getMntmNewMenuItem_2() {
		return mntmNewMenuItem_2;
	}

	public void setMntmNewMenuItem_2(JMenuItem mntmNewMenuItem_2) {
		this.mntmNewMenuItem_2 = mntmNewMenuItem_2;
	}

	public JMenuBar getMenuBar_1() {
		return menuBar_1;
	}

	public void setMenuBar_1(JMenuBar menuBar_1) {
		this.menuBar_1 = menuBar_1;
	}
	
}
