package Entidades;
public class Curso {

	private String codigo;
	private String nome;
	private Integer duracao;

	public Curso() {
		super();
	}

	public Curso(String codigo, String nome, Integer duracao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.duracao = duracao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

}