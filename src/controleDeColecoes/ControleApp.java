package controleDeColecoes;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControleApp extends JFrame {

	private JTextField txtLogin;
	private JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/*ColecoesFacade fachadaColecao = new ColecoesFacade();
		fachadaColecao.inserirLivroAutor("Alberto Felix");
		fachadaColecao.inserirLivroEmprestado(false);
		fachadaColecao.inserirLivroId(1);
		fachadaColecao.inserirLivroTitulo("A mãe de Deus nos conduz");
		
		SQLColecao tabela = new SQLColecao();
		tabela.inserir(fachadaColecao, "Livro");
		
		fachadaColecao.inserirFilmeAno(2018);
		fachadaColecao.inserirFilmeEmprestado(true);
		fachadaColecao.inserirFilmeGenero("Suspense");
		fachadaColecao.inserirFilmeId(1);
		fachadaColecao.inserirFilmeNome("Sexto Período");
		
		tabela.inserir(fachadaColecao, "Filme");*/
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControleApp frame = new ControleApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame Login.
	 */
	public ControleApp() {
		setTitle("Controle de Coleção");
		setSize(700, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		JButton entrar = new JButton("Entrar");
		entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ColecionadorPage colecionador = new ColecionadorPage();
				colecionador.setVisible(true);
			}
		});
		JButton cadastrar = new JButton("Cadastrar");
		cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastro cadastro = new Cadastro();
				cadastro.setVisible(true);
			}
		});
		getContentPane().setLayout(null);
		entrar.setBounds(258, 311, 90, 39);
		cadastrar.setBounds(359, 311, 118, 39);
		getContentPane().add(entrar);
		getContentPane().add(cadastrar);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(258, 150, 226, 39);
		getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(258, 123, 70, 15);
		getContentPane().add(lblLogin);
		
		textSenha = new JTextField();
		textSenha.setColumns(10);
		textSenha.setBounds(258, 234, 226, 39);
		getContentPane().add(textSenha);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(258, 207, 70, 15);
		getContentPane().add(lblSenha);
	}
}
