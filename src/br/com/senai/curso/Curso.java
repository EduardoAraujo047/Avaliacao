package br.com.senai.curso;

public class Curso {

	private String nomeCurso;

	public Curso() {
	}
	
	public Curso(String nomeCurso) {
		super();
		this.nomeCurso = nomeCurso;
	}
	
	
	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
}
