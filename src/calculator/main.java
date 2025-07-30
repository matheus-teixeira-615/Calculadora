package calculator;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1- somar | 2- multiplicar | 3- dividir | 4- subtrair");
		int resultado = scanner.nextInt();
		
        if (resultado < 1 || resultado > 4) {
            System.out.println("Opção inválida! Escolha um número de 1 a 4.");
            scanner.close();
            return; 
        }
		
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        
		
		double resultadoFinal;
		switch(resultado) {
		case 1:
			resultadoFinal = equacao.somar(numero1, numero2);
			System.out.println("Resultado da soma: " + resultadoFinal);
			break;
		case 2:
			resultadoFinal = equacao.multiplicacao(numero1, numero2);
			System.out.println("Resultado da soma: " + resultadoFinal);
			break;

		case 3:
			resultadoFinal = equacao.dividir(numero1, numero2);
			System.out.println("Resultado da soma: " + resultadoFinal);
			break;
		case 4:
			resultadoFinal = equacao.subtrair(numero1, numero2);
			System.out.println("Resultado da soma: " + resultadoFinal);
			break;
		default:
			System.out.print("Numero errado amigo");
			break;
		}
		scanner.close();

	}

}
