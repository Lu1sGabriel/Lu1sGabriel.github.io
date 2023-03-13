package fatorialJava;

import java.util.Scanner;

public class FatorialLuisGabriel {

	static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		boolean continuar = true;
		/*
		 * Boolean está como 'true' para iniciar o código, caso estive em 'false' o
		 * código não se inciaria.
		 */
		while (continuar) {
			/*
			 * Como 'continar = true', esse while ficará em loop chamando todos o métodos
			 * abaixo. Quando o usuário digitar 'n', o códgigo se encerra.
			 */
			long n = lerNumeroPositivo();
			long f = fatorial(n);
			System.out.println("O fatorial de " + n + " = " + f);
			continuar = escolherContinuar();
		}
		System.out.println("Obrigado por usar o código!");
	}

	public static long fatorial(long n) {
		/* Método para obter o fatorial e retornar para o main. */
		if (n == 0) {
			return 1;
		} else {
			return n * fatorial(n - 1);
		}
	}

	public static long lerNumeroPositivo() {
		/*
		 * Como não existe fatorial negativo, criei um método para o usuário não
		 * conseguir digitar um número menor que zero.
		 */
		long n;
		do {
			System.out.print(
					"Digite o número para o qual deseja calcular o fatorial (deve ser um número inteiro não negativo): ");
			n = read.nextLong();
		} while (n < 0);
		return n;
	}

	public static boolean escolherContinuar() {
		/* Criei esse método apenas para deixar a aplicação mais "clean". */
		System.out.print("Deseja continuar? (S/N): ");
		String escolha = read.next();
		switch (escolha.toUpperCase()) {
		case "S":
			return true;
		case "N":
			return false;
		default:
			System.out.println("Escolha inválida. Digite 'S' para continuar ou 'N' para sair.");
			return escolherContinuar();
		}
	}
}
