import javax.swing.JOptionPane;

public class Exercicio8 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Calcular sal�rio ap�s desconto do INSS.");
		String nome = JOptionPane.showInputDialog("Nome:");
		String sNumh = JOptionPane.showInputDialog("Numero de horas trabalhadas:");
		String sValorh = JOptionPane.showInputDialog("Valor da hora:");
		
		double op1 = (Double.parseDouble(sValorh) * Double.parseDouble(sNumh));
		double op2 = (Double.parseDouble(sValorh) * Double.parseDouble(sNumh)) - ((op1 / 100) * 2);
	
		JOptionPane.showMessageDialog(null, "Nome: " + nome +
											"\nValor a receber: "+ "R$" + op2);
		System.exit(0);

	}

}
