package br.com.senai.aluno;


import br.com.senai.curso.Curso;
import br.com.senai.endereco.Endereco;

public class Aluno extends Endereco {

	private String nomeAluno;
	private String idadeAluno;
	private Curso curso;
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getIdadeAluno() {
		return idadeAluno;
	}
	public void setIdadeAluno(String idadeAluno) {
		this.idadeAluno = idadeAluno;
	}	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
