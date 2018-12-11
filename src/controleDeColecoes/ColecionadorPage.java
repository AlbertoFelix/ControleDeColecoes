package controleDeColecoes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class ColecionadorPage extends JFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ColecionadorPage() {
		setTitle("Controle de Coleção");
		setSize(700, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JButton btnSair = new JButton("sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnSair.setBounds(522, 501, 117, 25);
		getContentPane().add(btnSair);
		
		table = new JTable();
		table.setBounds(43, 54, 630, 188);
		getContentPane().add(table);
		
		JButton btnVColeo = new JButton("vê coleção");
		btnVColeo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQLColecao p = new SQLColecao();
				p.consultar(table);
			}
		});
		btnVColeo.setBounds(303, 268, 117, 25);
		getContentPane().add(btnVColeo);
		
		JButton btnAddItem = new JButton("add item");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAddItem.setBounds(101, 501, 117, 25);
		getContentPane().add(btnAddItem);
	}
}
