import java.util.Scanner;

public class InversaoVetor {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorOriginal = new int[5];
		int[] vetorInvertido = new int[5];
		
		// Entrada de dados
		for (int i = 0 ; i < 5 ; i++) {
			System.out.print("Digite o valor da posição " + i + " do vetor: ");
			vetorOriginal[i] = leitor.nextInt();
		}
		
		leitor.close();
		
		// Processamento
		for (int i = 0 ; i < 5 ; i++) {
			vetorInvertido[4 - i] = vetorOriginal[i];
		}
		
		// Saída de dados
		for (int i = 0 ; i < 5 ; i++) {
			System.out.print(vetorOriginal[i] + "\t");
		}
		System.out.println();
		for (int i = 0 ; i < 5 ; i++) {
			System.out.print(vetorInvertido[i] + "\t");
		}
	}
}