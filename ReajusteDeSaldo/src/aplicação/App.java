package aplicação;

import modelagem.Saldo;
import java.util.Scanner;

public class App {
	public static Saldo saldoAtual;
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) { //Desta forma, o scanner pode ser fechado usando-o dentro de try
			System.out.println("Digite o saldo: ");
			double saldo = scan.nextDouble();
			
			saldoAtual = new Saldo(saldo); //Armazena o novo saldo, dito pelo usuário, a ser reajustado na classe Saldo
			
			System.out.printf("Seu saldo com reajuste de 1%% é igual a: %.2f%n", saldoAtual.reajuste()); //Imprime o reajuste do saldo atual, com reajuste
		}
	}
}