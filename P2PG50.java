import java.util.Scanner;
public class P2PG50 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
		exercicio c1 = new exercicio();
		exercicio t1 = new exercicio();
		System.out.println("Bem vindo! Vamos calcular!! Digite [1] para cálcular o raio de um círculo e [2] para calcular as propriedades de um triângulo: ");
		int deci = teclado.nextInt();
		switch (deci) {
		
		case 1: System.out.print("Digite o Raio para descobrir perimetro e área do círculo: ");
		c1.setRaio(teclado.nextDouble());
		System.out.print("Digite a base (se não houver digite 0): ");
		c1.setBase(teclado.nextInt());
		System.out.print("Digite a altura (se não houver digite 0): ");
		c1.setAltura(teclado.nextInt());
		
		System.out.println("\n\nCirculo 1: \n" +
				"raio= " + c1.getRaio() + 
				"\n" + "Area= " + c1.getArea() + "\n" + "Perimetro= "  + c1.getPerimetro() + "\n" + "\n");
		break;
		
		case 2: System.out.print("Digite o Raio (se não houver digite 0): ");
		t1.setRaio(teclado.nextInt());
		System.out.print("Digite a base (se não houver digite 0): ");
		t1.setBase(teclado.nextInt());
		System.out.print("Digite a altura (se não houver digite 0): ");
		t1.setAltura(teclado.nextInt());
		
		System.out.println("Triangulo 1: \n" + 
				"Base= " + t1.getBase() +
						"\n" + "Altura= " + t1.getAltura() +
						"\n" + "Area= " + t1.getArea() +
						"\n" + "Perimetro= "  + String.format("%.2f", t1.getPerimetro()) +
						"\n" + "\n");
		break;
		
		default:System.out.print("Opção inválida, execute novamente");
		}		
		
	}
}
