package controleDeColecoes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ControleApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ColecoesFacade fachadaColecao = new ColecoesFacade();
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
		
		tabela.inserir(fachadaColecao, "Filme");
		
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
	 * Create the frame.
	 */
	public ControleApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
