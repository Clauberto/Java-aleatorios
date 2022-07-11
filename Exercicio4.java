import javax.swing.JOptionPane;
public class Exercicio4 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Essa programa��o ir� receber quantidade e valor de um produto e dar o valor total.");
		String nome = JOptionPane.showInputDialog("Nome:");
		String produto = JOptionPane.showInputDialog("Produto:");
		String sQuantidade = JOptionPane.showInputDialog("Quantidade:");
		String sPreco = JOptionPane.showInputDialog("Pre�o:");
			double valor = Double.parseDouble(sPreco) * Double.parseDouble(sQuantidade);
		
		JOptionPane.showMessageDialog(null, "Nome: " + nome +
									"\nProduto: " + produto +
									"\nTotal a pagar: " + "R$" + valor);
			
		System.exit(0);
	}

}
