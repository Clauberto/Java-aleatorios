//Nome Claubert Felisberto Colonetti - Turma 1137B
import javax.swing.JOptionPane;

public class Questao2 {

	public static void main(String[] args) {
		
		
		//Declara��o de variaveis.
		String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
		String stotalMensalidade = JOptionPane.showInputDialog("Digite o valor da mensalidade:");
		String stipoPagamento = JOptionPane.showInputDialog("Digite o tipo de pagamento" + "\n1 - � vista (10% de desconto)" + "\n2 - Parcelado (10% de acr�scimo)");
		//Converter String para double e int.
		int tipoPagamento = Integer.parseInt(stipoPagamento);
		double totalMensalidade = Double.parseDouble(stotalMensalidade);
		//Aqui � feito as declara��es das condi��es considerando o m�todo de pagamento selecionado.
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
