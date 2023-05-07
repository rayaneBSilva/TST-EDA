import java.util.Scanner;

class TorreDeHanoi {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantidadeDeDiscos = sc.nextInt();
		Hanoi(quantidadeDeDiscos, "A", "B", "C");
		sc.close();
	}

	private static void Hanoi(int n, String origem, String aux, String destino) {
		if (n > 0) {
			Hanoi(n - 1, origem, destino, aux);
			moverDisco(n, origem, destino);
			Hanoi(n - 1, aux, origem, destino);
		}
	}

	private static void moverDisco(int numeroDisco, String origem, String destino) {
		System.out.println("Move o disco " + numeroDisco + " da haste " + origem + " para a haste " + destino);
	}

}

