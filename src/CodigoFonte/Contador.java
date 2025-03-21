package CodigoFonte;
import java.util.Scanner;
import Classes.ParametrosInvalidosExeption;

public class Contador {

	public static void main(String[] args) {
		
		int primeiroParametroo = solicitarParametro();
		int segundoParametro = solicitarParametro();
		
		try {
			contar(primeiroParametroo, segundoParametro);	
		}
		
		catch (ParametrosInvalidosExeption e) {
			System.out.println("O segundo parametro deve ser maior que o primeiro.");
		}

		
	}
	
	public static int solicitarParametro() {	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o valor do parametro: ");
		int parametro = scanner.nextInt();	
		
		return parametro;
		
	}
	
	public static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosExeption{
		 
		int numeroRepeticoes = 0;
		
		if(primeiroParametro > segundoParametro) {
			throw new ParametrosInvalidosExeption();
		}
		
		for(int i = primeiroParametro ; i < segundoParametro ; i++){
			numeroRepeticoes += 1;
			System.out.println("Imprimindo o número "+numeroRepeticoes);
			
		}
		
	}

}
