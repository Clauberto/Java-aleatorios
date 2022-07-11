import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Essa programa��o ir� calcular a �rea de um tri�ngulo.");
		
		String sBase = JOptionPane.showInputDialog("Base:");
		String sAltura = JOptionPane.showInputDialog("Altura:");
		double area = (Double.parseDouble(sAltura) * Double.parseDouble(sBase)) / 2;
		
		JOptionPane.showMessageDialog(null, "�rea � igual a: " + area + "m�");
		System.exit(0);

	}

}
