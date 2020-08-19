package MeuDesafio;

public class Supervisor extends Administrativo{
	private final double bonificacao = 0.08;
	
	public Supervisor(Funcionarios func, String cpf) {
		super(func, cpf);
	}
	
	public double getSalario() {
		return super.getSalario() + (bonificacao * super.getSalario());
	}
	
	@Override
	public void demitir(Funcionarios func) {
		if(!(func instanceof Gerente) && !(func instanceof Supervisor)) {
			System.out.println(func.getNome() + " " + "Demitido!");
		}else {
			System.out.println("Você não tem premissao pra demitir funcionários desse cargo");
		}
	}

}
