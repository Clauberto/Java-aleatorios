import javax.swing.JOptionPane;
public class Exercicio5 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Essa programa��o ir� dar um acr�scimo de 5% no sal�rio de um funcion�rio.");
		String nome = JOptionPane.showInputDialog("Nome:");
		String cargo = JOptionPane.showInputDialog("Cargo:");
		String sSalario = JOptionPane.showInputDialog("Sal�rio:");
		double aumento = ((Double.parseDouble(sSalario) / 100) * 5) + Double.parseDouble(sSalario); 
		JOptionPane.showMessageDialog(null, "Nome: " + nome +
										"\nCargo: " + cargo +
										"\nSal�rio com b�nus: " + aumento);
		System.exit(0);
		
		

	}

}
