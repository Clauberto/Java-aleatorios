//Nome Claubert Felisberto Colonetti - Turma 1137B
import javax.swing.JOptionPane;

public class Questao2 {

	public static void main(String[] args) {
		
		
		//Declaração de variaveis.
		String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
		String stotalMensalidade = JOptionPane.showInputDialog("Digite o valor da mensalidade:");
		String stipoPagamento = JOptionPane.showInputDialog("Digite o tipo de pagamento" + "\n1 - Á vista (10% de desconto)" + "\n2 - Parcelado (10% de acréscimo)");
		//Converter String para double e int.
		int tipoPagamento = Integer.parseInt(stipoPagamento);
		double totalMensalidade = Double.parseDouble(stotalMensalidade);
		//Aqui é feito as declarações das condições considerando o método de pagamento selecionado.
		if(tipoPagamento == 1) {
			double totalPagamento = totalMensalidade - ((totalMensalidade/100) * 10);
			JOptionPane.showMessageDialog(null, "Nome do Aluno: " + nomeAluno + "\nMensalidade total: R$" + totalPagamento);
		}
		
		if(tipoPagamento == 2) {
			double totalPagamento = totalMensalidade + ((totalMensalidade/100) * 10);
			JOptionPane.showMessageDialog(null, "Nome do Aluno: " + nomeAluno + "\nMensalidade total: R$" + totalPagamento);
		}
		
		System.exit(0);
		
		
		
		
		
		
		
		
		
	}

}
