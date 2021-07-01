package br.com.senai.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.curso.Curso;
import br.com.senai.curso.CursoController;


public class ProgramaPrincipal {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();
		List<Curso> cursos = new ArrayList<>();
		
		AlunoController alunoController = new AlunoController();
		CursoController cursoController = new CursoController();
		
		boolean sair = false;
		
		do {
			System.out.println("+---------- MENU ----------+");
			System.out.println("|1) Processo de alunos     |");
			System.out.println("|2) Processo de cursos     |");
			System.out.println("|3) Finalizar sistema      |");
			System.out.println("+--------------------------+");
			
			int opcao = alunoController.leOpcao();
			
			switch(opcao) {
			case 1:
				alunoController.menu(alunos);
				break;
			case 2:
				cursoController.menu(cursos);
				break;
			case 3:
				sair = true;
				break;
			default:
				System.out.print("Opção inválida!");
				break;
			}
			
		} while(!sair);
	}
}
