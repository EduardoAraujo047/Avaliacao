package br.com.senai.curso;

import java.util.List;
import java.util.Scanner;

public class CursoController {

	private Scanner tec;
	
	public CursoController() {
		tec = new Scanner(System.in);
	}
	
	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();
	}
	
	public void menu(List<Curso> cursos) {
		
		boolean sair = false;
		
		do {
			System.out.println("+------ PROCESSO DE CURSOS ------+");
			System.out.println("|1) Cadastrar novo curso         |");
			System.out.println("|2) Listar cursos cadastrados    |");
			System.out.println("|3) Editar cursos                |");
			System.out.println("|4) Excluir cursos cadastrados   |");
			System.out.println("|5) Voltar                       |");
			System.out.println("+--------------------------------+");
			
			int opcao = leOpcao();
			
			switch(opcao) {
			case 1:
				cursos.add(cadastrarCurso());
				break;
			case 2:
				listarCurso(cursos);
				break;
			case 3:
				editarCurso(cursos);
				break;
			case 4:
				excluirCurso(cursos);
				break;
			case 5:
				sair = true;
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}			
		}while (!sair);
	}
	
	public Curso cadastrarCurso() {
		Curso curso = new Curso();
		
		System.out.println("----- CADASTRAR NOVO CURSO -----");
		System.out.print("Informe o nome do curso: ");
		tec.nextLine();
		curso.setNomeCurso(tec.nextLine());
		
		return curso;		
	}
	
	public List<Curso> editarCurso(List<Curso> cursos) {
		Curso curso = new Curso();
		listarCurso(cursos);
		
		if (cursos.isEmpty()) {
			return null;
		}
		
		System.out.print("Informe o ID do curso para editar: ");
		int idCurso = tec.nextInt() - 1;
		
		System.out.println("+----- EDIÇÃO DE CURSOS -----+");
		System.out.println("|1) Nome do curso            |");
		System.out.println("+----------------------------+");
		System.out.println("Insira a opção: ");
		int opcao = leOpcao();
		
		switch(opcao) {
		case 1:
			System.out.println("----- EDITAR NOME DO CURSO -----");
			System.out.print("Informe o novo curso: ");
			tec.nextLine();
			curso.setNomeCurso(tec.nextLine());
			
			cursos.set(idCurso, curso);
			
			break;
		default:
			System.out.print("Opção inválida!");
			break;
		} 
		return cursos;
	}
	
	public List<Curso> listarCurso(List<Curso> cursos) {
		
		if(cursos.isEmpty()) {
			System.out.println("Não possui cursos cadastrados!");
			return null;
		}
		
		System.out.println("----- CURSOS CADASTRADOS -----");
		
		System.out.printf(
				"| %2s | %20s |\n",
				"ID","Nome");
		
		for (int i = 0; i < cursos.size(); i++) {
			System.out.printf(
					"| %2s | %20s |\n",
					i + 1,
					cursos.get(i).getNomeCurso());
		}
		return cursos;
	}
	public void excluirCurso(List<Curso> cursos) {
		
		listarCurso(cursos);
		
		if(cursos.isEmpty()) {
			return;
		}
		
		System.out.println("----- EXCLUIR CURSOS -----");
		System.out.print("Informe o ID do curso para excluir: ");
		int idCurso = tec.nextInt() - 1;
		
		if(cursos.size() <= idCurso) {
			System.out.println("Curso não cadastrado.");
			return;
		}
		cursos.remove(idCurso);
	}
}
