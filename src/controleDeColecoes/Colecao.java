package controleDeColecoes;

public class Colecao {
	
	public String objeto_colecao, nome, autor;
	public int ano, id;
	public boolean situacao;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getObjeto_colecao() {
		return objeto_colecao;
	}
	public void setObjeto_colecao(String objeto_colecao) {
		this.objeto_colecao = objeto_colecao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
}
