package br.com.senai.aluno;

import java.util.List;
import java.util.Scanner;

import br.com.senai.endereco.Endereco;

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
					editarAluno(alunos);
					break;
				case 3:
					listarAluno(alunos);
					break;
				case 4:
					excluirAluno(alunos);
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
		
		System.out.println("----- CADASTRAR NOVO ALUNO -----");
		System.out.print("Informe o nome do aluno: ");
		tec.nextLine();
		aluno.setNomeAluno(tec.nextLine());
		
		System.out.print("Informe a idade: ");
		aluno.setIdadeAluno(tec.next());

		System.out.print("Informe o país: ");
		tec.nextLine();
		aluno.setPais(tec.nextLine());

		System.out.print("Informe o estado: ");
		aluno.setEstado(tec.nextLine());
		
		System.out.print("Informe a cidade: ");
		aluno.setCidade(tec.nextLine());

		return aluno;
	}
	
	public List<Aluno> editarAluno(List<Aluno> alunos) {
		Aluno aluno = new Aluno();
		listarAluno(alunos);
		
		if(alunos.isEmpty()) {
			return null;
	}
		
		System.out.print("Informe o ID do aluno para editar: ");
		int idAluno = tec.nextInt();
		
		System.out.println("+----- EDIÇÃO DE DADOS -----+");
		System.out.println("|1) Nome do aluno           |");
		System.out.println("|2) Idade                   |");
		System.out.println("|3) País                    |");
		System.out.println("|4) Estado                  |");
		System.out.println("|5) Cidade                  |");
		System.out.println("+---------------------------+");
		int opcao = leOpcao();
		
		switch(opcao) {
		case 1:
			System.out.println("----- EDITAR NOME DO ALUNO -----");
			System.out.print("Informe o novo nome: ");
			tec.nextLine();
			aluno.setNomeAluno(tec.nextLine());
			
			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());
			aluno.setPais(alunos.get(idAluno).getPais());
			aluno.setEstado(alunos.get(idAluno).getEstado());
			aluno.setCidade(alunos.get(idAluno).getCidade());
			
			alunos.set(idAluno, aluno);
			
			break;
		case 2:
			System.out.println("----- EDITAR IDADE DO ALUNO -----");
			System.out.print("Informe a nova idade: ");
			aluno.setIdadeAluno(tec.next());
			
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setPais(alunos.get(idAluno).getPais());
			aluno.setEstado(alunos.get(idAluno).getEstado());
			aluno.setCidade(alunos.get(idAluno).getCidade());
			
			alunos.set(idAluno, aluno);
			
			break;
		case 3:
			System.out.println("----- EDITAR PAÍS DO ALUNO -----");
			System.out.print("Informe o novo país: ");
			aluno.setPais(tec.next());
			
			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setEstado(alunos.get(idAluno).getEstado());
			aluno.setCidade(alunos.get(idAluno).getCidade());
			
			alunos.set(idAluno, aluno);
			
			break;
		case 4:
			System.out.println("----- EDITAR ESTADO DO ALUNO -----");
			System.out.print("Informe o novo estado: ");
			tec.nextLine();
			aluno.setEstado(tec.nextLine());
			
			aluno.setPais(alunos.get(idAluno).getPais());
			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setCidade(alunos.get(idAluno).getCidade());
			
			alunos.set(idAluno, aluno);
			
			break;
		case 5:
			System.out.println("----- EDITAR A CIDADE DO ALUNO -----");
			System.out.print("Informe a nova cidade: ");
			tec.nextLine();
			aluno.setCidade(tec.nextLine());
			
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
		
		System.out.println("----- ALUNOS CADASTRADOS -----");
		
		System.out.printf(
				"| %2s | %20s | %5s | %10s | %20s | %20s |\n",
				"ID","Nome","Idade","País","Estado","Cidade");
		
		for (int i = 0; i < alunos.size(); i++) {
			System.out.printf(
					"| %2s | %20s | %5s | %10s | %20s | %20s |\n",
					i,
					alunos.get(i).getNomeAluno(),
					alunos.get(i).getIdadeAluno(),
					alunos.get(i).getPais(),
					alunos.get(i).getEstado(),
					alunos.get(i).getCidade());
		}
		return alunos;
	}	
	
	public void excluirAluno(List<Aluno> alunos) {
		
		listarAluno(alunos);
		
		if(alunos.isEmpty()) {
			return;
		}
		
		System.out.println("----- EXCLUIR ALUNOS -----");
		System.out.print("Informe o ID do aluno para excluir: ");
		int idAluno = tec.nextInt();
				
		alunos.remove(idAluno);
	}
	
	public Endereco cadEndereco() {
		Endereco endereco = new Endereco();
		return endereco;
	}	
}
