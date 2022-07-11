import javax.swing.JOptionPane;
public class Exercicio2 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Esta programa��o ir� converter graus Celsius para Fahrenheit.");
		String sValor = JOptionPane.showInputDialog("Valor em C�:");
		double total = (Double.parseDouble(sValor) * (9.0/5)) * 2;
		JOptionPane.showMessageDialog(null, "O valor total em Fahrenhait fica: " + total + "F�");
		System.exit(0);
	}

}
