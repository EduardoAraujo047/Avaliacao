package br.com.senai.aluno;


import br.com.senai.curso.Curso;
import br.com.senai.endereco.Endereco;

public class Aluno extends Endereco {

	private String nomeAluno;
	private int anoDeNascimento;
	private int idadeAluno;
	private Curso curso;
	
	public int getIdadeAluno() {
		return idadeAluno;
	}
	public void setIdadeAluno(int idadeAluno) {
		this.idadeAluno = idadeAluno;
	}
	
	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}
	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
