package cursojava.executavel;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;


public class PrimeiraClasseJava {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
        List<Aluno> alunos = new ArrayList<Aluno>();
        for(int i = 1; i <= 2; i++) {
        	
        	// TODO Auto-generated method stub
        	String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + i +" ?");
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
        	
        	for(int pos = 1; pos < 2; pos++) {
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
        
        for (int pos = 0; pos < alunos.size(); pos++) {
        	Aluno aluno = alunos.get(pos);
        	System.out.println("Aluno:" + pos + " = " + aluno.getNome() );
        	System.out.println("Média do aluno:" + aluno.getMediaNota() + " pontos");
        	System.out.println("Resultado:" + aluno.getAprovado());
        }
        
	}

}
