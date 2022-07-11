import javax.swing.JOptionPane;
public class Exercicio3 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Essa programa��o ir� receber dados e calcular m�dia de aluno.");
		String nome = JOptionPane.showInputDialog("Nome:");
		String curso = JOptionPane.showInputDialog("Curso");
		String disciplina = JOptionPane.showInputDialog("Disciplina:");
		String sNota1 = JOptionPane.showInputDialog("Primeira nota:");
		String sNota2 = JOptionPane.showInputDialog("Segunda nota:");
		String sNota3 = JOptionPane.showInputDialog("Terceira nota:");
		double media = (Double.parseDouble(sNota1) + Double.parseDouble(sNota2) + Double.parseDouble(sNota3)) / 3;
		JOptionPane.showMessageDialog(null, "Nome:" + nome +
											"\nCurso:" + curso +
											"\nDisciplina:" + disciplina +
											"\nM�dia do Aluno:" + media);
		System.exit(0);
		
	}

}
