package Entidades;
public class Disciplina {

	private String codigo;
	private String nome;
	private Integer cargaHoraria;
	
	public Disciplina() {
		super();
	}

	public Disciplina(String codigo, String nome, Integer cargaHorario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
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

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHorario(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
}
