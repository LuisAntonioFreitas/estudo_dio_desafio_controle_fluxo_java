import java.util.Scanner;

public class ControleFluxo {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parametro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parametro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o metodo contendo a logica de contagem
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parametro deve ser maior que o primeiro
		    System.out.println("O segundo parametro deve ser maior que o primeiro");
		}
	}
		
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
	//validar se parametroUm e MAIOR que parametroDois e lancar a excecao

	    int contagem = parametroDois - parametroUm;
	    //realizar o for para imprimir os numeros com base na variavel contagem
	    if (contagem < 0) {
	        throw new ParametrosInvalidosException();
	    }
	}

}

class ParametrosInvalidosException extends Exception {}
