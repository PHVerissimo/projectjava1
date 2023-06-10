package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o Login:");
		String senha = JOptionPane.showInputDialog("Informe a Senha:");
		
		if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
			
			List<Aluno> alunos = new ArrayList<>();
			
			/*This is a kind of list that inside we have a key to bring us values*/
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
			
			
			
			for (int i = 0; i <= 1; i++) {
				
				String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + i + " ?");
//        	String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
//        	String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
//        	String rg  = JOptionPane.showInputDialog("Qual o numero de rg do aluno?");
//        	String cpf = JOptionPane.showInputDialog("Qualo cpf do aluno?");
//        	String nomeMae = JOptionPane.showInputDialog("Nome da mae do aluno?");
//        	String nomePai = JOptionPane.showInputDialog("Nome da pai do aluno?");
//        	String dataMatricula = JOptionPane.showInputDialog("Qual é a data de matrícula do aluno?");
//        	String serieMatriculado = JOptionPane.showInputDialog("Em qual série o aluno esta matriculado?");
//        	String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola?");
//        	
				
				Aluno aluno1 = new Aluno();
				
				aluno1.setNome(nome);
//        	aluno1.setIdade(Integer.valueOf(idade));
//        	aluno1.setDataNascimento(dataNascimento);
//        	aluno1.setRegistroGeral(rg);
//        	aluno1.setNumeroCpf(cpf);
//        	aluno1.setNomeMae(nomeMae);
//        	aluno1.setNomePai(nomePai);
//        	aluno1.setDataMatricula(dataMatricula);
//        	aluno1.setSerieMatriculado(serieMatriculado);
//        	aluno1.setNomeEscola(nomeEscola);
				
				for (int pos = 0; pos < 1; pos++) {
					String nomeDisciplina = JOptionPane.showInputDialog("Informe o nome da disciplina " + pos + ":");
					String notaDisciplina = JOptionPane.showInputDialog("Informe a nota da disciplina " + pos + ":");
					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));
					aluno1.getDisciplinas().add(disciplina);
				}
				
//        	int escolha = JOptionPane.showConfirmDialog(null,"Deseja remover alguma disciplina?");
//        	if(escolha == 0) {
//        		
//        		int continuarRemover = 0;
//        		int posicao = 1;
//        		while (continuarRemover == 0 && aluno1.getDisciplinas().size() > 0){
//        			String disciplinaRemover = JOptionPane.showInputDialog("Qual é a discipliona? (1,2,3,4)");
//        			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
//        			posicao ++;
//        			continuarRemover = JOptionPane.showConfirmDialog(null,"Deseja continuar a remoção de disciplinas?");
//        		}
//        	}
				
				alunos.add(aluno1);
			}
			
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			
			for (Aluno aluno : alunos) {
				if(aluno.getAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				}else if(aluno.getAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				}else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}
			
			System.out.println("------Lista dos Aprovados------");
			for(Aluno alunosAp : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Nome Aluno: " + alunosAp.getNome());
				System.out.println("Resultado: " + alunosAp.getAprovado2());
				System.out.println("Média: " + alunosAp.getMediaNota());
			}
			
			System.out.println("------Lista de Recuperação------");
			for(Aluno alunosRec : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Nome Aluno: " + alunosRec.getNome());
				System.out.println("Resultado: " + alunosRec.getAprovado2());
				System.out.println("Média: " + alunosRec.getMediaNota());
			}
			
			System.out.println("------Lista de Reprovação------");
			for(Aluno alunosRep : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Nome Aluno: " + alunosRep.getNome());
				System.out.println("Resultado: " + alunosRep.getAprovado2());
				System.out.println("Média: " + alunosRep.getMediaNota());
			}
			
			
//		for (int pos = 0; pos < 2; pos++) {
//			Aluno aluno = alunos.get(pos);
//
//			if (aluno.getNome().equalsIgnoreCase("João")) {
//				Aluno trocar = new Aluno();
//				trocar.setNome("Aluno foi trocado");
//
//				Disciplina discip = new Disciplina();
//				discip.setDisciplina("Calc I");
//				discip.setNota(80);
//
//				trocar.getDisciplinas().add(discip);
//				alunos.set(pos, trocar);
//				aluno = alunos.get(pos);
//			}
//
//			System.out.println("Aluno:" + pos + " = " + aluno.getNome());
//			System.out.println("Média do aluno:" + aluno.getMediaNota() + " pontos");
//			System.out.println("Resultado:" + aluno.getAprovado());
//			for (Disciplina disc : aluno.getDisciplinas()) {
//				System.out.println("Discplina:" + disc.getDisciplina());
//				System.out.println("Nota:" + disc.getNota());
//			}
//		}
		}

	}

}
