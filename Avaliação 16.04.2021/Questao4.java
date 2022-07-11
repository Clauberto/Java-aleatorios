//Nome Claubert Felisberto Colonetti - Turma 1137B
import javax.swing.JOptionPane;

public class Questao4 {

	public static void main(String[] args) {
		//Declaração de variaveis.
		String nomeVendedor = JOptionPane.showInputDialog("Nome: ");
		String sSalario = JOptionPane.showInputDialog("Salário:");
		String sRegiao = JOptionPane.showInputDialog("Região do Estado:" + "\n1 - Norte" + "\n2 - Sul" + "\n3 - Leste" + "\n4 - Oeste");
		
		//Converter String para double e int.
		double salario = Double.parseDouble(sSalario);
		int regiao = Integer.parseInt(sRegiao);
		
		//Realizar operação do calculo da comissão dependendo dos valores recebidos.
		if(regiao == 1) {
			double valorComicao = (salario/100) * 20;
			double valorTotal = salario + valorComicao;
			JOptionPane.showMessageDialog(null, "Nome: " + nomeVendedor + "\nValor da comissão: R$" + valorComicao + "\nSalário novo: R$" + valorTotal);
		}
		
		if(regiao == 2) {
			double valorComicao = (salario/100) * 15;
			double valorTotal = salario + valorComicao;
			JOptionPane.showMessageDialog(null, "Nome: " + nomeVendedor + "\nValor da comissão: R$" + valorComicao + "\nSalário novo: R$" + valorTotal);
		}
		
		if(regiao == 3) {
			double valorComicao = (salario/100) * 25;
			double valorTotal = salario + valorComicao;
			JOptionPane.showMessageDialog(null, "Nome: " + nomeVendedor + "\nValor da comissão: R$" + valorComicao + "\nSalário novo: R$" + valorTotal);
		}
		
		if(regiao == 4) {
			double valorComicao = (salario/100) * 10;
			double valorTotal = salario + valorComicao;
			JOptionPane.showMessageDialog(null, "Nome: " + nomeVendedor + "\nValor da comissão: R$" + valorComicao + "\nSalário novo: R$" + valorTotal);
		}

		System.exit(0);
	}

}
