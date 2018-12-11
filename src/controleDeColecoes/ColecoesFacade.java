package controleDeColecoes;

import java.sql.Date;

public class ColecoesFacade {
	
	protected Colecionador colecionador;
	protected Colecao colecao;
	protected Emprestimo objeto;
	
	//Métodos do colecionador
	public void loginColecionador(String login) {
		colecionador.setLogin(login);
	}
	
	public void senhaColecionador(String senha) {
		colecionador.setSenha(senha);
	}
	
	public String colecionadorLogin() {
		return colecionador.getLogin();
	}
	
	public String colecionadorSenha() {
		return colecionador.getSenha();
	}
	
	//Métodos da coleção
	public void objeto_colecao(String objeto_colecao) {
		colecao.setObjeto_colecao(objeto_colecao);
	}
	
	public void nome_objeto(String nome) {
		colecao.setNome(nome);
	}
	
	public void autor_objeto(String autor) {
		colecao.setAutor(autor);
	}
	
	public void ano_objeto(int ano) {
		colecao.setAno(ano);
	}
	
	public void situacao_objeto(boolean situacao) {
		colecao.setSituacao(situacao);
	}
	
	public String colecao_objeto() {
		return colecao.getObjeto_colecao();
	}
	
	public String objeto_nome() {
		return colecao.getNome();
	}
	
	public String objeto_autor() {
		return colecao.getAutor();
	}
	
	public int objeto_ano() {
		return colecao.getAno();
	}
	
	public boolean objeto_situacao() {
		return colecao.isSituacao();
	}
	
	//Métodos empréstimo
	public void nome_pessoa_emprestimo(String nome) {
		objeto.setNome_pessoa(nome);
	}
	
	public void endereco_pessoa_emprestimo(String endereco) {
		objeto.setEndereco(endereco);
	}
	
	public void data_emprestimo(Date data_emprestimo) {
		objeto.setData_emprestimo(data_emprestimo);
	}
	
	
}