package recursiva_soma_naturais;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String inputA;
		String inputB;

		int numeroA;
		int numeroB;
		int resultado;

		inputA = JOptionPane.showInputDialog("Digite o primeiro número natural positivo:");
		inputB = JOptionPane.showInputDialog("Digite o segundo número natural positivo:");

		numeroA = Integer.parseInt(inputA);
		numeroB = Integer.parseInt(inputB);

		if (numeroA < 0 || numeroB < 0) {
			JOptionPane.showMessageDialog(null, "Os números devem ser naturais (0 ou positivos).");
		} else {
			resultado = SomaNumerosNaturais.somar(numeroA, numeroB);
			JOptionPane.showMessageDialog(null, "O resultado da soma é: " + resultado);
		}
	}

}
