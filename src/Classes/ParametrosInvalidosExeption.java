package Classes;

public class ParametrosInvalidosExeption extends Exception {

	public ParametrosInvalidosExeption() {
		super("O segundo parâmetro deve ser maior que o primeiro.");
	}
	
	public ParametrosInvalidosExeption(String mensagem) {
		super(mensagem);
	}
	
	
}


