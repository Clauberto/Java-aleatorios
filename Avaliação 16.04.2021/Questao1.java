//Nome Claubert Felisberto Colonetti - Turma 1137B
import javax.swing.JOptionPane;

public class Questao1 {

	public static void main(String[] args) {
		//Declara��o de variaveis.
		
		String nomeColaborador = JOptionPane.showInputDialog("Nome do colaborador:");
		String sCargo = JOptionPane.showInputDialog("Digite o cargo do colaborador:" + "\n1 - Recepcionista" + "\n2 - Monitor" + "\n3 - Servi�os Gerais" + "\n4 - Vigia");
		String sSalario = JOptionPane.showInputDialog("Sal�rio do colaborador:");

		//Converter String para double e int.
		int cargo = Integer.parseInt(sCargo);
		double salario = Double.parseDouble(sSalario);
		
	//Aqui � feito as declara��es das condi��es considerando o cargo selecionado.
		
		if(cargo == 1) {
			double salarioB = (((salario/100) * 5) + salario);
			JOptionPane.showMessageDialog(null, "Nome: " + nomeColaborador + "\nCargo: Recepcionista" + "\nSal�rio p�s-reajuste: R$" + salarioB);
			}
		
		if(cargo == 2) {
			double salarioB = (((salario/100) * 10) + salario);
			JOptionPane.showMessageDialog(null, "Nome: " + nomeColaborador + "\nCargo: Monitor" + "\nSal�rio p�s-reajuste: R$" + salarioB);
			}
		
		if(cargo == 3) {
			double salarioB = (((salario/100) * 20) + salario);
			JOptionPane.showMessageDialog(null, "Nome: " + nomeColaborador + "\nCargo: Servi�os Gerais" + "\nSal�rio p�s-reajuste: R$" + salarioB);
			}
		
		if(cargo == 4) {
			double salarioB = (((salario/100) * 15) + salario);
			JOptionPane.showMessageDialog(null, "Nome: " + nomeColaborador + "\nCargo: Vigia" + "\nSal�rio p�s-reajuste: R$" + salarioB);
			}
		
	System.exit(0);
		
	}

}
