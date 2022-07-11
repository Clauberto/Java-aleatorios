import javax.swing.JOptionPane;

public class Exercicio7 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Essa programa��o ir� mostrar o valor de IMC de um adulto.");
		String nome = JOptionPane.showInputDialog("Nome:");
		String idade = JOptionPane.showInputDialog("Idade:");
		String sPeso = JOptionPane.showInputDialog("Peso:");
		String sAltura = JOptionPane.showInputDialog("Altura:");
		
		double imc = Double.parseDouble(sPeso) / (Double.parseDouble(sAltura) * Double.parseDouble(sAltura));
		JOptionPane.showMessageDialog(null, "Nome:" + nome  +
					                "\nIdade:" + idade +
									"\nValor de IMC � igual a: " + imc);
		System.exit(0);

	}

}
