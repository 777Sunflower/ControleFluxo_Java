package contador;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o parametro um: ");
		int parametroUm = scan.nextInt();
		System.out.println("Digite o parametro dois: ");
		int parametroDois = scan.nextInt();

		try {
			contar(parametroUm, parametroDois);
		} catch (ParametroInvalidoException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException {
		if (parametroDois <= parametroUm) {
			throw new ParametroInvalidoException();
		}

		for (int contar = parametroUm + 1; contar <= parametroDois; contar++) {
			System.out.println("Contagem: " + contar);
		}
	}
}
