package MeuDesafio;

public class Gerente extends Administrativo{
	private final double bonificacao = 0.12;
	
	
	public Gerente(Funcionarios func, String cpf) {
		super(func, cpf);
	}
	
	public double getSalario() {
		return super.getSalario() + (bonificacao * super.getSalario());
	}
	
	@Override
	public void demitir(Funcionarios func) {
		if(!(func instanceof Gerente)) {
			System.out.println(func.getNome() + " " + "Demitido!");
		}else {
			System.out.println("Gerente não pode demitir gerente");
		}
	}
	
	
	public void reajustar(Funcionarios func, double valor1) {
		if(!(func instanceof Gerente)) {
			func.setSalario(valor1);
			System.out.println(func.getNome() + " " + "Salário rejustado para:" + func.getSalario());
		}else {
			System.out.println("Gerente não pode reajustar salário de gerente");
		}
	}
}
