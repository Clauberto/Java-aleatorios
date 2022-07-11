//Nome Claubert Felisberto Colonetti - Turma 1137B
import javax.swing.JOptionPane;

public class Questao3 {

	public static void main(String[] args) {
		
		//Declaração as variáveis.
		String nome = JOptionPane.showInputDialog("Nome:");
		String sAnoNascimento = JOptionPane.showInputDialog("Ano nascimento:");
		String sAnoIngresso = JOptionPane.showInputDialog("Ano que ingressou a empresa:");
		//Converter String para double.
		double anoingresso = Double.parseDouble(sAnoIngresso);
		double anonascimento = Double.parseDouble(sAnoNascimento);
		
		double tempoempresa = 2021 - anoingresso;
		double idade = 2021 - anonascimento;
		
		//Declaração das condições, dependendo de dados recebidos, resultados diferentes.
		if(idade >= 65 && tempoempresa >= 30 || idade >=60 && tempoempresa >=25) {
			JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "\nTempo de empresa: " + tempoempresa + "\nRequer aposentadoria.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "\nTempo de empresa: " + tempoempresa + "\nNão requer aposentadoria.");	
		}
		System.exit(0);

	}

}
