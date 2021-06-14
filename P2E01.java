import java.util.Scanner;
public class P2E01 {

public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	funcionario F01 = new funcionario();
	funcionario F02 = new funcionario(1105, "Jose Carlos Silva", 6500.00);
	System.out.print("Digite o ID do funcionário: ");
	F01.setcodFunc(teclado.nextInt());
	System.out.print("Digite o nome do funcionário: ");
	F01.setnomeFunc(teclado.next());
	System.out.print("Digite o salário do funcionário: ");
	F01.setsalarioMensal(teclado.nextDouble());
	
	System.out.print("\n");
	
	System.out.println("ID: " + F01.getcodFunc() + "\nNome: " +  F01.getnomeFunc() + "\nSalário: " + F01.getsalarioMensal() + "\n\n");
	
	System.out.println("ID: " + F02.getcodFunc() + "\nNome: " + F02.getnomeFunc() + "\nSalário: " + F02.getsalarioMensal() + "\n\n");
		
	
	System.out.println("Funcionário ID: " + F01.getcodFunc() + " terá o novo salário de " + F01.getsalarioAnual() + "\n");
	System.out.println("Funcionário ID: " + F02.getcodFunc() + " terá o novo salário de " + F02.getsalarioAnual() + "\n");
	
  }

}