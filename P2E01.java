import java.util.Scanner;
public class P2E01 {

public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	funcionario F01 = new funcionario();
	funcionario F02 = new funcionario(1105, "Jose Carlos Silva", 6500.00);
	System.out.print("Digite o ID do funcion�rio: ");
	F01.setcodFunc(teclado.nextInt());
	System.out.print("Digite o nome do funcion�rio: ");
	F01.setnomeFunc(teclado.next());
	System.out.print("Digite o sal�rio do funcion�rio: ");
	F01.setsalarioMensal(teclado.nextDouble());
	
	System.out.print("\n");
	
	System.out.println("ID: " + F01.getcodFunc() + "\nNome: " +  F01.getnomeFunc() + "\nSal�rio: " + F01.getsalarioMensal() + "\n\n");
	
	System.out.println("ID: " + F02.getcodFunc() + "\nNome: " + F02.getnomeFunc() + "\nSal�rio: " + F02.getsalarioMensal() + "\n\n");
		
	
	System.out.println("Funcion�rio ID: " + F01.getcodFunc() + " ter� o novo sal�rio de " + F01.getsalarioAnual() + "\n");
	System.out.println("Funcion�rio ID: " + F02.getcodFunc() + " ter� o novo sal�rio de " + F02.getsalarioAnual() + "\n");
	
  }

}