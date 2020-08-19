package MeuDesafio;

public class Administrativo extends PessoaFisica {
	
	public Administrativo(Funcionarios func, String cpf) {
		super(func, cpf);
	}
	
	public void demitir(Funcionarios func) {
		if(!(func instanceof Administrativo)) {
			System.out.println("Demitido");
		}
		else {
			System.out.println("Voc� n�o tem autoriza��o para demitir este funcionario!");
		}
	}
	
}