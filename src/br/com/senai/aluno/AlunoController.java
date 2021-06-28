package br.com.senai.aluno;

import java.util.List;
import java.util.Scanner;

public class AlunoController {
	
	private Scanner tec;
	
	public AlunoController() {
		tec = new Scanner(System.in);
	}
	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();
	}	
	
	public void menu(List<Aluno> alunos) {
			
			boolean sair = false;
			
			do {
				System.out.println("+----- PROCESSO DE ALUNOS ------+");
				System.out.println("|1) Cadastrar um novo aluno     |");
				System.out.println("|2) Editar alunos cadastrados   |");
				System.out.println("|3) Listar alunos cadastrados   |");
				System.out.println("|4) Excluir alunos              |");
				System.out.println("|5) Voltar                      |");
				System.out.println("+-------------------------------+");
			
				int opcao = leOpcao();
			
				switch(opcao) {
				case 1:
					alunos.add(cadastarAluno());
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					sair = true;
					break;
				default:
					System.out.println("Opção inválida!");
					break;
				}
			} while(!sair);
		}

	public Aluno cadastarAluno() {
		Aluno aluno = new Aluno();
		
		System.out.println("--- CADASTRAR NOVO ALUNO ---");
		System.out.print("Informe o nome do aluno: ");
		tec.nextLine();
		aluno.setNomeAluno(tec.next());
		
		System.out.print("Informe a idade: ");
		aluno.setIdadeAluno(tec.nextInt());

		System.out.print("Informe o país: ");
		aluno.setPais(tec.next());

		System.out.print("Informe o estado: ");
		aluno.setEstado(tec.next());
		
		System.out.print("Informe a cidade: ");
		aluno.setCidade(tec.next());

		return aluno;
	}
	
	public List<Aluno> editarAluno(List<Aluno> alunos) {
		Aluno aluno = new Aluno();
		
		System.out.print("Informe o ID do aluno para editar: ");
		int idAluno = tec.nextInt();
		
		System.out.println("+----- EDIÇÃO DE DADOS -----+");
		System.out.println("|1) Nome do aluno           |");
		System.out.println("|2) Idade                   |");
		System.out.println("|3) País                    |");
		System.out.println("|4) Estado                  |");
		System.out.println("|5) Cidade                  |");
		System.out.println("+---------------------------+");
		int opcao = tec.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("--- EDITAR NOME DO ALUNO ---");
			System.out.print("Informe o novo nome: ");
			aluno.setNomeAluno(tec.next());
			
			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());
			aluno.setPais(alunos.get(idAluno).getPais());
			aluno.setEstado(alunos.get(idAluno).getEstado());
			aluno.setCidade(alunos.get(idAluno).getCidade());
			
			alunos.set(idAluno, aluno);
			
			break;
		case 2:
			System.out.println("--- EDITAR IDADE DO ALUNO ---");
			System.out.print("Informe a nova idade: ");
			aluno.setIdadeAluno(tec.nextInt());
			
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setPais(alunos.get(idAluno).getPais());
			aluno.setEstado(alunos.get(idAluno).getEstado());
			aluno.setCidade(alunos.get(idAluno).getCidade());
			
			alunos.set(idAluno, aluno);
			
			break;
		case 3:
			System.out.println("--- EDITAR PAÍS DO ALUNO ---");
			System.out.print("Informe o novo país: ");
			aluno.setPais(tec.next());
			
			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setEstado(alunos.get(idAluno).getEstado());
			aluno.setCidade(alunos.get(idAluno).getCidade());
			
			alunos.set(idAluno, aluno);
			
			break;
		case 4:
			System.out.println("--- EDITAR ESTADO DO ALUNO ---");
			System.out.println("Informe o novo estado: ");
			aluno.setEstado(tec.next());
			
			aluno.setPais(alunos.get(idAluno).getPais());
			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setCidade(alunos.get(idAluno).getCidade());
			
			alunos.set(idAluno, aluno);
			
			break;
		case 5:
			System.out.println("--- EDITAR A CIDADE DO ALUNO ---");
			System.out.print("Informe a nova cidade: ");
			aluno.setCidade(tec.next());
			
			aluno.setEstado(alunos.get(idAluno).getEstado());
			aluno.setPais(alunos.get(idAluno).getPais());
			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			
			alunos.set(idAluno, aluno);
			
			break;
		default:
			System.out.print("Opção inválida!");
			break;
		}
		return alunos;
	} 
	
	public List<Aluno> listarAluno(List<Aluno> alunos){
		
		if(alunos.isEmpty()) {
			System.out.println("Não possui alunos cadastrados!");
			return null;
		}
	}
}
