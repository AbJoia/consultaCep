package Tela;

import java.util.Scanner;

import Exception.CepInvalidoException;
import Main.Program;
import Service.ConsultaCep;

public class Telas {

	public static String inicial() throws CepInvalidoException {
		Scanner scan = new Scanner(System.in);

		ConsultaCep cepApi = new ConsultaCep();
		System.out.println("Informe o Cep para pesquisa");
		System.out.print("Cep: ");
		String cep = scan.next();

		if (cepApi.cepValido(cep)) {
			return cep;
		}

		throw new CepInvalidoException("Cep deve ter oito (8) numeros, não incluir traços, espaços ou letras.");

	}

	public static void opcao() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n1 - Nova Consulta | 2 - Finalizar Programa");
		int op = scan.nextInt();

		switch (op) {
		case 1:
			Program.main(null);
			break;
		case 2:
			System.out.println("Finalizado!");
			break;

		default:
			System.out.println("Opção Invalida");
			Telas.opcao();
			break;
		}

	}

}
