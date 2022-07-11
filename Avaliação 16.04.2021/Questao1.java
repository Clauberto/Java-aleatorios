//Nome Claubert Felisberto Colonetti - Turma 1137B
import javax.swing.JOptionPane;

public class Questao1 {

	public static void main(String[] args) {
		//Declaração de variaveis.
		
		String nomeColaborador = JOptionPane.showInputDialog("Nome do colaborador:");
		String sCargo = JOptionPane.showInputDialog("Digite o cargo do colaborador:" + "\n1 - Recepcionista" + "\n2 - Monitor" + "\n3 - Serviços Gerais" + "\n4 - Vigia");
		String sSalario = JOptionPane.showInputDialog("Salário do colaborador:");

		//Converter String para double e int.
		int cargo = Integer.parseInt(sCargo);
		double salario = Double.parseDouble(sSalario);
		
	//Aqui é feito as declarações das condições considerando o cargo selecionado.
		
		if(cargo == 1) {
			double salarioB = (((salario/100) * 5) + salario);
			JOptionPane.showMessageDialog(null, "Nome: " + nomeColaborador + "\nCargo: Recepcionista" + "\nSalário pós-reajuste: R$" + salarioB);
			}
		
		if(cargo == 2) {
			double salarioB = (((salario/100) * 10) + salario);
			JOptionPane.showMessageDialog(null, "Nome: " + nomeColaborador + "\nCargo: Monitor" + "\nSalário pós-reajuste: R$" + salarioB);
			}
		
		if(cargo == 3) {
			double salarioB = (((salario/100) * 20) + salario);
			JOptionPane.showMessageDialog(null, "Nome: " + nomeColaborador + "\nCargo: Serviços Gerais" + "\nSalário pós-reajuste: R$" + salarioB);
			}
		
		if(cargo == 4) {
			double salarioB = (((salario/100) * 15) + salario);
			JOptionPane.showMessageDialog(null, "Nome: " + nomeColaborador + "\nCargo: Vigia" + "\nSalário pós-reajuste: R$" + salarioB);
			}
		
	System.exit(0);
		
	}

}
