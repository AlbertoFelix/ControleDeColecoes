package controleDeColecoes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro extends JFrame {

	private JTextField textLogin;
	private JTextField textSenha;

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
	public Cadastro() {
		setTitle("Cadastro Colecionador");
		setSize(700, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		textLogin = new JTextField();
		textLogin.setBounds(241, 105, 244, 32);
		getContentPane().add(textLogin);
		textLogin.setColumns(10);
		
		JLabel lblNome = new JLabel("Login");
		lblNome.setBounds(241, 78, 70, 15);
		getContentPane().add(lblNome);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(241, 158, 70, 15);
		getContentPane().add(lblSenha);
		
		textSenha = new JTextField();
		textSenha.setColumns(10);
		textSenha.setBounds(241, 178, 244, 32);
		getContentPane().add(textSenha);
		
		JButton btnSalvar = new JButton("salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ColecoesFacade colecionador = new ColecoesFacade();
				colecionador.loginColecionador(textLogin.getText());
				colecionador.senhaColecionador(textSenha.getText());
				SQLColecao addColecionador = new SQLColecao();
				addColecionador.inserir(colecionador, "colecionador");
				dispose();
			}
		});
		btnSalvar.setBounds(311, 235, 117, 25);
		getContentPane().add(btnSalvar);
	}
}
