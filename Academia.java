package MeuDesafio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Academia {
	public static void main(String[] args) throws ParseException{
		
		Funcionarios funcBase = new Funcionarios("Yan", 5500, "01/04/2018");
		Supervisor supervisor = new Supervisor(new Funcionarios("Tatiana", 3500, "06/03/2019"), "000.000.000-55");
		Gerente g1 = new Gerente(new Funcionarios("Rick", 6000, "03/03/2020"), "000.000.000-45");
				
		System.out.println((funcBase.getNome() + " " + funcBase.getSalario()));
		funcBase.setSalario(6000);
		System.out.println(("Funcionário: " + funcBase.getNome() + " " + funcBase.getSalario()));
		 
		System.out.println("Gerente: " + g1.getNome() + " - salário: " + g1.getSalario());
		System.out.println("Supervisor: " + supervisor.getNome() + " - salário:  " +supervisor.getSalario());
		
				
		System.out.println("Para o funcionário " + funcBase.getNome() + ":");
		funcBase.requistarFerias(funcBase.getData(), "17/08/2020", "17/02/2020");
		
		System.out.println("Para o Gerente " + g1.getNome() + ":");
		funcBase.requistarFerias(g1.getData(), "17/08/2020", "17/02/2020");
		
		System.out.println("Para o Supervisor " + supervisor.getNome() + ":");
		funcBase.requistarFerias(supervisor.getData(), "17/08/2020", "17/02/2020");
		
		g1.demitir(supervisor);
		supervisor.demitir(funcBase);
		
		g1.reajustar(supervisor, 8000);
		System.out.println("Supervisor: " + supervisor.getNome() + " - salário:  " +supervisor.getSalario());
		
		g1.reajustar(funcBase, 7000);
		System.out.println(("Funcionário: " + funcBase.getNome() + " " + funcBase.getSalario()));
		
		g1.reajustar(g1, 7500);
		System.out.println("Gerente: " + g1.getNome() + " - salário: " + g1.getSalario());
		
	
	}
}